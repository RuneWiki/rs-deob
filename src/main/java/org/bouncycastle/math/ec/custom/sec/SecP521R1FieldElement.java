package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

public class SecP521R1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP521R1Curve.q;

    public boolean gl(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP521R1FieldElement)) {
            SecP521R1FieldElement var2 = (SecP521R1FieldElement) arg0;
            return Nat.eq(17, this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecP521R1FieldElement() {
        this.x = Nat.create(17);
    }

    public int ahv() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 17);
    }

    public boolean isZero() {
        return Nat.isZero(17, this.x);
    }

    public String getFieldName() {
        return "SecP521R1Field";
    }

    public boolean testBitZero() {
        return Nat.getBit(this.x, 0) == 1;
    }

    public BigInteger toBigInteger() {
        return Nat.toBigInteger(17, this.x);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat.create(17);
        SecP521R1Field.multiply(this.x, ((SecP521R1FieldElement) arg0).x, var2);
        return new SecP521R1FieldElement(var2);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP521R1FieldElement)) {
            SecP521R1FieldElement var2 = (SecP521R1FieldElement) arg0;
            return Nat.eq(17, this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat.create(17);
        SecP521R1Field.add(this.x, ((SecP521R1FieldElement) arg0).x, var2);
        return new SecP521R1FieldElement(var2);
    }

    public SecP521R1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.x = SecP521R1Field.fromBigInteger(arg0);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat.create(17);
        SecP521R1Field.subtract(this.x, ((SecP521R1FieldElement) arg0).x, var2);
        return new SecP521R1FieldElement(var2);
    }

    public boolean isOne() {
        return Nat.isOne(17, this.x);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat.create(17);
        Mod.invert(SecP521R1Field.P, ((SecP521R1FieldElement) arg0).x, var2);
        SecP521R1Field.multiply(var2, this.x, var2);
        return new SecP521R1FieldElement(var2);
    }

    public ECFieldElement negate() {
        int[] var1 = Nat.create(17);
        SecP521R1Field.negate(this.x, var1);
        return new SecP521R1FieldElement(var1);
    }

    public ECFieldElement square() {
        int[] var1 = Nat.create(17);
        SecP521R1Field.square(this.x, var1);
        return new SecP521R1FieldElement(var1);
    }

    public ECFieldElement invert() {
        int[] var1 = Nat.create(17);
        Mod.invert(SecP521R1Field.P, this.x, var1);
        return new SecP521R1FieldElement(var1);
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat.isZero(17, var1) || Nat.isOne(17, var1)) {
            return this;
        }
        int[] var2 = Nat.create(17);
        int[] var3 = Nat.create(17);
        SecP521R1Field.squareN(var1, 519, var2);
        SecP521R1Field.square(var2, var3);
        return Nat.eq(17, var1, var3) ? new SecP521R1FieldElement(var2) : null;
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 17);
    }

    public boolean ge(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP521R1FieldElement)) {
            SecP521R1FieldElement var2 = (SecP521R1FieldElement) arg0;
            return Nat.eq(17, this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecP521R1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat.create(17);
        SecP521R1Field.addOne(this.x, var1);
        return new SecP521R1FieldElement(var1);
    }
}
