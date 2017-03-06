#!/bin/sh
javac -cp .:/usr/share/java/hamcrest-core-1.3.jar:/usr/share/java/junit.jar tests/*.java
java -cp .:./tests:/usr/share/java/junit.jar:/usr/share/java/hamcrest-core-1.3.jar org.junit.runner.JUnitCore HelloWorld
