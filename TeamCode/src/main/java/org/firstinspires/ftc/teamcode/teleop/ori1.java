package org.firstinspires.ftc.teamcode.teleop;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystem.Ori;

@TeleOp
public class ori1 extends CommandOpMode {
    public Ori motar1;

    @Override
    public void initialize() {
        motar1 = new Ori(hardwareMap);

    }

    @Override
    public void run() {
        super.run();
        motar1.setPower(0.75);

    }
}
