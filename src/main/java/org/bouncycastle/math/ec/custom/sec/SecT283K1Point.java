package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

public class SecT283K1Point extends ECPoint.AbstractF2m {

    public ECPoint detach() {
        return new SecT283K1Point((ECCurve) null, this.getAffineXCoord(), this.getAffineYCoord());
    }

    public ECPoint negate() {
        if (this.isInfinity()) {
            return this;
        }
        ECFieldElement var1 = this.x;
        if (var1.isZero()) {
            return this;
        } else {
            ECFieldElement var2 = this.y;
            ECFieldElement var3 = this.zs[0];
            return new SecT283K1Point(this.curve, var1, var2.add(var3), new ECFieldElement[] { var3 }, this.withCompression);
        }
    }

    public SecT283K1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3, boolean arg4) {
        super(arg0, arg1, arg2, arg3);
        this.withCompression = arg4;
    }

    /**
     * @deprecated
     */
    public SecT283K1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, boolean arg3) {
        super(arg0, arg1, arg2);
        if (arg1 == null != (arg2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = arg3;
    }

    public ECFieldElement getYCoord() {
        ECFieldElement var1 = this.x;
        ECFieldElement var2 = this.y;
        if (this.isInfinity() || var1.isZero()) {
            return var2;
        }
        ECFieldElement var3 = var2.add(var1).multiply(var1);
        ECFieldElement var4 = this.zs[0];
        if (!var4.isOne()) {
            var3 = var3.divide(var4);
        }
        return var3;
    }

    public boolean getCompressionYTilde() {
        ECFieldElement var1 = this.getRawXCoord();
        if (var1.isZero()) {
            return false;
        } else {
            ECFieldElement var2 = this.getRawYCoord();
            return var2.testBitZero() != var1.testBitZero();
        }
    }

    public ECPoint add(ECPoint arg0) {
        if (this.isInfinity()) {
            return arg0;
        } else if (arg0.isInfinity()) {
            return this;
        } else {
            ECCurve var2 = this.getCurve();
            ECFieldElement var3 = this.x;
            ECFieldElement var4 = arg0.getRawXCoord();
            if (var3.isZero()) {
                return var4.isZero() ? var2.getInfinity() : arg0.add(this);
            }
            ECFieldElement var5 = this.y;
            ECFieldElement var6 = this.zs[0];
            ECFieldElement var7 = arg0.getRawYCoord();
            ECFieldElement var8 = arg0.getZCoord(0);
            boolean var9 = var6.isOne();
            ECFieldElement var10 = var4;
            ECFieldElement var11 = var7;
            if (!var9) {
                var10 = var4.multiply(var6);
                var11 = var7.multiply(var6);
            }
            boolean var12 = var8.isOne();
            ECFieldElement var13 = var3;
            ECFieldElement var14 = var5;
            if (!var12) {
                var13 = var3.multiply(var8);
                var14 = var5.multiply(var8);
            }
            ECFieldElement var15 = var14.add(var11);
            ECFieldElement var16 = var13.add(var10);
            if (var16.isZero()) {
                return var15.isZero() ? this.twice() : var2.getInfinity();
            }
            ECFieldElement var22;
            ECFieldElement var24;
            ECFieldElement var25;
            if (var4.isZero()) {
                ECPoint var17 = this.normalize();
                ECFieldElement var18 = var17.getXCoord();
                ECFieldElement var19 = var17.getYCoord();
                ECFieldElement var21 = var19.add(var7).divide(var18);
                var22 = var21.square().add(var21).add(var18);
                if (var22.isZero()) {
                    return new SecT283K1Point(var2, var22, var2.getB(), this.withCompression);
                }
                ECFieldElement var23 = var21.multiply(var18.add(var22)).add(var22).add(var19);
                var24 = var23.divide(var22).add(var22);
                var25 = var2.fromBigInteger(ECConstants.ONE);
            } else {
                ECFieldElement var26 = var16.square();
                ECFieldElement var27 = var15.multiply(var13);
                ECFieldElement var28 = var15.multiply(var10);
                var22 = var27.multiply(var28);
                if (var22.isZero()) {
                    return new SecT283K1Point(var2, var22, var2.getB(), this.withCompression);
                }
                ECFieldElement var29 = var15.multiply(var26);
                if (!var12) {
                    var29 = var29.multiply(var8);
                }
                var24 = var28.add(var26).squarePlusProduct(var29, var5.add(var6));
                var25 = var29;
                if (!var9) {
                    var25 = var29.multiply(var6);
                }
            }
            return new SecT283K1Point(var2, var22, var24, new ECFieldElement[] { var25 }, this.withCompression);
        }
    }

    public ECPoint twice() {
        if (this.isInfinity()) {
            return this;
        }
        ECCurve var1 = this.getCurve();
        ECFieldElement var2 = this.x;
        if (var2.isZero()) {
            return var1.getInfinity();
        }
        ECFieldElement var3 = this.y;
        ECFieldElement var4 = this.zs[0];
        boolean var5 = var4.isOne();
        ECFieldElement var6 = var5 ? var4 : var4.square();
        ECFieldElement var7;
        if (var5) {
            var7 = var3.square().add(var3);
        } else {
            var7 = var3.add(var4).multiply(var3);
        }
        if (var7.isZero()) {
            return new SecT283K1Point(var1, var7, var1.getB(), this.withCompression);
        }
        ECFieldElement var8 = var7.square();
        ECFieldElement var9 = var5 ? var7 : var7.multiply(var6);
        ECFieldElement var10 = var3.add(var2).square();
        ECFieldElement var11 = var5 ? var4 : var6.square();
        ECFieldElement var12 = var10.add(var7).add(var6).multiply(var10).add(var11).add(var8).add(var9);
        return new SecT283K1Point(var1, var8, var12, new ECFieldElement[] { var9 }, this.withCompression);
    }

    /**
     * @deprecated
     */
    public SecT283K1Point(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
        this(arg0, arg1, arg2, false);
    }

    public ECPoint twicePlus(ECPoint arg0) {
        if (this.isInfinity()) {
            return arg0;
        } else if (arg0.isInfinity()) {
            return this.twice();
        } else {
            ECCurve var2 = this.getCurve();
            ECFieldElement var3 = this.x;
            if (var3.isZero()) {
                return arg0;
            }
            ECFieldElement var4 = arg0.getRawXCoord();
            ECFieldElement var5 = arg0.getZCoord(0);
            if (var4.isZero() || !var5.isOne()) {
                return this.twice().add(arg0);
            }
            ECFieldElement var6 = this.y;
            ECFieldElement var7 = this.zs[0];
            ECFieldElement var8 = arg0.getRawYCoord();
            ECFieldElement var9 = var3.square();
            ECFieldElement var10 = var6.square();
            ECFieldElement var11 = var7.square();
            ECFieldElement var12 = var6.multiply(var7);
            ECFieldElement var13 = var10.add(var12);
            ECFieldElement var14 = var8.addOne();
            ECFieldElement var15 = var14.multiply(var11).add(var10).multiplyPlusProduct(var13, var9, var11);
            ECFieldElement var16 = var4.multiply(var11);
            ECFieldElement var17 = var16.add(var13).square();
            if (var17.isZero()) {
                return var15.isZero() ? arg0.twice() : var2.getInfinity();
            } else if (var15.isZero()) {
                return new SecT283K1Point(var2, var15, var2.getB(), this.withCompression);
            } else {
                ECFieldElement var18 = var15.square().multiply(var16);
                ECFieldElement var19 = var15.multiply(var17).multiply(var11);
                ECFieldElement var20 = var15.add(var17).square().multiplyPlusProduct(var13, var14, var19);
                return new SecT283K1Point(var2, var18, var20, new ECFieldElement[] { var19 }, this.withCompression);
            }
        }
    }
}
