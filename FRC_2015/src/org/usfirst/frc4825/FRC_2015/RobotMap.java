// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc4825.FRC_2015;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static SpeedController driveTrainLeftSpeedController;
	public static SpeedController driveTrainRightSpeedController;
	public static RobotDrive driveTrainRobotDrive21;
	public static DigitalInput driveTrainDriveSwitch;
	public static Encoder driveTrainEncoder;
	public static Gyro driveTrainGyro;
	public static SpeedController toteLiftMotor;
	public static DigitalInput toteLiftBottomSwitch;
	public static DigitalInput toteLiftUpperSwitch;
	public static DigitalInput toteLiftMiddleSwitch;
	public static SpeedController binLiftMotor;
	public static DigitalInput binLiftBottomSwitch;
	public static DigitalInput binLiftUpperSwitch;
	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static CameraServer server;

	public static void init() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		driveTrainLeftSpeedController = new Talon(0);
		LiveWindow.addActuator("Drive Train", "Left Speed Controller",
				(Talon) driveTrainLeftSpeedController);

		driveTrainRightSpeedController = new Talon(1);
		LiveWindow.addActuator("Drive Train", "Right Speed Controller",
				(Talon) driveTrainRightSpeedController);

		driveTrainRobotDrive21 = new RobotDrive(driveTrainLeftSpeedController,
				driveTrainRightSpeedController);

		driveTrainRobotDrive21.setSafetyEnabled(true);
		driveTrainRobotDrive21.setExpiration(0.1);
		driveTrainRobotDrive21.setSensitivity(0.5);
		driveTrainRobotDrive21.setMaxOutput(1.0);

		driveTrainDriveSwitch = new DigitalInput(0);
		LiveWindow.addSensor("Drive Train", "Drive Switch",
				driveTrainDriveSwitch);

		driveTrainEncoder = new Encoder(1, 2, false, EncodingType.k4X);
		LiveWindow.addSensor("Drive Train", "Encoder", driveTrainEncoder);
		driveTrainEncoder.setDistancePerPulse(1.0);
		driveTrainEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
		driveTrainGyro = new Gyro(0);
		LiveWindow.addSensor("Drive Train", "Gyro", driveTrainGyro);
		driveTrainGyro.setSensitivity(0.007);
		toteLiftMotor = new Talon(2);
		LiveWindow.addActuator("Tote Lift", "Motor", (Talon) toteLiftMotor);

		toteLiftBottomSwitch = new DigitalInput(3);
		LiveWindow
				.addSensor("Tote Lift", "Bottom Switch", toteLiftBottomSwitch);

		toteLiftUpperSwitch = new DigitalInput(4);
		LiveWindow.addSensor("Tote Lift", "Upper Switch", toteLiftUpperSwitch);

		toteLiftMiddleSwitch = new DigitalInput(5);
		LiveWindow
				.addSensor("Tote Lift", "Middle Switch", toteLiftMiddleSwitch);

		binLiftMotor = new Talon(3);
		LiveWindow.addActuator("Bin Lift", "Motor", (Talon) binLiftMotor);

		binLiftBottomSwitch = new DigitalInput(6);
		LiveWindow.addSensor("Bin Lift", "Bottom Switch", binLiftBottomSwitch);

		binLiftUpperSwitch = new DigitalInput(7);
		LiveWindow.addSensor("Bin Lift", "Upper Switch", binLiftUpperSwitch);

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		server = CameraServer.getInstance();
		server.setQuality(50);
		// the camera name (ex "cam0") can be found through the roborio web
		// interface
		server.startAutomaticCapture("cam0");
	}
}