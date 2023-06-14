import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class program1308{
public static void main(String args[]){
PrintWriter pw;
try{
pw=new PrintWriter("C:\\fh\\a.txt");
pw.println("saved");
}
catch
(FileNotFoundException e){
System.out.println(e);
}
System.out.println("file saved succesfully");
}
}