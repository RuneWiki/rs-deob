package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;

public class SecT163FieldElement extends ECFieldElement {

    public long[] x;

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT163FieldElement) arg0).x;
        long[] var5 = ((SecT163FieldElement) arg1).x;
        long[] var6 = Nat192.createExt64();
        SecT163Field.squareAddToExt(var3, var6);
        SecT163Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat192.create64();
        SecT163Field.reduce(var6, var7);
        return new SecT163FieldElement(var7);
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public SecT163FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public boolean isOne() {
        return Nat192.isOne64(this.x);
    }

    public boolean isZero() {
        return Nat192.isZero64(this.x);
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public String getFieldName() {
        return "SecT163Field";
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat192.create64();
        SecT163Field.sqrt(this.x, var1);
        return new SecT163FieldElement(var1);
    }

    public int getFieldSize() {
        return 163;
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat192.create64();
        SecT163Field.add(this.x, ((SecT163FieldElement) arg0).x, var2);
        return new SecT163FieldElement(var2);
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat192.create64();
        SecT163Field.addOne(this.x, var1);
        return new SecT163FieldElement(var1);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat192.create64();
        SecT163Field.multiply(this.x, ((SecT163FieldElement) arg0).x, var2);
        return new SecT163FieldElement(var2);
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT163FieldElement) arg0).x;
        long[] var6 = ((SecT163FieldElement) arg1).x;
        long[] var7 = ((SecT163FieldElement) arg2).x;
        long[] var8 = Nat192.createExt64();
        SecT163Field.multiplyAddToExt(var4, var5, var8);
        SecT163Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat192.create64();
        SecT163Field.reduce(var8, var9);
        return new SecT163FieldElement(var9);
    }

    public int hashCode() {
        return 0x27FB3 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement square() {
        long[] var1 = Nat192.create64();
        SecT163Field.square(this.x, var1);
        return new SecT163FieldElement(var1);
    }

    public int getK3() {
        return 7;
    }

    public SecT163FieldElement() {
        this.x = Nat192.create64();
    }

    public SecT163FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.x = SecT163Field.fromBigInteger(arg0);
    }

    public ECFieldElement invert() {
        long[] var1 = Nat192.create64();
        SecT163Field.invert(this.x, var1);
        return new SecT163FieldElement(var1);
    }

    public boolean gx(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT163FieldElement)) {
            SecT163FieldElement var2 = (SecT163FieldElement) arg0;
            return Nat192.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int akx() {
        return 0xFC4A7642 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public int getM() {
        return 163;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT163FieldElement)) {
            SecT163FieldElement var2 = (SecT163FieldElement) arg0;
            return Nat192.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int getRepresentation() {
        return 3;
    }

    public boolean gz(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT163FieldElement)) {
            SecT163FieldElement var2 = (SecT163FieldElement) arg0;
            return Nat192.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean go(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT163FieldElement)) {
            SecT163FieldElement var2 = (SecT163FieldElement) arg0;
            return Nat192.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int akm() {
        return 0x27FB3 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public int akj() {
        return 0x27FB3 ^ Arrays.hashCode((long[]) this.x, 0, 3);
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat192.create64();
            SecT163Field.squareN(this.x, arg0, var2);
            return new SecT163FieldElement(var2);
        }
    }

    public BigInteger toBigInteger() {
        return Nat192.toBigInteger64(this.x);
    }
}
