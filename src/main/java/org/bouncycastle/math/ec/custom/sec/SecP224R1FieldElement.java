package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Arrays;

public class SecP224R1FieldElement extends ECFieldElement {

    public int[] x;

    public static final BigInteger Q = SecP224R1Curve.q;

    public SecP224R1FieldElement(int[] arg0) {
        this.x = arg0;
    }

    public SecP224R1FieldElement() {
        this.x = Nat224.create();
    }

    public int getFieldSize() {
        return Q.bitLength();
    }

    public boolean isZero() {
        return Nat224.isZero(this.x);
    }

    public boolean isOne() {
        return Nat224.isOne(this.x);
    }

    public ECFieldElement subtract(ECFieldElement arg0) {
        int[] var2 = Nat224.create();
        SecP224R1Field.subtract(this.x, ((SecP224R1FieldElement) arg0).x, var2);
        return new SecP224R1FieldElement(var2);
    }

    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.x);
    }

    public static void RP(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        Nat224.copy(arg0, arg3);
        int[] var5 = Nat224.create();
        int[] var6 = Nat224.create();
        for (int var7 = 0; var7 < 7; var7++) {
            Nat224.copy(arg1, var5);
            Nat224.copy(arg2, var6);
            int var8 = 0x1 << var7;
            while (true) {
                var8--;
                if (var8 < 0) {
                    RM(arg0, var5, var6, arg1, arg2, arg3, arg4);
                    break;
                }
                RS(arg1, arg2, arg3, arg4);
            }
        }
    }

    public int amb() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }

    public ECFieldElement add(ECFieldElement arg0) {
        int[] var2 = Nat224.create();
        SecP224R1Field.add(this.x, ((SecP224R1FieldElement) arg0).x, var2);
        return new SecP224R1FieldElement(var2);
    }

    public int ams() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }

    public boolean testBitZero() {
        return Nat224.getBit(this.x, 0) == 1;
    }

    public ECFieldElement multiply(ECFieldElement arg0) {
        int[] var2 = Nat224.create();
        SecP224R1Field.multiply(this.x, ((SecP224R1FieldElement) arg0).x, var2);
        return new SecP224R1FieldElement(var2);
    }

    public ECFieldElement divide(ECFieldElement arg0) {
        int[] var2 = Nat224.create();
        Mod.invert(SecP224R1Field.P, ((SecP224R1FieldElement) arg0).x, var2);
        SecP224R1Field.multiply(var2, this.x, var2);
        return new SecP224R1FieldElement(var2);
    }

    public ECFieldElement negate() {
        int[] var1 = Nat224.create();
        SecP224R1Field.negate(this.x, var1);
        return new SecP224R1FieldElement(var1);
    }

    public ECFieldElement square() {
        int[] var1 = Nat224.create();
        SecP224R1Field.square(this.x, var1);
        return new SecP224R1FieldElement(var1);
    }

    public SecP224R1FieldElement(BigInteger arg0) {
        if (arg0 == null || arg0.signum() < 0 || arg0.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.x = SecP224R1Field.fromBigInteger(arg0);
    }

    public ECFieldElement sqrt() {
        int[] var1 = this.x;
        if (Nat224.isZero(var1) || Nat224.isOne(var1)) {
            return this;
        }
        int[] var2 = Nat224.create();
        SecP224R1Field.negate(var1, var2);
        int[] var3 = Mod.random(SecP224R1Field.P);
        int[] var4 = Nat224.create();
        if (!isSquare(var1)) {
            return null;
        }
        while (!trySqrt(var2, var3, var4)) {
            SecP224R1Field.addOne(var3, var3);
        }
        SecP224R1Field.square(var4, var3);
        return Nat224.eq(var1, var3) ? new SecP224R1FieldElement(var4) : null;
    }

    public ECFieldElement invert() {
        int[] var1 = Nat224.create();
        Mod.invert(SecP224R1Field.P, this.x, var1);
        return new SecP224R1FieldElement(var1);
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP224R1FieldElement)) {
            SecP224R1FieldElement var2 = (SecP224R1FieldElement) arg0;
            return Nat224.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public static void RM(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        SecP224R1Field.multiply(arg4, arg2, arg6);
        SecP224R1Field.multiply(arg6, arg0, arg6);
        SecP224R1Field.multiply(arg3, arg1, arg5);
        SecP224R1Field.add(arg5, arg6, arg5);
        SecP224R1Field.multiply(arg3, arg2, arg6);
        Nat224.copy(arg5, arg3);
        SecP224R1Field.multiply(arg4, arg1, arg4);
        SecP224R1Field.add(arg4, arg6, arg4);
        SecP224R1Field.square(arg4, arg5);
        SecP224R1Field.multiply(arg5, arg0, arg5);
    }

    public ECFieldElement addOne() {
        int[] var1 = Nat224.create();
        SecP224R1Field.addOne(this.x, var1);
        return new SecP224R1FieldElement(var1);
    }

    public String getFieldName() {
        return "SecP224R1Field";
    }

    public static boolean trySqrt(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat224.create();
        Nat224.copy(arg1, var3);
        int[] var4 = Nat224.create();
        var4[0] = 1;
        int[] var5 = Nat224.create();
        RP(arg0, var3, var4, var5, arg2);
        int[] var6 = Nat224.create();
        int[] var7 = Nat224.create();
        for (int var8 = 1; var8 < 96; var8++) {
            Nat224.copy(var3, var6);
            Nat224.copy(var4, var7);
            RS(var3, var4, var5, arg2);
            if (Nat224.isZero(var3)) {
                Mod.invert(SecP224R1Field.P, var7, arg2);
                SecP224R1Field.multiply(arg2, var6, arg2);
                return true;
            }
        }
        return false;
    }

    public boolean gj(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SecP224R1FieldElement)) {
            SecP224R1FieldElement var2 = (SecP224R1FieldElement) arg0;
            return Nat224.eq(this.x, var2.x);
        } else {
            return false;
        }
    }

    public int amf() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }

    public static boolean isSquare(int[] arg0) {
        int[] var1 = Nat224.create();
        int[] var2 = Nat224.create();
        Nat224.copy(arg0, var1);
        for (int var3 = 0; var3 < 7; var3++) {
            Nat224.copy(var1, var2);
            SecP224R1Field.squareN(var1, 0x1 << var3, var1);
            SecP224R1Field.multiply(var1, var2, var1);
        }
        SecP224R1Field.squareN(var1, 95, var1);
        return Nat224.isOne(var1);
    }

    public static void RS(int[] arg0, int[] arg1, int[] arg2, int[] arg3) {
        SecP224R1Field.multiply(arg1, arg0, arg1);
        SecP224R1Field.twice(arg1, arg1);
        SecP224R1Field.square(arg0, arg3);
        SecP224R1Field.add(arg2, arg3, arg0);
        SecP224R1Field.multiply(arg2, arg3, arg2);
        int var4 = Nat.shiftUpBits(7, arg2, 2, 0);
        SecP224R1Field.reduce32(var4, arg2);
    }

    public int amg() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }

    public int aml() {
        return Q.hashCode() ^ Arrays.hashCode((int[]) this.x, 0, 7);
    }
}
