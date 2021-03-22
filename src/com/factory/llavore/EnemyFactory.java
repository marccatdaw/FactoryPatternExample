package com.factory.llavore;

public class EnemyFactory {

	public static IEnemy create(EnemyClasses enemy) {
		Object object = null;
		try {
			object = Class.forName(enemy.urlClass()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (IEnemy) object;
	}
}
