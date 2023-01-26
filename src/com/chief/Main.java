package com.chief;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
String nature;
        System.out.println("Are you rude or polite? ");

        nature=scan.next();
        if (nature.equals("rude")){

            System.out.println("lol! Byeeee ");
        }else {

            System.out.println("Hello whats your name? ");
            String name = scan.nextLine();

            System.out.println("\nHi " + name + " am ChiefBot.Where are you from? ");
            String place = scan.nextLine();

            System.out.println("\nOh wow " + place + ", i hear its beautiful there.Am from a Chief's lab.\nHow old are you? ");
            int age = scan.nextInt();

            System.out.println("\nCool so you're " + age + " years old, am 1 year old so technically that makes me a baby!!");

            System.out.println("Enough about me ,whats your favourite language? please dont say Java! ");
            String language = scan.next();

            System.out.println("\n" + language + " ,Fair enough.How many years have you  written in " + language);
            int years = scan.nextInt();

            System.out.println("\n" + years + " years eh!, Thats great keep it up !");
            System.out.println("Nice talking to you " + name + ".");

            scan.close();

        }
    }
}