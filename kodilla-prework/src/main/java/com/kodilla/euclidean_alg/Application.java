package com.kodilla.euclidean_alg;

public class Application {
    public static void main(String[] args){

        int a = 40;
        int b = 12;
        String c = "NWD(" + a + "," + b + "): ";

        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        System.out.println(c + a);
    }
}
