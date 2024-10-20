package deob;

import java.util.Arrays;

@ObfuscatedName("ny")
public final class class388 {

    @ObfuscatedName("ny.v")
    public static class388[] field4394 = new class388[0];

    @ObfuscatedName("ny.q")
    public static int field4397 = 100;

    @ObfuscatedName("ny.f")
    public static final class388 field4398;

    @ObfuscatedName("ny.j")
    public static int field4396;

    @ObfuscatedName("ny.e")
    public float[] field4395 = new float[16];

    static {
        field4394 = new class388[100];
        field4396 = 0;
        field4398 = new class388();
    }

    @ObfuscatedName("bk.c(S)Lny;")
    public static class388 method1795() {
        class388[] var0 = field4394;
        synchronized (field4394) {
            if (field4396 == 0) {
                return new class388();
            } else {
                field4394[--field4396].method6328();
                return field4394[field4396];
            }
        }
    }

    @ObfuscatedName("ny.v(B)V")
    public void method6340() {
        class388[] var1 = field4394;
        synchronized (field4394) {
            if (field4396 < field4397 - 1) {
                field4394[++field4396 - 1] = this;
            }
        }
    }

    public class388() {
        this.method6328();
    }

    public class388(class388 arg0) {
        this.method6345(arg0);
    }

    public class388(class443 arg0, boolean arg1) {
        this.method6329(arg0, arg1);
    }

    @ObfuscatedName("ny.q(Lqt;ZS)V")
    public void method6329(class443 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4395[var16] = arg0.method7054();
            }
            return;
        }
        class389 var3 = new class389();
        int var5 = arg0.method7216();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method6401(var7);
        int var9 = arg0.method7216();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method6399(var11);
        int var13 = arg0.method7216();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method6411(var15);
        var3.method6398((float) arg0.method7216(), (float) arg0.method7216(), (float) arg0.method7216());
        this.method6351(var3);
    }

    @ObfuscatedName("ny.f(I)[F")
    public float[] method6330() {
        float[] var1 = new float[3];
        if ((double) this.field4395[2] < 0.999D && (double) this.field4395[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4395[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4395[6] / var2, (double) this.field4395[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4395[1] / var2, (double) this.field4395[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4395[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4395[9]), (double) this.field4395[5]);
        }
        return var1;
    }

    @ObfuscatedName("ny.j(B)[F")
    public float[] method6331() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4395[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4395[2];
            double var6 = (double) this.field4395[10];
            double var8 = (double) this.field4395[4];
            double var10 = (double) this.field4395[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4395[1];
            double var14 = (double) this.field4395[0];
            if (this.field4395[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("ny.e(I)V")
    public void method6328() {
        this.field4395[0] = 1.0F;
        this.field4395[1] = 0.0F;
        this.field4395[2] = 0.0F;
        this.field4395[3] = 0.0F;
        this.field4395[4] = 0.0F;
        this.field4395[5] = 1.0F;
        this.field4395[6] = 0.0F;
        this.field4395[7] = 0.0F;
        this.field4395[8] = 0.0F;
        this.field4395[9] = 0.0F;
        this.field4395[10] = 1.0F;
        this.field4395[11] = 0.0F;
        this.field4395[12] = 0.0F;
        this.field4395[13] = 0.0F;
        this.field4395[14] = 0.0F;
        this.field4395[15] = 1.0F;
    }

    @ObfuscatedName("ny.g(I)V")
    public void method6388() {
        this.field4395[0] = 0.0F;
        this.field4395[1] = 0.0F;
        this.field4395[2] = 0.0F;
        this.field4395[3] = 0.0F;
        this.field4395[4] = 0.0F;
        this.field4395[5] = 0.0F;
        this.field4395[6] = 0.0F;
        this.field4395[7] = 0.0F;
        this.field4395[8] = 0.0F;
        this.field4395[9] = 0.0F;
        this.field4395[10] = 0.0F;
        this.field4395[11] = 0.0F;
        this.field4395[12] = 0.0F;
        this.field4395[13] = 0.0F;
        this.field4395[14] = 0.0F;
        this.field4395[15] = 0.0F;
    }

    @ObfuscatedName("ny.w(Lny;B)V")
    public void method6345(class388 arg0) {
        System.arraycopy(arg0.field4395, 0, this.field4395, 0, 16);
    }

    @ObfuscatedName("ny.y(FI)V")
    public void method6335(float arg0) {
        this.method6336(arg0, arg0, arg0);
    }

    @ObfuscatedName("ny.i(FFFI)V")
    public void method6336(float arg0, float arg1, float arg2) {
        this.method6328();
        this.field4395[0] = arg0;
        this.field4395[5] = arg1;
        this.field4395[10] = arg2;
    }

    @ObfuscatedName("ny.s(Lny;I)V")
    public void method6337(class388 arg0) {
        for (int var2 = 0; var2 < this.field4395.length; var2++) {
            this.field4395[var2] += arg0.field4395[var2];
        }
    }

    @ObfuscatedName("ny.t(Lny;B)V")
    public void method6334(class388 arg0) {
        float var2 = this.field4395[3] * arg0.field4395[12] + this.field4395[2] * arg0.field4395[8] + this.field4395[0] * arg0.field4395[0] + this.field4395[1] * arg0.field4395[4];
        float var3 = this.field4395[3] * arg0.field4395[13] + this.field4395[2] * arg0.field4395[9] + this.field4395[0] * arg0.field4395[1] + this.field4395[1] * arg0.field4395[5];
        float var4 = this.field4395[3] * arg0.field4395[14] + this.field4395[2] * arg0.field4395[10] + this.field4395[0] * arg0.field4395[2] + this.field4395[1] * arg0.field4395[6];
        float var5 = this.field4395[3] * arg0.field4395[15] + this.field4395[2] * arg0.field4395[11] + this.field4395[0] * arg0.field4395[3] + this.field4395[1] * arg0.field4395[7];
        float var6 = this.field4395[7] * arg0.field4395[12] + this.field4395[6] * arg0.field4395[8] + this.field4395[4] * arg0.field4395[0] + this.field4395[5] * arg0.field4395[4];
        float var7 = this.field4395[7] * arg0.field4395[13] + this.field4395[6] * arg0.field4395[9] + this.field4395[5] * arg0.field4395[5] + this.field4395[4] * arg0.field4395[1];
        float var8 = this.field4395[7] * arg0.field4395[14] + this.field4395[6] * arg0.field4395[10] + this.field4395[4] * arg0.field4395[2] + this.field4395[5] * arg0.field4395[6];
        float var9 = this.field4395[7] * arg0.field4395[15] + this.field4395[6] * arg0.field4395[11] + this.field4395[4] * arg0.field4395[3] + this.field4395[5] * arg0.field4395[7];
        float var10 = this.field4395[11] * arg0.field4395[12] + this.field4395[10] * arg0.field4395[8] + this.field4395[9] * arg0.field4395[4] + this.field4395[8] * arg0.field4395[0];
        float var11 = this.field4395[11] * arg0.field4395[13] + this.field4395[10] * arg0.field4395[9] + this.field4395[8] * arg0.field4395[1] + this.field4395[9] * arg0.field4395[5];
        float var12 = this.field4395[11] * arg0.field4395[14] + this.field4395[10] * arg0.field4395[10] + this.field4395[8] * arg0.field4395[2] + this.field4395[9] * arg0.field4395[6];
        float var13 = this.field4395[11] * arg0.field4395[15] + this.field4395[10] * arg0.field4395[11] + this.field4395[9] * arg0.field4395[7] + this.field4395[8] * arg0.field4395[3];
        float var14 = this.field4395[15] * arg0.field4395[12] + this.field4395[14] * arg0.field4395[8] + this.field4395[13] * arg0.field4395[4] + this.field4395[12] * arg0.field4395[0];
        float var15 = this.field4395[15] * arg0.field4395[13] + this.field4395[14] * arg0.field4395[9] + this.field4395[12] * arg0.field4395[1] + this.field4395[13] * arg0.field4395[5];
        float var16 = this.field4395[15] * arg0.field4395[14] + this.field4395[14] * arg0.field4395[10] + this.field4395[12] * arg0.field4395[2] + this.field4395[13] * arg0.field4395[6];
        float var17 = this.field4395[15] * arg0.field4395[15] + this.field4395[14] * arg0.field4395[11] + this.field4395[13] * arg0.field4395[7] + this.field4395[12] * arg0.field4395[3];
        this.field4395[0] = var2;
        this.field4395[1] = var3;
        this.field4395[2] = var4;
        this.field4395[3] = var5;
        this.field4395[4] = var6;
        this.field4395[5] = var7;
        this.field4395[6] = var8;
        this.field4395[7] = var9;
        this.field4395[8] = var10;
        this.field4395[9] = var11;
        this.field4395[10] = var12;
        this.field4395[11] = var13;
        this.field4395[12] = var14;
        this.field4395[13] = var15;
        this.field4395[14] = var16;
        this.field4395[15] = var17;
    }

    @ObfuscatedName("ny.z(Lni;B)V")
    public void method6339(class387 arg0) {
        float var2 = arg0.field4392 * arg0.field4392;
        float var3 = arg0.field4392 * arg0.field4389;
        float var4 = arg0.field4392 * arg0.field4388;
        float var5 = arg0.field4392 * arg0.field4391;
        float var6 = arg0.field4389 * arg0.field4389;
        float var7 = arg0.field4389 * arg0.field4388;
        float var8 = arg0.field4391 * arg0.field4389;
        float var9 = arg0.field4388 * arg0.field4388;
        float var10 = arg0.field4391 * arg0.field4388;
        float var11 = arg0.field4391 * arg0.field4391;
        this.field4395[0] = var2 + var6 - var11 - var9;
        this.field4395[1] = var5 + var7 + var7 + var5;
        this.field4395[2] = var8 - var4 - var4 + var8;
        this.field4395[4] = var7 - var5 - var5 + var7;
        this.field4395[5] = var2 + var9 - var6 - var11;
        this.field4395[6] = var3 + var10 + var10 + var3;
        this.field4395[8] = var4 + var8 + var8 + var4;
        this.field4395[9] = var10 - var3 - var3 + var10;
        this.field4395[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("ny.r(Lnu;I)V")
    public void method6351(class389 arg0) {
        this.field4395[0] = arg0.field4406;
        this.field4395[1] = arg0.field4401;
        this.field4395[2] = arg0.field4403;
        this.field4395[3] = 0.0F;
        this.field4395[4] = arg0.field4410;
        this.field4395[5] = arg0.field4404;
        this.field4395[6] = arg0.field4409;
        this.field4395[7] = 0.0F;
        this.field4395[8] = arg0.field4402;
        this.field4395[9] = arg0.field4408;
        this.field4395[10] = arg0.field4407;
        this.field4395[11] = 0.0F;
        this.field4395[12] = arg0.field4405;
        this.field4395[13] = arg0.field4411;
        this.field4395[14] = arg0.field4412;
        this.field4395[15] = 1.0F;
    }

    @ObfuscatedName("ny.u(I)F")
    public float method6341() {
        return this.field4395[3] * this.field4395[6] * this.field4395[9] * this.field4395[12] + (this.field4395[5] * this.field4395[3] * this.field4395[8] * this.field4395[14] + this.field4395[4] * this.field4395[3] * this.field4395[10] * this.field4395[13] + (this.field4395[7] * this.field4395[2] * this.field4395[8] * this.field4395[13] + this.field4395[5] * this.field4395[2] * this.field4395[11] * this.field4395[12] + (this.field4395[4] * this.field4395[2] * this.field4395[9] * this.field4395[15] + this.field4395[1] * this.field4395[7] * this.field4395[10] * this.field4395[12] + (this.field4395[1] * this.field4395[6] * this.field4395[8] * this.field4395[15] + this.field4395[1] * this.field4395[4] * this.field4395[11] * this.field4395[14] + (this.field4395[7] * this.field4395[0] * this.field4395[9] * this.field4395[14] + this.field4395[0] * this.field4395[6] * this.field4395[11] * this.field4395[13] + (this.field4395[0] * this.field4395[5] * this.field4395[10] * this.field4395[15] - this.field4395[5] * this.field4395[0] * this.field4395[11] * this.field4395[14] - this.field4395[0] * this.field4395[6] * this.field4395[9] * this.field4395[15]) - this.field4395[0] * this.field4395[7] * this.field4395[10] * this.field4395[13] - this.field4395[1] * this.field4395[4] * this.field4395[10] * this.field4395[15]) - this.field4395[6] * this.field4395[1] * this.field4395[11] * this.field4395[12] - this.field4395[7] * this.field4395[1] * this.field4395[8] * this.field4395[14]) - this.field4395[2] * this.field4395[4] * this.field4395[11] * this.field4395[13] - this.field4395[5] * this.field4395[2] * this.field4395[8] * this.field4395[15]) - this.field4395[2] * this.field4395[7] * this.field4395[9] * this.field4395[12] - this.field4395[4] * this.field4395[3] * this.field4395[9] * this.field4395[14]) - this.field4395[3] * this.field4395[5] * this.field4395[10] * this.field4395[12] - this.field4395[3] * this.field4395[6] * this.field4395[8] * this.field4395[13]);
    }

    @ObfuscatedName("ny.k(I)V")
    public void method6342() {
        float var1 = 1.0F / this.method6341();
        float var2 = (this.field4395[7] * this.field4395[9] * this.field4395[14] + this.field4395[11] * this.field4395[6] * this.field4395[13] + (this.field4395[5] * this.field4395[10] * this.field4395[15] - this.field4395[5] * this.field4395[11] * this.field4395[14] - this.field4395[6] * this.field4395[9] * this.field4395[15]) - this.field4395[7] * this.field4395[10] * this.field4395[13]) * var1;
        float var3 = (this.field4395[10] * this.field4395[3] * this.field4395[13] + (this.field4395[9] * this.field4395[2] * this.field4395[15] + this.field4395[11] * this.field4395[1] * this.field4395[14] + this.field4395[10] * -this.field4395[1] * this.field4395[15] - this.field4395[2] * this.field4395[11] * this.field4395[13] - this.field4395[9] * this.field4395[3] * this.field4395[14])) * var1;
        float var4 = (this.field4395[3] * this.field4395[5] * this.field4395[14] + this.field4395[7] * this.field4395[2] * this.field4395[13] + (this.field4395[6] * this.field4395[1] * this.field4395[15] - this.field4395[1] * this.field4395[7] * this.field4395[14] - this.field4395[2] * this.field4395[5] * this.field4395[15]) - this.field4395[6] * this.field4395[3] * this.field4395[13]) * var1;
        float var5 = (this.field4395[6] * this.field4395[3] * this.field4395[9] + (this.field4395[5] * this.field4395[2] * this.field4395[11] + this.field4395[7] * this.field4395[1] * this.field4395[10] + this.field4395[6] * -this.field4395[1] * this.field4395[11] - this.field4395[7] * this.field4395[2] * this.field4395[9] - this.field4395[3] * this.field4395[5] * this.field4395[10])) * var1;
        float var6 = (this.field4395[7] * this.field4395[10] * this.field4395[12] + (this.field4395[8] * this.field4395[6] * this.field4395[15] + this.field4395[10] * -this.field4395[4] * this.field4395[15] + this.field4395[4] * this.field4395[11] * this.field4395[14] - this.field4395[6] * this.field4395[11] * this.field4395[12] - this.field4395[7] * this.field4395[8] * this.field4395[14])) * var1;
        float var7 = (this.field4395[3] * this.field4395[8] * this.field4395[14] + this.field4395[2] * this.field4395[11] * this.field4395[12] + (this.field4395[10] * this.field4395[0] * this.field4395[15] - this.field4395[11] * this.field4395[0] * this.field4395[14] - this.field4395[2] * this.field4395[8] * this.field4395[15]) - this.field4395[10] * this.field4395[3] * this.field4395[12]) * var1;
        float var8 = (this.field4395[3] * this.field4395[6] * this.field4395[12] + (this.field4395[2] * this.field4395[4] * this.field4395[15] + this.field4395[7] * this.field4395[0] * this.field4395[14] + this.field4395[6] * -this.field4395[0] * this.field4395[15] - this.field4395[2] * this.field4395[7] * this.field4395[12] - this.field4395[3] * this.field4395[4] * this.field4395[14])) * var1;
        float var9 = (this.field4395[4] * this.field4395[3] * this.field4395[10] + this.field4395[7] * this.field4395[2] * this.field4395[8] + (this.field4395[6] * this.field4395[0] * this.field4395[11] - this.field4395[7] * this.field4395[0] * this.field4395[10] - this.field4395[2] * this.field4395[4] * this.field4395[11]) - this.field4395[3] * this.field4395[6] * this.field4395[8]) * var1;
        float var10 = (this.field4395[8] * this.field4395[7] * this.field4395[13] + this.field4395[5] * this.field4395[11] * this.field4395[12] + (this.field4395[9] * this.field4395[4] * this.field4395[15] - this.field4395[4] * this.field4395[11] * this.field4395[13] - this.field4395[8] * this.field4395[5] * this.field4395[15]) - this.field4395[9] * this.field4395[7] * this.field4395[12]) * var1;
        float var11 = (this.field4395[3] * this.field4395[9] * this.field4395[12] + (this.field4395[1] * this.field4395[8] * this.field4395[15] + this.field4395[9] * -this.field4395[0] * this.field4395[15] + this.field4395[11] * this.field4395[0] * this.field4395[13] - this.field4395[11] * this.field4395[1] * this.field4395[12] - this.field4395[8] * this.field4395[3] * this.field4395[13])) * var1;
        float var12 = (this.field4395[3] * this.field4395[4] * this.field4395[13] + this.field4395[7] * this.field4395[1] * this.field4395[12] + (this.field4395[5] * this.field4395[0] * this.field4395[15] - this.field4395[7] * this.field4395[0] * this.field4395[13] - this.field4395[1] * this.field4395[4] * this.field4395[15]) - this.field4395[5] * this.field4395[3] * this.field4395[12]) * var1;
        float var13 = (this.field4395[5] * this.field4395[3] * this.field4395[8] + (this.field4395[4] * this.field4395[1] * this.field4395[11] + this.field4395[0] * this.field4395[7] * this.field4395[9] + this.field4395[5] * -this.field4395[0] * this.field4395[11] - this.field4395[1] * this.field4395[7] * this.field4395[8] - this.field4395[4] * this.field4395[3] * this.field4395[9])) * var1;
        float var14 = (this.field4395[6] * this.field4395[9] * this.field4395[12] + (this.field4395[5] * this.field4395[8] * this.field4395[14] + this.field4395[9] * -this.field4395[4] * this.field4395[14] + this.field4395[4] * this.field4395[10] * this.field4395[13] - this.field4395[10] * this.field4395[5] * this.field4395[12] - this.field4395[6] * this.field4395[8] * this.field4395[13])) * var1;
        float var15 = (this.field4395[8] * this.field4395[2] * this.field4395[13] + this.field4395[10] * this.field4395[1] * this.field4395[12] + (this.field4395[9] * this.field4395[0] * this.field4395[14] - this.field4395[10] * this.field4395[0] * this.field4395[13] - this.field4395[8] * this.field4395[1] * this.field4395[14]) - this.field4395[9] * this.field4395[2] * this.field4395[12]) * var1;
        float var16 = (this.field4395[2] * this.field4395[5] * this.field4395[12] + (this.field4395[1] * this.field4395[4] * this.field4395[14] + this.field4395[6] * this.field4395[0] * this.field4395[13] + this.field4395[5] * -this.field4395[0] * this.field4395[14] - this.field4395[6] * this.field4395[1] * this.field4395[12] - this.field4395[4] * this.field4395[2] * this.field4395[13])) * var1;
        float var17 = (this.field4395[2] * this.field4395[4] * this.field4395[9] + this.field4395[1] * this.field4395[6] * this.field4395[8] + (this.field4395[5] * this.field4395[0] * this.field4395[10] - this.field4395[0] * this.field4395[6] * this.field4395[9] - this.field4395[1] * this.field4395[4] * this.field4395[10]) - this.field4395[5] * this.field4395[2] * this.field4395[8]) * var1;
        this.field4395[0] = var2;
        this.field4395[1] = var3;
        this.field4395[2] = var4;
        this.field4395[3] = var5;
        this.field4395[4] = var6;
        this.field4395[5] = var7;
        this.field4395[6] = var8;
        this.field4395[7] = var9;
        this.field4395[8] = var10;
        this.field4395[9] = var11;
        this.field4395[10] = var12;
        this.field4395[11] = var13;
        this.field4395[12] = var14;
        this.field4395[13] = var15;
        this.field4395[14] = var16;
        this.field4395[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method6331();
        this.method6330();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4395[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4395);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class388)) {
            return false;
        }
        class388 var2 = (class388) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4395[var3] != var2.field4395[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ny.h(I)[F")
    public float[] method6364() {
        float[] var1 = new float[3];
        class386 var2 = new class386(this.field4395[0], this.field4395[1], this.field4395[2]);
        class386 var3 = new class386(this.field4395[4], this.field4395[5], this.field4395[6]);
        class386 var4 = new class386(this.field4395[8], this.field4395[9], this.field4395[10]);
        var1[0] = var2.method6301();
        var1[1] = var3.method6301();
        var1[2] = var4.method6301();
        return var1;
    }
}
