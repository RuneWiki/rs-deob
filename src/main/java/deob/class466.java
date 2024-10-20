package deob;

import java.util.Arrays;

@ObfuscatedName("rb")
public final class class466 {

    @ObfuscatedName("rb.al")
    public static class466[] field4784 = new class466[0];

    @ObfuscatedName("rb.ao")
    public float[] field4786 = new float[16];

    @ObfuscatedName("rb.ah")
    public static final class466 field4783;

    static {
        method2028(100);
        field4783 = new class466();
    }

    @ObfuscatedName("cl.ac(II)V")
    public static void method2028(int arg0) {
        Statics.field4785 = arg0;
        field4784 = new class466[arg0];
        Statics.field4782 = 0;
    }

    @ObfuscatedName("ix.al(I)Lrb;")
    public static class466 method3619() {
        class466[] var0 = field4784;
        synchronized (field4784) {
            if (Statics.field4782 == 0) {
                return new class466();
            } else {
                field4784[--Statics.field4782].method7600();
                return field4784[Statics.field4782];
            }
        }
    }

    @ObfuscatedName("rb.ak(I)V")
    public void method7645() {
        class466[] var1 = field4784;
        synchronized (field4784) {
            if (Statics.field4782 < Statics.field4785 - 1) {
                field4784[++Statics.field4782 - 1] = this;
            }
        }
    }

    public class466() {
        this.method7600();
    }

    public class466(class466 arg0) {
        this.method7602(arg0);
    }

    public class466(class530 arg0, boolean arg1) {
        this.method7596(arg0, arg1);
    }

    @ObfuscatedName("rb.ax(Lul;ZI)V")
    public void method7596(class530 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4786[var4] = arg0.method8373();
            }
            return;
        }
        class467 var3 = new class467();
        var3.method7664(class480.method2971(arg0.method8368()));
        var3.method7659(class480.method2971(arg0.method8368()));
        var3.method7660(class480.method2971(arg0.method8368()));
        var3.method7661((float) arg0.method8368(), (float) arg0.method8368(), (float) arg0.method8368());
        this.method7607(var3);
    }

    @ObfuscatedName("rb.ao(I)[F")
    public float[] method7648() {
        float[] var1 = new float[3];
        if ((double) this.field4786[2] < 0.999D && (double) this.field4786[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4786[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4786[6] / var2, (double) this.field4786[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4786[1] / var2, (double) this.field4786[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4786[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4786[9]), (double) this.field4786[5]);
        }
        return var1;
    }

    @ObfuscatedName("rb.ah(B)[F")
    public float[] method7599() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4786[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4786[2];
            double var6 = (double) this.field4786[10];
            double var8 = (double) this.field4786[4];
            double var10 = (double) this.field4786[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4786[1];
            double var14 = (double) this.field4786[0];
            if (this.field4786[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("rb.ar(I)V")
    public void method7600() {
        this.field4786[0] = 1.0F;
        this.field4786[1] = 0.0F;
        this.field4786[2] = 0.0F;
        this.field4786[3] = 0.0F;
        this.field4786[4] = 0.0F;
        this.field4786[5] = 1.0F;
        this.field4786[6] = 0.0F;
        this.field4786[7] = 0.0F;
        this.field4786[8] = 0.0F;
        this.field4786[9] = 0.0F;
        this.field4786[10] = 1.0F;
        this.field4786[11] = 0.0F;
        this.field4786[12] = 0.0F;
        this.field4786[13] = 0.0F;
        this.field4786[14] = 0.0F;
        this.field4786[15] = 1.0F;
    }

    @ObfuscatedName("rb.ab(I)V")
    public void method7601() {
        this.field4786[0] = 0.0F;
        this.field4786[1] = 0.0F;
        this.field4786[2] = 0.0F;
        this.field4786[3] = 0.0F;
        this.field4786[4] = 0.0F;
        this.field4786[5] = 0.0F;
        this.field4786[6] = 0.0F;
        this.field4786[7] = 0.0F;
        this.field4786[8] = 0.0F;
        this.field4786[9] = 0.0F;
        this.field4786[10] = 0.0F;
        this.field4786[11] = 0.0F;
        this.field4786[12] = 0.0F;
        this.field4786[13] = 0.0F;
        this.field4786[14] = 0.0F;
        this.field4786[15] = 0.0F;
    }

    @ObfuscatedName("rb.am(Lrb;I)V")
    public void method7602(class466 arg0) {
        System.arraycopy(arg0.field4786, 0, this.field4786, 0, 16);
    }

    @ObfuscatedName("rb.av(FI)V")
    public void method7603(float arg0) {
        this.method7626(arg0, arg0, arg0);
    }

    @ObfuscatedName("rb.ag(FFFI)V")
    public void method7626(float arg0, float arg1, float arg2) {
        this.method7600();
        this.field4786[0] = arg0;
        this.field4786[5] = arg1;
        this.field4786[10] = arg2;
    }

    @ObfuscatedName("rb.aa(Lrb;B)V")
    public void method7627(class466 arg0) {
        for (int var2 = 0; var2 < this.field4786.length; var2++) {
            this.field4786[var2] += arg0.field4786[var2];
        }
    }

    @ObfuscatedName("rb.ap(Lrb;B)V")
    public void method7605(class466 arg0) {
        float var2 = this.field4786[3] * arg0.field4786[12] + this.field4786[2] * arg0.field4786[8] + this.field4786[0] * arg0.field4786[0] + this.field4786[1] * arg0.field4786[4];
        float var3 = this.field4786[3] * arg0.field4786[13] + this.field4786[2] * arg0.field4786[9] + this.field4786[1] * arg0.field4786[5] + this.field4786[0] * arg0.field4786[1];
        float var4 = this.field4786[3] * arg0.field4786[14] + this.field4786[2] * arg0.field4786[10] + this.field4786[1] * arg0.field4786[6] + this.field4786[0] * arg0.field4786[2];
        float var5 = this.field4786[3] * arg0.field4786[15] + this.field4786[2] * arg0.field4786[11] + this.field4786[0] * arg0.field4786[3] + this.field4786[1] * arg0.field4786[7];
        float var6 = this.field4786[7] * arg0.field4786[12] + this.field4786[6] * arg0.field4786[8] + this.field4786[4] * arg0.field4786[0] + this.field4786[5] * arg0.field4786[4];
        float var7 = this.field4786[7] * arg0.field4786[13] + this.field4786[6] * arg0.field4786[9] + this.field4786[4] * arg0.field4786[1] + this.field4786[5] * arg0.field4786[5];
        float var8 = this.field4786[7] * arg0.field4786[14] + this.field4786[6] * arg0.field4786[10] + this.field4786[4] * arg0.field4786[2] + this.field4786[5] * arg0.field4786[6];
        float var9 = this.field4786[7] * arg0.field4786[15] + this.field4786[6] * arg0.field4786[11] + this.field4786[5] * arg0.field4786[7] + this.field4786[4] * arg0.field4786[3];
        float var10 = this.field4786[11] * arg0.field4786[12] + this.field4786[10] * arg0.field4786[8] + this.field4786[8] * arg0.field4786[0] + this.field4786[9] * arg0.field4786[4];
        float var11 = this.field4786[11] * arg0.field4786[13] + this.field4786[10] * arg0.field4786[9] + this.field4786[8] * arg0.field4786[1] + this.field4786[9] * arg0.field4786[5];
        float var12 = this.field4786[11] * arg0.field4786[14] + this.field4786[10] * arg0.field4786[10] + this.field4786[9] * arg0.field4786[6] + this.field4786[8] * arg0.field4786[2];
        float var13 = this.field4786[11] * arg0.field4786[15] + this.field4786[10] * arg0.field4786[11] + this.field4786[8] * arg0.field4786[3] + this.field4786[9] * arg0.field4786[7];
        float var14 = this.field4786[15] * arg0.field4786[12] + this.field4786[14] * arg0.field4786[8] + this.field4786[13] * arg0.field4786[4] + this.field4786[12] * arg0.field4786[0];
        float var15 = this.field4786[15] * arg0.field4786[13] + this.field4786[14] * arg0.field4786[9] + this.field4786[13] * arg0.field4786[5] + this.field4786[12] * arg0.field4786[1];
        float var16 = this.field4786[15] * arg0.field4786[14] + this.field4786[14] * arg0.field4786[10] + this.field4786[13] * arg0.field4786[6] + this.field4786[12] * arg0.field4786[2];
        float var17 = this.field4786[15] * arg0.field4786[15] + this.field4786[14] * arg0.field4786[11] + this.field4786[12] * arg0.field4786[3] + this.field4786[13] * arg0.field4786[7];
        this.field4786[0] = var2;
        this.field4786[1] = var3;
        this.field4786[2] = var4;
        this.field4786[3] = var5;
        this.field4786[4] = var6;
        this.field4786[5] = var7;
        this.field4786[6] = var8;
        this.field4786[7] = var9;
        this.field4786[8] = var10;
        this.field4786[9] = var11;
        this.field4786[10] = var12;
        this.field4786[11] = var13;
        this.field4786[12] = var14;
        this.field4786[13] = var15;
        this.field4786[14] = var16;
        this.field4786[15] = var17;
    }

    @ObfuscatedName("rb.ay(Lrd;I)V")
    public void method7614(class465 arg0) {
        float var2 = arg0.field4781 * arg0.field4781;
        float var3 = arg0.field4781 * arg0.field4778;
        float var4 = arg0.field4781 * arg0.field4779;
        float var5 = arg0.field4781 * arg0.field4780;
        float var6 = arg0.field4778 * arg0.field4778;
        float var7 = arg0.field4779 * arg0.field4778;
        float var8 = arg0.field4780 * arg0.field4778;
        float var9 = arg0.field4779 * arg0.field4779;
        float var10 = arg0.field4780 * arg0.field4779;
        float var11 = arg0.field4780 * arg0.field4780;
        this.field4786[0] = var2 + var6 - var11 - var9;
        this.field4786[1] = var5 + var7 + var7 + var5;
        this.field4786[2] = var8 - var4 - var4 + var8;
        this.field4786[4] = var7 - var5 - var5 + var7;
        this.field4786[5] = var2 + var9 - var6 - var11;
        this.field4786[6] = var3 + var10 + var10 + var3;
        this.field4786[8] = var4 + var8 + var8 + var4;
        this.field4786[9] = var10 - var3 - var3 + var10;
        this.field4786[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("rb.as(Lrz;B)V")
    public void method7607(class467 arg0) {
        this.field4786[0] = arg0.field4798;
        this.field4786[1] = arg0.field4791;
        this.field4786[2] = arg0.field4799;
        this.field4786[3] = 0.0F;
        this.field4786[4] = arg0.field4793;
        this.field4786[5] = arg0.field4794;
        this.field4786[6] = arg0.field4790;
        this.field4786[7] = 0.0F;
        this.field4786[8] = arg0.field4796;
        this.field4786[9] = arg0.field4797;
        this.field4786[10] = arg0.field4801;
        this.field4786[11] = 0.0F;
        this.field4786[12] = arg0.field4795;
        this.field4786[13] = arg0.field4800;
        this.field4786[14] = arg0.field4792;
        this.field4786[15] = 1.0F;
    }

    @ObfuscatedName("rb.aj(B)F")
    public float method7608() {
        return this.field4786[6] * this.field4786[3] * this.field4786[9] * this.field4786[12] + (this.field4786[5] * this.field4786[3] * this.field4786[8] * this.field4786[14] + this.field4786[4] * this.field4786[3] * this.field4786[10] * this.field4786[13] + (this.field4786[7] * this.field4786[2] * this.field4786[8] * this.field4786[13] + this.field4786[2] * this.field4786[5] * this.field4786[11] * this.field4786[12] + (this.field4786[2] * this.field4786[4] * this.field4786[9] * this.field4786[15] + this.field4786[7] * this.field4786[1] * this.field4786[10] * this.field4786[12] + (this.field4786[6] * this.field4786[1] * this.field4786[8] * this.field4786[15] + this.field4786[4] * this.field4786[1] * this.field4786[11] * this.field4786[14] + (this.field4786[0] * this.field4786[7] * this.field4786[9] * this.field4786[14] + this.field4786[0] * this.field4786[6] * this.field4786[11] * this.field4786[13] + (this.field4786[0] * this.field4786[5] * this.field4786[10] * this.field4786[15] - this.field4786[5] * this.field4786[0] * this.field4786[11] * this.field4786[14] - this.field4786[6] * this.field4786[0] * this.field4786[9] * this.field4786[15]) - this.field4786[7] * this.field4786[0] * this.field4786[10] * this.field4786[13] - this.field4786[4] * this.field4786[1] * this.field4786[10] * this.field4786[15]) - this.field4786[6] * this.field4786[1] * this.field4786[11] * this.field4786[12] - this.field4786[7] * this.field4786[1] * this.field4786[8] * this.field4786[14]) - this.field4786[2] * this.field4786[4] * this.field4786[11] * this.field4786[13] - this.field4786[5] * this.field4786[2] * this.field4786[8] * this.field4786[15]) - this.field4786[7] * this.field4786[2] * this.field4786[9] * this.field4786[12] - this.field4786[4] * this.field4786[3] * this.field4786[9] * this.field4786[14]) - this.field4786[3] * this.field4786[5] * this.field4786[10] * this.field4786[12] - this.field4786[3] * this.field4786[6] * this.field4786[8] * this.field4786[13]);
    }

    @ObfuscatedName("rb.an(I)V")
    public void method7609() {
        float var1 = 1.0F / this.method7608();
        float var2 = (this.field4786[7] * this.field4786[9] * this.field4786[14] + this.field4786[6] * this.field4786[11] * this.field4786[13] + (this.field4786[10] * this.field4786[5] * this.field4786[15] - this.field4786[11] * this.field4786[5] * this.field4786[14] - this.field4786[6] * this.field4786[9] * this.field4786[15]) - this.field4786[10] * this.field4786[7] * this.field4786[13]) * var1;
        float var3 = (this.field4786[10] * this.field4786[3] * this.field4786[13] + (this.field4786[2] * this.field4786[9] * this.field4786[15] + this.field4786[1] * this.field4786[11] * this.field4786[14] + this.field4786[10] * -this.field4786[1] * this.field4786[15] - this.field4786[11] * this.field4786[2] * this.field4786[13] - this.field4786[3] * this.field4786[9] * this.field4786[14])) * var1;
        float var4 = (this.field4786[3] * this.field4786[5] * this.field4786[14] + this.field4786[7] * this.field4786[2] * this.field4786[13] + (this.field4786[1] * this.field4786[6] * this.field4786[15] - this.field4786[7] * this.field4786[1] * this.field4786[14] - this.field4786[2] * this.field4786[5] * this.field4786[15]) - this.field4786[3] * this.field4786[6] * this.field4786[13]) * var1;
        float var5 = (this.field4786[3] * this.field4786[6] * this.field4786[9] + (this.field4786[2] * this.field4786[5] * this.field4786[11] + this.field4786[6] * -this.field4786[1] * this.field4786[11] + this.field4786[1] * this.field4786[7] * this.field4786[10] - this.field4786[7] * this.field4786[2] * this.field4786[9] - this.field4786[3] * this.field4786[5] * this.field4786[10])) * var1;
        float var6 = (this.field4786[10] * this.field4786[7] * this.field4786[12] + (this.field4786[6] * this.field4786[8] * this.field4786[15] + this.field4786[11] * this.field4786[4] * this.field4786[14] + this.field4786[10] * -this.field4786[4] * this.field4786[15] - this.field4786[6] * this.field4786[11] * this.field4786[12] - this.field4786[8] * this.field4786[7] * this.field4786[14])) * var1;
        float var7 = (this.field4786[8] * this.field4786[3] * this.field4786[14] + this.field4786[2] * this.field4786[11] * this.field4786[12] + (this.field4786[10] * this.field4786[0] * this.field4786[15] - this.field4786[0] * this.field4786[11] * this.field4786[14] - this.field4786[2] * this.field4786[8] * this.field4786[15]) - this.field4786[10] * this.field4786[3] * this.field4786[12]) * var1;
        float var8 = (this.field4786[3] * this.field4786[6] * this.field4786[12] + (this.field4786[2] * this.field4786[4] * this.field4786[15] + this.field4786[6] * -this.field4786[0] * this.field4786[15] + this.field4786[7] * this.field4786[0] * this.field4786[14] - this.field4786[7] * this.field4786[2] * this.field4786[12] - this.field4786[3] * this.field4786[4] * this.field4786[14])) * var1;
        float var9 = (this.field4786[3] * this.field4786[4] * this.field4786[10] + this.field4786[7] * this.field4786[2] * this.field4786[8] + (this.field4786[6] * this.field4786[0] * this.field4786[11] - this.field4786[7] * this.field4786[0] * this.field4786[10] - this.field4786[2] * this.field4786[4] * this.field4786[11]) - this.field4786[3] * this.field4786[6] * this.field4786[8]) * var1;
        float var10 = (this.field4786[8] * this.field4786[7] * this.field4786[13] + this.field4786[5] * this.field4786[11] * this.field4786[12] + (this.field4786[4] * this.field4786[9] * this.field4786[15] - this.field4786[4] * this.field4786[11] * this.field4786[13] - this.field4786[5] * this.field4786[8] * this.field4786[15]) - this.field4786[7] * this.field4786[9] * this.field4786[12]) * var1;
        float var11 = (this.field4786[9] * this.field4786[3] * this.field4786[12] + (this.field4786[1] * this.field4786[8] * this.field4786[15] + this.field4786[9] * -this.field4786[0] * this.field4786[15] + this.field4786[0] * this.field4786[11] * this.field4786[13] - this.field4786[11] * this.field4786[1] * this.field4786[12] - this.field4786[3] * this.field4786[8] * this.field4786[13])) * var1;
        float var12 = (this.field4786[4] * this.field4786[3] * this.field4786[13] + this.field4786[7] * this.field4786[1] * this.field4786[12] + (this.field4786[0] * this.field4786[5] * this.field4786[15] - this.field4786[0] * this.field4786[7] * this.field4786[13] - this.field4786[4] * this.field4786[1] * this.field4786[15]) - this.field4786[5] * this.field4786[3] * this.field4786[12]) * var1;
        float var13 = (this.field4786[5] * this.field4786[3] * this.field4786[8] + (this.field4786[4] * this.field4786[1] * this.field4786[11] + this.field4786[7] * this.field4786[0] * this.field4786[9] + this.field4786[5] * -this.field4786[0] * this.field4786[11] - this.field4786[7] * this.field4786[1] * this.field4786[8] - this.field4786[4] * this.field4786[3] * this.field4786[9])) * var1;
        float var14 = (this.field4786[6] * this.field4786[9] * this.field4786[12] + (this.field4786[8] * this.field4786[5] * this.field4786[14] + this.field4786[4] * this.field4786[10] * this.field4786[13] + this.field4786[9] * -this.field4786[4] * this.field4786[14] - this.field4786[10] * this.field4786[5] * this.field4786[12] - this.field4786[6] * this.field4786[8] * this.field4786[13])) * var1;
        float var15 = (this.field4786[8] * this.field4786[2] * this.field4786[13] + this.field4786[10] * this.field4786[1] * this.field4786[12] + (this.field4786[9] * this.field4786[0] * this.field4786[14] - this.field4786[0] * this.field4786[10] * this.field4786[13] - this.field4786[1] * this.field4786[8] * this.field4786[14]) - this.field4786[2] * this.field4786[9] * this.field4786[12]) * var1;
        float var16 = (this.field4786[5] * this.field4786[2] * this.field4786[12] + (this.field4786[4] * this.field4786[1] * this.field4786[14] + this.field4786[5] * -this.field4786[0] * this.field4786[14] + this.field4786[0] * this.field4786[6] * this.field4786[13] - this.field4786[1] * this.field4786[6] * this.field4786[12] - this.field4786[2] * this.field4786[4] * this.field4786[13])) * var1;
        float var17 = (this.field4786[4] * this.field4786[2] * this.field4786[9] + this.field4786[1] * this.field4786[6] * this.field4786[8] + (this.field4786[5] * this.field4786[0] * this.field4786[10] - this.field4786[0] * this.field4786[6] * this.field4786[9] - this.field4786[4] * this.field4786[1] * this.field4786[10]) - this.field4786[5] * this.field4786[2] * this.field4786[8]) * var1;
        this.field4786[0] = var2;
        this.field4786[1] = var3;
        this.field4786[2] = var4;
        this.field4786[3] = var5;
        this.field4786[4] = var6;
        this.field4786[5] = var7;
        this.field4786[6] = var8;
        this.field4786[7] = var9;
        this.field4786[8] = var10;
        this.field4786[9] = var11;
        this.field4786[10] = var12;
        this.field4786[11] = var13;
        this.field4786[12] = var14;
        this.field4786[13] = var15;
        this.field4786[14] = var16;
        this.field4786[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7599();
        this.method7648();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4786[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4786);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class466)) {
            return false;
        }
        class466 var2 = (class466) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4786[var3] != var2.field4786[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("rb.au(I)[F")
    public float[] method7594() {
        float[] var1 = new float[3];
        class464 var2 = new class464(this.field4786[0], this.field4786[1], this.field4786[2]);
        class464 var3 = new class464(this.field4786[4], this.field4786[5], this.field4786[6]);
        class464 var4 = new class464(this.field4786[8], this.field4786[9], this.field4786[10]);
        var1[0] = var2.method7555();
        var1[1] = var3.method7555();
        var1[2] = var4.method7555();
        return var1;
    }
}
