package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp", group = "TeleOp")
public class TeleOp extends LinearOpMode {

    @Override
    public void runOpMode() {

        waitForStart();

        while(opModeIsActive()) {
            telemetry.addData("Teste", 1);
            telemetry.update();
        }
    }
}
