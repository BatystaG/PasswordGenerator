package Services;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public PasswordGenerator(){
    }

    public String randomLetters(String base){
        StringBuilder sb = new StringBuilder(base);
        String normalChar = "abcdefghijklmnopqrstuvwxyz";
        SecureRandom nc = new SecureRandom();

        int index = nc.nextInt(normalChar.length());

        sb.append(normalChar.charAt(index));

        return base = sb.toString();
    }

    public String randomUpper(String base){
        StringBuilder sb = new StringBuilder(base);
        String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SecureRandom nc = new SecureRandom();

        int index = nc.nextInt(upperChar.length());

        sb.append(upperChar.charAt(index));

        return base = sb.toString();
    }

    public String randomNum(String base){
        StringBuilder sb = new StringBuilder(base);
        String numChar = "0123456789";
        SecureRandom nc = new SecureRandom();

        int index = nc.nextInt(numChar.length());

        sb.append(numChar.charAt(index));

        return base = sb.toString();
    }

    public String randomEsp(String base){
        StringBuilder sb = new StringBuilder(base);
        String espChar = "!@#$%&*";
        SecureRandom nc = new SecureRandom();

        int index = nc.nextInt(espChar.length());

        sb.append(espChar.charAt(index));

        return base = sb.toString();
    }

    //Decide a ordem de randomização
    public String randomOrder(String base, int range){
        Random rd = new Random();

        int rn = rd.nextInt(range) + 1;

        switch (rn){
            case 1:



        }

        return null;
    }

    public String passwordGenerator(int lenght){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        String result = "";

        System.out.println("Deseja que a senha possua letras? (y/n)");
        String letter = sc.nextLine();
        System.out.println("Deseja que a senha possua letras maiúsculas? (y/n)");
        String upper = sc.nextLine();
        System.out.println("Deseja que a senha possua números? (y/n)");
        String number = sc.nextLine();
        System.out.println("Deseja que a senha possua caracteres especiais? (y/n)");
        String esp = sc.nextLine();

        for (int i = 0; i < lenght; i++){
            if (letter.equals("y")){
                result = randomLetters(result);
            }
            if(upper.equals("y")){
               result = randomUpper(result);
            }
            if(number.equals("y")){
               result = randomNum(result);
            }
            if(esp.equals("y")){
               result = randomEsp(result);
            }
        }

        System.out.println(result);

        sc.close();

        return result;
    }
}
