package GITDEMO.FirstOne;

public class vowelCount {
    public static void main(String[] args) {
        char[] ch={'a', 'b', 'c', 'd', 'e','i', 'o','u','a'};
        int count=0;

        for (int i=0; i<ch.length; i++){
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
                count++;
                
            }
        
        }
        System.out.println(count);
    }
}
