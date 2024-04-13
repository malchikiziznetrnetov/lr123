package org.example;

public class Tester {
   private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this(name, surname, expirienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "B1", 0.0);
    }

    public void output(String text) {
        System.out.println(text);
    }

    public void output(String text, String text1) {
        System.out.println(text + " " + text1);
    }

    public void output(String text, String text1, String text2) {
        System.out.println(text + " " + text1 + " " + text2);
    }


    public static void staticOutput(String name, String surname, double salary) {
        System.out.println("Хеллоу, май нейм " + name + " " + surname + " мой салари: " + salary);
    }
}
