package com.example.model;

public class Villain {

	private String name;
	private String power;
	private String sidekick;
	private String hideout;

	// minion

	public Villain() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getSidekick() {
		return sidekick;
	}

	public void setSidekick(String sidekick) {
		this.sidekick = sidekick;
	}

	public String getHideout() {
		return hideout;
	}

	public void setHideout(String hideout) {
		this.hideout = hideout;
	}

	@Override
	public String toString() {
		return "Villain [name=" + name + ", power=" + power + ", sidekick=" + sidekick + ", hideout=" + hideout + "]";
	}

	public Villain(String name, String power, String sidekick, String hideout) {
		super();
		this.name = name;
		this.power = power;
		this.sidekick = sidekick;
		this.hideout = hideout;
	}
	

}
