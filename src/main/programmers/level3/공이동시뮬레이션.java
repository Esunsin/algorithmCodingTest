package main.programmers.level3;

class 공이동시뮬레이션 {
    public long solution(int n, int m, int x, int y, int[][] queries) {
        long rs=x, re=x, cs=y, ce=y;
        for(int i=queries.length-1 ; i>=0 ; i--) {
            int way=queries[i][0], step=queries[i][1];
            System.out.println(rs + " " + re + " " + cs + " " + ce);
            if(way==0) {
                // L
                if(cs>0) cs += step;
                ce = Math.min(m-1, ce+step);

            } else if(way==1) {
                // R
                if(ce<m-1) ce -= step;
                cs = Math.max(0, cs-step);

            } else if(way==2) {
                // U
                if(rs>0) rs += step;
                re = Math.min(n-1, re+step);

            } else {
                // D
                if(re<n-1) re -= step;
                rs = Math.max(0, rs-step);
            }
            System.out.println(rs + " " + re + " " + cs + " " + ce);
            System.out.println("---------------");
            if(rs>=n || re<0 || cs>=m || ce<0) return 0;
        }
        return (re-rs+1)*(ce-cs+1);
    }

    public static void main(String[] args) {
        공이동시뮬레이션 t = new 공이동시뮬레이션();
        long n = t.solution(3, 3, 1, 1, new int[][]{{0, 2}, {1, 1},{0,1}}); //L2 R1 L1
        System.out.println("n = " + n);
    }
}

