import java.util.ArrayList;

/**
 * The Register class represents a register of people.
 * It allows adding people to the register and printing the register.
 */
public class Register{
    private ArrayList<Person> people;
    
    /**
     * Constructs an empty Register object.
     */
    public Register() {
        people = new ArrayList<Person>();
    }

    /**
     * Adds a person to the register.
     * 
     * @param personData a string containing the person's data separated by commas (firstName,lastName,age,email)
     */
    public void addPerson(String personData) {
        String[] data = personData.split(",");
        String firstName = data[0];
        String lastName = data[1];
        int age = Integer.parseInt(data[2]);
        String email = data[3];
        Person person = new Person(firstName, lastName, age, email);
        people.add(person);
    }

    /**
     * Prints the register.
     */
    public void printRegister() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

}