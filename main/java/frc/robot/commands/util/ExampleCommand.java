// FRC2106 Junkyard Dogs - Continuity Base Code - www.team2106.org

package frc.robot.commands.util;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class ExampleCommand extends Command {

  public ExampleCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
