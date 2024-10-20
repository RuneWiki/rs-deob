package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Arrays;

public class SecP160R1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP160R1Curve.q;

    public SecP160R1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public SecP160R1FieldElement() {
        this.x = Nat160.create();
    }

    public int ahv() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 5);
    }

    public int ahh() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 5);
    }

    public boolean isOne() {
        return Nat160.isOne(this.x);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat160.create();
        SecP160R1Field.multiply(this.x, ((SecP160R1FieldElement) arg0).x, var2);
        return new SecP160R1FieldElement(var2);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat160.create();
        SecP160R1Field.addOne(this.x, var1);
        return new SecP160R1FieldElement(var1);
    }

    public String getFieldName() {
        return "SecP160R1Field";
    }

    public boolean testBitZero() {
        return Nat160.getBit(this.x, 0) == 1;
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat160.create();
        SecP160R1Field.add(this.x, ((SecP160R1FieldElement) arg0).x, var2);
        return new SecP160R1FieldElement(var2);
    }

    public ECFieldElement negate() {
        int[] var1 = Nat160.create();
        SecP160R1Field.negate(this.x, var1);
        return new SecP160R1FieldElement(var1);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat160.create();
        SecP160R1Field.subtract(this.x, ((SecP160R1FieldElement) arg0).x, var2);
        return new SecP160R1FieldElement(var2);
    }

    public boolean isZero() {
        return Nat160.isZero(this.x);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat160.create();
        Mod.invert(SecP160R1Field.P, ((SecP160R1FieldElement) arg0).x, var2);
        SecP160R1Field.multiply(var2, this.x, var2);
        return new SecP160R1FieldElement(var2);
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 5);
    }

    public boolean gi(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R1FieldElement)) {
            SecP160R1FieldElement var2 = (SecP160R1FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement invert() {
        int[] var1 = Nat160.create();
        Mod.invert(SecP160R1Field.P, this.x, var1);
        return new SecP160R1FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat160.isZero(var1) || Nat160.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat160.create();
        SecP160R1Field.square(var1, var2);
        SecP160R1Field.multiply(var2, var1, var2);
        int[] var3 = Nat160.create();
        SecP160R1Field.squareN(var2, 2, var3);
        SecP160R1Field.multiply(var3, var2, var3);
        SecP160R1Field.squareN(var3, 4, var2);
        SecP160R1Field.multiply(var2, var3, var2);
        SecP160R1Field.squareN(var2, 8, var3);
        SecP160R1Field.multiply(var3, var2, var3);
        SecP160R1Field.squareN(var3, 16, var2);
        SecP160R1Field.multiply(var2, var3, var2);
        SecP160R1Field.squareN(var2, 32, var3);
        SecP160R1Field.multiply(var3, var2, var3);
        SecP160R1Field.squareN(var3, 64, var2);
        SecP160R1Field.multiply(var2, var3, var2);
        SecP160R1Field.square(var2, var3);
        SecP160R1Field.multiply(var3, var1, var3);
        SecP160R1Field.squareN(var3, 29, var3);
        SecP160R1Field.square(var3, var2);
        return Nat160.eq(var1, var2) ? new SecP160R1FieldElement(var3) : null;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R1FieldElement)) {
            SecP160R1FieldElement var2 = (SecP160R1FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecP160R1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.x = SecP160R1Field.fromBigInteger(arg0);
    }

    public boolean gm(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R1FieldElement)) {
            SecP160R1FieldElement var2 = (SecP160R1FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement square() {
        int[] var1 = Nat160.create();
        SecP160R1Field.square(this.x, var1);
        return new SecP160R1FieldElement(var1);
    }

    public boolean gq(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R1FieldElement)) {
            SecP160R1FieldElement var2 = (SecP160R1FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean gk(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R1FieldElement)) {
            SecP160R1FieldElement var2 = (SecP160R1FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public int aht() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 5);
    }

    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.x);
    }
}
