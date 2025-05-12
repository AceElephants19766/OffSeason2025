package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Test extends CommandOpMode {
    @Override
    public void initialize() {
        hardwareMap.get(DcMotor.class, "motor").setPower(1);
        hardwareMap.get(Servo.class, "servo").setPosition(0.5);
    }
}
