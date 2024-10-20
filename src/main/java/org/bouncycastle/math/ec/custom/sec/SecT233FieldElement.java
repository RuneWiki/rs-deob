package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class SecT233FieldElement extends ECFieldElement {

    public long[] x;

    public SecT233FieldElement() {
        this.x = Nat256.create64();
    }

    public int getK1() {
        return 74;
    }

    public SecT233FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public boolean isOne() {
        return Nat256.isOne64(this.x);
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT233FieldElement) arg0).x;
        long[] var6 = ((SecT233FieldElement) arg1).x;
        long[] var7 = ((SecT233FieldElement) arg2).x;
        long[] var8 = Nat256.createExt64();
        SecT233Field.multiplyAddToExt(var4, var5, var8);
        SecT233Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat256.create64();
        SecT233Field.reduce(var8, var9);
        return new SecT233FieldElement(var9);
    }

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public BigInteger toBigInteger() {
        return Nat256.toBigInteger64(this.x);
    }

    public String getFieldName() {
        return "SecT233Field";
    }

    public int getFieldSize() {
        return 233;
    }

    public boolean isZero() {
        return Nat256.isZero64(this.x);
    }

    public SecT233FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.x = SecT233Field.fromBigInteger(arg0);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat256.create64();
        SecT233Field.multiply(this.x, ((SecT233FieldElement) arg0).x, var2);
        return new SecT233FieldElement(var2);
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat256.create64();
        SecT233Field.addOne(this.x, var1);
        return new SecT233FieldElement(var1);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT233FieldElement)) {
            SecT233FieldElement var2 = (SecT233FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement square() {
        long[] var1 = Nat256.create64();
        SecT233Field.square(this.x, var1);
        return new SecT233FieldElement(var1);
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT233FieldElement) arg0).x;
        long[] var5 = ((SecT233FieldElement) arg1).x;
        long[] var6 = Nat256.createExt64();
        SecT233Field.squareAddToExt(var3, var6);
        SecT233Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat256.create64();
        SecT233Field.reduce(var6, var7);
        return new SecT233FieldElement(var7);
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat256.create64();
            SecT233Field.squareN(this.x, arg0, var2);
            return new SecT233FieldElement(var2);
        }
    }

    public ECFieldElement invert() {
        long[] var1 = Nat256.create64();
        SecT233Field.invert(this.x, var1);
        return new SecT233FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat256.create64();
        SecT233Field.sqrt(this.x, var1);
        return new SecT233FieldElement(var1);
    }

    public boolean gd(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT233FieldElement)) {
            SecT233FieldElement var2 = (SecT233FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int getRepresentation() {
        return 2;
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 233;
    }

    public int hashCode() {
        return 0x238DDA ^ Arrays.hashCode((long[]) this.x, 0, 4);
    }

    public boolean gl(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT233FieldElement)) {
            SecT233FieldElement var2 = (SecT233FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat256.create64();
        SecT233Field.add(this.x, ((SecT233FieldElement) arg0).x, var2);
        return new SecT233FieldElement(var2);
    }

    public int ahl() {
        return 0x238DDA ^ Arrays.hashCode((long[]) this.x, 0, 4);
    }
}
