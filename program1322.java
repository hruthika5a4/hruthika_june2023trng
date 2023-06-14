import java.util.Vector;
class program1322{
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
}
}