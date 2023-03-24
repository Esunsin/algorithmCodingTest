package main.programmers.level2;

public class 택배배달과수거하기 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int deliver = 0, pickup = 0;
        int g = cap;
        //최초 배달할 지점과 픽업 지점 확인
        for (int i = n - 1; i >= 0; i--) {
            if(deliveries[i]!=0){
                deliver = i+1;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if(pickups[i]!=0){
                pickup = i+1;
                break;
            }
        }
        //배달과 픽업 시작
        while(true){
            //종료조건
            if(deliver==0&&pickup==0) break;
            //거리 계산 : 배달 및 픽업중 더 뒤에 있는 거 * 2
            System.out.println("deliver = " + deliver+ " pickup = " + pickup) ;
            answer += Math.max(deliver,pickup)*2;
            //배달하기
            while(true){
                //종료조건
                if(deliver==0 || g==0 && deliveries[deliver-1]!=0) break;
                //배달하고 수화물이 남을때
                if(g >= deliveries[deliver-1]){
                    g -= deliveries[deliver-1];
                    deliveries[deliver-1] = 0;
                    deliver--;
                }
                else{ // 한 곳에 배달을 더 해야댐
                    deliveries[deliver-1] -= g;
                    g = 0;
                }
                //배달 후 남아있는 위치가 없는 경우
                if(deliver == 0) break;
                //딱 떨어져 남을때
                if(g==0&&deliveries[deliver-1]==0){
                    deliver--;
                }
            }
            g = cap;
            //픽업하기
            while(true){
                //종료조건
                if(pickup==0 || g==0 && pickups[pickup-1]!=0) break;
                //하고 수화물이 남을때
                if(g >= pickups[pickup-1]){
                    g -= pickups[pickup-1];
                    pickups[pickup-1] = 0;
                    pickup--;
                }
                else{ // 한 곳에 배달을 더 해야댐
                    pickups[pickup-1] -= g;
                    g = 0;
                }
                //배달 후 남아있는 위치가 없는 경우
                if(pickup == 0) break;
                //딱 떨어져 남을때
                if(g==0&&pickups[pickup-1]==0){
                    pickup--;
                }
            }
            g= cap;
        }
        return answer;
    }

    public static void main(String[] args) {
        택배배달과수거하기 T = new 택배배달과수거하기();
        long result1 = T.solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 0, 4});
        System.out.println("result1 = " + result1);
        long result2 = T.solution(2, 7, new int[]{1, 0, 2, 0, 1,0,2}, new int[]{0, 2, 0, 1, 0, 2, 0});
        System.out.println("result2 = " + result2);
        long result3 = T.solution(5, 7, new int[]{5, 5, 5, 5, 5,5,5}, new int[]{0, 2, 0, 1, 0, 2, 0});
        System.out.println("result2 = " + result3);
    }

}
