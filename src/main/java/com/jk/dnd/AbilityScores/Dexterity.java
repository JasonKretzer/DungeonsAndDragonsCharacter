package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.ScoreOption;

public class Dexterity extends AbilityScore 
{
    public Dexterity(int score)
    {
        super(ScoreOption.DEXTERITY, score);
    }

    @Override
    public String toString()
    {
        return "Dexterity";
    }
}