#!/usr/bin/env bash

DR_TUTORIAL_PATH=`readlink -f $1`
DR_WUKONG_PATH=$DR_TUTORIAL_PATH/../../..
DATARUSH_PATH=$DR_WUKONG_PATH/../datarush

# echo $DR_TUTORIAL_PATH $DR_WUKONG_PATH $DATARUSH_PATH


CLASSPATH="$CLASSPATH:$DATARUSH_PATH/lib/datarush-library-5.0.0-27.jar:$DATARUSH_PATH/lib/*.jar:$DR_TUTORIAL_PATH"
CLASSPATH=$CLASSPATH:/usr/local/share/jruby/lib/jruby.jar:/usr/local/share/jruby/lib/jruby.jar

javac                 -cp $CLASSPATH $DR_TUTORIAL_PATH/*.java
$DATARUSH_PATH/bin/dr -cp $CLASSPATH HelloWorld
