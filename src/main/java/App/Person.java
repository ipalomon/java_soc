package App;

import java.util.ArrayList;

public class Person {

    public String name;
    public String surname;
    boolean vegaN;
    public int age;
    public Car car;
    public ArrayList<Dog> dogs = new ArrayList<Dog>();
    // Construct
    public Person(){}

    public Person( String name, int age, Car car){
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public Person( String name, int age, Dog dogs){
        this.name = name;
        this.age = age;
    }

    public int getAge()    {
        return this.age;
    }

    public String getName()    {
        return this.name;
    }

    public boolean idAdult()    {
        boolean isAdult = false;
        if(this.age>=18){
            isAdult = true;
        }
        return isAdult;
    }

    public String sayHello(){
        return "hello";
    }

    public void sayName(){
        System.out.println("Nombre "+this.name + " " + this.car.marca + " " + this.dogs.get(0).name);
        Test.hello();
    }

    public void setCar(Car car){
        this.car = car;
    }
}
