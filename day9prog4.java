//INHERITANCE EXAMPLE2
class Animal
{
void eat()
{
System.out.println("eating.....");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("barking.....");
}
}
class TestInheritance
{
public static void main(String args[])
{
Dog d=new Dog();
d.eat();
d.bark();
}
}

