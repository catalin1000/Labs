package com.company.immutability;

    public class Main {
        public static void main(String[] args) {
            // Creăm un obiect de tip Laptop
            MutableLaptop laptop = new MutableLaptop("HP Pavilion", "Windows 10");

            // Afișăm informațiile despre laptop
            System.out.println("Informații despre laptop:");
            System.out.println(laptop);

            // Creăm un obiect de tip SistemOperare
            ImmutableSistem sistemOperare = new ImmutableSistem("Windows", "10");

            // Afișăm informațiile despre sistemul de operare
            System.out.println("\nInformații despre sistemul de operare:");
            System.out.println(sistemOperare);

            // Demonstrăm că obiectele sunt imutabile prin încercarea de a le modifica
            // Modificăm numele modelului laptopului
            // Această operație nu este posibilă pentru că clasa Laptop este mutabilă
            // laptop.setModel("Dell Inspiron");

            // Modificăm versiunea sistemului de operare
            // Această operație nu este posibilă pentru că clasa SistemOperare este imutabilă
            // sistemOperare.setVersiune("11");
        }
}
