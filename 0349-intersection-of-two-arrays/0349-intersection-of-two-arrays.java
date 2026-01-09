class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer>set=new HashSet<>();
    HashSet<Integer>set2=new HashSet<>();
    for(int i:nums1){
        set.add(i);
    }
    for(int j:nums2){
        if(set.contains(j)){
            set2.add(j);
        }
    }
    int k = 0;
int[] arr = new int[set2.size()];
for (int val : set2) {
    arr[k++] = val;
}
    return arr;
}
}