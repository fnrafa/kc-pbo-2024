# Materi Praktikum Pemrograman Lanjut

<!-- TOC -->
* [Materi Praktikum Pemrograman Lanjut](#materi-praktikum-pemrograman-lanjut)
  * [Bab 1: Class dan Object](#bab-1-class-dan-object)
    * [Pengenalan OOP](#pengenalan-oop)
    * [Contoh Class dan Object](#contoh-class-dan-object)
  * [Bab 2: Constructor dan Instance Method](#bab-2-constructor-dan-instance-method)
    * [Constructor](#constructor)
    * [Contoh Constructor](#contoh-constructor)
    * [Instance Method](#instance-method)
  * [Bab 3: Overload dan Overloading Method](#bab-3-overload-dan-overloading-method)
    * [Overloading Method](#overloading-method)
    * [Contoh Overloading Method](#contoh-overloading-method)
  * [Bab 4: Encapsulation](#bab-4-encapsulation)
    * [Encapsulation](#encapsulation)
    * [Contoh Encapsulation](#contoh-encapsulation)
  * [Bab 5: Static Modifier dan Konstanta Final](#bab-5-static-modifier-dan-konstanta-final)
    * [Static Method](#static-method)
    * [Konstanta Final](#konstanta-final)
    * [Contoh Static Method dan Konstanta Final](#contoh-static-method-dan-konstanta-final)
  * [Bab 6: Inheritance](#bab-6-inheritance)
    * [Inheritance](#inheritance)
    * [Contoh Inheritance](#contoh-inheritance)
  * [Bab 7: Polymorfisme](#bab-7-polymorfisme)
    * [Polymorfisme](#polymorfisme)
    * [Compile-time Polymorphism (Method Overloading)](#compile-time-polymorphism-method-overloading)
    * [Runtime Polymorphism (Method Overriding)](#runtime-polymorphism-method-overriding)
    * [Abstract Class](#abstract-class)
    * [Contoh Abstract Class](#contoh-abstract-class)
  * [Bab 9: Interface](#bab-9-interface)
    * [Interface](#interface)
    * [Contoh Interface](#contoh-interface)
  * [Table Perbedaan](#table-perbedaan)
<!-- TOC -->

## Bab 1: Class dan Object

### Pengenalan OOP

OOP adalah cara pemrograman dengan menggunakan objek sebagai elemen dasar. Objek memiliki atribut dan tingkah laku.

### Contoh Class dan Object

```java
public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
    }

    public void displayMessage() {
        System.out.println("Mobil anda bermerek " + manufaktur);
        System.out.println("Nomor plat " + noPlat);
        System.out.println("Warna " + warna);
        System.out.println("Kecepatan " + kecepatan);
    }
}

public class MainMobil {
    public static void main(String[] args) {
        Mobil m1 = new Mobil();
        m1.setKecepatan(50);
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1231 UA");
        m1.setWarna("Merah");
        m1.displayMessage();
    }
}
```

## Bab 2: Constructor dan Instance Method

### Constructor

Constructor adalah method khusus untuk inisialisasi objek. Constructor tidak memiliki return value.

### Contoh Constructor

```java
public class Student {
    private String name;
    private String address;
    private int age;

    public Student() {
        name = "";
        address = "";
        age = 0;
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
    }
}
```

### Instance Method

Method yang terkait dengan instance tertentu dari class.

## Bab 3: Overload dan Overloading Method

### Overloading Method

Method dengan nama yang sama tetapi parameter berbeda.

### Contoh Overloading Method

```java
public class Overloading {
    public static void HitungLuas(int a, int b) {
        int nilai = a * b;
        System.out.println("Hasil luas: " + nilai);
    }

    public static double HitungLuas(double value, double value2) {
        return value * value2;
    }
}
```

## Bab 4: Encapsulation

### Encapsulation

Proses menyembunyikan detail implementasi dari suatu class.

### Contoh Encapsulation

```java
public class Student {
    private String name;
    private int mark;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setMark(int m) {
        mark = m;
    }

    public int getMark() {
        return mark;
    }
}
```

## Bab 5: Static Modifier dan Konstanta Final

### Static Method

Method yang dapat dipanggil tanpa menginstansiasi objek dari class.

### Konstanta Final

Variabel yang nilainya tidak dapat diubah setelah diinisialisasi.

### Contoh Static Method dan Konstanta Final

```java
public class Aritmatika {
    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("Hasil perkalian: " + nilai);
    }
}

public class Vehicle1 {
    private final double maxLoad = 10000;

    public double getMaxLoad() {
        return this.maxLoad;
    }
}
```

## Bab 6: Inheritance

### Inheritance

- Definisi: Konsep dimana sebuah class (subclass) mewarisi atribut dan method dari class lain (superclass).
- Method: Subclass mewarisi method dari superclass dan dapat mengoverride-nya.
- Variabel: Subclass mewarisi variabel dari superclass.
- Single Inheritance: Java tidak mendukung multiple inheritance untuk class, hanya single inheritance.
- Keyword: extends

### Contoh Inheritance

```java
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
```

## Bab 7: Polymorfisme

### Polymorfisme

- Definisi: Kemampuan untuk memperlakukan objek-objek dengan cara yang seragam meskipun objek-objek tersebut memiliki
  perilaku yang berbeda. Polymorphism adalah salah satu pilar OOP yang memungkinkan penggunaan satu interface untuk
  berbagai jenis tindakan.
- Dua Jenis Polymorphism:
    - Compile-time (Static) Polymorphism: Polymorphism ini dicapai melalui method overloading atau operator overloading.
    - Runtime (Dynamic) Polymorphism: Polymorphism ini dicapai melalui method overriding. Ini memungkinkan metode yang
      sama untuk memiliki perilaku yang berbeda pada kelas yang berbeda.

### Compile-time Polymorphism (Method Overloading)

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

### Runtime Polymorphism (Method Overriding)

```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
    }
}
```

### Abstract Class

- Definisi: Class yang tidak dapat diinstansiasi dan dapat memiliki abstract method (tanpa implementasi) dan concrete
  method (dengan implementasi).
- Method: Dapat mendefinisikan abstract method dan concrete method.
- Variabel: Dapat memiliki semua jenis variabel.
- Inheritance: Sebuah class hanya dapat mewarisi satu abstract class.
- Keyword: extends

### Contoh Abstract Class

```java
public abstract class MakhlukHidup {
    public abstract void makan();

    public void bernafas() {
        System.out.println("Bernafas");
    }
}

public class Manusia extends MakhlukHidup {
    @Override
    public void makan() {
        System.out.println("Manusia makan dengan tangan.");
    }
}

```

## Bab 9: Interface

### Interface

- Definisi: Blueprint dari sebuah class yang hanya berisi deklarasi method tanpa implementasi.
- Method: Hanya dapat mendeklarasikan abstract method (sebelum Java 8). Sejak Java 8, dapat memiliki default methods dan
  static methods.
- Variabel: Hanya dapat memiliki variabel static dan final.
- Multiple Inheritance: Sebuah class dapat mengimplementasikan banyak interface.
- Keyword: implements

### Contoh Interface

```java
public interface Identitas {
    void tampilkanNama();

    void tampilkanUmur();
}

public class Manusia implements Identitas {
    private String nama;
    private int umur;

    @Override
    public void tampilkanNama() {
        System.out.println("Nama: " + nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur: " + umur);
    }
}
```

## Table Perbedaan

| Fitur       | Interface                                  | Abstract                     | Inheritance                      | Polymorphism                      |
|-------------|--------------------------------------------|------------------------------|----------------------------------|-----------------------------------|
| Keyword     | `implement`                                | `extends`                    | `extends`                        | `-`                               |
| Instansiasi | Tidak bisa                                 | Tidak bisa                   | Melalui subclass                 | Melalui Superclass atau Interface |
| Method      | abstract, default, static                  | Abstract dan concrete method | Concrete method (dapat override) | Method overriding dan overloading |
| Variabel    | Static dan final                           | Semua                        | Semua                            | Tergantung class                  |
| Inheritance | Dapat mengimplementasikan banyak interface | Hanya satu                   | Hanya satu                       | Menggunakan overriding            |
|             |                                            |                              |                                  |                                   |


