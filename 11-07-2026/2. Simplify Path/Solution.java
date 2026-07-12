class Solution {
    public String simplifyPath(String path) {
        java.util.Stack<String> st = new java.util.Stack<>();

        for (String s : path.split("/")) {
            if (s.equals("") || s.equals(".")) continue;
            if (s.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(s);
            }
        }

        if (st.isEmpty()) return "/";

        StringBuilder ans = new StringBuilder();
        for (String s : st) ans.append("/").append(s);
        return ans.toString();
    }
}
