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
    private int scoredGoalCounts;
    private int conceivedGoalCounts;
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
    
    public void setDefeatCount(int i)
    {
        defeatCount = i;
    }
    
    public int getScoredGoalCounts()
    {
        return scoredGoalCounts;
    }
    
    public void setScoredGoalCounts(int i)
    {
        scoredGoalCounts += i;
    }
    
    public int getConceivedGoalCounts()
    {
        return conceivedGoalCounts;
    }
    
    public void setConceivedGoalCounts(int i)
    {
        conceivedGoalCounts += i;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public void setPoints(int i)
    {
        this.points += i;
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
