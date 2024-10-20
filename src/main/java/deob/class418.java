package deob;

import java.util.Arrays;

@ObfuscatedName("pb")
public final class class418 {

    @ObfuscatedName("pb.f")
    public static final class418 field4647;

    @ObfuscatedName("pb.v")
    public static class418[] field4642 = new class418[0];

    @ObfuscatedName("pb.s")
    public static int field4643 = 100;

    @ObfuscatedName("pb.z")
    public static int field4644;

    @ObfuscatedName("pb.j")
    public float[] field4645 = new float[16];

    static {
        field4642 = new class418[100];
        field4644 = 0;
        field4647 = new class418();
    }

    @ObfuscatedName("pb.f(B)V")
    public void method7280() {
        class418[] var1 = field4642;
        synchronized (field4642) {
            if (field4644 < field4643 - 1) {
                field4642[++field4644 - 1] = this;
            }
        }
    }

    public class418() {
        this.method7336();
    }

    public class418(class418 arg0) {
        this.method7287(arg0);
    }

    public class418(class474 arg0, boolean arg1) {
        this.method7305(arg0, arg1);
    }

    @ObfuscatedName("pb.w(Lrd;ZI)V")
    public void method7305(class474 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4645[var16] = arg0.method8084();
            }
            return;
        }
        class419 var3 = new class419();
        int var5 = arg0.method7967();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7340(var7);
        int var9 = arg0.method7967();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7352(var11);
        int var13 = arg0.method7967();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7341(var15);
        var3.method7342((float) arg0.method7967(), (float) arg0.method7967(), (float) arg0.method7967());
        this.method7292(var3);
    }

    @ObfuscatedName("pb.v(I)[F")
    public float[] method7283() {
        float[] var1 = new float[3];
        if ((double) this.field4645[2] < 0.999D && (double) this.field4645[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4645[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4645[6] / var2, (double) this.field4645[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4645[1] / var2, (double) this.field4645[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4645[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4645[9]), (double) this.field4645[5]);
        }
        return var1;
    }

    @ObfuscatedName("pb.s(I)[F")
    public float[] method7284() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4645[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4645[2];
            double var6 = (double) this.field4645[10];
            double var8 = (double) this.field4645[4];
            double var10 = (double) this.field4645[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4645[1];
            double var14 = (double) this.field4645[0];
            if (this.field4645[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("pb.z(B)V")
    public void method7336() {
        this.field4645[0] = 1.0F;
        this.field4645[1] = 0.0F;
        this.field4645[2] = 0.0F;
        this.field4645[3] = 0.0F;
        this.field4645[4] = 0.0F;
        this.field4645[5] = 1.0F;
        this.field4645[6] = 0.0F;
        this.field4645[7] = 0.0F;
        this.field4645[8] = 0.0F;
        this.field4645[9] = 0.0F;
        this.field4645[10] = 1.0F;
        this.field4645[11] = 0.0F;
        this.field4645[12] = 0.0F;
        this.field4645[13] = 0.0F;
        this.field4645[14] = 0.0F;
        this.field4645[15] = 1.0F;
    }

    @ObfuscatedName("pb.j(I)V")
    public void method7327() {
        this.field4645[0] = 0.0F;
        this.field4645[1] = 0.0F;
        this.field4645[2] = 0.0F;
        this.field4645[3] = 0.0F;
        this.field4645[4] = 0.0F;
        this.field4645[5] = 0.0F;
        this.field4645[6] = 0.0F;
        this.field4645[7] = 0.0F;
        this.field4645[8] = 0.0F;
        this.field4645[9] = 0.0F;
        this.field4645[10] = 0.0F;
        this.field4645[11] = 0.0F;
        this.field4645[12] = 0.0F;
        this.field4645[13] = 0.0F;
        this.field4645[14] = 0.0F;
        this.field4645[15] = 0.0F;
    }

    @ObfuscatedName("pb.i(Lpb;I)V")
    public void method7287(class418 arg0) {
        System.arraycopy(arg0.field4645, 0, this.field4645, 0, 16);
    }

    @ObfuscatedName("pb.n(FI)V")
    public void method7308(float arg0) {
        this.method7295(arg0, arg0, arg0);
    }

    @ObfuscatedName("pb.l(FFFB)V")
    public void method7295(float arg0, float arg1, float arg2) {
        this.method7336();
        this.field4645[0] = arg0;
        this.field4645[5] = arg1;
        this.field4645[10] = arg2;
    }

    @ObfuscatedName("pb.k(Lpb;B)V")
    public void method7289(class418 arg0) {
        for (int var2 = 0; var2 < this.field4645.length; var2++) {
            this.field4645[var2] += arg0.field4645[var2];
        }
    }

    @ObfuscatedName("pb.c(Lpb;I)V")
    public void method7286(class418 arg0) {
        float var2 = this.field4645[3] * arg0.field4645[12] + this.field4645[2] * arg0.field4645[8] + this.field4645[0] * arg0.field4645[0] + this.field4645[1] * arg0.field4645[4];
        float var3 = this.field4645[3] * arg0.field4645[13] + this.field4645[2] * arg0.field4645[9] + this.field4645[1] * arg0.field4645[5] + this.field4645[0] * arg0.field4645[1];
        float var4 = this.field4645[3] * arg0.field4645[14] + this.field4645[2] * arg0.field4645[10] + this.field4645[0] * arg0.field4645[2] + this.field4645[1] * arg0.field4645[6];
        float var5 = this.field4645[3] * arg0.field4645[15] + this.field4645[2] * arg0.field4645[11] + this.field4645[0] * arg0.field4645[3] + this.field4645[1] * arg0.field4645[7];
        float var6 = this.field4645[7] * arg0.field4645[12] + this.field4645[6] * arg0.field4645[8] + this.field4645[4] * arg0.field4645[0] + this.field4645[5] * arg0.field4645[4];
        float var7 = this.field4645[7] * arg0.field4645[13] + this.field4645[6] * arg0.field4645[9] + this.field4645[5] * arg0.field4645[5] + this.field4645[4] * arg0.field4645[1];
        float var8 = this.field4645[7] * arg0.field4645[14] + this.field4645[6] * arg0.field4645[10] + this.field4645[5] * arg0.field4645[6] + this.field4645[4] * arg0.field4645[2];
        float var9 = this.field4645[7] * arg0.field4645[15] + this.field4645[6] * arg0.field4645[11] + this.field4645[5] * arg0.field4645[7] + this.field4645[4] * arg0.field4645[3];
        float var10 = this.field4645[11] * arg0.field4645[12] + this.field4645[10] * arg0.field4645[8] + this.field4645[9] * arg0.field4645[4] + this.field4645[8] * arg0.field4645[0];
        float var11 = this.field4645[11] * arg0.field4645[13] + this.field4645[10] * arg0.field4645[9] + this.field4645[9] * arg0.field4645[5] + this.field4645[8] * arg0.field4645[1];
        float var12 = this.field4645[11] * arg0.field4645[14] + this.field4645[10] * arg0.field4645[10] + this.field4645[9] * arg0.field4645[6] + this.field4645[8] * arg0.field4645[2];
        float var13 = this.field4645[11] * arg0.field4645[15] + this.field4645[10] * arg0.field4645[11] + this.field4645[8] * arg0.field4645[3] + this.field4645[9] * arg0.field4645[7];
        float var14 = this.field4645[15] * arg0.field4645[12] + this.field4645[14] * arg0.field4645[8] + this.field4645[12] * arg0.field4645[0] + this.field4645[13] * arg0.field4645[4];
        float var15 = this.field4645[15] * arg0.field4645[13] + this.field4645[14] * arg0.field4645[9] + this.field4645[12] * arg0.field4645[1] + this.field4645[13] * arg0.field4645[5];
        float var16 = this.field4645[15] * arg0.field4645[14] + this.field4645[14] * arg0.field4645[10] + this.field4645[12] * arg0.field4645[2] + this.field4645[13] * arg0.field4645[6];
        float var17 = this.field4645[15] * arg0.field4645[15] + this.field4645[14] * arg0.field4645[11] + this.field4645[13] * arg0.field4645[7] + this.field4645[12] * arg0.field4645[3];
        this.field4645[0] = var2;
        this.field4645[1] = var3;
        this.field4645[2] = var4;
        this.field4645[3] = var5;
        this.field4645[4] = var6;
        this.field4645[5] = var7;
        this.field4645[6] = var8;
        this.field4645[7] = var9;
        this.field4645[8] = var10;
        this.field4645[9] = var11;
        this.field4645[10] = var12;
        this.field4645[11] = var13;
        this.field4645[12] = var14;
        this.field4645[13] = var15;
        this.field4645[14] = var16;
        this.field4645[15] = var17;
    }

    @ObfuscatedName("pb.r(Lpl;I)V")
    public void method7291(class417 arg0) {
        float var2 = arg0.field4640 * arg0.field4640;
        float var3 = arg0.field4640 * arg0.field4637;
        float var4 = arg0.field4640 * arg0.field4638;
        float var5 = arg0.field4640 * arg0.field4639;
        float var6 = arg0.field4637 * arg0.field4637;
        float var7 = arg0.field4638 * arg0.field4637;
        float var8 = arg0.field4639 * arg0.field4637;
        float var9 = arg0.field4638 * arg0.field4638;
        float var10 = arg0.field4639 * arg0.field4638;
        float var11 = arg0.field4639 * arg0.field4639;
        this.field4645[0] = var2 + var6 - var11 - var9;
        this.field4645[1] = var5 + var7 + var7 + var5;
        this.field4645[2] = var8 - var4 - var4 + var8;
        this.field4645[4] = var7 - var5 - var5 + var7;
        this.field4645[5] = var2 + var9 - var6 - var11;
        this.field4645[6] = var3 + var10 + var10 + var3;
        this.field4645[8] = var4 + var8 + var8 + var4;
        this.field4645[9] = var10 - var3 - var3 + var10;
        this.field4645[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("pb.b(Lpn;I)V")
    public void method7292(class419 arg0) {
        this.field4645[0] = arg0.field4653;
        this.field4645[1] = arg0.field4649;
        this.field4645[2] = arg0.field4650;
        this.field4645[3] = 0.0F;
        this.field4645[4] = arg0.field4651;
        this.field4645[5] = arg0.field4652;
        this.field4645[6] = arg0.field4654;
        this.field4645[7] = 0.0F;
        this.field4645[8] = arg0.field4655;
        this.field4645[9] = arg0.field4656;
        this.field4645[10] = arg0.field4659;
        this.field4645[11] = 0.0F;
        this.field4645[12] = arg0.field4657;
        this.field4645[13] = arg0.field4658;
        this.field4645[14] = arg0.field4648;
        this.field4645[15] = 1.0F;
    }

    @ObfuscatedName("pb.m(I)F")
    public float method7293() {
        return this.field4645[6] * this.field4645[3] * this.field4645[9] * this.field4645[12] + (this.field4645[5] * this.field4645[3] * this.field4645[8] * this.field4645[14] + this.field4645[3] * this.field4645[4] * this.field4645[10] * this.field4645[13] + (this.field4645[2] * this.field4645[7] * this.field4645[8] * this.field4645[13] + this.field4645[5] * this.field4645[2] * this.field4645[11] * this.field4645[12] + (this.field4645[2] * this.field4645[4] * this.field4645[9] * this.field4645[15] + this.field4645[7] * this.field4645[1] * this.field4645[10] * this.field4645[12] + (this.field4645[1] * this.field4645[6] * this.field4645[8] * this.field4645[15] + this.field4645[1] * this.field4645[4] * this.field4645[11] * this.field4645[14] + (this.field4645[0] * this.field4645[7] * this.field4645[9] * this.field4645[14] + this.field4645[6] * this.field4645[0] * this.field4645[11] * this.field4645[13] + (this.field4645[5] * this.field4645[0] * this.field4645[10] * this.field4645[15] - this.field4645[5] * this.field4645[0] * this.field4645[11] * this.field4645[14] - this.field4645[0] * this.field4645[6] * this.field4645[9] * this.field4645[15]) - this.field4645[0] * this.field4645[7] * this.field4645[10] * this.field4645[13] - this.field4645[1] * this.field4645[4] * this.field4645[10] * this.field4645[15]) - this.field4645[6] * this.field4645[1] * this.field4645[11] * this.field4645[12] - this.field4645[1] * this.field4645[7] * this.field4645[8] * this.field4645[14]) - this.field4645[4] * this.field4645[2] * this.field4645[11] * this.field4645[13] - this.field4645[2] * this.field4645[5] * this.field4645[8] * this.field4645[15]) - this.field4645[7] * this.field4645[2] * this.field4645[9] * this.field4645[12] - this.field4645[4] * this.field4645[3] * this.field4645[9] * this.field4645[14]) - this.field4645[3] * this.field4645[5] * this.field4645[10] * this.field4645[12] - this.field4645[3] * this.field4645[6] * this.field4645[8] * this.field4645[13]);
    }

    @ObfuscatedName("pb.t(I)V")
    public void method7294() {
        float var1 = 1.0F / this.method7293();
        float var2 = (this.field4645[9] * this.field4645[7] * this.field4645[14] + this.field4645[6] * this.field4645[11] * this.field4645[13] + (this.field4645[10] * this.field4645[5] * this.field4645[15] - this.field4645[11] * this.field4645[5] * this.field4645[14] - this.field4645[6] * this.field4645[9] * this.field4645[15]) - this.field4645[10] * this.field4645[7] * this.field4645[13]) * var1;
        float var3 = (this.field4645[10] * this.field4645[3] * this.field4645[13] + (this.field4645[9] * this.field4645[2] * this.field4645[15] + this.field4645[10] * -this.field4645[1] * this.field4645[15] + this.field4645[11] * this.field4645[1] * this.field4645[14] - this.field4645[11] * this.field4645[2] * this.field4645[13] - this.field4645[3] * this.field4645[9] * this.field4645[14])) * var1;
        float var4 = (this.field4645[5] * this.field4645[3] * this.field4645[14] + this.field4645[2] * this.field4645[7] * this.field4645[13] + (this.field4645[1] * this.field4645[6] * this.field4645[15] - this.field4645[7] * this.field4645[1] * this.field4645[14] - this.field4645[2] * this.field4645[5] * this.field4645[15]) - this.field4645[6] * this.field4645[3] * this.field4645[13]) * var1;
        float var5 = (this.field4645[6] * this.field4645[3] * this.field4645[9] + (this.field4645[2] * this.field4645[5] * this.field4645[11] + this.field4645[1] * this.field4645[7] * this.field4645[10] + this.field4645[6] * -this.field4645[1] * this.field4645[11] - this.field4645[7] * this.field4645[2] * this.field4645[9] - this.field4645[3] * this.field4645[5] * this.field4645[10])) * var1;
        float var6 = (this.field4645[10] * this.field4645[7] * this.field4645[12] + (this.field4645[6] * this.field4645[8] * this.field4645[15] + this.field4645[10] * -this.field4645[4] * this.field4645[15] + this.field4645[4] * this.field4645[11] * this.field4645[14] - this.field4645[11] * this.field4645[6] * this.field4645[12] - this.field4645[7] * this.field4645[8] * this.field4645[14])) * var1;
        float var7 = (this.field4645[8] * this.field4645[3] * this.field4645[14] + this.field4645[2] * this.field4645[11] * this.field4645[12] + (this.field4645[10] * this.field4645[0] * this.field4645[15] - this.field4645[0] * this.field4645[11] * this.field4645[14] - this.field4645[8] * this.field4645[2] * this.field4645[15]) - this.field4645[3] * this.field4645[10] * this.field4645[12]) * var1;
        float var8 = (this.field4645[3] * this.field4645[6] * this.field4645[12] + (this.field4645[2] * this.field4645[4] * this.field4645[15] + this.field4645[6] * -this.field4645[0] * this.field4645[15] + this.field4645[7] * this.field4645[0] * this.field4645[14] - this.field4645[7] * this.field4645[2] * this.field4645[12] - this.field4645[3] * this.field4645[4] * this.field4645[14])) * var1;
        float var9 = (this.field4645[4] * this.field4645[3] * this.field4645[10] + this.field4645[2] * this.field4645[7] * this.field4645[8] + (this.field4645[0] * this.field4645[6] * this.field4645[11] - this.field4645[7] * this.field4645[0] * this.field4645[10] - this.field4645[4] * this.field4645[2] * this.field4645[11]) - this.field4645[3] * this.field4645[6] * this.field4645[8]) * var1;
        float var10 = (this.field4645[7] * this.field4645[8] * this.field4645[13] + this.field4645[11] * this.field4645[5] * this.field4645[12] + (this.field4645[9] * this.field4645[4] * this.field4645[15] - this.field4645[4] * this.field4645[11] * this.field4645[13] - this.field4645[5] * this.field4645[8] * this.field4645[15]) - this.field4645[7] * this.field4645[9] * this.field4645[12]) * var1;
        float var11 = (this.field4645[3] * this.field4645[9] * this.field4645[12] + (this.field4645[8] * this.field4645[1] * this.field4645[15] + this.field4645[9] * -this.field4645[0] * this.field4645[15] + this.field4645[11] * this.field4645[0] * this.field4645[13] - this.field4645[1] * this.field4645[11] * this.field4645[12] - this.field4645[3] * this.field4645[8] * this.field4645[13])) * var1;
        float var12 = (this.field4645[4] * this.field4645[3] * this.field4645[13] + this.field4645[1] * this.field4645[7] * this.field4645[12] + (this.field4645[5] * this.field4645[0] * this.field4645[15] - this.field4645[0] * this.field4645[7] * this.field4645[13] - this.field4645[1] * this.field4645[4] * this.field4645[15]) - this.field4645[5] * this.field4645[3] * this.field4645[12]) * var1;
        float var13 = (this.field4645[3] * this.field4645[5] * this.field4645[8] + (this.field4645[4] * this.field4645[1] * this.field4645[11] + this.field4645[5] * -this.field4645[0] * this.field4645[11] + this.field4645[7] * this.field4645[0] * this.field4645[9] - this.field4645[1] * this.field4645[7] * this.field4645[8] - this.field4645[3] * this.field4645[4] * this.field4645[9])) * var1;
        float var14 = (this.field4645[9] * this.field4645[6] * this.field4645[12] + (this.field4645[8] * this.field4645[5] * this.field4645[14] + this.field4645[9] * -this.field4645[4] * this.field4645[14] + this.field4645[4] * this.field4645[10] * this.field4645[13] - this.field4645[10] * this.field4645[5] * this.field4645[12] - this.field4645[8] * this.field4645[6] * this.field4645[13])) * var1;
        float var15 = (this.field4645[2] * this.field4645[8] * this.field4645[13] + this.field4645[1] * this.field4645[10] * this.field4645[12] + (this.field4645[0] * this.field4645[9] * this.field4645[14] - this.field4645[0] * this.field4645[10] * this.field4645[13] - this.field4645[8] * this.field4645[1] * this.field4645[14]) - this.field4645[2] * this.field4645[9] * this.field4645[12]) * var1;
        float var16 = (this.field4645[2] * this.field4645[5] * this.field4645[12] + (this.field4645[1] * this.field4645[4] * this.field4645[14] + this.field4645[5] * -this.field4645[0] * this.field4645[14] + this.field4645[6] * this.field4645[0] * this.field4645[13] - this.field4645[6] * this.field4645[1] * this.field4645[12] - this.field4645[4] * this.field4645[2] * this.field4645[13])) * var1;
        float var17 = (this.field4645[2] * this.field4645[4] * this.field4645[9] + this.field4645[1] * this.field4645[6] * this.field4645[8] + (this.field4645[5] * this.field4645[0] * this.field4645[10] - this.field4645[0] * this.field4645[6] * this.field4645[9] - this.field4645[4] * this.field4645[1] * this.field4645[10]) - this.field4645[2] * this.field4645[5] * this.field4645[8]) * var1;
        this.field4645[0] = var2;
        this.field4645[1] = var3;
        this.field4645[2] = var4;
        this.field4645[3] = var5;
        this.field4645[4] = var6;
        this.field4645[5] = var7;
        this.field4645[6] = var8;
        this.field4645[7] = var9;
        this.field4645[8] = var10;
        this.field4645[9] = var11;
        this.field4645[10] = var12;
        this.field4645[11] = var13;
        this.field4645[12] = var14;
        this.field4645[13] = var15;
        this.field4645[14] = var16;
        this.field4645[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7284();
        this.method7283();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4645[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4645);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class418)) {
            return false;
        }
        class418 var2 = (class418) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4645[var3] != var2.field4645[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("pb.h(I)[F")
    public float[] method7296() {
        float[] var1 = new float[3];
        class416 var2 = new class416(this.field4645[0], this.field4645[1], this.field4645[2]);
        class416 var3 = new class416(this.field4645[4], this.field4645[5], this.field4645[6]);
        class416 var4 = new class416(this.field4645[8], this.field4645[9], this.field4645[10]);
        var1[0] = var2.method7244();
        var1[1] = var3.method7244();
        var1[2] = var4.method7244();
        return var1;
    }
}
