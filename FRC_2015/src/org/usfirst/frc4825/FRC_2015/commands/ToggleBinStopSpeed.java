package org.usfirst.frc4825.FRC_2015.commands;

import org.usfirst.frc4825.FRC_2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleBinStopSpeed extends Command {

	public ToggleBinStopSpeed() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.binLift);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		System.out.println("Toggling bin stop speed");
		Robot.binLift.toggleStopSpeed();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
