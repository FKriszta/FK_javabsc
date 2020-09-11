package hu.training360.javase.test.exmp1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeight, int numerOfDecimals){
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numerOfDecimals;
    }
    public Product(String name, BigDecimal unitWeight){
        this(name, unitWeight, 2);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces){
        return unitWeight.multiply(new BigDecimal(String.valueOf(pieces))).setScale(numberOfDecimals, RoundingMode.HALF_UP);
    }
}
