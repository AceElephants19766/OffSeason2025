package org.firstinspires.ftc.teamcode;

import android.util.Range;

import com.arcrobotics.ftclib.command.Command;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.PerpetualCommand;
import com.arcrobotics.ftclib.command.RepeatCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.StartEndCommand;
import com.arcrobotics.ftclib.command.Subsystem;
import com.arcrobotics.ftclib.command.WaitCommand;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.function.Consumer;

@TeleOp
public class Test extends CommandOpMode {

    GamepadEx gamepadEx1;

    DcMotor motor1;
    Servo servo1;
    Subsystem servo;
    Subsystem motor;

    @Override
    public void initialize() {
        gamepadEx1 = new GamepadEx(gamepad1);
        servo1 = hardwareMap.get(Servo.class, "servo1");

        motor1 = hardwareMap.get(DcMotor.class, "motor1");

        gamepadEx1.getGamepadButton(GamepadKeys.Button.A).toggleWhenPressed(
                new RepeatCommand(
                        checkRange(
                                (v) -> motor1.setPower(v),
                                new Range<>(-1.0, 1.0),
                                motor
                        )
                ),
                new InstantCommand(() -> motor1.setPower(0), motor)
        );

        gamepadEx1.getGamepadButton(GamepadKeys.Button.B).toggleWhenPressed(
                new RepeatCommand(
                        checkRange(
                                (v) -> servo1.setPosition(v),
                                new Range<>(0.0, 1.0),
                                servo
                        )
                ),
                new InstantCommand(() -> servo1.setPosition(0.5), servo)
        );

        gamepadEx1.getGamepadButton(GamepadKeys.Button.X).toggleWhenPressed(
                new InstantCommand(() -> servo1.setPosition(1), servo),
                new InstantCommand(() -> servo1.setPosition(0), servo)
        );

    }

    public Command doAndWait1s(Runnable runnable, Subsystem... req) {
        return new InstantCommand(runnable, req).andThen(new WaitCommand(1000));
    }

    public Command checkRange(Consumer<Double> consumer, Range<Double> range, Subsystem... req) {

        double max = range.getUpper();
        double min = range.getLower();
        double mid = (max + min) / 2;

        return new SequentialCommandGroup(
                doAndWait1s(() -> consumer.accept(max), req),
                doAndWait1s(() -> consumer.accept(mid), req),
                doAndWait1s(() -> consumer.accept(min), req),
                doAndWait1s(() -> consumer.accept(mid), req)
        );
    }

}
