// FRC2106 Junkyard Dogs - Continuity Base Code - www.team2106.org

package frc.robot.commands.led.deprecated;
import frc.robot.util.LightStrip;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class SetLedRGB extends Command {

  private LightStrip ledStrip;
  private int[] rgb = {0,0,0};

  public SetLedRGB(LightStrip ledStrip, int r, int g, int b) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(ledStrip);
    this.ledStrip = ledStrip;

    rgb[0] = r;
    rgb[1] = g;
    rgb[2] = b;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    ledStrip.setRGB(rgb[0], rgb[1], rgb[2]);
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
