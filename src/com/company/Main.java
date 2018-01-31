package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sveiki, iveskite savo varda");

        Scanner sc = new Scanner(System.in);

        String vardas = sc.nextLine();
        for (int i = 0; i < 5; i++) {

            System.out.println(vardas);


        }
    }
}
