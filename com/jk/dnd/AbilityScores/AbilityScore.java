package com.jk.dnd.AbilityScores;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.Score;

public class AbilityScore {
    private Score scoreType;
    private int score;
    private int modifier;

    public AbilityScore(Score scoreType, int score, int modifier) {
        this.scoreType = scoreType;
        this.score = score;
        this.modifier = modifier;
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
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }
}