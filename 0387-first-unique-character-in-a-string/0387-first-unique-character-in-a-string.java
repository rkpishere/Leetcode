class Solution {
    public int firstUniqChar(String s) {
       Queue<Character>q=new ArrayDeque<>();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,(map.get(ch)+1));
            }
        }
        int count=0;
        while(!q.isEmpty()){
            char temp=q.remove();
            if(map.get(temp)==1){
                return count;
            }
            else{
                count++;
            }
        }
        return -1;
    }
}