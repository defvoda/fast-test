package com.example.fasttest.controller.model;

public class ButtonModel {
    public String ruPress;
    public String ruShiftPress;
    public String enPress;
    public String enShiftPress;
    public int positionX; //используется график функций https://www.google.com/search?q=%D0%B3%D1%80%D0%B0%D1%84%D0%B8%D0%BA+%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%B8&tbm=isch&chips=q:%D0%B3%D1%80%D0%B0%D1%84%D0%B8%D0%BA+%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%B8,g_1:%D0%BF%D1%83%D1%81%D1%82%D0%BE%D0%B9:6C3m19jGSt4%3D&hl=ru&sa=X&ved=2ahUKEwiQ_dK0w7SEAxXJGBAIHXFNAeYQ4lYoA3oECAEQNQ&biw=1663&bih=881#imgrc=vmpzPdZ18yfpBM
    public int positionY;


    public ButtonModel(String ruPress, String ruShiftPress, String enPress, String enShiftPress, int positionX, int positionY) {
        this.ruPress = ruPress;
        this.ruShiftPress = ruShiftPress;
        this.enPress = enPress;
        this.enShiftPress = enShiftPress;
        this.positionX = positionX;
        this.positionY = positionY;


    }

    public void fullPrintInfo() {
        System.out.println("X: " + positionX);
        System.out.println("Y: " + positionY);
        System.out.println("РУ: " + ruPress);
        System.out.println("РУ + Shift: " + ruShiftPress);
        System.out.println("EN: " + enPress);
        System.out.println("EN + Shift: " + enShiftPress);
        System.out.println("------------------");

    }

    public void ruPrintInfo() {

        System.out.println("РУ: " + ruPress);
        System.out.println("------------------");
    }

    public void ruShiftPrintInfo() {

        System.out.println("РУ + Shift: " + ruShiftPress);
        System.out.println("------------------");
    }

    public void enPrintInfo() {

        System.out.println("EN: " + enPress);
        System.out.println("------------------");
    }

    public void enShiftPrintInfo() {

        System.out.println("EN + Shift: " + enShiftPress);
        System.out.println("------------------");
    }
}
