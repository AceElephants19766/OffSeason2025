package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystem.SubsystemTest1;
public class TestCommand1 extends CommandBase {

    private SubsystemTest1 subsystemTest1;

    private double power;

    public TestCommand1(SubsystemTest1 subsystemTest1, double power) {
        this.subsystemTest1 = subsystemTest1; //לשאול את נבו
        this.power = power;
        addRequirements(subsystemTest1); //לשאול את נבו

    }

    @Override
    public void initialize() {
        subsystemTest1.setPower(power);

    }

    @Override
    public boolean isFinished() {
        return false;

    }

    @Override
    public void end(boolean interrupted) {
        subsystemTest1.setPower(0);

    }

}
