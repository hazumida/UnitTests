public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name + " " + this.number;
    }

    public String getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }
}
