import java.util.*;
/**
 * Write a description of class Team here.
 * Team class contains all the information on the team playing WC
 * Contains integer and string fields
 * @author (Hasan Rohan Tahsin)
 * @version (3/4/2022)
 */
public class Team
{
    private String teamName;
    private String countryName;
    private int winCount;
    private int drawCount;
    private int defeatCount;
    private int goalDifference;
    private int points;
    private int matchesPlayed;
    
    
    public String getTeamName()
    {
        return teamName;
    }
    
    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }
    
    public String getCountryName()
    {
        return countryName;
    }
    
    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }
    
    public int getWinCount()
    {
        return winCount;
    }
    
    public void setWinCount(int i)
    {
        winCount = i;
    }
    
    public int getDrawCount()
    {
        return drawCount;
    }
    
    public void setDrawCount(int i)
    {
        drawCount = i;
    }
    
    public int getDefeatCount()
    {
        return defeatCount;
    }
    
    public void setdDefeatCount(int i)
    {
        defeatCount = i;
    }
    
    public int getGoalDifference()
    {
        return goalDifference;
    }
    
    public void setGoalDifferenc(int i)
    {
        goalDifference = i;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    
    public int getMatchesPlayed()
    {
        return matchesPlayed;
    }
    
    public void setMatchesPlayed(int i)
    {
        matchesPlayed = i;
    }
    
    public void printDetails()
    {
        
    }
}
