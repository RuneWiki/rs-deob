package org.bouncycastle.math.ec.custom.djb;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat256;

public class Curve25519Point extends ECPoint.AbstractFp {

    public ECPoint negate() {
        return this.isInfinity() ? this : new Curve25519Point(this.getCurve(), this.x, this.y.negate(), this.zs, this.withCompression);
    }

    /**
     * @deprecated
     */
    public Curve25519Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, boolean arg3) {
        super(arg0, arg1, arg2);
        if (arg1 == null != (arg2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = arg3;
    }

    public Curve25519Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3, boolean arg4) {
        super(arg0, arg1, arg2, arg3);
        this.withCompression = arg4;
    }

    public ECPoint detach() {
        return new Curve25519Point((ECCurve) null, this.getAffineXCoord(), this.getAffineYCoord());
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
            return var2.isZero() ? arg0 : this.twiceJacobianModified(false).add(arg0);
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
            Curve25519FieldElement var3 = (Curve25519FieldElement) this.x;
            Curve25519FieldElement var4 = (Curve25519FieldElement) this.y;
            Curve25519FieldElement var5 = (Curve25519FieldElement) this.zs[0];
            Curve25519FieldElement var6 = (Curve25519FieldElement) arg0.getXCoord();
            Curve25519FieldElement var7 = (Curve25519FieldElement) arg0.getYCoord();
            Curve25519FieldElement var8 = (Curve25519FieldElement) arg0.getZCoord(0);
            int[] var9 = Nat256.createExt();
            int[] var10 = Nat256.create();
            int[] var11 = Nat256.create();
            int[] var12 = Nat256.create();
            boolean var13 = var5.isOne();
            int[] var14;
            int[] var15;
            if (var13) {
                var14 = var6.x;
                var15 = var7.x;
            } else {
                var15 = var11;
                Curve25519Field.square(var5.x, var11);
                var14 = var10;
                Curve25519Field.multiply(var11, var6.x, var10);
                Curve25519Field.multiply(var11, var5.x, var11);
                Curve25519Field.multiply(var11, var7.x, var11);
            }
            boolean var16 = var8.isOne();
            int[] var17;
            int[] var18;
            if (var16) {
                var17 = var3.x;
                var18 = var4.x;
            } else {
                var18 = var12;
                Curve25519Field.square(var8.x, var12);
                var17 = var9;
                Curve25519Field.multiply(var12, var3.x, var9);
                Curve25519Field.multiply(var12, var8.x, var12);
                Curve25519Field.multiply(var12, var4.x, var12);
            }
            int[] var19 = Nat256.create();
            Curve25519Field.subtract(var17, var14, var19);
            Curve25519Field.subtract(var18, var15, var10);
            if (Nat256.isZero(var19)) {
                return Nat256.isZero(var10) ? this.twice() : var2.getInfinity();
            }
            int[] var21 = Nat256.create();
            Curve25519Field.square(var19, var21);
            int[] var22 = Nat256.create();
            Curve25519Field.multiply(var21, var19, var22);
            Curve25519Field.multiply(var21, var17, var11);
            Curve25519Field.negate(var22, var22);
            Nat256.mul(var18, var22, var9);
            int var24 = Nat256.addBothTo(var11, var11, var22);
            Curve25519Field.reduce27(var24, var22);
            Curve25519FieldElement var25 = new Curve25519FieldElement(var12);
            Curve25519Field.square(var10, var25.x);
            Curve25519Field.subtract(var25.x, var22, var25.x);
            Curve25519FieldElement var26 = new Curve25519FieldElement(var22);
            Curve25519Field.subtract(var11, var25.x, var26.x);
            Curve25519Field.multiplyAddToExt(var26.x, var10, var9);
            Curve25519Field.reduce(var9, var26.x);
            Curve25519FieldElement var27 = new Curve25519FieldElement(var19);
            if (!var13) {
                Curve25519Field.multiply(var27.x, var5.x, var27.x);
            }
            if (!var16) {
                Curve25519Field.multiply(var27.x, var8.x, var27.x);
            }
            int[] var28 = var13 && var16 ? var21 : null;
            Curve25519FieldElement var29 = this.calculateJacobianModifiedW(var27, var28);
            ECFieldElement[] var30 = new ECFieldElement[] { var27, var29 };
            return new Curve25519Point(var2, var25, var26, var30, this.withCompression);
        }
    }

    public ECPoint twice() {
        if (this.isInfinity()) {
            return this;
        } else {
            ECCurve var1 = this.getCurve();
            ECFieldElement var2 = this.y;
            return var2.isZero() ? var1.getInfinity() : this.twiceJacobianModified(true);
        }
    }

    public ECFieldElement getZCoord(int arg0) {
        return arg0 == 1 ? this.getJacobianModifiedW() : super.getZCoord(arg0);
    }

    public ECPoint threeTimes() {
        if (this.isInfinity()) {
            return this;
        } else {
            ECFieldElement var1 = this.y;
            return var1.isZero() ? this : this.twiceJacobianModified(false).add(this);
        }
    }

    /**
     * @deprecated
     */
    public Curve25519Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
        this(arg0, arg1, arg2, false);
    }

    public Curve25519FieldElement calculateJacobianModifiedW(Curve25519FieldElement arg0, int[] arg1) {
        Curve25519FieldElement var3 = (Curve25519FieldElement) this.getCurve().getA();
        if (arg0.isOne()) {
            return var3;
        }
        Curve25519FieldElement var4 = new Curve25519FieldElement();
        if (arg1 == null) {
            arg1 = var4.x;
            Curve25519Field.square(arg0.x, arg1);
        }
        Curve25519Field.square(arg1, var4.x);
        Curve25519Field.multiply(var4.x, var3.x, var4.x);
        return var4;
    }

    public Curve25519FieldElement getJacobianModifiedW() {
        Curve25519FieldElement var1 = (Curve25519FieldElement) this.zs[1];
        if (var1 == null) {
            this.zs[1] = var1 = this.calculateJacobianModifiedW((Curve25519FieldElement) this.zs[0], (int[]) null);
        }
        return var1;
    }

    public Curve25519Point twiceJacobianModified(boolean arg0) {
        Curve25519FieldElement var2 = (Curve25519FieldElement) this.x;
        Curve25519FieldElement var3 = (Curve25519FieldElement) this.y;
        Curve25519FieldElement var4 = (Curve25519FieldElement) this.zs[0];
        Curve25519FieldElement var5 = this.getJacobianModifiedW();
        int[] var6 = Nat256.create();
        Curve25519Field.square(var2.x, var6);
        int var7 = Nat256.addBothTo(var6, var6, var6);
        int var8 = var7 + Nat256.addTo(var5.x, var6);
        Curve25519Field.reduce27(var8, var6);
        int[] var9 = Nat256.create();
        Curve25519Field.twice(var3.x, var9);
        int[] var10 = Nat256.create();
        Curve25519Field.multiply(var9, var3.x, var10);
        int[] var11 = Nat256.create();
        Curve25519Field.multiply(var10, var2.x, var11);
        Curve25519Field.twice(var11, var11);
        int[] var12 = Nat256.create();
        Curve25519Field.square(var10, var12);
        Curve25519Field.twice(var12, var12);
        Curve25519FieldElement var13 = new Curve25519FieldElement(var10);
        Curve25519Field.square(var6, var13.x);
        Curve25519Field.subtract(var13.x, var11, var13.x);
        Curve25519Field.subtract(var13.x, var11, var13.x);
        Curve25519FieldElement var14 = new Curve25519FieldElement(var11);
        Curve25519Field.subtract(var11, var13.x, var14.x);
        Curve25519Field.multiply(var14.x, var6, var14.x);
        Curve25519Field.subtract(var14.x, var12, var14.x);
        Curve25519FieldElement var15 = new Curve25519FieldElement(var9);
        if (!Nat256.isOne(var4.x)) {
            Curve25519Field.multiply(var15.x, var4.x, var15.x);
        }
        Curve25519FieldElement var16 = null;
        if (arg0) {
            var16 = new Curve25519FieldElement(var12);
            Curve25519Field.multiply(var16.x, var5.x, var16.x);
            Curve25519Field.twice(var16.x, var16.x);
        }
        return new Curve25519Point(this.getCurve(), var13, var14, new ECFieldElement[] { var15, var16 }, this.withCompression);
    }
}
