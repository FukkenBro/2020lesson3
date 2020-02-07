package com.chen.p;

//        3*. Дана строк состоящая из любых символов. Не используя стандартный метод String.toLowerCase() перевести все большие латинские буквы в маленькие.
//
//        Пример:
//        Input: "#1AmC"
//        Output: "#1amc"
public class Task3 {
    public static void main(String[] args) {
        String s = "haiusgdA*&SDtagiusydasgdoya87sdg6&ASGDUydta&^SDAS(*dp7HASG5tF&^ASDTg*&ASd6h9D)ASd89J&AS)(Du";
        System.out.println(toLowerCase(s));
    }

    static String toLowerCase(String input) {
        int delta = 'a' - 'A';
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                char ch = (char) (input.charAt(i) + delta);
                sb.append(ch);
            } else {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}
