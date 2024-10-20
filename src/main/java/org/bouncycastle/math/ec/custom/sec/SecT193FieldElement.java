package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class SecT193FieldElement extends ECFieldElement {

    public long[] x;

    public SecT193FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.x = SecT193Field.fromBigInteger(arg0);
    }

    public boolean af(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT193FieldElement)) {
            SecT193FieldElement var2 = (SecT193FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecT193FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public boolean isOne() {
        return Nat256.isOne64(this.x);
    }

    public int getFieldSize() {
        return 193;
    }

    public boolean bt(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT193FieldElement)) {
            SecT193FieldElement var2 = (SecT193FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public BigInteger toBigInteger() {
        return Nat256.toBigInteger64(this.x);
    }

    public String getFieldName() {
        return "SecT193Field";
    }

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat256.create64();
        SecT193Field.add(this.x, ((SecT193FieldElement) arg0).x, var2);
        return new SecT193FieldElement(var2);
    }

    public int getK2() {
        return 0;
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat256.create64();
        SecT193Field.multiply(this.x, ((SecT193FieldElement) arg0).x, var2);
        return new SecT193FieldElement(var2);
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT193FieldElement) arg0).x;
        long[] var6 = ((SecT193FieldElement) arg1).x;
        long[] var7 = ((SecT193FieldElement) arg2).x;
        long[] var8 = Nat256.createExt64();
        SecT193Field.multiplyAddToExt(var4, var5, var8);
        SecT193Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat256.create64();
        SecT193Field.reduce(var8, var9);
        return new SecT193FieldElement(var9);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat256.create64();
        SecT193Field.addOne(this.x, var1);
        return new SecT193FieldElement(var1);
    }

    public ECFieldElement square() {
        long[] var1 = Nat256.create64();
        SecT193Field.square(this.x, var1);
        return new SecT193FieldElement(var1);
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT193FieldElement) arg0).x;
        long[] var5 = ((SecT193FieldElement) arg1).x;
        long[] var6 = Nat256.createExt64();
        SecT193Field.squareAddToExt(var3, var6);
        SecT193Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat256.create64();
        SecT193Field.reduce(var6, var7);
        return new SecT193FieldElement(var7);
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat256.create64();
            SecT193Field.squareN(this.x, arg0, var2);
            return new SecT193FieldElement(var2);
        }
    }

    public ECFieldElement invert() {
        long[] var1 = Nat256.create64();
        SecT193Field.invert(this.x, var1);
        return new SecT193FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat256.create64();
        SecT193Field.sqrt(this.x, var1);
        return new SecT193FieldElement(var1);
    }

    public int getRepresentation() {
        return 2;
    }

    public int getM() {
        return 193;
    }

    public int getK1() {
        return 15;
    }

    public boolean bz(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT193FieldElement)) {
            SecT193FieldElement var2 = (SecT193FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int getK3() {
        return 0;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT193FieldElement)) {
            SecT193FieldElement var2 = (SecT193FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return 0x1D731F ^ Arrays.hashCode((long[]) this.x, 0, 4);
    }

    public int ace() {
        return 0x1D731F ^ Arrays.hashCode((long[]) this.x, 0, 4);
    }

    public SecT193FieldElement() {
        this.x = Nat256.create64();
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public int acz() {
        return 0x1D731F ^ Arrays.hashCode((long[]) this.x, 0, 4);
    }

    public boolean isZero() {
        return Nat256.isZero64(this.x);
    }
}
