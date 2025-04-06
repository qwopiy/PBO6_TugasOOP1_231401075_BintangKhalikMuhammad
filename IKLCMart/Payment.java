package IKLCMart;

public class Payment {
    protected double totalPrice;
    protected String paymentMethod;
    protected String paymentStatus;

    Payment(double totalPrice, String paymentMethod) {
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    void pay(String paymentMethod) {
        process();

        if (paymentMethod.equals("Kartu Kredit") || paymentMethod.equals("Transfer Bank")) {
            paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
        } else {
            paymentStatus = "Pembayaran gagal :(";
        }
        System.out.println("Status Pembayaran       : " + paymentStatus);
    }

    void pay(String paymentMethod, double discountPercentage) {
        if (paymentMethod.equals("Voucher Diskon")) {
            process();
            System.out.printf("Voucher Diskon          : %.0f%% ", discountPercentage);
            paymentStatus = "Pembayaran Berhasil dengan Voucher Diskon";
            System.out.println("\nHarga setelah diskon    : " + discountedPrice(discountPercentage));
            System.out.println("Status Pembayaran       : " + paymentStatus);
        } else {
            pay(paymentMethod);
        }
    }

    void process() {
        System.out.println("Harga sebelum diskon    : " + totalPrice);
        System.out.println("Metode Pembayaran       : " + paymentMethod);
    }

    double discountedPrice(double discountPercentage) {
        return totalPrice * discountPercentage/100;
    }
}
