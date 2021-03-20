package cleanCode.challenges.zadanie2.entity;

public final class Customer {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumber;
    private final String payPalAccountName;
    private final String email;

    public Customer(final String firstName,final String lastName,final String address,final String phoneNumber,
                    String payPalAccountName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.payPalAccountName = payPalAccountName;
        this.email = email;
    }

    public String getPayPalAccountName() {
        return payPalAccountName;
    }

    public String getEmail() {
        return email;
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
        return firstName + " " + lastName;
    }
}
