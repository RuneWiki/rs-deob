package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.Arrays;

public class SecP128R1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP128R1Curve.q;

    public int adf() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 4);
    }

    public SecP128R1FieldElement() {
        this.x = Nat128.create();
    }

    public SecP128R1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public boolean isZero() {
        return Nat128.isZero(this.x);
    }

    public boolean isOne() {
        return Nat128.isOne(this.x);
    }

    public boolean testBitZero() {
        return Nat128.getBit(this.x, 0) == 1;
    }

    public BigInteger toBigInteger() {
        return Nat128.toBigInteger(this.x);
    }

    public ECFieldElement negate() {
        int[] var1 = Nat128.create();
        SecP128R1Field.negate(this.x, var1);
        return new SecP128R1FieldElement(var1);
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public SecP128R1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.x = SecP128R1Field.fromBigInteger(arg0);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat128.create();
        SecP128R1Field.addOne(this.x, var1);
        return new SecP128R1FieldElement(var1);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat128.create();
        SecP128R1Field.subtract(this.x, ((SecP128R1FieldElement) arg0).x, var2);
        return new SecP128R1FieldElement(var2);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat128.create();
        SecP128R1Field.multiply(this.x, ((SecP128R1FieldElement) arg0).x, var2);
        return new SecP128R1FieldElement(var2);
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat128.create();
        SecP128R1Field.add(this.x, ((SecP128R1FieldElement) arg0).x, var2);
        return new SecP128R1FieldElement(var2);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat128.create();
        Mod.invert(SecP128R1Field.P, ((SecP128R1FieldElement) arg0).x, var2);
        SecP128R1Field.multiply(var2, this.x, var2);
        return new SecP128R1FieldElement(var2);
    }

    public ECFieldElement square() {
        int[] var1 = Nat128.create();
        SecP128R1Field.square(this.x, var1);
        return new SecP128R1FieldElement(var1);
    }

    public ECFieldElement invert() {
        int[] var1 = Nat128.create();
        Mod.invert(SecP128R1Field.P, this.x, var1);
        return new SecP128R1FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat128.isZero(var1) || Nat128.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat128.create();
        SecP128R1Field.square(var1, var2);
        SecP128R1Field.multiply(var2, var1, var2);
        int[] var3 = Nat128.create();
        SecP128R1Field.squareN(var2, 2, var3);
        SecP128R1Field.multiply(var3, var2, var3);
        int[] var4 = Nat128.create();
        SecP128R1Field.squareN(var3, 4, var4);
        SecP128R1Field.multiply(var4, var3, var4);
        SecP128R1Field.squareN(var4, 2, var3);
        SecP128R1Field.multiply(var3, var2, var3);
        SecP128R1Field.squareN(var3, 10, var2);
        SecP128R1Field.multiply(var2, var3, var2);
        SecP128R1Field.squareN(var2, 10, var4);
        SecP128R1Field.multiply(var4, var3, var4);
        SecP128R1Field.square(var4, var3);
        SecP128R1Field.multiply(var3, var1, var3);
        SecP128R1Field.squareN(var3, 95, var3);
        SecP128R1Field.square(var3, var4);
        return Nat128.eq(var1, var4) ? new SecP128R1FieldElement(var3) : null;
    }

    public String getFieldName() {
        return "SecP128R1Field";
    }

    public int ade() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 4);
    }

    public boolean be(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP128R1FieldElement)) {
            SecP128R1FieldElement var2 = (SecP128R1FieldElement) arg0;
            return Nat128.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 4);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP128R1FieldElement)) {
            SecP128R1FieldElement var2 = (SecP128R1FieldElement) arg0;
            return Nat128.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int ada() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 4);
    }
}
