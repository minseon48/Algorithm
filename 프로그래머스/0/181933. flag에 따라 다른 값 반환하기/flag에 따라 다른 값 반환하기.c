#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b, bool flag) {
    int answer = 0;
    
    if(flag == 1){
        answer = a+b;
    }else if(flag == 0){
        answer = a-b;
    }
    return answer;
}