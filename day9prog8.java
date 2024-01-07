//Redefining of base class in derived class is called method overiding
//same method is derived from base class to derived class
class  Human
{
public void  eat()
{
System.out.println(" I can eat");
}
}
class Girl extends Human
{
public void eat()
{
System.out.println(" I can eat Biriyani");
}
public void  play()
{
System.out.println(" I can play");
} 
}
class Overriding
{
public static void main(String args[])
{
Girl g=new Girl();
g.eat();
g.play();
}
}

