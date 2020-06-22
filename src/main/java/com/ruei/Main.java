package com.ruei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int CAR_ENTERING = 1;
        final int CAR_LEAVING = 2;
        final int STATUS = 3;
        final int MAX_SPOTS = 20;
        List<Car> cars = new ArrayList<>();

        int fee = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)CAR_ENTERING");
        System.out.println("2)CAR_LEAVING");
        System.out.println("3)STATUS");
        int fun = scanner.nextInt();
        switch(fun){
            case(CAR_ENTERING):

                break;

            case(CAR_LEAVING):

                break;

            case(STATUS):

                break;
        }

    }
}
