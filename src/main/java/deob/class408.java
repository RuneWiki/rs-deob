package deob;

import java.util.Arrays;

@ObfuscatedName("ov")
public final class class408 {

    @ObfuscatedName("ov.f")
    public static final class408 field4568;

    @ObfuscatedName("ov.c")
    public static class408[] field4564 = new class408[0];

    @ObfuscatedName("ov.x")
    public static int field4565 = 100;

    @ObfuscatedName("ov.h")
    public static int field4566;

    @ObfuscatedName("ov.j")
    public float[] field4567 = new float[16];

    static {
        field4564 = new class408[100];
        field4566 = 0;
        field4568 = new class408();
    }

    @ObfuscatedName("ki.a(I)Lov;")
    public static class408 method5163() {
        class408[] var0 = field4564;
        synchronized (field4564) {
            if (field4566 == 0) {
                return new class408();
            } else {
                field4564[--field4566].method7006();
                return field4564[field4566];
            }
        }
    }

    @ObfuscatedName("ov.f(I)V")
    public void method7055() {
        class408[] var1 = field4564;
        synchronized (field4564) {
            if (field4566 < field4565 - 1) {
                field4564[++field4566 - 1] = this;
            }
        }
    }

    public class408() {
        this.method7006();
    }

    public class408(class408 arg0) {
        this.method7008(arg0);
    }

    public class408(class464 arg0, boolean arg1) {
        this.method7049(arg0, arg1);
    }

    @ObfuscatedName("ov.c(Lqr;ZI)V")
    public void method7049(class464 arg0, boolean arg1) {
        if (!arg1) {
            for (int var12 = 0; var12 < 16; var12++) {
                this.field4567[var12] = arg0.method7722();
            }
            return;
        }
        class409 var3 = new class409();
        int var5 = arg0.method7798();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7072(var7);
        var3.method7090(class422.method3367(arg0.method7798()));
        int var9 = arg0.method7798();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7091(var11);
        var3.method7074((float) arg0.method7798(), (float) arg0.method7798(), (float) arg0.method7798());
        this.method7014(var3);
    }

    @ObfuscatedName("ov.x(I)[F")
    public float[] method7004() {
        float[] var1 = new float[3];
        if ((double) this.field4567[2] < 0.999D && (double) this.field4567[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4567[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4567[6] / var2, (double) this.field4567[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4567[1] / var2, (double) this.field4567[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4567[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4567[9]), (double) this.field4567[5]);
        }
        return var1;
    }

    @ObfuscatedName("ov.h(I)[F")
    public float[] method7005() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4567[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4567[2];
            double var6 = (double) this.field4567[10];
            double var8 = (double) this.field4567[4];
            double var10 = (double) this.field4567[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4567[1];
            double var14 = (double) this.field4567[0];
            if (this.field4567[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("ov.j(I)V")
    public void method7006() {
        this.field4567[0] = 1.0F;
        this.field4567[1] = 0.0F;
        this.field4567[2] = 0.0F;
        this.field4567[3] = 0.0F;
        this.field4567[4] = 0.0F;
        this.field4567[5] = 1.0F;
        this.field4567[6] = 0.0F;
        this.field4567[7] = 0.0F;
        this.field4567[8] = 0.0F;
        this.field4567[9] = 0.0F;
        this.field4567[10] = 1.0F;
        this.field4567[11] = 0.0F;
        this.field4567[12] = 0.0F;
        this.field4567[13] = 0.0F;
        this.field4567[14] = 0.0F;
        this.field4567[15] = 1.0F;
    }

    @ObfuscatedName("ov.y(B)V")
    public void method7007() {
        this.field4567[0] = 0.0F;
        this.field4567[1] = 0.0F;
        this.field4567[2] = 0.0F;
        this.field4567[3] = 0.0F;
        this.field4567[4] = 0.0F;
        this.field4567[5] = 0.0F;
        this.field4567[6] = 0.0F;
        this.field4567[7] = 0.0F;
        this.field4567[8] = 0.0F;
        this.field4567[9] = 0.0F;
        this.field4567[10] = 0.0F;
        this.field4567[11] = 0.0F;
        this.field4567[12] = 0.0F;
        this.field4567[13] = 0.0F;
        this.field4567[14] = 0.0F;
        this.field4567[15] = 0.0F;
    }

    @ObfuscatedName("ov.d(Lov;I)V")
    public void method7008(class408 arg0) {
        System.arraycopy(arg0.field4567, 0, this.field4567, 0, 16);
    }

    @ObfuscatedName("ov.n(FB)V")
    public void method7040(float arg0) {
        this.method7010(arg0, arg0, arg0);
    }

    @ObfuscatedName("ov.r(FFFB)V")
    public void method7010(float arg0, float arg1, float arg2) {
        this.method7006();
        this.field4567[0] = arg0;
        this.field4567[5] = arg1;
        this.field4567[10] = arg2;
    }

    @ObfuscatedName("ov.l(Lov;I)V")
    public void method7033(class408 arg0) {
        for (int var2 = 0; var2 < this.field4567.length; var2++) {
            this.field4567[var2] += arg0.field4567[var2];
        }
    }

    @ObfuscatedName("ov.s(Lov;I)V")
    public void method7012(class408 arg0) {
        float var2 = this.field4567[3] * arg0.field4567[12] + this.field4567[2] * arg0.field4567[8] + this.field4567[0] * arg0.field4567[0] + this.field4567[1] * arg0.field4567[4];
        float var3 = this.field4567[3] * arg0.field4567[13] + this.field4567[2] * arg0.field4567[9] + this.field4567[0] * arg0.field4567[1] + this.field4567[1] * arg0.field4567[5];
        float var4 = this.field4567[3] * arg0.field4567[14] + this.field4567[2] * arg0.field4567[10] + this.field4567[0] * arg0.field4567[2] + this.field4567[1] * arg0.field4567[6];
        float var5 = this.field4567[3] * arg0.field4567[15] + this.field4567[2] * arg0.field4567[11] + this.field4567[0] * arg0.field4567[3] + this.field4567[1] * arg0.field4567[7];
        float var6 = this.field4567[7] * arg0.field4567[12] + this.field4567[6] * arg0.field4567[8] + this.field4567[4] * arg0.field4567[0] + this.field4567[5] * arg0.field4567[4];
        float var7 = this.field4567[7] * arg0.field4567[13] + this.field4567[6] * arg0.field4567[9] + this.field4567[5] * arg0.field4567[5] + this.field4567[4] * arg0.field4567[1];
        float var8 = this.field4567[7] * arg0.field4567[14] + this.field4567[6] * arg0.field4567[10] + this.field4567[4] * arg0.field4567[2] + this.field4567[5] * arg0.field4567[6];
        float var9 = this.field4567[7] * arg0.field4567[15] + this.field4567[6] * arg0.field4567[11] + this.field4567[4] * arg0.field4567[3] + this.field4567[5] * arg0.field4567[7];
        float var10 = this.field4567[11] * arg0.field4567[12] + this.field4567[10] * arg0.field4567[8] + this.field4567[9] * arg0.field4567[4] + this.field4567[8] * arg0.field4567[0];
        float var11 = this.field4567[11] * arg0.field4567[13] + this.field4567[10] * arg0.field4567[9] + this.field4567[9] * arg0.field4567[5] + this.field4567[8] * arg0.field4567[1];
        float var12 = this.field4567[11] * arg0.field4567[14] + this.field4567[10] * arg0.field4567[10] + this.field4567[9] * arg0.field4567[6] + this.field4567[8] * arg0.field4567[2];
        float var13 = this.field4567[11] * arg0.field4567[15] + this.field4567[10] * arg0.field4567[11] + this.field4567[9] * arg0.field4567[7] + this.field4567[8] * arg0.field4567[3];
        float var14 = this.field4567[15] * arg0.field4567[12] + this.field4567[14] * arg0.field4567[8] + this.field4567[13] * arg0.field4567[4] + this.field4567[12] * arg0.field4567[0];
        float var15 = this.field4567[15] * arg0.field4567[13] + this.field4567[14] * arg0.field4567[9] + this.field4567[12] * arg0.field4567[1] + this.field4567[13] * arg0.field4567[5];
        float var16 = this.field4567[15] * arg0.field4567[14] + this.field4567[14] * arg0.field4567[10] + this.field4567[12] * arg0.field4567[2] + this.field4567[13] * arg0.field4567[6];
        float var17 = this.field4567[15] * arg0.field4567[15] + this.field4567[14] * arg0.field4567[11] + this.field4567[13] * arg0.field4567[7] + this.field4567[12] * arg0.field4567[3];
        this.field4567[0] = var2;
        this.field4567[1] = var3;
        this.field4567[2] = var4;
        this.field4567[3] = var5;
        this.field4567[4] = var6;
        this.field4567[5] = var7;
        this.field4567[6] = var8;
        this.field4567[7] = var9;
        this.field4567[8] = var10;
        this.field4567[9] = var11;
        this.field4567[10] = var12;
        this.field4567[11] = var13;
        this.field4567[12] = var14;
        this.field4567[13] = var15;
        this.field4567[14] = var16;
        this.field4567[15] = var17;
    }

    @ObfuscatedName("ov.p(Loy;B)V")
    public void method7013(class407 arg0) {
        float var2 = arg0.field4558 * arg0.field4558;
        float var3 = arg0.field4559 * arg0.field4558;
        float var4 = arg0.field4558 * arg0.field4556;
        float var5 = arg0.field4560 * arg0.field4558;
        float var6 = arg0.field4559 * arg0.field4559;
        float var7 = arg0.field4559 * arg0.field4556;
        float var8 = arg0.field4560 * arg0.field4559;
        float var9 = arg0.field4556 * arg0.field4556;
        float var10 = arg0.field4560 * arg0.field4556;
        float var11 = arg0.field4560 * arg0.field4560;
        this.field4567[0] = var2 + var6 - var11 - var9;
        this.field4567[1] = var5 + var7 + var7 + var5;
        this.field4567[2] = var8 - var4 - var4 + var8;
        this.field4567[4] = var7 - var5 - var5 + var7;
        this.field4567[5] = var2 + var9 - var6 - var11;
        this.field4567[6] = var3 + var10 + var10 + var3;
        this.field4567[8] = var4 + var8 + var8 + var4;
        this.field4567[9] = var10 - var3 - var3 + var10;
        this.field4567[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("ov.b(Lox;B)V")
    public void method7014(class409 arg0) {
        this.field4567[0] = arg0.field4577;
        this.field4567[1] = arg0.field4571;
        this.field4567[2] = arg0.field4572;
        this.field4567[3] = 0.0F;
        this.field4567[4] = arg0.field4570;
        this.field4567[5] = arg0.field4574;
        this.field4567[6] = arg0.field4575;
        this.field4567[7] = 0.0F;
        this.field4567[8] = arg0.field4576;
        this.field4567[9] = arg0.field4573;
        this.field4567[10] = arg0.field4578;
        this.field4567[11] = 0.0F;
        this.field4567[12] = arg0.field4579;
        this.field4567[13] = arg0.field4580;
        this.field4567[14] = arg0.field4581;
        this.field4567[15] = 1.0F;
    }

    @ObfuscatedName("ov.o(I)F")
    public float method7032() {
        return this.field4567[6] * this.field4567[3] * this.field4567[9] * this.field4567[12] + (this.field4567[5] * this.field4567[3] * this.field4567[8] * this.field4567[14] + this.field4567[4] * this.field4567[3] * this.field4567[10] * this.field4567[13] + (this.field4567[2] * this.field4567[7] * this.field4567[8] * this.field4567[13] + this.field4567[5] * this.field4567[2] * this.field4567[11] * this.field4567[12] + (this.field4567[2] * this.field4567[4] * this.field4567[9] * this.field4567[15] + this.field4567[1] * this.field4567[7] * this.field4567[10] * this.field4567[12] + (this.field4567[6] * this.field4567[1] * this.field4567[8] * this.field4567[15] + this.field4567[1] * this.field4567[4] * this.field4567[11] * this.field4567[14] + (this.field4567[7] * this.field4567[0] * this.field4567[9] * this.field4567[14] + this.field4567[6] * this.field4567[0] * this.field4567[11] * this.field4567[13] + (this.field4567[5] * this.field4567[0] * this.field4567[10] * this.field4567[15] - this.field4567[5] * this.field4567[0] * this.field4567[11] * this.field4567[14] - this.field4567[6] * this.field4567[0] * this.field4567[9] * this.field4567[15]) - this.field4567[0] * this.field4567[7] * this.field4567[10] * this.field4567[13] - this.field4567[1] * this.field4567[4] * this.field4567[10] * this.field4567[15]) - this.field4567[6] * this.field4567[1] * this.field4567[11] * this.field4567[12] - this.field4567[7] * this.field4567[1] * this.field4567[8] * this.field4567[14]) - this.field4567[4] * this.field4567[2] * this.field4567[11] * this.field4567[13] - this.field4567[5] * this.field4567[2] * this.field4567[8] * this.field4567[15]) - this.field4567[7] * this.field4567[2] * this.field4567[9] * this.field4567[12] - this.field4567[4] * this.field4567[3] * this.field4567[9] * this.field4567[14]) - this.field4567[3] * this.field4567[5] * this.field4567[10] * this.field4567[12] - this.field4567[6] * this.field4567[3] * this.field4567[8] * this.field4567[13]);
    }

    @ObfuscatedName("ov.u(I)V")
    public void method7038() {
        float var1 = 1.0F / this.method7032();
        float var2 = (this.field4567[7] * this.field4567[9] * this.field4567[14] + this.field4567[11] * this.field4567[6] * this.field4567[13] + (this.field4567[10] * this.field4567[5] * this.field4567[15] - this.field4567[11] * this.field4567[5] * this.field4567[14] - this.field4567[9] * this.field4567[6] * this.field4567[15]) - this.field4567[10] * this.field4567[7] * this.field4567[13]) * var1;
        float var3 = (this.field4567[10] * this.field4567[3] * this.field4567[13] + (this.field4567[2] * this.field4567[9] * this.field4567[15] + this.field4567[10] * -this.field4567[1] * this.field4567[15] + this.field4567[11] * this.field4567[1] * this.field4567[14] - this.field4567[2] * this.field4567[11] * this.field4567[13] - this.field4567[9] * this.field4567[3] * this.field4567[14])) * var1;
        float var4 = (this.field4567[3] * this.field4567[5] * this.field4567[14] + this.field4567[2] * this.field4567[7] * this.field4567[13] + (this.field4567[6] * this.field4567[1] * this.field4567[15] - this.field4567[7] * this.field4567[1] * this.field4567[14] - this.field4567[2] * this.field4567[5] * this.field4567[15]) - this.field4567[6] * this.field4567[3] * this.field4567[13]) * var1;
        float var5 = (this.field4567[6] * this.field4567[3] * this.field4567[9] + (this.field4567[5] * this.field4567[2] * this.field4567[11] + this.field4567[6] * -this.field4567[1] * this.field4567[11] + this.field4567[1] * this.field4567[7] * this.field4567[10] - this.field4567[7] * this.field4567[2] * this.field4567[9] - this.field4567[3] * this.field4567[5] * this.field4567[10])) * var1;
        float var6 = (this.field4567[10] * this.field4567[7] * this.field4567[12] + (this.field4567[6] * this.field4567[8] * this.field4567[15] + this.field4567[11] * this.field4567[4] * this.field4567[14] + this.field4567[10] * -this.field4567[4] * this.field4567[15] - this.field4567[6] * this.field4567[11] * this.field4567[12] - this.field4567[7] * this.field4567[8] * this.field4567[14])) * var1;
        float var7 = (this.field4567[8] * this.field4567[3] * this.field4567[14] + this.field4567[2] * this.field4567[11] * this.field4567[12] + (this.field4567[0] * this.field4567[10] * this.field4567[15] - this.field4567[0] * this.field4567[11] * this.field4567[14] - this.field4567[2] * this.field4567[8] * this.field4567[15]) - this.field4567[10] * this.field4567[3] * this.field4567[12]) * var1;
        float var8 = (this.field4567[3] * this.field4567[6] * this.field4567[12] + (this.field4567[4] * this.field4567[2] * this.field4567[15] + this.field4567[6] * -this.field4567[0] * this.field4567[15] + this.field4567[0] * this.field4567[7] * this.field4567[14] - this.field4567[2] * this.field4567[7] * this.field4567[12] - this.field4567[3] * this.field4567[4] * this.field4567[14])) * var1;
        float var9 = (this.field4567[3] * this.field4567[4] * this.field4567[10] + this.field4567[2] * this.field4567[7] * this.field4567[8] + (this.field4567[6] * this.field4567[0] * this.field4567[11] - this.field4567[0] * this.field4567[7] * this.field4567[10] - this.field4567[4] * this.field4567[2] * this.field4567[11]) - this.field4567[3] * this.field4567[6] * this.field4567[8]) * var1;
        float var10 = (this.field4567[8] * this.field4567[7] * this.field4567[13] + this.field4567[5] * this.field4567[11] * this.field4567[12] + (this.field4567[4] * this.field4567[9] * this.field4567[15] - this.field4567[11] * this.field4567[4] * this.field4567[13] - this.field4567[8] * this.field4567[5] * this.field4567[15]) - this.field4567[9] * this.field4567[7] * this.field4567[12]) * var1;
        float var11 = (this.field4567[3] * this.field4567[9] * this.field4567[12] + (this.field4567[1] * this.field4567[8] * this.field4567[15] + this.field4567[9] * -this.field4567[0] * this.field4567[15] + this.field4567[0] * this.field4567[11] * this.field4567[13] - this.field4567[1] * this.field4567[11] * this.field4567[12] - this.field4567[3] * this.field4567[8] * this.field4567[13])) * var1;
        float var12 = (this.field4567[4] * this.field4567[3] * this.field4567[13] + this.field4567[7] * this.field4567[1] * this.field4567[12] + (this.field4567[5] * this.field4567[0] * this.field4567[15] - this.field4567[0] * this.field4567[7] * this.field4567[13] - this.field4567[1] * this.field4567[4] * this.field4567[15]) - this.field4567[3] * this.field4567[5] * this.field4567[12]) * var1;
        float var13 = (this.field4567[5] * this.field4567[3] * this.field4567[8] + (this.field4567[4] * this.field4567[1] * this.field4567[11] + this.field4567[5] * -this.field4567[0] * this.field4567[11] + this.field4567[0] * this.field4567[7] * this.field4567[9] - this.field4567[7] * this.field4567[1] * this.field4567[8] - this.field4567[3] * this.field4567[4] * this.field4567[9])) * var1;
        float var14 = (this.field4567[6] * this.field4567[9] * this.field4567[12] + (this.field4567[5] * this.field4567[8] * this.field4567[14] + this.field4567[4] * this.field4567[10] * this.field4567[13] + this.field4567[9] * -this.field4567[4] * this.field4567[14] - this.field4567[5] * this.field4567[10] * this.field4567[12] - this.field4567[8] * this.field4567[6] * this.field4567[13])) * var1;
        float var15 = (this.field4567[2] * this.field4567[8] * this.field4567[13] + this.field4567[1] * this.field4567[10] * this.field4567[12] + (this.field4567[0] * this.field4567[9] * this.field4567[14] - this.field4567[10] * this.field4567[0] * this.field4567[13] - this.field4567[1] * this.field4567[8] * this.field4567[14]) - this.field4567[2] * this.field4567[9] * this.field4567[12]) * var1;
        float var16 = (this.field4567[5] * this.field4567[2] * this.field4567[12] + (this.field4567[4] * this.field4567[1] * this.field4567[14] + this.field4567[6] * this.field4567[0] * this.field4567[13] + this.field4567[5] * -this.field4567[0] * this.field4567[14] - this.field4567[1] * this.field4567[6] * this.field4567[12] - this.field4567[2] * this.field4567[4] * this.field4567[13])) * var1;
        float var17 = (this.field4567[2] * this.field4567[4] * this.field4567[9] + this.field4567[1] * this.field4567[6] * this.field4567[8] + (this.field4567[5] * this.field4567[0] * this.field4567[10] - this.field4567[6] * this.field4567[0] * this.field4567[9] - this.field4567[1] * this.field4567[4] * this.field4567[10]) - this.field4567[2] * this.field4567[5] * this.field4567[8]) * var1;
        this.field4567[0] = var2;
        this.field4567[1] = var3;
        this.field4567[2] = var4;
        this.field4567[3] = var5;
        this.field4567[4] = var6;
        this.field4567[5] = var7;
        this.field4567[6] = var8;
        this.field4567[7] = var9;
        this.field4567[8] = var10;
        this.field4567[9] = var11;
        this.field4567[10] = var12;
        this.field4567[11] = var13;
        this.field4567[12] = var14;
        this.field4567[13] = var15;
        this.field4567[14] = var16;
        this.field4567[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7005();
        this.method7004();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4567[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4567);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class408)) {
            return false;
        }
        class408 var2 = (class408) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4567[var3] != var2.field4567[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ov.z(I)[F")
    public float[] method7018() {
        float[] var1 = new float[3];
        class406 var2 = new class406(this.field4567[0], this.field4567[1], this.field4567[2]);
        class406 var3 = new class406(this.field4567[4], this.field4567[5], this.field4567[6]);
        class406 var4 = new class406(this.field4567[8], this.field4567[9], this.field4567[10]);
        var1[0] = var2.method6962();
        var1[1] = var3.method6962();
        var1[2] = var4.method6962();
        return var1;
    }
}
