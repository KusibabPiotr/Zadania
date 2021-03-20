package cleanCode.challenges.food2door.entities;

public class Producer{

    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String bankAccountNumber;
    private final String email;
    private final String payPalAccount;
    private final Product product;

    public Producer(String name, String address, String phoneNumber, String bankAccountNumber, String email, Product product, String payPalAccount) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.email = email;
        this.product = product;
        this.payPalAccount = payPalAccount;
    }

    public String getPayPalAccount() {
        return payPalAccount;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getEmail() {
        return email;
    }
}
