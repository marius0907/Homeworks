package homework5;

import java.util.Scanner;

public class Exercitii {

    public static void main(String[] args) {
//        ex1();
//        ex2V1() ;
        ex2V2() ;
    }

static void ex1(){
    Scanner scanner = new Scanner(System.in);
    int attempts = 3;
    String user;
    String password;
    do{
        System.out.print("Enter a user: ");
        user = scanner.nextLine();
        System.out.print("Enter a password: ");
        password = scanner.nextLine();
        if (user.equals("TestUser") && password.equals("1234")){
            System.out.println("Login Sucessful");
            break ;
        }else if(attempts > 1) {
            attempts-- ;
            System.out.println("Login Error");
        }else{
            System.out.println("Maximum attempts reached. User blocked");
            break;
        };
    }while(attempts>0);

};

    static void ex2V1(){
        Scanner scanner = new Scanner(System.in);
        int nr ;
        System.out.println("Introdu un numar: ");
        nr = scanner.nextInt();
        int nrF1= 0 ;
        int nrF2= 1 ;
        int tmp ;
        System.out.print("Seria Fibonacci pentru "+ nr+ " numere:0 1 ");
        for(int i = 1; i < nr-1; i++){
            System.out.print(nrF1 + nrF2 + " ");
            tmp = nrF2;
            nrF2 = nrF2 + nrF1 ;
            nrF1 = tmp;
        }
    }

    static void ex2V2(){
        Scanner scanner = new Scanner(System.in);
        int nr ;
        System.out.println("Introdu un numar: ");
        nr = scanner.nextInt();
        int nrF1= 0 ;
        int nrF2= 1 ;
        int tmp ;
        System.out.print("Seria Fibonacci pentru "+ nr+ " numere:0 1 ");
        int i = 1;
        while(i< nr-1){
            System.out.print(nrF1 + nrF2 + " ");
            tmp = nrF2;
            nrF2 = nrF2 + nrF1 ;
            nrF1 = tmp;
            i++ ;
        };
    }

}
