package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class Intelligence extends AbilityScore
{
    public Intelligence(int score)
    {
        super(Score.INTELLIGENCE, score);
    }

    @Override
    public String toString()
    {
        return "Intelligence";
    }
}