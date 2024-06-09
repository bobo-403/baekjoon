class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int score[] = new int[3];
        int loc = 0;
        String option_ex = "[*|#]";
        for(int i=0; i<3; i++){
            int n = dartResult.charAt(loc++) - '0';
            if(dartResult.charAt(loc)-'0' == 0){
                n = 10;
                loc++;
            }
            char s = dartResult.charAt(loc++);
            switch(s){
                case 'S':
                    break;
                case 'D':
                    n = n*n;
                    break;
                case 'T':
                    n = n*n*n;
                    break;
            }
            score[i] = n;
            
            if(loc < dartResult.length()){
                String option = dartResult.substring(loc,loc+1);
                if(option.matches(option_ex)){
                    char opt = dartResult.charAt(loc++);
                    switch(opt){
                        case '*':
                            score[i] *= 2;
                            if(i > 0)
                                score[i-1] *= 2;
                            break;
                        case '#':
                                score[i] *= -1;
                            break;
                    }
                }
            }
        }
        for(int i=0; i<3; i++)
            answer += score[i];
        
        return answer;
    }
}