#!/bin/bash
x="$1"
x="$(echo $x | sed 's/\./\//g')"

echo "${x}"
mkdir -p $x

