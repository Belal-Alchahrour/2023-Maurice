// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Bucket extends SubsystemBase {
  private final CANSparkMax bucketMotor = new CANSparkMax(BUCKET_MOTOR, BUCKET_MOTOR_TYPE);
  /** Creates a new Bucket. */
  public Bucket() {
    bucketMotor.restoreFactoryDefaults();

    // set Smart Current Limits
    // bucketMotor.setSmartCurrentLimit(BUCKET_CURRENT);

    // Set Idle Mode
    bucketMotor.setIdleMode(BUCKET_IDLE_TYPE);
  }

  public void liftUp() {
    bucketMotor.set(BUCKET_SPEED);
  }

  public void liftDown() {
    bucketMotor.set(-BUCKET_SPEED);
  }

  public void stop() {
    bucketMotor.stopMotor();
 }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
