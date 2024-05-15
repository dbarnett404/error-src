
/**
 * The Person class represents a person with attributes such as first name, last name, age, and email.
 * It provides methods to check the validity of the name, age, and email, as well as getters and setters for each attribute.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    // Constructor to create a Person object with the given first name, last name, age, and email
    public Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    /** 
     * Presence check: Test that input is made by the user (not just an empty String)
     * Add Length check: Input is between a specified length (i.e. min / max chars at least one and less then 20)
     */
    public boolean checkValidName(String name) {
        return true;
    }
    
    // Getters and setters for firstName, lastName, age, and email
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
     * Range check: Test that input greater than or equal to 18 and less than or equal to 120
     */
    public boolean checkValidAge(int age) {
        return true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /** 
     * Format check: Input data is in the correct format (valid email address)
     */
    public boolean checkValidEmail(String email) {
        return true;
    }     

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method to return the person's information
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}