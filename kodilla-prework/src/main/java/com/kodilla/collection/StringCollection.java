package com.kodilla.collection;

public class StringCollection {
    private Element collectionHead = null;

    public void addElement(String s) {
        Element element = new Element(s);
        if (collectionHead == null) {
            collectionHead = element;
        } else {
            Element temp = collectionHead;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(element);
            element.setPrev(temp);
        }
    }

    public String getElement(int n) {
        if (n == 0) {
            return collectionHead.getValue();
        } else {
            Element temp = collectionHead;
            int counter = 0;

            while (counter < n) {
                temp = temp.getNext();
                counter++;
            }
            return temp.getValue();
        }
    }

    public boolean removeElement(String s) {
        Element element = new Element(s);
/*
        Element temp = element;
*/

        if (s == null) {
            return false;
        } else {
         /*   if (element == temp) {
                temp = temp.getNext();
            } else {
                collectionHead.setNext(element.getNext());
            }*/
            if (collectionHead == element) {
/*
             collectionHead = null;
*/
                Element temp = collectionHead;

/*
                element.getPrev().setNext(element.getNext());
                element.getNext().setPrev(element.getPrev());
            *//* element.setNext(null);
             element.setPrev(null);*/
                Element prev = element.getPrev();
                Element next = element.getNext();
                if (prev == null) {
                    collectionHead = next;
                } else {
                    prev.setNext(next);
                }
                if (next == null) {
                    temp = prev;
                } else {
                    next.setPrev(prev);
                }
            }
            return true;

        }
    }
}
