import java.util.Scanner;

class Main {
    public static void main(String[] args)  {
      
        Scanner sc = new Scanner(System.in);

        int N, K;
        K = sc.nextInt();
        N = sc.nextInt();        
        
        int[][] scores = new int[N+1][K+1];

        for( int sesssion = 1; sesssion <= K; sesssion++) {
            for (int score = 1; score <= N; score++) {
                int cow = sc.nextInt();                
                scores[cow][sesssion] = score;
            }
        }
        
        // pair count
        int pc = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j)
                    continue;
                // check if i is better than j
                int ok = 0;

                for (int k = 1; k <= K; k++) {
                    if (scores[i][k] < scores[j][k]) {
                        ok++;                       
                    }
                }

                if (ok == K) 
                    pc++;
            }
        }

        System.out.println(pc);
        sc.close();
    }

}