package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Test extends CommandOpMode {

    DcMotor motor1;
    Servo ori1;


    @Override
    public void initialize() {
        motor1 = hardwareMap.get(DcMotor.class, "ori1");
        ori1 = hardwareMap.get(Servo.class, "ori0");
    }

    @Override
    public void run() {
        motor1.setPower(1);
        ori1.setPosition(1);

    }
}
