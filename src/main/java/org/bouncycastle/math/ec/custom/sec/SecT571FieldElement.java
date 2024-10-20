package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat576;
import org.bouncycastle.util.Arrays;

public class SecT571FieldElement extends ECFieldElement {

    public long[] x;

    public int getFieldSize() {
        return 571;
    }

    public SecT571FieldElement() {
        this.x = Nat576.create64();
    }

    public SecT571FieldElement(long[] arg0) {
        this.x = arg0;
    }

    public boolean bz(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT571FieldElement)) {
            SecT571FieldElement var2 = (SecT571FieldElement) arg0;
            return Nat576.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean isZero() {
        return Nat576.isZero64(this.x);
    }

    public boolean testBitZero() {
        return (this.x[0] & 0x1L) != 0L;
    }

    public BigInteger toBigInteger() {
        return Nat576.toBigInteger64(this.x);
    }

    public String getFieldName() {
        return "SecT571Field";
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        long[] var4 = this.x;
        long[] var5 = ((SecT571FieldElement) arg0).x;
        long[] var6 = ((SecT571FieldElement) arg1).x;
        long[] var7 = ((SecT571FieldElement) arg2).x;
        long[] var8 = Nat576.createExt64();
        SecT571Field.multiplyAddToExt(var4, var5, var8);
        SecT571Field.multiplyAddToExt(var6, var7, var8);
        long[] var9 = Nat576.create64();
        SecT571Field.reduce(var8, var9);
        return new SecT571FieldElement(var9);
    }

    public SecT571FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.x = SecT571Field.fromBigInteger(arg0);
    }

    public ECFieldElement add(ECFieldElement arg0) {
        long[] var2 = Nat576.create64();
        SecT571Field.add(this.x, ((SecT571FieldElement) arg0).x, var2);
        return new SecT571FieldElement(var2);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        return this.add(arg0);
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        long[] var2 = Nat576.create64();
        SecT571Field.multiply(this.x, ((SecT571FieldElement) arg0).x, var2);
        return new SecT571FieldElement(var2);
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiplyPlusProduct(arg0, arg1, arg2);
    }

    public ECFieldElement addOne() {
        long[] var1 = Nat576.create64();
        SecT571Field.addOne(this.x, var1);
        return new SecT571FieldElement(var1);
    }

    public int getK2() {
        return 5;
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement square() {
        long[] var1 = Nat576.create64();
        SecT571Field.square(this.x, var1);
        return new SecT571FieldElement(var1);
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.squarePlusProduct(arg0, arg1);
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        long[] var3 = this.x;
        long[] var4 = ((SecT571FieldElement) arg0).x;
        long[] var5 = ((SecT571FieldElement) arg1).x;
        long[] var6 = Nat576.createExt64();
        SecT571Field.squareAddToExt(var3, var6);
        SecT571Field.multiplyAddToExt(var4, var5, var6);
        long[] var7 = Nat576.create64();
        SecT571Field.reduce(var6, var7);
        return new SecT571FieldElement(var7);
    }

    public ECFieldElement sqrt() {
        long[] var1 = Nat576.create64();
        SecT571Field.sqrt(this.x, var1);
        return new SecT571FieldElement(var1);
    }

    public ECFieldElement invert() {
        long[] var1 = Nat576.create64();
        SecT571Field.invert(this.x, var1);
        return new SecT571FieldElement(var1);
    }

    public int getRepresentation() {
        return 3;
    }

    public boolean isOne() {
        return Nat576.isOne64(this.x);
    }

    public int getM() {
        return 571;
    }

    public int getK1() {
        return 2;
    }

    public ECFieldElement squarePow(int arg0) {
        if (arg0 < 1) {
            return this;
        } else {
            long[] var2 = Nat576.create64();
            SecT571Field.squareN(this.x, arg0, var2);
            return new SecT571FieldElement(var2);
        }
    }

    public int getK3() {
        return 10;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT571FieldElement)) {
            SecT571FieldElement var2 = (SecT571FieldElement) arg0;
            return Nat576.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean bt(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT571FieldElement)) {
            SecT571FieldElement var2 = (SecT571FieldElement) arg0;
            return Nat576.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public boolean af(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecT571FieldElement)) {
            SecT571FieldElement var2 = (SecT571FieldElement) arg0;
            return Nat576.eq64(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return 0x5724CC ^ Arrays.hashCode((long[]) this.x, 0, 9);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        return this.multiply(arg0.invert());
    }

    public int ace() {
        return 0x5724CC ^ Arrays.hashCode((long[]) this.x, 0, 9);
    }

    public int acz() {
        return 0x2A656692 ^ Arrays.hashCode((long[]) this.x, 0, 9);
    }
}
