public class BinaryGap {
    public static int solution(int N) {
        String str = "";
        while (true) {
            if(N%2>0) {
                str = N % 2 + str;
                N=N/2;
            } else {
                str = N % 2 + str;
                break;
            }
        }
        char[] arr = str.toCharArray();
        int max =0;
        int count = 0;
        for(int i =0; i<str.length();i++) {
            if(arr[i] == '0') {
                count+=1;
                for(int j=i+1;j<str.length();j++) {
                    if(arr[j]=='0') {
                        count +=1;
                    } else {
                        if(max<count) {
                            max = count;
                            count = 0;
                            i = j;
                            break;
                        } else {
                            count = 0;
                            i=j;
                            break;
                        }
                    }
                }
            }
        }
        return max;
    }
}
