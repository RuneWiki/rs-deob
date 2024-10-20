package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

public class SecP384R1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP384R1Curve.q;

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP384R1FieldElement)) {
            SecP384R1FieldElement var2 = (SecP384R1FieldElement) arg0;
            return Nat.eq(12, this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecP384R1FieldElement() {
        this.x = Nat.create(12);
    }

    public SecP384R1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat.create(12);
        SecP384R1Field.multiply(this.x, ((SecP384R1FieldElement) arg0).x, var2);
        return new SecP384R1FieldElement(var2);
    }

    public SecP384R1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.x = SecP384R1Field.fromBigInteger(arg0);
    }

    public boolean testBitZero() {
        return Nat.getBit(this.x, 0) == 1;
    }

    public BigInteger toBigInteger() {
        return Nat.toBigInteger(12, this.x);
    }

    public String getFieldName() {
        return "SecP384R1Field";
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat.create(12);
        SecP384R1Field.add(this.x, ((SecP384R1FieldElement) arg0).x, var2);
        return new SecP384R1FieldElement(var2);
    }

    public int aif() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 12);
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 12);
    }

    public boolean gh(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP384R1FieldElement)) {
            SecP384R1FieldElement var2 = (SecP384R1FieldElement) arg0;
            return Nat.eq(12, this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat.create(12);
        Mod.invert(SecP384R1Field.P, ((SecP384R1FieldElement) arg0).x, var2);
        SecP384R1Field.multiply(var2, this.x, var2);
        return new SecP384R1FieldElement(var2);
    }

    public boolean isOne() {
        return Nat.isOne(12, this.x);
    }

    public ECFieldElement square() {
        int[] var1 = Nat.create(12);
        SecP384R1Field.square(this.x, var1);
        return new SecP384R1FieldElement(var1);
    }

    public ECFieldElement invert() {
        int[] var1 = Nat.create(12);
        Mod.invert(SecP384R1Field.P, this.x, var1);
        return new SecP384R1FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat.isZero(12, var1) || Nat.isOne(12, var1)) {
            return this;
        }
        int[] var2 = Nat.create(12);
        int[] var3 = Nat.create(12);
        int[] var4 = Nat.create(12);
        int[] var5 = Nat.create(12);
        SecP384R1Field.square(var1, var2);
        SecP384R1Field.multiply(var2, var1, var2);
        SecP384R1Field.squareN(var2, 2, var3);
        SecP384R1Field.multiply(var3, var2, var3);
        SecP384R1Field.square(var3, var3);
        SecP384R1Field.multiply(var3, var1, var3);
        SecP384R1Field.squareN(var3, 5, var4);
        SecP384R1Field.multiply(var4, var3, var4);
        SecP384R1Field.squareN(var4, 5, var5);
        SecP384R1Field.multiply(var5, var3, var5);
        SecP384R1Field.squareN(var5, 15, var3);
        SecP384R1Field.multiply(var3, var5, var3);
        SecP384R1Field.squareN(var3, 2, var4);
        SecP384R1Field.multiply(var2, var4, var2);
        SecP384R1Field.squareN(var4, 28, var4);
        SecP384R1Field.multiply(var3, var4, var3);
        SecP384R1Field.squareN(var3, 60, var4);
        SecP384R1Field.multiply(var4, var3, var4);
        SecP384R1Field.squareN(var4, 120, var3);
        SecP384R1Field.multiply(var3, var4, var3);
        SecP384R1Field.squareN(var3, 15, var3);
        SecP384R1Field.multiply(var3, var5, var3);
        SecP384R1Field.squareN(var3, 33, var3);
        SecP384R1Field.multiply(var3, var2, var3);
        SecP384R1Field.squareN(var3, 64, var3);
        SecP384R1Field.multiply(var3, var1, var3);
        SecP384R1Field.squareN(var3, 30, var2);
        SecP384R1Field.square(var2, var3);
        return Nat.eq(12, var1, var3) ? new SecP384R1FieldElement(var2) : null;
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat.create(12);
        SecP384R1Field.subtract(this.x, ((SecP384R1FieldElement) arg0).x, var2);
        return new SecP384R1FieldElement(var2);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat.create(12);
        SecP384R1Field.addOne(this.x, var1);
        return new SecP384R1FieldElement(var1);
    }

    public boolean gf(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP384R1FieldElement)) {
            SecP384R1FieldElement var2 = (SecP384R1FieldElement) arg0;
            return Nat.eq(12, this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean isZero() {
        return Nat.isZero(12, this.x);
    }

    public boolean gy(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP384R1FieldElement)) {
            SecP384R1FieldElement var2 = (SecP384R1FieldElement) arg0;
            return Nat.eq(12, this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement negate() {
        int[] var1 = Nat.create(12);
        SecP384R1Field.negate(this.x, var1);
        return new SecP384R1FieldElement(var1);
    }
}
