package com.factory.llavore;

import java.util.Scanner;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sortir = false;
		IEnemy enemy;
		while (!sortir) {
			System.out.println("Quin enemic vols crear?");
			System.out.println("1. Boo");
			System.out.println("2. Blooper");
			System.out.println("3. Goomba");
			System.out.println("0. Sortir");

			switch (demanar_Integer("Quin escolleixes?", true)) {
			case 0:
				sortir = true;
				break;
			case 1:
				enemy = EnemyFactory.create(EnemyClasses.Boo);
				enemy.Attack();
				break;
			case 2:
				enemy = EnemyFactory.create(EnemyClasses.Blooper);
				enemy.Attack();
				break;
			case 3:
				enemy = EnemyFactory.create(EnemyClasses.Goomba);
				enemy.Attack();
				break;
			default:
				System.out.println("Opció no valida");
				break;
			}
		}
	}

	public static int demanar_Integer(String pregunta, boolean cert) {
		int num = 0;
		try {
			if (cert) {
				System.out.println(pregunta);
			} else {
				System.out.print(pregunta);
			}
			num = new Scanner(System.in).nextInt();

		} catch (Exception e) {
			System.out.println(
					"Error: Heu introduirt un caracter no valid, per tant"
							+ "automaticament se li asignara un 0");
			num = 0;
		}
		return num;
	}

}
