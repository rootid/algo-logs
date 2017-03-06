.PHONY : compile checkstyle findbug clean

compile: Percolation.java PercolationStats.java
	javac-algs4 Percolation.java; javac-algs4 PercolationStats.java;

checkstyle: Percolation.java PercolationStats.java
	checkstyle-algs4 Percolation.java; checkstyle-algs4 PercolationStats.java;
        
findbug: Percolation.class PercolationStats.class
	findbugs-algs4 Percolation.class; findbugs-algs4 PercolationStats.class;

clean :
	rm -rf *.class

