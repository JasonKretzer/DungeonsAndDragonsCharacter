package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Wisdom extends AbilityScore 
{
    public Wisdom(int score)
    {
        super(Score.WISDOM, score);
    }

    @Override
    public String toString()
    {
        return "Wisdom";
    }
}