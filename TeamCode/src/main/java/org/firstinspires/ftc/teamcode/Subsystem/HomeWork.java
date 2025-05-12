package org.firstinspires.ftc.teamcode.Subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.Calendar;

public class HomeWork extends SubsystemBase {
    private DcMotor motor1;

    public HomeWork(HardwareMap hardwareMap) {
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    public void setPower(double power) {
        motor1.setPower(power);

    }

    public void stopPower() {
        motor1.setPower(0);

    }

    public double getPower() {
        return motor1.getPower();

    }


}
