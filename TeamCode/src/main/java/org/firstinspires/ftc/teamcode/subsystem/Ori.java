package org.firstinspires.ftc.teamcode.subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Ori extends SubsystemBase {
    private DcMotor motor1;
    public Ori(HardwareMap hardwareMap){
        motor1 = hardwareMap.get(DcMotor.class, "motor1");


    }
    public void setPower(double power ){
        motor1.setPower(power);


    }
    public void stop(){motor1.setPower(0);};

    }


