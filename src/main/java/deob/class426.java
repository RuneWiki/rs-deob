package deob;

import java.util.Arrays;

@ObfuscatedName("qy")
public final class class426 {

    @ObfuscatedName("qy.ay")
    public static class426[] field4685 = new class426[0];

    @ObfuscatedName("qy.an")
    public static int field4683 = 100;

    @ObfuscatedName("qy.au")
    public static int field4684;

    @ObfuscatedName("qy.ax")
    public float[] field4687 = new float[16];

    @ObfuscatedName("qy.ao")
    public static final class426 field4688;

    static {
        field4685 = new class426[100];
        field4684 = 0;
        field4688 = new class426();
    }

    @ObfuscatedName("qy.ab(I)V")
    public void method7275() {
        class426[] var1 = field4685;
        synchronized (field4685) {
            if (field4684 < field4683 - 1) {
                field4685[++field4684 - 1] = this;
            }
        }
    }

    public class426() {
        this.method7237();
    }

    public class426(class426 arg0) {
        this.method7241(arg0);
    }

    public class426(class549 arg0, boolean arg1) {
        this.method7236(arg0, arg1);
    }

    @ObfuscatedName("qy.ay(Lvg;ZB)V")
    public void method7236(class549 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4687[var4] = arg0.method8805();
            }
            return;
        }
        class427 var3 = new class427();
        var3.method7318(class498.method2761(arg0.method8919()));
        var3.method7324(class498.method2761(arg0.method8919()));
        var3.method7320(class498.method2761(arg0.method8919()));
        var3.method7327((float) arg0.method8919(), (float) arg0.method8919(), (float) arg0.method8919());
        this.method7248(var3);
    }

    @ObfuscatedName("qy.an(S)[F")
    public float[] method7287() {
        float[] var1 = new float[3];
        if ((double) this.field4687[2] < 0.999D && (double) this.field4687[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4687[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4687[6] / var2, (double) this.field4687[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4687[1] / var2, (double) this.field4687[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4687[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4687[9]), (double) this.field4687[5]);
        }
        return var1;
    }

    @ObfuscatedName("qy.au(I)[F")
    public float[] method7269() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4687[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4687[2];
            double var6 = (double) this.field4687[10];
            double var8 = (double) this.field4687[4];
            double var10 = (double) this.field4687[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4687[1];
            double var14 = (double) this.field4687[0];
            if (this.field4687[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("qy.ax(I)V")
    public void method7237() {
        this.field4687[0] = 1.0F;
        this.field4687[1] = 0.0F;
        this.field4687[2] = 0.0F;
        this.field4687[3] = 0.0F;
        this.field4687[4] = 0.0F;
        this.field4687[5] = 1.0F;
        this.field4687[6] = 0.0F;
        this.field4687[7] = 0.0F;
        this.field4687[8] = 0.0F;
        this.field4687[9] = 0.0F;
        this.field4687[10] = 1.0F;
        this.field4687[11] = 0.0F;
        this.field4687[12] = 0.0F;
        this.field4687[13] = 0.0F;
        this.field4687[14] = 0.0F;
        this.field4687[15] = 1.0F;
    }

    @ObfuscatedName("qy.ao(I)V")
    public void method7240() {
        this.field4687[0] = 0.0F;
        this.field4687[1] = 0.0F;
        this.field4687[2] = 0.0F;
        this.field4687[3] = 0.0F;
        this.field4687[4] = 0.0F;
        this.field4687[5] = 0.0F;
        this.field4687[6] = 0.0F;
        this.field4687[7] = 0.0F;
        this.field4687[8] = 0.0F;
        this.field4687[9] = 0.0F;
        this.field4687[10] = 0.0F;
        this.field4687[11] = 0.0F;
        this.field4687[12] = 0.0F;
        this.field4687[13] = 0.0F;
        this.field4687[14] = 0.0F;
        this.field4687[15] = 0.0F;
    }

    @ObfuscatedName("qy.am(Lqy;I)V")
    public void method7241(class426 arg0) {
        System.arraycopy(arg0.field4687, 0, this.field4687, 0, 16);
    }

    @ObfuscatedName("qy.ac(FI)V")
    public void method7242(float arg0) {
        this.method7270(arg0, arg0, arg0);
    }

    @ObfuscatedName("qy.ae(FFFI)V")
    public void method7270(float arg0, float arg1, float arg2) {
        this.method7237();
        this.field4687[0] = arg0;
        this.field4687[5] = arg1;
        this.field4687[10] = arg2;
    }

    @ObfuscatedName("qy.ad(Lqy;B)V")
    public void method7244(class426 arg0) {
        for (int var2 = 0; var2 < this.field4687.length; var2++) {
            this.field4687[var2] += arg0.field4687[var2];
        }
    }

    @ObfuscatedName("qy.aq(Lqy;I)V")
    public void method7263(class426 arg0) {
        float var2 = this.field4687[3] * arg0.field4687[12] + this.field4687[2] * arg0.field4687[8] + this.field4687[0] * arg0.field4687[0] + this.field4687[1] * arg0.field4687[4];
        float var3 = this.field4687[3] * arg0.field4687[13] + this.field4687[2] * arg0.field4687[9] + this.field4687[0] * arg0.field4687[1] + this.field4687[1] * arg0.field4687[5];
        float var4 = this.field4687[3] * arg0.field4687[14] + this.field4687[2] * arg0.field4687[10] + this.field4687[1] * arg0.field4687[6] + this.field4687[0] * arg0.field4687[2];
        float var5 = this.field4687[3] * arg0.field4687[15] + this.field4687[2] * arg0.field4687[11] + this.field4687[1] * arg0.field4687[7] + this.field4687[0] * arg0.field4687[3];
        float var6 = this.field4687[7] * arg0.field4687[12] + this.field4687[6] * arg0.field4687[8] + this.field4687[5] * arg0.field4687[4] + this.field4687[4] * arg0.field4687[0];
        float var7 = this.field4687[7] * arg0.field4687[13] + this.field4687[6] * arg0.field4687[9] + this.field4687[4] * arg0.field4687[1] + this.field4687[5] * arg0.field4687[5];
        float var8 = this.field4687[7] * arg0.field4687[14] + this.field4687[6] * arg0.field4687[10] + this.field4687[5] * arg0.field4687[6] + this.field4687[4] * arg0.field4687[2];
        float var9 = this.field4687[7] * arg0.field4687[15] + this.field4687[6] * arg0.field4687[11] + this.field4687[5] * arg0.field4687[7] + this.field4687[4] * arg0.field4687[3];
        float var10 = this.field4687[11] * arg0.field4687[12] + this.field4687[10] * arg0.field4687[8] + this.field4687[9] * arg0.field4687[4] + this.field4687[8] * arg0.field4687[0];
        float var11 = this.field4687[11] * arg0.field4687[13] + this.field4687[10] * arg0.field4687[9] + this.field4687[9] * arg0.field4687[5] + this.field4687[8] * arg0.field4687[1];
        float var12 = this.field4687[11] * arg0.field4687[14] + this.field4687[10] * arg0.field4687[10] + this.field4687[8] * arg0.field4687[2] + this.field4687[9] * arg0.field4687[6];
        float var13 = this.field4687[11] * arg0.field4687[15] + this.field4687[10] * arg0.field4687[11] + this.field4687[8] * arg0.field4687[3] + this.field4687[9] * arg0.field4687[7];
        float var14 = this.field4687[15] * arg0.field4687[12] + this.field4687[14] * arg0.field4687[8] + this.field4687[12] * arg0.field4687[0] + this.field4687[13] * arg0.field4687[4];
        float var15 = this.field4687[15] * arg0.field4687[13] + this.field4687[14] * arg0.field4687[9] + this.field4687[13] * arg0.field4687[5] + this.field4687[12] * arg0.field4687[1];
        float var16 = this.field4687[15] * arg0.field4687[14] + this.field4687[14] * arg0.field4687[10] + this.field4687[13] * arg0.field4687[6] + this.field4687[12] * arg0.field4687[2];
        float var17 = this.field4687[15] * arg0.field4687[15] + this.field4687[14] * arg0.field4687[11] + this.field4687[13] * arg0.field4687[7] + this.field4687[12] * arg0.field4687[3];
        this.field4687[0] = var2;
        this.field4687[1] = var3;
        this.field4687[2] = var4;
        this.field4687[3] = var5;
        this.field4687[4] = var6;
        this.field4687[5] = var7;
        this.field4687[6] = var8;
        this.field4687[7] = var9;
        this.field4687[8] = var10;
        this.field4687[9] = var11;
        this.field4687[10] = var12;
        this.field4687[11] = var13;
        this.field4687[12] = var14;
        this.field4687[13] = var15;
        this.field4687[14] = var16;
        this.field4687[15] = var17;
    }

    @ObfuscatedName("qy.al(Lqr;B)V")
    public void method7246(class420 arg0) {
        float var2 = arg0.field4660.field4681 * arg0.field4660.field4681;
        float var3 = arg0.field4660.field4681 * arg0.field4660.field4678;
        float var4 = arg0.field4660.field4682 * arg0.field4660.field4681;
        float var5 = arg0.field4660.field4681 * arg0.field4660.field4680;
        float var6 = arg0.field4660.field4678 * arg0.field4660.field4678;
        float var7 = arg0.field4660.field4682 * arg0.field4660.field4678;
        float var8 = arg0.field4660.field4680 * arg0.field4660.field4678;
        float var9 = arg0.field4660.field4682 * arg0.field4660.field4682;
        float var10 = arg0.field4660.field4682 * arg0.field4660.field4680;
        float var11 = arg0.field4660.field4680 * arg0.field4660.field4680;
        this.field4687[0] = var2 + var6 - var11 - var9;
        this.field4687[1] = var5 + var7 + var7 + var5;
        this.field4687[2] = var8 - var4 - var4 + var8;
        this.field4687[4] = var7 - var5 - var5 + var7;
        this.field4687[5] = var2 + var9 - var6 - var11;
        this.field4687[6] = var3 + var10 + var10 + var3;
        this.field4687[8] = var4 + var8 + var8 + var4;
        this.field4687[9] = var10 - var3 - var3 + var10;
        this.field4687[10] = var2 + var11 - var9 - var6;
        float[] var12 = this.field4687;
        float[] var13 = this.field4687;
        this.field4687[11] = 0.0F;
        var13[7] = 0.0F;
        var12[3] = 0.0F;
        this.field4687[12] = arg0.field4658.field4673;
        this.field4687[13] = arg0.field4658.field4670;
        this.field4687[14] = arg0.field4658.field4672;
        this.field4687[15] = 1.0F;
    }

    @ObfuscatedName("qy.aj(Lqf;I)V")
    public void method7306(class425 arg0) {
        float var2 = arg0.field4681 * arg0.field4681;
        float var3 = arg0.field4681 * arg0.field4678;
        float var4 = arg0.field4682 * arg0.field4681;
        float var5 = arg0.field4681 * arg0.field4680;
        float var6 = arg0.field4678 * arg0.field4678;
        float var7 = arg0.field4682 * arg0.field4678;
        float var8 = arg0.field4680 * arg0.field4678;
        float var9 = arg0.field4682 * arg0.field4682;
        float var10 = arg0.field4682 * arg0.field4680;
        float var11 = arg0.field4680 * arg0.field4680;
        this.field4687[0] = var2 + var6 - var11 - var9;
        this.field4687[1] = var5 + var7 + var7 + var5;
        this.field4687[2] = var8 - var4 - var4 + var8;
        this.field4687[4] = var7 - var5 - var5 + var7;
        this.field4687[5] = var2 + var9 - var6 - var11;
        this.field4687[6] = var3 + var10 + var10 + var3;
        this.field4687[8] = var4 + var8 + var8 + var4;
        this.field4687[9] = var10 - var3 - var3 + var10;
        this.field4687[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("qy.as(Lqi;B)V")
    public void method7248(class427 arg0) {
        this.field4687[0] = arg0.field4702;
        this.field4687[1] = arg0.field4695;
        this.field4687[2] = arg0.field4693;
        this.field4687[3] = 0.0F;
        this.field4687[4] = arg0.field4694;
        this.field4687[5] = arg0.field4703;
        this.field4687[6] = arg0.field4696;
        this.field4687[7] = 0.0F;
        this.field4687[8] = arg0.field4699;
        this.field4687[9] = arg0.field4697;
        this.field4687[10] = arg0.field4691;
        this.field4687[11] = 0.0F;
        this.field4687[12] = arg0.field4692;
        this.field4687[13] = arg0.field4701;
        this.field4687[14] = arg0.field4700;
        this.field4687[15] = 1.0F;
    }

    @ObfuscatedName("qy.aw(I)F")
    public float method7239() {
        return this.field4687[3] * this.field4687[6] * this.field4687[9] * this.field4687[12] + (this.field4687[5] * this.field4687[3] * this.field4687[8] * this.field4687[14] + this.field4687[3] * this.field4687[4] * this.field4687[10] * this.field4687[13] + (this.field4687[7] * this.field4687[2] * this.field4687[8] * this.field4687[13] + this.field4687[5] * this.field4687[2] * this.field4687[11] * this.field4687[12] + (this.field4687[4] * this.field4687[2] * this.field4687[9] * this.field4687[15] + this.field4687[1] * this.field4687[7] * this.field4687[10] * this.field4687[12] + (this.field4687[6] * this.field4687[1] * this.field4687[8] * this.field4687[15] + this.field4687[1] * this.field4687[4] * this.field4687[11] * this.field4687[14] + (this.field4687[0] * this.field4687[7] * this.field4687[9] * this.field4687[14] + this.field4687[0] * this.field4687[6] * this.field4687[11] * this.field4687[13] + (this.field4687[0] * this.field4687[5] * this.field4687[10] * this.field4687[15] - this.field4687[5] * this.field4687[0] * this.field4687[11] * this.field4687[14] - this.field4687[6] * this.field4687[0] * this.field4687[9] * this.field4687[15]) - this.field4687[0] * this.field4687[7] * this.field4687[10] * this.field4687[13] - this.field4687[4] * this.field4687[1] * this.field4687[10] * this.field4687[15]) - this.field4687[1] * this.field4687[6] * this.field4687[11] * this.field4687[12] - this.field4687[7] * this.field4687[1] * this.field4687[8] * this.field4687[14]) - this.field4687[4] * this.field4687[2] * this.field4687[11] * this.field4687[13] - this.field4687[5] * this.field4687[2] * this.field4687[8] * this.field4687[15]) - this.field4687[7] * this.field4687[2] * this.field4687[9] * this.field4687[12] - this.field4687[4] * this.field4687[3] * this.field4687[9] * this.field4687[14]) - this.field4687[5] * this.field4687[3] * this.field4687[10] * this.field4687[12] - this.field4687[6] * this.field4687[3] * this.field4687[8] * this.field4687[13]);
    }

    @ObfuscatedName("qy.af(I)V")
    public void method7250() {
        float var1 = 1.0F / this.method7239();
        float var2 = (this.field4687[7] * this.field4687[9] * this.field4687[14] + this.field4687[11] * this.field4687[6] * this.field4687[13] + (this.field4687[10] * this.field4687[5] * this.field4687[15] - this.field4687[5] * this.field4687[11] * this.field4687[14] - this.field4687[6] * this.field4687[9] * this.field4687[15]) - this.field4687[10] * this.field4687[7] * this.field4687[13]) * var1;
        float var3 = (this.field4687[3] * this.field4687[10] * this.field4687[13] + (this.field4687[9] * this.field4687[2] * this.field4687[15] + this.field4687[11] * this.field4687[1] * this.field4687[14] + this.field4687[10] * -this.field4687[1] * this.field4687[15] - this.field4687[11] * this.field4687[2] * this.field4687[13] - this.field4687[3] * this.field4687[9] * this.field4687[14])) * var1;
        float var4 = (this.field4687[3] * this.field4687[5] * this.field4687[14] + this.field4687[2] * this.field4687[7] * this.field4687[13] + (this.field4687[6] * this.field4687[1] * this.field4687[15] - this.field4687[1] * this.field4687[7] * this.field4687[14] - this.field4687[5] * this.field4687[2] * this.field4687[15]) - this.field4687[3] * this.field4687[6] * this.field4687[13]) * var1;
        float var5 = (this.field4687[3] * this.field4687[6] * this.field4687[9] + (this.field4687[2] * this.field4687[5] * this.field4687[11] + this.field4687[6] * -this.field4687[1] * this.field4687[11] + this.field4687[7] * this.field4687[1] * this.field4687[10] - this.field4687[7] * this.field4687[2] * this.field4687[9] - this.field4687[5] * this.field4687[3] * this.field4687[10])) * var1;
        float var6 = (this.field4687[7] * this.field4687[10] * this.field4687[12] + (this.field4687[6] * this.field4687[8] * this.field4687[15] + this.field4687[10] * -this.field4687[4] * this.field4687[15] + this.field4687[11] * this.field4687[4] * this.field4687[14] - this.field4687[11] * this.field4687[6] * this.field4687[12] - this.field4687[8] * this.field4687[7] * this.field4687[14])) * var1;
        float var7 = (this.field4687[3] * this.field4687[8] * this.field4687[14] + this.field4687[11] * this.field4687[2] * this.field4687[12] + (this.field4687[10] * this.field4687[0] * this.field4687[15] - this.field4687[11] * this.field4687[0] * this.field4687[14] - this.field4687[8] * this.field4687[2] * this.field4687[15]) - this.field4687[10] * this.field4687[3] * this.field4687[12]) * var1;
        float var8 = (this.field4687[3] * this.field4687[6] * this.field4687[12] + (this.field4687[4] * this.field4687[2] * this.field4687[15] + this.field4687[6] * -this.field4687[0] * this.field4687[15] + this.field4687[7] * this.field4687[0] * this.field4687[14] - this.field4687[2] * this.field4687[7] * this.field4687[12] - this.field4687[3] * this.field4687[4] * this.field4687[14])) * var1;
        float var9 = (this.field4687[3] * this.field4687[4] * this.field4687[10] + this.field4687[2] * this.field4687[7] * this.field4687[8] + (this.field4687[0] * this.field4687[6] * this.field4687[11] - this.field4687[0] * this.field4687[7] * this.field4687[10] - this.field4687[2] * this.field4687[4] * this.field4687[11]) - this.field4687[6] * this.field4687[3] * this.field4687[8]) * var1;
        float var10 = (this.field4687[7] * this.field4687[8] * this.field4687[13] + this.field4687[5] * this.field4687[11] * this.field4687[12] + (this.field4687[9] * this.field4687[4] * this.field4687[15] - this.field4687[11] * this.field4687[4] * this.field4687[13] - this.field4687[5] * this.field4687[8] * this.field4687[15]) - this.field4687[9] * this.field4687[7] * this.field4687[12]) * var1;
        float var11 = (this.field4687[9] * this.field4687[3] * this.field4687[12] + (this.field4687[1] * this.field4687[8] * this.field4687[15] + this.field4687[0] * this.field4687[11] * this.field4687[13] + this.field4687[9] * -this.field4687[0] * this.field4687[15] - this.field4687[1] * this.field4687[11] * this.field4687[12] - this.field4687[3] * this.field4687[8] * this.field4687[13])) * var1;
        float var12 = (this.field4687[3] * this.field4687[4] * this.field4687[13] + this.field4687[7] * this.field4687[1] * this.field4687[12] + (this.field4687[5] * this.field4687[0] * this.field4687[15] - this.field4687[7] * this.field4687[0] * this.field4687[13] - this.field4687[1] * this.field4687[4] * this.field4687[15]) - this.field4687[3] * this.field4687[5] * this.field4687[12]) * var1;
        float var13 = (this.field4687[3] * this.field4687[5] * this.field4687[8] + (this.field4687[4] * this.field4687[1] * this.field4687[11] + this.field4687[5] * -this.field4687[0] * this.field4687[11] + this.field4687[7] * this.field4687[0] * this.field4687[9] - this.field4687[1] * this.field4687[7] * this.field4687[8] - this.field4687[4] * this.field4687[3] * this.field4687[9])) * var1;
        float var14 = (this.field4687[9] * this.field4687[6] * this.field4687[12] + (this.field4687[5] * this.field4687[8] * this.field4687[14] + this.field4687[4] * this.field4687[10] * this.field4687[13] + this.field4687[9] * -this.field4687[4] * this.field4687[14] - this.field4687[5] * this.field4687[10] * this.field4687[12] - this.field4687[6] * this.field4687[8] * this.field4687[13])) * var1;
        float var15 = (this.field4687[2] * this.field4687[8] * this.field4687[13] + this.field4687[1] * this.field4687[10] * this.field4687[12] + (this.field4687[9] * this.field4687[0] * this.field4687[14] - this.field4687[10] * this.field4687[0] * this.field4687[13] - this.field4687[1] * this.field4687[8] * this.field4687[14]) - this.field4687[2] * this.field4687[9] * this.field4687[12]) * var1;
        float var16 = (this.field4687[2] * this.field4687[5] * this.field4687[12] + (this.field4687[1] * this.field4687[4] * this.field4687[14] + this.field4687[6] * this.field4687[0] * this.field4687[13] + this.field4687[5] * -this.field4687[0] * this.field4687[14] - this.field4687[1] * this.field4687[6] * this.field4687[12] - this.field4687[2] * this.field4687[4] * this.field4687[13])) * var1;
        float var17 = (this.field4687[2] * this.field4687[4] * this.field4687[9] + this.field4687[6] * this.field4687[1] * this.field4687[8] + (this.field4687[0] * this.field4687[5] * this.field4687[10] - this.field4687[0] * this.field4687[6] * this.field4687[9] - this.field4687[4] * this.field4687[1] * this.field4687[10]) - this.field4687[2] * this.field4687[5] * this.field4687[8]) * var1;
        this.field4687[0] = var2;
        this.field4687[1] = var3;
        this.field4687[2] = var4;
        this.field4687[3] = var5;
        this.field4687[4] = var6;
        this.field4687[5] = var7;
        this.field4687[6] = var8;
        this.field4687[7] = var9;
        this.field4687[8] = var10;
        this.field4687[9] = var11;
        this.field4687[10] = var12;
        this.field4687[11] = var13;
        this.field4687[12] = var14;
        this.field4687[13] = var15;
        this.field4687[14] = var16;
        this.field4687[15] = var17;
    }

    @ObfuscatedName("qy.aa(FFFFI)V")
    public void method7251(float arg0, float arg1, float arg2, float arg3) {
        this.field4687[0] = arg0;
        this.field4687[1] = 0.0F;
        this.field4687[2] = 0.0F;
        this.field4687[3] = 0.0F;
        this.field4687[4] = 0.0F;
        this.field4687[5] = arg1;
        this.field4687[6] = 0.0F;
        this.field4687[7] = 0.0F;
        this.field4687[8] = 0.0F;
        this.field4687[9] = 0.0F;
        this.field4687[10] = arg2;
        this.field4687[11] = 0.0F;
        this.field4687[12] = 0.0F;
        this.field4687[13] = 0.0F;
        this.field4687[14] = 0.0F;
        this.field4687[15] = arg3;
    }

    @ObfuscatedName("qy.ah(FFF[FI)V")
    public void method7252(float arg0, float arg1, float arg2, float[] arg3) {
        arg3[0] = this.field4687[8] * arg2 + this.field4687[4] * arg1 + this.field4687[0] * arg0 + this.field4687[12];
        arg3[1] = this.field4687[9] * arg2 + this.field4687[5] * arg1 + this.field4687[1] * arg0 + this.field4687[13];
        arg3[2] = this.field4687[10] * arg2 + this.field4687[6] * arg1 + this.field4687[2] * arg0 + this.field4687[14];
        if (arg3.length > 3) {
            arg3[3] = this.field4687[11] * arg2 + this.field4687[7] * arg1 + this.field4687[3] * arg0 + this.field4687[15];
        }
    }

    @ObfuscatedName("qy.ag(FFFI)F")
    public float method7253(float arg0, float arg1, float arg2) {
        return this.field4687[8] * arg2 + this.field4687[0] * arg0 + this.field4687[4] * arg1 + this.field4687[12];
    }

    @ObfuscatedName("qy.av(FFFI)F")
    public float method7254(float arg0, float arg1, float arg2) {
        return this.field4687[9] * arg2 + this.field4687[1] * arg0 + this.field4687[5] * arg1 + this.field4687[13];
    }

    @ObfuscatedName("qy.ar(FFFI)F")
    public float method7309(float arg0, float arg1, float arg2) {
        return this.field4687[10] * arg2 + this.field4687[2] * arg0 + this.field4687[6] * arg1 + this.field4687[14];
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7269();
        this.method7287();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4687[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4687);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class426)) {
            return false;
        }
        class426 var2 = (class426) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4687[var3] != var2.field4687[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("qy.ap(I)[F")
    public float[] method7256() {
        float[] var1 = new float[3];
        class424 var2 = new class424(this.field4687[0], this.field4687[1], this.field4687[2]);
        class424 var3 = new class424(this.field4687[4], this.field4687[5], this.field4687[6]);
        class424 var4 = new class424(this.field4687[8], this.field4687[9], this.field4687[10]);
        var1[0] = var2.method7190();
        var1[1] = var3.method7190();
        var1[2] = var4.method7190();
        return var1;
    }
}
