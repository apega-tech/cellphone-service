package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone1 = new CellPhone(1234567, "iPhone 12 Pro Max", "Mint", "366-7470", "Karen");
        CellPhone phone2 = new CellPhone(9876543, "Samsung Galaxy Z Flip 8", "Spectrum", "202-8145", "Anastacia");

        display(phone1);
        display(phone2);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1);

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