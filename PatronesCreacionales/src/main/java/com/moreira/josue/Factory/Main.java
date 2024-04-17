package com.moreira.josue.Factory;

public class Main {
    public static void main(String[] args) {
        FigureFactory ft = new TriangleFactory();
        ft.createAndDraw();

    }
}
