package CritterPack;

import java.awt.*;
import java.util.Random;

//Lion class definition. Overrides 3 methods: getMove, getColor, and toString.
public class Lion extends Critter
{

    private int colorSwitch;//counter for when to switch colors
    private Color lionColor;//which color am I?

    //Constructor
    //Parameters - None
    public Lion()
    {
        colorSwitch = 0;
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
        } else if (info.getFront() == Neighbor.WALL)
        {
            return Action.LEFT;
        } else if (info.getRight() == Neighbor.WALL)
        {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME)
        {
            return Action.RIGHT;
        } else
        {
            return Action.HOP;
        }
    }

    //getColor: Randomly etermines the color of the creature every 3 rounds.
    //Parameters: None
    //Returns:
    //      Color - Selects Red, Green, or Blue.
    public Color getColor()
    {
        Random rand = new Random();

        if (colorSwitch % 3 == 0)
        {
            int x = 0;
            while (x == 0)
            {
                int i = rand.nextInt(3); // 0 = Red. 1 = Green. 2 = Blue.
                if (i == 0 && this.lionColor != Color.RED)
                {
                    this.lionColor = Color.RED;
                    x++;
                }
                if (i == 1 && lionColor != Color.GREEN)
                {
                    this.lionColor = Color.GREEN;
                    x++;
                }
                if (i == 2 && lionColor != Color.BLUE)
                {
                    this.lionColor = Color.BLUE;
                    x++;
                }
            }

        }
        return lionColor;
    }

    //toString: Determines the graphical icon to display this creature.
    //Parameters: None
    //Returns:
    //      String value "L" to display the creature.
    public String toString()
    {
        return "L";
    }//end of toString

}