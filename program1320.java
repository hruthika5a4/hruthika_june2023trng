import java.util.ArrayList;
import java.util.List;
class program1320{
public static void main(String args[]){
ArrayList<String>numbers=new ArrayList<>();
numbers.add("hruthika");
numbers.add("mounika");
numbers.add("mizba");
System.out.println("ArrayList:"+numbers.size());
System.out.println("ArrayList:"+numbers);
String number=numbers.get(0);
System.out.println(number);
number=numbers.get(1);
System.out.println(number);
number=numbers.get(2);
System.out.println(number);
numbers.set(1,"mahesh");
System.out.println(numbers);
String number1=numbers.remove(2);
System.out.println(number1);
System.out.println("ArrayList:"+numbers);
}
}