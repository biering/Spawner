package me.Chryb.Spawner.Utilities;

public class MathUtil {
	
	public static double customRound(double x) {
		if (x % 1 < 0.5){
			x = x - (x % 1);
		} else {
			x = x + (1 - (x % 1));
		}
		return x;
	}

}
