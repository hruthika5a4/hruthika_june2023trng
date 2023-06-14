import java.util.LinkedList;
import java.util.List;
class program1318{
public static void main(String args[]){
List<Integer>numbers=new LinkedList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("LinkedList:"+numbers.size());
System.out.println("LinkedList:"+numbers);
int number=numbers.get(2);
System.out.println(number);

int number1=numbers.remove(2);
System.out.println(number1);
System.out.println("LinkedList:"+numbers);
}
}