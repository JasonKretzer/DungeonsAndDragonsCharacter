package com.jk.dnd.AbilityScores;

import java.util.UUID;

public class AbilityModifier
{
	private int modifier;
	private UUID uuid;
	private String description;
	
	public AbilityModifier(int modifier, UUID uuid) {
		super();
		this.modifier = modifier;
		this.uuid = uuid;
	}

	public int getModifier() {
		return modifier;
	}
	

	public void setModifier(int modifier) {
		this.modifier = modifier;
	}


	public UUID getUuid() {
		return uuid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}