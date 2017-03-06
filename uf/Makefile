.PHONY : compile checkstyle findbug clean

compile: QuickFindUF.java 
	javac-algs4 QuickFindUF.java; 

checkstyle: QuickFindUF.java 
	checkstyle-algs4 QuickFindUF.java; 
        
findbug: QuickFindUF.class 
	findbugs-algs4 QuickFindUF.class; 

run : QuickFindUF.class
	java-algs4 QuickFindUF < tinyUF.txt

clean :
	rm -rf *.class

