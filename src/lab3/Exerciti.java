package lab3;

import java.util.*;

public class Exerciti {

    public static void main(String[] args) {
        problema1();
        problema2();
        problema3();
        problema4();
    }

    private static void problema4() {

        Scanner in = new Scanner(System.in);
        String cuvant = in.next();

        int lungime = cuvant.length();

        int i = 0;
        int j = lungime - 1;
        boolean estePalindrom = true;
        while (i < j && estePalindrom) {
            if (cuvant.charAt(i) != cuvant.charAt(j)) estePalindrom = false;
            i++;
            j--;
        }
        if(estePalindrom){
            System.out.println("este palindrom");
        }
        else{
            System.out.println("Nu e palindrom");
        }
    }

    private static void problema3() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        if (n <= 0) {
            return;
        }
        if (n == 1) {
            System.out.println(a);
            return;
        }
        if (n == 2) {
            System.out.println(b);
            return;
        }
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }

    private static void problema2() {

        Scanner in = new Scanner(System.in);

        int nrElemente = in.nextInt();
        int[] sol = new int[nrElemente];
        int nrSoluti = 0;
        for (int i = 1; i <= nrElemente; i++) {
            int nr = in.nextInt();
            int aux = nr;
            boolean estePrim = true;
            if (nr <= 1) estePrim = false;
            for (int j = 2; j * j <= aux && estePrim; j++) {
                if (aux % j == 0) estePrim = false;
            }
            if (estePrim) {
                sol[nrSoluti] = nr;
                nrSoluti++;
            }
        }
        for (int i = 0; i < nrSoluti; i++) {
            System.out.println(String.format("numarul este %s prim.", sol[i]));
        }
    }


    private static void problema1() {
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        lista1.add("1");
        lista1.add("2");
        lista1.add("2");
        lista1.add("3");
        lista1.add("3");

        lista2.add("2");
        lista2.add("3");
        lista2.add("3");
        lista2.add("4");

        Set<String> aux = new HashSet<>();

        for (String element : lista1) {
            aux.add(element);
        }

        List<String> sol = new ArrayList<>();
        for (String element : aux) {
            if (lista2.contains(element)) {
                sol.add(element);
            }
        }

        System.out.println("Elementele comune sunt:\n");
        for (String element : sol) {
            System.out.println(element);
        }
    }
}