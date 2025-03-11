class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList<>();
        ispermutate(s.toCharArray(),0,result);
        return result;
    }
    public void ispermutate(char ch[],int index,List<String> result)
    {
        if(index==ch.length)
        {
            result.add(new String(ch));
            return;
        }
        ispermutate(ch,index+1,result);
        if(Character.isLetter(ch[index]))
        {
            ch[index]=Character.isUpperCase(ch[index])?Character.toLowerCase(ch[index]):Character.toUpperCase(ch[index]);
            ispermutate(ch,index+1,result);
            ch[index]=Character.isUpperCase(ch[index])?Character.toLowerCase(ch[index]):Character.toUpperCase(ch[index]);
        }


        
    }
}