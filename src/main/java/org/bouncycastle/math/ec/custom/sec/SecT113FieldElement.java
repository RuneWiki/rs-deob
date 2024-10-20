package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.Arrays;

public class SecT113FieldElement extends ECFieldElement {

    public long[] x;

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public SecT113FieldElement() {
        this.x = Nat128.create64();
    }

    public int getFieldSize() {
        return 113;
    }

    public boolean gg(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT113FieldElement)) {
            SecT113FieldElement var2 = (SecT113FieldElement) arg0;
            return Nat128.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public BigInteger toBigInteger() {
        return Nat128.toBigInteger64(this.x);
    }

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public int getRepresentation() {
        return 2;
    }

    public String getFieldName() {
        return "SecT113Field";
    }

    public SecT113FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat128.create64();
        SecT113Field.add(this.x, ((SecT113FieldElement) arg0).x, var2);
        return new SecT113FieldElement(var2);
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat128.create64();
        SecT113Field.addOne(this.x, var1);
        return new SecT113FieldElement(var1);
    }

    public int getM() {
        return 113;
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat128.create64();
        SecT113Field.multiply(this.x, ((SecT113FieldElement) arg0).x, var2);
        return new SecT113FieldElement(var2);
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT113FieldElement) arg0).x;
        long[] var6 = ((SecT113FieldElement) arg1).x;
        long[] var7 = ((SecT113FieldElement) arg2).x;
        long[] var8 = Nat128.createExt64();
        SecT113Field.multiplyAddToExt(var4, var5, var8);
        SecT113Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat128.create64();
        SecT113Field.reduce(var8, var9);
        return new SecT113FieldElement(var9);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement square() {
        long[] var1 = Nat128.create64();
        SecT113Field.square(this.x, var1);
        return new SecT113FieldElement(var1);
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT113FieldElement) arg0).x;
        long[] var5 = ((SecT113FieldElement) arg1).x;
        long[] var6 = Nat128.createExt64();
        SecT113Field.squareAddToExt(var3, var6);
        SecT113Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat128.create64();
        SecT113Field.reduce(var6, var7);
        return new SecT113FieldElement(var7);
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat128.create64();
            SecT113Field.squareN(this.x, arg0, var2);
            return new SecT113FieldElement(var2);
        }
    }

    public ECFieldElement invert() {
        long[] var1 = Nat128.create64();
        SecT113Field.invert(this.x, var1);
        return new SecT113FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat128.create64();
        SecT113Field.sqrt(this.x, var1);
        return new SecT113FieldElement(var1);
    }

    public int hashCode() {
        return 0x1B971 ^ Arrays.hashCode((long[]) this.x, 0, 2);
    }

    public SecT113FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.x = SecT113Field.fromBigInteger(arg0);
    }

    public int getK1() {
        return 9;
    }

    public boolean isZero() {
        return Nat128.isZero64(this.x);
    }

    public int getK3() {
        return 0;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT113FieldElement)) {
            SecT113FieldElement var2 = (SecT113FieldElement) arg0;
            return Nat128.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean isOne() {
        return Nat128.isOne64(this.x);
    }

    public int ajz() {
        return 0x83E1AC0E ^ Arrays.hashCode((long[]) this.x, 0, 2);
    }

    public int ajs() {
        return 0x6A85C75F ^ Arrays.hashCode((long[]) this.x, 0, 2);
    }

    public int ajq() {
        return 0x1B971 ^ Arrays.hashCode((long[]) this.x, 0, 2);
    }

    public int ajf() {
        return 0xC3A8A6CA ^ Arrays.hashCode((long[]) this.x, 0, 2);
    }

    public int getK2() {
        return 0;
    }
}
