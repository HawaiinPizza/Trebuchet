/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robt extends TimedRobot
{
        public static Drivetrain drivetrain;
        public static OI oi;
        /**
         * This function is run when the robot is first started up and should be
         * used for any initialization code.
         */
        @Override
        public void robotInit()
        {
                drivetrain = new Drivetrain();
                oi = new OI();
        }
        /**
         * This function is called every robot packet, no matter the mode. Use
         * this for items like diagnostics that you want ran during disabled,
         * autonomous, teleoperated and test.
         *
         * <p>This runs after the mode specific periodic functions, but before
         * LiveWindow and SmartDashboard integrated updating.
         */
        @Override
        public void robotPeriodic()
        {
        }
        @Override
        public void autonomousInit()
        {
        }
        /**
         * This function is called periodically during autonomous.
         */
        @Override
        public void autonomousPeriodic()
        {
        }
        /**
         * This function is called periodically during operator control.
         */
        @Override
        public void teleopPeriodic()
        {
        }
        /**
         * This function is called periodically during test mode.
         */
        @Override
        public void testPeriodic()
        {
        }
}
