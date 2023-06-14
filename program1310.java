public class program1310{
public static void main(String args[]){
String str=null;
try{
System.out.println(str.length());
}
catch(ArithmeticException e){
System.out.println("ArithemticException occurs");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundsException occurs");
}
catch(Exception e){
System.out.println(e);
}
System.out.println("rest of the code");
}
}