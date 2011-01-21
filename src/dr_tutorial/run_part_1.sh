#!/usr/bin/env bash

set -v

DR_TUTORIAL_PATH=`dirname "$0"`
DR_WUKONG_PATH=$DR_TUTORIAL_PATH/../..
DATARUSH_PATH=$DR_WUKONG_PATH/../datarush

echo $DR_TUTORIAL_PATH $DR_WUKONG_PATH $DATARUSH_PATH

ls -l $DR_TUTORIAL_PATH
ls -l $DR_WUKONG_PATH
ls -l $DATARUSH_PATH/

javac                 -cp $DATARUSH_PATH/lib/datarush-library-5.0.0-27.jar:$DATARUSH_PATH/lib/*.jar:$DR_TUTORIAL_PATH $DR_TUTORIAL_PATH/*.java
$DATARUSH_PATH/bin/dr -cp $DATARUSH_PATH/lib/datarush-library-5.0.0-27.jar:$DATARUSH_PATH/lib/*.jar:$DR_TUTORIAL_PATH HelloWorld
