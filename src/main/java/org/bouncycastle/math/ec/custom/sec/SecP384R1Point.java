package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;

public class SecP384R1Point extends ECPoint.AbstractFp {

    public ECPoint threeTimes() {
        return this.isInfinity() || this.y.isZero() ? this : this.twice().add(this);
    }

    public ECPoint negate() {
        return this.isInfinity() ? this : new SecP384R1Point(this.curve, this.x, this.y.negate(), this.zs, this.withCompression);
    }

    public SecP384R1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3, boolean arg4) {
        super(arg0, arg1, arg2, arg3);
        this.withCompression = arg4;
    }

    public ECPoint detach() {
        return new SecP384R1Point((ECCurve) null, this.getAffineXCoord(), this.getAffineYCoord());
    }

    public ECPoint add(ECPoint arg0) {
        if (this.isInfinity()) {
            return arg0;
        } else if (arg0.isInfinity()) {
            return this;
        } else if (this == arg0) {
            return this.twice();
        } else {
            ECCurve var2 = this.getCurve();
            SecP384R1FieldElement var3 = (SecP384R1FieldElement) this.x;
            SecP384R1FieldElement var4 = (SecP384R1FieldElement) this.y;
            SecP384R1FieldElement var5 = (SecP384R1FieldElement) arg0.getXCoord();
            SecP384R1FieldElement var6 = (SecP384R1FieldElement) arg0.getYCoord();
            SecP384R1FieldElement var7 = (SecP384R1FieldElement) this.zs[0];
            SecP384R1FieldElement var8 = (SecP384R1FieldElement) arg0.getZCoord(0);
            int[] var9 = Nat.create(24);
            int[] var10 = Nat.create(24);
            int[] var11 = Nat.create(12);
            int[] var12 = Nat.create(12);
            boolean var13 = var7.isOne();
            int[] var14;
            int[] var15;
            if (var13) {
                var14 = var5.x;
                var15 = var6.x;
            } else {
                var15 = var11;
                SecP384R1Field.square(var7.x, var11);
                var14 = var10;
                SecP384R1Field.multiply(var11, var5.x, var10);
                SecP384R1Field.multiply(var11, var7.x, var11);
                SecP384R1Field.multiply(var11, var6.x, var11);
            }
            boolean var16 = var8.isOne();
            int[] var17;
            int[] var18;
            if (var16) {
                var17 = var3.x;
                var18 = var4.x;
            } else {
                var18 = var12;
                SecP384R1Field.square(var8.x, var12);
                var17 = var9;
                SecP384R1Field.multiply(var12, var3.x, var9);
                SecP384R1Field.multiply(var12, var8.x, var12);
                SecP384R1Field.multiply(var12, var4.x, var12);
            }
            int[] var19 = Nat.create(12);
            SecP384R1Field.subtract(var17, var14, var19);
            int[] var20 = Nat.create(12);
            SecP384R1Field.subtract(var18, var15, var20);
            if (Nat.isZero(12, var19)) {
                return Nat.isZero(12, var20) ? this.twice() : var2.getInfinity();
            }
            SecP384R1Field.square(var19, var11);
            int[] var22 = Nat.create(12);
            SecP384R1Field.multiply(var11, var19, var22);
            SecP384R1Field.multiply(var11, var17, var11);
            SecP384R1Field.negate(var22, var22);
            Nat384.mul(var18, var22, var9);
            int var24 = Nat.addBothTo(12, var11, var11, var22);
            SecP384R1Field.reduce32(var24, var22);
            SecP384R1FieldElement var25 = new SecP384R1FieldElement(var12);
            SecP384R1Field.square(var20, var25.x);
            SecP384R1Field.subtract(var25.x, var22, var25.x);
            SecP384R1FieldElement var26 = new SecP384R1FieldElement(var22);
            SecP384R1Field.subtract(var11, var25.x, var26.x);
            Nat384.mul(var26.x, var20, var10);
            SecP384R1Field.addExt(var9, var10, var9);
            SecP384R1Field.reduce(var9, var26.x);
            SecP384R1FieldElement var27 = new SecP384R1FieldElement(var19);
            if (!var13) {
                SecP384R1Field.multiply(var27.x, var7.x, var27.x);
            }
            if (!var16) {
                SecP384R1Field.multiply(var27.x, var8.x, var27.x);
            }
            ECFieldElement[] var28 = new ECFieldElement[] { var27 };
            return new SecP384R1Point(var2, var25, var26, var28, this.withCompression);
        }
    }

    public ECPoint twicePlus(ECPoint arg0) {
        if (this == arg0) {
            return this.threeTimes();
        } else if (this.isInfinity()) {
            return arg0;
        } else if (arg0.isInfinity()) {
            return this.twice();
        } else {
            ECFieldElement var2 = this.y;
            return var2.isZero() ? arg0 : this.twice().add(arg0);
        }
    }

    /**
     * @deprecated
     */
    public SecP384R1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
        this(arg0, arg1, arg2, false);
    }

    /**
     * @deprecated
     */
    public SecP384R1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, boolean arg3) {
        super(arg0, arg1, arg2);
        if (arg1 == null != (arg2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = arg3;
    }

    public ECPoint twice() {
        if (this.isInfinity()) {
            return this;
        }
        ECCurve var1 = this.getCurve();
        SecP384R1FieldElement var2 = (SecP384R1FieldElement) this.y;
        if (var2.isZero()) {
            return var1.getInfinity();
        }
        SecP384R1FieldElement var3 = (SecP384R1FieldElement) this.x;
        SecP384R1FieldElement var4 = (SecP384R1FieldElement) this.zs[0];
        int[] var5 = Nat.create(12);
        int[] var6 = Nat.create(12);
        int[] var7 = Nat.create(12);
        SecP384R1Field.square(var2.x, var7);
        int[] var8 = Nat.create(12);
        SecP384R1Field.square(var7, var8);
        boolean var9 = var4.isOne();
        int[] var10 = var4.x;
        if (!var9) {
            var10 = var6;
            SecP384R1Field.square(var4.x, var6);
        }
        SecP384R1Field.subtract(var3.x, var10, var5);
        SecP384R1Field.add(var3.x, var10, var6);
        SecP384R1Field.multiply(var6, var5, var6);
        int var12 = Nat.addBothTo(12, var6, var6, var6);
        SecP384R1Field.reduce32(var12, var6);
        SecP384R1Field.multiply(var7, var3.x, var7);
        int var14 = Nat.shiftUpBits(12, var7, 2, 0);
        SecP384R1Field.reduce32(var14, var7);
        int var15 = Nat.shiftUpBits(12, var8, 3, 0, var5);
        SecP384R1Field.reduce32(var15, var5);
        SecP384R1FieldElement var16 = new SecP384R1FieldElement(var8);
        SecP384R1Field.square(var6, var16.x);
        SecP384R1Field.subtract(var16.x, var7, var16.x);
        SecP384R1Field.subtract(var16.x, var7, var16.x);
        SecP384R1FieldElement var17 = new SecP384R1FieldElement(var7);
        SecP384R1Field.subtract(var7, var16.x, var17.x);
        SecP384R1Field.multiply(var17.x, var6, var17.x);
        SecP384R1Field.subtract(var17.x, var5, var17.x);
        SecP384R1FieldElement var18 = new SecP384R1FieldElement(var6);
        SecP384R1Field.twice(var2.x, var18.x);
        if (!var9) {
            SecP384R1Field.multiply(var18.x, var4.x, var18.x);
        }
        return new SecP384R1Point(var1, var16, var17, new ECFieldElement[] { var18 }, this.withCompression);
    }
}
