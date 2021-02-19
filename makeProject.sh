#!/bin/bash
x="$1"
x="$(echo $x | sed 's/\./\//g')"

mkdir -p $x

tree guiones
