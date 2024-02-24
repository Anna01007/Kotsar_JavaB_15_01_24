package hw14;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phone;

    public Person(String name, String surname, String city, String phone) {   // Constructor of the Person class
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "You can call a citizen " + name + " " + surname +
                " from city " + city + " by number " + phone + ".";
    }

    public static void main(String[] args) {
        // Using the constructor to create objects of the Person class
        Person personOne = new Person("Will", "Smith", "New York", "2936729462");
        Person personTwo = new Person("Jackie", "Chan", "Shanghai", "12312412");
        Person personThree = new Person("Sherlock", "Holmes", "London", "37742123");

        // Call the personInfo method for each object
        System.out.println(personOne.personInfo());
        System.out.println(personTwo.personInfo());
        System.out.println(personThree.personInfo());
    }
}
