package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Constitution extends AbilityScore 
{
    public Constitution(int score, int modifier)
    {
        super(Score.CONSTITUTION, score, modifier);
    }

    @Override
    public String toString()
    {
        return "Constitution";
    }
}