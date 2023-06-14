public class program1311{
public static void main(String args[]){
int x[]={1,2,3,4};
try{
x[6]=100/0;
}

catch(Exception e){
System.out.println("common task complected");
}
catch(ArithmeticException e){
System.out.println("ArithemticException occurs");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundsException occurs");
}
System.out.println("rest of the code");
}
}