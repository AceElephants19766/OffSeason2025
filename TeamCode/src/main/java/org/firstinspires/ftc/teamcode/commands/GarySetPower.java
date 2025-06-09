package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.subsystem.Gary;

public class GarySetPower extends CommandBase {
    Gary gary;
    double power;
    public GarySetPower(Gary gary, double power) {
        this.gary = gary;
        this.power = power;
        addRequirements(gary);
    }

    @Override
    public void initialize() {
        gary.setPower(power);
    }

    @Override
    public void execute() {

    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end(boolean interrupted) {

    }
}
