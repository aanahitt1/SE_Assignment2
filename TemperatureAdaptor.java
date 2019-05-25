package com.company;

import sensor.TemperatureSensor;

public class TemperatureAdaptor implements SensorInterface {
    private static TemperatureSensor temp;

    public TemperatureAdaptor() {
        temp = new TemperatureSensor();
    }

    @Override
    public double read() {
        return temp.senseTemperature();
    }

    @Override
    public String status() {
        return temp.getTempReport();
    }

    @Override
    public String sensorType() {
        return temp.getSensorType();
    }
}
