package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class SecP256R1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP256R1Curve.q;

    public ECFieldElement square() {
        int[] var1 = Nat256.create();
        SecP256R1Field.square(this.x, var1);
        return new SecP256R1FieldElement(var1);
    }

    public SecP256R1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.x = SecP256R1Field.fromBigInteger(arg0);
    }

    public SecP256R1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public boolean isOne() {
        return Nat256.isOne(this.x);
    }

    public boolean testBitZero() {
        return Nat256.getBit(this.x, 0) == 1;
    }

    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.x);
    }

    public String getFieldName() {
        return "SecP256R1Field";
    }

    public boolean ee(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256R1FieldElement)) {
            SecP256R1FieldElement var2 = (SecP256R1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        SecP256R1Field.add(this.x, ((SecP256R1FieldElement) arg0).x, var2);
        return new SecP256R1FieldElement(var2);
    }

    public int agk() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 8);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        SecP256R1Field.subtract(this.x, ((SecP256R1FieldElement) arg0).x, var2);
        return new SecP256R1FieldElement(var2);
    }

    public SecP256R1FieldElement() {
        this.x = Nat256.create();
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        Mod.invert(SecP256R1Field.P, ((SecP256R1FieldElement) arg0).x, var2);
        SecP256R1Field.multiply(var2, this.x, var2);
        return new SecP256R1FieldElement(var2);
    }

    public ECFieldElement negate() {
        int[] var1 = Nat256.create();
        SecP256R1Field.negate(this.x, var1);
        return new SecP256R1FieldElement(var1);
    }

    public boolean isZero() {
        return Nat256.isZero(this.x);
    }

    public ECFieldElement invert() {
        int[] var1 = Nat256.create();
        Mod.invert(SecP256R1Field.P, this.x, var1);
        return new SecP256R1FieldElement(var1);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat256.create();
        SecP256R1Field.addOne(this.x, var1);
        return new SecP256R1FieldElement(var1);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256R1FieldElement)) {
            SecP256R1FieldElement var2 = (SecP256R1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 8);
    }

    public boolean ez(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256R1FieldElement)) {
            SecP256R1FieldElement var2 = (SecP256R1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat256.isZero(var1) || Nat256.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat256.create();
        int[] var3 = Nat256.create();
        SecP256R1Field.square(var1, var2);
        SecP256R1Field.multiply(var2, var1, var2);
        SecP256R1Field.squareN(var2, 2, var3);
        SecP256R1Field.multiply(var3, var2, var3);
        SecP256R1Field.squareN(var3, 4, var2);
        SecP256R1Field.multiply(var2, var3, var2);
        SecP256R1Field.squareN(var2, 8, var3);
        SecP256R1Field.multiply(var3, var2, var3);
        SecP256R1Field.squareN(var3, 16, var2);
        SecP256R1Field.multiply(var2, var3, var2);
        SecP256R1Field.squareN(var2, 32, var2);
        SecP256R1Field.multiply(var2, var1, var2);
        SecP256R1Field.squareN(var2, 96, var2);
        SecP256R1Field.multiply(var2, var1, var2);
        SecP256R1Field.squareN(var2, 94, var2);
        SecP256R1Field.square(var2, var3);
        return Nat256.eq(var1, var3) ? new SecP256R1FieldElement(var2) : null;
    }

    public boolean em(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256R1FieldElement)) {
            SecP256R1FieldElement var2 = (SecP256R1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        SecP256R1Field.multiply(this.x, ((SecP256R1FieldElement) arg0).x, var2);
        return new SecP256R1FieldElement(var2);
    }
}
