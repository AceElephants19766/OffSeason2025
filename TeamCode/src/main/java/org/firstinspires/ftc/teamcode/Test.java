package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.internal.camera.delegating.DelegatingCaptureSequence;

@TeleOp
public class Test extends CommandOpMode {
    public CRServo servo;
    public DcMotor motor;
    @Override
    public void initialize() {
       motor  = hardwareMap.get(DcMotor.class, "motor");
       motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
       servo = hardwareMap. get(CRServo.class,"servo");
    }

    @Override
    public void run() {
        super.run();

        if(gamepad1.left_stick_y > 0.1) {
            motor.setPower(gamepad1.left_stick_y);
            if (motor.getPower() ==1)
                servo.setPower(gamepad1.left_stick_y);

        }


        else if (gamepad1.left_stick_y < -0.1) {
            motor.setPower(gamepad1.left_stick_y);
            if (motor.getPower()==-1)
                servo.setPower(gamepad1.left_stick_y);
        }
        else{
            motor.setPower(0);
            servo.setPower(0);
        }

    }
}
