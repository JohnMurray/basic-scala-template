#!/bin/bash

JAVA=java
JAVA_OPTS="-Xmx512m -XX:MaxPermSize=256M"
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

$JAVA $JAVA_OPTS -jar "${DIR}/bin/sbt-launch.jar"
