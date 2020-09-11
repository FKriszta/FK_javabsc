package hu.training360.javase.test.exmp1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product prod = new Product("termék", BigDecimal.valueOf(2.00));
        System.out.println(prod.totalWeight(5));
        PackedProduct packProd = new PackedProduct("termék", BigDecimal.valueOf(2.00), 1, 3, BigDecimal.valueOf(1.00));
        System.out.println(packProd.totalWeight(5));

    }
}
