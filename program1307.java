class program1307{
public static void main(String args[]){
int data[]={1,2,3,4};
try{
data[10]=20;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.print("rest of code");
}
}