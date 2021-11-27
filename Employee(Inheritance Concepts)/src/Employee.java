public class Employee {
    private String firstName;
    private String lastName;
    private long cnic;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getCnic() {
        return cnic;
    }

    public Employee(String firstName, String lastName, long cnic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnic = cnic;
    }

    @Override
    public String toString() {
        return String.format("\n First Name: %s\n Last Name: %s\n CNIC: %s\n",getFirstName(),getLastName(),getCnic());
    }
}
