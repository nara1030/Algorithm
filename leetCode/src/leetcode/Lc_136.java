package leetcode;

/*
 * - 문제 출처
 *   https://leetcode.com/problems/single-number/
 * 
 * - 해설
 *   https://www.youtube.com/watch?v=3J_UlbwUfc0&list=PL2mzT_U4XxDm7p6g1o3KeQMsyRLfzSaVW&index=9
 * 
 * - 문제 유형
 *   비트 연산(LC 136. Single Number)
 *   Should have a linear runtime complexity
 *   
 * - 추가
 *   빅오 표기법
 */
public class Lc_136 {
	public int singleNumber(int[] nums) {
		int ret = 0;
		for (int num : nums)
			ret ^= num;
		return ret;
	}
}
