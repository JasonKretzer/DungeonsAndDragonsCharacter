package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Dexterity extends AbilityScore 
{
    public Dexterity(int score)
    {
        super(Score.DEXTERITY, score);
    }

    @Override
    public String toString()
    {
        return "Dexterity";
    }
}