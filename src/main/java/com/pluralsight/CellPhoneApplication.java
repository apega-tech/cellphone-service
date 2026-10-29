package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone1 = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        phone1.setSerialNumber(serialNumber);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);

        CellPhone phone2 = new CellPhone(9876543, "Samsung Galaxy Z Flip 8", "Spectrum", "202-8145", "Anastacia");

        display(phone1);
        display(phone2);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

        scanner.close();
    }
    public static void display(CellPhone phone) {
        System.out.println("\n--- Cell Phone Details ---");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}