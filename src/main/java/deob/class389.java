package deob;

import java.util.Arrays;

@ObfuscatedName("ny")
public final class class389 {

    @ObfuscatedName("ny.h")
    public static class389[] field4400 = new class389[0];

    @ObfuscatedName("ny.w")
    public static int field4402 = 100;

    @ObfuscatedName("ny.v")
    public static int field4401;

    @ObfuscatedName("ny.c")
    public float[] field4399 = new float[16];

    @ObfuscatedName("ny.q")
    public static final class389 field4403;

    static {
        field4400 = new class389[100];
        field4401 = 0;
        field4403 = new class389();
    }

    @ObfuscatedName("lv.s(B)Lny;")
    public static class389 method5400() {
        class389[] var0 = field4400;
        synchronized (field4400) {
            if (field4401 == 0) {
                return new class389();
            } else {
                field4400[--field4401].method6280();
                return field4400[field4401];
            }
        }
    }

    @ObfuscatedName("ny.h(I)V")
    public void method6286() {
        class389[] var1 = field4400;
        synchronized (field4400) {
            if (field4401 < field4402 - 1) {
                field4400[++field4401 - 1] = this;
            }
        }
    }

    public class389() {
        this.method6280();
    }

    public class389(class389 arg0) {
        this.method6255(arg0);
    }

    public class389(class444 arg0, boolean arg1) {
        this.method6271(arg0, arg1);
    }

    @ObfuscatedName("ny.w(Lqr;ZI)V")
    public void method6271(class444 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4399[var4] = arg0.method7117();
            }
            return;
        }
        class390 var3 = new class390();
        var3.method6329(class403.method383(arg0.method6932()));
        var3.method6322(class403.method383(arg0.method6932()));
        var3.method6323(class403.method383(arg0.method6932()));
        var3.method6338((float) arg0.method6932(), (float) arg0.method6932(), (float) arg0.method6932());
        this.method6272(var3);
    }

    @ObfuscatedName("ny.v(I)[F")
    public float[] method6252() {
        float[] var1 = new float[3];
        if ((double) this.field4399[2] < 0.999D && (double) this.field4399[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4399[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4399[6] / var2, (double) this.field4399[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4399[1] / var2, (double) this.field4399[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4399[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4399[9]), (double) this.field4399[5]);
        }
        return var1;
    }

    @ObfuscatedName("ny.c(I)[F")
    public float[] method6253() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4399[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4399[2];
            double var6 = (double) this.field4399[10];
            double var8 = (double) this.field4399[4];
            double var10 = (double) this.field4399[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4399[1];
            double var14 = (double) this.field4399[0];
            if (this.field4399[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("ny.q(B)V")
    public void method6280() {
        this.field4399[0] = 1.0F;
        this.field4399[1] = 0.0F;
        this.field4399[2] = 0.0F;
        this.field4399[3] = 0.0F;
        this.field4399[4] = 0.0F;
        this.field4399[5] = 1.0F;
        this.field4399[6] = 0.0F;
        this.field4399[7] = 0.0F;
        this.field4399[8] = 0.0F;
        this.field4399[9] = 0.0F;
        this.field4399[10] = 1.0F;
        this.field4399[11] = 0.0F;
        this.field4399[12] = 0.0F;
        this.field4399[13] = 0.0F;
        this.field4399[14] = 0.0F;
        this.field4399[15] = 1.0F;
    }

    @ObfuscatedName("ny.i(I)V")
    public void method6254() {
        this.field4399[0] = 0.0F;
        this.field4399[1] = 0.0F;
        this.field4399[2] = 0.0F;
        this.field4399[3] = 0.0F;
        this.field4399[4] = 0.0F;
        this.field4399[5] = 0.0F;
        this.field4399[6] = 0.0F;
        this.field4399[7] = 0.0F;
        this.field4399[8] = 0.0F;
        this.field4399[9] = 0.0F;
        this.field4399[10] = 0.0F;
        this.field4399[11] = 0.0F;
        this.field4399[12] = 0.0F;
        this.field4399[13] = 0.0F;
        this.field4399[14] = 0.0F;
        this.field4399[15] = 0.0F;
    }

    @ObfuscatedName("ny.k(Lny;I)V")
    public void method6255(class389 arg0) {
        System.arraycopy(arg0.field4399, 0, this.field4399, 0, 16);
    }

    @ObfuscatedName("ny.o(FI)V")
    public void method6256(float arg0) {
        this.method6268(arg0, arg0, arg0);
    }

    @ObfuscatedName("ny.n(FFFB)V")
    public void method6268(float arg0, float arg1, float arg2) {
        this.method6280();
        this.field4399[0] = arg0;
        this.field4399[5] = arg1;
        this.field4399[10] = arg2;
    }

    @ObfuscatedName("ny.d(Lny;I)V")
    public void method6275(class389 arg0) {
        for (int var2 = 0; var2 < this.field4399.length; var2++) {
            this.field4399[var2] += arg0.field4399[var2];
        }
    }

    @ObfuscatedName("ny.a(Lny;I)V")
    public void method6294(class389 arg0) {
        float var2 = this.field4399[3] * arg0.field4399[12] + this.field4399[2] * arg0.field4399[8] + this.field4399[1] * arg0.field4399[4] + this.field4399[0] * arg0.field4399[0];
        float var3 = this.field4399[3] * arg0.field4399[13] + this.field4399[2] * arg0.field4399[9] + this.field4399[1] * arg0.field4399[5] + this.field4399[0] * arg0.field4399[1];
        float var4 = this.field4399[3] * arg0.field4399[14] + this.field4399[2] * arg0.field4399[10] + this.field4399[0] * arg0.field4399[2] + this.field4399[1] * arg0.field4399[6];
        float var5 = this.field4399[3] * arg0.field4399[15] + this.field4399[2] * arg0.field4399[11] + this.field4399[1] * arg0.field4399[7] + this.field4399[0] * arg0.field4399[3];
        float var6 = this.field4399[7] * arg0.field4399[12] + this.field4399[6] * arg0.field4399[8] + this.field4399[4] * arg0.field4399[0] + this.field4399[5] * arg0.field4399[4];
        float var7 = this.field4399[7] * arg0.field4399[13] + this.field4399[6] * arg0.field4399[9] + this.field4399[5] * arg0.field4399[5] + this.field4399[4] * arg0.field4399[1];
        float var8 = this.field4399[7] * arg0.field4399[14] + this.field4399[6] * arg0.field4399[10] + this.field4399[4] * arg0.field4399[2] + this.field4399[5] * arg0.field4399[6];
        float var9 = this.field4399[7] * arg0.field4399[15] + this.field4399[6] * arg0.field4399[11] + this.field4399[5] * arg0.field4399[7] + this.field4399[4] * arg0.field4399[3];
        float var10 = this.field4399[11] * arg0.field4399[12] + this.field4399[10] * arg0.field4399[8] + this.field4399[8] * arg0.field4399[0] + this.field4399[9] * arg0.field4399[4];
        float var11 = this.field4399[11] * arg0.field4399[13] + this.field4399[10] * arg0.field4399[9] + this.field4399[8] * arg0.field4399[1] + this.field4399[9] * arg0.field4399[5];
        float var12 = this.field4399[11] * arg0.field4399[14] + this.field4399[10] * arg0.field4399[10] + this.field4399[8] * arg0.field4399[2] + this.field4399[9] * arg0.field4399[6];
        float var13 = this.field4399[11] * arg0.field4399[15] + this.field4399[10] * arg0.field4399[11] + this.field4399[9] * arg0.field4399[7] + this.field4399[8] * arg0.field4399[3];
        float var14 = this.field4399[15] * arg0.field4399[12] + this.field4399[14] * arg0.field4399[8] + this.field4399[13] * arg0.field4399[4] + this.field4399[12] * arg0.field4399[0];
        float var15 = this.field4399[15] * arg0.field4399[13] + this.field4399[14] * arg0.field4399[9] + this.field4399[13] * arg0.field4399[5] + this.field4399[12] * arg0.field4399[1];
        float var16 = this.field4399[15] * arg0.field4399[14] + this.field4399[14] * arg0.field4399[10] + this.field4399[12] * arg0.field4399[2] + this.field4399[13] * arg0.field4399[6];
        float var17 = this.field4399[15] * arg0.field4399[15] + this.field4399[14] * arg0.field4399[11] + this.field4399[13] * arg0.field4399[7] + this.field4399[12] * arg0.field4399[3];
        this.field4399[0] = var2;
        this.field4399[1] = var3;
        this.field4399[2] = var4;
        this.field4399[3] = var5;
        this.field4399[4] = var6;
        this.field4399[5] = var7;
        this.field4399[6] = var8;
        this.field4399[7] = var9;
        this.field4399[8] = var10;
        this.field4399[9] = var11;
        this.field4399[10] = var12;
        this.field4399[11] = var13;
        this.field4399[12] = var14;
        this.field4399[13] = var15;
        this.field4399[14] = var16;
        this.field4399[15] = var17;
    }

    @ObfuscatedName("ny.m(Lni;I)V")
    public void method6258(class388 arg0) {
        float var2 = arg0.field4397 * arg0.field4397;
        float var3 = arg0.field4397 * arg0.field4394;
        float var4 = arg0.field4397 * arg0.field4396;
        float var5 = arg0.field4397 * arg0.field4395;
        float var6 = arg0.field4394 * arg0.field4394;
        float var7 = arg0.field4396 * arg0.field4394;
        float var8 = arg0.field4395 * arg0.field4394;
        float var9 = arg0.field4396 * arg0.field4396;
        float var10 = arg0.field4396 * arg0.field4395;
        float var11 = arg0.field4395 * arg0.field4395;
        this.field4399[0] = var2 + var6 - var11 - var9;
        this.field4399[1] = var5 + var7 + var7 + var5;
        this.field4399[2] = var8 - var4 - var4 + var8;
        this.field4399[4] = var7 - var5 - var5 + var7;
        this.field4399[5] = var2 + var9 - var6 - var11;
        this.field4399[6] = var3 + var10 + var10 + var3;
        this.field4399[8] = var4 + var8 + var8 + var4;
        this.field4399[9] = var10 - var3 - var3 + var10;
        this.field4399[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("ny.u(Lnq;B)V")
    public void method6272(class390 arg0) {
        this.field4399[0] = arg0.field4405;
        this.field4399[1] = arg0.field4406;
        this.field4399[2] = arg0.field4407;
        this.field4399[3] = 0.0F;
        this.field4399[4] = arg0.field4408;
        this.field4399[5] = arg0.field4414;
        this.field4399[6] = arg0.field4410;
        this.field4399[7] = 0.0F;
        this.field4399[8] = arg0.field4411;
        this.field4399[9] = arg0.field4412;
        this.field4399[10] = arg0.field4417;
        this.field4399[11] = 0.0F;
        this.field4399[12] = arg0.field4413;
        this.field4399[13] = arg0.field4415;
        this.field4399[14] = arg0.field4416;
        this.field4399[15] = 1.0F;
    }

    @ObfuscatedName("ny.l(I)F")
    public float method6261() {
        return this.field4399[3] * this.field4399[6] * this.field4399[9] * this.field4399[12] + (this.field4399[5] * this.field4399[3] * this.field4399[8] * this.field4399[14] + this.field4399[4] * this.field4399[3] * this.field4399[10] * this.field4399[13] + (this.field4399[2] * this.field4399[7] * this.field4399[8] * this.field4399[13] + this.field4399[5] * this.field4399[2] * this.field4399[11] * this.field4399[12] + (this.field4399[4] * this.field4399[2] * this.field4399[9] * this.field4399[15] + this.field4399[1] * this.field4399[7] * this.field4399[10] * this.field4399[12] + (this.field4399[1] * this.field4399[6] * this.field4399[8] * this.field4399[15] + this.field4399[4] * this.field4399[1] * this.field4399[11] * this.field4399[14] + (this.field4399[7] * this.field4399[0] * this.field4399[9] * this.field4399[14] + this.field4399[0] * this.field4399[6] * this.field4399[11] * this.field4399[13] + (this.field4399[5] * this.field4399[0] * this.field4399[10] * this.field4399[15] - this.field4399[5] * this.field4399[0] * this.field4399[11] * this.field4399[14] - this.field4399[6] * this.field4399[0] * this.field4399[9] * this.field4399[15]) - this.field4399[7] * this.field4399[0] * this.field4399[10] * this.field4399[13] - this.field4399[4] * this.field4399[1] * this.field4399[10] * this.field4399[15]) - this.field4399[1] * this.field4399[6] * this.field4399[11] * this.field4399[12] - this.field4399[7] * this.field4399[1] * this.field4399[8] * this.field4399[14]) - this.field4399[4] * this.field4399[2] * this.field4399[11] * this.field4399[13] - this.field4399[5] * this.field4399[2] * this.field4399[8] * this.field4399[15]) - this.field4399[7] * this.field4399[2] * this.field4399[9] * this.field4399[12] - this.field4399[3] * this.field4399[4] * this.field4399[9] * this.field4399[14]) - this.field4399[5] * this.field4399[3] * this.field4399[10] * this.field4399[12] - this.field4399[6] * this.field4399[3] * this.field4399[8] * this.field4399[13]);
    }

    @ObfuscatedName("ny.z(B)V")
    public void method6262() {
        float var1 = 1.0F / this.method6261();
        float var2 = (this.field4399[7] * this.field4399[9] * this.field4399[14] + this.field4399[6] * this.field4399[11] * this.field4399[13] + (this.field4399[5] * this.field4399[10] * this.field4399[15] - this.field4399[5] * this.field4399[11] * this.field4399[14] - this.field4399[6] * this.field4399[9] * this.field4399[15]) - this.field4399[10] * this.field4399[7] * this.field4399[13]) * var1;
        float var3 = (this.field4399[10] * this.field4399[3] * this.field4399[13] + (this.field4399[9] * this.field4399[2] * this.field4399[15] + this.field4399[10] * -this.field4399[1] * this.field4399[15] + this.field4399[1] * this.field4399[11] * this.field4399[14] - this.field4399[11] * this.field4399[2] * this.field4399[13] - this.field4399[9] * this.field4399[3] * this.field4399[14])) * var1;
        float var4 = (this.field4399[5] * this.field4399[3] * this.field4399[14] + this.field4399[2] * this.field4399[7] * this.field4399[13] + (this.field4399[6] * this.field4399[1] * this.field4399[15] - this.field4399[7] * this.field4399[1] * this.field4399[14] - this.field4399[2] * this.field4399[5] * this.field4399[15]) - this.field4399[6] * this.field4399[3] * this.field4399[13]) * var1;
        float var5 = (this.field4399[3] * this.field4399[6] * this.field4399[9] + (this.field4399[2] * this.field4399[5] * this.field4399[11] + this.field4399[6] * -this.field4399[1] * this.field4399[11] + this.field4399[7] * this.field4399[1] * this.field4399[10] - this.field4399[2] * this.field4399[7] * this.field4399[9] - this.field4399[5] * this.field4399[3] * this.field4399[10])) * var1;
        float var6 = (this.field4399[7] * this.field4399[10] * this.field4399[12] + (this.field4399[6] * this.field4399[8] * this.field4399[15] + this.field4399[11] * this.field4399[4] * this.field4399[14] + this.field4399[10] * -this.field4399[4] * this.field4399[15] - this.field4399[6] * this.field4399[11] * this.field4399[12] - this.field4399[7] * this.field4399[8] * this.field4399[14])) * var1;
        float var7 = (this.field4399[3] * this.field4399[8] * this.field4399[14] + this.field4399[11] * this.field4399[2] * this.field4399[12] + (this.field4399[10] * this.field4399[0] * this.field4399[15] - this.field4399[0] * this.field4399[11] * this.field4399[14] - this.field4399[2] * this.field4399[8] * this.field4399[15]) - this.field4399[3] * this.field4399[10] * this.field4399[12]) * var1;
        float var8 = (this.field4399[3] * this.field4399[6] * this.field4399[12] + (this.field4399[4] * this.field4399[2] * this.field4399[15] + this.field4399[6] * -this.field4399[0] * this.field4399[15] + this.field4399[7] * this.field4399[0] * this.field4399[14] - this.field4399[7] * this.field4399[2] * this.field4399[12] - this.field4399[3] * this.field4399[4] * this.field4399[14])) * var1;
        float var9 = (this.field4399[4] * this.field4399[3] * this.field4399[10] + this.field4399[7] * this.field4399[2] * this.field4399[8] + (this.field4399[0] * this.field4399[6] * this.field4399[11] - this.field4399[0] * this.field4399[7] * this.field4399[10] - this.field4399[4] * this.field4399[2] * this.field4399[11]) - this.field4399[3] * this.field4399[6] * this.field4399[8]) * var1;
        float var10 = (this.field4399[8] * this.field4399[7] * this.field4399[13] + this.field4399[5] * this.field4399[11] * this.field4399[12] + (this.field4399[9] * this.field4399[4] * this.field4399[15] - this.field4399[4] * this.field4399[11] * this.field4399[13] - this.field4399[8] * this.field4399[5] * this.field4399[15]) - this.field4399[9] * this.field4399[7] * this.field4399[12]) * var1;
        float var11 = (this.field4399[9] * this.field4399[3] * this.field4399[12] + (this.field4399[8] * this.field4399[1] * this.field4399[15] + this.field4399[9] * -this.field4399[0] * this.field4399[15] + this.field4399[0] * this.field4399[11] * this.field4399[13] - this.field4399[1] * this.field4399[11] * this.field4399[12] - this.field4399[3] * this.field4399[8] * this.field4399[13])) * var1;
        float var12 = (this.field4399[3] * this.field4399[4] * this.field4399[13] + this.field4399[1] * this.field4399[7] * this.field4399[12] + (this.field4399[0] * this.field4399[5] * this.field4399[15] - this.field4399[0] * this.field4399[7] * this.field4399[13] - this.field4399[4] * this.field4399[1] * this.field4399[15]) - this.field4399[5] * this.field4399[3] * this.field4399[12]) * var1;
        float var13 = (this.field4399[5] * this.field4399[3] * this.field4399[8] + (this.field4399[4] * this.field4399[1] * this.field4399[11] + this.field4399[5] * -this.field4399[0] * this.field4399[11] + this.field4399[0] * this.field4399[7] * this.field4399[9] - this.field4399[1] * this.field4399[7] * this.field4399[8] - this.field4399[3] * this.field4399[4] * this.field4399[9])) * var1;
        float var14 = (this.field4399[9] * this.field4399[6] * this.field4399[12] + (this.field4399[5] * this.field4399[8] * this.field4399[14] + this.field4399[4] * this.field4399[10] * this.field4399[13] + this.field4399[9] * -this.field4399[4] * this.field4399[14] - this.field4399[10] * this.field4399[5] * this.field4399[12] - this.field4399[6] * this.field4399[8] * this.field4399[13])) * var1;
        float var15 = (this.field4399[2] * this.field4399[8] * this.field4399[13] + this.field4399[10] * this.field4399[1] * this.field4399[12] + (this.field4399[9] * this.field4399[0] * this.field4399[14] - this.field4399[10] * this.field4399[0] * this.field4399[13] - this.field4399[8] * this.field4399[1] * this.field4399[14]) - this.field4399[9] * this.field4399[2] * this.field4399[12]) * var1;
        float var16 = (this.field4399[5] * this.field4399[2] * this.field4399[12] + (this.field4399[4] * this.field4399[1] * this.field4399[14] + this.field4399[6] * this.field4399[0] * this.field4399[13] + this.field4399[5] * -this.field4399[0] * this.field4399[14] - this.field4399[6] * this.field4399[1] * this.field4399[12] - this.field4399[4] * this.field4399[2] * this.field4399[13])) * var1;
        float var17 = (this.field4399[2] * this.field4399[4] * this.field4399[9] + this.field4399[1] * this.field4399[6] * this.field4399[8] + (this.field4399[5] * this.field4399[0] * this.field4399[10] - this.field4399[0] * this.field4399[6] * this.field4399[9] - this.field4399[1] * this.field4399[4] * this.field4399[10]) - this.field4399[2] * this.field4399[5] * this.field4399[8]) * var1;
        this.field4399[0] = var2;
        this.field4399[1] = var3;
        this.field4399[2] = var4;
        this.field4399[3] = var5;
        this.field4399[4] = var6;
        this.field4399[5] = var7;
        this.field4399[6] = var8;
        this.field4399[7] = var9;
        this.field4399[8] = var10;
        this.field4399[9] = var11;
        this.field4399[10] = var12;
        this.field4399[11] = var13;
        this.field4399[12] = var14;
        this.field4399[13] = var15;
        this.field4399[14] = var16;
        this.field4399[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method6253();
        this.method6252();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4399[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4399);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class389)) {
            return false;
        }
        class389 var2 = (class389) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4399[var3] != var2.field4399[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ny.r(I)[F")
    public float[] method6264() {
        float[] var1 = new float[3];
        class387 var2 = new class387(this.field4399[0], this.field4399[1], this.field4399[2]);
        class387 var3 = new class387(this.field4399[4], this.field4399[5], this.field4399[6]);
        class387 var4 = new class387(this.field4399[8], this.field4399[9], this.field4399[10]);
        var1[0] = var2.method6214();
        var1[1] = var3.method6214();
        var1[2] = var4.method6214();
        return var1;
    }
}
