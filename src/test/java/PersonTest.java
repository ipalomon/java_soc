public class PersonTest
{
    public static void  main(String[] args)
    {
        Person p = new Person("Ppep",10);
        int e = p.getAge();
        String  n = p.getName();
        System.out.println("Nombre "+e);
        System.out.println('\n');
        System.out.println("Edad "+n);
    }
}
