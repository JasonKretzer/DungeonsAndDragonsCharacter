package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Strength extends AbilityScore
{
    public Strength(int score, int modifier)
    {
        super(Score.STRENGTH, score, modifier);
    }

    @Override
    public String toString()
    {
        return "Strength";
    }
}