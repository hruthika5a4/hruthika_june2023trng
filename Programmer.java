class Employee{
float salary=40000.6f;
}
class Programmer extends Employee{
int bonus=10000;
public static void main(String args[]){
Programmer p=new Programmer();
System.out.println("Programmer Salary is "+p.salary);
System.out.println("Programmer Bonus is "+p.bonus);
}
}
      