import java.util.Date;
import java.util.Random;
import java.util.*;
/**
 * Write a description of class Match here.
 * Match class contains informations on each match played
 * works as a helper class
 * @author (Hasan Rohan Tahsin)
 * @version (4/3/2022)
 */
public class Match
{
    private Team teamA;
    private Team teamB;
    private int teamAScore;
    private int teamBScore;
    private Date date;
    public static final int MAX_GOALS = 4;
    private Random randomizer;
    
    public Match(){
        randomizer = new Random();
        
    }
    
    public Team getTeamA()
    {
        return teamA;
    }
    
    public Team getTeamB()
    {
        return teamB;
    }
    
    public int getTeamAScore()
    {
        return teamAScore;
    }
    
    public int getTeamBScore()
    {
        return teamBScore;
    }
    
    public Date getDate()
    {
        return date;
    }
    
    public void setTeamA(Team teamA)
    {
        this.teamA = teamA;
    }
    
    public void setTeamB(Team teamB)
    {
        this.teamB = teamB;
    }
    
    public void setTeamAScore(int i)
    {
      this.teamA = teamA;  
    }
    
    public void setTeamBScore(int i)
    {
        this.teamB = teamB;
    }
    
    public void matchWinner(Team teamA, Team teamB, Team matchWinner)
    {
        int teamAScore = randomizer.nextInt(MAX_GOALS) + 1;
        int teamBScore = randomizer.nextInt(MAX_GOALS)+ 1;
        setTeamAScore(teamAScore);
        setTeamBScore(teamBScore);
        
        if (teamAScore > teamBScore) 
        {
            Team matchwinner = teamA;
        }
        else if (teamAScore < teamBScore)
        {
            Team matchwinner = teamB;
        }
        else
        {
            System.out.println("Tie game");
        }
          
    }
    
    public void goalCount()
    {
        
    }
    
    public void knockOut()
    {
        
    }
}
