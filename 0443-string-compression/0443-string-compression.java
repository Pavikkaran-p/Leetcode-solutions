class Solution {
    public int compress(char[] chars) {
        StringBuilder ans=new StringBuilder();
        int n=chars.length;

        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            int c=0,f=0;
            if(chars[i-1]!=chars[i]){
                ans.append(chars[i-1]);
            }
            while(i<n&&chars[i-1]==chars[i]){
                 c++;
                 i++;
                 f=1;
            }
            if(f==1) ans.append(chars[i-1]);
            if(c!=0){
                char z=(char) c;
                ans.append(c+1);
                c=0;
            } 
        }
        if(chars[n-2]!=chars[n-1]){
            ans.append(chars[n-1]);
        }
            System.out.println(ans);
        for(int i=0;i<ans.length();i++){
            chars[i]=ans.toString().charAt(i);
        }
        return ans.length();
    }
}