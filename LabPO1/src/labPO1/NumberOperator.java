/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labPO1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NumberOperator {

    int value;
    ArrayList<Integer> digits = new ArrayList<>();

    NumberOperator(int value) {
        this.value = value;
    }

    public ArrayList<Integer> convertToDigits() {
        while (value != 0) {
            digits.add(value % 10);
            value = value / 10;
        }
        return digits;
    }

    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            sum += digits.get(i);
        }
        
        return sum;
    }

    public int calculateMultiplication() {
        int multi = 1;
        for (int i = 0; i < digits.size(); i++) {
            multi *= digits.get(i);
        }
        return multi;
    }
}
