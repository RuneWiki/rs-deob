package deob;

import java.util.Arrays;

@ObfuscatedName("rz")
public final class class451 {

    @ObfuscatedName("rz.ae")
    public static class451[] field4738 = new class451[0];

    @ObfuscatedName("rz.ac")
    public float[] field4740 = new float[16];

    @ObfuscatedName("rz.ai")
    public static final class451 field4741;

    static {
        method5063(100);
        field4741 = new class451();
    }

    @ObfuscatedName("kx.au(IB)V")
    public static void method5063(int arg0) {
        Statics.field519 = arg0;
        field4738 = new class451[arg0];
        Statics.field4779 = 0;
    }

    @ObfuscatedName("rz.ae(I)V")
    public void method7563() {
        class451[] var1 = field4738;
        synchronized (field4738) {
            if (Statics.field4779 < Statics.field519 - 1) {
                field4738[++Statics.field4779 - 1] = this;
            }
        }
    }

    public class451() {
        this.method7522();
    }

    public class451(class451 arg0) {
        this.method7549(arg0);
    }

    public class451(class515 arg0, boolean arg1) {
        this.method7560(arg0, arg1);
    }

    @ObfuscatedName("rz.ao(Ltm;ZI)V")
    public void method7560(class515 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4740[var16] = arg0.method8308();
            }
            return;
        }
        class452 var3 = new class452();
        int var5 = arg0.method8303();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7585(var7);
        int var9 = arg0.method8303();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7589(var11);
        int var13 = arg0.method8303();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7586(var15);
        var3.method7587((float) arg0.method8303(), (float) arg0.method8303(), (float) arg0.method8303());
        this.method7517(var3);
    }

    @ObfuscatedName("rz.at(B)[F")
    public float[] method7520() {
        float[] var1 = new float[3];
        if ((double) this.field4740[2] < 0.999D && (double) this.field4740[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4740[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4740[6] / var2, (double) this.field4740[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4740[1] / var2, (double) this.field4740[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4740[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4740[9]), (double) this.field4740[5]);
        }
        return var1;
    }

    @ObfuscatedName("rz.ac(I)[F")
    public float[] method7521() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4740[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4740[2];
            double var6 = (double) this.field4740[10];
            double var8 = (double) this.field4740[4];
            double var10 = (double) this.field4740[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4740[1];
            double var14 = (double) this.field4740[0];
            if (this.field4740[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("rz.ai(I)V")
    public void method7522() {
        this.field4740[0] = 1.0F;
        this.field4740[1] = 0.0F;
        this.field4740[2] = 0.0F;
        this.field4740[3] = 0.0F;
        this.field4740[4] = 0.0F;
        this.field4740[5] = 1.0F;
        this.field4740[6] = 0.0F;
        this.field4740[7] = 0.0F;
        this.field4740[8] = 0.0F;
        this.field4740[9] = 0.0F;
        this.field4740[10] = 1.0F;
        this.field4740[11] = 0.0F;
        this.field4740[12] = 0.0F;
        this.field4740[13] = 0.0F;
        this.field4740[14] = 0.0F;
        this.field4740[15] = 1.0F;
    }

    @ObfuscatedName("rz.az(B)V")
    public void method7523() {
        this.field4740[0] = 0.0F;
        this.field4740[1] = 0.0F;
        this.field4740[2] = 0.0F;
        this.field4740[3] = 0.0F;
        this.field4740[4] = 0.0F;
        this.field4740[5] = 0.0F;
        this.field4740[6] = 0.0F;
        this.field4740[7] = 0.0F;
        this.field4740[8] = 0.0F;
        this.field4740[9] = 0.0F;
        this.field4740[10] = 0.0F;
        this.field4740[11] = 0.0F;
        this.field4740[12] = 0.0F;
        this.field4740[13] = 0.0F;
        this.field4740[14] = 0.0F;
        this.field4740[15] = 0.0F;
    }

    @ObfuscatedName("rz.ap(Lrz;I)V")
    public void method7549(class451 arg0) {
        System.arraycopy(arg0.field4740, 0, this.field4740, 0, 16);
    }

    @ObfuscatedName("rz.aa(FB)V")
    public void method7525(float arg0) {
        this.method7526(arg0, arg0, arg0);
    }

    @ObfuscatedName("rz.af(FFFB)V")
    public void method7526(float arg0, float arg1, float arg2) {
        this.method7522();
        this.field4740[0] = arg0;
        this.field4740[5] = arg1;
        this.field4740[10] = arg2;
    }

    @ObfuscatedName("rz.ad(Lrz;I)V")
    public void method7527(class451 arg0) {
        for (int var2 = 0; var2 < this.field4740.length; var2++) {
            this.field4740[var2] += arg0.field4740[var2];
        }
    }

    @ObfuscatedName("rz.aq(Lrz;I)V")
    public void method7565(class451 arg0) {
        float var2 = this.field4740[3] * arg0.field4740[12] + this.field4740[2] * arg0.field4740[8] + this.field4740[0] * arg0.field4740[0] + this.field4740[1] * arg0.field4740[4];
        float var3 = this.field4740[3] * arg0.field4740[13] + this.field4740[2] * arg0.field4740[9] + this.field4740[0] * arg0.field4740[1] + this.field4740[1] * arg0.field4740[5];
        float var4 = this.field4740[3] * arg0.field4740[14] + this.field4740[2] * arg0.field4740[10] + this.field4740[1] * arg0.field4740[6] + this.field4740[0] * arg0.field4740[2];
        float var5 = this.field4740[3] * arg0.field4740[15] + this.field4740[2] * arg0.field4740[11] + this.field4740[0] * arg0.field4740[3] + this.field4740[1] * arg0.field4740[7];
        float var6 = this.field4740[7] * arg0.field4740[12] + this.field4740[6] * arg0.field4740[8] + this.field4740[4] * arg0.field4740[0] + this.field4740[5] * arg0.field4740[4];
        float var7 = this.field4740[7] * arg0.field4740[13] + this.field4740[6] * arg0.field4740[9] + this.field4740[4] * arg0.field4740[1] + this.field4740[5] * arg0.field4740[5];
        float var8 = this.field4740[7] * arg0.field4740[14] + this.field4740[6] * arg0.field4740[10] + this.field4740[5] * arg0.field4740[6] + this.field4740[4] * arg0.field4740[2];
        float var9 = this.field4740[7] * arg0.field4740[15] + this.field4740[6] * arg0.field4740[11] + this.field4740[4] * arg0.field4740[3] + this.field4740[5] * arg0.field4740[7];
        float var10 = this.field4740[11] * arg0.field4740[12] + this.field4740[10] * arg0.field4740[8] + this.field4740[9] * arg0.field4740[4] + this.field4740[8] * arg0.field4740[0];
        float var11 = this.field4740[11] * arg0.field4740[13] + this.field4740[10] * arg0.field4740[9] + this.field4740[9] * arg0.field4740[5] + this.field4740[8] * arg0.field4740[1];
        float var12 = this.field4740[11] * arg0.field4740[14] + this.field4740[10] * arg0.field4740[10] + this.field4740[9] * arg0.field4740[6] + this.field4740[8] * arg0.field4740[2];
        float var13 = this.field4740[11] * arg0.field4740[15] + this.field4740[10] * arg0.field4740[11] + this.field4740[9] * arg0.field4740[7] + this.field4740[8] * arg0.field4740[3];
        float var14 = this.field4740[15] * arg0.field4740[12] + this.field4740[14] * arg0.field4740[8] + this.field4740[12] * arg0.field4740[0] + this.field4740[13] * arg0.field4740[4];
        float var15 = this.field4740[15] * arg0.field4740[13] + this.field4740[14] * arg0.field4740[9] + this.field4740[13] * arg0.field4740[5] + this.field4740[12] * arg0.field4740[1];
        float var16 = this.field4740[15] * arg0.field4740[14] + this.field4740[14] * arg0.field4740[10] + this.field4740[13] * arg0.field4740[6] + this.field4740[12] * arg0.field4740[2];
        float var17 = this.field4740[15] * arg0.field4740[15] + this.field4740[14] * arg0.field4740[11] + this.field4740[12] * arg0.field4740[3] + this.field4740[13] * arg0.field4740[7];
        this.field4740[0] = var2;
        this.field4740[1] = var3;
        this.field4740[2] = var4;
        this.field4740[3] = var5;
        this.field4740[4] = var6;
        this.field4740[5] = var7;
        this.field4740[6] = var8;
        this.field4740[7] = var9;
        this.field4740[8] = var10;
        this.field4740[9] = var11;
        this.field4740[10] = var12;
        this.field4740[11] = var13;
        this.field4740[12] = var14;
        this.field4740[13] = var15;
        this.field4740[14] = var16;
        this.field4740[15] = var17;
    }

    @ObfuscatedName("rz.al(Lro;I)V")
    public void method7568(class450 arg0) {
        float var2 = arg0.field4730 * arg0.field4730;
        float var3 = arg0.field4734 * arg0.field4730;
        float var4 = arg0.field4733 * arg0.field4730;
        float var5 = arg0.field4735 * arg0.field4730;
        float var6 = arg0.field4734 * arg0.field4734;
        float var7 = arg0.field4734 * arg0.field4733;
        float var8 = arg0.field4735 * arg0.field4734;
        float var9 = arg0.field4733 * arg0.field4733;
        float var10 = arg0.field4735 * arg0.field4733;
        float var11 = arg0.field4735 * arg0.field4735;
        this.field4740[0] = var2 + var6 - var11 - var9;
        this.field4740[1] = var5 + var7 + var7 + var5;
        this.field4740[2] = var8 - var4 - var4 + var8;
        this.field4740[4] = var7 - var5 - var5 + var7;
        this.field4740[5] = var2 + var9 - var6 - var11;
        this.field4740[6] = var3 + var10 + var10 + var3;
        this.field4740[8] = var4 + var8 + var8 + var4;
        this.field4740[9] = var10 - var3 - var3 + var10;
        this.field4740[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("rz.an(Lrm;I)V")
    public void method7517(class452 arg0) {
        this.field4740[0] = arg0.field4750;
        this.field4740[1] = arg0.field4745;
        this.field4740[2] = arg0.field4746;
        this.field4740[3] = 0.0F;
        this.field4740[4] = arg0.field4747;
        this.field4740[5] = arg0.field4749;
        this.field4740[6] = arg0.field4744;
        this.field4740[7] = 0.0F;
        this.field4740[8] = arg0.field4754;
        this.field4740[9] = arg0.field4751;
        this.field4740[10] = arg0.field4748;
        this.field4740[11] = 0.0F;
        this.field4740[12] = arg0.field4753;
        this.field4740[13] = arg0.field4752;
        this.field4740[14] = arg0.field4755;
        this.field4740[15] = 1.0F;
    }

    @ObfuscatedName("rz.ar(I)F")
    public float method7531() {
        return this.field4740[6] * this.field4740[3] * this.field4740[9] * this.field4740[12] + (this.field4740[5] * this.field4740[3] * this.field4740[8] * this.field4740[14] + this.field4740[4] * this.field4740[3] * this.field4740[10] * this.field4740[13] + (this.field4740[7] * this.field4740[2] * this.field4740[8] * this.field4740[13] + this.field4740[2] * this.field4740[5] * this.field4740[11] * this.field4740[12] + (this.field4740[4] * this.field4740[2] * this.field4740[9] * this.field4740[15] + this.field4740[7] * this.field4740[1] * this.field4740[10] * this.field4740[12] + (this.field4740[1] * this.field4740[6] * this.field4740[8] * this.field4740[15] + this.field4740[4] * this.field4740[1] * this.field4740[11] * this.field4740[14] + (this.field4740[0] * this.field4740[7] * this.field4740[9] * this.field4740[14] + this.field4740[0] * this.field4740[6] * this.field4740[11] * this.field4740[13] + (this.field4740[5] * this.field4740[0] * this.field4740[10] * this.field4740[15] - this.field4740[0] * this.field4740[5] * this.field4740[11] * this.field4740[14] - this.field4740[0] * this.field4740[6] * this.field4740[9] * this.field4740[15]) - this.field4740[0] * this.field4740[7] * this.field4740[10] * this.field4740[13] - this.field4740[4] * this.field4740[1] * this.field4740[10] * this.field4740[15]) - this.field4740[1] * this.field4740[6] * this.field4740[11] * this.field4740[12] - this.field4740[7] * this.field4740[1] * this.field4740[8] * this.field4740[14]) - this.field4740[4] * this.field4740[2] * this.field4740[11] * this.field4740[13] - this.field4740[2] * this.field4740[5] * this.field4740[8] * this.field4740[15]) - this.field4740[7] * this.field4740[2] * this.field4740[9] * this.field4740[12] - this.field4740[3] * this.field4740[4] * this.field4740[9] * this.field4740[14]) - this.field4740[3] * this.field4740[5] * this.field4740[10] * this.field4740[12] - this.field4740[6] * this.field4740[3] * this.field4740[8] * this.field4740[13]);
    }

    @ObfuscatedName("rz.ab(B)V")
    public void method7582() {
        float var1 = 1.0F / this.method7531();
        float var2 = (this.field4740[7] * this.field4740[9] * this.field4740[14] + this.field4740[11] * this.field4740[6] * this.field4740[13] + (this.field4740[5] * this.field4740[10] * this.field4740[15] - this.field4740[11] * this.field4740[5] * this.field4740[14] - this.field4740[9] * this.field4740[6] * this.field4740[15]) - this.field4740[7] * this.field4740[10] * this.field4740[13]) * var1;
        float var3 = (this.field4740[3] * this.field4740[10] * this.field4740[13] + (this.field4740[9] * this.field4740[2] * this.field4740[15] + this.field4740[10] * -this.field4740[1] * this.field4740[15] + this.field4740[11] * this.field4740[1] * this.field4740[14] - this.field4740[11] * this.field4740[2] * this.field4740[13] - this.field4740[9] * this.field4740[3] * this.field4740[14])) * var1;
        float var4 = (this.field4740[3] * this.field4740[5] * this.field4740[14] + this.field4740[2] * this.field4740[7] * this.field4740[13] + (this.field4740[6] * this.field4740[1] * this.field4740[15] - this.field4740[1] * this.field4740[7] * this.field4740[14] - this.field4740[2] * this.field4740[5] * this.field4740[15]) - this.field4740[6] * this.field4740[3] * this.field4740[13]) * var1;
        float var5 = (this.field4740[3] * this.field4740[6] * this.field4740[9] + (this.field4740[2] * this.field4740[5] * this.field4740[11] + this.field4740[7] * this.field4740[1] * this.field4740[10] + this.field4740[6] * -this.field4740[1] * this.field4740[11] - this.field4740[7] * this.field4740[2] * this.field4740[9] - this.field4740[5] * this.field4740[3] * this.field4740[10])) * var1;
        float var6 = (this.field4740[10] * this.field4740[7] * this.field4740[12] + (this.field4740[6] * this.field4740[8] * this.field4740[15] + this.field4740[10] * -this.field4740[4] * this.field4740[15] + this.field4740[4] * this.field4740[11] * this.field4740[14] - this.field4740[11] * this.field4740[6] * this.field4740[12] - this.field4740[8] * this.field4740[7] * this.field4740[14])) * var1;
        float var7 = (this.field4740[8] * this.field4740[3] * this.field4740[14] + this.field4740[2] * this.field4740[11] * this.field4740[12] + (this.field4740[0] * this.field4740[10] * this.field4740[15] - this.field4740[0] * this.field4740[11] * this.field4740[14] - this.field4740[2] * this.field4740[8] * this.field4740[15]) - this.field4740[3] * this.field4740[10] * this.field4740[12]) * var1;
        float var8 = (this.field4740[3] * this.field4740[6] * this.field4740[12] + (this.field4740[2] * this.field4740[4] * this.field4740[15] + this.field4740[6] * -this.field4740[0] * this.field4740[15] + this.field4740[0] * this.field4740[7] * this.field4740[14] - this.field4740[7] * this.field4740[2] * this.field4740[12] - this.field4740[3] * this.field4740[4] * this.field4740[14])) * var1;
        float var9 = (this.field4740[4] * this.field4740[3] * this.field4740[10] + this.field4740[7] * this.field4740[2] * this.field4740[8] + (this.field4740[0] * this.field4740[6] * this.field4740[11] - this.field4740[0] * this.field4740[7] * this.field4740[10] - this.field4740[2] * this.field4740[4] * this.field4740[11]) - this.field4740[6] * this.field4740[3] * this.field4740[8]) * var1;
        float var10 = (this.field4740[8] * this.field4740[7] * this.field4740[13] + this.field4740[11] * this.field4740[5] * this.field4740[12] + (this.field4740[4] * this.field4740[9] * this.field4740[15] - this.field4740[4] * this.field4740[11] * this.field4740[13] - this.field4740[5] * this.field4740[8] * this.field4740[15]) - this.field4740[9] * this.field4740[7] * this.field4740[12]) * var1;
        float var11 = (this.field4740[9] * this.field4740[3] * this.field4740[12] + (this.field4740[1] * this.field4740[8] * this.field4740[15] + this.field4740[9] * -this.field4740[0] * this.field4740[15] + this.field4740[0] * this.field4740[11] * this.field4740[13] - this.field4740[11] * this.field4740[1] * this.field4740[12] - this.field4740[8] * this.field4740[3] * this.field4740[13])) * var1;
        float var12 = (this.field4740[4] * this.field4740[3] * this.field4740[13] + this.field4740[1] * this.field4740[7] * this.field4740[12] + (this.field4740[5] * this.field4740[0] * this.field4740[15] - this.field4740[0] * this.field4740[7] * this.field4740[13] - this.field4740[1] * this.field4740[4] * this.field4740[15]) - this.field4740[3] * this.field4740[5] * this.field4740[12]) * var1;
        float var13 = (this.field4740[3] * this.field4740[5] * this.field4740[8] + (this.field4740[4] * this.field4740[1] * this.field4740[11] + this.field4740[5] * -this.field4740[0] * this.field4740[11] + this.field4740[7] * this.field4740[0] * this.field4740[9] - this.field4740[1] * this.field4740[7] * this.field4740[8] - this.field4740[3] * this.field4740[4] * this.field4740[9])) * var1;
        float var14 = (this.field4740[6] * this.field4740[9] * this.field4740[12] + (this.field4740[8] * this.field4740[5] * this.field4740[14] + this.field4740[9] * -this.field4740[4] * this.field4740[14] + this.field4740[10] * this.field4740[4] * this.field4740[13] - this.field4740[10] * this.field4740[5] * this.field4740[12] - this.field4740[8] * this.field4740[6] * this.field4740[13])) * var1;
        float var15 = (this.field4740[8] * this.field4740[2] * this.field4740[13] + this.field4740[1] * this.field4740[10] * this.field4740[12] + (this.field4740[0] * this.field4740[9] * this.field4740[14] - this.field4740[0] * this.field4740[10] * this.field4740[13] - this.field4740[1] * this.field4740[8] * this.field4740[14]) - this.field4740[2] * this.field4740[9] * this.field4740[12]) * var1;
        float var16 = (this.field4740[2] * this.field4740[5] * this.field4740[12] + (this.field4740[1] * this.field4740[4] * this.field4740[14] + this.field4740[5] * -this.field4740[0] * this.field4740[14] + this.field4740[6] * this.field4740[0] * this.field4740[13] - this.field4740[6] * this.field4740[1] * this.field4740[12] - this.field4740[4] * this.field4740[2] * this.field4740[13])) * var1;
        float var17 = (this.field4740[2] * this.field4740[4] * this.field4740[9] + this.field4740[1] * this.field4740[6] * this.field4740[8] + (this.field4740[5] * this.field4740[0] * this.field4740[10] - this.field4740[0] * this.field4740[6] * this.field4740[9] - this.field4740[1] * this.field4740[4] * this.field4740[10]) - this.field4740[2] * this.field4740[5] * this.field4740[8]) * var1;
        this.field4740[0] = var2;
        this.field4740[1] = var3;
        this.field4740[2] = var4;
        this.field4740[3] = var5;
        this.field4740[4] = var6;
        this.field4740[5] = var7;
        this.field4740[6] = var8;
        this.field4740[7] = var9;
        this.field4740[8] = var10;
        this.field4740[9] = var11;
        this.field4740[10] = var12;
        this.field4740[11] = var13;
        this.field4740[12] = var14;
        this.field4740[13] = var15;
        this.field4740[14] = var16;
        this.field4740[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7521();
        this.method7520();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4740[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4740);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class451)) {
            return false;
        }
        class451 var2 = (class451) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4740[var3] != var2.field4740[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("rz.ag(B)[F")
    public float[] method7533() {
        float[] var1 = new float[3];
        class449 var2 = new class449(this.field4740[0], this.field4740[1], this.field4740[2]);
        class449 var3 = new class449(this.field4740[4], this.field4740[5], this.field4740[6]);
        class449 var4 = new class449(this.field4740[8], this.field4740[9], this.field4740[10]);
        var1[0] = var2.method7480();
        var1[1] = var3.method7480();
        var1[2] = var4.method7480();
        return var1;
    }
}
