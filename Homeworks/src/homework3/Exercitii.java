package homework3;

import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {

//         ex1();
//         ex2();
        ex3();
    }

     static void ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ce varsta aveti ?");
        int varsta = scanner.nextInt();

        if(varsta < 18){
            System.out.println("Esti minor");
        } else if (varsta >=18 && varsta < 65) {
            System.out.println("Esti adult");
        }else if(varsta>=65){
            System.out.println("Esti batran");
        }

    }

    static void ex2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu punctajul testului:");
        int punctaj = scanner.nextInt();

        if(punctaj >= 0 && punctaj<=65){
            System.out.println("Ai picat. Mai incearca");
        } else if (punctaj >=66) {
            System.out.println("Felicitari, Ai trecut");
        }

    }

    static void ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ce zi este astazi");
        int nr = scanner.nextInt();

        if(nr == 0){
            System.out.println("Te rog sa introduci un numar mai mare ca 0");
        } else if (nr == 1) {
            System.out.println("Astazi este luni");
        }else if (nr == 2) {
            System.out.println("Astazi este marti");
        }else if (nr == 3) {
            System.out.println("Astazi este miercuri");
        }else if (nr == 4) {
            System.out.println("Astazi este joi");
        }else if (nr == 5) {
            System.out.println("Astazi este vineri");
        }else if (nr == 6) {
            System.out.println("Astazi este sambata");
        }else if (nr == 7) {
            System.out.println("Astazi este duminica");
        }else if (nr > 7) {
            System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");
        }

    }





}
