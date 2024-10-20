package deob;

import java.util.Arrays;

@ObfuscatedName("no")
public final class class367 {

    @ObfuscatedName("no.b")
    public static class367[] field4192 = new class367[0];

    @ObfuscatedName("no.t")
    public float[] field4197 = new float[16];

    @ObfuscatedName("no.s")
    public static final class367 field4195;

    static {
        method1537(100);
        field4195 = new class367();
    }

    @ObfuscatedName("client.c(II)V")
    public static void method1537(int arg0) {
        Statics.field4193 = arg0;
        field4192 = new class367[arg0];
        Statics.field1664 = 0;
    }

    @ObfuscatedName("no.b(I)V")
    public void method6013() {
        class367[] var1 = field4192;
        synchronized (field4192) {
            if (Statics.field1664 < Statics.field4193 - 1) {
                field4192[++Statics.field1664 - 1] = this;
            }
        }
    }

    public class367() {
        this.method6009();
    }

    public class367(class367 arg0) {
        this.method6011(arg0);
    }

    public class367(class419 arg0, boolean arg1) {
        this.method6006(arg0, arg1);
    }

    @ObfuscatedName("no.p(Lpi;ZI)V")
    public void method6006(class419 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4197[var4] = arg0.method6677();
            }
            return;
        }
        class368 var3 = new class368();
        var3.method6089(class379.method5565(arg0.method6673()));
        var3.method6074(class379.method5565(arg0.method6673()));
        var3.method6075(class379.method5565(arg0.method6673()));
        var3.method6076((float) arg0.method6673(), (float) arg0.method6673(), (float) arg0.method6673());
        this.method6070(var3);
    }

    @ObfuscatedName("no.m(B)[F")
    public float[] method6007() {
        float[] var1 = new float[3];
        if ((double) this.field4197[2] < 0.999D && (double) this.field4197[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4197[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4197[6] / var2, (double) this.field4197[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4197[1] / var2, (double) this.field4197[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4197[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4197[9]), (double) this.field4197[5]);
        }
        return var1;
    }

    @ObfuscatedName("no.t(I)[F")
    public float[] method6008() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4197[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4197[2];
            double var6 = (double) this.field4197[10];
            double var8 = (double) this.field4197[4];
            double var10 = (double) this.field4197[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4197[1];
            double var14 = (double) this.field4197[0];
            if (this.field4197[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("no.s(I)V")
    public void method6009() {
        this.field4197[0] = 1.0F;
        this.field4197[1] = 0.0F;
        this.field4197[2] = 0.0F;
        this.field4197[3] = 0.0F;
        this.field4197[4] = 0.0F;
        this.field4197[5] = 1.0F;
        this.field4197[6] = 0.0F;
        this.field4197[7] = 0.0F;
        this.field4197[8] = 0.0F;
        this.field4197[9] = 0.0F;
        this.field4197[10] = 1.0F;
        this.field4197[11] = 0.0F;
        this.field4197[12] = 0.0F;
        this.field4197[13] = 0.0F;
        this.field4197[14] = 0.0F;
        this.field4197[15] = 1.0F;
    }

    @ObfuscatedName("no.j(I)V")
    public void method6065() {
        this.field4197[0] = 0.0F;
        this.field4197[1] = 0.0F;
        this.field4197[2] = 0.0F;
        this.field4197[3] = 0.0F;
        this.field4197[4] = 0.0F;
        this.field4197[5] = 0.0F;
        this.field4197[6] = 0.0F;
        this.field4197[7] = 0.0F;
        this.field4197[8] = 0.0F;
        this.field4197[9] = 0.0F;
        this.field4197[10] = 0.0F;
        this.field4197[11] = 0.0F;
        this.field4197[12] = 0.0F;
        this.field4197[13] = 0.0F;
        this.field4197[14] = 0.0F;
        this.field4197[15] = 0.0F;
    }

    @ObfuscatedName("no.w(Lno;I)V")
    public void method6011(class367 arg0) {
        System.arraycopy(arg0.field4197, 0, this.field4197, 0, 16);
    }

    @ObfuscatedName("no.n(FB)V")
    public void method6012(float arg0) {
        this.method6024(arg0, arg0, arg0);
    }

    @ObfuscatedName("no.r(FFFI)V")
    public void method6024(float arg0, float arg1, float arg2) {
        this.method6009();
        this.field4197[0] = arg0;
        this.field4197[5] = arg1;
        this.field4197[10] = arg2;
    }

    @ObfuscatedName("no.o(Lno;S)V")
    public void method6014(class367 arg0) {
        for (int var2 = 0; var2 < this.field4197.length; var2++) {
            this.field4197[var2] += arg0.field4197[var2];
        }
    }

    @ObfuscatedName("no.v(Lno;I)V")
    public void method6027(class367 arg0) {
        float var2 = this.field4197[3] * arg0.field4197[12] + this.field4197[2] * arg0.field4197[8] + this.field4197[1] * arg0.field4197[4] + this.field4197[0] * arg0.field4197[0];
        float var3 = this.field4197[3] * arg0.field4197[13] + this.field4197[2] * arg0.field4197[9] + this.field4197[1] * arg0.field4197[5] + this.field4197[0] * arg0.field4197[1];
        float var4 = this.field4197[3] * arg0.field4197[14] + this.field4197[2] * arg0.field4197[10] + this.field4197[1] * arg0.field4197[6] + this.field4197[0] * arg0.field4197[2];
        float var5 = this.field4197[3] * arg0.field4197[15] + this.field4197[2] * arg0.field4197[11] + this.field4197[1] * arg0.field4197[7] + this.field4197[0] * arg0.field4197[3];
        float var6 = this.field4197[7] * arg0.field4197[12] + this.field4197[6] * arg0.field4197[8] + this.field4197[4] * arg0.field4197[0] + this.field4197[5] * arg0.field4197[4];
        float var7 = this.field4197[7] * arg0.field4197[13] + this.field4197[6] * arg0.field4197[9] + this.field4197[5] * arg0.field4197[5] + this.field4197[4] * arg0.field4197[1];
        float var8 = this.field4197[7] * arg0.field4197[14] + this.field4197[6] * arg0.field4197[10] + this.field4197[5] * arg0.field4197[6] + this.field4197[4] * arg0.field4197[2];
        float var9 = this.field4197[7] * arg0.field4197[15] + this.field4197[6] * arg0.field4197[11] + this.field4197[5] * arg0.field4197[7] + this.field4197[4] * arg0.field4197[3];
        float var10 = this.field4197[11] * arg0.field4197[12] + this.field4197[10] * arg0.field4197[8] + this.field4197[8] * arg0.field4197[0] + this.field4197[9] * arg0.field4197[4];
        float var11 = this.field4197[11] * arg0.field4197[13] + this.field4197[10] * arg0.field4197[9] + this.field4197[9] * arg0.field4197[5] + this.field4197[8] * arg0.field4197[1];
        float var12 = this.field4197[11] * arg0.field4197[14] + this.field4197[10] * arg0.field4197[10] + this.field4197[8] * arg0.field4197[2] + this.field4197[9] * arg0.field4197[6];
        float var13 = this.field4197[11] * arg0.field4197[15] + this.field4197[10] * arg0.field4197[11] + this.field4197[8] * arg0.field4197[3] + this.field4197[9] * arg0.field4197[7];
        float var14 = this.field4197[15] * arg0.field4197[12] + this.field4197[14] * arg0.field4197[8] + this.field4197[13] * arg0.field4197[4] + this.field4197[12] * arg0.field4197[0];
        float var15 = this.field4197[15] * arg0.field4197[13] + this.field4197[14] * arg0.field4197[9] + this.field4197[12] * arg0.field4197[1] + this.field4197[13] * arg0.field4197[5];
        float var16 = this.field4197[15] * arg0.field4197[14] + this.field4197[14] * arg0.field4197[10] + this.field4197[13] * arg0.field4197[6] + this.field4197[12] * arg0.field4197[2];
        float var17 = this.field4197[15] * arg0.field4197[15] + this.field4197[14] * arg0.field4197[11] + this.field4197[13] * arg0.field4197[7] + this.field4197[12] * arg0.field4197[3];
        this.field4197[0] = var2;
        this.field4197[1] = var3;
        this.field4197[2] = var4;
        this.field4197[3] = var5;
        this.field4197[4] = var6;
        this.field4197[5] = var7;
        this.field4197[6] = var8;
        this.field4197[7] = var9;
        this.field4197[8] = var10;
        this.field4197[9] = var11;
        this.field4197[10] = var12;
        this.field4197[11] = var13;
        this.field4197[12] = var14;
        this.field4197[13] = var15;
        this.field4197[14] = var16;
        this.field4197[15] = var17;
    }

    @ObfuscatedName("no.d(Lns;B)V")
    public void method6068(class366 arg0) {
        float var2 = arg0.field4184 * arg0.field4184;
        float var3 = arg0.field4187 * arg0.field4184;
        float var4 = arg0.field4189 * arg0.field4184;
        float var5 = arg0.field4188 * arg0.field4184;
        float var6 = arg0.field4187 * arg0.field4187;
        float var7 = arg0.field4189 * arg0.field4187;
        float var8 = arg0.field4188 * arg0.field4187;
        float var9 = arg0.field4189 * arg0.field4189;
        float var10 = arg0.field4189 * arg0.field4188;
        float var11 = arg0.field4188 * arg0.field4188;
        this.field4197[0] = var2 + var6 - var11 - var9;
        this.field4197[1] = var5 + var7 + var7 + var5;
        this.field4197[2] = var8 - var4 - var4 + var8;
        this.field4197[4] = var7 - var5 - var5 + var7;
        this.field4197[5] = var2 + var9 - var6 - var11;
        this.field4197[6] = var3 + var10 + var10 + var3;
        this.field4197[8] = var4 + var8 + var8 + var4;
        this.field4197[9] = var10 - var3 - var3 + var10;
        this.field4197[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("no.h(Lnu;B)V")
    public void method6070(class368 arg0) {
        this.field4197[0] = arg0.field4198;
        this.field4197[1] = arg0.field4199;
        this.field4197[2] = arg0.field4200;
        this.field4197[3] = 0.0F;
        this.field4197[4] = arg0.field4201;
        this.field4197[5] = arg0.field4202;
        this.field4197[6] = arg0.field4203;
        this.field4197[7] = 0.0F;
        this.field4197[8] = arg0.field4205;
        this.field4197[9] = arg0.field4204;
        this.field4197[10] = arg0.field4206;
        this.field4197[11] = 0.0F;
        this.field4197[12] = arg0.field4207;
        this.field4197[13] = arg0.field4208;
        this.field4197[14] = arg0.field4209;
        this.field4197[15] = 1.0F;
    }

    @ObfuscatedName("no.g(B)F")
    public float method6036() {
        return this.field4197[3] * this.field4197[6] * this.field4197[9] * this.field4197[12] + (this.field4197[3] * this.field4197[5] * this.field4197[8] * this.field4197[14] + this.field4197[3] * this.field4197[4] * this.field4197[10] * this.field4197[13] + (this.field4197[2] * this.field4197[7] * this.field4197[8] * this.field4197[13] + this.field4197[2] * this.field4197[5] * this.field4197[11] * this.field4197[12] + (this.field4197[2] * this.field4197[4] * this.field4197[9] * this.field4197[15] + this.field4197[1] * this.field4197[7] * this.field4197[10] * this.field4197[12] + (this.field4197[6] * this.field4197[1] * this.field4197[8] * this.field4197[15] + this.field4197[1] * this.field4197[4] * this.field4197[11] * this.field4197[14] + (this.field4197[7] * this.field4197[0] * this.field4197[9] * this.field4197[14] + this.field4197[6] * this.field4197[0] * this.field4197[11] * this.field4197[13] + (this.field4197[5] * this.field4197[0] * this.field4197[10] * this.field4197[15] - this.field4197[5] * this.field4197[0] * this.field4197[11] * this.field4197[14] - this.field4197[0] * this.field4197[6] * this.field4197[9] * this.field4197[15]) - this.field4197[7] * this.field4197[0] * this.field4197[10] * this.field4197[13] - this.field4197[4] * this.field4197[1] * this.field4197[10] * this.field4197[15]) - this.field4197[6] * this.field4197[1] * this.field4197[11] * this.field4197[12] - this.field4197[7] * this.field4197[1] * this.field4197[8] * this.field4197[14]) - this.field4197[4] * this.field4197[2] * this.field4197[11] * this.field4197[13] - this.field4197[5] * this.field4197[2] * this.field4197[8] * this.field4197[15]) - this.field4197[2] * this.field4197[7] * this.field4197[9] * this.field4197[12] - this.field4197[3] * this.field4197[4] * this.field4197[9] * this.field4197[14]) - this.field4197[5] * this.field4197[3] * this.field4197[10] * this.field4197[12] - this.field4197[3] * this.field4197[6] * this.field4197[8] * this.field4197[13]);
    }

    @ObfuscatedName("no.e(I)V")
    public void method6035() {
        float var1 = 1.0F / this.method6036();
        float var2 = (this.field4197[9] * this.field4197[7] * this.field4197[14] + this.field4197[6] * this.field4197[11] * this.field4197[13] + (this.field4197[5] * this.field4197[10] * this.field4197[15] - this.field4197[5] * this.field4197[11] * this.field4197[14] - this.field4197[6] * this.field4197[9] * this.field4197[15]) - this.field4197[10] * this.field4197[7] * this.field4197[13]) * var1;
        float var3 = (this.field4197[3] * this.field4197[10] * this.field4197[13] + (this.field4197[9] * this.field4197[2] * this.field4197[15] + this.field4197[11] * this.field4197[1] * this.field4197[14] + this.field4197[10] * -this.field4197[1] * this.field4197[15] - this.field4197[2] * this.field4197[11] * this.field4197[13] - this.field4197[9] * this.field4197[3] * this.field4197[14])) * var1;
        float var4 = (this.field4197[5] * this.field4197[3] * this.field4197[14] + this.field4197[7] * this.field4197[2] * this.field4197[13] + (this.field4197[1] * this.field4197[6] * this.field4197[15] - this.field4197[7] * this.field4197[1] * this.field4197[14] - this.field4197[2] * this.field4197[5] * this.field4197[15]) - this.field4197[3] * this.field4197[6] * this.field4197[13]) * var1;
        float var5 = (this.field4197[6] * this.field4197[3] * this.field4197[9] + (this.field4197[2] * this.field4197[5] * this.field4197[11] + this.field4197[7] * this.field4197[1] * this.field4197[10] + this.field4197[6] * -this.field4197[1] * this.field4197[11] - this.field4197[7] * this.field4197[2] * this.field4197[9] - this.field4197[5] * this.field4197[3] * this.field4197[10])) * var1;
        float var6 = (this.field4197[10] * this.field4197[7] * this.field4197[12] + (this.field4197[8] * this.field4197[6] * this.field4197[15] + this.field4197[11] * this.field4197[4] * this.field4197[14] + this.field4197[10] * -this.field4197[4] * this.field4197[15] - this.field4197[6] * this.field4197[11] * this.field4197[12] - this.field4197[8] * this.field4197[7] * this.field4197[14])) * var1;
        float var7 = (this.field4197[8] * this.field4197[3] * this.field4197[14] + this.field4197[11] * this.field4197[2] * this.field4197[12] + (this.field4197[0] * this.field4197[10] * this.field4197[15] - this.field4197[11] * this.field4197[0] * this.field4197[14] - this.field4197[8] * this.field4197[2] * this.field4197[15]) - this.field4197[3] * this.field4197[10] * this.field4197[12]) * var1;
        float var8 = (this.field4197[3] * this.field4197[6] * this.field4197[12] + (this.field4197[4] * this.field4197[2] * this.field4197[15] + this.field4197[0] * this.field4197[7] * this.field4197[14] + this.field4197[6] * -this.field4197[0] * this.field4197[15] - this.field4197[7] * this.field4197[2] * this.field4197[12] - this.field4197[4] * this.field4197[3] * this.field4197[14])) * var1;
        float var9 = (this.field4197[4] * this.field4197[3] * this.field4197[10] + this.field4197[2] * this.field4197[7] * this.field4197[8] + (this.field4197[0] * this.field4197[6] * this.field4197[11] - this.field4197[0] * this.field4197[7] * this.field4197[10] - this.field4197[2] * this.field4197[4] * this.field4197[11]) - this.field4197[3] * this.field4197[6] * this.field4197[8]) * var1;
        float var10 = (this.field4197[7] * this.field4197[8] * this.field4197[13] + this.field4197[5] * this.field4197[11] * this.field4197[12] + (this.field4197[4] * this.field4197[9] * this.field4197[15] - this.field4197[4] * this.field4197[11] * this.field4197[13] - this.field4197[5] * this.field4197[8] * this.field4197[15]) - this.field4197[7] * this.field4197[9] * this.field4197[12]) * var1;
        float var11 = (this.field4197[9] * this.field4197[3] * this.field4197[12] + (this.field4197[1] * this.field4197[8] * this.field4197[15] + this.field4197[0] * this.field4197[11] * this.field4197[13] + this.field4197[9] * -this.field4197[0] * this.field4197[15] - this.field4197[11] * this.field4197[1] * this.field4197[12] - this.field4197[3] * this.field4197[8] * this.field4197[13])) * var1;
        float var12 = (this.field4197[3] * this.field4197[4] * this.field4197[13] + this.field4197[7] * this.field4197[1] * this.field4197[12] + (this.field4197[0] * this.field4197[5] * this.field4197[15] - this.field4197[0] * this.field4197[7] * this.field4197[13] - this.field4197[4] * this.field4197[1] * this.field4197[15]) - this.field4197[3] * this.field4197[5] * this.field4197[12]) * var1;
        float var13 = (this.field4197[5] * this.field4197[3] * this.field4197[8] + (this.field4197[4] * this.field4197[1] * this.field4197[11] + this.field4197[0] * this.field4197[7] * this.field4197[9] + this.field4197[5] * -this.field4197[0] * this.field4197[11] - this.field4197[1] * this.field4197[7] * this.field4197[8] - this.field4197[3] * this.field4197[4] * this.field4197[9])) * var1;
        float var14 = (this.field4197[9] * this.field4197[6] * this.field4197[12] + (this.field4197[5] * this.field4197[8] * this.field4197[14] + this.field4197[10] * this.field4197[4] * this.field4197[13] + this.field4197[9] * -this.field4197[4] * this.field4197[14] - this.field4197[5] * this.field4197[10] * this.field4197[12] - this.field4197[6] * this.field4197[8] * this.field4197[13])) * var1;
        float var15 = (this.field4197[8] * this.field4197[2] * this.field4197[13] + this.field4197[10] * this.field4197[1] * this.field4197[12] + (this.field4197[9] * this.field4197[0] * this.field4197[14] - this.field4197[0] * this.field4197[10] * this.field4197[13] - this.field4197[8] * this.field4197[1] * this.field4197[14]) - this.field4197[2] * this.field4197[9] * this.field4197[12]) * var1;
        float var16 = (this.field4197[5] * this.field4197[2] * this.field4197[12] + (this.field4197[4] * this.field4197[1] * this.field4197[14] + this.field4197[0] * this.field4197[6] * this.field4197[13] + this.field4197[5] * -this.field4197[0] * this.field4197[14] - this.field4197[1] * this.field4197[6] * this.field4197[12] - this.field4197[4] * this.field4197[2] * this.field4197[13])) * var1;
        float var17 = (this.field4197[2] * this.field4197[4] * this.field4197[9] + this.field4197[6] * this.field4197[1] * this.field4197[8] + (this.field4197[0] * this.field4197[5] * this.field4197[10] - this.field4197[6] * this.field4197[0] * this.field4197[9] - this.field4197[4] * this.field4197[1] * this.field4197[10]) - this.field4197[2] * this.field4197[5] * this.field4197[8]) * var1;
        this.field4197[0] = var2;
        this.field4197[1] = var3;
        this.field4197[2] = var4;
        this.field4197[3] = var5;
        this.field4197[4] = var6;
        this.field4197[5] = var7;
        this.field4197[6] = var8;
        this.field4197[7] = var9;
        this.field4197[8] = var10;
        this.field4197[9] = var11;
        this.field4197[10] = var12;
        this.field4197[11] = var13;
        this.field4197[12] = var14;
        this.field4197[13] = var15;
        this.field4197[14] = var16;
        this.field4197[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method6008();
        this.method6007();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4197[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4197);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class367)) {
            return false;
        }
        class367 var2 = (class367) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4197[var3] != var2.field4197[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("no.a(S)[F")
    public float[] method6020() {
        float[] var1 = new float[3];
        class365 var2 = new class365(this.field4197[0], this.field4197[1], this.field4197[2]);
        class365 var3 = new class365(this.field4197[4], this.field4197[5], this.field4197[6]);
        class365 var4 = new class365(this.field4197[8], this.field4197[9], this.field4197[10]);
        var1[0] = var2.method5975();
        var1[1] = var3.method5975();
        var1[2] = var4.method5975();
        return var1;
    }
}
