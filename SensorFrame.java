package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.PAGE_END;

public class SensorFrame extends JFrame {
    public SensorFrame() {
        setTitle("Sensor Tracker");
        setLayout(new GridLayout(3,1));

        JPanel  temperaturePnl = new JPanel();
        temperaturePnl.setBorder(new TitledBorder("Temperature"));
        add(temperaturePnl);
        temperaturePnl.setLayout(new BorderLayout());

        SensorInterface temp = new TemperatureAdaptor();
        Double tvalue = temp.read();
        String tstatus = temp.status();
        JLabel tempTxt = new JLabel(tstatus + " --> " + tvalue);
        temperaturePnl.add(tempTxt, PAGE_END);
        JPanel tBar = new JPanel();
        if(tstatus == "OK") {
            tBar.setBackground(Color.GREEN);
        } else if(tstatus == "Critical") {
            tBar.setBackground(Color.YELLOW);
        } else {
            tBar.setBackground(Color.RED);
        }
        temperaturePnl.add(tBar, CENTER);

        JPanel  pressurePnl = new JPanel();
        pressurePnl.setBorder(new TitledBorder("Pressure"));
        add(pressurePnl);
        pressurePnl.setLayout(new BorderLayout());

        SensorInterface pressure = new PressureAdaptor();
        Double pvalue = pressure.read();
        String pstatus = pressure.status();
        JLabel pressureTxt = new JLabel(pstatus + " --> " + pvalue);
        pressurePnl.add(pressureTxt, PAGE_END);
        JPanel pBar = new JPanel();
        if(pstatus == "OK") {
            pBar.setBackground(Color.GREEN);
        } else if(pstatus == "Critical") {
            pBar.setBackground(Color.YELLOW);
        } else {
            pBar.setBackground(Color.RED);
        }
        pressurePnl.add(pBar, CENTER);

        JPanel  radiationPnl = new JPanel();
        radiationPnl.setBorder(new TitledBorder("Radiation"));
        add(radiationPnl);
        radiationPnl.setLayout(new BorderLayout());

        SensorInterface rad = new RadiationAdaptor();
        Double rvalue = rad.read();
        String rstatus = rad.status();
        JLabel radTxt = new JLabel(rstatus + " --> " + rvalue);
        radiationPnl.add(radTxt, PAGE_END);
        JPanel rBar = new JPanel();
        if(rstatus == "OK") {
            rBar.setBackground(Color.GREEN);
        } else if(rstatus == "Critical") {
            rBar.setBackground(Color.YELLOW);
        } else {
            rBar.setBackground(Color.RED);
        }
        radiationPnl.add(rBar, CENTER);

        setPreferredSize(new Dimension(600,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        SensorFrame app = new SensorFrame();
    }
}
