package hu.training360.javase.test.exmp1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product{
    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numerOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numerOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = unitWeight;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWightOfBox() {
        return weightOfBox;
    }
    @Override
    public BigDecimal totalWeight(int pieces){
        if (pieces != 0) {
            Double boxesNumber = Math.ceil (pieces / packingUnit);
            BigDecimal boxesWeight = weightOfBox.multiply(new BigDecimal(String.valueOf(boxesNumber)));
            return super.totalWeight(pieces).add(boxesWeight).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
        }
        return BigDecimal.valueOf(0.00);
    }
}
