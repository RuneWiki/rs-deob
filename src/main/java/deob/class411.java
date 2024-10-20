package deob;

import java.util.Arrays;

@ObfuscatedName("oj")
public final class class411 {

    @ObfuscatedName("oj.e")
    public static class411[] field4610 = new class411[0];

    @ObfuscatedName("oj.v")
    public static int field4616 = 100;

    @ObfuscatedName("oj.x")
    public static int field4609;

    @ObfuscatedName("oj.m")
    public float[] field4613 = new float[16];

    @ObfuscatedName("oj.q")
    public static final class411 field4614;

    static {
        field4610 = new class411[100];
        field4609 = 0;
        field4614 = new class411();
    }

    @ObfuscatedName("le.h(B)Loj;")
    public static class411 method5785() {
        class411[] var0 = field4610;
        synchronized (field4610) {
            if (field4609 == 0) {
                return new class411();
            } else {
                field4610[--field4609].method7080();
                return field4610[field4609];
            }
        }
    }

    @ObfuscatedName("oj.e(I)V")
    public void method7093() {
        class411[] var1 = field4610;
        synchronized (field4610) {
            if (field4609 < field4616 - 1) {
                field4610[++field4609 - 1] = this;
            }
        }
    }

    public class411() {
        this.method7080();
    }

    public class411(class411 arg0) {
        this.method7082(arg0);
    }

    public class411(class467 arg0, boolean arg1) {
        this.method7077(arg0, arg1);
    }

    @ObfuscatedName("oj.v(Lqy;ZI)V")
    public void method7077(class467 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4613[var16] = arg0.method7798();
            }
            return;
        }
        class412 var3 = new class412();
        int var5 = arg0.method7795();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7133(var7);
        int var9 = arg0.method7795();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7134(var11);
        int var13 = arg0.method7795();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7138(var15);
        var3.method7136((float) arg0.method7795(), (float) arg0.method7795(), (float) arg0.method7795());
        this.method7088(var3);
    }

    @ObfuscatedName("oj.x(B)[F")
    public float[] method7078() {
        float[] var1 = new float[3];
        if ((double) this.field4613[2] < 0.999D && (double) this.field4613[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4613[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4613[6] / var2, (double) this.field4613[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4613[1] / var2, (double) this.field4613[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4613[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4613[9]), (double) this.field4613[5]);
        }
        return var1;
    }

    @ObfuscatedName("oj.m(I)[F")
    public float[] method7079() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4613[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4613[2];
            double var6 = (double) this.field4613[10];
            double var8 = (double) this.field4613[4];
            double var10 = (double) this.field4613[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4613[1];
            double var14 = (double) this.field4613[0];
            if (this.field4613[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("oj.q(B)V")
    public void method7080() {
        this.field4613[0] = 1.0F;
        this.field4613[1] = 0.0F;
        this.field4613[2] = 0.0F;
        this.field4613[3] = 0.0F;
        this.field4613[4] = 0.0F;
        this.field4613[5] = 1.0F;
        this.field4613[6] = 0.0F;
        this.field4613[7] = 0.0F;
        this.field4613[8] = 0.0F;
        this.field4613[9] = 0.0F;
        this.field4613[10] = 1.0F;
        this.field4613[11] = 0.0F;
        this.field4613[12] = 0.0F;
        this.field4613[13] = 0.0F;
        this.field4613[14] = 0.0F;
        this.field4613[15] = 1.0F;
    }

    @ObfuscatedName("oj.f(I)V")
    public void method7081() {
        this.field4613[0] = 0.0F;
        this.field4613[1] = 0.0F;
        this.field4613[2] = 0.0F;
        this.field4613[3] = 0.0F;
        this.field4613[4] = 0.0F;
        this.field4613[5] = 0.0F;
        this.field4613[6] = 0.0F;
        this.field4613[7] = 0.0F;
        this.field4613[8] = 0.0F;
        this.field4613[9] = 0.0F;
        this.field4613[10] = 0.0F;
        this.field4613[11] = 0.0F;
        this.field4613[12] = 0.0F;
        this.field4613[13] = 0.0F;
        this.field4613[14] = 0.0F;
        this.field4613[15] = 0.0F;
    }

    @ObfuscatedName("oj.r(Loj;I)V")
    public void method7082(class411 arg0) {
        System.arraycopy(arg0.field4613, 0, this.field4613, 0, 16);
    }

    @ObfuscatedName("oj.u(FS)V")
    public void method7083(float arg0) {
        this.method7084(arg0, arg0, arg0);
    }

    @ObfuscatedName("oj.b(FFFI)V")
    public void method7084(float arg0, float arg1, float arg2) {
        this.method7080();
        this.field4613[0] = arg0;
        this.field4613[5] = arg1;
        this.field4613[10] = arg2;
    }

    @ObfuscatedName("oj.j(Loj;I)V")
    public void method7128(class411 arg0) {
        for (int var2 = 0; var2 < this.field4613.length; var2++) {
            this.field4613[var2] += arg0.field4613[var2];
        }
    }

    @ObfuscatedName("oj.g(Loj;I)V")
    public void method7086(class411 arg0) {
        float var2 = this.field4613[3] * arg0.field4613[12] + this.field4613[2] * arg0.field4613[8] + this.field4613[1] * arg0.field4613[4] + this.field4613[0] * arg0.field4613[0];
        float var3 = this.field4613[3] * arg0.field4613[13] + this.field4613[2] * arg0.field4613[9] + this.field4613[1] * arg0.field4613[5] + this.field4613[0] * arg0.field4613[1];
        float var4 = this.field4613[3] * arg0.field4613[14] + this.field4613[2] * arg0.field4613[10] + this.field4613[1] * arg0.field4613[6] + this.field4613[0] * arg0.field4613[2];
        float var5 = this.field4613[3] * arg0.field4613[15] + this.field4613[2] * arg0.field4613[11] + this.field4613[0] * arg0.field4613[3] + this.field4613[1] * arg0.field4613[7];
        float var6 = this.field4613[7] * arg0.field4613[12] + this.field4613[6] * arg0.field4613[8] + this.field4613[4] * arg0.field4613[0] + this.field4613[5] * arg0.field4613[4];
        float var7 = this.field4613[7] * arg0.field4613[13] + this.field4613[6] * arg0.field4613[9] + this.field4613[4] * arg0.field4613[1] + this.field4613[5] * arg0.field4613[5];
        float var8 = this.field4613[7] * arg0.field4613[14] + this.field4613[6] * arg0.field4613[10] + this.field4613[5] * arg0.field4613[6] + this.field4613[4] * arg0.field4613[2];
        float var9 = this.field4613[7] * arg0.field4613[15] + this.field4613[6] * arg0.field4613[11] + this.field4613[5] * arg0.field4613[7] + this.field4613[4] * arg0.field4613[3];
        float var10 = this.field4613[11] * arg0.field4613[12] + this.field4613[10] * arg0.field4613[8] + this.field4613[8] * arg0.field4613[0] + this.field4613[9] * arg0.field4613[4];
        float var11 = this.field4613[11] * arg0.field4613[13] + this.field4613[10] * arg0.field4613[9] + this.field4613[9] * arg0.field4613[5] + this.field4613[8] * arg0.field4613[1];
        float var12 = this.field4613[11] * arg0.field4613[14] + this.field4613[10] * arg0.field4613[10] + this.field4613[9] * arg0.field4613[6] + this.field4613[8] * arg0.field4613[2];
        float var13 = this.field4613[11] * arg0.field4613[15] + this.field4613[10] * arg0.field4613[11] + this.field4613[9] * arg0.field4613[7] + this.field4613[8] * arg0.field4613[3];
        float var14 = this.field4613[15] * arg0.field4613[12] + this.field4613[14] * arg0.field4613[8] + this.field4613[13] * arg0.field4613[4] + this.field4613[12] * arg0.field4613[0];
        float var15 = this.field4613[15] * arg0.field4613[13] + this.field4613[14] * arg0.field4613[9] + this.field4613[12] * arg0.field4613[1] + this.field4613[13] * arg0.field4613[5];
        float var16 = this.field4613[15] * arg0.field4613[14] + this.field4613[14] * arg0.field4613[10] + this.field4613[13] * arg0.field4613[6] + this.field4613[12] * arg0.field4613[2];
        float var17 = this.field4613[15] * arg0.field4613[15] + this.field4613[14] * arg0.field4613[11] + this.field4613[13] * arg0.field4613[7] + this.field4613[12] * arg0.field4613[3];
        this.field4613[0] = var2;
        this.field4613[1] = var3;
        this.field4613[2] = var4;
        this.field4613[3] = var5;
        this.field4613[4] = var6;
        this.field4613[5] = var7;
        this.field4613[6] = var8;
        this.field4613[7] = var9;
        this.field4613[8] = var10;
        this.field4613[9] = var11;
        this.field4613[10] = var12;
        this.field4613[11] = var13;
        this.field4613[12] = var14;
        this.field4613[13] = var15;
        this.field4613[14] = var16;
        this.field4613[15] = var17;
    }

    @ObfuscatedName("oj.i(Lop;B)V")
    public void method7087(class410 arg0) {
        float var2 = arg0.field4607 * arg0.field4607;
        float var3 = arg0.field4607 * arg0.field4604;
        float var4 = arg0.field4607 * arg0.field4601;
        float var5 = arg0.field4607 * arg0.field4606;
        float var6 = arg0.field4604 * arg0.field4604;
        float var7 = arg0.field4604 * arg0.field4601;
        float var8 = arg0.field4606 * arg0.field4604;
        float var9 = arg0.field4601 * arg0.field4601;
        float var10 = arg0.field4606 * arg0.field4601;
        float var11 = arg0.field4606 * arg0.field4606;
        this.field4613[0] = var2 + var6 - var11 - var9;
        this.field4613[1] = var5 + var7 + var7 + var5;
        this.field4613[2] = var8 - var4 - var4 + var8;
        this.field4613[4] = var7 - var5 - var5 + var7;
        this.field4613[5] = var2 + var9 - var6 - var11;
        this.field4613[6] = var3 + var10 + var10 + var3;
        this.field4613[8] = var4 + var8 + var8 + var4;
        this.field4613[9] = var10 - var3 - var3 + var10;
        this.field4613[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("oj.o(Loc;I)V")
    public void method7088(class412 arg0) {
        this.field4613[0] = arg0.field4625;
        this.field4613[1] = arg0.field4618;
        this.field4613[2] = arg0.field4619;
        this.field4613[3] = 0.0F;
        this.field4613[4] = arg0.field4626;
        this.field4613[5] = arg0.field4621;
        this.field4613[6] = arg0.field4622;
        this.field4613[7] = 0.0F;
        this.field4613[8] = arg0.field4623;
        this.field4613[9] = arg0.field4624;
        this.field4613[10] = arg0.field4617;
        this.field4613[11] = 0.0F;
        this.field4613[12] = arg0.field4628;
        this.field4613[13] = arg0.field4627;
        this.field4613[14] = arg0.field4620;
        this.field4613[15] = 1.0F;
    }

    @ObfuscatedName("oj.n(B)F")
    public float method7101() {
        return this.field4613[6] * this.field4613[3] * this.field4613[9] * this.field4613[12] + (this.field4613[3] * this.field4613[5] * this.field4613[8] * this.field4613[14] + this.field4613[3] * this.field4613[4] * this.field4613[10] * this.field4613[13] + (this.field4613[7] * this.field4613[2] * this.field4613[8] * this.field4613[13] + this.field4613[2] * this.field4613[5] * this.field4613[11] * this.field4613[12] + (this.field4613[2] * this.field4613[4] * this.field4613[9] * this.field4613[15] + this.field4613[7] * this.field4613[1] * this.field4613[10] * this.field4613[12] + (this.field4613[1] * this.field4613[6] * this.field4613[8] * this.field4613[15] + this.field4613[4] * this.field4613[1] * this.field4613[11] * this.field4613[14] + (this.field4613[0] * this.field4613[7] * this.field4613[9] * this.field4613[14] + this.field4613[0] * this.field4613[6] * this.field4613[11] * this.field4613[13] + (this.field4613[5] * this.field4613[0] * this.field4613[10] * this.field4613[15] - this.field4613[5] * this.field4613[0] * this.field4613[11] * this.field4613[14] - this.field4613[0] * this.field4613[6] * this.field4613[9] * this.field4613[15]) - this.field4613[0] * this.field4613[7] * this.field4613[10] * this.field4613[13] - this.field4613[4] * this.field4613[1] * this.field4613[10] * this.field4613[15]) - this.field4613[1] * this.field4613[6] * this.field4613[11] * this.field4613[12] - this.field4613[1] * this.field4613[7] * this.field4613[8] * this.field4613[14]) - this.field4613[4] * this.field4613[2] * this.field4613[11] * this.field4613[13] - this.field4613[5] * this.field4613[2] * this.field4613[8] * this.field4613[15]) - this.field4613[7] * this.field4613[2] * this.field4613[9] * this.field4613[12] - this.field4613[3] * this.field4613[4] * this.field4613[9] * this.field4613[14]) - this.field4613[5] * this.field4613[3] * this.field4613[10] * this.field4613[12] - this.field4613[3] * this.field4613[6] * this.field4613[8] * this.field4613[13]);
    }

    @ObfuscatedName("oj.k(B)V")
    public void method7090() {
        float var1 = 1.0F / this.method7101();
        float var2 = (this.field4613[7] * this.field4613[9] * this.field4613[14] + this.field4613[11] * this.field4613[6] * this.field4613[13] + (this.field4613[10] * this.field4613[5] * this.field4613[15] - this.field4613[5] * this.field4613[11] * this.field4613[14] - this.field4613[9] * this.field4613[6] * this.field4613[15]) - this.field4613[10] * this.field4613[7] * this.field4613[13]) * var1;
        float var3 = (this.field4613[10] * this.field4613[3] * this.field4613[13] + (this.field4613[9] * this.field4613[2] * this.field4613[15] + this.field4613[1] * this.field4613[11] * this.field4613[14] + this.field4613[10] * -this.field4613[1] * this.field4613[15] - this.field4613[2] * this.field4613[11] * this.field4613[13] - this.field4613[3] * this.field4613[9] * this.field4613[14])) * var1;
        float var4 = (this.field4613[5] * this.field4613[3] * this.field4613[14] + this.field4613[7] * this.field4613[2] * this.field4613[13] + (this.field4613[6] * this.field4613[1] * this.field4613[15] - this.field4613[1] * this.field4613[7] * this.field4613[14] - this.field4613[2] * this.field4613[5] * this.field4613[15]) - this.field4613[6] * this.field4613[3] * this.field4613[13]) * var1;
        float var5 = (this.field4613[6] * this.field4613[3] * this.field4613[9] + (this.field4613[2] * this.field4613[5] * this.field4613[11] + this.field4613[1] * this.field4613[7] * this.field4613[10] + this.field4613[6] * -this.field4613[1] * this.field4613[11] - this.field4613[7] * this.field4613[2] * this.field4613[9] - this.field4613[5] * this.field4613[3] * this.field4613[10])) * var1;
        float var6 = (this.field4613[7] * this.field4613[10] * this.field4613[12] + (this.field4613[6] * this.field4613[8] * this.field4613[15] + this.field4613[10] * -this.field4613[4] * this.field4613[15] + this.field4613[4] * this.field4613[11] * this.field4613[14] - this.field4613[6] * this.field4613[11] * this.field4613[12] - this.field4613[7] * this.field4613[8] * this.field4613[14])) * var1;
        float var7 = (this.field4613[8] * this.field4613[3] * this.field4613[14] + this.field4613[2] * this.field4613[11] * this.field4613[12] + (this.field4613[10] * this.field4613[0] * this.field4613[15] - this.field4613[0] * this.field4613[11] * this.field4613[14] - this.field4613[8] * this.field4613[2] * this.field4613[15]) - this.field4613[10] * this.field4613[3] * this.field4613[12]) * var1;
        float var8 = (this.field4613[6] * this.field4613[3] * this.field4613[12] + (this.field4613[2] * this.field4613[4] * this.field4613[15] + this.field4613[0] * this.field4613[7] * this.field4613[14] + this.field4613[6] * -this.field4613[0] * this.field4613[15] - this.field4613[7] * this.field4613[2] * this.field4613[12] - this.field4613[4] * this.field4613[3] * this.field4613[14])) * var1;
        float var9 = (this.field4613[4] * this.field4613[3] * this.field4613[10] + this.field4613[2] * this.field4613[7] * this.field4613[8] + (this.field4613[6] * this.field4613[0] * this.field4613[11] - this.field4613[0] * this.field4613[7] * this.field4613[10] - this.field4613[4] * this.field4613[2] * this.field4613[11]) - this.field4613[6] * this.field4613[3] * this.field4613[8]) * var1;
        float var10 = (this.field4613[7] * this.field4613[8] * this.field4613[13] + this.field4613[11] * this.field4613[5] * this.field4613[12] + (this.field4613[4] * this.field4613[9] * this.field4613[15] - this.field4613[4] * this.field4613[11] * this.field4613[13] - this.field4613[5] * this.field4613[8] * this.field4613[15]) - this.field4613[9] * this.field4613[7] * this.field4613[12]) * var1;
        float var11 = (this.field4613[9] * this.field4613[3] * this.field4613[12] + (this.field4613[1] * this.field4613[8] * this.field4613[15] + this.field4613[9] * -this.field4613[0] * this.field4613[15] + this.field4613[0] * this.field4613[11] * this.field4613[13] - this.field4613[11] * this.field4613[1] * this.field4613[12] - this.field4613[8] * this.field4613[3] * this.field4613[13])) * var1;
        float var12 = (this.field4613[4] * this.field4613[3] * this.field4613[13] + this.field4613[7] * this.field4613[1] * this.field4613[12] + (this.field4613[0] * this.field4613[5] * this.field4613[15] - this.field4613[7] * this.field4613[0] * this.field4613[13] - this.field4613[1] * this.field4613[4] * this.field4613[15]) - this.field4613[5] * this.field4613[3] * this.field4613[12]) * var1;
        float var13 = (this.field4613[5] * this.field4613[3] * this.field4613[8] + (this.field4613[4] * this.field4613[1] * this.field4613[11] + this.field4613[0] * this.field4613[7] * this.field4613[9] + this.field4613[5] * -this.field4613[0] * this.field4613[11] - this.field4613[7] * this.field4613[1] * this.field4613[8] - this.field4613[4] * this.field4613[3] * this.field4613[9])) * var1;
        float var14 = (this.field4613[6] * this.field4613[9] * this.field4613[12] + (this.field4613[5] * this.field4613[8] * this.field4613[14] + this.field4613[10] * this.field4613[4] * this.field4613[13] + this.field4613[9] * -this.field4613[4] * this.field4613[14] - this.field4613[5] * this.field4613[10] * this.field4613[12] - this.field4613[6] * this.field4613[8] * this.field4613[13])) * var1;
        float var15 = (this.field4613[8] * this.field4613[2] * this.field4613[13] + this.field4613[10] * this.field4613[1] * this.field4613[12] + (this.field4613[9] * this.field4613[0] * this.field4613[14] - this.field4613[10] * this.field4613[0] * this.field4613[13] - this.field4613[1] * this.field4613[8] * this.field4613[14]) - this.field4613[2] * this.field4613[9] * this.field4613[12]) * var1;
        float var16 = (this.field4613[5] * this.field4613[2] * this.field4613[12] + (this.field4613[1] * this.field4613[4] * this.field4613[14] + this.field4613[5] * -this.field4613[0] * this.field4613[14] + this.field4613[0] * this.field4613[6] * this.field4613[13] - this.field4613[6] * this.field4613[1] * this.field4613[12] - this.field4613[2] * this.field4613[4] * this.field4613[13])) * var1;
        float var17 = (this.field4613[4] * this.field4613[2] * this.field4613[9] + this.field4613[1] * this.field4613[6] * this.field4613[8] + (this.field4613[5] * this.field4613[0] * this.field4613[10] - this.field4613[0] * this.field4613[6] * this.field4613[9] - this.field4613[4] * this.field4613[1] * this.field4613[10]) - this.field4613[2] * this.field4613[5] * this.field4613[8]) * var1;
        this.field4613[0] = var2;
        this.field4613[1] = var3;
        this.field4613[2] = var4;
        this.field4613[3] = var5;
        this.field4613[4] = var6;
        this.field4613[5] = var7;
        this.field4613[6] = var8;
        this.field4613[7] = var9;
        this.field4613[8] = var10;
        this.field4613[9] = var11;
        this.field4613[10] = var12;
        this.field4613[11] = var13;
        this.field4613[12] = var14;
        this.field4613[13] = var15;
        this.field4613[14] = var16;
        this.field4613[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7079();
        this.method7078();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4613[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4613);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class411)) {
            return false;
        }
        class411 var2 = (class411) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4613[var3] != var2.field4613[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("oj.a(I)[F")
    public float[] method7092() {
        float[] var1 = new float[3];
        class409 var2 = new class409(this.field4613[0], this.field4613[1], this.field4613[2]);
        class409 var3 = new class409(this.field4613[4], this.field4613[5], this.field4613[6]);
        class409 var4 = new class409(this.field4613[8], this.field4613[9], this.field4613[10]);
        var1[0] = var2.method7049();
        var1[1] = var3.method7049();
        var1[2] = var4.method7049();
        return var1;
    }
}
