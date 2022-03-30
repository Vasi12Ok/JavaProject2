package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercitiu8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(0.0254);
        double inch = input.nextDouble();

        double meter = inch * 0.0254;

        System.out.printf("%.1f inch is %.1f meters", inch, meter);


    }
}
