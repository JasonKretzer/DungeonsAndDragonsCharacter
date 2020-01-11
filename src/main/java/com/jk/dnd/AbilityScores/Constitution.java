package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Constitution extends AbilityScore 
{
    public Constitution(int score)
    {
        super(Score.CONSTITUTION, score);
    }

    @Override
    public String toString()
    {
        return "Constitution";
    }
}