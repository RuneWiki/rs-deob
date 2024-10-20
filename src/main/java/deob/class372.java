package deob;

import java.util.Arrays;

@ObfuscatedName("ni")
public final class class372 {

    @ObfuscatedName("ni.l")
    public static class372[] field4239 = new class372[0];

    @ObfuscatedName("ni.r")
    public float[] field4242 = new float[16];

    @ObfuscatedName("ni.o")
    public static final class372 field4240;

    static {
        method4804(100);
        field4240 = new class372();
    }

    @ObfuscatedName("jd.c(II)V")
    public static void method4804(int arg0) {
        Statics.field4241 = arg0;
        field4239 = new class372[arg0];
        Statics.field3511 = 0;
    }

    @ObfuscatedName("hy.l(I)Lni;")
    public static class372 method4307() {
        class372[] var0 = field4239;
        synchronized (field4239) {
            if (Statics.field3511 == 0) {
                return new class372();
            } else {
                field4239[--Statics.field3511].method6017();
                return field4239[Statics.field3511];
            }
        }
    }

    @ObfuscatedName("ni.s(I)V")
    public void method6043() {
        class372[] var1 = field4239;
        synchronized (field4239) {
            if (Statics.field3511 < Statics.field4241 - 1) {
                field4239[++Statics.field3511 - 1] = this;
            }
        }
    }

    public class372() {
        this.method6017();
    }

    public class372(class372 arg0) {
        this.method6039(arg0);
    }

    public class372(class421 arg0, boolean arg1) {
        this.method6076(arg0, arg1);
    }

    @ObfuscatedName("ni.e(Lpi;ZB)V")
    public void method6076(class421 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4242[var4] = arg0.method6671();
            }
            return;
        }
        class373 var3 = new class373();
        var3.method6086(class384.method2482(arg0.method6830()));
        var3.method6080(class384.method2482(arg0.method6830()));
        var3.method6081(class384.method2482(arg0.method6830()));
        var3.method6082((float) arg0.method6830(), (float) arg0.method6830(), (float) arg0.method6830());
        this.method6029(var3);
    }

    @ObfuscatedName("ni.r(B)[F")
    public float[] method6015() {
        float[] var1 = new float[3];
        if ((double) this.field4242[2] < 0.999D && (double) this.field4242[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4242[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4242[6] / var2, (double) this.field4242[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4242[1] / var2, (double) this.field4242[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4242[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4242[9]), (double) this.field4242[5]);
        }
        return var1;
    }

    @ObfuscatedName("ni.o(B)[F")
    public float[] method6072() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4242[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4242[2];
            double var6 = (double) this.field4242[10];
            double var8 = (double) this.field4242[4];
            double var10 = (double) this.field4242[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4242[1];
            double var14 = (double) this.field4242[0];
            if (this.field4242[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("ni.i(I)V")
    public void method6017() {
        this.field4242[0] = 1.0F;
        this.field4242[1] = 0.0F;
        this.field4242[2] = 0.0F;
        this.field4242[3] = 0.0F;
        this.field4242[4] = 0.0F;
        this.field4242[5] = 1.0F;
        this.field4242[6] = 0.0F;
        this.field4242[7] = 0.0F;
        this.field4242[8] = 0.0F;
        this.field4242[9] = 0.0F;
        this.field4242[10] = 1.0F;
        this.field4242[11] = 0.0F;
        this.field4242[12] = 0.0F;
        this.field4242[13] = 0.0F;
        this.field4242[14] = 0.0F;
        this.field4242[15] = 1.0F;
    }

    @ObfuscatedName("ni.w(B)V")
    public void method6042() {
        this.field4242[0] = 0.0F;
        this.field4242[1] = 0.0F;
        this.field4242[2] = 0.0F;
        this.field4242[3] = 0.0F;
        this.field4242[4] = 0.0F;
        this.field4242[5] = 0.0F;
        this.field4242[6] = 0.0F;
        this.field4242[7] = 0.0F;
        this.field4242[8] = 0.0F;
        this.field4242[9] = 0.0F;
        this.field4242[10] = 0.0F;
        this.field4242[11] = 0.0F;
        this.field4242[12] = 0.0F;
        this.field4242[13] = 0.0F;
        this.field4242[14] = 0.0F;
        this.field4242[15] = 0.0F;
    }

    @ObfuscatedName("ni.v(Lni;I)V")
    public void method6039(class372 arg0) {
        System.arraycopy(arg0.field4242, 0, this.field4242, 0, 16);
    }

    @ObfuscatedName("ni.a(FI)V")
    public void method6020(float arg0) {
        this.method6021(arg0, arg0, arg0);
    }

    @ObfuscatedName("ni.y(FFFI)V")
    public void method6021(float arg0, float arg1, float arg2) {
        this.method6017();
        this.field4242[0] = arg0;
        this.field4242[5] = arg1;
        this.field4242[10] = arg2;
    }

    @ObfuscatedName("ni.u(Lni;B)V")
    public void method6044(class372 arg0) {
        for (int var2 = 0; var2 < this.field4242.length; var2++) {
            this.field4242[var2] += arg0.field4242[var2];
        }
    }

    @ObfuscatedName("ni.h(Lni;I)V")
    public void method6022(class372 arg0) {
        float var2 = this.field4242[3] * arg0.field4242[12] + this.field4242[2] * arg0.field4242[8] + this.field4242[0] * arg0.field4242[0] + this.field4242[1] * arg0.field4242[4];
        float var3 = this.field4242[3] * arg0.field4242[13] + this.field4242[2] * arg0.field4242[9] + this.field4242[1] * arg0.field4242[5] + this.field4242[0] * arg0.field4242[1];
        float var4 = this.field4242[3] * arg0.field4242[14] + this.field4242[2] * arg0.field4242[10] + this.field4242[1] * arg0.field4242[6] + this.field4242[0] * arg0.field4242[2];
        float var5 = this.field4242[3] * arg0.field4242[15] + this.field4242[2] * arg0.field4242[11] + this.field4242[0] * arg0.field4242[3] + this.field4242[1] * arg0.field4242[7];
        float var6 = this.field4242[7] * arg0.field4242[12] + this.field4242[6] * arg0.field4242[8] + this.field4242[5] * arg0.field4242[4] + this.field4242[4] * arg0.field4242[0];
        float var7 = this.field4242[7] * arg0.field4242[13] + this.field4242[6] * arg0.field4242[9] + this.field4242[4] * arg0.field4242[1] + this.field4242[5] * arg0.field4242[5];
        float var8 = this.field4242[7] * arg0.field4242[14] + this.field4242[6] * arg0.field4242[10] + this.field4242[5] * arg0.field4242[6] + this.field4242[4] * arg0.field4242[2];
        float var9 = this.field4242[7] * arg0.field4242[15] + this.field4242[6] * arg0.field4242[11] + this.field4242[5] * arg0.field4242[7] + this.field4242[4] * arg0.field4242[3];
        float var10 = this.field4242[11] * arg0.field4242[12] + this.field4242[10] * arg0.field4242[8] + this.field4242[9] * arg0.field4242[4] + this.field4242[8] * arg0.field4242[0];
        float var11 = this.field4242[11] * arg0.field4242[13] + this.field4242[10] * arg0.field4242[9] + this.field4242[8] * arg0.field4242[1] + this.field4242[9] * arg0.field4242[5];
        float var12 = this.field4242[11] * arg0.field4242[14] + this.field4242[10] * arg0.field4242[10] + this.field4242[9] * arg0.field4242[6] + this.field4242[8] * arg0.field4242[2];
        float var13 = this.field4242[11] * arg0.field4242[15] + this.field4242[10] * arg0.field4242[11] + this.field4242[8] * arg0.field4242[3] + this.field4242[9] * arg0.field4242[7];
        float var14 = this.field4242[15] * arg0.field4242[12] + this.field4242[14] * arg0.field4242[8] + this.field4242[12] * arg0.field4242[0] + this.field4242[13] * arg0.field4242[4];
        float var15 = this.field4242[15] * arg0.field4242[13] + this.field4242[14] * arg0.field4242[9] + this.field4242[12] * arg0.field4242[1] + this.field4242[13] * arg0.field4242[5];
        float var16 = this.field4242[15] * arg0.field4242[14] + this.field4242[14] * arg0.field4242[10] + this.field4242[13] * arg0.field4242[6] + this.field4242[12] * arg0.field4242[2];
        float var17 = this.field4242[15] * arg0.field4242[15] + this.field4242[14] * arg0.field4242[11] + this.field4242[13] * arg0.field4242[7] + this.field4242[12] * arg0.field4242[3];
        this.field4242[0] = var2;
        this.field4242[1] = var3;
        this.field4242[2] = var4;
        this.field4242[3] = var5;
        this.field4242[4] = var6;
        this.field4242[5] = var7;
        this.field4242[6] = var8;
        this.field4242[7] = var9;
        this.field4242[8] = var10;
        this.field4242[9] = var11;
        this.field4242[10] = var12;
        this.field4242[11] = var13;
        this.field4242[12] = var14;
        this.field4242[13] = var15;
        this.field4242[14] = var16;
        this.field4242[15] = var17;
    }

    @ObfuscatedName("ni.q(Lnq;B)V")
    public void method6023(class371 arg0) {
        float var2 = arg0.field4233 * arg0.field4233;
        float var3 = arg0.field4233 * arg0.field4230;
        float var4 = arg0.field4234 * arg0.field4233;
        float var5 = arg0.field4235 * arg0.field4233;
        float var6 = arg0.field4230 * arg0.field4230;
        float var7 = arg0.field4234 * arg0.field4230;
        float var8 = arg0.field4235 * arg0.field4230;
        float var9 = arg0.field4234 * arg0.field4234;
        float var10 = arg0.field4235 * arg0.field4234;
        float var11 = arg0.field4235 * arg0.field4235;
        this.field4242[0] = var2 + var6 - var11 - var9;
        this.field4242[1] = var5 + var7 + var7 + var5;
        this.field4242[2] = var8 - var4 - var4 + var8;
        this.field4242[4] = var7 - var5 - var5 + var7;
        this.field4242[5] = var2 + var9 - var6 - var11;
        this.field4242[6] = var3 + var10 + var10 + var3;
        this.field4242[8] = var4 + var8 + var8 + var4;
        this.field4242[9] = var10 - var3 - var3 + var10;
        this.field4242[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("ni.x(Lng;I)V")
    public void method6029(class373 arg0) {
        this.field4242[0] = arg0.field4257;
        this.field4242[1] = arg0.field4254;
        this.field4242[2] = arg0.field4248;
        this.field4242[3] = 0.0F;
        this.field4242[4] = arg0.field4249;
        this.field4242[5] = arg0.field4246;
        this.field4242[6] = arg0.field4250;
        this.field4242[7] = 0.0F;
        this.field4242[8] = arg0.field4252;
        this.field4242[9] = arg0.field4253;
        this.field4242[10] = arg0.field4255;
        this.field4242[11] = 0.0F;
        this.field4242[12] = arg0.field4251;
        this.field4242[13] = arg0.field4256;
        this.field4242[14] = arg0.field4247;
        this.field4242[15] = 1.0F;
    }

    @ObfuscatedName("ni.p(B)F")
    public float method6025() {
        return this.field4242[6] * this.field4242[3] * this.field4242[9] * this.field4242[12] + (this.field4242[5] * this.field4242[3] * this.field4242[8] * this.field4242[14] + this.field4242[4] * this.field4242[3] * this.field4242[10] * this.field4242[13] + (this.field4242[2] * this.field4242[7] * this.field4242[8] * this.field4242[13] + this.field4242[5] * this.field4242[2] * this.field4242[11] * this.field4242[12] + (this.field4242[2] * this.field4242[4] * this.field4242[9] * this.field4242[15] + this.field4242[7] * this.field4242[1] * this.field4242[10] * this.field4242[12] + (this.field4242[1] * this.field4242[6] * this.field4242[8] * this.field4242[15] + this.field4242[4] * this.field4242[1] * this.field4242[11] * this.field4242[14] + (this.field4242[0] * this.field4242[7] * this.field4242[9] * this.field4242[14] + this.field4242[0] * this.field4242[6] * this.field4242[11] * this.field4242[13] + (this.field4242[5] * this.field4242[0] * this.field4242[10] * this.field4242[15] - this.field4242[5] * this.field4242[0] * this.field4242[11] * this.field4242[14] - this.field4242[6] * this.field4242[0] * this.field4242[9] * this.field4242[15]) - this.field4242[7] * this.field4242[0] * this.field4242[10] * this.field4242[13] - this.field4242[1] * this.field4242[4] * this.field4242[10] * this.field4242[15]) - this.field4242[6] * this.field4242[1] * this.field4242[11] * this.field4242[12] - this.field4242[1] * this.field4242[7] * this.field4242[8] * this.field4242[14]) - this.field4242[2] * this.field4242[4] * this.field4242[11] * this.field4242[13] - this.field4242[2] * this.field4242[5] * this.field4242[8] * this.field4242[15]) - this.field4242[7] * this.field4242[2] * this.field4242[9] * this.field4242[12] - this.field4242[3] * this.field4242[4] * this.field4242[9] * this.field4242[14]) - this.field4242[3] * this.field4242[5] * this.field4242[10] * this.field4242[12] - this.field4242[6] * this.field4242[3] * this.field4242[8] * this.field4242[13]);
    }

    @ObfuscatedName("ni.n(I)V")
    public void method6045() {
        float var1 = 1.0F / this.method6025();
        float var2 = (this.field4242[7] * this.field4242[9] * this.field4242[14] + this.field4242[11] * this.field4242[6] * this.field4242[13] + (this.field4242[5] * this.field4242[10] * this.field4242[15] - this.field4242[11] * this.field4242[5] * this.field4242[14] - this.field4242[6] * this.field4242[9] * this.field4242[15]) - this.field4242[10] * this.field4242[7] * this.field4242[13]) * var1;
        float var3 = (this.field4242[3] * this.field4242[10] * this.field4242[13] + (this.field4242[9] * this.field4242[2] * this.field4242[15] + this.field4242[11] * this.field4242[1] * this.field4242[14] + this.field4242[10] * -this.field4242[1] * this.field4242[15] - this.field4242[2] * this.field4242[11] * this.field4242[13] - this.field4242[9] * this.field4242[3] * this.field4242[14])) * var1;
        float var4 = (this.field4242[3] * this.field4242[5] * this.field4242[14] + this.field4242[7] * this.field4242[2] * this.field4242[13] + (this.field4242[1] * this.field4242[6] * this.field4242[15] - this.field4242[1] * this.field4242[7] * this.field4242[14] - this.field4242[5] * this.field4242[2] * this.field4242[15]) - this.field4242[6] * this.field4242[3] * this.field4242[13]) * var1;
        float var5 = (this.field4242[6] * this.field4242[3] * this.field4242[9] + (this.field4242[2] * this.field4242[5] * this.field4242[11] + this.field4242[7] * this.field4242[1] * this.field4242[10] + this.field4242[6] * -this.field4242[1] * this.field4242[11] - this.field4242[2] * this.field4242[7] * this.field4242[9] - this.field4242[5] * this.field4242[3] * this.field4242[10])) * var1;
        float var6 = (this.field4242[10] * this.field4242[7] * this.field4242[12] + (this.field4242[8] * this.field4242[6] * this.field4242[15] + this.field4242[10] * -this.field4242[4] * this.field4242[15] + this.field4242[4] * this.field4242[11] * this.field4242[14] - this.field4242[6] * this.field4242[11] * this.field4242[12] - this.field4242[7] * this.field4242[8] * this.field4242[14])) * var1;
        float var7 = (this.field4242[8] * this.field4242[3] * this.field4242[14] + this.field4242[11] * this.field4242[2] * this.field4242[12] + (this.field4242[10] * this.field4242[0] * this.field4242[15] - this.field4242[11] * this.field4242[0] * this.field4242[14] - this.field4242[2] * this.field4242[8] * this.field4242[15]) - this.field4242[10] * this.field4242[3] * this.field4242[12]) * var1;
        float var8 = (this.field4242[3] * this.field4242[6] * this.field4242[12] + (this.field4242[4] * this.field4242[2] * this.field4242[15] + this.field4242[6] * -this.field4242[0] * this.field4242[15] + this.field4242[0] * this.field4242[7] * this.field4242[14] - this.field4242[7] * this.field4242[2] * this.field4242[12] - this.field4242[3] * this.field4242[4] * this.field4242[14])) * var1;
        float var9 = (this.field4242[3] * this.field4242[4] * this.field4242[10] + this.field4242[7] * this.field4242[2] * this.field4242[8] + (this.field4242[0] * this.field4242[6] * this.field4242[11] - this.field4242[7] * this.field4242[0] * this.field4242[10] - this.field4242[4] * this.field4242[2] * this.field4242[11]) - this.field4242[6] * this.field4242[3] * this.field4242[8]) * var1;
        float var10 = (this.field4242[7] * this.field4242[8] * this.field4242[13] + this.field4242[11] * this.field4242[5] * this.field4242[12] + (this.field4242[4] * this.field4242[9] * this.field4242[15] - this.field4242[11] * this.field4242[4] * this.field4242[13] - this.field4242[5] * this.field4242[8] * this.field4242[15]) - this.field4242[7] * this.field4242[9] * this.field4242[12]) * var1;
        float var11 = (this.field4242[9] * this.field4242[3] * this.field4242[12] + (this.field4242[8] * this.field4242[1] * this.field4242[15] + this.field4242[9] * -this.field4242[0] * this.field4242[15] + this.field4242[11] * this.field4242[0] * this.field4242[13] - this.field4242[1] * this.field4242[11] * this.field4242[12] - this.field4242[8] * this.field4242[3] * this.field4242[13])) * var1;
        float var12 = (this.field4242[4] * this.field4242[3] * this.field4242[13] + this.field4242[1] * this.field4242[7] * this.field4242[12] + (this.field4242[5] * this.field4242[0] * this.field4242[15] - this.field4242[7] * this.field4242[0] * this.field4242[13] - this.field4242[4] * this.field4242[1] * this.field4242[15]) - this.field4242[5] * this.field4242[3] * this.field4242[12]) * var1;
        float var13 = (this.field4242[5] * this.field4242[3] * this.field4242[8] + (this.field4242[1] * this.field4242[4] * this.field4242[11] + this.field4242[5] * -this.field4242[0] * this.field4242[11] + this.field4242[7] * this.field4242[0] * this.field4242[9] - this.field4242[7] * this.field4242[1] * this.field4242[8] - this.field4242[3] * this.field4242[4] * this.field4242[9])) * var1;
        float var14 = (this.field4242[9] * this.field4242[6] * this.field4242[12] + (this.field4242[8] * this.field4242[5] * this.field4242[14] + this.field4242[9] * -this.field4242[4] * this.field4242[14] + this.field4242[4] * this.field4242[10] * this.field4242[13] - this.field4242[5] * this.field4242[10] * this.field4242[12] - this.field4242[6] * this.field4242[8] * this.field4242[13])) * var1;
        float var15 = (this.field4242[2] * this.field4242[8] * this.field4242[13] + this.field4242[1] * this.field4242[10] * this.field4242[12] + (this.field4242[0] * this.field4242[9] * this.field4242[14] - this.field4242[0] * this.field4242[10] * this.field4242[13] - this.field4242[8] * this.field4242[1] * this.field4242[14]) - this.field4242[2] * this.field4242[9] * this.field4242[12]) * var1;
        float var16 = (this.field4242[2] * this.field4242[5] * this.field4242[12] + (this.field4242[1] * this.field4242[4] * this.field4242[14] + this.field4242[6] * this.field4242[0] * this.field4242[13] + this.field4242[5] * -this.field4242[0] * this.field4242[14] - this.field4242[1] * this.field4242[6] * this.field4242[12] - this.field4242[2] * this.field4242[4] * this.field4242[13])) * var1;
        float var17 = (this.field4242[2] * this.field4242[4] * this.field4242[9] + this.field4242[1] * this.field4242[6] * this.field4242[8] + (this.field4242[5] * this.field4242[0] * this.field4242[10] - this.field4242[0] * this.field4242[6] * this.field4242[9] - this.field4242[4] * this.field4242[1] * this.field4242[10]) - this.field4242[5] * this.field4242[2] * this.field4242[8]) * var1;
        this.field4242[0] = var2;
        this.field4242[1] = var3;
        this.field4242[2] = var4;
        this.field4242[3] = var5;
        this.field4242[4] = var6;
        this.field4242[5] = var7;
        this.field4242[6] = var8;
        this.field4242[7] = var9;
        this.field4242[8] = var10;
        this.field4242[9] = var11;
        this.field4242[10] = var12;
        this.field4242[11] = var13;
        this.field4242[12] = var14;
        this.field4242[13] = var15;
        this.field4242[14] = var16;
        this.field4242[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method6072();
        this.method6015();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4242[var2 * 4 + var3];
                if (Math.sqrt((double) (var4 * var4)) < 9.999999747378752E-5D) {
                    var4 = 0.0F;
                }
                var1.append(var4);
            }
            var1.append("\n");
        }
        return var1.toString();
    }

    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        return var2 * 31 + Arrays.hashCode(this.field4242);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class372)) {
            return false;
        }
        class372 var2 = (class372) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4242[var3] != var2.field4242[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ni.m(B)[F")
    public float[] method6028() {
        float[] var1 = new float[3];
        class370 var2 = new class370(this.field4242[0], this.field4242[1], this.field4242[2]);
        class370 var3 = new class370(this.field4242[4], this.field4242[5], this.field4242[6]);
        class370 var4 = new class370(this.field4242[8], this.field4242[9], this.field4242[10]);
        var1[0] = var2.method5978();
        var1[1] = var3.method5978();
        var1[2] = var4.method5978();
        return var1;
    }
}
