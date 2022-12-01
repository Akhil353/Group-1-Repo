// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import com.revrobotics.CANSparkMax;
//double solenoids mean that you can extend AND retract the solenoid
//this is what the robot uses
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Intake extends SubsystemBase {
    private Compressor Compressor = new Compressor(Constants.compressor, PneumaticsModuleType.CTREPCM);
    // calls the compressor (CTRE because the robot uses that)
    
    // this should query the results and status of the compressor
    // boolean enabled = Compressor.enabled();
    // boolean pressureSwitch = Compressor.getPressureSwitchValue();
    // double current = Compressor.getCurrent();

    //creates object for the solenoids and the required channels for extend and retract movement
    //two objects since two different solenoids
    private DoubleSolenoid DoubleSolenoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.forwardChannel, Constants.reverseChannel);
    private DoubleSolenoid DoubleSolenoid2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.forwardChannel, Constants.reverseChannel);
    

    private CANSparkMax neoMotor = new CANSparkMax(Constants.neo_motor, MotorType.kBrushless);
    //default solenoid state for both solenoids
    public Intake () {
        DoubleSolenoid1.set(Value.kOff);
        DoubleSolenoid2.set(Value.kOff);
    }

    //extend and retract functions for both solenoids
    public void intakeExtend() { //function to extend the solenoids
        DoubleSolenoid1.set(Value.kForward);
        DoubleSolenoid2.set(Value.kForward);
        //add neomotor code here
    }

    public void intakeRetract() { //function to retract the solenoids
        DoubleSolenoid1.set(Value.kReverse);
        DoubleSolenoid2.set(Value.kReverse);
    }

    public void motor() {
        
    }


    @Override
    public void periodic() {
        Compressor.enableDigital();
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
