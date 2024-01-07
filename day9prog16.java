//java final class  
//if u make any class as final,u cannot extend it
//finalkey word in method
final class Bike{
}
class Honda extends Bike
{
void run()
{
System.out.println("running safely with 100kmph");
}
public static void main(String args[])
{
Honda h=new Honda();
h.run();
}
}
