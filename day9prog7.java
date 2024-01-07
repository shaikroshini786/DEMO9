class Animal
{
String name="Roshini";
void eat()
{
System.out.println("eating...");
}
}
class Dog extends Animal
{
void display()
{
System.out.println("displaying....");
}
}
class TestInheritance6
{
public static void main(String args[])
{
Dog labrador=new Dog();
System.out.println("My name is:"+labrador.name);
labrador.eat();
labrador.display();
}
}

