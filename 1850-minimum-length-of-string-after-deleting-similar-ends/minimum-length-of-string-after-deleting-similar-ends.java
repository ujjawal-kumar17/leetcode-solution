class Solution {
    public int minimumLength(String s) {
        
        char[] ch = s.toCharArray();
        int n = ch.length;
        int i=0;
        int j=n-1;
        while(j>i){
            if(ch[i]!=ch[j]) break;
            char c = ch[i];
            while(j>=i && ch[i]==c)i++;
            while(j>=i && ch[j]==c)j--;
        }
        return j-i+1;
    }
}