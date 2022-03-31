package chap99.leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        
        return 0;
    }
    
    
    
//    int duplicateNum = 0;
//    
//    Map<Integer, Integer> map = new HashMap<>();
//    for(int i : nums) {
//        map.put(i, map.getOrDefault(i, 0) + 1);
//        
//        if(map.get(i)>1) duplicateNum = i;
//    }
//    
//    return duplicateNum;
//	}
}
