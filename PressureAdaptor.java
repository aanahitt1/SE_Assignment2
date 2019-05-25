package com.company;

import com.company.SensorInterface;
import sensor.PressureSensor;

public class PressureAdaptor implements SensorInterface {
    private static PressureSensor pressure;

    public PressureAdaptor() {
        pressure = new PressureSensor();
    }

    @Override
    public double read() {
        return pressure.readValue();
    }

    @Override
    public String status() {
        return pressure.getReport();
    }

    @Override
    public String sensorType() {
        return pressure.getSensorName();
    }

}
