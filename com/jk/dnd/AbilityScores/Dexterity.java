package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Dexterity extends AbilityScore 
{
    public Dexterity(int score, int modifier)
    {
        super(Score.DEXTERITY, score, modifier);
    }

    @Override
    public String toString()
    {
        return "Dexterity";
    }
}