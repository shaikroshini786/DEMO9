class C
{
public void display()
{
System.out.println(" method of  class class c");
}
}
class A extends C
{
public void display()
{
System.out.println(" method of  class class A");
}
}
class B extends C
{
public void display()
{
System.out.println(" method of  class class c");
}
}
class D extends A
{
public void display()
{
System.out.println(" method of  class class c");
}
public static void main(String args[])
{
D d=new D();
d.display();
}
}


