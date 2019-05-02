package leetcode;

/*
 * - 문제 출처
 *   https://leetcode.com/problems/hamming-distance/
 * 
 * - 해설
 *   https://www.youtube.com/watch?v=KNs8KhLIOdc&list=PL2mzT_U4XxDm7p6g1o3KeQMsyRLfzSaVW&index=3&t=0s
 * 
 * - 문제 유형
 *   비트 연산(LC 461. Hamming Distance)
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
