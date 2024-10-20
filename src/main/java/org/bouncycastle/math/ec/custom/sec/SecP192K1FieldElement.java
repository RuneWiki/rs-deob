package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;

public class SecP192K1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP192K1Curve.q;

    public SecP192K1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat192.create();
        SecP192K1Field.multiply(this.x, ((SecP192K1FieldElement) arg0).x, var2);
        return new SecP192K1FieldElement(var2);
    }

    public boolean isZero() {
        return Nat192.isZero(this.x);
    }

    public boolean ge(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP192K1FieldElement)) {
            SecP192K1FieldElement var2 = (SecP192K1FieldElement) arg0;
            return Nat192.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecP192K1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.x = SecP192K1Field.fromBigInteger(arg0);
    }

    public ECFieldElement square() {
        int[] var1 = Nat192.create();
        SecP192K1Field.square(this.x, var1);
        return new SecP192K1FieldElement(var1);
    }

    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.x);
    }

    public String getFieldName() {
        return "SecP192K1Field";
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat192.create();
        SecP192K1Field.add(this.x, ((SecP192K1FieldElement) arg0).x, var2);
        return new SecP192K1FieldElement(var2);
    }

    public ECFieldElement negate() {
        int[] var1 = Nat192.create();
        SecP192K1Field.negate(this.x, var1);
        return new SecP192K1FieldElement(var1);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat192.create();
        SecP192K1Field.subtract(this.x, ((SecP192K1FieldElement) arg0).x, var2);
        return new SecP192K1FieldElement(var2);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat192.create();
        SecP192K1Field.addOne(this.x, var1);
        return new SecP192K1FieldElement(var1);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat192.create();
        Mod.invert(SecP192K1Field.P, ((SecP192K1FieldElement) arg0).x, var2);
        SecP192K1Field.multiply(var2, this.x, var2);
        return new SecP192K1FieldElement(var2);
    }

    public boolean isOne() {
        return Nat192.isOne(this.x);
    }

    public boolean gl(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP192K1FieldElement)) {
            SecP192K1FieldElement var2 = (SecP192K1FieldElement) arg0;
            return Nat192.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement invert() {
        int[] var1 = Nat192.create();
        Mod.invert(SecP192K1Field.P, this.x, var1);
        return new SecP192K1FieldElement(var1);
    }

    public SecP192K1FieldElement() {
        this.x = Nat192.create();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP192K1FieldElement)) {
            SecP192K1FieldElement var2 = (SecP192K1FieldElement) arg0;
            return Nat192.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 6);
    }

    public boolean testBitZero() {
        return Nat192.getBit(this.x, 0) == 1;
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat192.isZero(var1) || Nat192.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat192.create();
        SecP192K1Field.square(var1, var2);
        SecP192K1Field.multiply(var2, var1, var2);
        int[] var3 = Nat192.create();
        SecP192K1Field.square(var2, var3);
        SecP192K1Field.multiply(var3, var1, var3);
        int[] var4 = Nat192.create();
        SecP192K1Field.squareN(var3, 3, var4);
        SecP192K1Field.multiply(var4, var3, var4);
        SecP192K1Field.squareN(var4, 2, var4);
        SecP192K1Field.multiply(var4, var2, var4);
        SecP192K1Field.squareN(var4, 8, var2);
        SecP192K1Field.multiply(var2, var4, var2);
        SecP192K1Field.squareN(var2, 3, var4);
        SecP192K1Field.multiply(var4, var3, var4);
        int[] var8 = Nat192.create();
        SecP192K1Field.squareN(var4, 16, var8);
        SecP192K1Field.multiply(var8, var2, var8);
        SecP192K1Field.squareN(var8, 35, var2);
        SecP192K1Field.multiply(var2, var8, var2);
        SecP192K1Field.squareN(var2, 70, var8);
        SecP192K1Field.multiply(var8, var2, var8);
        SecP192K1Field.squareN(var8, 19, var2);
        SecP192K1Field.multiply(var2, var4, var2);
        SecP192K1Field.squareN(var2, 20, var2);
        SecP192K1Field.multiply(var2, var4, var2);
        SecP192K1Field.squareN(var2, 4, var2);
        SecP192K1Field.multiply(var2, var3, var2);
        SecP192K1Field.squareN(var2, 6, var2);
        SecP192K1Field.multiply(var2, var3, var2);
        SecP192K1Field.square(var2, var2);
        SecP192K1Field.square(var2, var3);
        return Nat192.eq(var1, var3) ? new SecP192K1FieldElement(var2) : null;
    }

    public int ahv() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 6);
    }
}
