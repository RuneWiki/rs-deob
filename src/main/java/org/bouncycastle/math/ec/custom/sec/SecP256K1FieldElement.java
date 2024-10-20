package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class SecP256K1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP256K1Curve.q;

    public String getFieldName() {
        return "SecP256K1Field";
    }

    public SecP256K1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public int akk() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 8);
    }

    public boolean isZero() {
        return Nat256.isZero(this.x);
    }

    public boolean isOne() {
        return Nat256.isOne(this.x);
    }

    public boolean testBitZero() {
        return Nat256.getBit(this.x, 0) == 1;
    }

    public ECFieldElement negate() {
        int[] var1 = Nat256.create();
        SecP256K1Field.negate(this.x, var1);
        return new SecP256K1FieldElement(var1);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256K1FieldElement)) {
            SecP256K1FieldElement var2 = (SecP256K1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecP256K1FieldElement() {
        this.x = Nat256.create();
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        SecP256K1Field.add(this.x, ((SecP256K1FieldElement) arg0).x, var2);
        return new SecP256K1FieldElement(var2);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat256.create();
        SecP256K1Field.addOne(this.x, var1);
        return new SecP256K1FieldElement(var1);
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        SecP256K1Field.multiply(this.x, ((SecP256K1FieldElement) arg0).x, var2);
        return new SecP256K1FieldElement(var2);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        Mod.invert(SecP256K1Field.P, ((SecP256K1FieldElement) arg0).x, var2);
        SecP256K1Field.multiply(var2, this.x, var2);
        return new SecP256K1FieldElement(var2);
    }

    public ECFieldElement square() {
        int[] var1 = Nat256.create();
        SecP256K1Field.square(this.x, var1);
        return new SecP256K1FieldElement(var1);
    }

    public boolean hd(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256K1FieldElement)) {
            SecP256K1FieldElement var2 = (SecP256K1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public ECFieldElement invert() {
        int[] var1 = Nat256.create();
        Mod.invert(SecP256K1Field.P, this.x, var1);
        return new SecP256K1FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat256.isZero(var1) || Nat256.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat256.create();
        SecP256K1Field.square(var1, var2);
        SecP256K1Field.multiply(var2, var1, var2);
        int[] var3 = Nat256.create();
        SecP256K1Field.square(var2, var3);
        SecP256K1Field.multiply(var3, var1, var3);
        int[] var4 = Nat256.create();
        SecP256K1Field.squareN(var3, 3, var4);
        SecP256K1Field.multiply(var4, var3, var4);
        SecP256K1Field.squareN(var4, 3, var4);
        SecP256K1Field.multiply(var4, var3, var4);
        SecP256K1Field.squareN(var4, 2, var4);
        SecP256K1Field.multiply(var4, var2, var4);
        int[] var7 = Nat256.create();
        SecP256K1Field.squareN(var4, 11, var7);
        SecP256K1Field.multiply(var7, var4, var7);
        SecP256K1Field.squareN(var7, 22, var4);
        SecP256K1Field.multiply(var4, var7, var4);
        int[] var9 = Nat256.create();
        SecP256K1Field.squareN(var4, 44, var9);
        SecP256K1Field.multiply(var9, var4, var9);
        int[] var10 = Nat256.create();
        SecP256K1Field.squareN(var9, 88, var10);
        SecP256K1Field.multiply(var10, var9, var10);
        SecP256K1Field.squareN(var10, 44, var9);
        SecP256K1Field.multiply(var9, var4, var9);
        SecP256K1Field.squareN(var9, 3, var4);
        SecP256K1Field.multiply(var4, var3, var4);
        SecP256K1Field.squareN(var4, 23, var4);
        SecP256K1Field.multiply(var4, var7, var4);
        SecP256K1Field.squareN(var4, 6, var4);
        SecP256K1Field.multiply(var4, var2, var4);
        SecP256K1Field.squareN(var4, 2, var4);
        SecP256K1Field.square(var4, var2);
        return Nat256.eq(var1, var2) ? new SecP256K1FieldElement(var4) : null;
    }

    public SecP256K1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.x = SecP256K1Field.fromBigInteger(arg0);
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 8);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat256.create();
        SecP256K1Field.subtract(this.x, ((SecP256K1FieldElement) arg0).x, var2);
        return new SecP256K1FieldElement(var2);
    }

    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.x);
    }

    public boolean hr(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256K1FieldElement)) {
            SecP256K1FieldElement var2 = (SecP256K1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean hn(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256K1FieldElement)) {
            SecP256K1FieldElement var2 = (SecP256K1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean hb(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP256K1FieldElement)) {
            SecP256K1FieldElement var2 = (SecP256K1FieldElement) arg0;
            return Nat256.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int ake() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 8);
    }
}
