package Services;

import java.security.SecureRandom;
import java.util.InputMismatchException;
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

        if(letter.equals("n") && upper.equals("n") && number.equals("n") && esp.equals("n")){
            throw new IllegalArgumentException("Nenhuma opção foi selecionada");
        }

        if (letter != "n" || letter != "y" && upper != "n" || upper != "y" && number != "n" || number != "y" && esp != "n" || esp != "y"){
            throw new IllegalArgumentException("Entrada Inválida.");
        }

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

            sc.close();

        System.out.println(result);

        return result;
    }
}
