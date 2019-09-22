package DD;

public class Mytest {
    public static void main(String[] args) {
        System.out.print('a'-96);
    }
}
/*
#include <iostream>
#include <iomanip>
#include <sstream>
#include <vector>
#include <string>
#include <queue>
#include <map>
#include <unordered_map>
#include <unordered_set>
#include <algorithm>
#include <numeric>
#include <math.h>
using namespace std;
int solution(int a[], int n) {
	vector<int> dp(n, 2147483647);
	dp[0] = 0;
	for (int i = 0; i < n; i++) {
		if (dp[i] < 2147482647) {
			int index = i+1;
			while (index < n&&index - i <= a[i]) {
				dp[index] = min(dp[i] + 1, dp[index]);
				index++;
			}
		}
	}
	cout << dp[n - 1] << endl;
	return -1;
}
int main() {
	int a[5] = { 2,4,1,1,1 };
	solution(a, 5);
	system("pause");
	return 0;
}
 */
