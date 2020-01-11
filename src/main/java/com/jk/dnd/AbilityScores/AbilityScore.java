package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class AbilityScore {
    private Score scoreType;
    private int score;
    
    public AbilityScore(Score scoreType, int score) {
        this.scoreType = scoreType;
        this.score = score;
    }

    public Score getScoreType() {
        return scoreType;
    }

    public void setScoreType(Score scoreType) {
        this.scoreType = scoreType;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getModifier() {
        return calculateModifier();
    }

    private int calculateModifier()
    {
        return 0;
    }
}