package Application;

import Services.PasswordGenerator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de caracteres desejado para gerar a senha");
        int lenght = sc.nextInt();

        PasswordGenerator password = new PasswordGenerator();

       password.passwordGenerator(lenght);

        sc.close();
    }

}
