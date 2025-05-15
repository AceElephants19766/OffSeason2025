package org.firstinspires.ftc.teamcode.subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SubsystemTest1 extends SubsystemBase {
    private DcMotor motor1;

    public SubsystemTest1(HardwareMap hardwareMap){
        motor1 = hardwareMap.get(DcMotor.class,"motor1");
        motor1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void setPower(double power){
        motor1.setPower(power);

    }



}
