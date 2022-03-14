import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[2];

        for(int i = 0; i < 2; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int N = arr[0];
        int K = arr[1];
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<");
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        int index = K-1;
        while(!queue.isEmpty()){
            if(queue.size()==1){
                stringBuffer.append(queue.poll() + ">");
                break;
            }
            for(int i =0; i < index; i++) {
                queue.add(queue.poll());
            }
            stringBuffer.append(queue.poll());
            if(queue.size()==1){
                stringBuffer.append(", " + queue.poll() + ">");
                break;
            }
            else{
                stringBuffer.append(", ");
            }
        }
        System.out.println(stringBuffer);

    }
}
