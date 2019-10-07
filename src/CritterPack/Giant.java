package CritterPack;

import java.awt.*;
import java.util.Random;

//Giant class definition. Overrides 3 methods: getMove, getColor, and toString.
public class Giant extends Critter
{

    private String nameMoves;
    private int moves;//how many moves has the giant made? Every six, switch from fee, fie, foo, or fum

    //          constructor
    //Parameters - None
    public Giant()
    {
        moves = 1;
    }//end of constructor

    //          getMove -- What move shall this critter make?
    //Parameters - CritterInfo - Passes CritterInfo methods for use within getMove.
    //Returns    - Action - which action shall this critter take?
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
    }//getMove end

    //          getColor -- Which color shall we print this creature as?
    //Parameters - None
    //Returns    - Color (The color to print the creature in)
    public Color getColor()
    {
        return Color.GRAY;
    }//getColor end


    //          toString -- What string should the creature be printed as?
    //Parameters - None
    //Returns    - String (the string to print as)
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
    }//end of toString


}//end of Giant Class
