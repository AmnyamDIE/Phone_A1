public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("", "", 0.0);
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is ringing");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is ringing from " + callerNumber);
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Sending message to: " + String.join(", ", phoneNumbers));
    }

    public Phone(String number, String model, String weight) {
        this(number, model, Double.parseDouble(weight));
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-7890", "iPhone X", 150.5);
        Phone phone2 = new Phone("987-654-3210", "Samsung Galaxy S20");
        Phone phone3 = new Phone();

        phone1.receiveCall("John Doe");
        System.out.println("Phone1 Number: " + phone1.getNumber());

        phone2.receiveCall("Jane Smith", "555-123-4567");

        phone3.sendMessage("111-222-3333", "444-555-6666");
    }
}