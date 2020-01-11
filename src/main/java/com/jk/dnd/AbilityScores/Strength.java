package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Strength extends AbilityScore
{
    public Strength(int score)
    {
        super(Score.STRENGTH, score);
    }

    @Override
    public String toString()
    {
        return "Strength";
    }
}