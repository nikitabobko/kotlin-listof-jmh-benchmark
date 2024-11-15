#!/usr/bin/env bash
set -e # Exit if one of commands exit with non-zero exit code
set -u # Treat unset variables and parameters other than the special parameters ‘@’ or ‘*’ as an error
set -o pipefail # Any command failed in the pipe fails the whole pipe
# set -x # Print shell commands as they are executed (or you can try -v which is less verbose)
cd "$(dirname "$0")"

for dir in java kotlin; do
    cd $dir
        mvn clean verify
    cd - > /dev/null
done

for dir in java kotlin; do
    cd $dir
        java -jar target/benchmarks.jar 2>&1 | tee log
    cd - > /dev/null
done
