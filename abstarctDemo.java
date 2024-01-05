abstract class First{
abstract void callme();
void display(){
System.out.println("Inside the first class");
}
}

class Second extends First{
void callme(){
System.out.println("Implemented in second class");
}
}
class abstarctDemo{
public static void main(String args[]){
Second obj = new Second();
obj.callme();
obj.display();
}
}
