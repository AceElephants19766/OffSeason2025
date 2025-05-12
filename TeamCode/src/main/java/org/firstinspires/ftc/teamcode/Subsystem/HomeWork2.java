package org.firstinspires.ftc.teamcode.Subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.Calendar;

public class HomeWork2 extends SubsystemBase {
    private Servo servo1;

    public HomeWork2(HardwareMap hardwareMap) {
        servo1 = hardwareMap.get(Servo.class, "servo1");

    }

    public void setPosition(double position) {
        servo1.setPosition(position);

    }


}
