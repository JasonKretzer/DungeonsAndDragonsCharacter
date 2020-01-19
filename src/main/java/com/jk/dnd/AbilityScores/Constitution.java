package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.ScoreOption;

public class Constitution extends AbilityScore 
{
    public Constitution(int score)
    {
        super(ScoreOption.CONSTITUTION, score);
    }

    @Override
    public String toString()
    {
        return "Constitution";
    }
}