public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("Before Setting");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

//        Setting age and name
        person.setAge(21);
        person.setName("Tanim");

        System.out.println("\nAfter Setting");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
