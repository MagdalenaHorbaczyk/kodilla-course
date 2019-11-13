package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private Shape shape;

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        return 500;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(shape, triangle.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape);
    }
}
