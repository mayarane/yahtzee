package edu.gonzaga;

public class TopScorer
{
    private String name;
    private Integer score;

    public TopScorer(String name, Integer score)
    {
        this.name = name;
        this.score = score;
    }

    public String getName()
    {
        return name;
    }

    public void printPlayer()
    {
        System.out.println(this.score + " points " + this.name);
    }
    public Integer getScore()
    {
        return score;
    }

    public int compareTo(TopScorer topScorer)
    {
        return 0;
    }
}
