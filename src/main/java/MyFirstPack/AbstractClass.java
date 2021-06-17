package MyFirstPack;
interface I1{
  void show(); //abstract void show();
}
abstract class Vehicle{
  int noOfWheels;
  abstract void start();
}
class Car extends Vehicle implements I1{
  //noOfWheels=4;
void start(){
  System.out.println("Start with key");
}
public void show(){
  System.out.println("Hello Monday!!!");
}
}
class Scooter extends Vehicle{
  //noOfWheels=2;
  void start(){
    System.out.println("Start with kick");
  }
}
public class AbstractClass {

  public static void main(String[] args) {
   Car c=new Car();
  // Vehicle v=new  Vehicle();
    Scooter sc=new Scooter();
   c.start();
   sc.start();
   c.show();
  }
}
