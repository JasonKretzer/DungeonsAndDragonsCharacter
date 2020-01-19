package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.ScoreOption;

public class Strength extends AbilityScore
{
    public Strength(int score)
    {
        super(ScoreOption.STRENGTH, score);
    }

    @Override
    public String toString()
    {
        return "Strength";
    }
}