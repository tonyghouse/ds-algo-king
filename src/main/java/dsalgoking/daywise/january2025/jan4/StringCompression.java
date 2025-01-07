package dsalgoking.daywise.january2025.jan4;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = new char[]{'a','a','b','b','c','c','c'};
        int result = compress(chars);
        System.out.println("Result: "+result);
    }

    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count =1;
        sb.append(chars[0]);

        for(int i = 1; i<chars.length; i++){
            char curr = chars[i];
            char prev = chars[i-1];
            if(curr == prev){
                count++;
            } else{
                sb.append(count);
                //reset counter again
                count=1;
                sb.append(curr);
            }
        }
        //for last element
        if(count > 1){
            sb.append(count);
        }

        return sb.length();
    }
}
