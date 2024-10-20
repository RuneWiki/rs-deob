package deob;

import java.util.Arrays;

@ObfuscatedName("rz")
public final class class463 {

    @ObfuscatedName("rz.ah")
    public static class463[] field4771 = new class463[0];

    @ObfuscatedName("rz.ab")
    public float[] field4773 = new float[16];

    @ObfuscatedName("rz.au")
    public static final class463 field4770;

    static {
        method5333(100);
        field4770 = new class463();
    }

    @ObfuscatedName("lu.at(II)V")
    public static void method5333(int arg0) {
        Statics.field4772 = arg0;
        field4771 = new class463[arg0];
        Statics.field3823 = 0;
    }

    @ObfuscatedName("js.ah(B)Lrz;")
    public static class463 method4469() {
        class463[] var0 = field4771;
        synchronized (field4771) {
            if (Statics.field3823 == 0) {
                return new class463();
            } else {
                field4771[--Statics.field3823].method7686();
                return field4771[Statics.field3823];
            }
        }
    }

    @ObfuscatedName("rz.ar(I)V")
    public void method7688() {
        class463[] var1 = field4771;
        synchronized (field4771) {
            if (Statics.field3823 < Statics.field4772 - 1) {
                field4771[++Statics.field3823 - 1] = this;
            }
        }
    }

    public class463() {
        this.method7686();
    }

    public class463(class463 arg0) {
        this.method7664(arg0);
    }

    public class463(class527 arg0, boolean arg1) {
        this.method7665(arg0, arg1);
    }

    @ObfuscatedName("rz.ao(Luj;ZI)V")
    public void method7665(class527 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4773[var16] = arg0.method8418();
            }
            return;
        }
        class464 var3 = new class464();
        int var5 = arg0.method8508();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7727(var7);
        int var9 = arg0.method8508();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7743(var11);
        int var13 = arg0.method8508();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7728(var15);
        var3.method7730((float) arg0.method8508(), (float) arg0.method8508(), (float) arg0.method8508());
        this.method7680(var3);
    }

    @ObfuscatedName("rz.ab(B)[F")
    public float[] method7678() {
        float[] var1 = new float[3];
        if ((double) this.field4773[2] < 0.999D && (double) this.field4773[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4773[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4773[6] / var2, (double) this.field4773[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4773[1] / var2, (double) this.field4773[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4773[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4773[9]), (double) this.field4773[5]);
        }
        return var1;
    }

    @ObfuscatedName("rz.au(B)[F")
    public float[] method7667() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4773[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4773[2];
            double var6 = (double) this.field4773[10];
            double var8 = (double) this.field4773[4];
            double var10 = (double) this.field4773[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4773[1];
            double var14 = (double) this.field4773[0];
            if (this.field4773[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("rz.aa(B)V")
    public void method7686() {
        this.field4773[0] = 1.0F;
        this.field4773[1] = 0.0F;
        this.field4773[2] = 0.0F;
        this.field4773[3] = 0.0F;
        this.field4773[4] = 0.0F;
        this.field4773[5] = 1.0F;
        this.field4773[6] = 0.0F;
        this.field4773[7] = 0.0F;
        this.field4773[8] = 0.0F;
        this.field4773[9] = 0.0F;
        this.field4773[10] = 1.0F;
        this.field4773[11] = 0.0F;
        this.field4773[12] = 0.0F;
        this.field4773[13] = 0.0F;
        this.field4773[14] = 0.0F;
        this.field4773[15] = 1.0F;
    }

    @ObfuscatedName("rz.ac(B)V")
    public void method7717() {
        this.field4773[0] = 0.0F;
        this.field4773[1] = 0.0F;
        this.field4773[2] = 0.0F;
        this.field4773[3] = 0.0F;
        this.field4773[4] = 0.0F;
        this.field4773[5] = 0.0F;
        this.field4773[6] = 0.0F;
        this.field4773[7] = 0.0F;
        this.field4773[8] = 0.0F;
        this.field4773[9] = 0.0F;
        this.field4773[10] = 0.0F;
        this.field4773[11] = 0.0F;
        this.field4773[12] = 0.0F;
        this.field4773[13] = 0.0F;
        this.field4773[14] = 0.0F;
        this.field4773[15] = 0.0F;
    }

    @ObfuscatedName("rz.al(Lrz;I)V")
    public void method7664(class463 arg0) {
        System.arraycopy(arg0.field4773, 0, this.field4773, 0, 16);
    }

    @ObfuscatedName("rz.az(FB)V")
    public void method7691(float arg0) {
        this.method7672(arg0, arg0, arg0);
    }

    @ObfuscatedName("rz.ap(FFFB)V")
    public void method7672(float arg0, float arg1, float arg2) {
        this.method7686();
        this.field4773[0] = arg0;
        this.field4773[5] = arg1;
        this.field4773[10] = arg2;
    }

    @ObfuscatedName("rz.av(Lrz;I)V")
    public void method7671(class463 arg0) {
        for (int var2 = 0; var2 < this.field4773.length; var2++) {
            this.field4773[var2] += arg0.field4773[var2];
        }
    }

    @ObfuscatedName("rz.ax(Lrz;I)V")
    public void method7674(class463 arg0) {
        float var2 = this.field4773[3] * arg0.field4773[12] + this.field4773[2] * arg0.field4773[8] + this.field4773[0] * arg0.field4773[0] + this.field4773[1] * arg0.field4773[4];
        float var3 = this.field4773[3] * arg0.field4773[13] + this.field4773[2] * arg0.field4773[9] + this.field4773[1] * arg0.field4773[5] + this.field4773[0] * arg0.field4773[1];
        float var4 = this.field4773[3] * arg0.field4773[14] + this.field4773[2] * arg0.field4773[10] + this.field4773[1] * arg0.field4773[6] + this.field4773[0] * arg0.field4773[2];
        float var5 = this.field4773[3] * arg0.field4773[15] + this.field4773[2] * arg0.field4773[11] + this.field4773[0] * arg0.field4773[3] + this.field4773[1] * arg0.field4773[7];
        float var6 = this.field4773[7] * arg0.field4773[12] + this.field4773[6] * arg0.field4773[8] + this.field4773[4] * arg0.field4773[0] + this.field4773[5] * arg0.field4773[4];
        float var7 = this.field4773[7] * arg0.field4773[13] + this.field4773[6] * arg0.field4773[9] + this.field4773[5] * arg0.field4773[5] + this.field4773[4] * arg0.field4773[1];
        float var8 = this.field4773[7] * arg0.field4773[14] + this.field4773[6] * arg0.field4773[10] + this.field4773[4] * arg0.field4773[2] + this.field4773[5] * arg0.field4773[6];
        float var9 = this.field4773[7] * arg0.field4773[15] + this.field4773[6] * arg0.field4773[11] + this.field4773[4] * arg0.field4773[3] + this.field4773[5] * arg0.field4773[7];
        float var10 = this.field4773[11] * arg0.field4773[12] + this.field4773[10] * arg0.field4773[8] + this.field4773[8] * arg0.field4773[0] + this.field4773[9] * arg0.field4773[4];
        float var11 = this.field4773[11] * arg0.field4773[13] + this.field4773[10] * arg0.field4773[9] + this.field4773[8] * arg0.field4773[1] + this.field4773[9] * arg0.field4773[5];
        float var12 = this.field4773[11] * arg0.field4773[14] + this.field4773[10] * arg0.field4773[10] + this.field4773[8] * arg0.field4773[2] + this.field4773[9] * arg0.field4773[6];
        float var13 = this.field4773[11] * arg0.field4773[15] + this.field4773[10] * arg0.field4773[11] + this.field4773[9] * arg0.field4773[7] + this.field4773[8] * arg0.field4773[3];
        float var14 = this.field4773[15] * arg0.field4773[12] + this.field4773[14] * arg0.field4773[8] + this.field4773[12] * arg0.field4773[0] + this.field4773[13] * arg0.field4773[4];
        float var15 = this.field4773[15] * arg0.field4773[13] + this.field4773[14] * arg0.field4773[9] + this.field4773[12] * arg0.field4773[1] + this.field4773[13] * arg0.field4773[5];
        float var16 = this.field4773[15] * arg0.field4773[14] + this.field4773[14] * arg0.field4773[10] + this.field4773[12] * arg0.field4773[2] + this.field4773[13] * arg0.field4773[6];
        float var17 = this.field4773[15] * arg0.field4773[15] + this.field4773[14] * arg0.field4773[11] + this.field4773[13] * arg0.field4773[7] + this.field4773[12] * arg0.field4773[3];
        this.field4773[0] = var2;
        this.field4773[1] = var3;
        this.field4773[2] = var4;
        this.field4773[3] = var5;
        this.field4773[4] = var6;
        this.field4773[5] = var7;
        this.field4773[6] = var8;
        this.field4773[7] = var9;
        this.field4773[8] = var10;
        this.field4773[9] = var11;
        this.field4773[10] = var12;
        this.field4773[11] = var13;
        this.field4773[12] = var14;
        this.field4773[13] = var15;
        this.field4773[14] = var16;
        this.field4773[15] = var17;
    }

    @ObfuscatedName("rz.as(Lrq;I)V")
    public void method7675(class462 arg0) {
        float var2 = arg0.field4768 * arg0.field4768;
        float var3 = arg0.field4769 * arg0.field4768;
        float var4 = arg0.field4768 * arg0.field4766;
        float var5 = arg0.field4768 * arg0.field4767;
        float var6 = arg0.field4769 * arg0.field4769;
        float var7 = arg0.field4769 * arg0.field4766;
        float var8 = arg0.field4769 * arg0.field4767;
        float var9 = arg0.field4766 * arg0.field4766;
        float var10 = arg0.field4767 * arg0.field4766;
        float var11 = arg0.field4767 * arg0.field4767;
        this.field4773[0] = var2 + var6 - var11 - var9;
        this.field4773[1] = var5 + var7 + var7 + var5;
        this.field4773[2] = var8 - var4 - var4 + var8;
        this.field4773[4] = var7 - var5 - var5 + var7;
        this.field4773[5] = var2 + var9 - var6 - var11;
        this.field4773[6] = var3 + var10 + var10 + var3;
        this.field4773[8] = var4 + var8 + var8 + var4;
        this.field4773[9] = var10 - var3 - var3 + var10;
        this.field4773[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("rz.ay(Lrj;I)V")
    public void method7680(class464 arg0) {
        this.field4773[0] = arg0.field4777;
        this.field4773[1] = arg0.field4776;
        this.field4773[2] = arg0.field4786;
        this.field4773[3] = 0.0F;
        this.field4773[4] = arg0.field4778;
        this.field4773[5] = arg0.field4779;
        this.field4773[6] = arg0.field4780;
        this.field4773[7] = 0.0F;
        this.field4773[8] = arg0.field4781;
        this.field4773[9] = arg0.field4782;
        this.field4773[10] = arg0.field4783;
        this.field4773[11] = 0.0F;
        this.field4773[12] = arg0.field4784;
        this.field4773[13] = arg0.field4785;
        this.field4773[14] = arg0.field4775;
        this.field4773[15] = 1.0F;
    }

    @ObfuscatedName("rz.ak(I)F")
    public float method7677() {
        return this.field4773[3] * this.field4773[6] * this.field4773[9] * this.field4773[12] + (this.field4773[5] * this.field4773[3] * this.field4773[8] * this.field4773[14] + this.field4773[4] * this.field4773[3] * this.field4773[10] * this.field4773[13] + (this.field4773[7] * this.field4773[2] * this.field4773[8] * this.field4773[13] + this.field4773[2] * this.field4773[5] * this.field4773[11] * this.field4773[12] + (this.field4773[2] * this.field4773[4] * this.field4773[9] * this.field4773[15] + this.field4773[1] * this.field4773[7] * this.field4773[10] * this.field4773[12] + (this.field4773[6] * this.field4773[1] * this.field4773[8] * this.field4773[15] + this.field4773[4] * this.field4773[1] * this.field4773[11] * this.field4773[14] + (this.field4773[0] * this.field4773[7] * this.field4773[9] * this.field4773[14] + this.field4773[6] * this.field4773[0] * this.field4773[11] * this.field4773[13] + (this.field4773[5] * this.field4773[0] * this.field4773[10] * this.field4773[15] - this.field4773[5] * this.field4773[0] * this.field4773[11] * this.field4773[14] - this.field4773[6] * this.field4773[0] * this.field4773[9] * this.field4773[15]) - this.field4773[7] * this.field4773[0] * this.field4773[10] * this.field4773[13] - this.field4773[4] * this.field4773[1] * this.field4773[10] * this.field4773[15]) - this.field4773[1] * this.field4773[6] * this.field4773[11] * this.field4773[12] - this.field4773[1] * this.field4773[7] * this.field4773[8] * this.field4773[14]) - this.field4773[2] * this.field4773[4] * this.field4773[11] * this.field4773[13] - this.field4773[2] * this.field4773[5] * this.field4773[8] * this.field4773[15]) - this.field4773[7] * this.field4773[2] * this.field4773[9] * this.field4773[12] - this.field4773[3] * this.field4773[4] * this.field4773[9] * this.field4773[14]) - this.field4773[5] * this.field4773[3] * this.field4773[10] * this.field4773[12] - this.field4773[6] * this.field4773[3] * this.field4773[8] * this.field4773[13]);
    }

    @ObfuscatedName("rz.aj(I)V")
    public void method7666() {
        float var1 = 1.0F / this.method7677();
        float var2 = (this.field4773[7] * this.field4773[9] * this.field4773[14] + this.field4773[6] * this.field4773[11] * this.field4773[13] + (this.field4773[10] * this.field4773[5] * this.field4773[15] - this.field4773[5] * this.field4773[11] * this.field4773[14] - this.field4773[9] * this.field4773[6] * this.field4773[15]) - this.field4773[10] * this.field4773[7] * this.field4773[13]) * var1;
        float var3 = (this.field4773[10] * this.field4773[3] * this.field4773[13] + (this.field4773[2] * this.field4773[9] * this.field4773[15] + this.field4773[10] * -this.field4773[1] * this.field4773[15] + this.field4773[11] * this.field4773[1] * this.field4773[14] - this.field4773[11] * this.field4773[2] * this.field4773[13] - this.field4773[9] * this.field4773[3] * this.field4773[14])) * var1;
        float var4 = (this.field4773[3] * this.field4773[5] * this.field4773[14] + this.field4773[2] * this.field4773[7] * this.field4773[13] + (this.field4773[6] * this.field4773[1] * this.field4773[15] - this.field4773[7] * this.field4773[1] * this.field4773[14] - this.field4773[2] * this.field4773[5] * this.field4773[15]) - this.field4773[6] * this.field4773[3] * this.field4773[13]) * var1;
        float var5 = (this.field4773[6] * this.field4773[3] * this.field4773[9] + (this.field4773[5] * this.field4773[2] * this.field4773[11] + this.field4773[6] * -this.field4773[1] * this.field4773[11] + this.field4773[1] * this.field4773[7] * this.field4773[10] - this.field4773[7] * this.field4773[2] * this.field4773[9] - this.field4773[5] * this.field4773[3] * this.field4773[10])) * var1;
        float var6 = (this.field4773[7] * this.field4773[10] * this.field4773[12] + (this.field4773[6] * this.field4773[8] * this.field4773[15] + this.field4773[11] * this.field4773[4] * this.field4773[14] + this.field4773[10] * -this.field4773[4] * this.field4773[15] - this.field4773[11] * this.field4773[6] * this.field4773[12] - this.field4773[7] * this.field4773[8] * this.field4773[14])) * var1;
        float var7 = (this.field4773[3] * this.field4773[8] * this.field4773[14] + this.field4773[11] * this.field4773[2] * this.field4773[12] + (this.field4773[0] * this.field4773[10] * this.field4773[15] - this.field4773[0] * this.field4773[11] * this.field4773[14] - this.field4773[8] * this.field4773[2] * this.field4773[15]) - this.field4773[10] * this.field4773[3] * this.field4773[12]) * var1;
        float var8 = (this.field4773[3] * this.field4773[6] * this.field4773[12] + (this.field4773[4] * this.field4773[2] * this.field4773[15] + this.field4773[7] * this.field4773[0] * this.field4773[14] + this.field4773[6] * -this.field4773[0] * this.field4773[15] - this.field4773[2] * this.field4773[7] * this.field4773[12] - this.field4773[3] * this.field4773[4] * this.field4773[14])) * var1;
        float var9 = (this.field4773[3] * this.field4773[4] * this.field4773[10] + this.field4773[2] * this.field4773[7] * this.field4773[8] + (this.field4773[6] * this.field4773[0] * this.field4773[11] - this.field4773[7] * this.field4773[0] * this.field4773[10] - this.field4773[2] * this.field4773[4] * this.field4773[11]) - this.field4773[6] * this.field4773[3] * this.field4773[8]) * var1;
        float var10 = (this.field4773[7] * this.field4773[8] * this.field4773[13] + this.field4773[11] * this.field4773[5] * this.field4773[12] + (this.field4773[4] * this.field4773[9] * this.field4773[15] - this.field4773[4] * this.field4773[11] * this.field4773[13] - this.field4773[5] * this.field4773[8] * this.field4773[15]) - this.field4773[7] * this.field4773[9] * this.field4773[12]) * var1;
        float var11 = (this.field4773[9] * this.field4773[3] * this.field4773[12] + (this.field4773[8] * this.field4773[1] * this.field4773[15] + this.field4773[9] * -this.field4773[0] * this.field4773[15] + this.field4773[0] * this.field4773[11] * this.field4773[13] - this.field4773[1] * this.field4773[11] * this.field4773[12] - this.field4773[8] * this.field4773[3] * this.field4773[13])) * var1;
        float var12 = (this.field4773[3] * this.field4773[4] * this.field4773[13] + this.field4773[7] * this.field4773[1] * this.field4773[12] + (this.field4773[5] * this.field4773[0] * this.field4773[15] - this.field4773[7] * this.field4773[0] * this.field4773[13] - this.field4773[4] * this.field4773[1] * this.field4773[15]) - this.field4773[3] * this.field4773[5] * this.field4773[12]) * var1;
        float var13 = (this.field4773[5] * this.field4773[3] * this.field4773[8] + (this.field4773[1] * this.field4773[4] * this.field4773[11] + this.field4773[5] * -this.field4773[0] * this.field4773[11] + this.field4773[0] * this.field4773[7] * this.field4773[9] - this.field4773[7] * this.field4773[1] * this.field4773[8] - this.field4773[3] * this.field4773[4] * this.field4773[9])) * var1;
        float var14 = (this.field4773[9] * this.field4773[6] * this.field4773[12] + (this.field4773[5] * this.field4773[8] * this.field4773[14] + this.field4773[9] * -this.field4773[4] * this.field4773[14] + this.field4773[4] * this.field4773[10] * this.field4773[13] - this.field4773[5] * this.field4773[10] * this.field4773[12] - this.field4773[8] * this.field4773[6] * this.field4773[13])) * var1;
        float var15 = (this.field4773[2] * this.field4773[8] * this.field4773[13] + this.field4773[10] * this.field4773[1] * this.field4773[12] + (this.field4773[9] * this.field4773[0] * this.field4773[14] - this.field4773[0] * this.field4773[10] * this.field4773[13] - this.field4773[1] * this.field4773[8] * this.field4773[14]) - this.field4773[2] * this.field4773[9] * this.field4773[12]) * var1;
        float var16 = (this.field4773[2] * this.field4773[5] * this.field4773[12] + (this.field4773[1] * this.field4773[4] * this.field4773[14] + this.field4773[5] * -this.field4773[0] * this.field4773[14] + this.field4773[0] * this.field4773[6] * this.field4773[13] - this.field4773[6] * this.field4773[1] * this.field4773[12] - this.field4773[4] * this.field4773[2] * this.field4773[13])) * var1;
        float var17 = (this.field4773[4] * this.field4773[2] * this.field4773[9] + this.field4773[1] * this.field4773[6] * this.field4773[8] + (this.field4773[5] * this.field4773[0] * this.field4773[10] - this.field4773[6] * this.field4773[0] * this.field4773[9] - this.field4773[4] * this.field4773[1] * this.field4773[10]) - this.field4773[2] * this.field4773[5] * this.field4773[8]) * var1;
        this.field4773[0] = var2;
        this.field4773[1] = var3;
        this.field4773[2] = var4;
        this.field4773[3] = var5;
        this.field4773[4] = var6;
        this.field4773[5] = var7;
        this.field4773[6] = var8;
        this.field4773[7] = var9;
        this.field4773[8] = var10;
        this.field4773[9] = var11;
        this.field4773[10] = var12;
        this.field4773[11] = var13;
        this.field4773[12] = var14;
        this.field4773[13] = var15;
        this.field4773[14] = var16;
        this.field4773[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7667();
        this.method7678();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4773[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4773);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class463)) {
            return false;
        }
        class463 var2 = (class463) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4773[var3] != var2.field4773[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("rz.am(I)[F")
    public float[] method7679() {
        float[] var1 = new float[3];
        class461 var2 = new class461(this.field4773[0], this.field4773[1], this.field4773[2]);
        class461 var3 = new class461(this.field4773[4], this.field4773[5], this.field4773[6]);
        class461 var4 = new class461(this.field4773[8], this.field4773[9], this.field4773[10]);
        var1[0] = var2.method7631();
        var1[1] = var3.method7631();
        var1[2] = var4.method7631();
        return var1;
    }
}
