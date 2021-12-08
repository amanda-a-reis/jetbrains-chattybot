package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        greet("Marvin", "2021"); // change it as you need
        remindName();
        guessAge();
        count();
        test1();
        test2();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Olá, meu nome é " + assistantName + ".");
        System.out.println("Fui criado em " + birthYear + ".");
        System.out.println("Por favor, diga-me seu nome.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("Que nome bacana você tem, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Deixe-me adivinhar sua idade.");
        System.out.println("Entre com os restos da sua idade divido por 3, 5 e 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Sua idade é " + age + "; é uma boa hora para começar a programar!");
    }

    static void count() {
        System.out.println("Agora vou te provar que posso contar até qualquer número!");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test1() {
        System.out.println("Vamos testar seu conhecimento :)");

        System.out.println("Qual a resposta para a vida, o universo e tudo mais?");
        System.out.println("1. Lua de queijo.");
        System.out.println("2.Pombos mutantes.");
        System.out.println("3.As flores de plástico não morrem.");
        System.out.println("4. 42.");
    }

    static void test2() {
        int choice = scanner.nextInt();

        if (choice == 4) {
            System.out.println("Acertooooou!!");
        } else {
            System.out.println("Sinto muito, você ainda não está preparado(a). Tente de novo.");
            test2();
        }

    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
