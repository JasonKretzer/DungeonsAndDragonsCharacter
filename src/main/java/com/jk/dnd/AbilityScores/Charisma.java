package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.ScoreOption;

public class Charisma extends AbilityScore 
{
    public Charisma(int score)
    {
        super(ScoreOption.CHARISMA, score);
    }

    @Override
    public String toString()
    {
        return "Charisma";
    }
}