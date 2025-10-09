package easy;

import java.util.Arrays;

public class AssignCookies {

	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int contentChildren = 0;
		int cookieIndex = 0;
		while (cookieIndex < s.length && contentChildren < g.length) {
			if (s[cookieIndex] >= g[contentChildren]) {
				contentChildren++;
			}
			cookieIndex++;
		}
		return contentChildren;
	}

	public static void main(String[] args) {
		AssignCookies assignCookies = new AssignCookies();
		int[] greed = { 7, 8, 9, 10 };
		int[] size = { 5, 6, 7, 8 };
		System.out.println(assignCookies.findContentChildren(greed, size));
	}

}
