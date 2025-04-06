# PBO6_TugasOOP1, Sistem Pembayaran Online

## Deskripsi Tugas
IKLCMart adalah sebuah toko online yang menjual berbagai macam produk teknologi. Sebagai bagian dari sistem belanja mereka, pelanggan dapat memilih berbagai metode pembayaran, mulai dari **Kartu Kredit, Transfer Bank, hingga Voucher Diskon**. Setiap transaksi yang dilakukan akan membutuhkan **perhitungan total harga setelah diskon, serta status pembayaran yang jelas (apakah berhasil atau gagal)**.

Sebagai seorang developer junior di tim IKLCMart, kamu ditugaskan untuk membuat sistem pembayaran online yang dapat menangani beberapa **metode pembayaran, menghitung total harga setelah diskon, dan menampilkan status pembayaran** kepada pengguna.

### IKLCMart.Payment Class
- Attribute: totalPrice, paymentMethod, paymentStatus
- Constructor dengan parameter totalPrice dan paymentMethod
- Overloading Method: Method menerima parameter paymentMethod (Credit Card, Bank Transfer, Voucher)
- Void Method: Menampilan Detail pembayaran (paymentStatus dan paymentMethod)
- Return Type Method: Mengembalikan totalPrice setelah di diskon jika memakai Voucher

### IKLCMart.Main Class
- Inheritance
- Menampilkan Total Harga sebelum diskon
- Menampilkan Metode Pembayaran
- Menampilkan Status Pembayaran

### Case Study
- Siti memutuskan untuk membeli gadget terbaru di IKLCMart seharga Rp3.500.000. Namun, dia memilih untuk membayar menggunakan Kartu Kredit.
Total Harga Sebelum Diskon: Rp 3.500.000 <br>
Metode Pembayaran: Kartu Kredit <br>
Status Pembayaran: Pembayaran Berhasil dengan Kartu Kredit
- Ciciripi baru saja membeli sebuah laptop di IKLCMart dengan harga Rp 10.000.000. Karena Ciciripi adalah pengguna setia, dia memiliki voucher diskon sebesar 15%. Ciciripi memilih untuk menggunakan Voucher Diskon sebagai metode pembayarannya. <br>
Total Harga Sebelum Diskon: Rp 10.000.000 <br>
Voucher Diskon: 15% <br>
Metode Pembayaran: Voucher Diskon <br>
Status Pembayaran: Pembayaran Berhasil dengan Voucher Diskon
- Asnawi membeli berbagai aksesoris komputer dengan total harga Rp 1.200.000. Namun, dia tidak memiliki voucher dan melakukan pembayaran menggunakan Transfer Bank. <br>
Total Harga Sebelum Diskon: Rp 1.200.000 <br>
Metode Pembayaran: Transfer Bank <br>
Status Pembayaran: Pembayaran Berhasil dengan Transfer Bank

### Output : 
![img.png](img.png)
