import java.util.*;
class AgeDoesNotFit extends Exception{
String msg;
AgeDoesNotFit(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class program1312{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try{
if(age<18){
throw new AgeDoesNotFit("Entered age doesnt fulfill the required age limit");
}
}
catch(AgeDoesNotFit ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}
