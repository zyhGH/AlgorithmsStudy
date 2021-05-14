package com.zyh.algorithmsstudy.top200;

public class LeetCodeTop38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if(n == 1) return "1";
        String temp = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();

        char a = temp.charAt(0);
        int count = 1;

        for (int i = 1; i < temp.length(); i++) {
            if (a == temp.charAt(i)) {
                count++;
            }else {
                sb.append(count);
                sb.append(a);
                a = temp.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(a);
        return sb.toString();
    }
}
