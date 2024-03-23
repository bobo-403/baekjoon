#include <stdio.h>
#pragma warning(disable:4996)

int main() {
	int st, cut;
	int score[1001];
	int temp, max;
	int i, j;
	scanf("%d %d", &st, &cut);
	for (i = 0; i < st; i++)
		scanf("%d", &score[i]);

	for (i = 0; i < st - 1; i++) {
		max = i;
		for (j = i + 1; j < st; j++)
			if (score[j] > score[max])
				max = j;

		temp = score[i];
		score[i] = score[max];
		score[max] = temp;
	}
	
	printf("%d", score[cut-1]);

	
	return 0;

}