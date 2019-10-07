package CritterPack;

import java.awt.*;
import java.util.Random;

//Lion class definition. Overrides 3 methods: getMove, getColor, and toString.
public class Lion extends Critter
{

    private int colorSwitch;//counter for when to switch colors
    private Color lionColor;//which color am I?

    //          constructor
    //Parameters - None
    public Lion()
    {
        colorSwitch = 0;
    }//end of constructor

    //          getMove -- What move shall this critter make?
    //Parameters - CritterInfo - Passes CritterInfo methods for use within getMove.
    //Returns    - Action - which action shall this critter take?
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
    }//end of getMove

    //          getColor -- Which color shall we print this creature as?
    //Parameters - None
    //Returns    - Color (The color to print the creature in)
    public Color getColor()
    {

        Random rand = new Random();


        if (colorSwitch % 3 == 0)
        { // set new color
            int x = 0;
            while (x == 0)
            {
                int i = rand.nextInt(3); //0.Red 1.Green 2.Black
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
    }//end of getColor

    //          toString -- What string should the creature be printed as?
    //Parameters - None
    //Returns    - String (the string to print as)
    public String toString()
    {
        return "L";
    }//end of toString

}//end of Lion Class