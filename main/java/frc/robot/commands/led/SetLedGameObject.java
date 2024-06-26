// FRC2106 Junkyard Dogs - Continuity Base Code - www.team2106.org

package frc.robot.commands.led;
import frc.robot.util.Leds;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class SetLedGameObject extends Command {

  private Leds leds;
  private boolean isCone;

  public SetLedGameObject(Leds leds, boolean isCone) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(leds);
    this.isCone = isCone;
    this.leds = leds;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    leds.setGameObject(isCone);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
