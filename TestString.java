import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

class TestString {

   public static void main(String[] args) { 
     String ipAdd = "10.238.7.108, 172.17.128.252";
     //String ipAdd = "10.238.7.108";
     int len = ipAdd.length();
		 String retval[] = ipAdd.split(",");
		 if(retval.length == 2) {
       	len = retval[1].length();
          System.out.println(retval[1].trim() + " l = "+len);
		 } else {
       	len = retval[0].length();
          System.out.println(retval[0].trim() + " l = "+len);
		 }
     StdOut.println(" len = " + len );
   }
}
//vim: fdm=marker foldmarker={,} 
//vim: set ts=4 sw=4 tw=120 noet :
