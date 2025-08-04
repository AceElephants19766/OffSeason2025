package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class CheckServo extends CommandOpMode {

    private Servo servo;

    @Override
    public void initialize() {
        servo = hardwareMap.get(Servo.class, "servo1");

    }
}
