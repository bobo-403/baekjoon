#include <stdio.h>
#pragma warning(disable:4996)
 
int main() {
	int a, b, v, sum = 0, day = 0; // 달팽이가 낮에 올라갈수 있는 높이 a, 미끄러지는 높이 b, 나무의 높이 v

	scanf("%d %d %d", &a, &b, &v);

	if ((v - a) % (a - b) == 0) printf("%d", (v - a) / (a - b) + 1);
	else printf("%d", (v - a) / (a - b) + 2);

	return 0;
}