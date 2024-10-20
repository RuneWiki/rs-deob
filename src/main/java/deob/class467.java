package deob;

import java.util.Arrays;

@ObfuscatedName("rh")
public final class class467 {

    @ObfuscatedName("rh.ap")
    public static class467[] field4812 = new class467[0];

    @ObfuscatedName("rh.aq")
    public float[] field4810 = new float[16];

    @ObfuscatedName("rh.ar")
    public static final class467 field4808;

    static {
        method5501(100);
        field4808 = new class467();
    }

    @ObfuscatedName("mw.am(II)V")
    public static void method5501(int arg0) {
        Statics.field4809 = arg0;
        field4812 = new class467[arg0];
        Statics.field4648 = 0;
    }

    @ObfuscatedName("ja.ap(I)Lrh;")
    public static class467 method4584() {
        class467[] var0 = field4812;
        synchronized (field4812) {
            if (Statics.field4648 == 0) {
                return new class467();
            } else {
                field4812[--Statics.field4648].method7803();
                return field4812[Statics.field4648];
            }
        }
    }

    @ObfuscatedName("rh.af(I)V")
    public void method7816() {
        class467[] var1 = field4812;
        synchronized (field4812) {
            if (Statics.field4648 < Statics.field4809 - 1) {
                field4812[++Statics.field4648 - 1] = this;
            }
        }
    }

    public class467() {
        this.method7803();
    }

    public class467(class467 arg0) {
        this.method7805(arg0);
    }

    public class467(class531 arg0, boolean arg1) {
        this.method7800(arg0, arg1);
    }

    @ObfuscatedName("rh.aj(Luk;ZI)V")
    public void method7800(class531 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4810[var4] = arg0.method8568();
            }
            return;
        }
        class468 var3 = new class468();
        var3.method7872(class481.method6312(arg0.method8564()));
        var3.method7884(class481.method6312(arg0.method8564()));
        var3.method7876(class481.method6312(arg0.method8564()));
        var3.method7875((float) arg0.method8564(), (float) arg0.method8564(), (float) arg0.method8564());
        this.method7815(var3);
    }

    @ObfuscatedName("rh.aq(I)[F")
    public float[] method7801() {
        float[] var1 = new float[3];
        if ((double) this.field4810[2] < 0.999D && (double) this.field4810[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4810[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4810[6] / var2, (double) this.field4810[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4810[1] / var2, (double) this.field4810[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4810[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4810[9]), (double) this.field4810[5]);
        }
        return var1;
    }

    @ObfuscatedName("rh.ar(I)[F")
    public float[] method7799() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4810[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4810[2];
            double var6 = (double) this.field4810[10];
            double var8 = (double) this.field4810[4];
            double var10 = (double) this.field4810[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4810[1];
            double var14 = (double) this.field4810[0];
            if (this.field4810[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("rh.ag(I)V")
    public void method7803() {
        this.field4810[0] = 1.0F;
        this.field4810[1] = 0.0F;
        this.field4810[2] = 0.0F;
        this.field4810[3] = 0.0F;
        this.field4810[4] = 0.0F;
        this.field4810[5] = 1.0F;
        this.field4810[6] = 0.0F;
        this.field4810[7] = 0.0F;
        this.field4810[8] = 0.0F;
        this.field4810[9] = 0.0F;
        this.field4810[10] = 1.0F;
        this.field4810[11] = 0.0F;
        this.field4810[12] = 0.0F;
        this.field4810[13] = 0.0F;
        this.field4810[14] = 0.0F;
        this.field4810[15] = 1.0F;
    }

    @ObfuscatedName("rh.ao(I)V")
    public void method7804() {
        this.field4810[0] = 0.0F;
        this.field4810[1] = 0.0F;
        this.field4810[2] = 0.0F;
        this.field4810[3] = 0.0F;
        this.field4810[4] = 0.0F;
        this.field4810[5] = 0.0F;
        this.field4810[6] = 0.0F;
        this.field4810[7] = 0.0F;
        this.field4810[8] = 0.0F;
        this.field4810[9] = 0.0F;
        this.field4810[10] = 0.0F;
        this.field4810[11] = 0.0F;
        this.field4810[12] = 0.0F;
        this.field4810[13] = 0.0F;
        this.field4810[14] = 0.0F;
        this.field4810[15] = 0.0F;
    }

    @ObfuscatedName("rh.ae(Lrh;I)V")
    public void method7805(class467 arg0) {
        System.arraycopy(arg0.field4810, 0, this.field4810, 0, 16);
    }

    @ObfuscatedName("rh.aa(FI)V")
    public void method7806(float arg0) {
        this.method7836(arg0, arg0, arg0);
    }

    @ObfuscatedName("rh.au(FFFI)V")
    public void method7836(float arg0, float arg1, float arg2) {
        this.method7803();
        this.field4810[0] = arg0;
        this.field4810[5] = arg1;
        this.field4810[10] = arg2;
    }

    @ObfuscatedName("rh.an(Lrh;B)V")
    public void method7808(class467 arg0) {
        for (int var2 = 0; var2 < this.field4810.length; var2++) {
            this.field4810[var2] += arg0.field4810[var2];
        }
    }

    @ObfuscatedName("rh.ad(Lrh;I)V")
    public void method7809(class467 arg0) {
        float var2 = this.field4810[3] * arg0.field4810[12] + this.field4810[2] * arg0.field4810[8] + this.field4810[1] * arg0.field4810[4] + this.field4810[0] * arg0.field4810[0];
        float var3 = this.field4810[3] * arg0.field4810[13] + this.field4810[2] * arg0.field4810[9] + this.field4810[0] * arg0.field4810[1] + this.field4810[1] * arg0.field4810[5];
        float var4 = this.field4810[3] * arg0.field4810[14] + this.field4810[2] * arg0.field4810[10] + this.field4810[1] * arg0.field4810[6] + this.field4810[0] * arg0.field4810[2];
        float var5 = this.field4810[3] * arg0.field4810[15] + this.field4810[2] * arg0.field4810[11] + this.field4810[0] * arg0.field4810[3] + this.field4810[1] * arg0.field4810[7];
        float var6 = this.field4810[7] * arg0.field4810[12] + this.field4810[6] * arg0.field4810[8] + this.field4810[5] * arg0.field4810[4] + this.field4810[4] * arg0.field4810[0];
        float var7 = this.field4810[7] * arg0.field4810[13] + this.field4810[6] * arg0.field4810[9] + this.field4810[4] * arg0.field4810[1] + this.field4810[5] * arg0.field4810[5];
        float var8 = this.field4810[7] * arg0.field4810[14] + this.field4810[6] * arg0.field4810[10] + this.field4810[4] * arg0.field4810[2] + this.field4810[5] * arg0.field4810[6];
        float var9 = this.field4810[7] * arg0.field4810[15] + this.field4810[6] * arg0.field4810[11] + this.field4810[5] * arg0.field4810[7] + this.field4810[4] * arg0.field4810[3];
        float var10 = this.field4810[11] * arg0.field4810[12] + this.field4810[10] * arg0.field4810[8] + this.field4810[9] * arg0.field4810[4] + this.field4810[8] * arg0.field4810[0];
        float var11 = this.field4810[11] * arg0.field4810[13] + this.field4810[10] * arg0.field4810[9] + this.field4810[9] * arg0.field4810[5] + this.field4810[8] * arg0.field4810[1];
        float var12 = this.field4810[11] * arg0.field4810[14] + this.field4810[10] * arg0.field4810[10] + this.field4810[8] * arg0.field4810[2] + this.field4810[9] * arg0.field4810[6];
        float var13 = this.field4810[11] * arg0.field4810[15] + this.field4810[10] * arg0.field4810[11] + this.field4810[9] * arg0.field4810[7] + this.field4810[8] * arg0.field4810[3];
        float var14 = this.field4810[15] * arg0.field4810[12] + this.field4810[14] * arg0.field4810[8] + this.field4810[13] * arg0.field4810[4] + this.field4810[12] * arg0.field4810[0];
        float var15 = this.field4810[15] * arg0.field4810[13] + this.field4810[14] * arg0.field4810[9] + this.field4810[13] * arg0.field4810[5] + this.field4810[12] * arg0.field4810[1];
        float var16 = this.field4810[15] * arg0.field4810[14] + this.field4810[14] * arg0.field4810[10] + this.field4810[12] * arg0.field4810[2] + this.field4810[13] * arg0.field4810[6];
        float var17 = this.field4810[15] * arg0.field4810[15] + this.field4810[14] * arg0.field4810[11] + this.field4810[13] * arg0.field4810[7] + this.field4810[12] * arg0.field4810[3];
        this.field4810[0] = var2;
        this.field4810[1] = var3;
        this.field4810[2] = var4;
        this.field4810[3] = var5;
        this.field4810[4] = var6;
        this.field4810[5] = var7;
        this.field4810[6] = var8;
        this.field4810[7] = var9;
        this.field4810[8] = var10;
        this.field4810[9] = var11;
        this.field4810[10] = var12;
        this.field4810[11] = var13;
        this.field4810[12] = var14;
        this.field4810[13] = var15;
        this.field4810[14] = var16;
        this.field4810[15] = var17;
    }

    @ObfuscatedName("rh.ax(Lro;S)V")
    public void method7847(class466 arg0) {
        float var2 = arg0.field4800 * arg0.field4800;
        float var3 = arg0.field4803 * arg0.field4800;
        float var4 = arg0.field4804 * arg0.field4800;
        float var5 = arg0.field4805 * arg0.field4800;
        float var6 = arg0.field4803 * arg0.field4803;
        float var7 = arg0.field4804 * arg0.field4803;
        float var8 = arg0.field4805 * arg0.field4803;
        float var9 = arg0.field4804 * arg0.field4804;
        float var10 = arg0.field4805 * arg0.field4804;
        float var11 = arg0.field4805 * arg0.field4805;
        this.field4810[0] = var2 + var6 - var11 - var9;
        this.field4810[1] = var5 + var7 + var7 + var5;
        this.field4810[2] = var8 - var4 - var4 + var8;
        this.field4810[4] = var7 - var5 - var5 + var7;
        this.field4810[5] = var2 + var9 - var6 - var11;
        this.field4810[6] = var3 + var10 + var10 + var3;
        this.field4810[8] = var4 + var8 + var8 + var4;
        this.field4810[9] = var10 - var3 - var3 + var10;
        this.field4810[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("rh.aw(Lrg;I)V")
    public void method7815(class468 arg0) {
        this.field4810[0] = arg0.field4823;
        this.field4810[1] = arg0.field4814;
        this.field4810[2] = arg0.field4817;
        this.field4810[3] = 0.0F;
        this.field4810[4] = arg0.field4822;
        this.field4810[5] = arg0.field4816;
        this.field4810[6] = arg0.field4818;
        this.field4810[7] = 0.0F;
        this.field4810[8] = arg0.field4819;
        this.field4810[9] = arg0.field4820;
        this.field4810[10] = arg0.field4821;
        this.field4810[11] = 0.0F;
        this.field4810[12] = arg0.field4813;
        this.field4810[13] = arg0.field4815;
        this.field4810[14] = arg0.field4824;
        this.field4810[15] = 1.0F;
    }

    @ObfuscatedName("rh.az(B)F")
    public float method7812() {
        return this.field4810[3] * this.field4810[6] * this.field4810[9] * this.field4810[12] + (this.field4810[3] * this.field4810[5] * this.field4810[8] * this.field4810[14] + this.field4810[3] * this.field4810[4] * this.field4810[10] * this.field4810[13] + (this.field4810[7] * this.field4810[2] * this.field4810[8] * this.field4810[13] + this.field4810[5] * this.field4810[2] * this.field4810[11] * this.field4810[12] + (this.field4810[2] * this.field4810[4] * this.field4810[9] * this.field4810[15] + this.field4810[7] * this.field4810[1] * this.field4810[10] * this.field4810[12] + (this.field4810[6] * this.field4810[1] * this.field4810[8] * this.field4810[15] + this.field4810[1] * this.field4810[4] * this.field4810[11] * this.field4810[14] + (this.field4810[0] * this.field4810[7] * this.field4810[9] * this.field4810[14] + this.field4810[0] * this.field4810[6] * this.field4810[11] * this.field4810[13] + (this.field4810[0] * this.field4810[5] * this.field4810[10] * this.field4810[15] - this.field4810[0] * this.field4810[5] * this.field4810[11] * this.field4810[14] - this.field4810[0] * this.field4810[6] * this.field4810[9] * this.field4810[15]) - this.field4810[7] * this.field4810[0] * this.field4810[10] * this.field4810[13] - this.field4810[4] * this.field4810[1] * this.field4810[10] * this.field4810[15]) - this.field4810[6] * this.field4810[1] * this.field4810[11] * this.field4810[12] - this.field4810[7] * this.field4810[1] * this.field4810[8] * this.field4810[14]) - this.field4810[2] * this.field4810[4] * this.field4810[11] * this.field4810[13] - this.field4810[5] * this.field4810[2] * this.field4810[8] * this.field4810[15]) - this.field4810[2] * this.field4810[7] * this.field4810[9] * this.field4810[12] - this.field4810[4] * this.field4810[3] * this.field4810[9] * this.field4810[14]) - this.field4810[5] * this.field4810[3] * this.field4810[10] * this.field4810[12] - this.field4810[3] * this.field4810[6] * this.field4810[8] * this.field4810[13]);
    }

    @ObfuscatedName("rh.av(I)V")
    public void method7813() {
        float var1 = 1.0F / this.method7812();
        float var2 = (this.field4810[7] * this.field4810[9] * this.field4810[14] + this.field4810[11] * this.field4810[6] * this.field4810[13] + (this.field4810[10] * this.field4810[5] * this.field4810[15] - this.field4810[11] * this.field4810[5] * this.field4810[14] - this.field4810[9] * this.field4810[6] * this.field4810[15]) - this.field4810[10] * this.field4810[7] * this.field4810[13]) * var1;
        float var3 = (this.field4810[10] * this.field4810[3] * this.field4810[13] + (this.field4810[9] * this.field4810[2] * this.field4810[15] + this.field4810[11] * this.field4810[1] * this.field4810[14] + this.field4810[10] * -this.field4810[1] * this.field4810[15] - this.field4810[2] * this.field4810[11] * this.field4810[13] - this.field4810[9] * this.field4810[3] * this.field4810[14])) * var1;
        float var4 = (this.field4810[3] * this.field4810[5] * this.field4810[14] + this.field4810[2] * this.field4810[7] * this.field4810[13] + (this.field4810[1] * this.field4810[6] * this.field4810[15] - this.field4810[7] * this.field4810[1] * this.field4810[14] - this.field4810[5] * this.field4810[2] * this.field4810[15]) - this.field4810[6] * this.field4810[3] * this.field4810[13]) * var1;
        float var5 = (this.field4810[3] * this.field4810[6] * this.field4810[9] + (this.field4810[2] * this.field4810[5] * this.field4810[11] + this.field4810[6] * -this.field4810[1] * this.field4810[11] + this.field4810[7] * this.field4810[1] * this.field4810[10] - this.field4810[2] * this.field4810[7] * this.field4810[9] - this.field4810[5] * this.field4810[3] * this.field4810[10])) * var1;
        float var6 = (this.field4810[10] * this.field4810[7] * this.field4810[12] + (this.field4810[6] * this.field4810[8] * this.field4810[15] + this.field4810[10] * -this.field4810[4] * this.field4810[15] + this.field4810[4] * this.field4810[11] * this.field4810[14] - this.field4810[6] * this.field4810[11] * this.field4810[12] - this.field4810[7] * this.field4810[8] * this.field4810[14])) * var1;
        float var7 = (this.field4810[3] * this.field4810[8] * this.field4810[14] + this.field4810[11] * this.field4810[2] * this.field4810[12] + (this.field4810[10] * this.field4810[0] * this.field4810[15] - this.field4810[0] * this.field4810[11] * this.field4810[14] - this.field4810[2] * this.field4810[8] * this.field4810[15]) - this.field4810[10] * this.field4810[3] * this.field4810[12]) * var1;
        float var8 = (this.field4810[3] * this.field4810[6] * this.field4810[12] + (this.field4810[4] * this.field4810[2] * this.field4810[15] + this.field4810[0] * this.field4810[7] * this.field4810[14] + this.field4810[6] * -this.field4810[0] * this.field4810[15] - this.field4810[2] * this.field4810[7] * this.field4810[12] - this.field4810[3] * this.field4810[4] * this.field4810[14])) * var1;
        float var9 = (this.field4810[4] * this.field4810[3] * this.field4810[10] + this.field4810[7] * this.field4810[2] * this.field4810[8] + (this.field4810[0] * this.field4810[6] * this.field4810[11] - this.field4810[7] * this.field4810[0] * this.field4810[10] - this.field4810[4] * this.field4810[2] * this.field4810[11]) - this.field4810[6] * this.field4810[3] * this.field4810[8]) * var1;
        float var10 = (this.field4810[7] * this.field4810[8] * this.field4810[13] + this.field4810[5] * this.field4810[11] * this.field4810[12] + (this.field4810[9] * this.field4810[4] * this.field4810[15] - this.field4810[11] * this.field4810[4] * this.field4810[13] - this.field4810[8] * this.field4810[5] * this.field4810[15]) - this.field4810[9] * this.field4810[7] * this.field4810[12]) * var1;
        float var11 = (this.field4810[9] * this.field4810[3] * this.field4810[12] + (this.field4810[8] * this.field4810[1] * this.field4810[15] + this.field4810[9] * -this.field4810[0] * this.field4810[15] + this.field4810[0] * this.field4810[11] * this.field4810[13] - this.field4810[1] * this.field4810[11] * this.field4810[12] - this.field4810[8] * this.field4810[3] * this.field4810[13])) * var1;
        float var12 = (this.field4810[4] * this.field4810[3] * this.field4810[13] + this.field4810[7] * this.field4810[1] * this.field4810[12] + (this.field4810[0] * this.field4810[5] * this.field4810[15] - this.field4810[0] * this.field4810[7] * this.field4810[13] - this.field4810[1] * this.field4810[4] * this.field4810[15]) - this.field4810[5] * this.field4810[3] * this.field4810[12]) * var1;
        float var13 = (this.field4810[5] * this.field4810[3] * this.field4810[8] + (this.field4810[1] * this.field4810[4] * this.field4810[11] + this.field4810[5] * -this.field4810[0] * this.field4810[11] + this.field4810[7] * this.field4810[0] * this.field4810[9] - this.field4810[1] * this.field4810[7] * this.field4810[8] - this.field4810[3] * this.field4810[4] * this.field4810[9])) * var1;
        float var14 = (this.field4810[9] * this.field4810[6] * this.field4810[12] + (this.field4810[5] * this.field4810[8] * this.field4810[14] + this.field4810[9] * -this.field4810[4] * this.field4810[14] + this.field4810[4] * this.field4810[10] * this.field4810[13] - this.field4810[5] * this.field4810[10] * this.field4810[12] - this.field4810[8] * this.field4810[6] * this.field4810[13])) * var1;
        float var15 = (this.field4810[8] * this.field4810[2] * this.field4810[13] + this.field4810[1] * this.field4810[10] * this.field4810[12] + (this.field4810[9] * this.field4810[0] * this.field4810[14] - this.field4810[0] * this.field4810[10] * this.field4810[13] - this.field4810[8] * this.field4810[1] * this.field4810[14]) - this.field4810[2] * this.field4810[9] * this.field4810[12]) * var1;
        float var16 = (this.field4810[5] * this.field4810[2] * this.field4810[12] + (this.field4810[4] * this.field4810[1] * this.field4810[14] + this.field4810[6] * this.field4810[0] * this.field4810[13] + this.field4810[5] * -this.field4810[0] * this.field4810[14] - this.field4810[1] * this.field4810[6] * this.field4810[12] - this.field4810[2] * this.field4810[4] * this.field4810[13])) * var1;
        float var17 = (this.field4810[2] * this.field4810[4] * this.field4810[9] + this.field4810[1] * this.field4810[6] * this.field4810[8] + (this.field4810[5] * this.field4810[0] * this.field4810[10] - this.field4810[0] * this.field4810[6] * this.field4810[9] - this.field4810[4] * this.field4810[1] * this.field4810[10]) - this.field4810[2] * this.field4810[5] * this.field4810[8]) * var1;
        this.field4810[0] = var2;
        this.field4810[1] = var3;
        this.field4810[2] = var4;
        this.field4810[3] = var5;
        this.field4810[4] = var6;
        this.field4810[5] = var7;
        this.field4810[6] = var8;
        this.field4810[7] = var9;
        this.field4810[8] = var10;
        this.field4810[9] = var11;
        this.field4810[10] = var12;
        this.field4810[11] = var13;
        this.field4810[12] = var14;
        this.field4810[13] = var15;
        this.field4810[14] = var16;
        this.field4810[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7799();
        this.method7801();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4810[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4810);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class467)) {
            return false;
        }
        class467 var2 = (class467) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4810[var3] != var2.field4810[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("rh.ak(B)[F")
    public float[] method7817() {
        float[] var1 = new float[3];
        class465 var2 = new class465(this.field4810[0], this.field4810[1], this.field4810[2]);
        class465 var3 = new class465(this.field4810[4], this.field4810[5], this.field4810[6]);
        class465 var4 = new class465(this.field4810[8], this.field4810[9], this.field4810[10]);
        var1[0] = var2.method7761();
        var1[1] = var3.method7761();
        var1[2] = var4.method7761();
        return var1;
    }
}
