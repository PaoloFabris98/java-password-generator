package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name = "";
        String surname = "";
        String color = "";
        int dayOfBirth = 0;
        int monthOfBirth = 0;
        int yearOfBirth = 0;
        String password = "";

        System.out.println("Inserisci il tuo Nome");
        name = input.nextLine();
        System.out.println("Inserisci il tuo Cognome");
        surname = input.nextLine();
        System.out.println("Qual'è il tuo colore preferito? ");
        color = input.nextLine();
        System.out.println("Inserisci il tuo giorno di nascita");
        dayOfBirth = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci il tuo mese di nascita");
        monthOfBirth = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci il tuo anno di nascita");
        yearOfBirth = Integer.parseInt(input.nextLine());

        System.out.println(name);
        System.out.println(surname);
        System.out.println(color);
        System.out.println(dayOfBirth);
        System.out.println(monthOfBirth);
        System.out.println(yearOfBirth);

        password = (name + "-" + surname + "-" + color + "-" + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);

        System.out.println(password);
        input.close();
    }
}
