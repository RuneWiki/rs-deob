package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;

public class SecP192R1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP192R1Curve.q;

    public boolean isOne() {
        return Nat192.isOne(this.x);
    }

    public SecP192R1FieldElement() {
        this.x = Nat192.create();
    }

    public SecP192R1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public boolean isZero() {
        return Nat192.isZero(this.x);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat192.create();
        SecP192R1Field.addOne(this.x, var1);
        return new SecP192R1FieldElement(var1);
    }

    public boolean testBitZero() {
        return Nat192.getBit(this.x, 0) == 1;
    }

    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.x);
    }

    public boolean hn(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP192R1FieldElement)) {
            SecP192R1FieldElement var2 = (SecP192R1FieldElement) arg0;
            return Nat192.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat192.create();
        SecP192R1Field.add(this.x, ((SecP192R1FieldElement) arg0).x, var2);
        return new SecP192R1FieldElement(var2);
    }

    public boolean hr(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP192R1FieldElement)) {
            SecP192R1FieldElement var2 = (SecP192R1FieldElement) arg0;
            return Nat192.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat192.create();
        SecP192R1Field.multiply(this.x, ((SecP192R1FieldElement) arg0).x, var2);
        return new SecP192R1FieldElement(var2);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat192.create();
        Mod.invert(SecP192R1Field.P, ((SecP192R1FieldElement) arg0).x, var2);
        SecP192R1Field.multiply(var2, this.x, var2);
        return new SecP192R1FieldElement(var2);
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 6);
    }

    public ECFieldElement square() {
        int[] var1 = Nat192.create();
        SecP192R1Field.square(this.x, var1);
        return new SecP192R1FieldElement(var1);
    }

    public ECFieldElement invert() {
        int[] var1 = Nat192.create();
        Mod.invert(SecP192R1Field.P, this.x, var1);
        return new SecP192R1FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat192.isZero(var1) || Nat192.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat192.create();
        int[] var3 = Nat192.create();
        SecP192R1Field.square(var1, var2);
        SecP192R1Field.multiply(var2, var1, var2);
        SecP192R1Field.squareN(var2, 2, var3);
        SecP192R1Field.multiply(var3, var2, var3);
        SecP192R1Field.squareN(var3, 4, var2);
        SecP192R1Field.multiply(var2, var3, var2);
        SecP192R1Field.squareN(var2, 8, var3);
        SecP192R1Field.multiply(var3, var2, var3);
        SecP192R1Field.squareN(var3, 16, var2);
        SecP192R1Field.multiply(var2, var3, var2);
        SecP192R1Field.squareN(var2, 32, var3);
        SecP192R1Field.multiply(var3, var2, var3);
        SecP192R1Field.squareN(var3, 64, var2);
        SecP192R1Field.multiply(var2, var3, var2);
        SecP192R1Field.squareN(var2, 62, var2);
        SecP192R1Field.square(var2, var3);
        return Nat192.eq(var1, var3) ? new SecP192R1FieldElement(var2) : null;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP192R1FieldElement)) {
            SecP192R1FieldElement var2 = (SecP192R1FieldElement) arg0;
            return Nat192.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat192.create();
        SecP192R1Field.subtract(this.x, ((SecP192R1FieldElement) arg0).x, var2);
        return new SecP192R1FieldElement(var2);
    }

    public ECFieldElement negate() {
        int[] var1 = Nat192.create();
        SecP192R1Field.negate(this.x, var1);
        return new SecP192R1FieldElement(var1);
    }

    public boolean hd(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP192R1FieldElement)) {
            SecP192R1FieldElement var2 = (SecP192R1FieldElement) arg0;
            return Nat192.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public String getFieldName() {
        return "SecP192R1Field";
    }

    public SecP192R1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.x = SecP192R1Field.fromBigInteger(arg0);
    }

    public boolean hb(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP192R1FieldElement)) {
            SecP192R1FieldElement var2 = (SecP192R1FieldElement) arg0;
            return Nat192.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int akk() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 6);
    }

    public int ake() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 6);
    }
}
