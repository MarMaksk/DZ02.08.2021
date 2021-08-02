package com.company;

public class Task3 {
    public static void main(String[] args) throws TriangleException {
        final SecondCLass triangle = new SecondCLass(4, 3, 5);
        final SecondCLass triangle2 = new SecondCLass(10, 3, 5);

    }
}

class SecondCLass {
    private int base;
    private int leftSide;
    private int rightSide;

    public SecondCLass(int base, int leftSide, int rightSide) throws TriangleException {
        if (leftSide > (rightSide + base) || rightSide > (leftSide + base) || base > (rightSide + leftSide)) {
            throw new TriangleException("Impossible to build");
        }
        this.base = base;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }
}

class TriangleException extends Exception {

    public TriangleException() {
    }

    public TriangleException(String message) {
        super(message);
    }
}