# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pencarian dan pengelompokan produk handphone menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa kategori handphone (**Gaming** atau **Kamera**), kemudian menampilkan daftar 5 produk sesuai kategori tersebut. Setelah itu, pengguna diminta untuk memasukkan **nama produk**, dan program akan menampilkan detail seperti **nama, harga, merk, chipset (untuk gaming), atau kamera (untuk kamera)**.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding (Polymorphism), Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Produk`, `Handphone`, `HandphoneGaming`, `HandphoneKamera`, dan `HandphoneMain` adalah contoh class.

```java
public class Produk { ... }
public class Handphone extends Produk { ... }
public class HandphoneGaming extends Handphone { ... }
public class HandphoneKamera extends Handphone { ... }
public class HandphoneMain { ... }
```

2. **Object** adalah instance dari class. Pada kode ini, objek dibuat dalam array seperti:

```java
hpGaming[0] = new HandphoneGaming("ROG Phone 7", 9500000, "ASUS", "Snapdragon 8 Gen 2");
```

3. **Atribut** adalah variabel yang ada dalam class. Contohnya:

```java
protected String nama;
protected double harga;
```

4. **Constructor** adalah method yang dijalankan saat pembuatan object:

```java
public Produk(String nama, double harga) {
    this.nama = nama;
    this.harga = harga;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai atribut:

```java
public void setMerk(String merk) {
    this.merk = merk;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai atribut:

```java
public String getMerk() {
    return merk;
}
```

7. **Encapsulation** adalah penyembunyian data dengan membuat atribut `private`/`protected` dan diakses melalui getter/setter:

```java
protected String nama;
```

8. **Inheritance** adalah pewarisan sifat dari class ke subclass:

```java
public class Handphone extends Produk
public class HandphoneGaming extends Handphone
```

9. **Polymorphism** (Overriding) ditunjukkan melalui method `tampilkanInfo()` yang berbeda di masing-masing subclass:

```java
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Chipset : " + chipset); // untuk gaming
}
```

10. **Seleksi** (Percabangan) menggunakan `if-else`:

```java
if (kategori.equalsIgnoreCase("Gaming")) { ... }
else if (kategori.equalsIgnoreCase("Kamera")) { ... }
else { throw new Exception("Kategori tidak dikenali."); }
```

11. **Perulangan** digunakan untuk menampilkan dan mencari data produk:

```java
for (HandphoneGaming hp : hpGaming) {
    System.out.println("- " + hp.getNama());
}
```

12. **IO Sederhana** digunakan untuk input/output user:

```java
Scanner input = new Scanner(System.in);
System.out.print("Pilih kategori: ");
String kategori = input.nextLine();
```

13. **Array** digunakan untuk menyimpan daftar handphone:

```java
HandphoneGaming[] hpGaming = new HandphoneGaming[5];
```

14. **Error Handling** menggunakan `try-catch` untuk menangani kesalahan input:

```java
try {
   ...
} catch (Exception e) {
   System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Abdul Wahab
NPM: 2310010150
