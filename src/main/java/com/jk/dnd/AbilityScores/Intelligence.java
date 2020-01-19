package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.ScoreOption;

public class Intelligence extends AbilityScore
{
    public Intelligence(int score)
    {
        super(ScoreOption.INTELLIGENCE, score);
    }

    @Override
    public String toString()
    {
        return "Intelligence";
    }
}