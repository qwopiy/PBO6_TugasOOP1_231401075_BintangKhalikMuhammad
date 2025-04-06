package IKLCMart;

public class Main extends Payment {
    Main(double totalPrice, String paymentMethod) {
        super(totalPrice, paymentMethod);
    }

    public static void main(String[] args) {
        Main Siti = new Main(3500000, "Kartu Kredit");
        Main Ciciripi = new Main(10000000, "Voucher Diskon");
        Main Asnawi = new Main(1200000, "Transfer Bank");

        System.out.println("Siti : ");
        Siti.pay(Siti.paymentMethod);
        System.out.println("\nCiciripi : ");
        Ciciripi.pay(Ciciripi.paymentMethod, 15);
        System.out.println("\nAsnawi :");
        Asnawi.pay(Asnawi.paymentMethod);
    }
}
