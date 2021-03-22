package com.factory.llavore;

public enum EnemyClasses {
	Boo("com.factory.llavore.Boo"), Blooper("com.factory.llavore.Blooper"),
	Goomba("com.factory.llavore.Goomba");

	private String classEnemy;

	EnemyClasses(String classEnemy) {
		this.classEnemy = classEnemy;
	}

	public String urlClass() {
		return classEnemy;
	}

}
