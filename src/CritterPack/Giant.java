package CritterPack;

import java.awt.*;
// import java.util.Random;

//Giant class definition. Overrides 3 methods: getMove, getColor, and toString.
public class Giant extends Critter
{
    private int moves;//how many moves has the giant made? Every six, switch from fee, fie, foo, or fum

    //Constructor
    //Parameters: None
    public Giant()
    {
        moves = 1;
    }

    //getMove: Determines this creature's move.
    //Parameters:
    //      CritterInfo - Passes CritterInfo methods for use within getMove.
    //Returns:
    //      Action methods placed within if/else structure to determine infect, hop, and movement.
    public Action getMove(CritterInfo info)
    {
        if (moves == 24)
        {
            moves = 1;
        } else
        {
            moves++;
        }

        if (info.getFront() == Neighbor.OTHER)
        {
            return Action.INFECT;

        } else if (info.getFront() == Neighbor.EMPTY)
        {
            return Action.HOP;

        } else
        {
            return Action.RIGHT;
        }
    }

    //getColor: Determines the color of the creature.
    //Parameters: None
    //Returns:
    //      Color - (black or white)
    public Color getColor()
    {
        return Color.GRAY;
    }


    //toString: Sets Giant's display word to change every six rounds.
    //Parameters - None
    //Returns:
    //      String - "fee" / "fie" / "foe" / "fum" depending on iteration.
    public String toString()
    {
        if (moves <= 6)
        {
            return "fee";
        }
        if (moves <= 12)
        {
            return "fie";
        }
        if (moves <= 18)
        {
            return "foe";
        } else
        {
            return "fum";
        }
    }


}
