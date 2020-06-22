package com.ruei;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Testing {
    public static void main(String[] args) {
        File saveFile = new File("20200609.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(saveFile, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car car = new Car("DBD-9487");
        Car truck = new Truck("BG-456");
        System.out.println(truck instanceof Truck);

        try {
            writer.write(car.ID +","+car.Entering+","+car.Leaving);
            writer.write("\n");
            writer.write(truck.ID+","+truck.Entering+","+truck.Leaving);
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
