package com.trevor.uhx746_lab3.model;

/**
 * Drivable Class
 *  simulations of a car (starting, stopping, and driving with a given distance)
 */
public interface Drivable {
    /**
     * start()
     *  simulates a car starting. no usage.
     */
    void start();

    /**
     * stop()
     *  simulates a car stopping. no usage.
     */
    void stop();

    /**
     * drive(double)
     * @param distance
     *  simulates a car driving for a certain distance given by parameter.
     */
    void drive(double distance);
}
