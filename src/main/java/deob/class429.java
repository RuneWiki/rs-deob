package deob;

import java.util.Arrays;

@ObfuscatedName("qs")
public final class class429 {

    @ObfuscatedName("qs.aw")
    public static class429[] field4782 = new class429[0];

    @ObfuscatedName("qs.ai")
    public float[] field4784 = new float[16];

    @ObfuscatedName("qs.ay")
    public static final class429 field4785;

    static {
        method6810(100);
        field4785 = new class429();
    }

    @ObfuscatedName("ng.ap(II)V")
    public static void method6810(int arg0) {
        Statics.field4781 = arg0;
        field4782 = new class429[arg0];
        Statics.field1054 = 0;
    }

    @ObfuscatedName("gu.aw(I)Lqs;")
    public static class429 method3581() {
        class429[] var0 = field4782;
        synchronized (field4782) {
            if (Statics.field1054 == 0) {
                return new class429();
            } else {
                field4782[--Statics.field1054].method7637();
                return field4782[Statics.field1054];
            }
        }
    }

    @ObfuscatedName("qs.ak(B)V")
    public void method7650() {
        class429[] var1 = field4782;
        synchronized (field4782) {
            if (Statics.field1054 < Statics.field4781 - 1) {
                field4782[++Statics.field1054 - 1] = this;
            }
        }
    }

    public class429() {
        this.method7637();
    }

    public class429(class429 arg0) {
        this.method7648(arg0);
    }

    public class429(class558 arg0, boolean arg1) {
        this.method7616(arg0, arg1);
    }

    @ObfuscatedName("qs.aj(Lvl;ZI)V")
    public void method7616(class558 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4784[var16] = arg0.method9266();
            }
            return;
        }
        class430 var3 = new class430();
        int var5 = arg0.method9261();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6) * 3.834951969714103E-4D);
        var3.method7705(var7);
        int var9 = arg0.method9261();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10) * 3.834951969714103E-4D);
        var3.method7706(var11);
        int var13 = arg0.method9261();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14) * 3.834951969714103E-4D);
        var3.method7707(var15);
        var3.method7704((float) arg0.method9261(), (float) arg0.method9261(), (float) arg0.method9261());
        this.method7627(var3);
    }

    @ObfuscatedName("qs.ai(I)[F")
    public float[] method7638() {
        float[] var1 = new float[3];
        if ((double) this.field4784[2] < 0.999D && (double) this.field4784[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4784[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4784[6] / var2, (double) this.field4784[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4784[1] / var2, (double) this.field4784[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4784[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4784[9]), (double) this.field4784[5]);
        }
        return var1;
    }

    @ObfuscatedName("qs.ay(B)[F")
    public float[] method7618() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4784[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4784[2];
            double var6 = (double) this.field4784[10];
            double var8 = (double) this.field4784[4];
            double var10 = (double) this.field4784[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4784[1];
            double var14 = (double) this.field4784[0];
            if (this.field4784[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("qs.as(B)V")
    public void method7637() {
        this.field4784[0] = 1.0F;
        this.field4784[1] = 0.0F;
        this.field4784[2] = 0.0F;
        this.field4784[3] = 0.0F;
        this.field4784[4] = 0.0F;
        this.field4784[5] = 1.0F;
        this.field4784[6] = 0.0F;
        this.field4784[7] = 0.0F;
        this.field4784[8] = 0.0F;
        this.field4784[9] = 0.0F;
        this.field4784[10] = 1.0F;
        this.field4784[11] = 0.0F;
        this.field4784[12] = 0.0F;
        this.field4784[13] = 0.0F;
        this.field4784[14] = 0.0F;
        this.field4784[15] = 1.0F;
    }

    @ObfuscatedName("qs.ae(B)V")
    public void method7669() {
        this.field4784[0] = 0.0F;
        this.field4784[1] = 0.0F;
        this.field4784[2] = 0.0F;
        this.field4784[3] = 0.0F;
        this.field4784[4] = 0.0F;
        this.field4784[5] = 0.0F;
        this.field4784[6] = 0.0F;
        this.field4784[7] = 0.0F;
        this.field4784[8] = 0.0F;
        this.field4784[9] = 0.0F;
        this.field4784[10] = 0.0F;
        this.field4784[11] = 0.0F;
        this.field4784[12] = 0.0F;
        this.field4784[13] = 0.0F;
        this.field4784[14] = 0.0F;
        this.field4784[15] = 0.0F;
    }

    @ObfuscatedName("qs.am(Lqs;I)V")
    public void method7648(class429 arg0) {
        System.arraycopy(arg0.field4784, 0, this.field4784, 0, 16);
    }

    @ObfuscatedName("qs.at(FI)V")
    public void method7621(float arg0) {
        this.method7622(arg0, arg0, arg0);
    }

    @ObfuscatedName("qs.au(FFFI)V")
    public void method7622(float arg0, float arg1, float arg2) {
        this.method7637();
        this.field4784[0] = arg0;
        this.field4784[5] = arg1;
        this.field4784[10] = arg2;
    }

    @ObfuscatedName("qs.an(Lqs;I)V")
    public void method7623(class429 arg0) {
        for (int var2 = 0; var2 < this.field4784.length; var2++) {
            this.field4784[var2] += arg0.field4784[var2];
        }
    }

    @ObfuscatedName("qs.ao(Lqs;I)V")
    public void method7644(class429 arg0) {
        float var2 = this.field4784[3] * arg0.field4784[12] + this.field4784[2] * arg0.field4784[8] + this.field4784[1] * arg0.field4784[4] + this.field4784[0] * arg0.field4784[0];
        float var3 = this.field4784[3] * arg0.field4784[13] + this.field4784[2] * arg0.field4784[9] + this.field4784[1] * arg0.field4784[5] + this.field4784[0] * arg0.field4784[1];
        float var4 = this.field4784[3] * arg0.field4784[14] + this.field4784[2] * arg0.field4784[10] + this.field4784[0] * arg0.field4784[2] + this.field4784[1] * arg0.field4784[6];
        float var5 = this.field4784[3] * arg0.field4784[15] + this.field4784[2] * arg0.field4784[11] + this.field4784[0] * arg0.field4784[3] + this.field4784[1] * arg0.field4784[7];
        float var6 = this.field4784[7] * arg0.field4784[12] + this.field4784[6] * arg0.field4784[8] + this.field4784[4] * arg0.field4784[0] + this.field4784[5] * arg0.field4784[4];
        float var7 = this.field4784[7] * arg0.field4784[13] + this.field4784[6] * arg0.field4784[9] + this.field4784[5] * arg0.field4784[5] + this.field4784[4] * arg0.field4784[1];
        float var8 = this.field4784[7] * arg0.field4784[14] + this.field4784[6] * arg0.field4784[10] + this.field4784[4] * arg0.field4784[2] + this.field4784[5] * arg0.field4784[6];
        float var9 = this.field4784[7] * arg0.field4784[15] + this.field4784[6] * arg0.field4784[11] + this.field4784[4] * arg0.field4784[3] + this.field4784[5] * arg0.field4784[7];
        float var10 = this.field4784[11] * arg0.field4784[12] + this.field4784[10] * arg0.field4784[8] + this.field4784[8] * arg0.field4784[0] + this.field4784[9] * arg0.field4784[4];
        float var11 = this.field4784[11] * arg0.field4784[13] + this.field4784[10] * arg0.field4784[9] + this.field4784[8] * arg0.field4784[1] + this.field4784[9] * arg0.field4784[5];
        float var12 = this.field4784[11] * arg0.field4784[14] + this.field4784[10] * arg0.field4784[10] + this.field4784[8] * arg0.field4784[2] + this.field4784[9] * arg0.field4784[6];
        float var13 = this.field4784[11] * arg0.field4784[15] + this.field4784[10] * arg0.field4784[11] + this.field4784[8] * arg0.field4784[3] + this.field4784[9] * arg0.field4784[7];
        float var14 = this.field4784[15] * arg0.field4784[12] + this.field4784[14] * arg0.field4784[8] + this.field4784[12] * arg0.field4784[0] + this.field4784[13] * arg0.field4784[4];
        float var15 = this.field4784[15] * arg0.field4784[13] + this.field4784[14] * arg0.field4784[9] + this.field4784[12] * arg0.field4784[1] + this.field4784[13] * arg0.field4784[5];
        float var16 = this.field4784[15] * arg0.field4784[14] + this.field4784[14] * arg0.field4784[10] + this.field4784[13] * arg0.field4784[6] + this.field4784[12] * arg0.field4784[2];
        float var17 = this.field4784[15] * arg0.field4784[15] + this.field4784[14] * arg0.field4784[11] + this.field4784[13] * arg0.field4784[7] + this.field4784[12] * arg0.field4784[3];
        this.field4784[0] = var2;
        this.field4784[1] = var3;
        this.field4784[2] = var4;
        this.field4784[3] = var5;
        this.field4784[4] = var6;
        this.field4784[5] = var7;
        this.field4784[6] = var8;
        this.field4784[7] = var9;
        this.field4784[8] = var10;
        this.field4784[9] = var11;
        this.field4784[10] = var12;
        this.field4784[11] = var13;
        this.field4784[12] = var14;
        this.field4784[13] = var15;
        this.field4784[14] = var16;
        this.field4784[15] = var17;
    }

    @ObfuscatedName("qs.af(Lqj;I)V")
    public void method7625(class423 arg0) {
        float var2 = arg0.field4753.field4780 * arg0.field4753.field4780;
        float var3 = arg0.field4753.field4780 * arg0.field4753.field4779;
        float var4 = arg0.field4753.field4780 * arg0.field4753.field4775;
        float var5 = arg0.field4753.field4780 * arg0.field4753.field4778;
        float var6 = arg0.field4753.field4779 * arg0.field4753.field4779;
        float var7 = arg0.field4753.field4779 * arg0.field4753.field4775;
        float var8 = arg0.field4753.field4779 * arg0.field4753.field4778;
        float var9 = arg0.field4753.field4775 * arg0.field4753.field4775;
        float var10 = arg0.field4753.field4778 * arg0.field4753.field4775;
        float var11 = arg0.field4753.field4778 * arg0.field4753.field4778;
        this.field4784[0] = var2 + var6 - var11 - var9;
        this.field4784[1] = var5 + var7 + var7 + var5;
        this.field4784[2] = var8 - var4 - var4 + var8;
        this.field4784[4] = var7 - var5 - var5 + var7;
        this.field4784[5] = var2 + var9 - var6 - var11;
        this.field4784[6] = var3 + var10 + var10 + var3;
        this.field4784[8] = var4 + var8 + var8 + var4;
        this.field4784[9] = var10 - var3 - var3 + var10;
        this.field4784[10] = var2 + var11 - var9 - var6;
        float[] var12 = this.field4784;
        float[] var13 = this.field4784;
        this.field4784[11] = 0.0F;
        var13[7] = 0.0F;
        var12[3] = 0.0F;
        this.field4784[12] = arg0.field4754.field4772;
        this.field4784[13] = arg0.field4754.field4773;
        this.field4784[14] = arg0.field4754.field4767;
        this.field4784[15] = 1.0F;
    }

    @ObfuscatedName("qs.ar(Lqp;I)V")
    public void method7626(class428 arg0) {
        float var2 = arg0.field4780 * arg0.field4780;
        float var3 = arg0.field4780 * arg0.field4779;
        float var4 = arg0.field4780 * arg0.field4775;
        float var5 = arg0.field4780 * arg0.field4778;
        float var6 = arg0.field4779 * arg0.field4779;
        float var7 = arg0.field4779 * arg0.field4775;
        float var8 = arg0.field4779 * arg0.field4778;
        float var9 = arg0.field4775 * arg0.field4775;
        float var10 = arg0.field4778 * arg0.field4775;
        float var11 = arg0.field4778 * arg0.field4778;
        this.field4784[0] = var2 + var6 - var11 - var9;
        this.field4784[1] = var5 + var7 + var7 + var5;
        this.field4784[2] = var8 - var4 - var4 + var8;
        this.field4784[4] = var7 - var5 - var5 + var7;
        this.field4784[5] = var2 + var9 - var6 - var11;
        this.field4784[6] = var3 + var10 + var10 + var3;
        this.field4784[8] = var4 + var8 + var8 + var4;
        this.field4784[9] = var10 - var3 - var3 + var10;
        this.field4784[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("qs.ab(Lqh;I)V")
    public void method7627(class430 arg0) {
        this.field4784[0] = arg0.field4790;
        this.field4784[1] = arg0.field4788;
        this.field4784[2] = arg0.field4797;
        this.field4784[3] = 0.0F;
        this.field4784[4] = arg0.field4789;
        this.field4784[5] = arg0.field4791;
        this.field4784[6] = arg0.field4792;
        this.field4784[7] = 0.0F;
        this.field4784[8] = arg0.field4793;
        this.field4784[9] = arg0.field4794;
        this.field4784[10] = arg0.field4795;
        this.field4784[11] = 0.0F;
        this.field4784[12] = arg0.field4796;
        this.field4784[13] = arg0.field4787;
        this.field4784[14] = arg0.field4798;
        this.field4784[15] = 1.0F;
    }

    @ObfuscatedName("qs.az(I)F")
    public float method7628() {
        return this.field4784[3] * this.field4784[6] * this.field4784[9] * this.field4784[12] + (this.field4784[3] * this.field4784[5] * this.field4784[8] * this.field4784[14] + this.field4784[3] * this.field4784[4] * this.field4784[10] * this.field4784[13] + (this.field4784[2] * this.field4784[7] * this.field4784[8] * this.field4784[13] + this.field4784[5] * this.field4784[2] * this.field4784[11] * this.field4784[12] + (this.field4784[2] * this.field4784[4] * this.field4784[9] * this.field4784[15] + this.field4784[1] * this.field4784[7] * this.field4784[10] * this.field4784[12] + (this.field4784[6] * this.field4784[1] * this.field4784[8] * this.field4784[15] + this.field4784[1] * this.field4784[4] * this.field4784[11] * this.field4784[14] + (this.field4784[7] * this.field4784[0] * this.field4784[9] * this.field4784[14] + this.field4784[0] * this.field4784[6] * this.field4784[11] * this.field4784[13] + (this.field4784[5] * this.field4784[0] * this.field4784[10] * this.field4784[15] - this.field4784[5] * this.field4784[0] * this.field4784[11] * this.field4784[14] - this.field4784[0] * this.field4784[6] * this.field4784[9] * this.field4784[15]) - this.field4784[0] * this.field4784[7] * this.field4784[10] * this.field4784[13] - this.field4784[4] * this.field4784[1] * this.field4784[10] * this.field4784[15]) - this.field4784[1] * this.field4784[6] * this.field4784[11] * this.field4784[12] - this.field4784[1] * this.field4784[7] * this.field4784[8] * this.field4784[14]) - this.field4784[2] * this.field4784[4] * this.field4784[11] * this.field4784[13] - this.field4784[5] * this.field4784[2] * this.field4784[8] * this.field4784[15]) - this.field4784[7] * this.field4784[2] * this.field4784[9] * this.field4784[12] - this.field4784[4] * this.field4784[3] * this.field4784[9] * this.field4784[14]) - this.field4784[3] * this.field4784[5] * this.field4784[10] * this.field4784[12] - this.field4784[3] * this.field4784[6] * this.field4784[8] * this.field4784[13]);
    }

    @ObfuscatedName("qs.ag(B)V")
    public void method7629() {
        float var1 = 1.0F / this.method7628();
        float var2 = (this.field4784[7] * this.field4784[9] * this.field4784[14] + this.field4784[11] * this.field4784[6] * this.field4784[13] + (this.field4784[5] * this.field4784[10] * this.field4784[15] - this.field4784[5] * this.field4784[11] * this.field4784[14] - this.field4784[6] * this.field4784[9] * this.field4784[15]) - this.field4784[10] * this.field4784[7] * this.field4784[13]) * var1;
        float var3 = (this.field4784[10] * this.field4784[3] * this.field4784[13] + (this.field4784[9] * this.field4784[2] * this.field4784[15] + this.field4784[10] * -this.field4784[1] * this.field4784[15] + this.field4784[1] * this.field4784[11] * this.field4784[14] - this.field4784[11] * this.field4784[2] * this.field4784[13] - this.field4784[9] * this.field4784[3] * this.field4784[14])) * var1;
        float var4 = (this.field4784[5] * this.field4784[3] * this.field4784[14] + this.field4784[7] * this.field4784[2] * this.field4784[13] + (this.field4784[6] * this.field4784[1] * this.field4784[15] - this.field4784[1] * this.field4784[7] * this.field4784[14] - this.field4784[2] * this.field4784[5] * this.field4784[15]) - this.field4784[6] * this.field4784[3] * this.field4784[13]) * var1;
        float var5 = (this.field4784[6] * this.field4784[3] * this.field4784[9] + (this.field4784[5] * this.field4784[2] * this.field4784[11] + this.field4784[7] * this.field4784[1] * this.field4784[10] + this.field4784[6] * -this.field4784[1] * this.field4784[11] - this.field4784[2] * this.field4784[7] * this.field4784[9] - this.field4784[3] * this.field4784[5] * this.field4784[10])) * var1;
        float var6 = (this.field4784[10] * this.field4784[7] * this.field4784[12] + (this.field4784[8] * this.field4784[6] * this.field4784[15] + this.field4784[10] * -this.field4784[4] * this.field4784[15] + this.field4784[11] * this.field4784[4] * this.field4784[14] - this.field4784[6] * this.field4784[11] * this.field4784[12] - this.field4784[8] * this.field4784[7] * this.field4784[14])) * var1;
        float var7 = (this.field4784[8] * this.field4784[3] * this.field4784[14] + this.field4784[2] * this.field4784[11] * this.field4784[12] + (this.field4784[10] * this.field4784[0] * this.field4784[15] - this.field4784[11] * this.field4784[0] * this.field4784[14] - this.field4784[2] * this.field4784[8] * this.field4784[15]) - this.field4784[3] * this.field4784[10] * this.field4784[12]) * var1;
        float var8 = (this.field4784[6] * this.field4784[3] * this.field4784[12] + (this.field4784[2] * this.field4784[4] * this.field4784[15] + this.field4784[6] * -this.field4784[0] * this.field4784[15] + this.field4784[7] * this.field4784[0] * this.field4784[14] - this.field4784[7] * this.field4784[2] * this.field4784[12] - this.field4784[4] * this.field4784[3] * this.field4784[14])) * var1;
        float var9 = (this.field4784[3] * this.field4784[4] * this.field4784[10] + this.field4784[7] * this.field4784[2] * this.field4784[8] + (this.field4784[6] * this.field4784[0] * this.field4784[11] - this.field4784[0] * this.field4784[7] * this.field4784[10] - this.field4784[4] * this.field4784[2] * this.field4784[11]) - this.field4784[6] * this.field4784[3] * this.field4784[8]) * var1;
        float var10 = (this.field4784[7] * this.field4784[8] * this.field4784[13] + this.field4784[11] * this.field4784[5] * this.field4784[12] + (this.field4784[9] * this.field4784[4] * this.field4784[15] - this.field4784[11] * this.field4784[4] * this.field4784[13] - this.field4784[5] * this.field4784[8] * this.field4784[15]) - this.field4784[7] * this.field4784[9] * this.field4784[12]) * var1;
        float var11 = (this.field4784[9] * this.field4784[3] * this.field4784[12] + (this.field4784[8] * this.field4784[1] * this.field4784[15] + this.field4784[9] * -this.field4784[0] * this.field4784[15] + this.field4784[11] * this.field4784[0] * this.field4784[13] - this.field4784[11] * this.field4784[1] * this.field4784[12] - this.field4784[8] * this.field4784[3] * this.field4784[13])) * var1;
        float var12 = (this.field4784[4] * this.field4784[3] * this.field4784[13] + this.field4784[7] * this.field4784[1] * this.field4784[12] + (this.field4784[5] * this.field4784[0] * this.field4784[15] - this.field4784[7] * this.field4784[0] * this.field4784[13] - this.field4784[1] * this.field4784[4] * this.field4784[15]) - this.field4784[3] * this.field4784[5] * this.field4784[12]) * var1;
        float var13 = (this.field4784[5] * this.field4784[3] * this.field4784[8] + (this.field4784[4] * this.field4784[1] * this.field4784[11] + this.field4784[5] * -this.field4784[0] * this.field4784[11] + this.field4784[0] * this.field4784[7] * this.field4784[9] - this.field4784[1] * this.field4784[7] * this.field4784[8] - this.field4784[4] * this.field4784[3] * this.field4784[9])) * var1;
        float var14 = (this.field4784[6] * this.field4784[9] * this.field4784[12] + (this.field4784[8] * this.field4784[5] * this.field4784[14] + this.field4784[10] * this.field4784[4] * this.field4784[13] + this.field4784[9] * -this.field4784[4] * this.field4784[14] - this.field4784[10] * this.field4784[5] * this.field4784[12] - this.field4784[8] * this.field4784[6] * this.field4784[13])) * var1;
        float var15 = (this.field4784[8] * this.field4784[2] * this.field4784[13] + this.field4784[1] * this.field4784[10] * this.field4784[12] + (this.field4784[9] * this.field4784[0] * this.field4784[14] - this.field4784[0] * this.field4784[10] * this.field4784[13] - this.field4784[8] * this.field4784[1] * this.field4784[14]) - this.field4784[2] * this.field4784[9] * this.field4784[12]) * var1;
        float var16 = (this.field4784[5] * this.field4784[2] * this.field4784[12] + (this.field4784[1] * this.field4784[4] * this.field4784[14] + this.field4784[5] * -this.field4784[0] * this.field4784[14] + this.field4784[0] * this.field4784[6] * this.field4784[13] - this.field4784[6] * this.field4784[1] * this.field4784[12] - this.field4784[2] * this.field4784[4] * this.field4784[13])) * var1;
        float var17 = (this.field4784[2] * this.field4784[4] * this.field4784[9] + this.field4784[6] * this.field4784[1] * this.field4784[8] + (this.field4784[5] * this.field4784[0] * this.field4784[10] - this.field4784[6] * this.field4784[0] * this.field4784[9] - this.field4784[1] * this.field4784[4] * this.field4784[10]) - this.field4784[5] * this.field4784[2] * this.field4784[8]) * var1;
        this.field4784[0] = var2;
        this.field4784[1] = var3;
        this.field4784[2] = var4;
        this.field4784[3] = var5;
        this.field4784[4] = var6;
        this.field4784[5] = var7;
        this.field4784[6] = var8;
        this.field4784[7] = var9;
        this.field4784[8] = var10;
        this.field4784[9] = var11;
        this.field4784[10] = var12;
        this.field4784[11] = var13;
        this.field4784[12] = var14;
        this.field4784[13] = var15;
        this.field4784[14] = var16;
        this.field4784[15] = var17;
    }

    @ObfuscatedName("qs.ad(FFFFI)V")
    public void method7691(float arg0, float arg1, float arg2, float arg3) {
        this.field4784[0] = arg0;
        this.field4784[1] = 0.0F;
        this.field4784[2] = 0.0F;
        this.field4784[3] = 0.0F;
        this.field4784[4] = 0.0F;
        this.field4784[5] = arg1;
        this.field4784[6] = 0.0F;
        this.field4784[7] = 0.0F;
        this.field4784[8] = 0.0F;
        this.field4784[9] = 0.0F;
        this.field4784[10] = arg2;
        this.field4784[11] = 0.0F;
        this.field4784[12] = 0.0F;
        this.field4784[13] = 0.0F;
        this.field4784[14] = 0.0F;
        this.field4784[15] = arg3;
    }

    @ObfuscatedName("qs.ac(FFF[FB)V")
    public void method7686(float arg0, float arg1, float arg2, float[] arg3) {
        arg3[0] = this.field4784[8] * arg2 + this.field4784[4] * arg1 + this.field4784[0] * arg0 + this.field4784[12];
        arg3[1] = this.field4784[9] * arg2 + this.field4784[1] * arg0 + this.field4784[5] * arg1 + this.field4784[13];
        arg3[2] = this.field4784[10] * arg2 + this.field4784[6] * arg1 + this.field4784[2] * arg0 + this.field4784[14];
        if (arg3.length > 3) {
            arg3[3] = this.field4784[11] * arg2 + this.field4784[3] * arg0 + this.field4784[7] * arg1 + this.field4784[15];
        }
    }

    @ObfuscatedName("qs.av(FFFI)Lqt;")
    public class427 method7632(float arg0, float arg1, float arg2) {
        float var4 = 1.0F / (this.field4784[11] * arg2 + this.field4784[3] * arg0 + this.field4784[7] * arg1 + this.field4784[15]);
        return new class427((this.field4784[8] * arg2 + this.field4784[0] * arg0 + this.field4784[4] * arg1 + this.field4784[12]) * var4, (this.field4784[9] * arg2 + this.field4784[1] * arg0 + this.field4784[5] * arg1 + this.field4784[13]) * var4, (this.field4784[10] * arg2 + this.field4784[6] * arg1 + this.field4784[2] * arg0 + this.field4784[14]) * var4);
    }

    @ObfuscatedName("qs.ax(FFFB)F")
    public float method7633(float arg0, float arg1, float arg2) {
        return this.field4784[8] * arg2 + this.field4784[0] * arg0 + this.field4784[4] * arg1 + this.field4784[12];
    }

    @ObfuscatedName("qs.aq(FFFI)F")
    public float method7634(float arg0, float arg1, float arg2) {
        return this.field4784[9] * arg2 + this.field4784[5] * arg1 + this.field4784[1] * arg0 + this.field4784[13];
    }

    @ObfuscatedName("qs.al(FFFB)F")
    public float method7671(float arg0, float arg1, float arg2) {
        return this.field4784[10] * arg2 + this.field4784[2] * arg0 + this.field4784[6] * arg1 + this.field4784[14];
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7618();
        this.method7638();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4784[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4784);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class429)) {
            return false;
        }
        class429 var2 = (class429) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4784[var3] != var2.field4784[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("qs.aa(I)[F")
    public float[] method7697() {
        float[] var1 = new float[3];
        class427 var2 = new class427(this.field4784[0], this.field4784[1], this.field4784[2]);
        class427 var3 = new class427(this.field4784[4], this.field4784[5], this.field4784[6]);
        class427 var4 = new class427(this.field4784[8], this.field4784[9], this.field4784[10]);
        var1[0] = var2.method7552();
        var1[1] = var3.method7552();
        var1[2] = var4.method7552();
        return var1;
    }
}
