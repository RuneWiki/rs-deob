package deob;

import java.util.Arrays;

@ObfuscatedName("nt")
public final class class388 {

    @ObfuscatedName("nt.c")
    public static class388[] field4347 = new class388[0];

    @ObfuscatedName("nt.f")
    public static final class388 field4346;

    @ObfuscatedName("nt.n")
    public float[] field4349 = new float[16];

    static {
        method4610(100);
        field4346 = new class388();
    }

    @ObfuscatedName("ir.v(IB)V")
    public static void method4610(int arg0) {
        Statics.field4186 = arg0;
        field4347 = new class388[arg0];
        Statics.field4348 = 0;
    }

    @ObfuscatedName("nt.c(B)V")
    public void method6368() {
        class388[] var1 = field4347;
        synchronized (field4347) {
            if (Statics.field4348 < Statics.field4186 - 1) {
                field4347[++Statics.field4348 - 1] = this;
            }
        }
    }

    public class388() {
        this.method6350();
    }

    public class388(class388 arg0) {
        this.method6371(arg0);
    }

    public class388(class438 arg0, boolean arg1) {
        this.method6353(arg0, arg1);
    }

    @ObfuscatedName("nt.i(Lpi;ZB)V")
    public void method6353(class438 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4349[var16] = arg0.method6978();
            }
            return;
        }
        class389 var3 = new class389();
        int var5 = arg0.method6974();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method6417(var7);
        int var9 = arg0.method6974();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method6422(var11);
        int var13 = arg0.method6974();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method6421(var15);
        var3.method6430((float) arg0.method6974(), (float) arg0.method6974(), (float) arg0.method6974());
        this.method6351(var3);
    }

    @ObfuscatedName("nt.f(I)[F")
    public float[] method6348() {
        float[] var1 = new float[3];
        if ((double) this.field4349[2] < 0.999D && (double) this.field4349[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4349[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4349[6] / var2, (double) this.field4349[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4349[1] / var2, (double) this.field4349[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4349[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4349[9]), (double) this.field4349[5]);
        }
        return var1;
    }

    @ObfuscatedName("nt.b(I)[F")
    public float[] method6349() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4349[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4349[2];
            double var6 = (double) this.field4349[10];
            double var8 = (double) this.field4349[4];
            double var10 = (double) this.field4349[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4349[1];
            double var14 = (double) this.field4349[0];
            if (this.field4349[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("nt.n(I)V")
    public void method6350() {
        this.field4349[0] = 1.0F;
        this.field4349[1] = 0.0F;
        this.field4349[2] = 0.0F;
        this.field4349[3] = 0.0F;
        this.field4349[4] = 0.0F;
        this.field4349[5] = 1.0F;
        this.field4349[6] = 0.0F;
        this.field4349[7] = 0.0F;
        this.field4349[8] = 0.0F;
        this.field4349[9] = 0.0F;
        this.field4349[10] = 1.0F;
        this.field4349[11] = 0.0F;
        this.field4349[12] = 0.0F;
        this.field4349[13] = 0.0F;
        this.field4349[14] = 0.0F;
        this.field4349[15] = 1.0F;
    }

    @ObfuscatedName("nt.s(B)V")
    public void method6403() {
        this.field4349[0] = 0.0F;
        this.field4349[1] = 0.0F;
        this.field4349[2] = 0.0F;
        this.field4349[3] = 0.0F;
        this.field4349[4] = 0.0F;
        this.field4349[5] = 0.0F;
        this.field4349[6] = 0.0F;
        this.field4349[7] = 0.0F;
        this.field4349[8] = 0.0F;
        this.field4349[9] = 0.0F;
        this.field4349[10] = 0.0F;
        this.field4349[11] = 0.0F;
        this.field4349[12] = 0.0F;
        this.field4349[13] = 0.0F;
        this.field4349[14] = 0.0F;
        this.field4349[15] = 0.0F;
    }

    @ObfuscatedName("nt.l(Lnt;I)V")
    public void method6371(class388 arg0) {
        System.arraycopy(arg0.field4349, 0, this.field4349, 0, 16);
    }

    @ObfuscatedName("nt.q(FI)V")
    public void method6382(float arg0) {
        this.method6388(arg0, arg0, arg0);
    }

    @ObfuscatedName("nt.o(FFFB)V")
    public void method6388(float arg0, float arg1, float arg2) {
        this.method6350();
        this.field4349[0] = arg0;
        this.field4349[5] = arg1;
        this.field4349[10] = arg2;
    }

    @ObfuscatedName("nt.r(Lnt;I)V")
    public void method6355(class388 arg0) {
        for (int var2 = 0; var2 < this.field4349.length; var2++) {
            this.field4349[var2] += arg0.field4349[var2];
        }
    }

    @ObfuscatedName("nt.p(Lnt;I)V")
    public void method6356(class388 arg0) {
        float var2 = this.field4349[3] * arg0.field4349[12] + this.field4349[2] * arg0.field4349[8] + this.field4349[0] * arg0.field4349[0] + this.field4349[1] * arg0.field4349[4];
        float var3 = this.field4349[3] * arg0.field4349[13] + this.field4349[2] * arg0.field4349[9] + this.field4349[1] * arg0.field4349[5] + this.field4349[0] * arg0.field4349[1];
        float var4 = this.field4349[3] * arg0.field4349[14] + this.field4349[2] * arg0.field4349[10] + this.field4349[0] * arg0.field4349[2] + this.field4349[1] * arg0.field4349[6];
        float var5 = this.field4349[3] * arg0.field4349[15] + this.field4349[2] * arg0.field4349[11] + this.field4349[1] * arg0.field4349[7] + this.field4349[0] * arg0.field4349[3];
        float var6 = this.field4349[7] * arg0.field4349[12] + this.field4349[6] * arg0.field4349[8] + this.field4349[4] * arg0.field4349[0] + this.field4349[5] * arg0.field4349[4];
        float var7 = this.field4349[7] * arg0.field4349[13] + this.field4349[6] * arg0.field4349[9] + this.field4349[5] * arg0.field4349[5] + this.field4349[4] * arg0.field4349[1];
        float var8 = this.field4349[7] * arg0.field4349[14] + this.field4349[6] * arg0.field4349[10] + this.field4349[4] * arg0.field4349[2] + this.field4349[5] * arg0.field4349[6];
        float var9 = this.field4349[7] * arg0.field4349[15] + this.field4349[6] * arg0.field4349[11] + this.field4349[5] * arg0.field4349[7] + this.field4349[4] * arg0.field4349[3];
        float var10 = this.field4349[11] * arg0.field4349[12] + this.field4349[10] * arg0.field4349[8] + this.field4349[9] * arg0.field4349[4] + this.field4349[8] * arg0.field4349[0];
        float var11 = this.field4349[11] * arg0.field4349[13] + this.field4349[10] * arg0.field4349[9] + this.field4349[8] * arg0.field4349[1] + this.field4349[9] * arg0.field4349[5];
        float var12 = this.field4349[11] * arg0.field4349[14] + this.field4349[10] * arg0.field4349[10] + this.field4349[9] * arg0.field4349[6] + this.field4349[8] * arg0.field4349[2];
        float var13 = this.field4349[11] * arg0.field4349[15] + this.field4349[10] * arg0.field4349[11] + this.field4349[8] * arg0.field4349[3] + this.field4349[9] * arg0.field4349[7];
        float var14 = this.field4349[15] * arg0.field4349[12] + this.field4349[14] * arg0.field4349[8] + this.field4349[13] * arg0.field4349[4] + this.field4349[12] * arg0.field4349[0];
        float var15 = this.field4349[15] * arg0.field4349[13] + this.field4349[14] * arg0.field4349[9] + this.field4349[12] * arg0.field4349[1] + this.field4349[13] * arg0.field4349[5];
        float var16 = this.field4349[15] * arg0.field4349[14] + this.field4349[14] * arg0.field4349[10] + this.field4349[13] * arg0.field4349[6] + this.field4349[12] * arg0.field4349[2];
        float var17 = this.field4349[15] * arg0.field4349[15] + this.field4349[14] * arg0.field4349[11] + this.field4349[13] * arg0.field4349[7] + this.field4349[12] * arg0.field4349[3];
        this.field4349[0] = var2;
        this.field4349[1] = var3;
        this.field4349[2] = var4;
        this.field4349[3] = var5;
        this.field4349[4] = var6;
        this.field4349[5] = var7;
        this.field4349[6] = var8;
        this.field4349[7] = var9;
        this.field4349[8] = var10;
        this.field4349[9] = var11;
        this.field4349[10] = var12;
        this.field4349[11] = var13;
        this.field4349[12] = var14;
        this.field4349[13] = var15;
        this.field4349[14] = var16;
        this.field4349[15] = var17;
    }

    @ObfuscatedName("nt.w(Lnq;I)V")
    public void method6345(class387 arg0) {
        float var2 = arg0.field4344 * arg0.field4344;
        float var3 = arg0.field4344 * arg0.field4341;
        float var4 = arg0.field4344 * arg0.field4342;
        float var5 = arg0.field4344 * arg0.field4343;
        float var6 = arg0.field4341 * arg0.field4341;
        float var7 = arg0.field4342 * arg0.field4341;
        float var8 = arg0.field4343 * arg0.field4341;
        float var9 = arg0.field4342 * arg0.field4342;
        float var10 = arg0.field4343 * arg0.field4342;
        float var11 = arg0.field4343 * arg0.field4343;
        this.field4349[0] = var2 + var6 - var11 - var9;
        this.field4349[1] = var5 + var7 + var7 + var5;
        this.field4349[2] = var8 - var4 - var4 + var8;
        this.field4349[4] = var7 - var5 - var5 + var7;
        this.field4349[5] = var2 + var9 - var6 - var11;
        this.field4349[6] = var3 + var10 + var10 + var3;
        this.field4349[8] = var4 + var8 + var8 + var4;
        this.field4349[9] = var10 - var3 - var3 + var10;
        this.field4349[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("nt.k(Lnb;B)V")
    public void method6351(class389 arg0) {
        this.field4349[0] = arg0.field4356;
        this.field4349[1] = arg0.field4358;
        this.field4349[2] = arg0.field4354;
        this.field4349[3] = 0.0F;
        this.field4349[4] = arg0.field4355;
        this.field4349[5] = arg0.field4353;
        this.field4349[6] = arg0.field4357;
        this.field4349[7] = 0.0F;
        this.field4349[8] = arg0.field4352;
        this.field4349[9] = arg0.field4361;
        this.field4349[10] = arg0.field4360;
        this.field4349[11] = 0.0F;
        this.field4349[12] = arg0.field4363;
        this.field4349[13] = arg0.field4362;
        this.field4349[14] = arg0.field4359;
        this.field4349[15] = 1.0F;
    }

    @ObfuscatedName("nt.d(B)F")
    public float method6414() {
        return this.field4349[6] * this.field4349[3] * this.field4349[9] * this.field4349[12] + (this.field4349[5] * this.field4349[3] * this.field4349[8] * this.field4349[14] + this.field4349[4] * this.field4349[3] * this.field4349[10] * this.field4349[13] + (this.field4349[7] * this.field4349[2] * this.field4349[8] * this.field4349[13] + this.field4349[5] * this.field4349[2] * this.field4349[11] * this.field4349[12] + (this.field4349[2] * this.field4349[4] * this.field4349[9] * this.field4349[15] + this.field4349[7] * this.field4349[1] * this.field4349[10] * this.field4349[12] + (this.field4349[1] * this.field4349[6] * this.field4349[8] * this.field4349[15] + this.field4349[4] * this.field4349[1] * this.field4349[11] * this.field4349[14] + (this.field4349[0] * this.field4349[7] * this.field4349[9] * this.field4349[14] + this.field4349[0] * this.field4349[6] * this.field4349[11] * this.field4349[13] + (this.field4349[0] * this.field4349[5] * this.field4349[10] * this.field4349[15] - this.field4349[5] * this.field4349[0] * this.field4349[11] * this.field4349[14] - this.field4349[6] * this.field4349[0] * this.field4349[9] * this.field4349[15]) - this.field4349[7] * this.field4349[0] * this.field4349[10] * this.field4349[13] - this.field4349[1] * this.field4349[4] * this.field4349[10] * this.field4349[15]) - this.field4349[6] * this.field4349[1] * this.field4349[11] * this.field4349[12] - this.field4349[1] * this.field4349[7] * this.field4349[8] * this.field4349[14]) - this.field4349[4] * this.field4349[2] * this.field4349[11] * this.field4349[13] - this.field4349[2] * this.field4349[5] * this.field4349[8] * this.field4349[15]) - this.field4349[7] * this.field4349[2] * this.field4349[9] * this.field4349[12] - this.field4349[4] * this.field4349[3] * this.field4349[9] * this.field4349[14]) - this.field4349[5] * this.field4349[3] * this.field4349[10] * this.field4349[12] - this.field4349[6] * this.field4349[3] * this.field4349[8] * this.field4349[13]);
    }

    @ObfuscatedName("nt.m(I)V")
    public void method6360() {
        float var1 = 1.0F / this.method6414();
        float var2 = (this.field4349[9] * this.field4349[7] * this.field4349[14] + this.field4349[11] * this.field4349[6] * this.field4349[13] + (this.field4349[10] * this.field4349[5] * this.field4349[15] - this.field4349[11] * this.field4349[5] * this.field4349[14] - this.field4349[9] * this.field4349[6] * this.field4349[15]) - this.field4349[7] * this.field4349[10] * this.field4349[13]) * var1;
        float var3 = (this.field4349[10] * this.field4349[3] * this.field4349[13] + (this.field4349[2] * this.field4349[9] * this.field4349[15] + this.field4349[10] * -this.field4349[1] * this.field4349[15] + this.field4349[11] * this.field4349[1] * this.field4349[14] - this.field4349[11] * this.field4349[2] * this.field4349[13] - this.field4349[3] * this.field4349[9] * this.field4349[14])) * var1;
        float var4 = (this.field4349[5] * this.field4349[3] * this.field4349[14] + this.field4349[7] * this.field4349[2] * this.field4349[13] + (this.field4349[6] * this.field4349[1] * this.field4349[15] - this.field4349[7] * this.field4349[1] * this.field4349[14] - this.field4349[5] * this.field4349[2] * this.field4349[15]) - this.field4349[6] * this.field4349[3] * this.field4349[13]) * var1;
        float var5 = (this.field4349[3] * this.field4349[6] * this.field4349[9] + (this.field4349[5] * this.field4349[2] * this.field4349[11] + this.field4349[6] * -this.field4349[1] * this.field4349[11] + this.field4349[7] * this.field4349[1] * this.field4349[10] - this.field4349[7] * this.field4349[2] * this.field4349[9] - this.field4349[5] * this.field4349[3] * this.field4349[10])) * var1;
        float var6 = (this.field4349[10] * this.field4349[7] * this.field4349[12] + (this.field4349[6] * this.field4349[8] * this.field4349[15] + this.field4349[11] * this.field4349[4] * this.field4349[14] + this.field4349[10] * -this.field4349[4] * this.field4349[15] - this.field4349[6] * this.field4349[11] * this.field4349[12] - this.field4349[7] * this.field4349[8] * this.field4349[14])) * var1;
        float var7 = (this.field4349[3] * this.field4349[8] * this.field4349[14] + this.field4349[2] * this.field4349[11] * this.field4349[12] + (this.field4349[0] * this.field4349[10] * this.field4349[15] - this.field4349[11] * this.field4349[0] * this.field4349[14] - this.field4349[8] * this.field4349[2] * this.field4349[15]) - this.field4349[3] * this.field4349[10] * this.field4349[12]) * var1;
        float var8 = (this.field4349[3] * this.field4349[6] * this.field4349[12] + (this.field4349[2] * this.field4349[4] * this.field4349[15] + this.field4349[7] * this.field4349[0] * this.field4349[14] + this.field4349[6] * -this.field4349[0] * this.field4349[15] - this.field4349[2] * this.field4349[7] * this.field4349[12] - this.field4349[4] * this.field4349[3] * this.field4349[14])) * var1;
        float var9 = (this.field4349[4] * this.field4349[3] * this.field4349[10] + this.field4349[2] * this.field4349[7] * this.field4349[8] + (this.field4349[0] * this.field4349[6] * this.field4349[11] - this.field4349[0] * this.field4349[7] * this.field4349[10] - this.field4349[4] * this.field4349[2] * this.field4349[11]) - this.field4349[6] * this.field4349[3] * this.field4349[8]) * var1;
        float var10 = (this.field4349[7] * this.field4349[8] * this.field4349[13] + this.field4349[5] * this.field4349[11] * this.field4349[12] + (this.field4349[4] * this.field4349[9] * this.field4349[15] - this.field4349[4] * this.field4349[11] * this.field4349[13] - this.field4349[5] * this.field4349[8] * this.field4349[15]) - this.field4349[9] * this.field4349[7] * this.field4349[12]) * var1;
        float var11 = (this.field4349[9] * this.field4349[3] * this.field4349[12] + (this.field4349[8] * this.field4349[1] * this.field4349[15] + this.field4349[11] * this.field4349[0] * this.field4349[13] + this.field4349[9] * -this.field4349[0] * this.field4349[15] - this.field4349[1] * this.field4349[11] * this.field4349[12] - this.field4349[8] * this.field4349[3] * this.field4349[13])) * var1;
        float var12 = (this.field4349[3] * this.field4349[4] * this.field4349[13] + this.field4349[7] * this.field4349[1] * this.field4349[12] + (this.field4349[5] * this.field4349[0] * this.field4349[15] - this.field4349[0] * this.field4349[7] * this.field4349[13] - this.field4349[4] * this.field4349[1] * this.field4349[15]) - this.field4349[5] * this.field4349[3] * this.field4349[12]) * var1;
        float var13 = (this.field4349[5] * this.field4349[3] * this.field4349[8] + (this.field4349[4] * this.field4349[1] * this.field4349[11] + this.field4349[5] * -this.field4349[0] * this.field4349[11] + this.field4349[0] * this.field4349[7] * this.field4349[9] - this.field4349[1] * this.field4349[7] * this.field4349[8] - this.field4349[4] * this.field4349[3] * this.field4349[9])) * var1;
        float var14 = (this.field4349[6] * this.field4349[9] * this.field4349[12] + (this.field4349[5] * this.field4349[8] * this.field4349[14] + this.field4349[4] * this.field4349[10] * this.field4349[13] + this.field4349[9] * -this.field4349[4] * this.field4349[14] - this.field4349[10] * this.field4349[5] * this.field4349[12] - this.field4349[8] * this.field4349[6] * this.field4349[13])) * var1;
        float var15 = (this.field4349[2] * this.field4349[8] * this.field4349[13] + this.field4349[1] * this.field4349[10] * this.field4349[12] + (this.field4349[0] * this.field4349[9] * this.field4349[14] - this.field4349[0] * this.field4349[10] * this.field4349[13] - this.field4349[8] * this.field4349[1] * this.field4349[14]) - this.field4349[2] * this.field4349[9] * this.field4349[12]) * var1;
        float var16 = (this.field4349[5] * this.field4349[2] * this.field4349[12] + (this.field4349[4] * this.field4349[1] * this.field4349[14] + this.field4349[5] * -this.field4349[0] * this.field4349[14] + this.field4349[6] * this.field4349[0] * this.field4349[13] - this.field4349[6] * this.field4349[1] * this.field4349[12] - this.field4349[2] * this.field4349[4] * this.field4349[13])) * var1;
        float var17 = (this.field4349[2] * this.field4349[4] * this.field4349[9] + this.field4349[6] * this.field4349[1] * this.field4349[8] + (this.field4349[5] * this.field4349[0] * this.field4349[10] - this.field4349[0] * this.field4349[6] * this.field4349[9] - this.field4349[1] * this.field4349[4] * this.field4349[10]) - this.field4349[2] * this.field4349[5] * this.field4349[8]) * var1;
        this.field4349[0] = var2;
        this.field4349[1] = var3;
        this.field4349[2] = var4;
        this.field4349[3] = var5;
        this.field4349[4] = var6;
        this.field4349[5] = var7;
        this.field4349[6] = var8;
        this.field4349[7] = var9;
        this.field4349[8] = var10;
        this.field4349[9] = var11;
        this.field4349[10] = var12;
        this.field4349[11] = var13;
        this.field4349[12] = var14;
        this.field4349[13] = var15;
        this.field4349[14] = var16;
        this.field4349[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method6349();
        this.method6348();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4349[var2 * 4 + var3];
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
        byte var1 = 1;
        return var1 * 31 + Arrays.hashCode(this.field4349);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class388)) {
            return false;
        }
        class388 var2 = (class388) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4349[var3] != var2.field4349[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("nt.u(I)[F")
    public float[] method6362() {
        float[] var1 = new float[3];
        class386 var2 = new class386(this.field4349[0], this.field4349[1], this.field4349[2]);
        class386 var3 = new class386(this.field4349[4], this.field4349[5], this.field4349[6]);
        class386 var4 = new class386(this.field4349[8], this.field4349[9], this.field4349[10]);
        var1[0] = var2.method6312();
        var1[1] = var3.method6312();
        var1[2] = var4.method6312();
        return var1;
    }
}
