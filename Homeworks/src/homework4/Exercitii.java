package homework4;

import java.util.Scanner;

public class Exercitii {

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
        ex5();
    }

    static void ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu valoarea facturii:");
        int factura = scanner.nextInt();
        double rezultat = 0 ;
        if(factura > 100){
            rezultat = factura - factura*0.1 ;
        }else if(factura < 100){
            rezultat = factura - factura*0.05 ;
        };

        System.out.println("Rezultatul este: " + rezultat);
    };

    static void ex2(){
        int comision;
        int vanzari = 3500;
        if(vanzari > 2500){
            comision= vanzari*5/100;
        }else{
            comision=0;
        };
        System.out.println("Comisionul tau este: " + comision);

    };

    static void ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu rezultatul: ");
        int punctaj = scanner.nextInt();
        String msg = punctaj >= 90 ? "Ai primit : FoarteBine":(punctaj >= 80) ? "Ai primit : Bine":"Ai primit : Suficient";
        System.out.println(msg);

    };

    static void ex4(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nr=0;
        for (int i = 1; i<=10; i++){
            System.out.println("Please enter number "+i+":");
            nr = scanner.nextInt();
            sum = sum + nr;
        };
        System.out.println("The sum of the numbers is:"+ sum);

    };

    static void ex5(){
        Scanner scanner = new Scanner(System.in);
        int nr;
        System.out.println("Please enter number:");
        nr = scanner.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(nr+ "*"+ i + " =" + nr*i);
        };
    }



}
