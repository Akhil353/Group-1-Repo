// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import javax.print.attribute.standard.Compression; //ignore for now

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;
//double solenoids mean that you can extend AND retract the solenoid
//this is what the robot uses

public class Intake extends SubsystemBase {
    Compressor Compressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    //calls the compressor (CTRE because the robot uses that)
    
    //this should query the results and status of the compressor
    boolean enabled = Compressor.enabled();
    boolean pressureSwitch = Compressor.getPressureSwitchValue();
    double current = Compressor.getCurrent();

    //creates object for the solenoids and the required channels for extend and retract movement
    DoubleSolenoid DoubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 1, 2);
    

    // DoubleSolenoid.set(kOff);
    // DoubleSolenoid.set(kForward);
    // DoubleSolenoid.set(kReverse);

    /** Creates a new Intake. */
    public Intake() {
        DoubleSolenoid.set(Value.kOff); //starts as off initially
        if ()   
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
