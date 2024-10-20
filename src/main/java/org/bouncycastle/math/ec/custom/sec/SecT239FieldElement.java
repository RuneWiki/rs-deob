package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

public class SecT239FieldElement extends ECFieldElement {

    public long[] x;

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public SecT239FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public SecT239FieldElement() {
        this.x = Nat256.create64();
    }

    public boolean isZero() {
        return Nat256.isZero64(this.x);
    }

    public boolean hd(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT239FieldElement)) {
            SecT239FieldElement var2 = (SecT239FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public BigInteger toBigInteger() {
        return Nat256.toBigInteger64(this.x);
    }

    public String getFieldName() {
        return "SecT239Field";
    }

    public int getFieldSize() {
        return 239;
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat256.create64();
        SecT239Field.add(this.x, ((SecT239FieldElement) arg0).x, var2);
        return new SecT239FieldElement(var2);
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat256.create64();
        SecT239Field.addOne(this.x, var1);
        return new SecT239FieldElement(var1);
    }

    public int getK2() {
        return 0;
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat256.create64();
        SecT239Field.multiply(this.x, ((SecT239FieldElement) arg0).x, var2);
        return new SecT239FieldElement(var2);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT239FieldElement) arg0).x;
        long[] var6 = ((SecT239FieldElement) arg1).x;
        long[] var7 = ((SecT239FieldElement) arg2).x;
        long[] var8 = Nat256.createExt64();
        SecT239Field.multiplyAddToExt(var4, var5, var8);
        SecT239Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat256.create64();
        SecT239Field.reduce(var8, var9);
        return new SecT239FieldElement(var9);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public ECFieldElement negate() {
        return this;
    }

    public boolean isOne() {
        return Nat256.isOne64(this.x);
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public int getRepresentation() {
        return 2;
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat256.create64();
            SecT239Field.squareN(this.x, arg0, var2);
            return new SecT239FieldElement(var2);
        }
    }

    public ECFieldElement invert() {
        long[] var1 = Nat256.create64();
        SecT239Field.invert(this.x, var1);
        return new SecT239FieldElement(var1);
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat256.create64();
        SecT239Field.sqrt(this.x, var1);
        return new SecT239FieldElement(var1);
    }

    public boolean hb(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT239FieldElement)) {
            SecT239FieldElement var2 = (SecT239FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int getM() {
        return 239;
    }

    public int getK1() {
        return 158;
    }

    public ECFieldElement square() {
        long[] var1 = Nat256.create64();
        SecT239Field.square(this.x, var1);
        return new SecT239FieldElement(var1);
    }

    public int getK3() {
        return 0;
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT239FieldElement) arg0).x;
        long[] var5 = ((SecT239FieldElement) arg1).x;
        long[] var6 = Nat256.createExt64();
        SecT239Field.squareAddToExt(var3, var6);
        SecT239Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat256.create64();
        SecT239Field.reduce(var6, var7);
        return new SecT239FieldElement(var7);
    }

    public int hashCode() {
        return 0x16CAFFE ^ Arrays.hashCode((long[]) this.x, 0, 4);
    }

    public boolean hr(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT239FieldElement)) {
            SecT239FieldElement var2 = (SecT239FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT239FieldElement)) {
            SecT239FieldElement var2 = (SecT239FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean hn(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT239FieldElement)) {
            SecT239FieldElement var2 = (SecT239FieldElement) arg0;
            return Nat256.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public SecT239FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.x = SecT239Field.fromBigInteger(arg0);
    }

    public int akk() {
        return 0x16CAFFE ^ Arrays.hashCode((long[]) this.x, 0, 4);
    }

    public int ake() {
        return 0x16CAFFE ^ Arrays.hashCode((long[]) this.x, 0, 4);
    }
}
