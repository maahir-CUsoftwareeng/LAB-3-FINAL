import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressBook;

    public AddressBook() {
        this.addressBook = new ArrayList<>();
    }

    public AddressBook(BuddyInfo buddy) {
        this.addressBook = new ArrayList<>();
        this.addBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddy) {
        addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        addressBook.remove(buddy);
    }
}
