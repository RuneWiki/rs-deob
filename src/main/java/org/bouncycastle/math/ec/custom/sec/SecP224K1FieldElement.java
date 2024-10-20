package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Arrays;

public class SecP224K1FieldElement extends ECFieldElement {

    public static final BigInteger Q = SecP224K1Curve.q;

    public static final int[] PRECOMP_POW2 = new int[] { 868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644 };

    public int[] x;

    public SecP224K1FieldElement() {
        this.x = Nat224.create();
    }

    public SecP224K1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public boolean isZero() {
        return Nat224.isZero(this.x);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP224K1FieldElement)) {
            SecP224K1FieldElement var2 = (SecP224K1FieldElement) arg0;
            return Nat224.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean gd(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP224K1FieldElement)) {
            SecP224K1FieldElement var2 = (SecP224K1FieldElement) arg0;
            return Nat224.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.x);
    }

    public ECFieldElement invert() {
        int[] var1 = Nat224.create();
        Mod.invert(SecP224K1Field.P, this.x, var1);
        return new SecP224K1FieldElement(var1);
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat224.isZero(var1) || Nat224.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat224.create();
        SecP224K1Field.square(var1, var2);
        SecP224K1Field.multiply(var2, var1, var2);
        SecP224K1Field.square(var2, var2);
        SecP224K1Field.multiply(var2, var1, var2);
        int[] var4 = Nat224.create();
        SecP224K1Field.square(var2, var4);
        SecP224K1Field.multiply(var4, var1, var4);
        int[] var5 = Nat224.create();
        SecP224K1Field.squareN(var4, 4, var5);
        SecP224K1Field.multiply(var5, var4, var5);
        int[] var6 = Nat224.create();
        SecP224K1Field.squareN(var5, 3, var6);
        SecP224K1Field.multiply(var6, var2, var6);
        SecP224K1Field.squareN(var6, 8, var6);
        SecP224K1Field.multiply(var6, var5, var6);
        SecP224K1Field.squareN(var6, 4, var5);
        SecP224K1Field.multiply(var5, var4, var5);
        SecP224K1Field.squareN(var5, 19, var4);
        SecP224K1Field.multiply(var4, var6, var4);
        int[] var10 = Nat224.create();
        SecP224K1Field.squareN(var4, 42, var10);
        SecP224K1Field.multiply(var10, var4, var10);
        SecP224K1Field.squareN(var10, 23, var4);
        SecP224K1Field.multiply(var4, var5, var4);
        SecP224K1Field.squareN(var4, 84, var5);
        SecP224K1Field.multiply(var5, var10, var5);
        SecP224K1Field.squareN(var5, 20, var5);
        SecP224K1Field.multiply(var5, var6, var5);
        SecP224K1Field.squareN(var5, 3, var5);
        SecP224K1Field.multiply(var5, var1, var5);
        SecP224K1Field.squareN(var5, 2, var5);
        SecP224K1Field.multiply(var5, var1, var5);
        SecP224K1Field.squareN(var5, 4, var5);
        SecP224K1Field.multiply(var5, var2, var5);
        SecP224K1Field.square(var5, var5);
        SecP224K1Field.square(var5, var10);
        if (Nat224.eq(var1, var10)) {
            return new SecP224K1FieldElement(var5);
        } else {
            SecP224K1Field.multiply(var5, PRECOMP_POW2, var5);
            SecP224K1Field.square(var5, var10);
            return Nat224.eq(var1, var10) ? new SecP224K1FieldElement(var5) : null;
        }
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat224.create();
        SecP224K1Field.addOne(this.x, var1);
        return new SecP224K1FieldElement(var1);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat224.create();
        SecP224K1Field.subtract(this.x, ((SecP224K1FieldElement) arg0).x, var2);
        return new SecP224K1FieldElement(var2);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat224.create();
        SecP224K1Field.multiply(this.x, ((SecP224K1FieldElement) arg0).x, var2);
        return new SecP224K1FieldElement(var2);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat224.create();
        Mod.invert(SecP224K1Field.P, ((SecP224K1FieldElement) arg0).x, var2);
        SecP224K1Field.multiply(var2, this.x, var2);
        return new SecP224K1FieldElement(var2);
    }

    public ECFieldElement negate() {
        int[] var1 = Nat224.create();
        SecP224K1Field.negate(this.x, var1);
        return new SecP224K1FieldElement(var1);
    }

    public ECFieldElement square() {
        int[] var1 = Nat224.create();
        SecP224K1Field.square(this.x, var1);
        return new SecP224K1FieldElement(var1);
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat224.create();
        SecP224K1Field.add(this.x, ((SecP224K1FieldElement) arg0).x, var2);
        return new SecP224K1FieldElement(var2);
    }

    public boolean testBitZero() {
        return Nat224.getBit(this.x, 0) == 1;
    }

    public boolean isOne() {
        return Nat224.isOne(this.x);
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }

    public String getFieldName() {
        return "SecP224K1Field";
    }

    public boolean fk(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP224K1FieldElement)) {
            SecP224K1FieldElement var2 = (SecP224K1FieldElement) arg0;
            return Nat224.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean gw(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP224K1FieldElement)) {
            SecP224K1FieldElement var2 = (SecP224K1FieldElement) arg0;
            return Nat224.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecP224K1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.x = SecP224K1Field.fromBigInteger(arg0);
    }

    public int ahf() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }

    public int ahi() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }
}
