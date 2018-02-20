/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labPO1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LabPO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        NumberOperator number1 = new NumberOperator(number);
        number1.convertToDigits();
        
        System.out.println("Сумма цифр:" + number1.calculateSum());
        System.out.println("Произведение цифр:" + number1.calculateMultiplication());
        
        // TODO code application logic here
    }

}
