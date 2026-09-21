import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<BuddyInfo> buddyList = new ArrayList();

    public void addBuddy(BuddyInfo bud) {
        buddyList.add(bud);
    }

    public void removeBuddy(BuddyInfo bud) {
        buddyList.remove(bud);
    }

    public static void main(String[] args){
        System.out.println("address book");

        BuddyInfo bud4 = new BuddyInfo("bud2");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(bud4);
        addressBook.removeBuddy(bud4);
    }
}
