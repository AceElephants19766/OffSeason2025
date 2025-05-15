package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.command.old.Subsystem;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Commands.TestCommand1;
import org.firstinspires.ftc.teamcode.subsystem.SubsystemTest1;

@TeleOp
public class Test extends CommandOpMode {
    public SubsystemTest1 subsystemTest1;
    public GamepadEx gamepadEx1;

    @Override
    public void initialize() {
        gamepadEx1 = new GamepadEx(gamepad1);

        subsystemTest1 = new SubsystemTest1(hardwareMap);

        gamepadEx1.getGamepadButton(GamepadKeys.Button.LEFT_STICK_BUTTON).whileActiveContinuous(
                new TestCommand1(subsystemTest1, 1)
        );


    }

}
