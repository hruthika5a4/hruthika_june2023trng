
public class program1309{
public static void main(String args[]){
int a[]=new int[5];
a[0]=11;a[1]=20;
a[2]=10;
a[3]=90;
a[4]=111;
try{
for(int i=0;i<=5;i++)
System.out.println(100/a[i]);//a[5]=30/0;//a[5]=30/8
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