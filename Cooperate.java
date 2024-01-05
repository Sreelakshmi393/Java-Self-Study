class Member{
String name;
int age;
String number;
String address;
int salary;

void printSalary(){
System.out.println(salary);
}
}

class Employee extends Member{
String specialization;
}

class Manager extends Member{
String department;
}

class Cooperate
{
public static void main(String args[])
{
Employee e = new Employee();
e.name = "John";
e.age = 28;
e.number = "9784356734";
e.address = "4th Avenue, Navi Mumbai";
e.salary = 34000;

Manager m = new Manager();

m.name = "Sheena";
m.age = 40;
m.number = "7854673498";
m.address = "Temple street, Bhuwaneswar";
m.salary = 68000;

e.printSalary();
m.printSalary();
}
}