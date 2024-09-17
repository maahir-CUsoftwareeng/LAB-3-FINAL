public class BuddyInfo {
    // Instance variables
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor with parameters
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    // Constructor with parameters
    public BuddyInfo() {
        this.name = "Maahir";
        this.address = "Carleton University";
        this.phoneNumber = "6131231234";
    }


    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Setter for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Main method
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Mehak", "Carleton", "6139878765");
        System.out.println("Hello " + buddy.getName());
        AddressBook test = new AddressBook(buddy);
        System.out.println(test);
        BuddyInfo buddy2 = new BuddyInfo("Tom", "Carleton", "613");
        test.addBuddy(buddy2);
        test.removeBuddy(buddy2);
        System.out.println(test);
    }
}
