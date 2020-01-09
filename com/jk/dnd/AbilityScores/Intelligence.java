package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Intelligence extends AbilityScore
{
    public Intelligence(int score, int modifier)
    {
        super(Score.INTELLIGENCE, score, modifier);
    }

    @Override
    public String toString()
    {
        return "Intelligence";
    }
}