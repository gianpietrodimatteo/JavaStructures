#!/bin/bash

DEST="src/main/java/com/dms/JavaExercisesSolution.java"
SOURCE="src/main/resources/JavaExercises.java"

echo "Generating JavaExercisesSolution.java..."
echo 'package com.dms;' | cat - $SOURCE > $DEST
echo "Done!"
