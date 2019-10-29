package com.kodilla.companies;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for (int n = 0; n < companies.size(); n++) {
            if (n == companies.size() - 1) {
                System.out.print(companies.get(n));
            } else {
                System.out.print(companies.get(n) + ", ");
            }
        }
    }
}
