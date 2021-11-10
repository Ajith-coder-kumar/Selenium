package org.javarevision;

public class StringMethods {

	public static void main(String[] args) {
		
		//String function
		String s1 = "Ajith";
		System.out.println("String function s1 : " +s1);
		
		//to print particular character
		char ch = s1.charAt(2);
		System.out.println("printing particular character in a string : " +ch);
		
		//Equals()
		boolean c = s1.equals("ajith");
		System.out.println("s1 equals ajith : " +c);
		
		//equalsIgnoreCase()
		boolean a = s1.equalsIgnoreCase("ajith");
		System.out.println("s1 equalsIgnoreCase ajith : " +a);
		
		//contains()
		String s2 = "Hello java";
	    boolean	b = s2.contains("java");
	    System.out.println("s2 contains java :" + b);
	    
	    //split()
	    String s3 = "Hello welcome to java";
	    String[] d = s3.split("e");
	    for(int i = 0; i < d.length; i++) {
	    System.out.println("s3 split into different strings : " + d[i]);
	    }
	    
	    //toUpperCase()
	    String e = s1.toUpperCase();
	    System.out.println("s1 String toUpperCase : " + e);
	    
	    //toLowerCase()
	    String f = s1.toLowerCase();
	    System.out.println("s1 String toLowerCase : " +f);
	    
	    //subString()
	    String g = s3.substring(2);
	    System.out.println("s3 String to substring : " +g);
	    
	    //indexOf()
	    int h = s3.indexOf("o");
	    System.out.println("o indexOf s3 Stirng : " +h);
	    int i = s3.indexOf("b");
	    System.out.println("b indexOf s3 String : " +i);
	    
	    //lastIndexOf()
	    int j = s3.lastIndexOf("o");
	    System.out.println("lastIndexOf 'o' in s3 String : " +j);
	    
	    //replace()
	    String k = s3.replace("java", "world");
	    System.out.println("'world' replaced 'java' in s3 String : " + k);
	    
	    //isEmpty()
	    boolean l = s3.isEmpty();
	    System.out.println("s3 String isEmpty : " + l);
	    
	    //startsWith() and endsWith()
	    boolean m = s3.startsWith("Hello");
	    System.out.println("s3 String startsWith Hello : " +m);
	    boolean n = s3.startsWith("welcome");
	    System.out.println("s3 String startsWith Wellcome : " +n);
	    
	    boolean o = s3.endsWith("java");
	    System.out.println("s3 String endsWith java : " +o);
	    
	    //to find ACSII value
	    char cha = 'M';
	    int x = cha;
	    System.out.println("ASCII value of M : " +x);
	    
	    //compareTo()
	    int com = s2.compareTo(s3);
	    System.out.println("s2 String compares with s3 String : " + com);
	    
	    //literal String
	    String s4 = "java";
	    String s5 = "java";
	    String s6 = "maven";		//literal String //immutable String
	    System.out.println("java : " +System.identityHashCode(s4));
	    System.out.println("java : "+ System.identityHashCode(s5));
	    System.out.println("maven : "+ System.identityHashCode(s6));
	    String s7 = s5.concat(s6);
	    System.out.println("s5 concat s6 : " +s7 + " : "+ System.identityHashCode(s7));
	    
	    //non-literal String
	    String s8 = new String("java");
	    String s9 = new String("java"); //non-literal String
	    StringBuffer s10 = new StringBuffer("java"); 
	    StringBuffer s11 = new StringBuffer("maven"); //mutable String
	    StringBuffer s12 = s10.append(s11);
	    System.out.println("java : " + System.identityHashCode(s8));
	    System.out.println("java : " +System.identityHashCode(s9));
	    System.out.println("java : " +System.identityHashCode(s10));
	    System.out.println("maven : " + System.identityHashCode(s11));
	    System.out.println("s10 append s11 : " + s12 + " : " + System.identityHashCode(s12));
	    
	    
	}
	}
