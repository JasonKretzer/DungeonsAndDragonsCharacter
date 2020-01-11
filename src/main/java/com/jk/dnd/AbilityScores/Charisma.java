package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Charisma extends AbilityScore 
{
    public Charisma(int score)
    {
        super(Score.CHARISMA, score);
    }

    @Override
    public String toString()
    {
        return "Charisma";
    }
}