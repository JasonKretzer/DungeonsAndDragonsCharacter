package com.jk.dnd.AbilityScores;

import java.util.HashMap;
import java.util.UUID;

import com.jk.dnd.AbilityScores.AbilityScoreTypes.ScoreOption;

public class AbilityScore 
{
    private ScoreOption scoreType;
    private int score;
    private HashMap<UUID, AbilityModifier> modifiers;
    
    public AbilityScore(ScoreOption scoreType, int score) {
        this.scoreType = scoreType;
        this.score = score;
    }

    public ScoreOption getScoreType() {
        return scoreType;
    }

    public void setScoreType(ScoreOption scoreType) {
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

	public ArrayList<AbilityModifier> getModifiers() {
		return modifiers;
	}

	public void addModifier(AbilityModifier modifier) {
		this.modifiers.add(modifier);
	}
}