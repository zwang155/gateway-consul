#!/bin/bash

cd service2
./gradlew run &
cd ../service1
./gradlew run &
cd ../gateway
./gradlew bootRun &
cd ..

