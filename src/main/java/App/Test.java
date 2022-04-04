package App;

public class Test
{
    public static void  main(String[] args)
    {
        hello();
        Person p = new Person("Ppep",25, new Car("jaguar", 1968));
        Person p1 = new Person();
        int e = p.getAge();
        String  n = p.getName();
        System.out.println("Edad "+e);
        System.out.println('\n');
        System.out.println("Nombre "+n);

        System.out.println("Edad p mayor 18 "+p.idAdult());
        System.out.println("Edad p1 mayor 18 "+p1.idAdult());


        System.out.println(p1.sayHello());

        p.sayName();

        Car citroen = new Car("Citroen", 2021);
        p1.setCar(citroen);

        p1.dogs.add(new Dog("toby"));
        p1.sayHello();
    }

    public static void hello(){
        System.out.println("Hello static ");
    }
}
