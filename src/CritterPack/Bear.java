package CritterPack;



import java.awt.*;

//Bear class definition. Overrides 3 methods: getMove, getColor, and toString.
public class Bear extends Critter
{

    private boolean polar;//Is this bear black or white
    private boolean SlashOrBack; //Is the critter a slash or a backslash? true == slash


    //          constructor
    //Parameters - polar - is it black or white?
    public Bear()
    {
        this.polar = Math.random() < 0.5D; //Set if it is a polar bear
        SlashOrBack = Math.random() < 0.5D;//50 - 50 chance

    }//end of constructor


    //          getMove -- What move shall this critter make?
    //Parameters - CritterInfo - Passes CritterInfo methods for use within getMove.
    //Returns    - Action - which action shall this critter take?
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

    }//end of getMove

    //          getColor -- Which color shall we print this creature as?
    //Parameters - None
    //Returns    - Color (Should the polar bear be black or white?)
    public Color getColor()
    {
        if (polar)//if white
        {
            return Color.WHITE;
        } else
        {
            return Color.BLACK;
        }
    }//end of getColor

    //          toString -- What string should the creature be printed as?
    //Parameters - None
    //Returns    - String (the string to print as)
    public String toString()
    {
        SlashOrBack = !SlashOrBack;
        if (SlashOrBack)//if a slash
        {
            return "/";
        } else//else, return backslash
        {
            return "\\";
        }//end of if/else
    }//end of toString

}//end of Bear Class