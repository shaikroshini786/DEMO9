//single inheritance example1
class Employee
{
float salary=4000;
}
class Programmer extends Employee
{
int bonus=1000;
public static void main(String args[])
{
Programmer p=new Programmer();
System.out.println("Programmer Salary is:"+p.salary);
System.out.println("Programmer Bonus is:"+p.bonus);
}
}