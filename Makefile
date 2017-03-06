.PHONY : compile checkstyle findbug clean

compile: TestString.java 
	javac-algs4 TestString.java; 

checkstyle: TestString.java 
	checkstyle-algs4 TestString.java; 
        
findbug: TestString.class 
	findbugs-algs4 TestString.class; 

run : TestString.class
	java-algs4 TestString 

clean :
	rm -rf *.class

