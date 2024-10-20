package deob;

import java.util.Arrays;

@ObfuscatedName("sq")
public final class class471 {

    @ObfuscatedName("sq.ah")
    public static class471[] field4871 = new class471[0];

    @ObfuscatedName("sq.an")
    public float[] field4873 = new float[16];

    @ObfuscatedName("sq.ao")
    public static final class471 field4874;

    static {
        method3946(100);
        field4874 = new class471();
    }

    @ObfuscatedName("iv.az(IB)V")
    public static void method3946(int arg0) {
        Statics.field4876 = arg0;
        field4871 = new class471[arg0];
        Statics.field4689 = 0;
    }

    @ObfuscatedName("dd.ah(I)Lsq;")
    public static class471 method2467() {
        class471[] var0 = field4871;
        synchronized (field4871) {
            if (Statics.field4689 == 0) {
                return new class471();
            } else {
                field4871[--Statics.field4689].method7696();
                return field4871[Statics.field4689];
            }
        }
    }

    @ObfuscatedName("sq.af(B)V")
    public void method7738() {
        class471[] var1 = field4871;
        synchronized (field4871) {
            if (Statics.field4689 < Statics.field4876 - 1) {
                field4871[++Statics.field4689 - 1] = this;
            }
        }
    }

    public class471() {
        this.method7696();
    }

    public class471(class471 arg0) {
        this.method7689(arg0);
    }

    public class471(class535 arg0, boolean arg1) {
        this.method7685(arg0, arg1);
    }

    @ObfuscatedName("sq.at(Lur;ZI)V")
    public void method7685(class535 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4873[var16] = arg0.method8470();
            }
            return;
        }
        class472 var3 = new class472();
        int var5 = arg0.method8465();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7747(var7);
        int var9 = arg0.method8465();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7757(var11);
        int var13 = arg0.method8465();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7749(var15);
        var3.method7750((float) arg0.method8465(), (float) arg0.method8465(), (float) arg0.method8465());
        this.method7724(var3);
    }

    @ObfuscatedName("sq.an(B)[F")
    public float[] method7725() {
        float[] var1 = new float[3];
        if ((double) this.field4873[2] < 0.999D && (double) this.field4873[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4873[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4873[6] / var2, (double) this.field4873[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4873[1] / var2, (double) this.field4873[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4873[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4873[9]), (double) this.field4873[5]);
        }
        return var1;
    }

    @ObfuscatedName("sq.ao(B)[F")
    public float[] method7687() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4873[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4873[2];
            double var6 = (double) this.field4873[10];
            double var8 = (double) this.field4873[4];
            double var10 = (double) this.field4873[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4873[1];
            double var14 = (double) this.field4873[0];
            if (this.field4873[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("sq.ab(I)V")
    public void method7696() {
        this.field4873[0] = 1.0F;
        this.field4873[1] = 0.0F;
        this.field4873[2] = 0.0F;
        this.field4873[3] = 0.0F;
        this.field4873[4] = 0.0F;
        this.field4873[5] = 1.0F;
        this.field4873[6] = 0.0F;
        this.field4873[7] = 0.0F;
        this.field4873[8] = 0.0F;
        this.field4873[9] = 0.0F;
        this.field4873[10] = 1.0F;
        this.field4873[11] = 0.0F;
        this.field4873[12] = 0.0F;
        this.field4873[13] = 0.0F;
        this.field4873[14] = 0.0F;
        this.field4873[15] = 1.0F;
    }

    @ObfuscatedName("sq.aw(I)V")
    public void method7713() {
        this.field4873[0] = 0.0F;
        this.field4873[1] = 0.0F;
        this.field4873[2] = 0.0F;
        this.field4873[3] = 0.0F;
        this.field4873[4] = 0.0F;
        this.field4873[5] = 0.0F;
        this.field4873[6] = 0.0F;
        this.field4873[7] = 0.0F;
        this.field4873[8] = 0.0F;
        this.field4873[9] = 0.0F;
        this.field4873[10] = 0.0F;
        this.field4873[11] = 0.0F;
        this.field4873[12] = 0.0F;
        this.field4873[13] = 0.0F;
        this.field4873[14] = 0.0F;
        this.field4873[15] = 0.0F;
    }

    @ObfuscatedName("sq.ad(Lsq;B)V")
    public void method7689(class471 arg0) {
        System.arraycopy(arg0.field4873, 0, this.field4873, 0, 16);
    }

    @ObfuscatedName("sq.al(FB)V")
    public void method7684(float arg0) {
        this.method7688(arg0, arg0, arg0);
    }

    @ObfuscatedName("sq.as(FFFI)V")
    public void method7688(float arg0, float arg1, float arg2) {
        this.method7696();
        this.field4873[0] = arg0;
        this.field4873[5] = arg1;
        this.field4873[10] = arg2;
    }

    @ObfuscatedName("sq.ag(Lsq;B)V")
    public void method7691(class471 arg0) {
        for (int var2 = 0; var2 < this.field4873.length; var2++) {
            this.field4873[var2] += arg0.field4873[var2];
        }
    }

    @ObfuscatedName("sq.ai(Lsq;B)V")
    public void method7692(class471 arg0) {
        float var2 = this.field4873[3] * arg0.field4873[12] + this.field4873[2] * arg0.field4873[8] + this.field4873[1] * arg0.field4873[4] + this.field4873[0] * arg0.field4873[0];
        float var3 = this.field4873[3] * arg0.field4873[13] + this.field4873[2] * arg0.field4873[9] + this.field4873[1] * arg0.field4873[5] + this.field4873[0] * arg0.field4873[1];
        float var4 = this.field4873[3] * arg0.field4873[14] + this.field4873[2] * arg0.field4873[10] + this.field4873[1] * arg0.field4873[6] + this.field4873[0] * arg0.field4873[2];
        float var5 = this.field4873[3] * arg0.field4873[15] + this.field4873[2] * arg0.field4873[11] + this.field4873[0] * arg0.field4873[3] + this.field4873[1] * arg0.field4873[7];
        float var6 = this.field4873[7] * arg0.field4873[12] + this.field4873[6] * arg0.field4873[8] + this.field4873[4] * arg0.field4873[0] + this.field4873[5] * arg0.field4873[4];
        float var7 = this.field4873[7] * arg0.field4873[13] + this.field4873[6] * arg0.field4873[9] + this.field4873[5] * arg0.field4873[5] + this.field4873[4] * arg0.field4873[1];
        float var8 = this.field4873[7] * arg0.field4873[14] + this.field4873[6] * arg0.field4873[10] + this.field4873[5] * arg0.field4873[6] + this.field4873[4] * arg0.field4873[2];
        float var9 = this.field4873[7] * arg0.field4873[15] + this.field4873[6] * arg0.field4873[11] + this.field4873[5] * arg0.field4873[7] + this.field4873[4] * arg0.field4873[3];
        float var10 = this.field4873[11] * arg0.field4873[12] + this.field4873[10] * arg0.field4873[8] + this.field4873[9] * arg0.field4873[4] + this.field4873[8] * arg0.field4873[0];
        float var11 = this.field4873[11] * arg0.field4873[13] + this.field4873[10] * arg0.field4873[9] + this.field4873[9] * arg0.field4873[5] + this.field4873[8] * arg0.field4873[1];
        float var12 = this.field4873[11] * arg0.field4873[14] + this.field4873[10] * arg0.field4873[10] + this.field4873[9] * arg0.field4873[6] + this.field4873[8] * arg0.field4873[2];
        float var13 = this.field4873[11] * arg0.field4873[15] + this.field4873[10] * arg0.field4873[11] + this.field4873[9] * arg0.field4873[7] + this.field4873[8] * arg0.field4873[3];
        float var14 = this.field4873[15] * arg0.field4873[12] + this.field4873[14] * arg0.field4873[8] + this.field4873[13] * arg0.field4873[4] + this.field4873[12] * arg0.field4873[0];
        float var15 = this.field4873[15] * arg0.field4873[13] + this.field4873[14] * arg0.field4873[9] + this.field4873[12] * arg0.field4873[1] + this.field4873[13] * arg0.field4873[5];
        float var16 = this.field4873[15] * arg0.field4873[14] + this.field4873[14] * arg0.field4873[10] + this.field4873[12] * arg0.field4873[2] + this.field4873[13] * arg0.field4873[6];
        float var17 = this.field4873[15] * arg0.field4873[15] + this.field4873[14] * arg0.field4873[11] + this.field4873[12] * arg0.field4873[3] + this.field4873[13] * arg0.field4873[7];
        this.field4873[0] = var2;
        this.field4873[1] = var3;
        this.field4873[2] = var4;
        this.field4873[3] = var5;
        this.field4873[4] = var6;
        this.field4873[5] = var7;
        this.field4873[6] = var8;
        this.field4873[7] = var9;
        this.field4873[8] = var10;
        this.field4873[9] = var11;
        this.field4873[10] = var12;
        this.field4873[11] = var13;
        this.field4873[12] = var14;
        this.field4873[13] = var15;
        this.field4873[14] = var16;
        this.field4873[15] = var17;
    }

    @ObfuscatedName("sq.ax(Lsh;I)V")
    public void method7710(class470 arg0) {
        float var2 = arg0.field4868 * arg0.field4868;
        float var3 = arg0.field4868 * arg0.field4864;
        float var4 = arg0.field4868 * arg0.field4866;
        float var5 = arg0.field4868 * arg0.field4865;
        float var6 = arg0.field4864 * arg0.field4864;
        float var7 = arg0.field4866 * arg0.field4864;
        float var8 = arg0.field4865 * arg0.field4864;
        float var9 = arg0.field4866 * arg0.field4866;
        float var10 = arg0.field4866 * arg0.field4865;
        float var11 = arg0.field4865 * arg0.field4865;
        this.field4873[0] = var2 + var6 - var11 - var9;
        this.field4873[1] = var5 + var7 + var7 + var5;
        this.field4873[2] = var8 - var4 - var4 + var8;
        this.field4873[4] = var7 - var5 - var5 + var7;
        this.field4873[5] = var2 + var9 - var6 - var11;
        this.field4873[6] = var3 + var10 + var10 + var3;
        this.field4873[8] = var4 + var8 + var8 + var4;
        this.field4873[9] = var10 - var3 - var3 + var10;
        this.field4873[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("sq.ar(Lsy;B)V")
    public void method7724(class472 arg0) {
        this.field4873[0] = arg0.field4885;
        this.field4873[1] = arg0.field4880;
        this.field4873[2] = arg0.field4879;
        this.field4873[3] = 0.0F;
        this.field4873[4] = arg0.field4884;
        this.field4873[5] = arg0.field4881;
        this.field4873[6] = arg0.field4882;
        this.field4873[7] = 0.0F;
        this.field4873[8] = arg0.field4883;
        this.field4873[9] = arg0.field4877;
        this.field4873[10] = arg0.field4878;
        this.field4873[11] = 0.0F;
        this.field4873[12] = arg0.field4886;
        this.field4873[13] = arg0.field4887;
        this.field4873[14] = arg0.field4888;
        this.field4873[15] = 1.0F;
    }

    @ObfuscatedName("sq.aj(I)F")
    public float method7695() {
        return this.field4873[6] * this.field4873[3] * this.field4873[9] * this.field4873[12] + (this.field4873[5] * this.field4873[3] * this.field4873[8] * this.field4873[14] + this.field4873[4] * this.field4873[3] * this.field4873[10] * this.field4873[13] + (this.field4873[7] * this.field4873[2] * this.field4873[8] * this.field4873[13] + this.field4873[5] * this.field4873[2] * this.field4873[11] * this.field4873[12] + (this.field4873[4] * this.field4873[2] * this.field4873[9] * this.field4873[15] + this.field4873[7] * this.field4873[1] * this.field4873[10] * this.field4873[12] + (this.field4873[6] * this.field4873[1] * this.field4873[8] * this.field4873[15] + this.field4873[4] * this.field4873[1] * this.field4873[11] * this.field4873[14] + (this.field4873[7] * this.field4873[0] * this.field4873[9] * this.field4873[14] + this.field4873[6] * this.field4873[0] * this.field4873[11] * this.field4873[13] + (this.field4873[0] * this.field4873[5] * this.field4873[10] * this.field4873[15] - this.field4873[5] * this.field4873[0] * this.field4873[11] * this.field4873[14] - this.field4873[0] * this.field4873[6] * this.field4873[9] * this.field4873[15]) - this.field4873[7] * this.field4873[0] * this.field4873[10] * this.field4873[13] - this.field4873[4] * this.field4873[1] * this.field4873[10] * this.field4873[15]) - this.field4873[1] * this.field4873[6] * this.field4873[11] * this.field4873[12] - this.field4873[7] * this.field4873[1] * this.field4873[8] * this.field4873[14]) - this.field4873[4] * this.field4873[2] * this.field4873[11] * this.field4873[13] - this.field4873[2] * this.field4873[5] * this.field4873[8] * this.field4873[15]) - this.field4873[2] * this.field4873[7] * this.field4873[9] * this.field4873[12] - this.field4873[4] * this.field4873[3] * this.field4873[9] * this.field4873[14]) - this.field4873[5] * this.field4873[3] * this.field4873[10] * this.field4873[12] - this.field4873[3] * this.field4873[6] * this.field4873[8] * this.field4873[13]);
    }

    @ObfuscatedName("sq.au(B)V")
    public void method7723() {
        float var1 = 1.0F / this.method7695();
        float var2 = (this.field4873[7] * this.field4873[9] * this.field4873[14] + this.field4873[6] * this.field4873[11] * this.field4873[13] + (this.field4873[5] * this.field4873[10] * this.field4873[15] - this.field4873[11] * this.field4873[5] * this.field4873[14] - this.field4873[6] * this.field4873[9] * this.field4873[15]) - this.field4873[7] * this.field4873[10] * this.field4873[13]) * var1;
        float var3 = (this.field4873[10] * this.field4873[3] * this.field4873[13] + (this.field4873[2] * this.field4873[9] * this.field4873[15] + this.field4873[10] * -this.field4873[1] * this.field4873[15] + this.field4873[11] * this.field4873[1] * this.field4873[14] - this.field4873[2] * this.field4873[11] * this.field4873[13] - this.field4873[3] * this.field4873[9] * this.field4873[14])) * var1;
        float var4 = (this.field4873[3] * this.field4873[5] * this.field4873[14] + this.field4873[7] * this.field4873[2] * this.field4873[13] + (this.field4873[6] * this.field4873[1] * this.field4873[15] - this.field4873[7] * this.field4873[1] * this.field4873[14] - this.field4873[5] * this.field4873[2] * this.field4873[15]) - this.field4873[3] * this.field4873[6] * this.field4873[13]) * var1;
        float var5 = (this.field4873[6] * this.field4873[3] * this.field4873[9] + (this.field4873[2] * this.field4873[5] * this.field4873[11] + this.field4873[6] * -this.field4873[1] * this.field4873[11] + this.field4873[7] * this.field4873[1] * this.field4873[10] - this.field4873[7] * this.field4873[2] * this.field4873[9] - this.field4873[5] * this.field4873[3] * this.field4873[10])) * var1;
        float var6 = (this.field4873[7] * this.field4873[10] * this.field4873[12] + (this.field4873[6] * this.field4873[8] * this.field4873[15] + this.field4873[11] * this.field4873[4] * this.field4873[14] + this.field4873[10] * -this.field4873[4] * this.field4873[15] - this.field4873[6] * this.field4873[11] * this.field4873[12] - this.field4873[7] * this.field4873[8] * this.field4873[14])) * var1;
        float var7 = (this.field4873[3] * this.field4873[8] * this.field4873[14] + this.field4873[2] * this.field4873[11] * this.field4873[12] + (this.field4873[0] * this.field4873[10] * this.field4873[15] - this.field4873[0] * this.field4873[11] * this.field4873[14] - this.field4873[8] * this.field4873[2] * this.field4873[15]) - this.field4873[3] * this.field4873[10] * this.field4873[12]) * var1;
        float var8 = (this.field4873[3] * this.field4873[6] * this.field4873[12] + (this.field4873[2] * this.field4873[4] * this.field4873[15] + this.field4873[0] * this.field4873[7] * this.field4873[14] + this.field4873[6] * -this.field4873[0] * this.field4873[15] - this.field4873[2] * this.field4873[7] * this.field4873[12] - this.field4873[4] * this.field4873[3] * this.field4873[14])) * var1;
        float var9 = (this.field4873[4] * this.field4873[3] * this.field4873[10] + this.field4873[7] * this.field4873[2] * this.field4873[8] + (this.field4873[0] * this.field4873[6] * this.field4873[11] - this.field4873[7] * this.field4873[0] * this.field4873[10] - this.field4873[4] * this.field4873[2] * this.field4873[11]) - this.field4873[3] * this.field4873[6] * this.field4873[8]) * var1;
        float var10 = (this.field4873[7] * this.field4873[8] * this.field4873[13] + this.field4873[11] * this.field4873[5] * this.field4873[12] + (this.field4873[9] * this.field4873[4] * this.field4873[15] - this.field4873[4] * this.field4873[11] * this.field4873[13] - this.field4873[8] * this.field4873[5] * this.field4873[15]) - this.field4873[7] * this.field4873[9] * this.field4873[12]) * var1;
        float var11 = (this.field4873[9] * this.field4873[3] * this.field4873[12] + (this.field4873[1] * this.field4873[8] * this.field4873[15] + this.field4873[11] * this.field4873[0] * this.field4873[13] + this.field4873[9] * -this.field4873[0] * this.field4873[15] - this.field4873[11] * this.field4873[1] * this.field4873[12] - this.field4873[3] * this.field4873[8] * this.field4873[13])) * var1;
        float var12 = (this.field4873[4] * this.field4873[3] * this.field4873[13] + this.field4873[7] * this.field4873[1] * this.field4873[12] + (this.field4873[0] * this.field4873[5] * this.field4873[15] - this.field4873[7] * this.field4873[0] * this.field4873[13] - this.field4873[4] * this.field4873[1] * this.field4873[15]) - this.field4873[5] * this.field4873[3] * this.field4873[12]) * var1;
        float var13 = (this.field4873[5] * this.field4873[3] * this.field4873[8] + (this.field4873[4] * this.field4873[1] * this.field4873[11] + this.field4873[0] * this.field4873[7] * this.field4873[9] + this.field4873[5] * -this.field4873[0] * this.field4873[11] - this.field4873[1] * this.field4873[7] * this.field4873[8] - this.field4873[3] * this.field4873[4] * this.field4873[9])) * var1;
        float var14 = (this.field4873[6] * this.field4873[9] * this.field4873[12] + (this.field4873[5] * this.field4873[8] * this.field4873[14] + this.field4873[4] * this.field4873[10] * this.field4873[13] + this.field4873[9] * -this.field4873[4] * this.field4873[14] - this.field4873[10] * this.field4873[5] * this.field4873[12] - this.field4873[8] * this.field4873[6] * this.field4873[13])) * var1;
        float var15 = (this.field4873[2] * this.field4873[8] * this.field4873[13] + this.field4873[10] * this.field4873[1] * this.field4873[12] + (this.field4873[0] * this.field4873[9] * this.field4873[14] - this.field4873[10] * this.field4873[0] * this.field4873[13] - this.field4873[8] * this.field4873[1] * this.field4873[14]) - this.field4873[2] * this.field4873[9] * this.field4873[12]) * var1;
        float var16 = (this.field4873[5] * this.field4873[2] * this.field4873[12] + (this.field4873[4] * this.field4873[1] * this.field4873[14] + this.field4873[6] * this.field4873[0] * this.field4873[13] + this.field4873[5] * -this.field4873[0] * this.field4873[14] - this.field4873[1] * this.field4873[6] * this.field4873[12] - this.field4873[4] * this.field4873[2] * this.field4873[13])) * var1;
        float var17 = (this.field4873[4] * this.field4873[2] * this.field4873[9] + this.field4873[6] * this.field4873[1] * this.field4873[8] + (this.field4873[5] * this.field4873[0] * this.field4873[10] - this.field4873[0] * this.field4873[6] * this.field4873[9] - this.field4873[4] * this.field4873[1] * this.field4873[10]) - this.field4873[2] * this.field4873[5] * this.field4873[8]) * var1;
        this.field4873[0] = var2;
        this.field4873[1] = var3;
        this.field4873[2] = var4;
        this.field4873[3] = var5;
        this.field4873[4] = var6;
        this.field4873[5] = var7;
        this.field4873[6] = var8;
        this.field4873[7] = var9;
        this.field4873[8] = var10;
        this.field4873[9] = var11;
        this.field4873[10] = var12;
        this.field4873[11] = var13;
        this.field4873[12] = var14;
        this.field4873[13] = var15;
        this.field4873[14] = var16;
        this.field4873[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7687();
        this.method7725();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4873[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4873);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class471)) {
            return false;
        }
        class471 var2 = (class471) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4873[var3] != var2.field4873[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("sq.ay(I)[F")
    public float[] method7698() {
        float[] var1 = new float[3];
        class469 var2 = new class469(this.field4873[0], this.field4873[1], this.field4873[2]);
        class469 var3 = new class469(this.field4873[4], this.field4873[5], this.field4873[6]);
        class469 var4 = new class469(this.field4873[8], this.field4873[9], this.field4873[10]);
        var1[0] = var2.method7650();
        var1[1] = var3.method7650();
        var1[2] = var4.method7650();
        return var1;
    }
}
