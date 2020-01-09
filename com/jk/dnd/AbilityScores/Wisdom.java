package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Wisdom extends AbilityScore 
{
    public Wisdom(int score, int modifier)
    {
        super(Score.WISDOM, score, modifier);
    }

    @Override
    public String toString()
    {
        return "Wisdom";
    }
}