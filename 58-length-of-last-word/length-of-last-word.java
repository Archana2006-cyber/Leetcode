class Solution {
    public int lengthOfLastWord(String s) {
            int length=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' '){
                if(length>0){
                    break;
                }
            }
                else{
                    length++;
                }
            }
        return length;
    }
}