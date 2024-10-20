package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;
import org.bouncycastle.util.Arrays;

public class SecT409FieldElement extends ECFieldElement {

    public long[] x;

    public SecT409FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.x = SecT409Field.fromBigInteger(arg0);
    }

    public SecT409FieldElement() {
        this.x = Nat448.create64();
    }

    public SecT409FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public boolean isOne() {
        return Nat448.isOne64(this.x);
    }

    public boolean isZero() {
        return Nat448.isZero64(this.x);
    }

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public int getRepresentation() {
        return 2;
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat448.create64();
        SecT409Field.multiply(this.x, ((SecT409FieldElement) arg0).x, var2);
        return new SecT409FieldElement(var2);
    }

    public int getFieldSize() {
        return 409;
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat448.create64();
        SecT409Field.add(this.x, ((SecT409FieldElement) arg0).x, var2);
        return new SecT409FieldElement(var2);
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat448.create64();
        SecT409Field.addOne(this.x, var1);
        return new SecT409FieldElement(var1);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat448.create64();
            SecT409Field.squareN(this.x, arg0, var2);
            return new SecT409FieldElement(var2);
        }
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT409FieldElement) arg0).x;
        long[] var6 = ((SecT409FieldElement) arg1).x;
        long[] var7 = ((SecT409FieldElement) arg2).x;
        long[] var8 = Nat.create64(13);
        SecT409Field.multiplyAddToExt(var4, var5, var8);
        SecT409Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat448.create64();
        SecT409Field.reduce(var8, var9);
        return new SecT409FieldElement(var9);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public int getM() {
        return 409;
    }

    public ECFieldElement square() {
        long[] var1 = Nat448.create64();
        SecT409Field.square(this.x, var1);
        return new SecT409FieldElement(var1);
    }

    public BigInteger toBigInteger() {
        return Nat448.toBigInteger64(this.x);
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT409FieldElement) arg0).x;
        long[] var5 = ((SecT409FieldElement) arg1).x;
        long[] var6 = Nat.create64(13);
        SecT409Field.squareAddToExt(var3, var6);
        SecT409Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat448.create64();
        SecT409Field.reduce(var6, var7);
        return new SecT409FieldElement(var7);
    }

    public int getK2() {
        return 0;
    }

    public ECFieldElement invert() {
        long[] var1 = Nat448.create64();
        SecT409Field.invert(this.x, var1);
        return new SecT409FieldElement(var1);
    }

    public int acy() {
        return 0x88748CF2 ^ Arrays.hashCode((long[]) this.x, 0, 7);
    }

    public String getFieldName() {
        return "SecT409Field";
    }

    public int ach() {
        return 0xC3D9E861 ^ Arrays.hashCode((long[]) this.x, 0, 7);
    }

    public int getK1() {
        return 87;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT409FieldElement)) {
            SecT409FieldElement var2 = (SecT409FieldElement) arg0;
            return Nat448.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int getK3() {
        return 0;
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public int hashCode() {
        return 0x3E68E7 ^ Arrays.hashCode((long[]) this.x, 0, 7);
    }

    public boolean bs(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT409FieldElement)) {
            SecT409FieldElement var2 = (SecT409FieldElement) arg0;
            return Nat448.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat448.create64();
        SecT409Field.sqrt(this.x, var1);
        return new SecT409FieldElement(var1);
    }

    public int acn() {
        return 0x3E68E7 ^ Arrays.hashCode((long[]) this.x, 0, 7);
    }

    public boolean bh(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT409FieldElement)) {
            SecT409FieldElement var2 = (SecT409FieldElement) arg0;
            return Nat448.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }
}
