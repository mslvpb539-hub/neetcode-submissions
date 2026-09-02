class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
// Loop && get Sum by adding Sec Ele to prev Ele
for (int i = 0; i < s.length() - 1; i++) {
// convert characters into ascII
int first_ele = (int) s.charAt(i);
int second_ele = (int) s.charAt(i + 1);
int s_absolute = Math.abs(first_ele - second_ele);
sum += s_absolute;
}
return sum;
    }
}