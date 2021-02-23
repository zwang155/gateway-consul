#!/bin/bash

kill $(ps aux | grep 'gradlew' | awk '{print $2}')