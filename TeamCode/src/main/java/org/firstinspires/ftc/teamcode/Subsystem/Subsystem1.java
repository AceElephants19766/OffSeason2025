package org.firstinspires.ftc.teamcode.Subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Subsystem1 extends SubsystemBase {
    private DcMotor YakovHaMechik;
    public Subsystem1(HardwareMap hardwareMap){
        YakovHaMechik = hardwareMap.get(DcMotor.class,"YakovHaMechik");





    }

    public void setPower(double power){
        YakovHaMechik.setPower(power);






    }





}
