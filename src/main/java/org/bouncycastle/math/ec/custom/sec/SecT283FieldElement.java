package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;
import org.bouncycastle.util.Arrays;

public class SecT283FieldElement extends ECFieldElement {

    public long[] x;

    public BigInteger toBigInteger() {
        return Nat320.toBigInteger64(this.x);
    }

    public boolean bk(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT283FieldElement)) {
            SecT283FieldElement var2 = (SecT283FieldElement) arg0;
            return Nat320.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecT283FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public boolean isOne() {
        return Nat320.isOne64(this.x);
    }

    public boolean isZero() {
        return Nat320.isZero64(this.x);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT283FieldElement)) {
            SecT283FieldElement var2 = (SecT283FieldElement) arg0;
            return Nat320.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public String getFieldName() {
        return "SecT283Field";
    }

    public int getFieldSize() {
        return 283;
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat320.create64();
        SecT283Field.add(this.x, ((SecT283FieldElement) arg0).x, var2);
        return new SecT283FieldElement(var2);
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat320.create64();
        SecT283Field.addOne(this.x, var1);
        return new SecT283FieldElement(var1);
    }

    public int getK3() {
        return 12;
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat320.create64();
        SecT283Field.multiply(this.x, ((SecT283FieldElement) arg0).x, var2);
        return new SecT283FieldElement(var2);
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat320.create64();
        SecT283Field.sqrt(this.x, var1);
        return new SecT283FieldElement(var1);
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT283FieldElement) arg0).x;
        long[] var6 = ((SecT283FieldElement) arg1).x;
        long[] var7 = ((SecT283FieldElement) arg2).x;
        long[] var8 = Nat.create64(9);
        SecT283Field.multiplyAddToExt(var4, var5, var8);
        SecT283Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat320.create64();
        SecT283Field.reduce(var8, var9);
        return new SecT283FieldElement(var9);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT283FieldElement) arg0).x;
        long[] var5 = ((SecT283FieldElement) arg1).x;
        long[] var6 = Nat.create64(9);
        SecT283Field.squareAddToExt(var3, var6);
        SecT283Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat320.create64();
        SecT283Field.reduce(var6, var7);
        return new SecT283FieldElement(var7);
    }

    public int getK1() {
        return 5;
    }

    public ECFieldElement invert() {
        long[] var1 = Nat320.create64();
        SecT283Field.invert(this.x, var1);
        return new SecT283FieldElement(var1);
    }

    public SecT283FieldElement() {
        this.x = Nat320.create64();
    }

    public int getRepresentation() {
        return 3;
    }

    public int getM() {
        return 283;
    }

    public SecT283FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.x = SecT283Field.fromBigInteger(arg0);
    }

    public int getK2() {
        return 7;
    }

    public ECFieldElement square() {
        long[] var1 = Nat320.create64();
        SecT283Field.square(this.x, var1);
        return new SecT283FieldElement(var1);
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat320.create64();
            SecT283Field.squareN(this.x, arg0, var2);
            return new SecT283FieldElement(var2);
        }
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public int hashCode() {
        return 0x2B33AB ^ Arrays.hashCode((long[]) this.x, 0, 5);
    }

    public int agp() {
        return 0x2B33AB ^ Arrays.hashCode((long[]) this.x, 0, 5);
    }

    public int agb() {
        return 0x2B33AB ^ Arrays.hashCode((long[]) this.x, 0, 5);
    }

    public int age() {
        return 0x96FC6396 ^ Arrays.hashCode((long[]) this.x, 0, 5);
    }

    public int agk() {
        return 0x2B33AB ^ Arrays.hashCode((long[]) this.x, 0, 5);
    }
}
