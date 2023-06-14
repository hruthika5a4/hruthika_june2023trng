import java.util.ArrayList;
import java.util.List;
class program1319{
public static void main(String args[]){
ArrayList<String>numbers=new ArrayList<>();
numbers.add("1");
numbers.add("2");
numbers.add("3");
System.out.println("ArrayList:"+numbers.size());
System.out.println("ArrayList:"+numbers);
String number=numbers.get(2);
System.out.println(number);

String number1=numbers.remove(2);
System.out.println(number1);
System.out.println("ArrayList:"+numbers);
}
}