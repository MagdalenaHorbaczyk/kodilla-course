package com.kodilla.collection;

public class Application {
    public static void main(String[] args) {
        StringCollection object = new StringCollection();
        object.addElement("s");
        object.addElement("ss");
        object.addElement("sss");

        System.out.println(object.getElement(0));
        System.out.println(object.getElement(1));
        System.out.println(object.getElement(2));
        System.out.println(object.removeElement(null));
        System.out.println(object.getElement(0));
        System.out.println(object.getElement(1));
        System.out.println(object.getElement(2));
        System.out.println(object.removeElement("ss"));
        System.out.println(object.removeElement("s"));

        System.out.println(object.getElement(0));
        System.out.println(object.getElement(1));

    }
}
