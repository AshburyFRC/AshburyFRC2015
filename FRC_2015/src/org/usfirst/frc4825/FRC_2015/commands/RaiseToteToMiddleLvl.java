package org.usfirst.frc4825.FRC_2015.commands;

import org.usfirst.frc4825.FRC_2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RaiseToteToMiddleLvl extends Command {

    public RaiseToteToMiddleLvl() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.toteLift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Initialize RaiseToteToMiddleLvl");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.toteLift.liftTote();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !Robot.toteLift.getMiddleSwitch();
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("End RaiseToteToMiddleLvl");
    	Robot.toteLift.stopTote();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
