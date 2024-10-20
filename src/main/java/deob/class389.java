package deob;

import java.util.Arrays;

@ObfuscatedName("nw")
public final class class389 {

    @ObfuscatedName("nw.q")
    public static class389[] field4403 = new class389[0];

    @ObfuscatedName("nw.a")
    public float[] field4401 = new float[16];

    @ObfuscatedName("nw.m")
    public static final class389 field4404;

    static {
        method2951(100);
        field4404 = new class389();
    }

    @ObfuscatedName("fz.o(II)V")
    public static void method2951(int arg0) {
        Statics.field4070 = arg0;
        field4403 = new class389[arg0];
        Statics.field4402 = 0;
    }

    @ObfuscatedName("gn.q(S)Lnw;")
    public static class389 method3601() {
        class389[] var0 = field4403;
        synchronized (field4403) {
            if (Statics.field4402 == 0) {
                return new class389();
            } else {
                field4403[--Statics.field4402].method6288();
                return field4403[Statics.field4402];
            }
        }
    }

    @ObfuscatedName("nw.l(I)V")
    public void method6292() {
        class389[] var1 = field4403;
        synchronized (field4403) {
            if (Statics.field4402 < Statics.field4070 - 1) {
                field4403[++Statics.field4402 - 1] = this;
            }
        }
    }

    public class389() {
        this.method6288();
    }

    public class389(class389 arg0) {
        this.method6295(arg0);
    }

    public class389(class440 arg0, boolean arg1) {
        this.method6235(arg0, arg1);
    }

    @ObfuscatedName("nw.k(Lpx;ZI)V")
    public void method6235(class440 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4401[var4] = arg0.method6948();
            }
            return;
        }
        class390 var3 = new class390();
        var3.method6304(class403.method5868(arg0.method6896()));
        var3.method6305(class403.method5868(arg0.method6896()));
        var3.method6306(class403.method5868(arg0.method6896()));
        var3.method6314((float) arg0.method6896(), (float) arg0.method6896(), (float) arg0.method6896());
        this.method6239(var3);
    }

    @ObfuscatedName("nw.a(I)[F")
    public float[] method6236() {
        float[] var1 = new float[3];
        if ((double) this.field4401[2] < 0.999D && (double) this.field4401[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4401[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4401[6] / var2, (double) this.field4401[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4401[1] / var2, (double) this.field4401[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4401[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4401[9]), (double) this.field4401[5]);
        }
        return var1;
    }

    @ObfuscatedName("nw.m(I)[F")
    public float[] method6237() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4401[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4401[2];
            double var6 = (double) this.field4401[10];
            double var8 = (double) this.field4401[4];
            double var10 = (double) this.field4401[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4401[1];
            double var14 = (double) this.field4401[0];
            if (this.field4401[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("nw.p(I)V")
    public void method6288() {
        this.field4401[0] = 1.0F;
        this.field4401[1] = 0.0F;
        this.field4401[2] = 0.0F;
        this.field4401[3] = 0.0F;
        this.field4401[4] = 0.0F;
        this.field4401[5] = 1.0F;
        this.field4401[6] = 0.0F;
        this.field4401[7] = 0.0F;
        this.field4401[8] = 0.0F;
        this.field4401[9] = 0.0F;
        this.field4401[10] = 1.0F;
        this.field4401[11] = 0.0F;
        this.field4401[12] = 0.0F;
        this.field4401[13] = 0.0F;
        this.field4401[14] = 0.0F;
        this.field4401[15] = 1.0F;
    }

    @ObfuscatedName("nw.s(I)V")
    public void method6256() {
        this.field4401[0] = 0.0F;
        this.field4401[1] = 0.0F;
        this.field4401[2] = 0.0F;
        this.field4401[3] = 0.0F;
        this.field4401[4] = 0.0F;
        this.field4401[5] = 0.0F;
        this.field4401[6] = 0.0F;
        this.field4401[7] = 0.0F;
        this.field4401[8] = 0.0F;
        this.field4401[9] = 0.0F;
        this.field4401[10] = 0.0F;
        this.field4401[11] = 0.0F;
        this.field4401[12] = 0.0F;
        this.field4401[13] = 0.0F;
        this.field4401[14] = 0.0F;
        this.field4401[15] = 0.0F;
    }

    @ObfuscatedName("nw.r(Lnw;B)V")
    public void method6295(class389 arg0) {
        System.arraycopy(arg0.field4401, 0, this.field4401, 0, 16);
    }

    @ObfuscatedName("nw.v(FB)V")
    public void method6233(float arg0) {
        this.method6241(arg0, arg0, arg0);
    }

    @ObfuscatedName("nw.y(FFFI)V")
    public void method6241(float arg0, float arg1, float arg2) {
        this.method6288();
        this.field4401[0] = arg0;
        this.field4401[5] = arg1;
        this.field4401[10] = arg2;
    }

    @ObfuscatedName("nw.c(Lnw;I)V")
    public void method6242(class389 arg0) {
        for (int var2 = 0; var2 < this.field4401.length; var2++) {
            this.field4401[var2] += arg0.field4401[var2];
        }
    }

    @ObfuscatedName("nw.w(Lnw;B)V")
    public void method6243(class389 arg0) {
        float var2 = this.field4401[3] * arg0.field4401[12] + this.field4401[2] * arg0.field4401[8] + this.field4401[1] * arg0.field4401[4] + this.field4401[0] * arg0.field4401[0];
        float var3 = this.field4401[3] * arg0.field4401[13] + this.field4401[2] * arg0.field4401[9] + this.field4401[1] * arg0.field4401[5] + this.field4401[0] * arg0.field4401[1];
        float var4 = this.field4401[3] * arg0.field4401[14] + this.field4401[2] * arg0.field4401[10] + this.field4401[1] * arg0.field4401[6] + this.field4401[0] * arg0.field4401[2];
        float var5 = this.field4401[3] * arg0.field4401[15] + this.field4401[2] * arg0.field4401[11] + this.field4401[0] * arg0.field4401[3] + this.field4401[1] * arg0.field4401[7];
        float var6 = this.field4401[7] * arg0.field4401[12] + this.field4401[6] * arg0.field4401[8] + this.field4401[4] * arg0.field4401[0] + this.field4401[5] * arg0.field4401[4];
        float var7 = this.field4401[7] * arg0.field4401[13] + this.field4401[6] * arg0.field4401[9] + this.field4401[4] * arg0.field4401[1] + this.field4401[5] * arg0.field4401[5];
        float var8 = this.field4401[7] * arg0.field4401[14] + this.field4401[6] * arg0.field4401[10] + this.field4401[4] * arg0.field4401[2] + this.field4401[5] * arg0.field4401[6];
        float var9 = this.field4401[7] * arg0.field4401[15] + this.field4401[6] * arg0.field4401[11] + this.field4401[4] * arg0.field4401[3] + this.field4401[5] * arg0.field4401[7];
        float var10 = this.field4401[11] * arg0.field4401[12] + this.field4401[10] * arg0.field4401[8] + this.field4401[9] * arg0.field4401[4] + this.field4401[8] * arg0.field4401[0];
        float var11 = this.field4401[11] * arg0.field4401[13] + this.field4401[10] * arg0.field4401[9] + this.field4401[8] * arg0.field4401[1] + this.field4401[9] * arg0.field4401[5];
        float var12 = this.field4401[11] * arg0.field4401[14] + this.field4401[10] * arg0.field4401[10] + this.field4401[9] * arg0.field4401[6] + this.field4401[8] * arg0.field4401[2];
        float var13 = this.field4401[11] * arg0.field4401[15] + this.field4401[10] * arg0.field4401[11] + this.field4401[9] * arg0.field4401[7] + this.field4401[8] * arg0.field4401[3];
        float var14 = this.field4401[15] * arg0.field4401[12] + this.field4401[14] * arg0.field4401[8] + this.field4401[13] * arg0.field4401[4] + this.field4401[12] * arg0.field4401[0];
        float var15 = this.field4401[15] * arg0.field4401[13] + this.field4401[14] * arg0.field4401[9] + this.field4401[13] * arg0.field4401[5] + this.field4401[12] * arg0.field4401[1];
        float var16 = this.field4401[15] * arg0.field4401[14] + this.field4401[14] * arg0.field4401[10] + this.field4401[13] * arg0.field4401[6] + this.field4401[12] * arg0.field4401[2];
        float var17 = this.field4401[15] * arg0.field4401[15] + this.field4401[14] * arg0.field4401[11] + this.field4401[12] * arg0.field4401[3] + this.field4401[13] * arg0.field4401[7];
        this.field4401[0] = var2;
        this.field4401[1] = var3;
        this.field4401[2] = var4;
        this.field4401[3] = var5;
        this.field4401[4] = var6;
        this.field4401[5] = var7;
        this.field4401[6] = var8;
        this.field4401[7] = var9;
        this.field4401[8] = var10;
        this.field4401[9] = var11;
        this.field4401[10] = var12;
        this.field4401[11] = var13;
        this.field4401[12] = var14;
        this.field4401[13] = var15;
        this.field4401[14] = var16;
        this.field4401[15] = var17;
    }

    @ObfuscatedName("nw.b(Lnh;I)V")
    public void method6244(class388 arg0) {
        float var2 = arg0.field4398 * arg0.field4398;
        float var3 = arg0.field4398 * arg0.field4394;
        float var4 = arg0.field4398 * arg0.field4395;
        float var5 = arg0.field4398 * arg0.field4397;
        float var6 = arg0.field4394 * arg0.field4394;
        float var7 = arg0.field4395 * arg0.field4394;
        float var8 = arg0.field4397 * arg0.field4394;
        float var9 = arg0.field4395 * arg0.field4395;
        float var10 = arg0.field4397 * arg0.field4395;
        float var11 = arg0.field4397 * arg0.field4397;
        this.field4401[0] = var2 + var6 - var11 - var9;
        this.field4401[1] = var5 + var7 + var7 + var5;
        this.field4401[2] = var8 - var4 - var4 + var8;
        this.field4401[4] = var7 - var5 - var5 + var7;
        this.field4401[5] = var2 + var9 - var6 - var11;
        this.field4401[6] = var3 + var10 + var10 + var3;
        this.field4401[8] = var4 + var8 + var8 + var4;
        this.field4401[9] = var10 - var3 - var3 + var10;
        this.field4401[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("nw.t(Lnt;I)V")
    public void method6239(class390 arg0) {
        this.field4401[0] = arg0.field4411;
        this.field4401[1] = arg0.field4406;
        this.field4401[2] = arg0.field4407;
        this.field4401[3] = 0.0F;
        this.field4401[4] = arg0.field4408;
        this.field4401[5] = arg0.field4410;
        this.field4401[6] = arg0.field4413;
        this.field4401[7] = 0.0F;
        this.field4401[8] = arg0.field4414;
        this.field4401[9] = arg0.field4412;
        this.field4401[10] = arg0.field4405;
        this.field4401[11] = 0.0F;
        this.field4401[12] = arg0.field4409;
        this.field4401[13] = arg0.field4415;
        this.field4401[14] = arg0.field4416;
        this.field4401[15] = 1.0F;
    }

    @ObfuscatedName("nw.g(I)F")
    public float method6246() {
        return this.field4401[6] * this.field4401[3] * this.field4401[9] * this.field4401[12] + (this.field4401[5] * this.field4401[3] * this.field4401[8] * this.field4401[14] + this.field4401[4] * this.field4401[3] * this.field4401[10] * this.field4401[13] + (this.field4401[7] * this.field4401[2] * this.field4401[8] * this.field4401[13] + this.field4401[2] * this.field4401[5] * this.field4401[11] * this.field4401[12] + (this.field4401[4] * this.field4401[2] * this.field4401[9] * this.field4401[15] + this.field4401[7] * this.field4401[1] * this.field4401[10] * this.field4401[12] + (this.field4401[1] * this.field4401[6] * this.field4401[8] * this.field4401[15] + this.field4401[1] * this.field4401[4] * this.field4401[11] * this.field4401[14] + (this.field4401[7] * this.field4401[0] * this.field4401[9] * this.field4401[14] + this.field4401[0] * this.field4401[6] * this.field4401[11] * this.field4401[13] + (this.field4401[0] * this.field4401[5] * this.field4401[10] * this.field4401[15] - this.field4401[0] * this.field4401[5] * this.field4401[11] * this.field4401[14] - this.field4401[0] * this.field4401[6] * this.field4401[9] * this.field4401[15]) - this.field4401[7] * this.field4401[0] * this.field4401[10] * this.field4401[13] - this.field4401[1] * this.field4401[4] * this.field4401[10] * this.field4401[15]) - this.field4401[6] * this.field4401[1] * this.field4401[11] * this.field4401[12] - this.field4401[7] * this.field4401[1] * this.field4401[8] * this.field4401[14]) - this.field4401[4] * this.field4401[2] * this.field4401[11] * this.field4401[13] - this.field4401[2] * this.field4401[5] * this.field4401[8] * this.field4401[15]) - this.field4401[2] * this.field4401[7] * this.field4401[9] * this.field4401[12] - this.field4401[3] * this.field4401[4] * this.field4401[9] * this.field4401[14]) - this.field4401[3] * this.field4401[5] * this.field4401[10] * this.field4401[12] - this.field4401[6] * this.field4401[3] * this.field4401[8] * this.field4401[13]);
    }

    @ObfuscatedName("nw.x(I)V")
    public void method6247() {
        float var1 = 1.0F / this.method6246();
        float var2 = (this.field4401[7] * this.field4401[9] * this.field4401[14] + this.field4401[6] * this.field4401[11] * this.field4401[13] + (this.field4401[10] * this.field4401[5] * this.field4401[15] - this.field4401[11] * this.field4401[5] * this.field4401[14] - this.field4401[6] * this.field4401[9] * this.field4401[15]) - this.field4401[7] * this.field4401[10] * this.field4401[13]) * var1;
        float var3 = (this.field4401[10] * this.field4401[3] * this.field4401[13] + (this.field4401[2] * this.field4401[9] * this.field4401[15] + this.field4401[1] * this.field4401[11] * this.field4401[14] + this.field4401[10] * -this.field4401[1] * this.field4401[15] - this.field4401[11] * this.field4401[2] * this.field4401[13] - this.field4401[9] * this.field4401[3] * this.field4401[14])) * var1;
        float var4 = (this.field4401[5] * this.field4401[3] * this.field4401[14] + this.field4401[2] * this.field4401[7] * this.field4401[13] + (this.field4401[6] * this.field4401[1] * this.field4401[15] - this.field4401[7] * this.field4401[1] * this.field4401[14] - this.field4401[2] * this.field4401[5] * this.field4401[15]) - this.field4401[3] * this.field4401[6] * this.field4401[13]) * var1;
        float var5 = (this.field4401[6] * this.field4401[3] * this.field4401[9] + (this.field4401[5] * this.field4401[2] * this.field4401[11] + this.field4401[6] * -this.field4401[1] * this.field4401[11] + this.field4401[7] * this.field4401[1] * this.field4401[10] - this.field4401[7] * this.field4401[2] * this.field4401[9] - this.field4401[3] * this.field4401[5] * this.field4401[10])) * var1;
        float var6 = (this.field4401[10] * this.field4401[7] * this.field4401[12] + (this.field4401[8] * this.field4401[6] * this.field4401[15] + this.field4401[11] * this.field4401[4] * this.field4401[14] + this.field4401[10] * -this.field4401[4] * this.field4401[15] - this.field4401[11] * this.field4401[6] * this.field4401[12] - this.field4401[8] * this.field4401[7] * this.field4401[14])) * var1;
        float var7 = (this.field4401[8] * this.field4401[3] * this.field4401[14] + this.field4401[11] * this.field4401[2] * this.field4401[12] + (this.field4401[0] * this.field4401[10] * this.field4401[15] - this.field4401[0] * this.field4401[11] * this.field4401[14] - this.field4401[2] * this.field4401[8] * this.field4401[15]) - this.field4401[3] * this.field4401[10] * this.field4401[12]) * var1;
        float var8 = (this.field4401[6] * this.field4401[3] * this.field4401[12] + (this.field4401[4] * this.field4401[2] * this.field4401[15] + this.field4401[6] * -this.field4401[0] * this.field4401[15] + this.field4401[7] * this.field4401[0] * this.field4401[14] - this.field4401[7] * this.field4401[2] * this.field4401[12] - this.field4401[3] * this.field4401[4] * this.field4401[14])) * var1;
        float var9 = (this.field4401[4] * this.field4401[3] * this.field4401[10] + this.field4401[2] * this.field4401[7] * this.field4401[8] + (this.field4401[6] * this.field4401[0] * this.field4401[11] - this.field4401[7] * this.field4401[0] * this.field4401[10] - this.field4401[2] * this.field4401[4] * this.field4401[11]) - this.field4401[6] * this.field4401[3] * this.field4401[8]) * var1;
        float var10 = (this.field4401[8] * this.field4401[7] * this.field4401[13] + this.field4401[11] * this.field4401[5] * this.field4401[12] + (this.field4401[4] * this.field4401[9] * this.field4401[15] - this.field4401[4] * this.field4401[11] * this.field4401[13] - this.field4401[8] * this.field4401[5] * this.field4401[15]) - this.field4401[9] * this.field4401[7] * this.field4401[12]) * var1;
        float var11 = (this.field4401[9] * this.field4401[3] * this.field4401[12] + (this.field4401[8] * this.field4401[1] * this.field4401[15] + this.field4401[11] * this.field4401[0] * this.field4401[13] + this.field4401[9] * -this.field4401[0] * this.field4401[15] - this.field4401[11] * this.field4401[1] * this.field4401[12] - this.field4401[3] * this.field4401[8] * this.field4401[13])) * var1;
        float var12 = (this.field4401[3] * this.field4401[4] * this.field4401[13] + this.field4401[7] * this.field4401[1] * this.field4401[12] + (this.field4401[5] * this.field4401[0] * this.field4401[15] - this.field4401[0] * this.field4401[7] * this.field4401[13] - this.field4401[1] * this.field4401[4] * this.field4401[15]) - this.field4401[3] * this.field4401[5] * this.field4401[12]) * var1;
        float var13 = (this.field4401[3] * this.field4401[5] * this.field4401[8] + (this.field4401[1] * this.field4401[4] * this.field4401[11] + this.field4401[7] * this.field4401[0] * this.field4401[9] + this.field4401[5] * -this.field4401[0] * this.field4401[11] - this.field4401[7] * this.field4401[1] * this.field4401[8] - this.field4401[3] * this.field4401[4] * this.field4401[9])) * var1;
        float var14 = (this.field4401[6] * this.field4401[9] * this.field4401[12] + (this.field4401[8] * this.field4401[5] * this.field4401[14] + this.field4401[10] * this.field4401[4] * this.field4401[13] + this.field4401[9] * -this.field4401[4] * this.field4401[14] - this.field4401[5] * this.field4401[10] * this.field4401[12] - this.field4401[8] * this.field4401[6] * this.field4401[13])) * var1;
        float var15 = (this.field4401[8] * this.field4401[2] * this.field4401[13] + this.field4401[1] * this.field4401[10] * this.field4401[12] + (this.field4401[9] * this.field4401[0] * this.field4401[14] - this.field4401[0] * this.field4401[10] * this.field4401[13] - this.field4401[1] * this.field4401[8] * this.field4401[14]) - this.field4401[9] * this.field4401[2] * this.field4401[12]) * var1;
        float var16 = (this.field4401[5] * this.field4401[2] * this.field4401[12] + (this.field4401[4] * this.field4401[1] * this.field4401[14] + this.field4401[5] * -this.field4401[0] * this.field4401[14] + this.field4401[6] * this.field4401[0] * this.field4401[13] - this.field4401[1] * this.field4401[6] * this.field4401[12] - this.field4401[4] * this.field4401[2] * this.field4401[13])) * var1;
        float var17 = (this.field4401[2] * this.field4401[4] * this.field4401[9] + this.field4401[1] * this.field4401[6] * this.field4401[8] + (this.field4401[5] * this.field4401[0] * this.field4401[10] - this.field4401[0] * this.field4401[6] * this.field4401[9] - this.field4401[1] * this.field4401[4] * this.field4401[10]) - this.field4401[5] * this.field4401[2] * this.field4401[8]) * var1;
        this.field4401[0] = var2;
        this.field4401[1] = var3;
        this.field4401[2] = var4;
        this.field4401[3] = var5;
        this.field4401[4] = var6;
        this.field4401[5] = var7;
        this.field4401[6] = var8;
        this.field4401[7] = var9;
        this.field4401[8] = var10;
        this.field4401[9] = var11;
        this.field4401[10] = var12;
        this.field4401[11] = var13;
        this.field4401[12] = var14;
        this.field4401[13] = var15;
        this.field4401[14] = var16;
        this.field4401[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method6237();
        this.method6236();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4401[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4401);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class389)) {
            return false;
        }
        class389 var2 = (class389) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4401[var3] != var2.field4401[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("nw.n(B)[F")
    public float[] method6248() {
        float[] var1 = new float[3];
        class387 var2 = new class387(this.field4401[0], this.field4401[1], this.field4401[2]);
        class387 var3 = new class387(this.field4401[4], this.field4401[5], this.field4401[6]);
        class387 var4 = new class387(this.field4401[8], this.field4401[9], this.field4401[10]);
        var1[0] = var2.method6198();
        var1[1] = var3.method6198();
        var1[2] = var4.method6198();
        return var1;
    }
}
