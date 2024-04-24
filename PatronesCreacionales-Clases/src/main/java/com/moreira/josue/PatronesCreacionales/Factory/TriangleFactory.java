package com.moreira.josue.PatronesCreacionales.Factory;

public class TriangleFactory extends FigureFactory{

    @Override
    public Figure createFigure() {
    return new Triangle();
    }
}
