package deob;

import java.util.Arrays;

@ObfuscatedName("nw")
public final class class390 {

    @ObfuscatedName("nw.p")
    public static class390[] field4438 = new class390[0];

    @ObfuscatedName("nw.f")
    public static final class390 field4439;

    @ObfuscatedName("nw.n")
    public static int field4442 = 100;

    @ObfuscatedName("nw.k")
    public static int field4440;

    @ObfuscatedName("nw.w")
    public float[] field4441 = new float[16];

    static {
        field4438 = new class390[100];
        field4440 = 0;
        field4439 = new class390();
    }

    @ObfuscatedName("gd.c(B)Lnw;")
    public static class390 method3607() {
        class390[] var0 = field4438;
        synchronized (field4438) {
            if (field4440 == 0) {
                return new class390();
            } else {
                field4438[--field4440].method6501();
                return field4438[field4440];
            }
        }
    }

    @ObfuscatedName("nw.p(I)V")
    public void method6532() {
        class390[] var1 = field4438;
        synchronized (field4438) {
            if (field4440 < field4442 - 1) {
                field4438[++field4440 - 1] = this;
            }
        }
    }

    public class390() {
        this.method6501();
    }

    public class390(class390 arg0) {
        this.method6556(arg0);
    }

    public class390(class445 arg0, boolean arg1) {
        this.method6498(arg0, arg1);
    }

    @ObfuscatedName("nw.f(Lqq;ZI)V")
    public void method6498(class445 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4441[var4] = arg0.method7203();
            }
            return;
        }
        class391 var3 = new class391();
        var3.method6569(Statics.method2668(arg0.method7199()));
        var3.method6564(Statics.method2668(arg0.method7199()));
        var3.method6565(Statics.method2668(arg0.method7199()));
        var3.method6566((float) arg0.method7199(), (float) arg0.method7199(), (float) arg0.method7199());
        this.method6509(var3);
    }

    @ObfuscatedName("nw.n(I)[F")
    public float[] method6499() {
        float[] var1 = new float[3];
        if ((double) this.field4441[2] < 0.999D && (double) this.field4441[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4441[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4441[6] / var2, (double) this.field4441[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4441[1] / var2, (double) this.field4441[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4441[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4441[9]), (double) this.field4441[5]);
        }
        return var1;
    }

    @ObfuscatedName("nw.k(B)[F")
    public float[] method6535() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4441[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4441[2];
            double var6 = (double) this.field4441[10];
            double var8 = (double) this.field4441[4];
            double var10 = (double) this.field4441[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4441[1];
            double var14 = (double) this.field4441[0];
            if (this.field4441[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("nw.w(I)V")
    public void method6501() {
        this.field4441[0] = 1.0F;
        this.field4441[1] = 0.0F;
        this.field4441[2] = 0.0F;
        this.field4441[3] = 0.0F;
        this.field4441[4] = 0.0F;
        this.field4441[5] = 1.0F;
        this.field4441[6] = 0.0F;
        this.field4441[7] = 0.0F;
        this.field4441[8] = 0.0F;
        this.field4441[9] = 0.0F;
        this.field4441[10] = 1.0F;
        this.field4441[11] = 0.0F;
        this.field4441[12] = 0.0F;
        this.field4441[13] = 0.0F;
        this.field4441[14] = 0.0F;
        this.field4441[15] = 1.0F;
    }

    @ObfuscatedName("nw.s(I)V")
    public void method6502() {
        this.field4441[0] = 0.0F;
        this.field4441[1] = 0.0F;
        this.field4441[2] = 0.0F;
        this.field4441[3] = 0.0F;
        this.field4441[4] = 0.0F;
        this.field4441[5] = 0.0F;
        this.field4441[6] = 0.0F;
        this.field4441[7] = 0.0F;
        this.field4441[8] = 0.0F;
        this.field4441[9] = 0.0F;
        this.field4441[10] = 0.0F;
        this.field4441[11] = 0.0F;
        this.field4441[12] = 0.0F;
        this.field4441[13] = 0.0F;
        this.field4441[14] = 0.0F;
        this.field4441[15] = 0.0F;
    }

    @ObfuscatedName("nw.q(Lnw;B)V")
    public void method6556(class390 arg0) {
        System.arraycopy(arg0.field4441, 0, this.field4441, 0, 16);
    }

    @ObfuscatedName("nw.m(FI)V")
    public void method6530(float arg0) {
        this.method6505(arg0, arg0, arg0);
    }

    @ObfuscatedName("nw.x(FFFB)V")
    public void method6505(float arg0, float arg1, float arg2) {
        this.method6501();
        this.field4441[0] = arg0;
        this.field4441[5] = arg1;
        this.field4441[10] = arg2;
    }

    @ObfuscatedName("nw.j(Lnw;I)V")
    public void method6550(class390 arg0) {
        for (int var2 = 0; var2 < this.field4441.length; var2++) {
            this.field4441[var2] += arg0.field4441[var2];
        }
    }

    @ObfuscatedName("nw.v(Lnw;I)V")
    public void method6507(class390 arg0) {
        float var2 = this.field4441[3] * arg0.field4441[12] + this.field4441[2] * arg0.field4441[8] + this.field4441[0] * arg0.field4441[0] + this.field4441[1] * arg0.field4441[4];
        float var3 = this.field4441[3] * arg0.field4441[13] + this.field4441[2] * arg0.field4441[9] + this.field4441[1] * arg0.field4441[5] + this.field4441[0] * arg0.field4441[1];
        float var4 = this.field4441[3] * arg0.field4441[14] + this.field4441[2] * arg0.field4441[10] + this.field4441[0] * arg0.field4441[2] + this.field4441[1] * arg0.field4441[6];
        float var5 = this.field4441[3] * arg0.field4441[15] + this.field4441[2] * arg0.field4441[11] + this.field4441[0] * arg0.field4441[3] + this.field4441[1] * arg0.field4441[7];
        float var6 = this.field4441[7] * arg0.field4441[12] + this.field4441[6] * arg0.field4441[8] + this.field4441[4] * arg0.field4441[0] + this.field4441[5] * arg0.field4441[4];
        float var7 = this.field4441[7] * arg0.field4441[13] + this.field4441[6] * arg0.field4441[9] + this.field4441[5] * arg0.field4441[5] + this.field4441[4] * arg0.field4441[1];
        float var8 = this.field4441[7] * arg0.field4441[14] + this.field4441[6] * arg0.field4441[10] + this.field4441[4] * arg0.field4441[2] + this.field4441[5] * arg0.field4441[6];
        float var9 = this.field4441[7] * arg0.field4441[15] + this.field4441[6] * arg0.field4441[11] + this.field4441[4] * arg0.field4441[3] + this.field4441[5] * arg0.field4441[7];
        float var10 = this.field4441[11] * arg0.field4441[12] + this.field4441[10] * arg0.field4441[8] + this.field4441[8] * arg0.field4441[0] + this.field4441[9] * arg0.field4441[4];
        float var11 = this.field4441[11] * arg0.field4441[13] + this.field4441[10] * arg0.field4441[9] + this.field4441[9] * arg0.field4441[5] + this.field4441[8] * arg0.field4441[1];
        float var12 = this.field4441[11] * arg0.field4441[14] + this.field4441[10] * arg0.field4441[10] + this.field4441[9] * arg0.field4441[6] + this.field4441[8] * arg0.field4441[2];
        float var13 = this.field4441[11] * arg0.field4441[15] + this.field4441[10] * arg0.field4441[11] + this.field4441[9] * arg0.field4441[7] + this.field4441[8] * arg0.field4441[3];
        float var14 = this.field4441[15] * arg0.field4441[12] + this.field4441[14] * arg0.field4441[8] + this.field4441[12] * arg0.field4441[0] + this.field4441[13] * arg0.field4441[4];
        float var15 = this.field4441[15] * arg0.field4441[13] + this.field4441[14] * arg0.field4441[9] + this.field4441[13] * arg0.field4441[5] + this.field4441[12] * arg0.field4441[1];
        float var16 = this.field4441[15] * arg0.field4441[14] + this.field4441[14] * arg0.field4441[10] + this.field4441[12] * arg0.field4441[2] + this.field4441[13] * arg0.field4441[6];
        float var17 = this.field4441[15] * arg0.field4441[15] + this.field4441[14] * arg0.field4441[11] + this.field4441[13] * arg0.field4441[7] + this.field4441[12] * arg0.field4441[3];
        this.field4441[0] = var2;
        this.field4441[1] = var3;
        this.field4441[2] = var4;
        this.field4441[3] = var5;
        this.field4441[4] = var6;
        this.field4441[5] = var7;
        this.field4441[6] = var8;
        this.field4441[7] = var9;
        this.field4441[8] = var10;
        this.field4441[9] = var11;
        this.field4441[10] = var12;
        this.field4441[11] = var13;
        this.field4441[12] = var14;
        this.field4441[13] = var15;
        this.field4441[14] = var16;
        this.field4441[15] = var17;
    }

    @ObfuscatedName("nw.h(Lnn;I)V")
    public void method6508(class389 arg0) {
        float var2 = arg0.field4436 * arg0.field4436;
        float var3 = arg0.field4436 * arg0.field4433;
        float var4 = arg0.field4436 * arg0.field4434;
        float var5 = arg0.field4436 * arg0.field4432;
        float var6 = arg0.field4433 * arg0.field4433;
        float var7 = arg0.field4434 * arg0.field4433;
        float var8 = arg0.field4433 * arg0.field4432;
        float var9 = arg0.field4434 * arg0.field4434;
        float var10 = arg0.field4434 * arg0.field4432;
        float var11 = arg0.field4432 * arg0.field4432;
        this.field4441[0] = var2 + var6 - var11 - var9;
        this.field4441[1] = var5 + var7 + var7 + var5;
        this.field4441[2] = var8 - var4 - var4 + var8;
        this.field4441[4] = var7 - var5 - var5 + var7;
        this.field4441[5] = var2 + var9 - var6 - var11;
        this.field4441[6] = var3 + var10 + var10 + var3;
        this.field4441[8] = var4 + var8 + var8 + var4;
        this.field4441[9] = var10 - var3 - var3 + var10;
        this.field4441[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("nw.t(Lod;I)V")
    public void method6509(class391 arg0) {
        this.field4441[0] = arg0.field4449;
        this.field4441[1] = arg0.field4453;
        this.field4441[2] = arg0.field4445;
        this.field4441[3] = 0.0F;
        this.field4441[4] = arg0.field4451;
        this.field4441[5] = arg0.field4447;
        this.field4441[6] = arg0.field4448;
        this.field4441[7] = 0.0F;
        this.field4441[8] = arg0.field4443;
        this.field4441[9] = arg0.field4450;
        this.field4441[10] = arg0.field4444;
        this.field4441[11] = 0.0F;
        this.field4441[12] = arg0.field4452;
        this.field4441[13] = arg0.field4446;
        this.field4441[14] = arg0.field4454;
        this.field4441[15] = 1.0F;
    }

    @ObfuscatedName("nw.u(I)F")
    public float method6510() {
        return this.field4441[3] * this.field4441[6] * this.field4441[9] * this.field4441[12] + (this.field4441[3] * this.field4441[5] * this.field4441[8] * this.field4441[14] + this.field4441[3] * this.field4441[4] * this.field4441[10] * this.field4441[13] + (this.field4441[7] * this.field4441[2] * this.field4441[8] * this.field4441[13] + this.field4441[5] * this.field4441[2] * this.field4441[11] * this.field4441[12] + (this.field4441[4] * this.field4441[2] * this.field4441[9] * this.field4441[15] + this.field4441[7] * this.field4441[1] * this.field4441[10] * this.field4441[12] + (this.field4441[1] * this.field4441[6] * this.field4441[8] * this.field4441[15] + this.field4441[1] * this.field4441[4] * this.field4441[11] * this.field4441[14] + (this.field4441[0] * this.field4441[7] * this.field4441[9] * this.field4441[14] + this.field4441[6] * this.field4441[0] * this.field4441[11] * this.field4441[13] + (this.field4441[5] * this.field4441[0] * this.field4441[10] * this.field4441[15] - this.field4441[5] * this.field4441[0] * this.field4441[11] * this.field4441[14] - this.field4441[6] * this.field4441[0] * this.field4441[9] * this.field4441[15]) - this.field4441[0] * this.field4441[7] * this.field4441[10] * this.field4441[13] - this.field4441[4] * this.field4441[1] * this.field4441[10] * this.field4441[15]) - this.field4441[6] * this.field4441[1] * this.field4441[11] * this.field4441[12] - this.field4441[1] * this.field4441[7] * this.field4441[8] * this.field4441[14]) - this.field4441[2] * this.field4441[4] * this.field4441[11] * this.field4441[13] - this.field4441[2] * this.field4441[5] * this.field4441[8] * this.field4441[15]) - this.field4441[2] * this.field4441[7] * this.field4441[9] * this.field4441[12] - this.field4441[4] * this.field4441[3] * this.field4441[9] * this.field4441[14]) - this.field4441[3] * this.field4441[5] * this.field4441[10] * this.field4441[12] - this.field4441[3] * this.field4441[6] * this.field4441[8] * this.field4441[13]);
    }

    @ObfuscatedName("nw.d(I)V")
    public void method6528() {
        float var1 = 1.0F / this.method6510();
        float var2 = (this.field4441[7] * this.field4441[9] * this.field4441[14] + this.field4441[11] * this.field4441[6] * this.field4441[13] + (this.field4441[5] * this.field4441[10] * this.field4441[15] - this.field4441[5] * this.field4441[11] * this.field4441[14] - this.field4441[9] * this.field4441[6] * this.field4441[15]) - this.field4441[7] * this.field4441[10] * this.field4441[13]) * var1;
        float var3 = (this.field4441[10] * this.field4441[3] * this.field4441[13] + (this.field4441[9] * this.field4441[2] * this.field4441[15] + this.field4441[1] * this.field4441[11] * this.field4441[14] + this.field4441[10] * -this.field4441[1] * this.field4441[15] - this.field4441[11] * this.field4441[2] * this.field4441[13] - this.field4441[3] * this.field4441[9] * this.field4441[14])) * var1;
        float var4 = (this.field4441[5] * this.field4441[3] * this.field4441[14] + this.field4441[2] * this.field4441[7] * this.field4441[13] + (this.field4441[1] * this.field4441[6] * this.field4441[15] - this.field4441[7] * this.field4441[1] * this.field4441[14] - this.field4441[5] * this.field4441[2] * this.field4441[15]) - this.field4441[3] * this.field4441[6] * this.field4441[13]) * var1;
        float var5 = (this.field4441[3] * this.field4441[6] * this.field4441[9] + (this.field4441[5] * this.field4441[2] * this.field4441[11] + this.field4441[1] * this.field4441[7] * this.field4441[10] + this.field4441[6] * -this.field4441[1] * this.field4441[11] - this.field4441[2] * this.field4441[7] * this.field4441[9] - this.field4441[3] * this.field4441[5] * this.field4441[10])) * var1;
        float var6 = (this.field4441[7] * this.field4441[10] * this.field4441[12] + (this.field4441[6] * this.field4441[8] * this.field4441[15] + this.field4441[11] * this.field4441[4] * this.field4441[14] + this.field4441[10] * -this.field4441[4] * this.field4441[15] - this.field4441[11] * this.field4441[6] * this.field4441[12] - this.field4441[7] * this.field4441[8] * this.field4441[14])) * var1;
        float var7 = (this.field4441[8] * this.field4441[3] * this.field4441[14] + this.field4441[2] * this.field4441[11] * this.field4441[12] + (this.field4441[10] * this.field4441[0] * this.field4441[15] - this.field4441[0] * this.field4441[11] * this.field4441[14] - this.field4441[8] * this.field4441[2] * this.field4441[15]) - this.field4441[3] * this.field4441[10] * this.field4441[12]) * var1;
        float var8 = (this.field4441[3] * this.field4441[6] * this.field4441[12] + (this.field4441[2] * this.field4441[4] * this.field4441[15] + this.field4441[6] * -this.field4441[0] * this.field4441[15] + this.field4441[7] * this.field4441[0] * this.field4441[14] - this.field4441[2] * this.field4441[7] * this.field4441[12] - this.field4441[4] * this.field4441[3] * this.field4441[14])) * var1;
        float var9 = (this.field4441[3] * this.field4441[4] * this.field4441[10] + this.field4441[7] * this.field4441[2] * this.field4441[8] + (this.field4441[0] * this.field4441[6] * this.field4441[11] - this.field4441[0] * this.field4441[7] * this.field4441[10] - this.field4441[4] * this.field4441[2] * this.field4441[11]) - this.field4441[3] * this.field4441[6] * this.field4441[8]) * var1;
        float var10 = (this.field4441[8] * this.field4441[7] * this.field4441[13] + this.field4441[11] * this.field4441[5] * this.field4441[12] + (this.field4441[4] * this.field4441[9] * this.field4441[15] - this.field4441[11] * this.field4441[4] * this.field4441[13] - this.field4441[8] * this.field4441[5] * this.field4441[15]) - this.field4441[9] * this.field4441[7] * this.field4441[12]) * var1;
        float var11 = (this.field4441[3] * this.field4441[9] * this.field4441[12] + (this.field4441[8] * this.field4441[1] * this.field4441[15] + this.field4441[0] * this.field4441[11] * this.field4441[13] + this.field4441[9] * -this.field4441[0] * this.field4441[15] - this.field4441[11] * this.field4441[1] * this.field4441[12] - this.field4441[3] * this.field4441[8] * this.field4441[13])) * var1;
        float var12 = (this.field4441[3] * this.field4441[4] * this.field4441[13] + this.field4441[1] * this.field4441[7] * this.field4441[12] + (this.field4441[5] * this.field4441[0] * this.field4441[15] - this.field4441[7] * this.field4441[0] * this.field4441[13] - this.field4441[4] * this.field4441[1] * this.field4441[15]) - this.field4441[5] * this.field4441[3] * this.field4441[12]) * var1;
        float var13 = (this.field4441[5] * this.field4441[3] * this.field4441[8] + (this.field4441[1] * this.field4441[4] * this.field4441[11] + this.field4441[5] * -this.field4441[0] * this.field4441[11] + this.field4441[0] * this.field4441[7] * this.field4441[9] - this.field4441[7] * this.field4441[1] * this.field4441[8] - this.field4441[4] * this.field4441[3] * this.field4441[9])) * var1;
        float var14 = (this.field4441[6] * this.field4441[9] * this.field4441[12] + (this.field4441[5] * this.field4441[8] * this.field4441[14] + this.field4441[9] * -this.field4441[4] * this.field4441[14] + this.field4441[4] * this.field4441[10] * this.field4441[13] - this.field4441[10] * this.field4441[5] * this.field4441[12] - this.field4441[8] * this.field4441[6] * this.field4441[13])) * var1;
        float var15 = (this.field4441[2] * this.field4441[8] * this.field4441[13] + this.field4441[10] * this.field4441[1] * this.field4441[12] + (this.field4441[0] * this.field4441[9] * this.field4441[14] - this.field4441[10] * this.field4441[0] * this.field4441[13] - this.field4441[8] * this.field4441[1] * this.field4441[14]) - this.field4441[9] * this.field4441[2] * this.field4441[12]) * var1;
        float var16 = (this.field4441[5] * this.field4441[2] * this.field4441[12] + (this.field4441[4] * this.field4441[1] * this.field4441[14] + this.field4441[0] * this.field4441[6] * this.field4441[13] + this.field4441[5] * -this.field4441[0] * this.field4441[14] - this.field4441[6] * this.field4441[1] * this.field4441[12] - this.field4441[2] * this.field4441[4] * this.field4441[13])) * var1;
        float var17 = (this.field4441[2] * this.field4441[4] * this.field4441[9] + this.field4441[6] * this.field4441[1] * this.field4441[8] + (this.field4441[5] * this.field4441[0] * this.field4441[10] - this.field4441[6] * this.field4441[0] * this.field4441[9] - this.field4441[4] * this.field4441[1] * this.field4441[10]) - this.field4441[2] * this.field4441[5] * this.field4441[8]) * var1;
        this.field4441[0] = var2;
        this.field4441[1] = var3;
        this.field4441[2] = var4;
        this.field4441[3] = var5;
        this.field4441[4] = var6;
        this.field4441[5] = var7;
        this.field4441[6] = var8;
        this.field4441[7] = var9;
        this.field4441[8] = var10;
        this.field4441[9] = var11;
        this.field4441[10] = var12;
        this.field4441[11] = var13;
        this.field4441[12] = var14;
        this.field4441[13] = var15;
        this.field4441[14] = var16;
        this.field4441[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method6535();
        this.method6499();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4441[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4441);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class390)) {
            return false;
        }
        class390 var2 = (class390) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4441[var3] != var2.field4441[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("nw.b(B)[F")
    public float[] method6514() {
        float[] var1 = new float[3];
        class388 var2 = new class388(this.field4441[0], this.field4441[1], this.field4441[2]);
        class388 var3 = new class388(this.field4441[4], this.field4441[5], this.field4441[6]);
        class388 var4 = new class388(this.field4441[8], this.field4441[9], this.field4441[10]);
        var1[0] = var2.method6459();
        var1[1] = var3.method6459();
        var1[2] = var4.method6459();
        return var1;
    }
}
