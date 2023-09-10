#!/bin/zsh

# Результат оставлен в репозитории для демонстрации

SOURCE_PATH="../task9"
OUTPUT_PATH="./"

find $SOURCE_PATH -type f -name "*.java" > $OUTPUT_PATH/sources.txt &&
javac -d $OUTPUT_PATH @$OUTPUT_PATH/sources.txt
java org/adbs/vtlabs/task9/BasketApplication
