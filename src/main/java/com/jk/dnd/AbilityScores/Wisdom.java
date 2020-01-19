package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.ScoreOption;

public class Wisdom extends AbilityScore 
{
    public Wisdom(int score)
    {
        super(ScoreOption.WISDOM, score);
    }

    @Override
    public String toString()
    {
        return "Wisdom";
    }
}