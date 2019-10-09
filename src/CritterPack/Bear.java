package CritterPack;
import java.awt.*;

//Bear class definition. Overrides 3 methods: getMove, getColor, and toString.
public class Bear extends Critter {

    private boolean polar;//Is this bear black or white
    private boolean SlashOrBack; //Is the critter a slash or a backslash? true == slash

    //Constructor
    //Parameters:
    //      this.polar - Random boolean value Polar determines bear's color.
    //      SlashorBack - Sets the 50/50 chance.
    public Bear()
    {
        this.polar = Math.random() < 0.5D; // equals true if set as a polar bear.
        SlashOrBack = Math.random() < 0.5D;// 50 - 50 chance

    }

    //getMove: Determines this creature's move.
    //Parameters:
    //      CritterInfo - Passes CritterInfo methods for use within getMove.
    //Returns:
    //      Action methods placed within if/else structure to determine infect, hop, or movement.
    public Action getMove(CritterInfo info)
    {
        if (info.getFront() == Neighbor.OTHER)
        {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY)
        {
            return Action.HOP;
        } else
        {
            return Action.LEFT;
        }

    }

    //getColor: Determines the color of the creature.
    //Parameters: None
    //Returns:
    //      Color - (black or white)
    public Color getColor()
    {
        if (polar)//if white
        {
            return Color.WHITE;
        } else
        {
            return Color.BLACK;
        }
    }

    //toString: Determines the graphical icon to display this creature.
    //Parameters: None
    //Returns:
    //      String depending on bear's type (polar or normal).
    public String toString()
    {
        SlashOrBack = !SlashOrBack;
        if (SlashOrBack) // if a slash
        {
            return "/";
        } else // else, return backslash
        {
            return "\\";
        }
    }

}