package cleanCode.challenges.zadanie2.entity;

public final class Customer {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumber;

    public Customer(final String firstName,final String lastName,final String address,final String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
