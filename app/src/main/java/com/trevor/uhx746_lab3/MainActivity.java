package com.trevor.uhx746_lab3;

// import statements
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// import packages
import com.trevor.uhx746_lab3.model.Car;
import com.trevor.uhx746_lab3.model.Drivable;
import com.trevor.uhx746_lab3.model.ShowRoom;

/**
 * MainActivity Class
 *
 *  launches when the application is run.
 *  shows activity_main.xml screen.
 *
 *  creates a ShowRoom object and loads the cars with the ShowRoom.loadCars(Context) method.
 *
 *  initializes buttons from the .xml and provides their corresponding onClick(View) methods.
 *  btnCar1 displays the first car's information and so on.
 */
public class MainActivity extends AppCompatActivity {

    // ShowRoom object to hold the ArrayList of Car objects
    private ShowRoom showRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create and load cars into the showRoom object
        showRoom = new ShowRoom();
        showRoom.loadCars(this);

        // find btnCar1 in .xml file
        Button btnCar1 = findViewById(R.id.btnCar1);

        // onClick implementation to show Car 1 info
        btnCar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayCarDetails(0);
            }
        });

        // find btnCar2 in .xml file
        Button btnCar2 = findViewById(R.id.btnCar2);

        // onClick implementation to show Car 2 info
        btnCar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayCarDetails(1);
            }
        });

        // find btnCar3 in .xml file
        Button btnCar3 = findViewById(R.id.btnCar3);

        // onClick implementation to show Car 3 info
        btnCar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayCarDetails(2);
            }
        });
    }

    /**
     * displayCarDetails(int)
     * @param index - index in the ArrayList
     *              uses the getCar(int) method to find the car
     *              the user clicks on and displays the given car's
     *              information to the screen through a Toast.
     */
    private void displayCarDetails(int index) {
        Drivable car = showRoom.getCar(index);
        if (car != null) {
            String carDetails = car.toString();
            Toast.makeText(MainActivity.this, carDetails, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Car details not found", Toast.LENGTH_SHORT).show();
        }

    }
}