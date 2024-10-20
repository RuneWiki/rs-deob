package deob;

import java.util.Arrays;

@ObfuscatedName("qt")
public final class class422 {

    @ObfuscatedName("qt.al")
    public static class422[] field4612 = new class422[0];

    @ObfuscatedName("qt.ac")
    public static int field4610 = 100;

    @ObfuscatedName("qt.ab")
    public static int field4611;

    @ObfuscatedName("qt.an")
    public float[] field4609 = new float[16];

    @ObfuscatedName("qt.ao")
    public static final class422 field4613;

    static {
        field4612 = new class422[100];
        field4611 = 0;
        field4613 = new class422();
    }

    @ObfuscatedName("qt.aj(I)V")
    public void method7227() {
        class422[] var1 = field4612;
        synchronized (field4612) {
            if (field4611 < field4610 - 1) {
                field4612[++field4611 - 1] = this;
            }
        }
    }

    public class422() {
        this.method7195();
    }

    public class422(class422 arg0) {
        this.method7189(arg0);
    }

    public class422(class478 arg0, boolean arg1) {
        this.method7221(arg0, arg1);
    }

    @ObfuscatedName("qt.al(Lsy;ZI)V")
    public void method7221(class478 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4609[var16] = arg0.method7910();
            }
            return;
        }
        class423 var3 = new class423();
        int var5 = arg0.method7882();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7243(var7);
        int var9 = arg0.method7882();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7244(var11);
        int var13 = arg0.method7882();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7247(var15);
        var3.method7252((float) arg0.method7882(), (float) arg0.method7882(), (float) arg0.method7882());
        this.method7238(var3);
    }

    @ObfuscatedName("qt.ac(B)[F")
    public float[] method7183() {
        float[] var1 = new float[3];
        if ((double) this.field4609[2] < 0.999D && (double) this.field4609[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4609[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4609[6] / var2, (double) this.field4609[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4609[1] / var2, (double) this.field4609[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4609[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4609[9]), (double) this.field4609[5]);
        }
        return var1;
    }

    @ObfuscatedName("qt.ab(I)[F")
    public float[] method7197() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4609[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4609[2];
            double var6 = (double) this.field4609[10];
            double var8 = (double) this.field4609[4];
            double var10 = (double) this.field4609[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4609[1];
            double var14 = (double) this.field4609[0];
            if (this.field4609[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("qt.an(I)V")
    public void method7195() {
        this.field4609[0] = 1.0F;
        this.field4609[1] = 0.0F;
        this.field4609[2] = 0.0F;
        this.field4609[3] = 0.0F;
        this.field4609[4] = 0.0F;
        this.field4609[5] = 1.0F;
        this.field4609[6] = 0.0F;
        this.field4609[7] = 0.0F;
        this.field4609[8] = 0.0F;
        this.field4609[9] = 0.0F;
        this.field4609[10] = 1.0F;
        this.field4609[11] = 0.0F;
        this.field4609[12] = 0.0F;
        this.field4609[13] = 0.0F;
        this.field4609[14] = 0.0F;
        this.field4609[15] = 1.0F;
    }

    @ObfuscatedName("qt.ao(B)V")
    public void method7216() {
        this.field4609[0] = 0.0F;
        this.field4609[1] = 0.0F;
        this.field4609[2] = 0.0F;
        this.field4609[3] = 0.0F;
        this.field4609[4] = 0.0F;
        this.field4609[5] = 0.0F;
        this.field4609[6] = 0.0F;
        this.field4609[7] = 0.0F;
        this.field4609[8] = 0.0F;
        this.field4609[9] = 0.0F;
        this.field4609[10] = 0.0F;
        this.field4609[11] = 0.0F;
        this.field4609[12] = 0.0F;
        this.field4609[13] = 0.0F;
        this.field4609[14] = 0.0F;
        this.field4609[15] = 0.0F;
    }

    @ObfuscatedName("qt.av(Lqt;I)V")
    public void method7189(class422 arg0) {
        System.arraycopy(arg0.field4609, 0, this.field4609, 0, 16);
    }

    @ObfuscatedName("qt.aq(FI)V")
    public void method7188(float arg0) {
        this.method7186(arg0, arg0, arg0);
    }

    @ObfuscatedName("qt.ap(FFFI)V")
    public void method7186(float arg0, float arg1, float arg2) {
        this.method7195();
        this.field4609[0] = arg0;
        this.field4609[5] = arg1;
        this.field4609[10] = arg2;
    }

    @ObfuscatedName("qt.ar(Lqt;I)V")
    public void method7224(class422 arg0) {
        for (int var2 = 0; var2 < this.field4609.length; var2++) {
            this.field4609[var2] += arg0.field4609[var2];
        }
    }

    @ObfuscatedName("qt.ak(Lqt;B)V")
    public void method7190(class422 arg0) {
        float var2 = this.field4609[3] * arg0.field4609[12] + this.field4609[2] * arg0.field4609[8] + this.field4609[1] * arg0.field4609[4] + this.field4609[0] * arg0.field4609[0];
        float var3 = this.field4609[3] * arg0.field4609[13] + this.field4609[2] * arg0.field4609[9] + this.field4609[1] * arg0.field4609[5] + this.field4609[0] * arg0.field4609[1];
        float var4 = this.field4609[3] * arg0.field4609[14] + this.field4609[2] * arg0.field4609[10] + this.field4609[0] * arg0.field4609[2] + this.field4609[1] * arg0.field4609[6];
        float var5 = this.field4609[3] * arg0.field4609[15] + this.field4609[2] * arg0.field4609[11] + this.field4609[1] * arg0.field4609[7] + this.field4609[0] * arg0.field4609[3];
        float var6 = this.field4609[7] * arg0.field4609[12] + this.field4609[6] * arg0.field4609[8] + this.field4609[4] * arg0.field4609[0] + this.field4609[5] * arg0.field4609[4];
        float var7 = this.field4609[7] * arg0.field4609[13] + this.field4609[6] * arg0.field4609[9] + this.field4609[5] * arg0.field4609[5] + this.field4609[4] * arg0.field4609[1];
        float var8 = this.field4609[7] * arg0.field4609[14] + this.field4609[6] * arg0.field4609[10] + this.field4609[5] * arg0.field4609[6] + this.field4609[4] * arg0.field4609[2];
        float var9 = this.field4609[7] * arg0.field4609[15] + this.field4609[6] * arg0.field4609[11] + this.field4609[4] * arg0.field4609[3] + this.field4609[5] * arg0.field4609[7];
        float var10 = this.field4609[11] * arg0.field4609[12] + this.field4609[10] * arg0.field4609[8] + this.field4609[8] * arg0.field4609[0] + this.field4609[9] * arg0.field4609[4];
        float var11 = this.field4609[11] * arg0.field4609[13] + this.field4609[10] * arg0.field4609[9] + this.field4609[9] * arg0.field4609[5] + this.field4609[8] * arg0.field4609[1];
        float var12 = this.field4609[11] * arg0.field4609[14] + this.field4609[10] * arg0.field4609[10] + this.field4609[8] * arg0.field4609[2] + this.field4609[9] * arg0.field4609[6];
        float var13 = this.field4609[11] * arg0.field4609[15] + this.field4609[10] * arg0.field4609[11] + this.field4609[9] * arg0.field4609[7] + this.field4609[8] * arg0.field4609[3];
        float var14 = this.field4609[15] * arg0.field4609[12] + this.field4609[14] * arg0.field4609[8] + this.field4609[13] * arg0.field4609[4] + this.field4609[12] * arg0.field4609[0];
        float var15 = this.field4609[15] * arg0.field4609[13] + this.field4609[14] * arg0.field4609[9] + this.field4609[12] * arg0.field4609[1] + this.field4609[13] * arg0.field4609[5];
        float var16 = this.field4609[15] * arg0.field4609[14] + this.field4609[14] * arg0.field4609[10] + this.field4609[13] * arg0.field4609[6] + this.field4609[12] * arg0.field4609[2];
        float var17 = this.field4609[15] * arg0.field4609[15] + this.field4609[14] * arg0.field4609[11] + this.field4609[13] * arg0.field4609[7] + this.field4609[12] * arg0.field4609[3];
        this.field4609[0] = var2;
        this.field4609[1] = var3;
        this.field4609[2] = var4;
        this.field4609[3] = var5;
        this.field4609[4] = var6;
        this.field4609[5] = var7;
        this.field4609[6] = var8;
        this.field4609[7] = var9;
        this.field4609[8] = var10;
        this.field4609[9] = var11;
        this.field4609[10] = var12;
        this.field4609[11] = var13;
        this.field4609[12] = var14;
        this.field4609[13] = var15;
        this.field4609[14] = var16;
        this.field4609[15] = var17;
    }

    @ObfuscatedName("qt.ax(Lqh;B)V")
    public void method7191(class421 arg0) {
        float var2 = arg0.field4604 * arg0.field4604;
        float var3 = arg0.field4604 * arg0.field4603;
        float var4 = arg0.field4605 * arg0.field4604;
        float var5 = arg0.field4606 * arg0.field4604;
        float var6 = arg0.field4603 * arg0.field4603;
        float var7 = arg0.field4605 * arg0.field4603;
        float var8 = arg0.field4606 * arg0.field4603;
        float var9 = arg0.field4605 * arg0.field4605;
        float var10 = arg0.field4606 * arg0.field4605;
        float var11 = arg0.field4606 * arg0.field4606;
        this.field4609[0] = var2 + var6 - var11 - var9;
        this.field4609[1] = var5 + var7 + var7 + var5;
        this.field4609[2] = var8 - var4 - var4 + var8;
        this.field4609[4] = var7 - var5 - var5 + var7;
        this.field4609[5] = var2 + var9 - var6 - var11;
        this.field4609[6] = var3 + var10 + var10 + var3;
        this.field4609[8] = var4 + var8 + var8 + var4;
        this.field4609[9] = var10 - var3 - var3 + var10;
        this.field4609[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("qt.as(Lqx;B)V")
    public void method7238(class423 arg0) {
        this.field4609[0] = arg0.field4620;
        this.field4609[1] = arg0.field4625;
        this.field4609[2] = arg0.field4616;
        this.field4609[3] = 0.0F;
        this.field4609[4] = arg0.field4617;
        this.field4609[5] = arg0.field4618;
        this.field4609[6] = arg0.field4619;
        this.field4609[7] = 0.0F;
        this.field4609[8] = arg0.field4614;
        this.field4609[9] = arg0.field4621;
        this.field4609[10] = arg0.field4622;
        this.field4609[11] = 0.0F;
        this.field4609[12] = arg0.field4623;
        this.field4609[13] = arg0.field4615;
        this.field4609[14] = arg0.field4624;
        this.field4609[15] = 1.0F;
    }

    @ObfuscatedName("qt.ay(B)F")
    public float method7193() {
        return this.field4609[3] * this.field4609[6] * this.field4609[9] * this.field4609[12] + (this.field4609[5] * this.field4609[3] * this.field4609[8] * this.field4609[14] + this.field4609[3] * this.field4609[4] * this.field4609[10] * this.field4609[13] + (this.field4609[7] * this.field4609[2] * this.field4609[8] * this.field4609[13] + this.field4609[2] * this.field4609[5] * this.field4609[11] * this.field4609[12] + (this.field4609[4] * this.field4609[2] * this.field4609[9] * this.field4609[15] + this.field4609[7] * this.field4609[1] * this.field4609[10] * this.field4609[12] + (this.field4609[1] * this.field4609[6] * this.field4609[8] * this.field4609[15] + this.field4609[4] * this.field4609[1] * this.field4609[11] * this.field4609[14] + (this.field4609[7] * this.field4609[0] * this.field4609[9] * this.field4609[14] + this.field4609[6] * this.field4609[0] * this.field4609[11] * this.field4609[13] + (this.field4609[5] * this.field4609[0] * this.field4609[10] * this.field4609[15] - this.field4609[5] * this.field4609[0] * this.field4609[11] * this.field4609[14] - this.field4609[0] * this.field4609[6] * this.field4609[9] * this.field4609[15]) - this.field4609[7] * this.field4609[0] * this.field4609[10] * this.field4609[13] - this.field4609[1] * this.field4609[4] * this.field4609[10] * this.field4609[15]) - this.field4609[6] * this.field4609[1] * this.field4609[11] * this.field4609[12] - this.field4609[7] * this.field4609[1] * this.field4609[8] * this.field4609[14]) - this.field4609[4] * this.field4609[2] * this.field4609[11] * this.field4609[13] - this.field4609[5] * this.field4609[2] * this.field4609[8] * this.field4609[15]) - this.field4609[7] * this.field4609[2] * this.field4609[9] * this.field4609[12] - this.field4609[3] * this.field4609[4] * this.field4609[9] * this.field4609[14]) - this.field4609[5] * this.field4609[3] * this.field4609[10] * this.field4609[12] - this.field4609[3] * this.field4609[6] * this.field4609[8] * this.field4609[13]);
    }

    @ObfuscatedName("qt.am(I)V")
    public void method7194() {
        float var1 = 1.0F / this.method7193();
        float var2 = (this.field4609[9] * this.field4609[7] * this.field4609[14] + this.field4609[6] * this.field4609[11] * this.field4609[13] + (this.field4609[10] * this.field4609[5] * this.field4609[15] - this.field4609[11] * this.field4609[5] * this.field4609[14] - this.field4609[9] * this.field4609[6] * this.field4609[15]) - this.field4609[7] * this.field4609[10] * this.field4609[13]) * var1;
        float var3 = (this.field4609[3] * this.field4609[10] * this.field4609[13] + (this.field4609[9] * this.field4609[2] * this.field4609[15] + this.field4609[10] * -this.field4609[1] * this.field4609[15] + this.field4609[11] * this.field4609[1] * this.field4609[14] - this.field4609[2] * this.field4609[11] * this.field4609[13] - this.field4609[3] * this.field4609[9] * this.field4609[14])) * var1;
        float var4 = (this.field4609[3] * this.field4609[5] * this.field4609[14] + this.field4609[2] * this.field4609[7] * this.field4609[13] + (this.field4609[6] * this.field4609[1] * this.field4609[15] - this.field4609[1] * this.field4609[7] * this.field4609[14] - this.field4609[5] * this.field4609[2] * this.field4609[15]) - this.field4609[3] * this.field4609[6] * this.field4609[13]) * var1;
        float var5 = (this.field4609[3] * this.field4609[6] * this.field4609[9] + (this.field4609[2] * this.field4609[5] * this.field4609[11] + this.field4609[6] * -this.field4609[1] * this.field4609[11] + this.field4609[1] * this.field4609[7] * this.field4609[10] - this.field4609[2] * this.field4609[7] * this.field4609[9] - this.field4609[3] * this.field4609[5] * this.field4609[10])) * var1;
        float var6 = (this.field4609[7] * this.field4609[10] * this.field4609[12] + (this.field4609[8] * this.field4609[6] * this.field4609[15] + this.field4609[4] * this.field4609[11] * this.field4609[14] + this.field4609[10] * -this.field4609[4] * this.field4609[15] - this.field4609[11] * this.field4609[6] * this.field4609[12] - this.field4609[7] * this.field4609[8] * this.field4609[14])) * var1;
        float var7 = (this.field4609[3] * this.field4609[8] * this.field4609[14] + this.field4609[2] * this.field4609[11] * this.field4609[12] + (this.field4609[0] * this.field4609[10] * this.field4609[15] - this.field4609[11] * this.field4609[0] * this.field4609[14] - this.field4609[8] * this.field4609[2] * this.field4609[15]) - this.field4609[10] * this.field4609[3] * this.field4609[12]) * var1;
        float var8 = (this.field4609[6] * this.field4609[3] * this.field4609[12] + (this.field4609[4] * this.field4609[2] * this.field4609[15] + this.field4609[6] * -this.field4609[0] * this.field4609[15] + this.field4609[0] * this.field4609[7] * this.field4609[14] - this.field4609[2] * this.field4609[7] * this.field4609[12] - this.field4609[4] * this.field4609[3] * this.field4609[14])) * var1;
        float var9 = (this.field4609[3] * this.field4609[4] * this.field4609[10] + this.field4609[7] * this.field4609[2] * this.field4609[8] + (this.field4609[0] * this.field4609[6] * this.field4609[11] - this.field4609[0] * this.field4609[7] * this.field4609[10] - this.field4609[4] * this.field4609[2] * this.field4609[11]) - this.field4609[3] * this.field4609[6] * this.field4609[8]) * var1;
        float var10 = (this.field4609[8] * this.field4609[7] * this.field4609[13] + this.field4609[11] * this.field4609[5] * this.field4609[12] + (this.field4609[9] * this.field4609[4] * this.field4609[15] - this.field4609[4] * this.field4609[11] * this.field4609[13] - this.field4609[5] * this.field4609[8] * this.field4609[15]) - this.field4609[7] * this.field4609[9] * this.field4609[12]) * var1;
        float var11 = (this.field4609[9] * this.field4609[3] * this.field4609[12] + (this.field4609[8] * this.field4609[1] * this.field4609[15] + this.field4609[9] * -this.field4609[0] * this.field4609[15] + this.field4609[11] * this.field4609[0] * this.field4609[13] - this.field4609[11] * this.field4609[1] * this.field4609[12] - this.field4609[8] * this.field4609[3] * this.field4609[13])) * var1;
        float var12 = (this.field4609[3] * this.field4609[4] * this.field4609[13] + this.field4609[1] * this.field4609[7] * this.field4609[12] + (this.field4609[0] * this.field4609[5] * this.field4609[15] - this.field4609[0] * this.field4609[7] * this.field4609[13] - this.field4609[4] * this.field4609[1] * this.field4609[15]) - this.field4609[3] * this.field4609[5] * this.field4609[12]) * var1;
        float var13 = (this.field4609[3] * this.field4609[5] * this.field4609[8] + (this.field4609[1] * this.field4609[4] * this.field4609[11] + this.field4609[0] * this.field4609[7] * this.field4609[9] + this.field4609[5] * -this.field4609[0] * this.field4609[11] - this.field4609[7] * this.field4609[1] * this.field4609[8] - this.field4609[3] * this.field4609[4] * this.field4609[9])) * var1;
        float var14 = (this.field4609[9] * this.field4609[6] * this.field4609[12] + (this.field4609[8] * this.field4609[5] * this.field4609[14] + this.field4609[9] * -this.field4609[4] * this.field4609[14] + this.field4609[4] * this.field4609[10] * this.field4609[13] - this.field4609[5] * this.field4609[10] * this.field4609[12] - this.field4609[6] * this.field4609[8] * this.field4609[13])) * var1;
        float var15 = (this.field4609[2] * this.field4609[8] * this.field4609[13] + this.field4609[1] * this.field4609[10] * this.field4609[12] + (this.field4609[9] * this.field4609[0] * this.field4609[14] - this.field4609[10] * this.field4609[0] * this.field4609[13] - this.field4609[1] * this.field4609[8] * this.field4609[14]) - this.field4609[2] * this.field4609[9] * this.field4609[12]) * var1;
        float var16 = (this.field4609[5] * this.field4609[2] * this.field4609[12] + (this.field4609[4] * this.field4609[1] * this.field4609[14] + this.field4609[5] * -this.field4609[0] * this.field4609[14] + this.field4609[6] * this.field4609[0] * this.field4609[13] - this.field4609[1] * this.field4609[6] * this.field4609[12] - this.field4609[4] * this.field4609[2] * this.field4609[13])) * var1;
        float var17 = (this.field4609[4] * this.field4609[2] * this.field4609[9] + this.field4609[1] * this.field4609[6] * this.field4609[8] + (this.field4609[5] * this.field4609[0] * this.field4609[10] - this.field4609[0] * this.field4609[6] * this.field4609[9] - this.field4609[1] * this.field4609[4] * this.field4609[10]) - this.field4609[5] * this.field4609[2] * this.field4609[8]) * var1;
        this.field4609[0] = var2;
        this.field4609[1] = var3;
        this.field4609[2] = var4;
        this.field4609[3] = var5;
        this.field4609[4] = var6;
        this.field4609[5] = var7;
        this.field4609[6] = var8;
        this.field4609[7] = var9;
        this.field4609[8] = var10;
        this.field4609[9] = var11;
        this.field4609[10] = var12;
        this.field4609[11] = var13;
        this.field4609[12] = var14;
        this.field4609[13] = var15;
        this.field4609[14] = var16;
        this.field4609[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7197();
        this.method7183();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4609[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4609);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class422)) {
            return false;
        }
        class422 var2 = (class422) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4609[var3] != var2.field4609[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("qt.az(I)[F")
    public float[] method7196() {
        float[] var1 = new float[3];
        class420 var2 = new class420(this.field4609[0], this.field4609[1], this.field4609[2]);
        class420 var3 = new class420(this.field4609[4], this.field4609[5], this.field4609[6]);
        class420 var4 = new class420(this.field4609[8], this.field4609[9], this.field4609[10]);
        var1[0] = var2.method7154();
        var1[1] = var3.method7154();
        var1[2] = var4.method7154();
        return var1;
    }
}
