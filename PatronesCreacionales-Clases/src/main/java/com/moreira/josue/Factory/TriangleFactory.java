package com.moreira.josue.Factory;

public class TriangleFactory extends FigureFactory{

    @Override
    public Figure createFigure() {
    return new Triangle();
    }
}
