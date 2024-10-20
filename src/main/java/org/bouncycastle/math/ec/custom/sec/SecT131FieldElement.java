package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;

public class SecT131FieldElement extends ECFieldElement {

    public long[] x;

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public SecT131FieldElement() {
        this.x = Nat192.create64();
    }

    public SecT131FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public int getM() {
        return 131;
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public BigInteger toBigInteger() {
        return Nat192.toBigInteger64(this.x);
    }

    public String getFieldName() {
        return "SecT131Field";
    }

    public int getFieldSize() {
        return 131;
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat192.create64();
        SecT131Field.add(this.x, ((SecT131FieldElement) arg0).x, var2);
        return new SecT131FieldElement(var2);
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat192.create64();
        SecT131Field.addOne(this.x, var1);
        return new SecT131FieldElement(var1);
    }

    public int getK3() {
        return 8;
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat192.create64();
        SecT131Field.multiply(this.x, ((SecT131FieldElement) arg0).x, var2);
        return new SecT131FieldElement(var2);
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT131FieldElement) arg0).x;
        long[] var6 = ((SecT131FieldElement) arg1).x;
        long[] var7 = ((SecT131FieldElement) arg2).x;
        long[] var8 = Nat.create64(5);
        SecT131Field.multiplyAddToExt(var4, var5, var8);
        SecT131Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat192.create64();
        SecT131Field.reduce(var8, var9);
        return new SecT131FieldElement(var9);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement square() {
        long[] var1 = Nat192.create64();
        SecT131Field.square(this.x, var1);
        return new SecT131FieldElement(var1);
    }

    public int getK2() {
        return 3;
    }

    public int hashCode() {
        return 0x202F8 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public boolean isZero() {
        return Nat192.isZero64(this.x);
    }

    public ECFieldElement invert() {
        long[] var1 = Nat192.create64();
        SecT131Field.invert(this.x, var1);
        return new SecT131FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat192.create64();
        SecT131Field.sqrt(this.x, var1);
        return new SecT131FieldElement(var1);
    }

    public int getRepresentation() {
        return 3;
    }

    public boolean isOne() {
        return Nat192.isOne64(this.x);
    }

    public int getK1() {
        return 2;
    }

    public int agk() {
        return 0x202F8 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public int agp() {
        return 0x202F8 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public SecT131FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.x = SecT131Field.fromBigInteger(arg0);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT131FieldElement)) {
            SecT131FieldElement var2 = (SecT131FieldElement) arg0;
            return Nat192.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean bk(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT131FieldElement)) {
            SecT131FieldElement var2 = (SecT131FieldElement) arg0;
            return Nat192.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat192.create64();
            SecT131Field.squareN(this.x, arg0, var2);
            return new SecT131FieldElement(var2);
        }
    }

    public int agb() {
        return 0x202F8 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public int age() {
        return 0x202F8 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT131FieldElement) arg0).x;
        long[] var5 = ((SecT131FieldElement) arg1).x;
        long[] var6 = Nat.create64(5);
        SecT131Field.squareAddToExt(var3, var6);
        SecT131Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat192.create64();
        SecT131Field.reduce(var6, var7);
        return new SecT131FieldElement(var7);
    }
}
