package com.company;

import com.company.SensorInterface;
import sensor.RadiationSensor;

public class RadiationAdaptor implements SensorInterface {
    private static RadiationSensor rad;

    public RadiationAdaptor() {
        rad = new RadiationSensor();
    }

    @Override
    public double read() {
        return rad.getRadiationValue();
    }

    @Override
    public String status() {
        return rad.getStatusInfo();
    }

    @Override
    public String sensorType() {
        return rad.getName();
    }
}
