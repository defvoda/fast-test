package model;


import com.example.fasttest.controller.buttons.Buttons;

public class CheckValue {

    Buttons buttons = new Buttons();

    public void allInfo() {

        var i = 0;

        while (i < 115) {

            buttons.button[i].fullPrintInfo();

            i++;
        }

    }

/*
public void getInfo() {

        var i = 0;

        while (i < 115) {

            if (enteredButton.equals(Buttons.button[i].ruPress)) {
                Buttons.button[i].ruPrintInfo();

            } else if
            (enteredButton.equals(Buttons.button[i].ruShiftPress)) {
                Buttons.button[i].ruShiftPrintInfo();

            } else if
            (enteredButton.equals(Buttons.button[i].enPress)) {
                Buttons.button[i].enPrintInfo();

            } else if
            (enteredButton.equals(Buttons.button[i].enShiftPress));
                Buttons.button[i].enShiftPrintInfo();
                i++;
        }
        }
*/



}
