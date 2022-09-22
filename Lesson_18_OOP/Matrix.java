package Lesson_18_OOP;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.ArrayList;
import java.util.Random;

public class Matrix {


    double[][] m;
    int rowQty;
    int colQty;

    public Matrix() {
    }

    public Matrix(double[][] arr) {
        rowQty = arr.length;
        colQty = arr[0].length;

        m = new double[rowQty][colQty];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                m[i][j] = arr[i][j];
            }
        }
    }

    public Matrix(int n, int m) {
        rowQty = n;
        colQty = m;
        this.m = new double[rowQty][colQty];
    }

    public Matrix addMatrix(Matrix b) {
        Matrix res = null;
        if (rowQty == b.rowQty && colQty == b.colQty) {
            res = new Matrix(rowQty, colQty);
            for (int i = 0; i < rowQty; i++) {
                for (int j = 0; j < colQty; j++) {
                    res.m[i][j] = m[i][j] + b.m[i][j];
                }
            }
        }
        return res;
    }

    public void fillMatrix(int a) {
        for (int i = 0; i < rowQty; i++) {
            for (int j = 0; j < colQty; j++) {
                m[i][j] = a;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rowQty; i++) {
            for (int j = 0; j < colQty; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }


}
