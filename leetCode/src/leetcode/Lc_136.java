package leetcode;

/*
 * - ���� ��ó
 *   https://leetcode.com/problems/single-number/
 * 
 * - �ؼ�
 *   https://www.youtube.com/watch?v=3J_UlbwUfc0&list=PL2mzT_U4XxDm7p6g1o3KeQMsyRLfzSaVW&index=9
 * 
 * - ���� ����
 *   ��Ʈ ����(LC 136. Single Number)
 *   Should have a linear runtime complexity
 *   
 * - �߰�
 *   ��� ǥ���
 */
public class Lc_136 {
	public int singleNumber(int[] nums) {
		int ret = 0;
		for (int num : nums)
			ret ^= num;
		return ret;
	}
}
