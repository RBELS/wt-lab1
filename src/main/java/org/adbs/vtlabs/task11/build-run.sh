#!/bin/zsh

# Результат оставлен в репозитории для демонстрации

SOURCE_PATH="../task9"
OUTPUT_PATH="./"

find $SOURCE_PATH -type f -name "*.java" > $OUTPUT_PATH/sources.txt &&
javac -d $OUTPUT_PATH @$OUTPUT_PATH/sources.txt
find $OUTPUT_PATH/org/adbs/vtlabs/task9 -type f -name "*.class" > $OUTPUT_PATH/classes.txt
jar cvfm basket-app-1.0.jar $OUTPUT_PATH/MANIFEST.MF @$OUTPUT_PATH/classes.txt
