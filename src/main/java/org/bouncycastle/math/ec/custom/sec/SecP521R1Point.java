package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;

public class SecP521R1Point extends ECPoint.AbstractFp {

    public ECFieldElement three(ECFieldElement arg0) {
        return this.two(arg0).add(arg0);
    }

    public ECFieldElement two(ECFieldElement arg0) {
        return arg0.add(arg0);
    }

    public SecP521R1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3, boolean arg4) {
        super(arg0, arg1, arg2, arg3);
        this.withCompression = arg4;
    }

    public ECPoint detach() {
        return new SecP521R1Point((ECCurve) null, this.getAffineXCoord(), this.getAffineYCoord());
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
            SecP521R1FieldElement var3 = (SecP521R1FieldElement) this.x;
            SecP521R1FieldElement var4 = (SecP521R1FieldElement) this.y;
            SecP521R1FieldElement var5 = (SecP521R1FieldElement) arg0.getXCoord();
            SecP521R1FieldElement var6 = (SecP521R1FieldElement) arg0.getYCoord();
            SecP521R1FieldElement var7 = (SecP521R1FieldElement) this.zs[0];
            SecP521R1FieldElement var8 = (SecP521R1FieldElement) arg0.getZCoord(0);
            int[] var9 = Nat.create(17);
            int[] var10 = Nat.create(17);
            int[] var11 = Nat.create(17);
            int[] var12 = Nat.create(17);
            boolean var13 = var7.isOne();
            int[] var14;
            int[] var15;
            if (var13) {
                var14 = var5.x;
                var15 = var6.x;
            } else {
                var15 = var11;
                SecP521R1Field.square(var7.x, var11);
                var14 = var10;
                SecP521R1Field.multiply(var11, var5.x, var10);
                SecP521R1Field.multiply(var11, var7.x, var11);
                SecP521R1Field.multiply(var11, var6.x, var11);
            }
            boolean var16 = var8.isOne();
            int[] var17;
            int[] var18;
            if (var16) {
                var17 = var3.x;
                var18 = var4.x;
            } else {
                var18 = var12;
                SecP521R1Field.square(var8.x, var12);
                var17 = var9;
                SecP521R1Field.multiply(var12, var3.x, var9);
                SecP521R1Field.multiply(var12, var8.x, var12);
                SecP521R1Field.multiply(var12, var4.x, var12);
            }
            int[] var19 = Nat.create(17);
            SecP521R1Field.subtract(var17, var14, var19);
            SecP521R1Field.subtract(var18, var15, var10);
            if (Nat.isZero(17, var19)) {
                return Nat.isZero(17, var10) ? this.twice() : var2.getInfinity();
            }
            SecP521R1Field.square(var19, var11);
            int[] var22 = Nat.create(17);
            SecP521R1Field.multiply(var11, var19, var22);
            SecP521R1Field.multiply(var11, var17, var11);
            SecP521R1Field.multiply(var18, var22, var9);
            SecP521R1FieldElement var24 = new SecP521R1FieldElement(var12);
            SecP521R1Field.square(var10, var24.x);
            SecP521R1Field.add(var24.x, var22, var24.x);
            SecP521R1Field.subtract(var24.x, var11, var24.x);
            SecP521R1Field.subtract(var24.x, var11, var24.x);
            SecP521R1FieldElement var25 = new SecP521R1FieldElement(var22);
            SecP521R1Field.subtract(var11, var24.x, var25.x);
            SecP521R1Field.multiply(var25.x, var10, var10);
            SecP521R1Field.subtract(var10, var9, var25.x);
            SecP521R1FieldElement var26 = new SecP521R1FieldElement(var19);
            if (!var13) {
                SecP521R1Field.multiply(var26.x, var7.x, var26.x);
            }
            if (!var16) {
                SecP521R1Field.multiply(var26.x, var8.x, var26.x);
            }
            ECFieldElement[] var27 = new ECFieldElement[] { var26 };
            return new SecP521R1Point(var2, var24, var25, var27, this.withCompression);
        }
    }

    public ECPoint twice() {
        if (this.isInfinity()) {
            return this;
        }
        ECCurve var1 = this.getCurve();
        SecP521R1FieldElement var2 = (SecP521R1FieldElement) this.y;
        if (var2.isZero()) {
            return var1.getInfinity();
        }
        SecP521R1FieldElement var3 = (SecP521R1FieldElement) this.x;
        SecP521R1FieldElement var4 = (SecP521R1FieldElement) this.zs[0];
        int[] var5 = Nat.create(17);
        int[] var6 = Nat.create(17);
        int[] var7 = Nat.create(17);
        SecP521R1Field.square(var2.x, var7);
        int[] var8 = Nat.create(17);
        SecP521R1Field.square(var7, var8);
        boolean var9 = var4.isOne();
        int[] var10 = var4.x;
        if (!var9) {
            var10 = var6;
            SecP521R1Field.square(var4.x, var6);
        }
        SecP521R1Field.subtract(var3.x, var10, var5);
        SecP521R1Field.add(var3.x, var10, var6);
        SecP521R1Field.multiply(var6, var5, var6);
        Nat.addBothTo(17, var6, var6, var6);
        SecP521R1Field.reduce23(var6);
        SecP521R1Field.multiply(var7, var3.x, var7);
        Nat.shiftUpBits(17, var7, 2, 0);
        SecP521R1Field.reduce23(var7);
        Nat.shiftUpBits(17, var8, 3, 0, var5);
        SecP521R1Field.reduce23(var5);
        SecP521R1FieldElement var13 = new SecP521R1FieldElement(var8);
        SecP521R1Field.square(var6, var13.x);
        SecP521R1Field.subtract(var13.x, var7, var13.x);
        SecP521R1Field.subtract(var13.x, var7, var13.x);
        SecP521R1FieldElement var14 = new SecP521R1FieldElement(var7);
        SecP521R1Field.subtract(var7, var13.x, var14.x);
        SecP521R1Field.multiply(var14.x, var6, var14.x);
        SecP521R1Field.subtract(var14.x, var5, var14.x);
        SecP521R1FieldElement var15 = new SecP521R1FieldElement(var6);
        SecP521R1Field.twice(var2.x, var15.x);
        if (!var9) {
            SecP521R1Field.multiply(var15.x, var4.x, var15.x);
        }
        return new SecP521R1Point(var1, var13, var14, new ECFieldElement[] { var15 }, this.withCompression);
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

    public ECPoint threeTimes() {
        return this.isInfinity() || this.y.isZero() ? this : this.twice().add(this);
    }

    public ECPoint negate() {
        return this.isInfinity() ? this : new SecP521R1Point(this.curve, this.x, this.y.negate(), this.zs, this.withCompression);
    }

    public ECFieldElement eight(ECFieldElement arg0) {
        return this.four(this.two(arg0));
    }

    public ECFieldElement four(ECFieldElement arg0) {
        return this.two(this.two(arg0));
    }

    /**
     * @deprecated
     */
    public SecP521R1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, boolean arg3) {
        super(arg0, arg1, arg2);
        if (arg1 == null != (arg2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = arg3;
    }

    public ECFieldElement doubleProductFromSquares(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement arg3) {
        return arg0.add(arg1).square().subtract(arg2).subtract(arg3);
    }

    /**
     * @deprecated
     */
    public SecP521R1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
        this(arg0, arg1, arg2, false);
    }
}
