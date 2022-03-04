import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] num = new int[N][2];
        for(int i=0;i<N;i++)
        {
            st = new StringTokenizer(br.readLine());
            num[i][0] = Integer.parseInt(st.nextToken());
            num[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num,(o1,o2) -> {
            if (o1[1]==o2[1]){
                return Integer.compare(o1[0],o2[0]);
            }else
            {
                return Integer.compare(o1[1],o2[1]);
            }
        });

        for(int i=0;i<N;i++)
        {
            System.out.println(num[i][0]+" "+num[i][1]);

        }




    }
}
