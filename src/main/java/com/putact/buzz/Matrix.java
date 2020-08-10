package com.putact.buzz;

class SubrectangleQueries {
    int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = 0; i <= row1; i++) {
            for (int j = 0; j <= col1; j++) {
                rectangle[i][j] = newValue;
            }
        }
        int rows = rectangle.length;
        int columes = rectangle[0].length;

        //System.out.print(rows);
        //System.out.print(columes);
        for (int i = row2; i < rows; i++) {
            for (int j = col2; j < columes; j++) {
                rectangle[i][j] = newValue;
            }
        }


    }

    public int getValue(int row, int col) {
        return rectangle[row][col];

    }

    public static void main(String args[]) {
        int[][] rectangle = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        SubrectangleQueries tt = new SubrectangleQueries(rectangle);
        tt.updateSubrectangle(1, 1, 3, 3, 88);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tt.getValue(i, j));

            }
        }

    }
}

class Solution {

    public boolean isPalindrome(String s) {

        if (s == null) {
            return true;
        }
        s = s.toLowerCase();

        StringBuilder formatStr = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if ((0 <= c && c <= 9) || ('a' <= c && c <= 'z')) {
                formatStr.append(c);
            }
        }
        return s.equals(formatStr.reverse().toString());

    }


    public boolean isPalindrome2(String s) {

        if (s == null) {
            return true;
        }

        s = s.toLowerCase();

        StringBuilder formatStr = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if ((0 <= c && c <= 9) || ('a' <= c && c <= 'z')) {
                formatStr.append(c);
            }
        }

        int high = formatStr.length() - 1;
        int low = 0;

        while (low < high) {

            if ((s.charAt(low) != s.charAt(high))) {
                return false;
            }

            high--;
            low++;

        }


        return true;
    }

    public int numTeams(int[] rating) {
        int numbers = 0;
        int length = rating.length;
        if (length < 3) {
            return 0;
        }
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; j < length; k++) {
                    if (((rating[i] < rating[j]) &&(rating[j] < rating[k]))||
                            (rating[i] > rating[j]) &&(rating[j] > rating[k])){
                       numbers++;
                    }
                }
            }
        }
        return numbers;
    }
    public String encode(String longUrl) {
        String result =longUrl.replaceFirst("https","http");


        return result;
    }
}


