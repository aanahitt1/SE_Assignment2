package com.company;

public interface SensorInterface {

    default double read() {return 0;}

    default String status() {return "";}

    default String sensorType() {return "";}

}
