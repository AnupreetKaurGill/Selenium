public class JavaBrushUp2 {



public static void main(String[] args) {

//string is an object 



// String s1 = "Rahul Shetty Academy";       //String literal

String s5 = "hello";



//new

String s2 = new String("Welcome");

String s3 = new String("Welcome");



String s = "Rahul Shetty Academy";

String[] splittedString = s.split("Shetty");

System.out.println(splittedString[0]);

System.out.println(splittedString[1]);

System.out.println(splittedString[1].trim());     // trim to remove spaces


//print the reverse string
for(int i =s.length()-1;i>=0;i--)

{

	System.out.println(s.charAt(i));

}

}


}