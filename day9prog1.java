class Author
{
String  authorName;
int age;
String place;
Author(String name, int age, String  place)
{
this.authorName=authorName ;
this.age = age;
this. place= place;
}
}
class  Book
{
String name;
int  price;
Author  auther;
 Book(String n,int p,Author  auther )
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String  args[])
{
Auther auther=new Auther("john",42,"USA");
Book b=new Book("Java For Begginers",800,auther);
System.out.println("Book name:"+b.name);
System.out.println("Book price:"+b. price);
System.out.println("..........Auther Details............");
System.out.println("Author name:"+b. auther.autherName);
System.out.println("Author Age:"+b.auther.age);
System.out.println(" Author place:"+b.auther.place);
}
}




