package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Arrays;

public class SecP160R2FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP160R2Curve.q;

    public String getFieldName() {
        return "SecP160R2Field";
    }

    public SecP160R2FieldElement() {
        this.x = Nat160.create();
    }

    public SecP160R2FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public boolean testBitZero() {
        return Nat160.getBit(this.x, 0) == 1;
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat160.create();
        SecP160R2Field.subtract(this.x, ((SecP160R2FieldElement) arg0).x, var2);
        return new SecP160R2FieldElement(var2);
    }

    public boolean isOne() {
        return Nat160.isOne(this.x);
    }

    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.x);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat160.create();
        Mod.invert(SecP160R2Field.P, ((SecP160R2FieldElement) arg0).x, var2);
        SecP160R2Field.multiply(var2, this.x, var2);
        return new SecP160R2FieldElement(var2);
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat160.create();
        SecP160R2Field.add(this.x, ((SecP160R2FieldElement) arg0).x, var2);
        return new SecP160R2FieldElement(var2);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat160.create();
        SecP160R2Field.multiply(this.x, ((SecP160R2FieldElement) arg0).x, var2);
        return new SecP160R2FieldElement(var2);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat160.create();
        SecP160R2Field.addOne(this.x, var1);
        return new SecP160R2FieldElement(var1);
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 5);
    }

    public boolean isZero() {
        return Nat160.isZero(this.x);
    }

    public SecP160R2FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.x = SecP160R2Field.fromBigInteger(arg0);
    }

    public ECFieldElement square() {
        int[] var1 = Nat160.create();
        SecP160R2Field.square(this.x, var1);
        return new SecP160R2FieldElement(var1);
    }

    public ECFieldElement invert() {
        int[] var1 = Nat160.create();
        Mod.invert(SecP160R2Field.P, this.x, var1);
        return new SecP160R2FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat160.isZero(var1) || Nat160.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat160.create();
        SecP160R2Field.square(var1, var2);
        SecP160R2Field.multiply(var2, var1, var2);
        int[] var3 = Nat160.create();
        SecP160R2Field.square(var2, var3);
        SecP160R2Field.multiply(var3, var1, var3);
        int[] var4 = Nat160.create();
        SecP160R2Field.square(var3, var4);
        SecP160R2Field.multiply(var4, var1, var4);
        int[] var5 = Nat160.create();
        SecP160R2Field.squareN(var4, 3, var5);
        SecP160R2Field.multiply(var5, var3, var5);
        SecP160R2Field.squareN(var5, 7, var4);
        SecP160R2Field.multiply(var4, var5, var4);
        SecP160R2Field.squareN(var4, 3, var5);
        SecP160R2Field.multiply(var5, var3, var5);
        int[] var8 = Nat160.create();
        SecP160R2Field.squareN(var5, 14, var8);
        SecP160R2Field.multiply(var8, var4, var8);
        SecP160R2Field.squareN(var8, 31, var4);
        SecP160R2Field.multiply(var4, var8, var4);
        SecP160R2Field.squareN(var4, 62, var8);
        SecP160R2Field.multiply(var8, var4, var8);
        SecP160R2Field.squareN(var8, 3, var4);
        SecP160R2Field.multiply(var4, var3, var4);
        SecP160R2Field.squareN(var4, 18, var4);
        SecP160R2Field.multiply(var4, var5, var4);
        SecP160R2Field.squareN(var4, 2, var4);
        SecP160R2Field.multiply(var4, var1, var4);
        SecP160R2Field.squareN(var4, 3, var4);
        SecP160R2Field.multiply(var4, var2, var4);
        SecP160R2Field.squareN(var4, 6, var4);
        SecP160R2Field.multiply(var4, var3, var4);
        SecP160R2Field.squareN(var4, 2, var4);
        SecP160R2Field.multiply(var4, var1, var4);
        SecP160R2Field.square(var4, var2);
        return Nat160.eq(var1, var2) ? new SecP160R2FieldElement(var4) : null;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R2FieldElement)) {
            SecP160R2FieldElement var2 = (SecP160R2FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement negate() {
        int[] var1 = Nat160.create();
        SecP160R2Field.negate(this.x, var1);
        return new SecP160R2FieldElement(var1);
    }

    public boolean gz(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R2FieldElement)) {
            SecP160R2FieldElement var2 = (SecP160R2FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean go(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R2FieldElement)) {
            SecP160R2FieldElement var2 = (SecP160R2FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean gx(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP160R2FieldElement)) {
            SecP160R2FieldElement var2 = (SecP160R2FieldElement) arg0;
            return Nat160.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int akj() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 5);
    }

    public int akm() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 5);
    }

    public int akx() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 5);
    }
}
