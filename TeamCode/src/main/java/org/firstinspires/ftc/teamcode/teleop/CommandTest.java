package org.firstinspires.ftc.teamcode.teleop;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.subsystem.Brad;
import org.firstinspires.ftc.teamcode.subsystem.Gary;

public class CommandTest extends CommandOpMode {

    public Gary gary;
    public GamepadEx gamepadEx1;

    @Override
    public void initialize() {
        gary = new Gary(hardwareMap);
        gamepadEx1 = new GamepadEx(gamepad1);

        gamepadEx1.getGamepadButton(GamepadKeys.Button.A).whenPressed()
    }

    @Override
    public void run() {
        super.run();

    }
}

