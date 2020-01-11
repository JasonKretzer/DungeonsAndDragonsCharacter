package com.jk.dnd;

import com.jk.dnd.AbilityScores.Charisma;
import com.jk.dnd.AbilityScores.Constitution;
import com.jk.dnd.AbilityScores.Dexterity;
import com.jk.dnd.AbilityScores.Intelligence;
import com.jk.dnd.AbilityScores.Strength;
import com.jk.dnd.AbilityScores.Wisdom;

public class Character {

    private Strength strength;
    private Intelligence intelligence;
    private Wisdom wisdom;
    private Dexterity dexterity;
    private Constitution constitution;
    private Charisma charisma;

    public Strength getStrength() {
        return strength;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }

    public Intelligence getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Intelligence intelligence) {
        this.intelligence = intelligence;
    }

    public Wisdom getWisdom() {
        return wisdom;
    }

    public void setWisdom(Wisdom wisdom) {
        this.wisdom = wisdom;
    }

    public Dexterity getDexterity() {
        return dexterity;
    }

    public void setDexterity(Dexterity dexterity) {
        this.dexterity = dexterity;
    }

    public Constitution getConstitution() {
        return constitution;
    }

    public void setConstitution(Constitution constitution) {
        this.constitution = constitution;
    }

    public Charisma getCharisma() {
        return charisma;
    }

    public void setCharisma(Charisma charisma) {
        this.charisma = charisma;
    }
}