package com.companyhw11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lengthArray = 5;
        Box[] boxes = new Box[lengthArray];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = initializationBox();
        }
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("box" + i + ": " + boxes[i].toString());
        }
    }

    private static Box initializationBox() {
        System.out.println("Please enter box height, length, width in cm");
        Box box = new Box(scanNumber(), scanNumber(), scanNumber());
        box.getVolume();
        return box;
    }

    private static int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        do {
            try {
                System.out.print("Enter a positive non-zero integer: ");
                temp = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Error. The entered number is not an positive non-zero integer.");
                scanner.next();
            }
        } while (temp <= 0);
        return temp;
    }
}
