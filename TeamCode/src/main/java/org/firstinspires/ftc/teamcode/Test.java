package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Test extends CommandOpMode {
    SubsystemBase claw;
    @Override
    public void initialize() {

        hardwareMap.get(DcMotor.class, "motor").setPower(1);
        hardwareMap.get(Servo.class, "servo").setPosition(0.5);


        claw = new SubsystemBase() {
            private Servo servo;

            {
                servo = hardwareMap.get(Servo.class, "servo");
                setDefaultCommand(new RunCommand(() -> {
                    setPos(0.6);
                }));
            }

            public void setPos(double pos) {
                servo.setPosition(pos);
            }
        };


    }
}
