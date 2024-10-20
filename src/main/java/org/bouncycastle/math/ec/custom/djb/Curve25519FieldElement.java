package org.bouncycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class Curve25519FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = Curve25519.q;

    public static final int[] PRECOMP_POW2 = new int[] { 1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848 };

    public Curve25519FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.x = Curve25519Field.fromBigInteger(arg0);
    }

    public Curve25519FieldElement() {
        this.x = Nat256.create();
    }

    public ECFieldElement negate() {
        int[] var1 = Nat256.create();
        Curve25519Field.negate(this.x, var1);
        return new Curve25519FieldElement(var1);
    }

    public boolean isZero() {
        return Nat256.isZero(this.x);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat256.create();
        Curve25519Field.addOne(this.x, var1);
        return new Curve25519FieldElement(var1);
    }

    public boolean testBitZero() {
        return Nat256.getBit(this.x, 0) == 1;
    }

    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.x);
    }

    public boolean isOne() {
        return Nat256.isOne(this.x);
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        Curve25519Field.add(this.x, ((Curve25519FieldElement) arg0).x, var2);
        return new Curve25519FieldElement(var2);
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 8);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        Curve25519Field.subtract(this.x, ((Curve25519FieldElement) arg0).x, var2);
        return new Curve25519FieldElement(var2);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        Curve25519Field.multiply(this.x, ((Curve25519FieldElement) arg0).x, var2);
        return new Curve25519FieldElement(var2);
    }

    public Curve25519FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        Mod.invert(Curve25519Field.P, ((Curve25519FieldElement) arg0).x, var2);
        Curve25519Field.multiply(var2, this.x, var2);
        return new Curve25519FieldElement(var2);
    }

    public ECFieldElement square() {
        int[] var1 = Nat256.create();
        Curve25519Field.square(this.x, var1);
        return new Curve25519FieldElement(var1);
    }

    public String getFieldName() {
        return "Curve25519Field";
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat256.isZero(var1) || Nat256.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat256.create();
        Curve25519Field.square(var1, var2);
        Curve25519Field.multiply(var2, var1, var2);
        Curve25519Field.square(var2, var2);
        Curve25519Field.multiply(var2, var1, var2);
        int[] var4 = Nat256.create();
        Curve25519Field.square(var2, var4);
        Curve25519Field.multiply(var4, var1, var4);
        int[] var5 = Nat256.create();
        Curve25519Field.squareN(var4, 3, var5);
        Curve25519Field.multiply(var5, var2, var5);
        Curve25519Field.squareN(var5, 4, var2);
        Curve25519Field.multiply(var2, var4, var2);
        Curve25519Field.squareN(var2, 4, var5);
        Curve25519Field.multiply(var5, var4, var5);
        Curve25519Field.squareN(var5, 15, var4);
        Curve25519Field.multiply(var4, var5, var4);
        Curve25519Field.squareN(var4, 30, var5);
        Curve25519Field.multiply(var5, var4, var5);
        Curve25519Field.squareN(var5, 60, var4);
        Curve25519Field.multiply(var4, var5, var4);
        Curve25519Field.squareN(var4, 11, var5);
        Curve25519Field.multiply(var5, var2, var5);
        Curve25519Field.squareN(var5, 120, var2);
        Curve25519Field.multiply(var2, var4, var2);
        Curve25519Field.square(var2, var2);
        Curve25519Field.square(var2, var4);
        if (Nat256.eq(var1, var4)) {
            return new Curve25519FieldElement(var2);
        } else {
            Curve25519Field.multiply(var2, PRECOMP_POW2, var2);
            Curve25519Field.square(var2, var4);
            return Nat256.eq(var1, var4) ? new Curve25519FieldElement(var2) : null;
        }
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof Curve25519FieldElement)) {
            Curve25519FieldElement var2 = (Curve25519FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean gl(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof Curve25519FieldElement)) {
            Curve25519FieldElement var2 = (Curve25519FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean ge(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof Curve25519FieldElement)) {
            Curve25519FieldElement var2 = (Curve25519FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement invert() {
        int[] var1 = Nat256.create();
        Mod.invert(Curve25519Field.P, this.x, var1);
        return new Curve25519FieldElement(var1);
    }

    public int ahv() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 8);
    }
}
