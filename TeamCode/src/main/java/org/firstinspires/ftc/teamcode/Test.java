package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Test extends CommandOpMode {
    @Override
    public void initialize() {
        hardwareMap.get(Servo.class, "servo").setPosition(0.5);
    }
}
