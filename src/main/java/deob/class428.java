package deob;

import java.util.Arrays;

@ObfuscatedName("qf")
public final class class428 {

    @ObfuscatedName("qf.ae")
    public static class428[] field4735 = new class428[0];

    @ObfuscatedName("qf.ax")
    public float[] field4738 = new float[16];

    @ObfuscatedName("qf.aq")
    public static final class428 field4734;

    static {
        method3975(100);
        field4734 = new class428();
    }

    @ObfuscatedName("if.ac(IB)V")
    public static void method3975(int arg0) {
        Statics.field4736 = arg0;
        field4735 = new class428[arg0];
        Statics.field4739 = 0;
    }

    @ObfuscatedName("gw.ae(I)Lqf;")
    public static class428 method3414() {
        class428[] var0 = field4735;
        synchronized (field4735) {
            if (Statics.field4739 == 0) {
                return new class428();
            } else {
                field4735[--Statics.field4739].method7362();
                return field4735[Statics.field4739];
            }
        }
    }

    @ObfuscatedName("qf.ag(I)V")
    public void method7357() {
        class428[] var1 = field4735;
        synchronized (field4735) {
            if (Statics.field4739 < Statics.field4736 - 1) {
                field4735[++Statics.field4739 - 1] = this;
            }
        }
    }

    public class428() {
        this.method7362();
    }

    public class428(class428 arg0) {
        this.method7364(arg0);
    }

    public class428(class551 arg0, boolean arg1) {
        this.method7359(arg0, arg1);
    }

    @ObfuscatedName("qf.am(Lvf;ZI)V")
    public void method7359(class551 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4738[var4] = arg0.method8981();
            }
            return;
        }
        class429 var3 = new class429();
        var3.method7442(class500.method6075(arg0.method8977()));
        var3.method7443(class500.method6075(arg0.method8977()));
        var3.method7444(class500.method6075(arg0.method8977()));
        var3.method7449((float) arg0.method8977(), (float) arg0.method8977(), (float) arg0.method8977());
        this.method7384(var3);
    }

    @ObfuscatedName("qf.ax(B)[F")
    public float[] method7360() {
        float[] var1 = new float[3];
        if ((double) this.field4738[2] < 0.999D && (double) this.field4738[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4738[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4738[6] / var2, (double) this.field4738[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4738[1] / var2, (double) this.field4738[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4738[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4738[9]), (double) this.field4738[5]);
        }
        return var1;
    }

    @ObfuscatedName("qf.aq(B)[F")
    public float[] method7361() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4738[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4738[2];
            double var6 = (double) this.field4738[10];
            double var8 = (double) this.field4738[4];
            double var10 = (double) this.field4738[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4738[1];
            double var14 = (double) this.field4738[0];
            if (this.field4738[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("qf.af(S)V")
    public void method7362() {
        this.field4738[0] = 1.0F;
        this.field4738[1] = 0.0F;
        this.field4738[2] = 0.0F;
        this.field4738[3] = 0.0F;
        this.field4738[4] = 0.0F;
        this.field4738[5] = 1.0F;
        this.field4738[6] = 0.0F;
        this.field4738[7] = 0.0F;
        this.field4738[8] = 0.0F;
        this.field4738[9] = 0.0F;
        this.field4738[10] = 1.0F;
        this.field4738[11] = 0.0F;
        this.field4738[12] = 0.0F;
        this.field4738[13] = 0.0F;
        this.field4738[14] = 0.0F;
        this.field4738[15] = 1.0F;
    }

    @ObfuscatedName("qf.at(B)V")
    public void method7363() {
        this.field4738[0] = 0.0F;
        this.field4738[1] = 0.0F;
        this.field4738[2] = 0.0F;
        this.field4738[3] = 0.0F;
        this.field4738[4] = 0.0F;
        this.field4738[5] = 0.0F;
        this.field4738[6] = 0.0F;
        this.field4738[7] = 0.0F;
        this.field4738[8] = 0.0F;
        this.field4738[9] = 0.0F;
        this.field4738[10] = 0.0F;
        this.field4738[11] = 0.0F;
        this.field4738[12] = 0.0F;
        this.field4738[13] = 0.0F;
        this.field4738[14] = 0.0F;
        this.field4738[15] = 0.0F;
    }

    @ObfuscatedName("qf.au(Lqf;I)V")
    public void method7364(class428 arg0) {
        System.arraycopy(arg0.field4738, 0, this.field4738, 0, 16);
    }

    @ObfuscatedName("qf.ar(FB)V")
    public void method7434(float arg0) {
        this.method7365(arg0, arg0, arg0);
    }

    @ObfuscatedName("qf.al(FFFI)V")
    public void method7365(float arg0, float arg1, float arg2) {
        this.method7362();
        this.field4738[0] = arg0;
        this.field4738[5] = arg1;
        this.field4738[10] = arg2;
    }

    @ObfuscatedName("qf.ad(Lqf;I)V")
    public void method7376(class428 arg0) {
        for (int var2 = 0; var2 < this.field4738.length; var2++) {
            this.field4738[var2] += arg0.field4738[var2];
        }
    }

    @ObfuscatedName("qf.ah(Lqf;I)V")
    public void method7367(class428 arg0) {
        float var2 = this.field4738[3] * arg0.field4738[12] + this.field4738[2] * arg0.field4738[8] + this.field4738[1] * arg0.field4738[4] + this.field4738[0] * arg0.field4738[0];
        float var3 = this.field4738[3] * arg0.field4738[13] + this.field4738[2] * arg0.field4738[9] + this.field4738[1] * arg0.field4738[5] + this.field4738[0] * arg0.field4738[1];
        float var4 = this.field4738[3] * arg0.field4738[14] + this.field4738[2] * arg0.field4738[10] + this.field4738[1] * arg0.field4738[6] + this.field4738[0] * arg0.field4738[2];
        float var5 = this.field4738[3] * arg0.field4738[15] + this.field4738[2] * arg0.field4738[11] + this.field4738[0] * arg0.field4738[3] + this.field4738[1] * arg0.field4738[7];
        float var6 = this.field4738[7] * arg0.field4738[12] + this.field4738[6] * arg0.field4738[8] + this.field4738[5] * arg0.field4738[4] + this.field4738[4] * arg0.field4738[0];
        float var7 = this.field4738[7] * arg0.field4738[13] + this.field4738[6] * arg0.field4738[9] + this.field4738[5] * arg0.field4738[5] + this.field4738[4] * arg0.field4738[1];
        float var8 = this.field4738[7] * arg0.field4738[14] + this.field4738[6] * arg0.field4738[10] + this.field4738[5] * arg0.field4738[6] + this.field4738[4] * arg0.field4738[2];
        float var9 = this.field4738[7] * arg0.field4738[15] + this.field4738[6] * arg0.field4738[11] + this.field4738[4] * arg0.field4738[3] + this.field4738[5] * arg0.field4738[7];
        float var10 = this.field4738[11] * arg0.field4738[12] + this.field4738[10] * arg0.field4738[8] + this.field4738[8] * arg0.field4738[0] + this.field4738[9] * arg0.field4738[4];
        float var11 = this.field4738[11] * arg0.field4738[13] + this.field4738[10] * arg0.field4738[9] + this.field4738[8] * arg0.field4738[1] + this.field4738[9] * arg0.field4738[5];
        float var12 = this.field4738[11] * arg0.field4738[14] + this.field4738[10] * arg0.field4738[10] + this.field4738[8] * arg0.field4738[2] + this.field4738[9] * arg0.field4738[6];
        float var13 = this.field4738[11] * arg0.field4738[15] + this.field4738[10] * arg0.field4738[11] + this.field4738[9] * arg0.field4738[7] + this.field4738[8] * arg0.field4738[3];
        float var14 = this.field4738[15] * arg0.field4738[12] + this.field4738[14] * arg0.field4738[8] + this.field4738[12] * arg0.field4738[0] + this.field4738[13] * arg0.field4738[4];
        float var15 = this.field4738[15] * arg0.field4738[13] + this.field4738[14] * arg0.field4738[9] + this.field4738[12] * arg0.field4738[1] + this.field4738[13] * arg0.field4738[5];
        float var16 = this.field4738[15] * arg0.field4738[14] + this.field4738[14] * arg0.field4738[10] + this.field4738[12] * arg0.field4738[2] + this.field4738[13] * arg0.field4738[6];
        float var17 = this.field4738[15] * arg0.field4738[15] + this.field4738[14] * arg0.field4738[11] + this.field4738[13] * arg0.field4738[7] + this.field4738[12] * arg0.field4738[3];
        this.field4738[0] = var2;
        this.field4738[1] = var3;
        this.field4738[2] = var4;
        this.field4738[3] = var5;
        this.field4738[4] = var6;
        this.field4738[5] = var7;
        this.field4738[6] = var8;
        this.field4738[7] = var9;
        this.field4738[8] = var10;
        this.field4738[9] = var11;
        this.field4738[10] = var12;
        this.field4738[11] = var13;
        this.field4738[12] = var14;
        this.field4738[13] = var15;
        this.field4738[14] = var16;
        this.field4738[15] = var17;
    }

    @ObfuscatedName("qf.ap(Lqh;I)V")
    public void method7368(class422 arg0) {
        float var2 = arg0.field4705.field4732 * arg0.field4705.field4732;
        float var3 = arg0.field4705.field4732 * arg0.field4705.field4729;
        float var4 = arg0.field4705.field4733 * arg0.field4705.field4732;
        float var5 = arg0.field4705.field4732 * arg0.field4705.field4731;
        float var6 = arg0.field4705.field4729 * arg0.field4705.field4729;
        float var7 = arg0.field4705.field4733 * arg0.field4705.field4729;
        float var8 = arg0.field4705.field4731 * arg0.field4705.field4729;
        float var9 = arg0.field4705.field4733 * arg0.field4705.field4733;
        float var10 = arg0.field4705.field4733 * arg0.field4705.field4731;
        float var11 = arg0.field4705.field4731 * arg0.field4705.field4731;
        this.field4738[0] = var2 + var6 - var11 - var9;
        this.field4738[1] = var5 + var7 + var7 + var5;
        this.field4738[2] = var8 - var4 - var4 + var8;
        this.field4738[4] = var7 - var5 - var5 + var7;
        this.field4738[5] = var2 + var9 - var6 - var11;
        this.field4738[6] = var3 + var10 + var10 + var3;
        this.field4738[8] = var4 + var8 + var8 + var4;
        this.field4738[9] = var10 - var3 - var3 + var10;
        this.field4738[10] = var2 + var11 - var9 - var6;
        float[] var12 = this.field4738;
        float[] var13 = this.field4738;
        this.field4738[11] = 0.0F;
        var13[7] = 0.0F;
        var12[3] = 0.0F;
        this.field4738[12] = arg0.field4708.field4717;
        this.field4738[13] = arg0.field4708.field4720;
        this.field4738[14] = arg0.field4708.field4721;
        this.field4738[15] = 1.0F;
    }

    @ObfuscatedName("qf.ab(Lqd;I)V")
    public void method7369(class427 arg0) {
        float var2 = arg0.field4732 * arg0.field4732;
        float var3 = arg0.field4732 * arg0.field4729;
        float var4 = arg0.field4733 * arg0.field4732;
        float var5 = arg0.field4732 * arg0.field4731;
        float var6 = arg0.field4729 * arg0.field4729;
        float var7 = arg0.field4733 * arg0.field4729;
        float var8 = arg0.field4731 * arg0.field4729;
        float var9 = arg0.field4733 * arg0.field4733;
        float var10 = arg0.field4733 * arg0.field4731;
        float var11 = arg0.field4731 * arg0.field4731;
        this.field4738[0] = var2 + var6 - var11 - var9;
        this.field4738[1] = var5 + var7 + var7 + var5;
        this.field4738[2] = var8 - var4 - var4 + var8;
        this.field4738[4] = var7 - var5 - var5 + var7;
        this.field4738[5] = var2 + var9 - var6 - var11;
        this.field4738[6] = var3 + var10 + var10 + var3;
        this.field4738[8] = var4 + var8 + var8 + var4;
        this.field4738[9] = var10 - var3 - var3 + var10;
        this.field4738[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("qf.az(Lqx;I)V")
    public void method7384(class429 arg0) {
        this.field4738[0] = arg0.field4751;
        this.field4738[1] = arg0.field4753;
        this.field4738[2] = arg0.field4744;
        this.field4738[3] = 0.0F;
        this.field4738[4] = arg0.field4745;
        this.field4738[5] = arg0.field4746;
        this.field4738[6] = arg0.field4747;
        this.field4738[7] = 0.0F;
        this.field4738[8] = arg0.field4748;
        this.field4738[9] = arg0.field4743;
        this.field4738[10] = arg0.field4750;
        this.field4738[11] = 0.0F;
        this.field4738[12] = arg0.field4749;
        this.field4738[13] = arg0.field4752;
        this.field4738[14] = arg0.field4742;
        this.field4738[15] = 1.0F;
    }

    @ObfuscatedName("qf.aa(I)F")
    public float method7417() {
        return this.field4738[3] * this.field4738[6] * this.field4738[9] * this.field4738[12] + (this.field4738[3] * this.field4738[5] * this.field4738[8] * this.field4738[14] + this.field4738[3] * this.field4738[4] * this.field4738[10] * this.field4738[13] + (this.field4738[7] * this.field4738[2] * this.field4738[8] * this.field4738[13] + this.field4738[5] * this.field4738[2] * this.field4738[11] * this.field4738[12] + (this.field4738[2] * this.field4738[4] * this.field4738[9] * this.field4738[15] + this.field4738[1] * this.field4738[7] * this.field4738[10] * this.field4738[12] + (this.field4738[1] * this.field4738[6] * this.field4738[8] * this.field4738[15] + this.field4738[1] * this.field4738[4] * this.field4738[11] * this.field4738[14] + (this.field4738[7] * this.field4738[0] * this.field4738[9] * this.field4738[14] + this.field4738[6] * this.field4738[0] * this.field4738[11] * this.field4738[13] + (this.field4738[0] * this.field4738[5] * this.field4738[10] * this.field4738[15] - this.field4738[5] * this.field4738[0] * this.field4738[11] * this.field4738[14] - this.field4738[6] * this.field4738[0] * this.field4738[9] * this.field4738[15]) - this.field4738[7] * this.field4738[0] * this.field4738[10] * this.field4738[13] - this.field4738[1] * this.field4738[4] * this.field4738[10] * this.field4738[15]) - this.field4738[6] * this.field4738[1] * this.field4738[11] * this.field4738[12] - this.field4738[1] * this.field4738[7] * this.field4738[8] * this.field4738[14]) - this.field4738[2] * this.field4738[4] * this.field4738[11] * this.field4738[13] - this.field4738[2] * this.field4738[5] * this.field4738[8] * this.field4738[15]) - this.field4738[2] * this.field4738[7] * this.field4738[9] * this.field4738[12] - this.field4738[3] * this.field4738[4] * this.field4738[9] * this.field4738[14]) - this.field4738[5] * this.field4738[3] * this.field4738[10] * this.field4738[12] - this.field4738[6] * this.field4738[3] * this.field4738[8] * this.field4738[13]);
    }

    @ObfuscatedName("qf.ai(B)V")
    public void method7371() {
        float var1 = 1.0F / this.method7417();
        float var2 = (this.field4738[9] * this.field4738[7] * this.field4738[14] + this.field4738[6] * this.field4738[11] * this.field4738[13] + (this.field4738[10] * this.field4738[5] * this.field4738[15] - this.field4738[11] * this.field4738[5] * this.field4738[14] - this.field4738[6] * this.field4738[9] * this.field4738[15]) - this.field4738[10] * this.field4738[7] * this.field4738[13]) * var1;
        float var3 = (this.field4738[10] * this.field4738[3] * this.field4738[13] + (this.field4738[2] * this.field4738[9] * this.field4738[15] + this.field4738[1] * this.field4738[11] * this.field4738[14] + this.field4738[10] * -this.field4738[1] * this.field4738[15] - this.field4738[11] * this.field4738[2] * this.field4738[13] - this.field4738[9] * this.field4738[3] * this.field4738[14])) * var1;
        float var4 = (this.field4738[3] * this.field4738[5] * this.field4738[14] + this.field4738[2] * this.field4738[7] * this.field4738[13] + (this.field4738[6] * this.field4738[1] * this.field4738[15] - this.field4738[1] * this.field4738[7] * this.field4738[14] - this.field4738[2] * this.field4738[5] * this.field4738[15]) - this.field4738[6] * this.field4738[3] * this.field4738[13]) * var1;
        float var5 = (this.field4738[6] * this.field4738[3] * this.field4738[9] + (this.field4738[2] * this.field4738[5] * this.field4738[11] + this.field4738[6] * -this.field4738[1] * this.field4738[11] + this.field4738[7] * this.field4738[1] * this.field4738[10] - this.field4738[2] * this.field4738[7] * this.field4738[9] - this.field4738[5] * this.field4738[3] * this.field4738[10])) * var1;
        float var6 = (this.field4738[7] * this.field4738[10] * this.field4738[12] + (this.field4738[8] * this.field4738[6] * this.field4738[15] + this.field4738[11] * this.field4738[4] * this.field4738[14] + this.field4738[10] * -this.field4738[4] * this.field4738[15] - this.field4738[11] * this.field4738[6] * this.field4738[12] - this.field4738[8] * this.field4738[7] * this.field4738[14])) * var1;
        float var7 = (this.field4738[3] * this.field4738[8] * this.field4738[14] + this.field4738[2] * this.field4738[11] * this.field4738[12] + (this.field4738[10] * this.field4738[0] * this.field4738[15] - this.field4738[0] * this.field4738[11] * this.field4738[14] - this.field4738[2] * this.field4738[8] * this.field4738[15]) - this.field4738[10] * this.field4738[3] * this.field4738[12]) * var1;
        float var8 = (this.field4738[3] * this.field4738[6] * this.field4738[12] + (this.field4738[4] * this.field4738[2] * this.field4738[15] + this.field4738[6] * -this.field4738[0] * this.field4738[15] + this.field4738[7] * this.field4738[0] * this.field4738[14] - this.field4738[7] * this.field4738[2] * this.field4738[12] - this.field4738[4] * this.field4738[3] * this.field4738[14])) * var1;
        float var9 = (this.field4738[3] * this.field4738[4] * this.field4738[10] + this.field4738[2] * this.field4738[7] * this.field4738[8] + (this.field4738[6] * this.field4738[0] * this.field4738[11] - this.field4738[7] * this.field4738[0] * this.field4738[10] - this.field4738[4] * this.field4738[2] * this.field4738[11]) - this.field4738[6] * this.field4738[3] * this.field4738[8]) * var1;
        float var10 = (this.field4738[8] * this.field4738[7] * this.field4738[13] + this.field4738[11] * this.field4738[5] * this.field4738[12] + (this.field4738[9] * this.field4738[4] * this.field4738[15] - this.field4738[4] * this.field4738[11] * this.field4738[13] - this.field4738[5] * this.field4738[8] * this.field4738[15]) - this.field4738[9] * this.field4738[7] * this.field4738[12]) * var1;
        float var11 = (this.field4738[3] * this.field4738[9] * this.field4738[12] + (this.field4738[8] * this.field4738[1] * this.field4738[15] + this.field4738[0] * this.field4738[11] * this.field4738[13] + this.field4738[9] * -this.field4738[0] * this.field4738[15] - this.field4738[1] * this.field4738[11] * this.field4738[12] - this.field4738[8] * this.field4738[3] * this.field4738[13])) * var1;
        float var12 = (this.field4738[4] * this.field4738[3] * this.field4738[13] + this.field4738[7] * this.field4738[1] * this.field4738[12] + (this.field4738[0] * this.field4738[5] * this.field4738[15] - this.field4738[7] * this.field4738[0] * this.field4738[13] - this.field4738[1] * this.field4738[4] * this.field4738[15]) - this.field4738[3] * this.field4738[5] * this.field4738[12]) * var1;
        float var13 = (this.field4738[3] * this.field4738[5] * this.field4738[8] + (this.field4738[4] * this.field4738[1] * this.field4738[11] + this.field4738[0] * this.field4738[7] * this.field4738[9] + this.field4738[5] * -this.field4738[0] * this.field4738[11] - this.field4738[7] * this.field4738[1] * this.field4738[8] - this.field4738[4] * this.field4738[3] * this.field4738[9])) * var1;
        float var14 = (this.field4738[6] * this.field4738[9] * this.field4738[12] + (this.field4738[8] * this.field4738[5] * this.field4738[14] + this.field4738[9] * -this.field4738[4] * this.field4738[14] + this.field4738[4] * this.field4738[10] * this.field4738[13] - this.field4738[5] * this.field4738[10] * this.field4738[12] - this.field4738[8] * this.field4738[6] * this.field4738[13])) * var1;
        float var15 = (this.field4738[8] * this.field4738[2] * this.field4738[13] + this.field4738[1] * this.field4738[10] * this.field4738[12] + (this.field4738[0] * this.field4738[9] * this.field4738[14] - this.field4738[10] * this.field4738[0] * this.field4738[13] - this.field4738[8] * this.field4738[1] * this.field4738[14]) - this.field4738[2] * this.field4738[9] * this.field4738[12]) * var1;
        float var16 = (this.field4738[5] * this.field4738[2] * this.field4738[12] + (this.field4738[4] * this.field4738[1] * this.field4738[14] + this.field4738[5] * -this.field4738[0] * this.field4738[14] + this.field4738[0] * this.field4738[6] * this.field4738[13] - this.field4738[6] * this.field4738[1] * this.field4738[12] - this.field4738[4] * this.field4738[2] * this.field4738[13])) * var1;
        float var17 = (this.field4738[2] * this.field4738[4] * this.field4738[9] + this.field4738[6] * this.field4738[1] * this.field4738[8] + (this.field4738[0] * this.field4738[5] * this.field4738[10] - this.field4738[6] * this.field4738[0] * this.field4738[9] - this.field4738[4] * this.field4738[1] * this.field4738[10]) - this.field4738[2] * this.field4738[5] * this.field4738[8]) * var1;
        this.field4738[0] = var2;
        this.field4738[1] = var3;
        this.field4738[2] = var4;
        this.field4738[3] = var5;
        this.field4738[4] = var6;
        this.field4738[5] = var7;
        this.field4738[6] = var8;
        this.field4738[7] = var9;
        this.field4738[8] = var10;
        this.field4738[9] = var11;
        this.field4738[10] = var12;
        this.field4738[11] = var13;
        this.field4738[12] = var14;
        this.field4738[13] = var15;
        this.field4738[14] = var16;
        this.field4738[15] = var17;
    }

    @ObfuscatedName("qf.ao(FFFFS)V")
    public void method7407(float arg0, float arg1, float arg2, float arg3) {
        this.field4738[0] = arg0;
        this.field4738[1] = 0.0F;
        this.field4738[2] = 0.0F;
        this.field4738[3] = 0.0F;
        this.field4738[4] = 0.0F;
        this.field4738[5] = arg1;
        this.field4738[6] = 0.0F;
        this.field4738[7] = 0.0F;
        this.field4738[8] = 0.0F;
        this.field4738[9] = 0.0F;
        this.field4738[10] = arg2;
        this.field4738[11] = 0.0F;
        this.field4738[12] = 0.0F;
        this.field4738[13] = 0.0F;
        this.field4738[14] = 0.0F;
        this.field4738[15] = arg3;
    }

    @ObfuscatedName("qf.as(FFF[FI)V")
    public void method7414(float arg0, float arg1, float arg2, float[] arg3) {
        arg3[0] = this.field4738[8] * arg2 + this.field4738[0] * arg0 + this.field4738[4] * arg1 + this.field4738[12];
        arg3[1] = this.field4738[9] * arg2 + this.field4738[5] * arg1 + this.field4738[1] * arg0 + this.field4738[13];
        arg3[2] = this.field4738[10] * arg2 + this.field4738[2] * arg0 + this.field4738[6] * arg1 + this.field4738[14];
        if (arg3.length > 3) {
            arg3[3] = this.field4738[11] * arg2 + this.field4738[3] * arg0 + this.field4738[7] * arg1 + this.field4738[15];
        }
    }

    @ObfuscatedName("qf.ay(FFFI)F")
    public float method7373(float arg0, float arg1, float arg2) {
        return this.field4738[8] * arg2 + this.field4738[4] * arg1 + this.field4738[0] * arg0 + this.field4738[12];
    }

    @ObfuscatedName("qf.aj(FFFI)F")
    public float method7374(float arg0, float arg1, float arg2) {
        return this.field4738[9] * arg2 + this.field4738[1] * arg0 + this.field4738[5] * arg1 + this.field4738[13];
    }

    @ObfuscatedName("qf.av(FFFI)F")
    public float method7375(float arg0, float arg1, float arg2) {
        return this.field4738[10] * arg2 + this.field4738[6] * arg1 + this.field4738[2] * arg0 + this.field4738[14];
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7361();
        this.method7360();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4738[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4738);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class428)) {
            return false;
        }
        class428 var2 = (class428) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4738[var3] != var2.field4738[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("qf.aw(I)[F")
    public float[] method7377() {
        float[] var1 = new float[3];
        class426 var2 = new class426(this.field4738[0], this.field4738[1], this.field4738[2]);
        class426 var3 = new class426(this.field4738[4], this.field4738[5], this.field4738[6]);
        class426 var4 = new class426(this.field4738[8], this.field4738[9], this.field4738[10]);
        var1[0] = var2.method7305();
        var1[1] = var3.method7305();
        var1[2] = var4.method7305();
        return var1;
    }
}
