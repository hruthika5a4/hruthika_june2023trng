import java.util.Scanner;
class P622{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
char c=s1.charAt(0);
int a=sc.nextInt();
if(a%2==0){
int x=a/2;
int y=a/2;
}
else{
int x=a/2;
int y=a/2+1;
}
rpattern(c,a);
pattern(c,a);
int col;
}
public static void rpattern(char c,int a){
for(int i=a;i>=1;i--)
line(c,i);
}
public static void pattern(char c,int a){
for(int k=1;i<=a;k++)
line(c,k);
public static void line(char c,int col){
System.out.println("");
for(int k=1;k<=col;k++)
System.out.print(c);
}
}
