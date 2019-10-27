package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("darse khod ra vared konid - 1-riazi1 2-mabani 3-pishrafte");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        riazi1 r = new riazi1();
        mabani m = new mabani();
        pishrafte p = new pishrafte();
        switch (type) {
            case 1:
            System.out.println("riazi 1");
            r.hamniaz();
            r.pishniaz();
            System.out.println("vahed: " + r.vahed());
            break;
            case 2:
            System.out.println("mabani");
            m.hamniaz();
            m.pishniaz();
            System.out.println("vahed: " + m.vahed());
            break;
            case 3:
            System.out.println("pishrafte");
            p.hamniaz();
            p.pishniaz();
            System.out.println("vahed:" + p.vahed());
            break;
        }
    }
}
