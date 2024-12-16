package Services;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public PasswordGenerator(){
    }

    public String passwordGenerator(int lenght){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String result = "";

        String normalChar = "abcdefghijklmnopqrstuvwxyz";
        String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numChar = "0123456789";
        String espChar = "!@#$%&*";

        System.out.println("Deseja que a senha possua letras? (y/n)");
        String letter = sc.nextLine();
        System.out.println("Deseja que a senha possua letras maiúsculas? (y/n)");
        String upper = sc.nextLine();
        System.out.println("Deseja que a senha possua números? (y/n)");
        String number = sc.nextLine();
        System.out.println("Deseja que a senha possua caracteres especiais? (y/n)");
        String esp = sc.nextLine();

        if (letter.equals("y") && upper.equals("Y") && number.equals("y") && esp.equals("y")){
            for (int i = 0; i < lenght; i++){

            }
        }





        sc.close();

        return result;
    }
}
