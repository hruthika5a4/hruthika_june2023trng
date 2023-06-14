import java.util.*;
class MarksDoesNotFit extends Exception{
int m;
MarksDoesNotFit(String msg,int marks){
super(msg);
this.m=0;
}
int getmarks(){
return 0;
}
}
class program1313{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rollno=sc.nextInt();
String name=sc.next();
int marks=sc.nextInt();
try{
if(marks<0){
throw new MarksDoesNotFit("Entered marks cant be negative",marks);
}
}
catch(MarksDoesNotFit ex){
System.out.println(ex);
marks=ex.getmarks();
}
System.out.println(marks);
}
}