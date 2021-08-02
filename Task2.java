package com.company;


public class Task2 {
    public static void main(String[] args) throws NumberException {
        Throww th = new Throww();
        try {
            th.questionTwo(102);
        } catch (NumberException ex) {
            ex.printStackTrace();
        }

        th.questionTwo(-2);

    }

    static class Throww {
        public void questionTwo(int n) throws NumberException {
            if (n < 0) {
                throw new NumberException();
            }
            if (n > 100) {
                throw new NumberException();
            }
        }
    }
}

class NumberException extends Exception {
}