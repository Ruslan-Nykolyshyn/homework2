package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Vvedit kilkist elementiv ");
        int num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Vvedit chuslo  ");
        for (int i = 0; i < num; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Vvedit chuslo v zvorotnyomu poryadku ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);

        }
    }
}
