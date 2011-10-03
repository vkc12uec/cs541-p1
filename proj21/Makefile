#
# Makefile for Minibase Projects
# CS 541, Fall 2011, Purdue University
#
# This Makefile was designed for Linux.
# For Windows (cygwin), change each : to \; in the variables below.
#

SRCPATH = src
BINPATH = bin
SOLJARS = lib/bufmgrAssign.jar

JAVAC = javac -d $(BINPATH) -classpath $(SRCPATH):$(SOLJARS)
JAVA  = java -classpath $(BINPATH):$(SOLJARS)


all: bufmgr diskmgr tests

bufmgr:
	$(JAVAC) $(SRCPATH)/bufmgr/*.java

diskmgr:
	$(JAVAC) $(SRCPATH)/diskmgr/*.java
tests:
	$(JAVAC) $(SRCPATH)/tests/*.java

bmtest:
	$(JAVA) tests.BMTest


clean: clean_classes clean_backups clean_temps
	rm -rf *.minibase $(BINPATH)/*

clean_classes:
	\find . -name \*.class -exec rm -f {} \;

clean_backups:
	\find . -name \*~ -exec rm -f {} \;

clean_temps:
	\find . -name \#* -exec rm -f {} \;

