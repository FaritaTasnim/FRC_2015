package org.usfirst.frc.team4188.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GoRightGoForwardAutonomous extends CommandGroup {
    
    public  GoRightGoForwardAutonomous() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addSequential(new GarbageCanLift ());
    	addSequential(new AutoDrive(2000, 0.8, 3)); //move right till in front of the yellow tote.
    	//addSequential(new AutoDrive(6500, -0.8, 1)); //move forward till inside the zone
    	addSequential(new AutoDrive(5000,0.8, AutoDrive.MOVE_FORWARD)); // confused here what is the difference between AutoDrive.moveforward and 1??? Why two different codes to do the same task.
    	
    }
}