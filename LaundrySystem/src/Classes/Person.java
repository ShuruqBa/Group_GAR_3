
package Classes;

public class Person {

    private String phoneNumber;
    private String Email;
    private String firstName;
    private String lastName;
    private String passWord;

    public Person(String phoneNumber, String Email, String firstName, String lastName, String passWord) {
        this.phoneNumber = phoneNumber;
        this.Email = Email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = passWord;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return passWord;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }

}
