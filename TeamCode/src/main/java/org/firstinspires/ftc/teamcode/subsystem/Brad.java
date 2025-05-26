package org.firstinspires.ftc.teamcode.subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Brad extends SubsystemBase {

    public Servo servo;
    public Brad(HardwareMap hardwareMap){
    servo = hardwareMap.get(Servo.class,"brad")
    }
    public void setPosition()
}
