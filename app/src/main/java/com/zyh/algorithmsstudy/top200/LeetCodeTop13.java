package com.zyh.algorithmsstudy.top200;

public class LeetCodeTop13 {
    public int romanToInt(String s) {
        int result = 0;
        int i = 0;

        while (i < s.length()) {
            if (i != s.length() - 1) {
                int a = getValue(s.charAt(i));
                int b = getValue(s.charAt(i + 1));
                if (a < b) {
                    result = result + b - a;
                    i += 2;
                }else {
                    result = result + a;
                    i++;
                }
            }else {
                int a = getValue(s.charAt(i));
                result = result + a;
                i++;
            }
        }
        return result;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
