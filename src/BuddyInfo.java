public class BuddyInfo {
    private String name;

    public String getName() {
        return name;
    }

    public BuddyInfo(String name) {
        this.name = name;
    }

    public BuddyInfo() {
        this.name = "Place Holder";
    }

    public static void main(String[] args) {
        BuddyInfo bud = new BuddyInfo("Tom");
        System.out.println("Hello world! " + bud.getName());
        System.out.println("test1");
    }
}
