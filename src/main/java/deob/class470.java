package deob;

import java.util.Arrays;

@ObfuscatedName("sr")
public final class class470 {

    @ObfuscatedName("sr.aw")
    public static class470[] field4846 = new class470[0];

    @ObfuscatedName("sr.al")
    public static int field4842 = 100;

    @ObfuscatedName("sr.ai")
    public static int field4843;

    @ObfuscatedName("sr.ar")
    public float[] field4844 = new float[16];

    @ObfuscatedName("sr.as")
    public static final class470 field4845;

    static {
        field4846 = new class470[100];
        field4843 = 0;
        field4845 = new class470();
    }

    @ObfuscatedName("es.aq(B)Lsr;")
    public static class470 method2825() {
        class470[] var0 = field4846;
        synchronized (field4846) {
            if (field4843 == 0) {
                return new class470();
            } else {
                field4846[--field4843].method7820();
                return field4846[field4843];
            }
        }
    }

    @ObfuscatedName("sr.aw(I)V")
    public void method7841() {
        class470[] var1 = field4846;
        synchronized (field4846) {
            if (field4843 < field4842 - 1) {
                field4846[++field4843 - 1] = this;
            }
        }
    }

    public class470() {
        this.method7820();
    }

    public class470(class470 arg0) {
        this.method7822(arg0);
    }

    public class470(class534 arg0, boolean arg1) {
        this.method7817(arg0, arg1);
    }

    @ObfuscatedName("sr.al(Luq;ZI)V")
    public void method7817(class534 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4844[var16] = arg0.method8599();
            }
            return;
        }
        class471 var3 = new class471();
        int var5 = arg0.method8594();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7880(var7);
        int var9 = arg0.method8594();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7885(var11);
        int var13 = arg0.method8594();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7882(var15);
        var3.method7881((float) arg0.method8594(), (float) arg0.method8594(), (float) arg0.method8594());
        this.method7852(var3);
    }

    @ObfuscatedName("sr.ai(I)[F")
    public float[] method7818() {
        float[] var1 = new float[3];
        if ((double) this.field4844[2] < 0.999D && (double) this.field4844[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4844[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4844[6] / var2, (double) this.field4844[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4844[1] / var2, (double) this.field4844[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4844[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4844[9]), (double) this.field4844[5]);
        }
        return var1;
    }

    @ObfuscatedName("sr.ar(I)[F")
    public float[] method7827() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4844[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4844[2];
            double var6 = (double) this.field4844[10];
            double var8 = (double) this.field4844[4];
            double var10 = (double) this.field4844[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4844[1];
            double var14 = (double) this.field4844[0];
            if (this.field4844[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("sr.as(I)V")
    public void method7820() {
        this.field4844[0] = 1.0F;
        this.field4844[1] = 0.0F;
        this.field4844[2] = 0.0F;
        this.field4844[3] = 0.0F;
        this.field4844[4] = 0.0F;
        this.field4844[5] = 1.0F;
        this.field4844[6] = 0.0F;
        this.field4844[7] = 0.0F;
        this.field4844[8] = 0.0F;
        this.field4844[9] = 0.0F;
        this.field4844[10] = 1.0F;
        this.field4844[11] = 0.0F;
        this.field4844[12] = 0.0F;
        this.field4844[13] = 0.0F;
        this.field4844[14] = 0.0F;
        this.field4844[15] = 1.0F;
    }

    @ObfuscatedName("sr.aa(B)V")
    public void method7849() {
        this.field4844[0] = 0.0F;
        this.field4844[1] = 0.0F;
        this.field4844[2] = 0.0F;
        this.field4844[3] = 0.0F;
        this.field4844[4] = 0.0F;
        this.field4844[5] = 0.0F;
        this.field4844[6] = 0.0F;
        this.field4844[7] = 0.0F;
        this.field4844[8] = 0.0F;
        this.field4844[9] = 0.0F;
        this.field4844[10] = 0.0F;
        this.field4844[11] = 0.0F;
        this.field4844[12] = 0.0F;
        this.field4844[13] = 0.0F;
        this.field4844[14] = 0.0F;
        this.field4844[15] = 0.0F;
    }

    @ObfuscatedName("sr.az(Lsr;S)V")
    public void method7822(class470 arg0) {
        System.arraycopy(arg0.field4844, 0, this.field4844, 0, 16);
    }

    @ObfuscatedName("sr.ao(FI)V")
    public void method7823(float arg0) {
        this.method7824(arg0, arg0, arg0);
    }

    @ObfuscatedName("sr.au(FFFB)V")
    public void method7824(float arg0, float arg1, float arg2) {
        this.method7820();
        this.field4844[0] = arg0;
        this.field4844[5] = arg1;
        this.field4844[10] = arg2;
    }

    @ObfuscatedName("sr.ak(Lsr;B)V")
    public void method7850(class470 arg0) {
        for (int var2 = 0; var2 < this.field4844.length; var2++) {
            this.field4844[var2] += arg0.field4844[var2];
        }
    }

    @ObfuscatedName("sr.ah(Lsr;I)V")
    public void method7826(class470 arg0) {
        float var2 = this.field4844[3] * arg0.field4844[12] + this.field4844[2] * arg0.field4844[8] + this.field4844[0] * arg0.field4844[0] + this.field4844[1] * arg0.field4844[4];
        float var3 = this.field4844[3] * arg0.field4844[13] + this.field4844[2] * arg0.field4844[9] + this.field4844[1] * arg0.field4844[5] + this.field4844[0] * arg0.field4844[1];
        float var4 = this.field4844[3] * arg0.field4844[14] + this.field4844[2] * arg0.field4844[10] + this.field4844[1] * arg0.field4844[6] + this.field4844[0] * arg0.field4844[2];
        float var5 = this.field4844[3] * arg0.field4844[15] + this.field4844[2] * arg0.field4844[11] + this.field4844[1] * arg0.field4844[7] + this.field4844[0] * arg0.field4844[3];
        float var6 = this.field4844[7] * arg0.field4844[12] + this.field4844[6] * arg0.field4844[8] + this.field4844[4] * arg0.field4844[0] + this.field4844[5] * arg0.field4844[4];
        float var7 = this.field4844[7] * arg0.field4844[13] + this.field4844[6] * arg0.field4844[9] + this.field4844[4] * arg0.field4844[1] + this.field4844[5] * arg0.field4844[5];
        float var8 = this.field4844[7] * arg0.field4844[14] + this.field4844[6] * arg0.field4844[10] + this.field4844[5] * arg0.field4844[6] + this.field4844[4] * arg0.field4844[2];
        float var9 = this.field4844[7] * arg0.field4844[15] + this.field4844[6] * arg0.field4844[11] + this.field4844[4] * arg0.field4844[3] + this.field4844[5] * arg0.field4844[7];
        float var10 = this.field4844[11] * arg0.field4844[12] + this.field4844[10] * arg0.field4844[8] + this.field4844[9] * arg0.field4844[4] + this.field4844[8] * arg0.field4844[0];
        float var11 = this.field4844[11] * arg0.field4844[13] + this.field4844[10] * arg0.field4844[9] + this.field4844[9] * arg0.field4844[5] + this.field4844[8] * arg0.field4844[1];
        float var12 = this.field4844[11] * arg0.field4844[14] + this.field4844[10] * arg0.field4844[10] + this.field4844[9] * arg0.field4844[6] + this.field4844[8] * arg0.field4844[2];
        float var13 = this.field4844[11] * arg0.field4844[15] + this.field4844[10] * arg0.field4844[11] + this.field4844[9] * arg0.field4844[7] + this.field4844[8] * arg0.field4844[3];
        float var14 = this.field4844[15] * arg0.field4844[12] + this.field4844[14] * arg0.field4844[8] + this.field4844[12] * arg0.field4844[0] + this.field4844[13] * arg0.field4844[4];
        float var15 = this.field4844[15] * arg0.field4844[13] + this.field4844[14] * arg0.field4844[9] + this.field4844[12] * arg0.field4844[1] + this.field4844[13] * arg0.field4844[5];
        float var16 = this.field4844[15] * arg0.field4844[14] + this.field4844[14] * arg0.field4844[10] + this.field4844[13] * arg0.field4844[6] + this.field4844[12] * arg0.field4844[2];
        float var17 = this.field4844[15] * arg0.field4844[15] + this.field4844[14] * arg0.field4844[11] + this.field4844[12] * arg0.field4844[3] + this.field4844[13] * arg0.field4844[7];
        this.field4844[0] = var2;
        this.field4844[1] = var3;
        this.field4844[2] = var4;
        this.field4844[3] = var5;
        this.field4844[4] = var6;
        this.field4844[5] = var7;
        this.field4844[6] = var8;
        this.field4844[7] = var9;
        this.field4844[8] = var10;
        this.field4844[9] = var11;
        this.field4844[10] = var12;
        this.field4844[11] = var13;
        this.field4844[12] = var14;
        this.field4844[13] = var15;
        this.field4844[14] = var16;
        this.field4844[15] = var17;
    }

    @ObfuscatedName("sr.aj(Lsf;I)V")
    public void method7853(class469 arg0) {
        float var2 = arg0.field4833 * arg0.field4833;
        float var3 = arg0.field4836 * arg0.field4833;
        float var4 = arg0.field4837 * arg0.field4833;
        float var5 = arg0.field4838 * arg0.field4833;
        float var6 = arg0.field4836 * arg0.field4836;
        float var7 = arg0.field4837 * arg0.field4836;
        float var8 = arg0.field4838 * arg0.field4836;
        float var9 = arg0.field4837 * arg0.field4837;
        float var10 = arg0.field4838 * arg0.field4837;
        float var11 = arg0.field4838 * arg0.field4838;
        this.field4844[0] = var2 + var6 - var11 - var9;
        this.field4844[1] = var5 + var7 + var7 + var5;
        this.field4844[2] = var8 - var4 - var4 + var8;
        this.field4844[4] = var7 - var5 - var5 + var7;
        this.field4844[5] = var2 + var9 - var6 - var11;
        this.field4844[6] = var3 + var10 + var10 + var3;
        this.field4844[8] = var4 + var8 + var8 + var4;
        this.field4844[9] = var10 - var3 - var3 + var10;
        this.field4844[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("sr.af(Lss;B)V")
    public void method7852(class471 arg0) {
        this.field4844[0] = arg0.field4850;
        this.field4844[1] = arg0.field4849;
        this.field4844[2] = arg0.field4857;
        this.field4844[3] = 0.0F;
        this.field4844[4] = arg0.field4851;
        this.field4844[5] = arg0.field4852;
        this.field4844[6] = arg0.field4848;
        this.field4844[7] = 0.0F;
        this.field4844[8] = arg0.field4854;
        this.field4844[9] = arg0.field4855;
        this.field4844[10] = arg0.field4860;
        this.field4844[11] = 0.0F;
        this.field4844[12] = arg0.field4856;
        this.field4844[13] = arg0.field4858;
        this.field4844[14] = arg0.field4859;
        this.field4844[15] = 1.0F;
    }

    @ObfuscatedName("sr.ax(I)F")
    public float method7828() {
        return this.field4844[3] * this.field4844[6] * this.field4844[9] * this.field4844[12] + (this.field4844[3] * this.field4844[5] * this.field4844[8] * this.field4844[14] + this.field4844[4] * this.field4844[3] * this.field4844[10] * this.field4844[13] + (this.field4844[7] * this.field4844[2] * this.field4844[8] * this.field4844[13] + this.field4844[5] * this.field4844[2] * this.field4844[11] * this.field4844[12] + (this.field4844[2] * this.field4844[4] * this.field4844[9] * this.field4844[15] + this.field4844[7] * this.field4844[1] * this.field4844[10] * this.field4844[12] + (this.field4844[1] * this.field4844[6] * this.field4844[8] * this.field4844[15] + this.field4844[4] * this.field4844[1] * this.field4844[11] * this.field4844[14] + (this.field4844[0] * this.field4844[7] * this.field4844[9] * this.field4844[14] + this.field4844[0] * this.field4844[6] * this.field4844[11] * this.field4844[13] + (this.field4844[5] * this.field4844[0] * this.field4844[10] * this.field4844[15] - this.field4844[5] * this.field4844[0] * this.field4844[11] * this.field4844[14] - this.field4844[0] * this.field4844[6] * this.field4844[9] * this.field4844[15]) - this.field4844[0] * this.field4844[7] * this.field4844[10] * this.field4844[13] - this.field4844[1] * this.field4844[4] * this.field4844[10] * this.field4844[15]) - this.field4844[6] * this.field4844[1] * this.field4844[11] * this.field4844[12] - this.field4844[7] * this.field4844[1] * this.field4844[8] * this.field4844[14]) - this.field4844[2] * this.field4844[4] * this.field4844[11] * this.field4844[13] - this.field4844[5] * this.field4844[2] * this.field4844[8] * this.field4844[15]) - this.field4844[7] * this.field4844[2] * this.field4844[9] * this.field4844[12] - this.field4844[3] * this.field4844[4] * this.field4844[9] * this.field4844[14]) - this.field4844[3] * this.field4844[5] * this.field4844[10] * this.field4844[12] - this.field4844[6] * this.field4844[3] * this.field4844[8] * this.field4844[13]);
    }

    @ObfuscatedName("sr.an(I)V")
    public void method7878() {
        float var1 = 1.0F / this.method7828();
        float var2 = (this.field4844[9] * this.field4844[7] * this.field4844[14] + this.field4844[11] * this.field4844[6] * this.field4844[13] + (this.field4844[5] * this.field4844[10] * this.field4844[15] - this.field4844[11] * this.field4844[5] * this.field4844[14] - this.field4844[6] * this.field4844[9] * this.field4844[15]) - this.field4844[7] * this.field4844[10] * this.field4844[13]) * var1;
        float var3 = (this.field4844[3] * this.field4844[10] * this.field4844[13] + (this.field4844[2] * this.field4844[9] * this.field4844[15] + this.field4844[11] * this.field4844[1] * this.field4844[14] + this.field4844[10] * -this.field4844[1] * this.field4844[15] - this.field4844[2] * this.field4844[11] * this.field4844[13] - this.field4844[3] * this.field4844[9] * this.field4844[14])) * var1;
        float var4 = (this.field4844[5] * this.field4844[3] * this.field4844[14] + this.field4844[7] * this.field4844[2] * this.field4844[13] + (this.field4844[6] * this.field4844[1] * this.field4844[15] - this.field4844[1] * this.field4844[7] * this.field4844[14] - this.field4844[5] * this.field4844[2] * this.field4844[15]) - this.field4844[3] * this.field4844[6] * this.field4844[13]) * var1;
        float var5 = (this.field4844[6] * this.field4844[3] * this.field4844[9] + (this.field4844[2] * this.field4844[5] * this.field4844[11] + this.field4844[1] * this.field4844[7] * this.field4844[10] + this.field4844[6] * -this.field4844[1] * this.field4844[11] - this.field4844[2] * this.field4844[7] * this.field4844[9] - this.field4844[3] * this.field4844[5] * this.field4844[10])) * var1;
        float var6 = (this.field4844[7] * this.field4844[10] * this.field4844[12] + (this.field4844[6] * this.field4844[8] * this.field4844[15] + this.field4844[10] * -this.field4844[4] * this.field4844[15] + this.field4844[11] * this.field4844[4] * this.field4844[14] - this.field4844[11] * this.field4844[6] * this.field4844[12] - this.field4844[8] * this.field4844[7] * this.field4844[14])) * var1;
        float var7 = (this.field4844[8] * this.field4844[3] * this.field4844[14] + this.field4844[2] * this.field4844[11] * this.field4844[12] + (this.field4844[10] * this.field4844[0] * this.field4844[15] - this.field4844[11] * this.field4844[0] * this.field4844[14] - this.field4844[2] * this.field4844[8] * this.field4844[15]) - this.field4844[3] * this.field4844[10] * this.field4844[12]) * var1;
        float var8 = (this.field4844[6] * this.field4844[3] * this.field4844[12] + (this.field4844[2] * this.field4844[4] * this.field4844[15] + this.field4844[6] * -this.field4844[0] * this.field4844[15] + this.field4844[0] * this.field4844[7] * this.field4844[14] - this.field4844[7] * this.field4844[2] * this.field4844[12] - this.field4844[3] * this.field4844[4] * this.field4844[14])) * var1;
        float var9 = (this.field4844[4] * this.field4844[3] * this.field4844[10] + this.field4844[2] * this.field4844[7] * this.field4844[8] + (this.field4844[6] * this.field4844[0] * this.field4844[11] - this.field4844[0] * this.field4844[7] * this.field4844[10] - this.field4844[4] * this.field4844[2] * this.field4844[11]) - this.field4844[6] * this.field4844[3] * this.field4844[8]) * var1;
        float var10 = (this.field4844[8] * this.field4844[7] * this.field4844[13] + this.field4844[5] * this.field4844[11] * this.field4844[12] + (this.field4844[9] * this.field4844[4] * this.field4844[15] - this.field4844[11] * this.field4844[4] * this.field4844[13] - this.field4844[8] * this.field4844[5] * this.field4844[15]) - this.field4844[9] * this.field4844[7] * this.field4844[12]) * var1;
        float var11 = (this.field4844[9] * this.field4844[3] * this.field4844[12] + (this.field4844[8] * this.field4844[1] * this.field4844[15] + this.field4844[9] * -this.field4844[0] * this.field4844[15] + this.field4844[0] * this.field4844[11] * this.field4844[13] - this.field4844[11] * this.field4844[1] * this.field4844[12] - this.field4844[3] * this.field4844[8] * this.field4844[13])) * var1;
        float var12 = (this.field4844[3] * this.field4844[4] * this.field4844[13] + this.field4844[1] * this.field4844[7] * this.field4844[12] + (this.field4844[0] * this.field4844[5] * this.field4844[15] - this.field4844[7] * this.field4844[0] * this.field4844[13] - this.field4844[4] * this.field4844[1] * this.field4844[15]) - this.field4844[5] * this.field4844[3] * this.field4844[12]) * var1;
        float var13 = (this.field4844[5] * this.field4844[3] * this.field4844[8] + (this.field4844[4] * this.field4844[1] * this.field4844[11] + this.field4844[5] * -this.field4844[0] * this.field4844[11] + this.field4844[0] * this.field4844[7] * this.field4844[9] - this.field4844[1] * this.field4844[7] * this.field4844[8] - this.field4844[3] * this.field4844[4] * this.field4844[9])) * var1;
        float var14 = (this.field4844[6] * this.field4844[9] * this.field4844[12] + (this.field4844[5] * this.field4844[8] * this.field4844[14] + this.field4844[9] * -this.field4844[4] * this.field4844[14] + this.field4844[4] * this.field4844[10] * this.field4844[13] - this.field4844[10] * this.field4844[5] * this.field4844[12] - this.field4844[6] * this.field4844[8] * this.field4844[13])) * var1;
        float var15 = (this.field4844[2] * this.field4844[8] * this.field4844[13] + this.field4844[10] * this.field4844[1] * this.field4844[12] + (this.field4844[9] * this.field4844[0] * this.field4844[14] - this.field4844[0] * this.field4844[10] * this.field4844[13] - this.field4844[1] * this.field4844[8] * this.field4844[14]) - this.field4844[2] * this.field4844[9] * this.field4844[12]) * var1;
        float var16 = (this.field4844[5] * this.field4844[2] * this.field4844[12] + (this.field4844[4] * this.field4844[1] * this.field4844[14] + this.field4844[5] * -this.field4844[0] * this.field4844[14] + this.field4844[0] * this.field4844[6] * this.field4844[13] - this.field4844[6] * this.field4844[1] * this.field4844[12] - this.field4844[4] * this.field4844[2] * this.field4844[13])) * var1;
        float var17 = (this.field4844[4] * this.field4844[2] * this.field4844[9] + this.field4844[6] * this.field4844[1] * this.field4844[8] + (this.field4844[5] * this.field4844[0] * this.field4844[10] - this.field4844[0] * this.field4844[6] * this.field4844[9] - this.field4844[4] * this.field4844[1] * this.field4844[10]) - this.field4844[2] * this.field4844[5] * this.field4844[8]) * var1;
        this.field4844[0] = var2;
        this.field4844[1] = var3;
        this.field4844[2] = var4;
        this.field4844[3] = var5;
        this.field4844[4] = var6;
        this.field4844[5] = var7;
        this.field4844[6] = var8;
        this.field4844[7] = var9;
        this.field4844[8] = var10;
        this.field4844[9] = var11;
        this.field4844[10] = var12;
        this.field4844[11] = var13;
        this.field4844[12] = var14;
        this.field4844[13] = var15;
        this.field4844[14] = var16;
        this.field4844[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7827();
        this.method7818();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4844[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4844);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class470)) {
            return false;
        }
        class470 var2 = (class470) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4844[var3] != var2.field4844[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("sr.ag(I)[F")
    public float[] method7816() {
        float[] var1 = new float[3];
        class468 var2 = new class468(this.field4844[0], this.field4844[1], this.field4844[2]);
        class468 var3 = new class468(this.field4844[4], this.field4844[5], this.field4844[6]);
        class468 var4 = new class468(this.field4844[8], this.field4844[9], this.field4844[10]);
        var1[0] = var2.method7779();
        var1[1] = var3.method7779();
        var1[2] = var4.method7779();
        return var1;
    }
}
