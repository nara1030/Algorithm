package leetcode;

/*
 * - ���� ��ó
 *   https://leetcode.com/problems/hamming-distance/
 * 
 * - �ؼ�
 *   https://www.youtube.com/watch?v=KNs8KhLIOdc&list=PL2mzT_U4XxDm7p6g1o3KeQMsyRLfzSaVW&index=3&t=0s
 * 
 * - ���� ����
 *   ��Ʈ ����(LC 461. Hamming Distance)
 *   
 * - �߰�
 *   &(not short-circuiting) vs. &&(short-circuiting)
 *   http://www.cs.columbia.edu/~lennox/3101-03/class1-slides/logical.html
 */
public class Lc_461 {
	public int hammingDistance(int x, int y) {
		int xor = x ^ y;
		int cnt = 0;
		for (int i = 0; i < 32; i++) {
			cnt += (xor >> i) & 1;
		}
		return cnt;
	}
}
