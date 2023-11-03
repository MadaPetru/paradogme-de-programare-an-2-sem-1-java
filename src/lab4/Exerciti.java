package lab4;

import java.util.Scanner;

public class Exerciti {

    public static void main(String[] args) {
        problema1();
        problema2();
        problem3();
        problema4();
    }

    private static void problema4() {
        Person person = new Person();
        person.setName("adi");
        person.setEmail("@gmail.com");

        Student student = new Student();
        int[] grades = {10, 9, 5, 7};
        student.setGrades(grades);
        student.setName("cata");
        student.setEmail("email");

        Profesor profesor = new Profesor();
        String[] courses = {"Romana", "mate"};
        profesor.setCourses(courses);
    }

    private static void problem3() {
        Dog dog1 = new Dog("cutu", "hasky");
        Dog dog2 = new Dog("reski", "labrador");

        dog1.setName("ursu");
        dog2.setBreed("pitbul");

        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(dog2.getName());
        System.out.println(dog2.getBreed());
    }

    private static void problema2() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sol = 0;
        if (n < 0) n = n * -1;
        while (n > 0) {
            sol = sol + (n % 10);
            n = n / 10;
        }
        System.out.println(sol);
    }

    private static void problema1() {

        Scanner in = new Scanner(System.in);
        String cuvant = in.next();

        int lungime = cuvant.length();
        char c2 = cuvant.charAt(lungime / 2);
        if (lungime % 2 == 0) {
            char c1 = cuvant.charAt(lungime / 2 - 1);
            System.out.println(String.format("%c%c", c1, c2));
        } else {
            System.out.println(c2);
        }
    }
}
