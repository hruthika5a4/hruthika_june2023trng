import java.util.ArrayList;
import java.util.List;
class program1317{
public static void main(String args[]){
List<Integer>numbers=new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("ArrayList:"+numbers.size());
System.out.println("ArrayList:"+numbers);
int number=numbers.get(2);
System.out.println(number);

int number1=numbers.remove(2);
System.out.println(number1);
System.out.println("ArrayList:"+numbers);
}
}