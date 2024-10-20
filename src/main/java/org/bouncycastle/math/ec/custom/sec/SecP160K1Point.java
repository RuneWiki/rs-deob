package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;

public class SecP160K1Point extends ECPoint.AbstractFp {

    /**
     * @deprecated
     */
    public SecP160K1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
        this(arg0, arg1, arg2, false);
    }

    /**
     * @deprecated
     */
    public SecP160K1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, boolean arg3) {
        super(arg0, arg1, arg2);
        if (arg1 == null != (arg2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = arg3;
    }

    public SecP160K1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3, boolean arg4) {
        super(arg0, arg1, arg2, arg3);
        this.withCompression = arg4;
    }

    public ECPoint detach() {
        return new SecP160K1Point((ECCurve) null, this.getAffineXCoord(), this.getAffineYCoord());
    }

    public ECPoint threeTimes() {
        return this.isInfinity() || this.y.isZero() ? this : this.twice().add(this);
    }

    public ECPoint twice() {
        if (this.isInfinity()) {
            return this;
        }
        ECCurve var1 = this.getCurve();
        SecP160R2FieldElement var2 = (SecP160R2FieldElement) this.y;
        if (var2.isZero()) {
            return var1.getInfinity();
        }
        SecP160R2FieldElement var3 = (SecP160R2FieldElement) this.x;
        SecP160R2FieldElement var4 = (SecP160R2FieldElement) this.zs[0];
        int[] var5 = Nat160.create();
        SecP160R2Field.square(var2.x, var5);
        int[] var6 = Nat160.create();
        SecP160R2Field.square(var5, var6);
        int[] var7 = Nat160.create();
        SecP160R2Field.square(var3.x, var7);
        int var8 = Nat160.addBothTo(var7, var7, var7);
        SecP160R2Field.reduce32(var8, var7);
        SecP160R2Field.multiply(var5, var3.x, var5);
        int var10 = Nat.shiftUpBits(5, var5, 2, 0);
        SecP160R2Field.reduce32(var10, var5);
        int[] var11 = Nat160.create();
        int var12 = Nat.shiftUpBits(5, var6, 3, 0, var11);
        SecP160R2Field.reduce32(var12, var11);
        SecP160R2FieldElement var13 = new SecP160R2FieldElement(var6);
        SecP160R2Field.square(var7, var13.x);
        SecP160R2Field.subtract(var13.x, var5, var13.x);
        SecP160R2Field.subtract(var13.x, var5, var13.x);
        SecP160R2FieldElement var14 = new SecP160R2FieldElement(var5);
        SecP160R2Field.subtract(var5, var13.x, var14.x);
        SecP160R2Field.multiply(var14.x, var7, var14.x);
        SecP160R2Field.subtract(var14.x, var11, var14.x);
        SecP160R2FieldElement var15 = new SecP160R2FieldElement(var7);
        SecP160R2Field.twice(var2.x, var15.x);
        if (!var4.isOne()) {
            SecP160R2Field.multiply(var15.x, var4.x, var15.x);
        }
        return new SecP160K1Point(var1, var13, var14, new ECFieldElement[] { var15 }, this.withCompression);
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

    public ECPoint add(ECPoint arg0) {
        if (this.isInfinity()) {
            return arg0;
        } else if (arg0.isInfinity()) {
            return this;
        } else if (this == arg0) {
            return this.twice();
        } else {
            ECCurve var2 = this.getCurve();
            SecP160R2FieldElement var3 = (SecP160R2FieldElement) this.x;
            SecP160R2FieldElement var4 = (SecP160R2FieldElement) this.y;
            SecP160R2FieldElement var5 = (SecP160R2FieldElement) arg0.getXCoord();
            SecP160R2FieldElement var6 = (SecP160R2FieldElement) arg0.getYCoord();
            SecP160R2FieldElement var7 = (SecP160R2FieldElement) this.zs[0];
            SecP160R2FieldElement var8 = (SecP160R2FieldElement) arg0.getZCoord(0);
            int[] var9 = Nat160.createExt();
            int[] var10 = Nat160.create();
            int[] var11 = Nat160.create();
            int[] var12 = Nat160.create();
            boolean var13 = var7.isOne();
            int[] var14;
            int[] var15;
            if (var13) {
                var14 = var5.x;
                var15 = var6.x;
            } else {
                var15 = var11;
                SecP160R2Field.square(var7.x, var11);
                var14 = var10;
                SecP160R2Field.multiply(var11, var5.x, var10);
                SecP160R2Field.multiply(var11, var7.x, var11);
                SecP160R2Field.multiply(var11, var6.x, var11);
            }
            boolean var16 = var8.isOne();
            int[] var17;
            int[] var18;
            if (var16) {
                var17 = var3.x;
                var18 = var4.x;
            } else {
                var18 = var12;
                SecP160R2Field.square(var8.x, var12);
                var17 = var9;
                SecP160R2Field.multiply(var12, var3.x, var9);
                SecP160R2Field.multiply(var12, var8.x, var12);
                SecP160R2Field.multiply(var12, var4.x, var12);
            }
            int[] var19 = Nat160.create();
            SecP160R2Field.subtract(var17, var14, var19);
            SecP160R2Field.subtract(var18, var15, var10);
            if (Nat160.isZero(var19)) {
                return Nat160.isZero(var10) ? this.twice() : var2.getInfinity();
            }
            SecP160R2Field.square(var19, var11);
            int[] var22 = Nat160.create();
            SecP160R2Field.multiply(var11, var19, var22);
            SecP160R2Field.multiply(var11, var17, var11);
            SecP160R2Field.negate(var22, var22);
            Nat160.mul(var18, var22, var9);
            int var24 = Nat160.addBothTo(var11, var11, var22);
            SecP160R2Field.reduce32(var24, var22);
            SecP160R2FieldElement var25 = new SecP160R2FieldElement(var12);
            SecP160R2Field.square(var10, var25.x);
            SecP160R2Field.subtract(var25.x, var22, var25.x);
            SecP160R2FieldElement var26 = new SecP160R2FieldElement(var22);
            SecP160R2Field.subtract(var11, var25.x, var26.x);
            SecP160R2Field.multiplyAddToExt(var26.x, var10, var9);
            SecP160R2Field.reduce(var9, var26.x);
            SecP160R2FieldElement var27 = new SecP160R2FieldElement(var19);
            if (!var13) {
                SecP160R2Field.multiply(var27.x, var7.x, var27.x);
            }
            if (!var16) {
                SecP160R2Field.multiply(var27.x, var8.x, var27.x);
            }
            ECFieldElement[] var28 = new ECFieldElement[] { var27 };
            return new SecP160K1Point(var2, var25, var26, var28, this.withCompression);
        }
    }

    public ECPoint negate() {
        return this.isInfinity() ? this : new SecP160K1Point(this.curve, this.x, this.y.negate(), this.zs, this.withCompression);
    }
}
