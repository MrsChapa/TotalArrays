//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayTotal
{
	public static int go(int[] ray)
	{
		int sum = 0;
		for(int i = 0; i < ray.length; i ++) {
			sum += ray[i];
		}
		return sum;
	}
}