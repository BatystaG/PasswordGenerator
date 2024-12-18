package Application;

import Services.PasswordGenerator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de caracteres entre 6-256 para gerar a senha");
        int length = sc.nextInt();

        PasswordGenerator password = new PasswordGenerator();

       password.passwordGenerator(length);

        sc.close();
    }

}
