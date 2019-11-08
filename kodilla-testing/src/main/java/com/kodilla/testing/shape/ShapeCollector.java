package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> list = new ArrayList<>();
    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {
        list.add(shape);
    }

    public void removeFigure(Shape shape) {
        list.remove(shape);
    }

    public String getFigure(int n) {

        return list.get(n).getShapeName();
    }

    public void showFigures() {
        ArrayList<Shape> list = new ArrayList<>();
        for (Shape value : list) {
            System.out.println(value.getShapeName());
        }
    }

    public int size() {
        return list.size();
    }
}
