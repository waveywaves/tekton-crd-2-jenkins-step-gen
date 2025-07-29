#!/bin/bash

# Tekton CRD to Java Code Generator - Convenience Script
# This script builds the project (if needed) and runs the generator

set -e

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Default values
CRD_DIR="./crds"
OUTPUT_DIR="./generated"
PACKAGE="io.tekton.crd.model"
VERBOSE=""

# Function to print usage
usage() {
    echo "Usage: $0 [options]"
    echo ""
    echo "Options:"
    echo "  -c, --crd-dir <dir>      Directory containing CRD files (default: ./crds)"
    echo "  -o, --output <dir>       Output directory (default: ./generated)"
    echo "  -p, --package <package>  Base package name (default: io.tekton.crd.model)"
    echo "  -v, --verbose            Enable verbose logging"
    echo "  -b, --build              Force rebuild before running"
    echo "  -h, --help               Show this help message"
    echo ""
    echo "Examples:"
    echo "  $0                                          # Use defaults"
    echo "  $0 -c ./my-crds -o ./src/main/java         # Custom directories"
    echo "  $0 -p com.example.model -v                 # Custom package with verbose logging"
}

# Parse command line arguments
BUILD_FORCE=""
while [[ $# -gt 0 ]]; do
    case $1 in
        -c|--crd-dir)
            CRD_DIR="$2"
            shift 2
            ;;
        -o|--output)
            OUTPUT_DIR="$2"
            shift 2
            ;;
        -p|--package)
            PACKAGE="$2"
            shift 2
            ;;
        -v|--verbose)
            VERBOSE="--verbose"
            shift
            ;;
        -b|--build)
            BUILD_FORCE="true"
            shift
            ;;
        -h|--help)
            usage
            exit 0
            ;;
        *)
            echo -e "${RED}Unknown option: $1${NC}"
            usage
            exit 1
            ;;
    esac
done

echo -e "${GREEN}Tekton CRD to Java Code Generator${NC}"
echo "========================================"

# Check if CRD directory exists
if [ ! -d "$CRD_DIR" ]; then
    echo -e "${RED}Error: CRD directory does not exist: $CRD_DIR${NC}"
    exit 1
fi

# Check if we need to build
JAR_FILE="target/crd-java-generator.jar"
if [ ! -f "$JAR_FILE" ] || [ "$BUILD_FORCE" = "true" ]; then
    echo -e "${YELLOW}Building project...${NC}"
    if ! mvn clean package -q; then
        echo -e "${RED}Build failed!${NC}"
        exit 1
    fi
    echo -e "${GREEN}Build completed successfully!${NC}"
else
    echo -e "${YELLOW}Using existing JAR: $JAR_FILE${NC}"
fi

# Prepare arguments
ARGS="$CRD_DIR --output $OUTPUT_DIR --package $PACKAGE $VERBOSE"

echo ""
echo "Configuration:"
echo "  CRD Directory: $CRD_DIR"
echo "  Output Directory: $OUTPUT_DIR"
echo "  Base Package: $PACKAGE"
echo "  Verbose: $([ -n "$VERBOSE" ] && echo "Yes" || echo "No")"
echo ""

echo -e "${YELLOW}Running code generator...${NC}"

# Run the generator
if java -jar "$JAR_FILE" $ARGS; then
    echo ""
    echo -e "${GREEN}Code generation completed successfully!${NC}"
    echo -e "${YELLOW}Generated classes are in: $OUTPUT_DIR${NC}"
    
    # Show a summary of generated files
    if [ -d "$OUTPUT_DIR" ]; then
        FILE_COUNT=$(find "$OUTPUT_DIR" -name "*.java" | wc -l)
        echo -e "${GREEN}Generated $FILE_COUNT Java files${NC}"
        
        echo ""
        echo "Generated package structure:"
        find "$OUTPUT_DIR" -type d -name "*tekton*" | head -10 | while read -r dir; do
            echo "  📁 ${dir#$OUTPUT_DIR/}"
        done
    fi
else
    echo -e "${RED}Code generation failed!${NC}"
    exit 1
fi 