package com.trevor.uhx746_lab3.model;

// import statements
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import android.content.Context;

/**
 * ShowRoom Class
 *  represents a ShowRoom (ArrayList) of Car objects.
 */
public class ShowRoom {
    private ArrayList<Drivable> cars;

    public ShowRoom() {
        this.cars = new ArrayList<>();
    }

    /**
     * loadCars(Context)
     * @param context - given by MainActivity Class
     *                fetches the fileName: "cars.csv"
     *                in the assets folder and reads
     *                each line and creates each Car
     *                object from the input file.
     */
    public void loadCars(Context context) {
        try {
            InputStream inputStream = context.getAssets().open("cars.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5) {
                    String make = data[0].trim();
                    String model = data[1].trim();
                    int year = Integer.parseInt(data[2].trim());
                    String color = data[3].trim();
                    double price = Double.parseDouble(data[4].trim());
                    cars.add(new Car(make, model, year, color, price));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * getCar(int)
     * @param index - Car object within the showRoom ArrayList.
     * @return - gets the car at the given index within the showRoom ArrayList.
     */
    public Drivable getCar(int index) {
        if (index >= 0 && index < cars.size()) {
            return cars.get(index);
        }
        return null;
    }
}
