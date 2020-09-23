package br.com.unifacisa;

import java.util.Scanner;

public class Keyboard {
    private Scanner input;

    /* Init Keyboard */
    public Keyboard() {
        input = new Scanner(System.in);
    }

    /* Method to return a SOUT */
    public String getSyso(String in) {
        System.out.println(in);
        return in;
    }

    /* Method to return text console */
    public String readText(String mensage) {
        this.getSyso(mensage);
        String text = input.nextLine();
        return text;
    }

    /* Method for return number and apply try/catch */
    public double readNumber(String text) {
        double number = 0;

        while (true) {
            this.getSyso(text);
            try {
                number = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException ex) {
                this.getSyso("Opção inválida");
            }
        }
        return number;
    }

    public String readOption(String text, String validOptions) {
        String option = "";

        while (true) {
            this.getSyso(text);
            option = input.nextLine();
//           ((validOptions.contains(option)) ? break : this.getSyso("Opção inválida");
            if (validOptions.contains(option)) {
                break;
            } else {
                this.getSyso("Opção inválida");
            }
        }
        return option;

    }


}
