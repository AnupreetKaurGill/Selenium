
public class MethodsDemo {



public static void main(String[] args) {


MethodsDemo d = new MethodsDemo();

String name = d.getData();

System.out.println(name);

MethodsDemo2 d1 = new MethodsDemo2();

d1.getUserData();

getData2();      // static method. No need to make class object

}



public String getData()

{

System.out.println ("hello world");

return "Anu Gill";

}


//static method
public static String getData2()

{

System.out.println ("hello world");

return "Anu Gill";

}


}
