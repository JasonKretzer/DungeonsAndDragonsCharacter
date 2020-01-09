package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Charisma extends AbilityScore 
{
    public Charisma(int score, int modifier)
    {
        super(Score.CHARISMA, score, modifier);
    }

    @Override
    public String toString()
    {
        return "Charisma";
    }
}