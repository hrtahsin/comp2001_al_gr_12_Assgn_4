import java.util.ArrayList;
import java.util.*;
/**
 * Class Group represents the groups in the tournament
 * Creating a public class group
 * integer field for group number
 * An arraylist of type Team contains the teamlist field
 *
 * @author (Hasan Rohan Tahsin)
 * @version (31/03/2022)
 */
public class Group
{
    private int groupNumber;
    private ArrayList<Team> teamList;
    
    /** Constructor method */
    
    public Group(int groupNumber, ArrayList<Team> teamList)
    {
       this.groupNumber = groupNumber;
       this.teamList = teamList;
    }
    
    /**getter method for group number*/
    public int getGroupNumber()
    {
        return groupNumber;
    }
    
    /** setter for group number */
    public void setGroupNumber(int groupNumber)
    {
        this.groupNumber = groupNumber;
    }
    
    /**getter for teamlist */
    public ArrayList<Team> getTeamList()
    {
        return teamList;
    }
    
    /** setter for teamlist */
    public void setTeamList(ArrayList<Team> teamList)
    {
        this.teamList = teamList;
    }
    
    public void groupChampion()
    {
        
    }
    
}



