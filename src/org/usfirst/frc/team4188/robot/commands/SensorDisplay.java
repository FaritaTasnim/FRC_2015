package org.usfirst.frc.team4188.robot.commands;

import org.usfirst.frc.team4188.robot.CorpsLog;
import org.usfirst.frc.team4188.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SensorDisplay extends Command {

    public SensorDisplay() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	CorpsLog.log("Front Right Encoder", Robot.drivetrain.getEncoderFR(), true, false);
//    	CorpsLog.log("Front Left Encoder", Robot.drivetrain.getEncoderFL(), true, false);
//    	CorpsLog.log("Rear Right Encoder", Robot.drivetrain.getEncoderRR(), true, false);
//    	CorpsLog.log("Rear Left Encoder", Robot.drivetrain.getEncoderRL(), true, false);
    	
    	Robot.drivetrain.getEncoderValues();
    	
    	//SmartDashboard.putBoolean("Limit Switch", Robot.drivetrain.getLimSwitch());
    //	SmartDashboard.putNumber("Potentiometer", Robot.drivetrain.getPotentiometerValue());
    	SmartDashboard.putBoolean("Front Lim Switch", Robot.motors.isLim1Hit());
    	SmartDashboard.putBoolean("Claw Grab Lim Switch", Robot.motors.isLim2Hit());
    	SmartDashboard.putBoolean("Claw Drop Lim Switch", Robot.motors.isLim3Hit());
    	SmartDashboard.putBoolean("Bottom Lim Switch", Robot.motors.isLim4Hit());
    	SmartDashboard.putBoolean("Top Lim Switch", Robot.motors.isLim5Hit());
    	SmartDashboard.putBoolean("Claw Grab 2 Lim Switch Switch", Robot.motors.isLim6Hit());
    	
    	if(!Robot.motors.isLim1Hit() && ! Robot.motors.isLim2Hit() && !Robot.motors.isLim6Hit()) Robot.relays.runRelay1Forward();
    	else Robot.relays.stopRelay1();
    	
    	SmartDashboard.putBoolean("Claw Max Close Lim Switch", Robot.motors.getClawCloseLim());
    	SmartDashboard.putBoolean("Claw Max Open Lim Switch", Robot.motors.getClawOpenLim());
    	SmartDashboard.putBoolean("Lift Bottom Lim Switch", Robot.motors.getLiftBottomLim());
    	SmartDashboard.putBoolean("Lift Top Lim Switch", Robot.motors.getLiftTopLim());
    	
    	SmartDashboard.putNumber("Claw Encoder Value", Robot.motors.getEncoderClaw());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
