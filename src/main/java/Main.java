

import java.util.Scanner;
import com.example.fasttest.controller.buttons.Buttons;
import model.CheckValue;

public class Main {

    public static void main(String[] args) {

        Buttons buttons = new Buttons();
        CheckValue checkValue = new CheckValue();

        for (; ; ) {
            System.out.println("Жду ввод:");

            Scanner scanner = new Scanner(System.in);
            String enteredSymbol = scanner.nextLine();

            var i = 0;

            while (i < 114) {

                if (enteredSymbol.equals(buttons.button[i].ruPress)) {
                    buttons.button[i].ruPrintInfo();
                    break;

                } else if (enteredSymbol.equals(buttons.button[i].ruShiftPress)) {
                    buttons.button[i].ruShiftPrintInfo();
                    break;

                } else if (enteredSymbol.equals(buttons.button[i].enPress)) {
                    buttons.button[i].enPrintInfo();
                    break;

                } else if (enteredSymbol.equals(buttons.button[i].enShiftPress)) {
                    buttons.button[i].enShiftPrintInfo();
                    break;
                }

                i++;
            }


        }

    }
}



