package org.firstinspires.ftc.teamcode.teleop;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystem.Gary;

@TeleOp
public class Test extends CommandOpMode {
    public Gary gary;
    @Override
    public void initialize() {
        gary = new Gary(hardwareMap);

    }

    @Override
    public void run(){
        super.run();
        if (gamepad1.right_stick_y > 0.1)
            gary.setPower(gamepad1.right_stick_y);

        else if (gamepad1.right_stick_y < -0.1)
            gary.setPower(gamepad1.right_stick_y);

        else
            gary.stop();
    }
}
