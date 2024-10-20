package deob;

import java.util.Arrays;

@ObfuscatedName("rm")
public final class class452 {

    @ObfuscatedName("rm.ay")
    public static class452[] field4745 = new class452[0];

    @ObfuscatedName("rm.ar")
    public static int field4741 = 100;

    @ObfuscatedName("rm.am")
    public static int field4743;

    @ObfuscatedName("rm.as")
    public float[] field4744 = new float[16];

    @ObfuscatedName("rm.aj")
    public static final class452 field4740;

    static {
        field4745 = new class452[100];
        field4743 = 0;
        field4740 = new class452();
    }

    @ObfuscatedName("fj.aw(B)Lrm;")
    public static class452 method2947() {
        class452[] var0 = field4745;
        synchronized (field4745) {
            if (field4743 == 0) {
                return new class452();
            } else {
                field4745[--field4743].method7489();
                return field4745[field4743];
            }
        }
    }

    @ObfuscatedName("rm.ay(I)V")
    public void method7519() {
        class452[] var1 = field4745;
        synchronized (field4745) {
            if (field4743 < field4741 - 1) {
                field4745[++field4743 - 1] = this;
            }
        }
    }

    public class452() {
        this.method7489();
    }

    public class452(class452 arg0) {
        this.method7529(arg0);
    }

    public class452(class514 arg0, boolean arg1) {
        this.method7486(arg0, arg1);
    }

    @ObfuscatedName("rm.ar(Lty;ZI)V")
    public void method7486(class514 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4744[var16] = arg0.method8252();
            }
            return;
        }
        class453 var3 = new class453();
        int var5 = arg0.method8497();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7555(var7);
        int var9 = arg0.method8497();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7556(var11);
        int var13 = arg0.method8497();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7569(var15);
        var3.method7558((float) arg0.method8497(), (float) arg0.method8497(), (float) arg0.method8497());
        this.method7488(var3);
    }

    @ObfuscatedName("rm.am(I)[F")
    public float[] method7487() {
        float[] var1 = new float[3];
        if ((double) this.field4744[2] < 0.999D && (double) this.field4744[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4744[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4744[6] / var2, (double) this.field4744[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4744[1] / var2, (double) this.field4744[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4744[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4744[9]), (double) this.field4744[5]);
        }
        return var1;
    }

    @ObfuscatedName("rm.as(I)[F")
    public float[] method7497() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4744[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4744[2];
            double var6 = (double) this.field4744[10];
            double var8 = (double) this.field4744[4];
            double var10 = (double) this.field4744[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4744[1];
            double var14 = (double) this.field4744[0];
            if (this.field4744[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("rm.aj(B)V")
    public void method7489() {
        this.field4744[0] = 1.0F;
        this.field4744[1] = 0.0F;
        this.field4744[2] = 0.0F;
        this.field4744[3] = 0.0F;
        this.field4744[4] = 0.0F;
        this.field4744[5] = 1.0F;
        this.field4744[6] = 0.0F;
        this.field4744[7] = 0.0F;
        this.field4744[8] = 0.0F;
        this.field4744[9] = 0.0F;
        this.field4744[10] = 1.0F;
        this.field4744[11] = 0.0F;
        this.field4744[12] = 0.0F;
        this.field4744[13] = 0.0F;
        this.field4744[14] = 0.0F;
        this.field4744[15] = 1.0F;
    }

    @ObfuscatedName("rm.ag(I)V")
    public void method7490() {
        this.field4744[0] = 0.0F;
        this.field4744[1] = 0.0F;
        this.field4744[2] = 0.0F;
        this.field4744[3] = 0.0F;
        this.field4744[4] = 0.0F;
        this.field4744[5] = 0.0F;
        this.field4744[6] = 0.0F;
        this.field4744[7] = 0.0F;
        this.field4744[8] = 0.0F;
        this.field4744[9] = 0.0F;
        this.field4744[10] = 0.0F;
        this.field4744[11] = 0.0F;
        this.field4744[12] = 0.0F;
        this.field4744[13] = 0.0F;
        this.field4744[14] = 0.0F;
        this.field4744[15] = 0.0F;
    }

    @ObfuscatedName("rm.az(Lrm;B)V")
    public void method7529(class452 arg0) {
        System.arraycopy(arg0.field4744, 0, this.field4744, 0, 16);
    }

    @ObfuscatedName("rm.av(FI)V")
    public void method7492(float arg0) {
        this.method7506(arg0, arg0, arg0);
    }

    @ObfuscatedName("rm.ap(FFFI)V")
    public void method7506(float arg0, float arg1, float arg2) {
        this.method7489();
        this.field4744[0] = arg0;
        this.field4744[5] = arg1;
        this.field4744[10] = arg2;
    }

    @ObfuscatedName("rm.aq(Lrm;S)V")
    public void method7494(class452 arg0) {
        for (int var2 = 0; var2 < this.field4744.length; var2++) {
            this.field4744[var2] += arg0.field4744[var2];
        }
    }

    @ObfuscatedName("rm.at(Lrm;S)V")
    public void method7525(class452 arg0) {
        float var2 = this.field4744[3] * arg0.field4744[12] + this.field4744[2] * arg0.field4744[8] + this.field4744[0] * arg0.field4744[0] + this.field4744[1] * arg0.field4744[4];
        float var3 = this.field4744[3] * arg0.field4744[13] + this.field4744[2] * arg0.field4744[9] + this.field4744[1] * arg0.field4744[5] + this.field4744[0] * arg0.field4744[1];
        float var4 = this.field4744[3] * arg0.field4744[14] + this.field4744[2] * arg0.field4744[10] + this.field4744[0] * arg0.field4744[2] + this.field4744[1] * arg0.field4744[6];
        float var5 = this.field4744[3] * arg0.field4744[15] + this.field4744[2] * arg0.field4744[11] + this.field4744[0] * arg0.field4744[3] + this.field4744[1] * arg0.field4744[7];
        float var6 = this.field4744[7] * arg0.field4744[12] + this.field4744[6] * arg0.field4744[8] + this.field4744[4] * arg0.field4744[0] + this.field4744[5] * arg0.field4744[4];
        float var7 = this.field4744[7] * arg0.field4744[13] + this.field4744[6] * arg0.field4744[9] + this.field4744[4] * arg0.field4744[1] + this.field4744[5] * arg0.field4744[5];
        float var8 = this.field4744[7] * arg0.field4744[14] + this.field4744[6] * arg0.field4744[10] + this.field4744[4] * arg0.field4744[2] + this.field4744[5] * arg0.field4744[6];
        float var9 = this.field4744[7] * arg0.field4744[15] + this.field4744[6] * arg0.field4744[11] + this.field4744[5] * arg0.field4744[7] + this.field4744[4] * arg0.field4744[3];
        float var10 = this.field4744[11] * arg0.field4744[12] + this.field4744[10] * arg0.field4744[8] + this.field4744[9] * arg0.field4744[4] + this.field4744[8] * arg0.field4744[0];
        float var11 = this.field4744[11] * arg0.field4744[13] + this.field4744[10] * arg0.field4744[9] + this.field4744[8] * arg0.field4744[1] + this.field4744[9] * arg0.field4744[5];
        float var12 = this.field4744[11] * arg0.field4744[14] + this.field4744[10] * arg0.field4744[10] + this.field4744[8] * arg0.field4744[2] + this.field4744[9] * arg0.field4744[6];
        float var13 = this.field4744[11] * arg0.field4744[15] + this.field4744[10] * arg0.field4744[11] + this.field4744[8] * arg0.field4744[3] + this.field4744[9] * arg0.field4744[7];
        float var14 = this.field4744[15] * arg0.field4744[12] + this.field4744[14] * arg0.field4744[8] + this.field4744[13] * arg0.field4744[4] + this.field4744[12] * arg0.field4744[0];
        float var15 = this.field4744[15] * arg0.field4744[13] + this.field4744[14] * arg0.field4744[9] + this.field4744[13] * arg0.field4744[5] + this.field4744[12] * arg0.field4744[1];
        float var16 = this.field4744[15] * arg0.field4744[14] + this.field4744[14] * arg0.field4744[10] + this.field4744[12] * arg0.field4744[2] + this.field4744[13] * arg0.field4744[6];
        float var17 = this.field4744[15] * arg0.field4744[15] + this.field4744[14] * arg0.field4744[11] + this.field4744[13] * arg0.field4744[7] + this.field4744[12] * arg0.field4744[3];
        this.field4744[0] = var2;
        this.field4744[1] = var3;
        this.field4744[2] = var4;
        this.field4744[3] = var5;
        this.field4744[4] = var6;
        this.field4744[5] = var7;
        this.field4744[6] = var8;
        this.field4744[7] = var9;
        this.field4744[8] = var10;
        this.field4744[9] = var11;
        this.field4744[10] = var12;
        this.field4744[11] = var13;
        this.field4744[12] = var14;
        this.field4744[13] = var15;
        this.field4744[14] = var16;
        this.field4744[15] = var17;
    }

    @ObfuscatedName("rm.ah(Lrj;I)V")
    public void method7495(class451 arg0) {
        float var2 = arg0.field4736 * arg0.field4736;
        float var3 = arg0.field4737 * arg0.field4736;
        float var4 = arg0.field4736 * arg0.field4734;
        float var5 = arg0.field4738 * arg0.field4736;
        float var6 = arg0.field4737 * arg0.field4737;
        float var7 = arg0.field4737 * arg0.field4734;
        float var8 = arg0.field4738 * arg0.field4737;
        float var9 = arg0.field4734 * arg0.field4734;
        float var10 = arg0.field4738 * arg0.field4734;
        float var11 = arg0.field4738 * arg0.field4738;
        this.field4744[0] = var2 + var6 - var11 - var9;
        this.field4744[1] = var5 + var7 + var7 + var5;
        this.field4744[2] = var8 - var4 - var4 + var8;
        this.field4744[4] = var7 - var5 - var5 + var7;
        this.field4744[5] = var2 + var9 - var6 - var11;
        this.field4744[6] = var3 + var10 + var10 + var3;
        this.field4744[8] = var4 + var8 + var8 + var4;
        this.field4744[9] = var10 - var3 - var3 + var10;
        this.field4744[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("rm.ax(Lrv;I)V")
    public void method7488(class453 arg0) {
        this.field4744[0] = arg0.field4751;
        this.field4744[1] = arg0.field4747;
        this.field4744[2] = arg0.field4748;
        this.field4744[3] = 0.0F;
        this.field4744[4] = arg0.field4755;
        this.field4744[5] = arg0.field4749;
        this.field4744[6] = arg0.field4750;
        this.field4744[7] = 0.0F;
        this.field4744[8] = arg0.field4753;
        this.field4744[9] = arg0.field4746;
        this.field4744[10] = arg0.field4754;
        this.field4744[11] = 0.0F;
        this.field4744[12] = arg0.field4752;
        this.field4744[13] = arg0.field4756;
        this.field4744[14] = arg0.field4757;
        this.field4744[15] = 1.0F;
    }

    @ObfuscatedName("rm.aa(B)F")
    public float method7498() {
        return this.field4744[3] * this.field4744[6] * this.field4744[9] * this.field4744[12] + (this.field4744[5] * this.field4744[3] * this.field4744[8] * this.field4744[14] + this.field4744[4] * this.field4744[3] * this.field4744[10] * this.field4744[13] + (this.field4744[2] * this.field4744[7] * this.field4744[8] * this.field4744[13] + this.field4744[2] * this.field4744[5] * this.field4744[11] * this.field4744[12] + (this.field4744[4] * this.field4744[2] * this.field4744[9] * this.field4744[15] + this.field4744[7] * this.field4744[1] * this.field4744[10] * this.field4744[12] + (this.field4744[1] * this.field4744[6] * this.field4744[8] * this.field4744[15] + this.field4744[1] * this.field4744[4] * this.field4744[11] * this.field4744[14] + (this.field4744[7] * this.field4744[0] * this.field4744[9] * this.field4744[14] + this.field4744[0] * this.field4744[6] * this.field4744[11] * this.field4744[13] + (this.field4744[5] * this.field4744[0] * this.field4744[10] * this.field4744[15] - this.field4744[0] * this.field4744[5] * this.field4744[11] * this.field4744[14] - this.field4744[0] * this.field4744[6] * this.field4744[9] * this.field4744[15]) - this.field4744[0] * this.field4744[7] * this.field4744[10] * this.field4744[13] - this.field4744[1] * this.field4744[4] * this.field4744[10] * this.field4744[15]) - this.field4744[1] * this.field4744[6] * this.field4744[11] * this.field4744[12] - this.field4744[1] * this.field4744[7] * this.field4744[8] * this.field4744[14]) - this.field4744[2] * this.field4744[4] * this.field4744[11] * this.field4744[13] - this.field4744[2] * this.field4744[5] * this.field4744[8] * this.field4744[15]) - this.field4744[7] * this.field4744[2] * this.field4744[9] * this.field4744[12] - this.field4744[4] * this.field4744[3] * this.field4744[9] * this.field4744[14]) - this.field4744[3] * this.field4744[5] * this.field4744[10] * this.field4744[12] - this.field4744[3] * this.field4744[6] * this.field4744[8] * this.field4744[13]);
    }

    @ObfuscatedName("rm.au(I)V")
    public void method7499() {
        float var1 = 1.0F / this.method7498();
        float var2 = (this.field4744[7] * this.field4744[9] * this.field4744[14] + this.field4744[6] * this.field4744[11] * this.field4744[13] + (this.field4744[5] * this.field4744[10] * this.field4744[15] - this.field4744[11] * this.field4744[5] * this.field4744[14] - this.field4744[9] * this.field4744[6] * this.field4744[15]) - this.field4744[7] * this.field4744[10] * this.field4744[13]) * var1;
        float var3 = (this.field4744[10] * this.field4744[3] * this.field4744[13] + (this.field4744[9] * this.field4744[2] * this.field4744[15] + this.field4744[11] * this.field4744[1] * this.field4744[14] + this.field4744[10] * -this.field4744[1] * this.field4744[15] - this.field4744[11] * this.field4744[2] * this.field4744[13] - this.field4744[3] * this.field4744[9] * this.field4744[14])) * var1;
        float var4 = (this.field4744[3] * this.field4744[5] * this.field4744[14] + this.field4744[2] * this.field4744[7] * this.field4744[13] + (this.field4744[1] * this.field4744[6] * this.field4744[15] - this.field4744[7] * this.field4744[1] * this.field4744[14] - this.field4744[2] * this.field4744[5] * this.field4744[15]) - this.field4744[3] * this.field4744[6] * this.field4744[13]) * var1;
        float var5 = (this.field4744[6] * this.field4744[3] * this.field4744[9] + (this.field4744[5] * this.field4744[2] * this.field4744[11] + this.field4744[1] * this.field4744[7] * this.field4744[10] + this.field4744[6] * -this.field4744[1] * this.field4744[11] - this.field4744[2] * this.field4744[7] * this.field4744[9] - this.field4744[5] * this.field4744[3] * this.field4744[10])) * var1;
        float var6 = (this.field4744[10] * this.field4744[7] * this.field4744[12] + (this.field4744[6] * this.field4744[8] * this.field4744[15] + this.field4744[10] * -this.field4744[4] * this.field4744[15] + this.field4744[11] * this.field4744[4] * this.field4744[14] - this.field4744[6] * this.field4744[11] * this.field4744[12] - this.field4744[8] * this.field4744[7] * this.field4744[14])) * var1;
        float var7 = (this.field4744[3] * this.field4744[8] * this.field4744[14] + this.field4744[2] * this.field4744[11] * this.field4744[12] + (this.field4744[10] * this.field4744[0] * this.field4744[15] - this.field4744[0] * this.field4744[11] * this.field4744[14] - this.field4744[8] * this.field4744[2] * this.field4744[15]) - this.field4744[3] * this.field4744[10] * this.field4744[12]) * var1;
        float var8 = (this.field4744[3] * this.field4744[6] * this.field4744[12] + (this.field4744[2] * this.field4744[4] * this.field4744[15] + this.field4744[6] * -this.field4744[0] * this.field4744[15] + this.field4744[0] * this.field4744[7] * this.field4744[14] - this.field4744[7] * this.field4744[2] * this.field4744[12] - this.field4744[4] * this.field4744[3] * this.field4744[14])) * var1;
        float var9 = (this.field4744[4] * this.field4744[3] * this.field4744[10] + this.field4744[7] * this.field4744[2] * this.field4744[8] + (this.field4744[0] * this.field4744[6] * this.field4744[11] - this.field4744[7] * this.field4744[0] * this.field4744[10] - this.field4744[4] * this.field4744[2] * this.field4744[11]) - this.field4744[3] * this.field4744[6] * this.field4744[8]) * var1;
        float var10 = (this.field4744[7] * this.field4744[8] * this.field4744[13] + this.field4744[11] * this.field4744[5] * this.field4744[12] + (this.field4744[4] * this.field4744[9] * this.field4744[15] - this.field4744[11] * this.field4744[4] * this.field4744[13] - this.field4744[8] * this.field4744[5] * this.field4744[15]) - this.field4744[7] * this.field4744[9] * this.field4744[12]) * var1;
        float var11 = (this.field4744[9] * this.field4744[3] * this.field4744[12] + (this.field4744[8] * this.field4744[1] * this.field4744[15] + this.field4744[11] * this.field4744[0] * this.field4744[13] + this.field4744[9] * -this.field4744[0] * this.field4744[15] - this.field4744[1] * this.field4744[11] * this.field4744[12] - this.field4744[3] * this.field4744[8] * this.field4744[13])) * var1;
        float var12 = (this.field4744[4] * this.field4744[3] * this.field4744[13] + this.field4744[7] * this.field4744[1] * this.field4744[12] + (this.field4744[5] * this.field4744[0] * this.field4744[15] - this.field4744[0] * this.field4744[7] * this.field4744[13] - this.field4744[1] * this.field4744[4] * this.field4744[15]) - this.field4744[5] * this.field4744[3] * this.field4744[12]) * var1;
        float var13 = (this.field4744[3] * this.field4744[5] * this.field4744[8] + (this.field4744[4] * this.field4744[1] * this.field4744[11] + this.field4744[5] * -this.field4744[0] * this.field4744[11] + this.field4744[7] * this.field4744[0] * this.field4744[9] - this.field4744[7] * this.field4744[1] * this.field4744[8] - this.field4744[4] * this.field4744[3] * this.field4744[9])) * var1;
        float var14 = (this.field4744[9] * this.field4744[6] * this.field4744[12] + (this.field4744[8] * this.field4744[5] * this.field4744[14] + this.field4744[10] * this.field4744[4] * this.field4744[13] + this.field4744[9] * -this.field4744[4] * this.field4744[14] - this.field4744[10] * this.field4744[5] * this.field4744[12] - this.field4744[6] * this.field4744[8] * this.field4744[13])) * var1;
        float var15 = (this.field4744[8] * this.field4744[2] * this.field4744[13] + this.field4744[1] * this.field4744[10] * this.field4744[12] + (this.field4744[9] * this.field4744[0] * this.field4744[14] - this.field4744[0] * this.field4744[10] * this.field4744[13] - this.field4744[1] * this.field4744[8] * this.field4744[14]) - this.field4744[9] * this.field4744[2] * this.field4744[12]) * var1;
        float var16 = (this.field4744[2] * this.field4744[5] * this.field4744[12] + (this.field4744[4] * this.field4744[1] * this.field4744[14] + this.field4744[6] * this.field4744[0] * this.field4744[13] + this.field4744[5] * -this.field4744[0] * this.field4744[14] - this.field4744[1] * this.field4744[6] * this.field4744[12] - this.field4744[4] * this.field4744[2] * this.field4744[13])) * var1;
        float var17 = (this.field4744[2] * this.field4744[4] * this.field4744[9] + this.field4744[6] * this.field4744[1] * this.field4744[8] + (this.field4744[5] * this.field4744[0] * this.field4744[10] - this.field4744[6] * this.field4744[0] * this.field4744[9] - this.field4744[1] * this.field4744[4] * this.field4744[10]) - this.field4744[2] * this.field4744[5] * this.field4744[8]) * var1;
        this.field4744[0] = var2;
        this.field4744[1] = var3;
        this.field4744[2] = var4;
        this.field4744[3] = var5;
        this.field4744[4] = var6;
        this.field4744[5] = var7;
        this.field4744[6] = var8;
        this.field4744[7] = var9;
        this.field4744[8] = var10;
        this.field4744[9] = var11;
        this.field4744[10] = var12;
        this.field4744[11] = var13;
        this.field4744[12] = var14;
        this.field4744[13] = var15;
        this.field4744[14] = var16;
        this.field4744[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7497();
        this.method7487();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4744[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4744);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class452)) {
            return false;
        }
        class452 var2 = (class452) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4744[var3] != var2.field4744[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("rm.ae(B)[F")
    public float[] method7493() {
        float[] var1 = new float[3];
        class450 var2 = new class450(this.field4744[0], this.field4744[1], this.field4744[2]);
        class450 var3 = new class450(this.field4744[4], this.field4744[5], this.field4744[6]);
        class450 var4 = new class450(this.field4744[8], this.field4744[9], this.field4744[10]);
        var1[0] = var2.method7454();
        var1[1] = var3.method7454();
        var1[2] = var4.method7454();
        return var1;
    }
}
