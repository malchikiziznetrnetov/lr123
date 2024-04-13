package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {g
        Tester test = new Tester("Владик", "Бурдик", 1, "A1", 0.2);
        test.output("Baby");
        Tester tester2 = new Tester("Дишечка", "Голубик", 1 , "B1", 10.1);
        tester2.output("Бейбик");
        int a = 0;
        test.staticOutput("Дишечка", "Голубчик", 999.1);
        System.out.println( "Hello Влад!" );
    }
}
