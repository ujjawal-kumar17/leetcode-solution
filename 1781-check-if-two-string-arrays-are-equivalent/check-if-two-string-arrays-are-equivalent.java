class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String m="";
        String t="";
        for(int i=0; i<word1.length; i++){
            m+=word1[i];
        }
         for(int i=0; i<word2.length; i++){
            t+=word2[i];
        }
        if(t.equals(m)){
            return true;
        }
        else {
            return false;
        }

    }
}