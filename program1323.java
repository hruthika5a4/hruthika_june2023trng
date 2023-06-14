import java.util.*;
class program1323{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
mammals.add("hruthika");
mammals.add("mounika");
mammals.add("mizba");
System.out.println("Vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("mounika");
animals.addAll(mammals);
System.out.println("new Vector:"+animals);
String element=animals.get(2);
System.out.println(element);
Iterator<String> iterate=animals.iterator();
System.out.println("Vector:");
while(iterate.hasNext()){
System.out.println(iterate.next()+" ");
}

}
}