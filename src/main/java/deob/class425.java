package deob;

import java.util.Arrays;

@ObfuscatedName("qg")
public final class class425 {

    @ObfuscatedName("qg.ad")
    public static class425[] field4705 = new class425[0];

    @ObfuscatedName("qg.ap")
    public float[] field4710 = new float[16];

    @ObfuscatedName("qg.an")
    public static final class425 field4708;

    static {
        method5179(100);
        field4708 = new class425();
    }

    @ObfuscatedName("lk.aq(II)V")
    public static void method5179(int arg0) {
        Statics.field4706 = arg0;
        field4705 = new class425[arg0];
        Statics.field4707 = 0;
    }

    @ObfuscatedName("gd.ad(I)Lqg;")
    public static class425 method3262() {
        class425[] var0 = field4705;
        synchronized (field4705) {
            if (Statics.field4707 == 0) {
                return new class425();
            } else {
                field4705[--Statics.field4707].method7134();
                return field4705[Statics.field4707];
            }
        }
    }

    @ObfuscatedName("qg.ag(I)V")
    public void method7146() {
        class425[] var1 = field4705;
        synchronized (field4705) {
            if (Statics.field4707 < Statics.field4706 - 1) {
                field4705[++Statics.field4707 - 1] = this;
            }
        }
    }

    public class425() {
        this.method7134();
    }

    public class425(class425 arg0) {
        this.method7154(arg0);
    }

    public class425(class547 arg0, boolean arg1) {
        this.method7122(arg0, arg1);
    }

    @ObfuscatedName("qg.ak(Lvp;ZI)V")
    public void method7122(class547 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4710[var16] = arg0.method8736();
            }
            return;
        }
        class426 var3 = new class426();
        int var5 = arg0.method8731();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7206(var7);
        int var9 = arg0.method8731();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7216(var11);
        int var13 = arg0.method8731();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7208(var15);
        var3.method7209((float) arg0.method8731(), (float) arg0.method8731(), (float) arg0.method8731());
        this.method7133(var3);
    }

    @ObfuscatedName("qg.ap(I)[F")
    public float[] method7123() {
        float[] var1 = new float[3];
        if ((double) this.field4710[2] < 0.999D && (double) this.field4710[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4710[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4710[6] / var2, (double) this.field4710[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4710[1] / var2, (double) this.field4710[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4710[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4710[9]), (double) this.field4710[5]);
        }
        return var1;
    }

    @ObfuscatedName("qg.an(I)[F")
    public float[] method7124() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4710[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4710[2];
            double var6 = (double) this.field4710[10];
            double var8 = (double) this.field4710[4];
            double var10 = (double) this.field4710[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4710[1];
            double var14 = (double) this.field4710[0];
            if (this.field4710[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("qg.aj(I)V")
    public void method7134() {
        this.field4710[0] = 1.0F;
        this.field4710[1] = 0.0F;
        this.field4710[2] = 0.0F;
        this.field4710[3] = 0.0F;
        this.field4710[4] = 0.0F;
        this.field4710[5] = 1.0F;
        this.field4710[6] = 0.0F;
        this.field4710[7] = 0.0F;
        this.field4710[8] = 0.0F;
        this.field4710[9] = 0.0F;
        this.field4710[10] = 1.0F;
        this.field4710[11] = 0.0F;
        this.field4710[12] = 0.0F;
        this.field4710[13] = 0.0F;
        this.field4710[14] = 0.0F;
        this.field4710[15] = 1.0F;
    }

    @ObfuscatedName("qg.av(I)V")
    public void method7126() {
        this.field4710[0] = 0.0F;
        this.field4710[1] = 0.0F;
        this.field4710[2] = 0.0F;
        this.field4710[3] = 0.0F;
        this.field4710[4] = 0.0F;
        this.field4710[5] = 0.0F;
        this.field4710[6] = 0.0F;
        this.field4710[7] = 0.0F;
        this.field4710[8] = 0.0F;
        this.field4710[9] = 0.0F;
        this.field4710[10] = 0.0F;
        this.field4710[11] = 0.0F;
        this.field4710[12] = 0.0F;
        this.field4710[13] = 0.0F;
        this.field4710[14] = 0.0F;
        this.field4710[15] = 0.0F;
    }

    @ObfuscatedName("qg.ab(Lqg;B)V")
    public void method7154(class425 arg0) {
        System.arraycopy(arg0.field4710, 0, this.field4710, 0, 16);
    }

    @ObfuscatedName("qg.ai(FB)V")
    public void method7128(float arg0) {
        this.method7149(arg0, arg0, arg0);
    }

    @ObfuscatedName("qg.ae(FFFB)V")
    public void method7149(float arg0, float arg1, float arg2) {
        this.method7134();
        this.field4710[0] = arg0;
        this.field4710[5] = arg1;
        this.field4710[10] = arg2;
    }

    @ObfuscatedName("qg.au(Lqg;I)V")
    public void method7127(class425 arg0) {
        for (int var2 = 0; var2 < this.field4710.length; var2++) {
            this.field4710[var2] += arg0.field4710[var2];
        }
    }

    @ObfuscatedName("qg.ah(Lqg;I)V")
    public void method7130(class425 arg0) {
        float var2 = this.field4710[3] * arg0.field4710[12] + this.field4710[2] * arg0.field4710[8] + this.field4710[0] * arg0.field4710[0] + this.field4710[1] * arg0.field4710[4];
        float var3 = this.field4710[3] * arg0.field4710[13] + this.field4710[2] * arg0.field4710[9] + this.field4710[1] * arg0.field4710[5] + this.field4710[0] * arg0.field4710[1];
        float var4 = this.field4710[3] * arg0.field4710[14] + this.field4710[2] * arg0.field4710[10] + this.field4710[0] * arg0.field4710[2] + this.field4710[1] * arg0.field4710[6];
        float var5 = this.field4710[3] * arg0.field4710[15] + this.field4710[2] * arg0.field4710[11] + this.field4710[0] * arg0.field4710[3] + this.field4710[1] * arg0.field4710[7];
        float var6 = this.field4710[7] * arg0.field4710[12] + this.field4710[6] * arg0.field4710[8] + this.field4710[4] * arg0.field4710[0] + this.field4710[5] * arg0.field4710[4];
        float var7 = this.field4710[7] * arg0.field4710[13] + this.field4710[6] * arg0.field4710[9] + this.field4710[5] * arg0.field4710[5] + this.field4710[4] * arg0.field4710[1];
        float var8 = this.field4710[7] * arg0.field4710[14] + this.field4710[6] * arg0.field4710[10] + this.field4710[5] * arg0.field4710[6] + this.field4710[4] * arg0.field4710[2];
        float var9 = this.field4710[7] * arg0.field4710[15] + this.field4710[6] * arg0.field4710[11] + this.field4710[5] * arg0.field4710[7] + this.field4710[4] * arg0.field4710[3];
        float var10 = this.field4710[11] * arg0.field4710[12] + this.field4710[10] * arg0.field4710[8] + this.field4710[8] * arg0.field4710[0] + this.field4710[9] * arg0.field4710[4];
        float var11 = this.field4710[11] * arg0.field4710[13] + this.field4710[10] * arg0.field4710[9] + this.field4710[8] * arg0.field4710[1] + this.field4710[9] * arg0.field4710[5];
        float var12 = this.field4710[11] * arg0.field4710[14] + this.field4710[10] * arg0.field4710[10] + this.field4710[9] * arg0.field4710[6] + this.field4710[8] * arg0.field4710[2];
        float var13 = this.field4710[11] * arg0.field4710[15] + this.field4710[10] * arg0.field4710[11] + this.field4710[9] * arg0.field4710[7] + this.field4710[8] * arg0.field4710[3];
        float var14 = this.field4710[15] * arg0.field4710[12] + this.field4710[14] * arg0.field4710[8] + this.field4710[12] * arg0.field4710[0] + this.field4710[13] * arg0.field4710[4];
        float var15 = this.field4710[15] * arg0.field4710[13] + this.field4710[14] * arg0.field4710[9] + this.field4710[12] * arg0.field4710[1] + this.field4710[13] * arg0.field4710[5];
        float var16 = this.field4710[15] * arg0.field4710[14] + this.field4710[14] * arg0.field4710[10] + this.field4710[13] * arg0.field4710[6] + this.field4710[12] * arg0.field4710[2];
        float var17 = this.field4710[15] * arg0.field4710[15] + this.field4710[14] * arg0.field4710[11] + this.field4710[13] * arg0.field4710[7] + this.field4710[12] * arg0.field4710[3];
        this.field4710[0] = var2;
        this.field4710[1] = var3;
        this.field4710[2] = var4;
        this.field4710[3] = var5;
        this.field4710[4] = var6;
        this.field4710[5] = var7;
        this.field4710[6] = var8;
        this.field4710[7] = var9;
        this.field4710[8] = var10;
        this.field4710[9] = var11;
        this.field4710[10] = var12;
        this.field4710[11] = var13;
        this.field4710[12] = var14;
        this.field4710[13] = var15;
        this.field4710[14] = var16;
        this.field4710[15] = var17;
    }

    @ObfuscatedName("qg.az(Lqe;B)V")
    public void method7131(class419 arg0) {
        float var2 = arg0.field4682.field4703 * arg0.field4682.field4703;
        float var3 = arg0.field4682.field4703 * arg0.field4682.field4700;
        float var4 = arg0.field4682.field4703 * arg0.field4682.field4701;
        float var5 = arg0.field4682.field4703 * arg0.field4682.field4697;
        float var6 = arg0.field4682.field4700 * arg0.field4682.field4700;
        float var7 = arg0.field4682.field4701 * arg0.field4682.field4700;
        float var8 = arg0.field4682.field4700 * arg0.field4682.field4697;
        float var9 = arg0.field4682.field4701 * arg0.field4682.field4701;
        float var10 = arg0.field4682.field4701 * arg0.field4682.field4697;
        float var11 = arg0.field4682.field4697 * arg0.field4682.field4697;
        this.field4710[0] = var2 + var6 - var11 - var9;
        this.field4710[1] = var5 + var7 + var7 + var5;
        this.field4710[2] = var8 - var4 - var4 + var8;
        this.field4710[4] = var7 - var5 - var5 + var7;
        this.field4710[5] = var2 + var9 - var6 - var11;
        this.field4710[6] = var3 + var10 + var10 + var3;
        this.field4710[8] = var4 + var8 + var8 + var4;
        this.field4710[9] = var10 - var3 - var3 + var10;
        this.field4710[10] = var2 + var11 - var9 - var6;
        float[] var12 = this.field4710;
        float[] var13 = this.field4710;
        this.field4710[11] = 0.0F;
        var13[7] = 0.0F;
        var12[3] = 0.0F;
        this.field4710[12] = arg0.field4683.field4696;
        this.field4710[13] = arg0.field4683.field4693;
        this.field4710[14] = arg0.field4683.field4694;
        this.field4710[15] = 1.0F;
    }

    @ObfuscatedName("qg.ax(Lqi;I)V")
    public void method7142(class424 arg0) {
        float var2 = arg0.field4703 * arg0.field4703;
        float var3 = arg0.field4703 * arg0.field4700;
        float var4 = arg0.field4703 * arg0.field4701;
        float var5 = arg0.field4703 * arg0.field4697;
        float var6 = arg0.field4700 * arg0.field4700;
        float var7 = arg0.field4701 * arg0.field4700;
        float var8 = arg0.field4700 * arg0.field4697;
        float var9 = arg0.field4701 * arg0.field4701;
        float var10 = arg0.field4701 * arg0.field4697;
        float var11 = arg0.field4697 * arg0.field4697;
        this.field4710[0] = var2 + var6 - var11 - var9;
        this.field4710[1] = var5 + var7 + var7 + var5;
        this.field4710[2] = var8 - var4 - var4 + var8;
        this.field4710[4] = var7 - var5 - var5 + var7;
        this.field4710[5] = var2 + var9 - var6 - var11;
        this.field4710[6] = var3 + var10 + var10 + var3;
        this.field4710[8] = var4 + var8 + var8 + var4;
        this.field4710[9] = var10 - var3 - var3 + var10;
        this.field4710[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("qg.ac(Lqx;B)V")
    public void method7133(class426 arg0) {
        this.field4710[0] = arg0.field4712;
        this.field4710[1] = arg0.field4711;
        this.field4710[2] = arg0.field4713;
        this.field4710[3] = 0.0F;
        this.field4710[4] = arg0.field4714;
        this.field4710[5] = arg0.field4715;
        this.field4710[6] = arg0.field4716;
        this.field4710[7] = 0.0F;
        this.field4710[8] = arg0.field4720;
        this.field4710[9] = arg0.field4718;
        this.field4710[10] = arg0.field4717;
        this.field4710[11] = 0.0F;
        this.field4710[12] = arg0.field4721;
        this.field4710[13] = arg0.field4719;
        this.field4710[14] = arg0.field4722;
        this.field4710[15] = 1.0F;
    }

    @ObfuscatedName("qg.al(I)F")
    public float method7184() {
        return this.field4710[6] * this.field4710[3] * this.field4710[9] * this.field4710[12] + (this.field4710[5] * this.field4710[3] * this.field4710[8] * this.field4710[14] + this.field4710[4] * this.field4710[3] * this.field4710[10] * this.field4710[13] + (this.field4710[7] * this.field4710[2] * this.field4710[8] * this.field4710[13] + this.field4710[2] * this.field4710[5] * this.field4710[11] * this.field4710[12] + (this.field4710[4] * this.field4710[2] * this.field4710[9] * this.field4710[15] + this.field4710[1] * this.field4710[7] * this.field4710[10] * this.field4710[12] + (this.field4710[6] * this.field4710[1] * this.field4710[8] * this.field4710[15] + this.field4710[4] * this.field4710[1] * this.field4710[11] * this.field4710[14] + (this.field4710[7] * this.field4710[0] * this.field4710[9] * this.field4710[14] + this.field4710[6] * this.field4710[0] * this.field4710[11] * this.field4710[13] + (this.field4710[0] * this.field4710[5] * this.field4710[10] * this.field4710[15] - this.field4710[0] * this.field4710[5] * this.field4710[11] * this.field4710[14] - this.field4710[6] * this.field4710[0] * this.field4710[9] * this.field4710[15]) - this.field4710[0] * this.field4710[7] * this.field4710[10] * this.field4710[13] - this.field4710[4] * this.field4710[1] * this.field4710[10] * this.field4710[15]) - this.field4710[1] * this.field4710[6] * this.field4710[11] * this.field4710[12] - this.field4710[1] * this.field4710[7] * this.field4710[8] * this.field4710[14]) - this.field4710[2] * this.field4710[4] * this.field4710[11] * this.field4710[13] - this.field4710[5] * this.field4710[2] * this.field4710[8] * this.field4710[15]) - this.field4710[2] * this.field4710[7] * this.field4710[9] * this.field4710[12] - this.field4710[4] * this.field4710[3] * this.field4710[9] * this.field4710[14]) - this.field4710[3] * this.field4710[5] * this.field4710[10] * this.field4710[12] - this.field4710[3] * this.field4710[6] * this.field4710[8] * this.field4710[13]);
    }

    @ObfuscatedName("qg.ay(I)V")
    public void method7135() {
        float var1 = 1.0F / this.method7184();
        float var2 = (this.field4710[7] * this.field4710[9] * this.field4710[14] + this.field4710[11] * this.field4710[6] * this.field4710[13] + (this.field4710[5] * this.field4710[10] * this.field4710[15] - this.field4710[11] * this.field4710[5] * this.field4710[14] - this.field4710[9] * this.field4710[6] * this.field4710[15]) - this.field4710[10] * this.field4710[7] * this.field4710[13]) * var1;
        float var3 = (this.field4710[3] * this.field4710[10] * this.field4710[13] + (this.field4710[2] * this.field4710[9] * this.field4710[15] + this.field4710[11] * this.field4710[1] * this.field4710[14] + this.field4710[10] * -this.field4710[1] * this.field4710[15] - this.field4710[2] * this.field4710[11] * this.field4710[13] - this.field4710[9] * this.field4710[3] * this.field4710[14])) * var1;
        float var4 = (this.field4710[3] * this.field4710[5] * this.field4710[14] + this.field4710[2] * this.field4710[7] * this.field4710[13] + (this.field4710[1] * this.field4710[6] * this.field4710[15] - this.field4710[1] * this.field4710[7] * this.field4710[14] - this.field4710[5] * this.field4710[2] * this.field4710[15]) - this.field4710[6] * this.field4710[3] * this.field4710[13]) * var1;
        float var5 = (this.field4710[3] * this.field4710[6] * this.field4710[9] + (this.field4710[2] * this.field4710[5] * this.field4710[11] + this.field4710[7] * this.field4710[1] * this.field4710[10] + this.field4710[6] * -this.field4710[1] * this.field4710[11] - this.field4710[7] * this.field4710[2] * this.field4710[9] - this.field4710[5] * this.field4710[3] * this.field4710[10])) * var1;
        float var6 = (this.field4710[10] * this.field4710[7] * this.field4710[12] + (this.field4710[6] * this.field4710[8] * this.field4710[15] + this.field4710[10] * -this.field4710[4] * this.field4710[15] + this.field4710[4] * this.field4710[11] * this.field4710[14] - this.field4710[11] * this.field4710[6] * this.field4710[12] - this.field4710[7] * this.field4710[8] * this.field4710[14])) * var1;
        float var7 = (this.field4710[8] * this.field4710[3] * this.field4710[14] + this.field4710[11] * this.field4710[2] * this.field4710[12] + (this.field4710[0] * this.field4710[10] * this.field4710[15] - this.field4710[0] * this.field4710[11] * this.field4710[14] - this.field4710[8] * this.field4710[2] * this.field4710[15]) - this.field4710[10] * this.field4710[3] * this.field4710[12]) * var1;
        float var8 = (this.field4710[6] * this.field4710[3] * this.field4710[12] + (this.field4710[4] * this.field4710[2] * this.field4710[15] + this.field4710[0] * this.field4710[7] * this.field4710[14] + this.field4710[6] * -this.field4710[0] * this.field4710[15] - this.field4710[7] * this.field4710[2] * this.field4710[12] - this.field4710[4] * this.field4710[3] * this.field4710[14])) * var1;
        float var9 = (this.field4710[4] * this.field4710[3] * this.field4710[10] + this.field4710[7] * this.field4710[2] * this.field4710[8] + (this.field4710[0] * this.field4710[6] * this.field4710[11] - this.field4710[7] * this.field4710[0] * this.field4710[10] - this.field4710[4] * this.field4710[2] * this.field4710[11]) - this.field4710[3] * this.field4710[6] * this.field4710[8]) * var1;
        float var10 = (this.field4710[7] * this.field4710[8] * this.field4710[13] + this.field4710[11] * this.field4710[5] * this.field4710[12] + (this.field4710[9] * this.field4710[4] * this.field4710[15] - this.field4710[11] * this.field4710[4] * this.field4710[13] - this.field4710[8] * this.field4710[5] * this.field4710[15]) - this.field4710[9] * this.field4710[7] * this.field4710[12]) * var1;
        float var11 = (this.field4710[3] * this.field4710[9] * this.field4710[12] + (this.field4710[1] * this.field4710[8] * this.field4710[15] + this.field4710[0] * this.field4710[11] * this.field4710[13] + this.field4710[9] * -this.field4710[0] * this.field4710[15] - this.field4710[11] * this.field4710[1] * this.field4710[12] - this.field4710[3] * this.field4710[8] * this.field4710[13])) * var1;
        float var12 = (this.field4710[3] * this.field4710[4] * this.field4710[13] + this.field4710[1] * this.field4710[7] * this.field4710[12] + (this.field4710[5] * this.field4710[0] * this.field4710[15] - this.field4710[7] * this.field4710[0] * this.field4710[13] - this.field4710[4] * this.field4710[1] * this.field4710[15]) - this.field4710[3] * this.field4710[5] * this.field4710[12]) * var1;
        float var13 = (this.field4710[5] * this.field4710[3] * this.field4710[8] + (this.field4710[1] * this.field4710[4] * this.field4710[11] + this.field4710[5] * -this.field4710[0] * this.field4710[11] + this.field4710[7] * this.field4710[0] * this.field4710[9] - this.field4710[1] * this.field4710[7] * this.field4710[8] - this.field4710[4] * this.field4710[3] * this.field4710[9])) * var1;
        float var14 = (this.field4710[9] * this.field4710[6] * this.field4710[12] + (this.field4710[5] * this.field4710[8] * this.field4710[14] + this.field4710[9] * -this.field4710[4] * this.field4710[14] + this.field4710[4] * this.field4710[10] * this.field4710[13] - this.field4710[5] * this.field4710[10] * this.field4710[12] - this.field4710[6] * this.field4710[8] * this.field4710[13])) * var1;
        float var15 = (this.field4710[2] * this.field4710[8] * this.field4710[13] + this.field4710[1] * this.field4710[10] * this.field4710[12] + (this.field4710[0] * this.field4710[9] * this.field4710[14] - this.field4710[0] * this.field4710[10] * this.field4710[13] - this.field4710[8] * this.field4710[1] * this.field4710[14]) - this.field4710[2] * this.field4710[9] * this.field4710[12]) * var1;
        float var16 = (this.field4710[2] * this.field4710[5] * this.field4710[12] + (this.field4710[4] * this.field4710[1] * this.field4710[14] + this.field4710[6] * this.field4710[0] * this.field4710[13] + this.field4710[5] * -this.field4710[0] * this.field4710[14] - this.field4710[1] * this.field4710[6] * this.field4710[12] - this.field4710[4] * this.field4710[2] * this.field4710[13])) * var1;
        float var17 = (this.field4710[4] * this.field4710[2] * this.field4710[9] + this.field4710[6] * this.field4710[1] * this.field4710[8] + (this.field4710[0] * this.field4710[5] * this.field4710[10] - this.field4710[6] * this.field4710[0] * this.field4710[9] - this.field4710[4] * this.field4710[1] * this.field4710[10]) - this.field4710[5] * this.field4710[2] * this.field4710[8]) * var1;
        this.field4710[0] = var2;
        this.field4710[1] = var3;
        this.field4710[2] = var4;
        this.field4710[3] = var5;
        this.field4710[4] = var6;
        this.field4710[5] = var7;
        this.field4710[6] = var8;
        this.field4710[7] = var9;
        this.field4710[8] = var10;
        this.field4710[9] = var11;
        this.field4710[10] = var12;
        this.field4710[11] = var13;
        this.field4710[12] = var14;
        this.field4710[13] = var15;
        this.field4710[14] = var16;
        this.field4710[15] = var17;
    }

    @ObfuscatedName("qg.ao(FFFFI)V")
    public void method7136(float arg0, float arg1, float arg2, float arg3) {
        this.field4710[0] = arg0;
        this.field4710[1] = 0.0F;
        this.field4710[2] = 0.0F;
        this.field4710[3] = 0.0F;
        this.field4710[4] = 0.0F;
        this.field4710[5] = arg1;
        this.field4710[6] = 0.0F;
        this.field4710[7] = 0.0F;
        this.field4710[8] = 0.0F;
        this.field4710[9] = 0.0F;
        this.field4710[10] = arg2;
        this.field4710[11] = 0.0F;
        this.field4710[12] = 0.0F;
        this.field4710[13] = 0.0F;
        this.field4710[14] = 0.0F;
        this.field4710[15] = arg3;
    }

    @ObfuscatedName("qg.aa(FFF[FB)V")
    public void method7137(float arg0, float arg1, float arg2, float[] arg3) {
        arg3[0] = this.field4710[8] * arg2 + this.field4710[0] * arg0 + this.field4710[4] * arg1 + this.field4710[12];
        arg3[1] = this.field4710[9] * arg2 + this.field4710[5] * arg1 + this.field4710[1] * arg0 + this.field4710[13];
        arg3[2] = this.field4710[10] * arg2 + this.field4710[6] * arg1 + this.field4710[2] * arg0 + this.field4710[14];
        if (arg3.length > 3) {
            arg3[3] = this.field4710[11] * arg2 + this.field4710[7] * arg1 + this.field4710[3] * arg0 + this.field4710[15];
        }
    }

    @ObfuscatedName("qg.as(FFFI)F")
    public float method7129(float arg0, float arg1, float arg2) {
        return this.field4710[8] * arg2 + this.field4710[4] * arg1 + this.field4710[0] * arg0 + this.field4710[12];
    }

    @ObfuscatedName("qg.aw(FFFB)F")
    public float method7198(float arg0, float arg1, float arg2) {
        return this.field4710[9] * arg2 + this.field4710[1] * arg0 + this.field4710[5] * arg1 + this.field4710[13];
    }

    @ObfuscatedName("qg.at(FFFB)F")
    public float method7140(float arg0, float arg1, float arg2) {
        return this.field4710[10] * arg2 + this.field4710[2] * arg0 + this.field4710[6] * arg1 + this.field4710[14];
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7124();
        this.method7123();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4710[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4710);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class425)) {
            return false;
        }
        class425 var2 = (class425) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4710[var3] != var2.field4710[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("qg.af(I)[F")
    public float[] method7143() {
        float[] var1 = new float[3];
        class423 var2 = new class423(this.field4710[0], this.field4710[1], this.field4710[2]);
        class423 var3 = new class423(this.field4710[4], this.field4710[5], this.field4710[6]);
        class423 var4 = new class423(this.field4710[8], this.field4710[9], this.field4710[10]);
        var1[0] = var2.method7068();
        var1[1] = var3.method7068();
        var1[2] = var4.method7068();
        return var1;
    }
}
