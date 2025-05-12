package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystem.HomeWork;
import org.firstinspires.ftc.teamcode.Subsystem.HomeWork2;

@TeleOp
public class Test extends CommandOpMode {
    public HomeWork homeWork;
    public HomeWork2 homeWork2;

    @Override
    public void initialize() {
        homeWork = new HomeWork(hardwareMap);
        homeWork2 = new HomeWork2(hardwareMap);



    }

    @Override
    public void run() {
        super.run();
        if (gamepad1.right_stick_x > 0.1 || gamepad1.right_stick_x < -0.1)
            homeWork.setPower(gamepad1.right_stick_x);
        else homeWork.stopPower();

        if (homeWork.getPower() == 1) {
            homeWork2.setPosition(0);
        } else if (homeWork.getPower() == -1) {
            homeWork2.setPosition(1);
        }else
            homeWork2.setPosition(0.5);


    }




}
