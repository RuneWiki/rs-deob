package deob;

import java.util.Arrays;

@ObfuscatedName("qp")
public final class class439 {

    @ObfuscatedName("qp.an")
    public static class439[] field4683 = new class439[0];

    @ObfuscatedName("qp.ax")
    public float[] field4686 = new float[16];

    @ObfuscatedName("qp.ap")
    public static final class439 field4687;

    static {
        method97(100);
        field4687 = new class439();
    }

    @ObfuscatedName("ao.at(IB)V")
    public static void method97(int arg0) {
        Statics.field1438 = arg0;
        field4683 = new class439[arg0];
        Statics.field4685 = 0;
    }

    @ObfuscatedName("pw.an(I)Lqp;")
    public static class439 method6899() {
        class439[] var0 = field4683;
        synchronized (field4683) {
            if (Statics.field4685 == 0) {
                return new class439();
            } else {
                field4683[--Statics.field4685].method7400();
                return field4683[Statics.field4685];
            }
        }
    }

    @ObfuscatedName("qp.av(I)V")
    public void method7421() {
        class439[] var1 = field4683;
        synchronized (field4683) {
            if (Statics.field4685 < Statics.field1438 - 1) {
                field4683[++Statics.field4685 - 1] = this;
            }
        }
    }

    public class439() {
        this.method7400();
    }

    public class439(class439 arg0) {
        this.method7398(arg0);
    }

    public class439(class501 arg0, boolean arg1) {
        this.method7397(arg0, arg1);
    }

    @ObfuscatedName("qp.as(Ltz;ZI)V")
    public void method7397(class501 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4686[var16] = arg0.method8136();
            }
            return;
        }
        class440 var3 = new class440();
        int var5 = arg0.method8268();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7459(var7);
        int var9 = arg0.method8268();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7471(var11);
        int var13 = arg0.method8268();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7470(var15);
        var3.method7464((float) arg0.method8268(), (float) arg0.method8268(), (float) arg0.method8268());
        this.method7408(var3);
    }

    @ObfuscatedName("qp.ax(I)[F")
    public float[] method7447() {
        float[] var1 = new float[3];
        if ((double) this.field4686[2] < 0.999D && (double) this.field4686[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4686[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4686[6] / var2, (double) this.field4686[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4686[1] / var2, (double) this.field4686[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4686[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4686[9]), (double) this.field4686[5]);
        }
        return var1;
    }

    @ObfuscatedName("qp.ap(I)[F")
    public float[] method7399() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4686[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4686[2];
            double var6 = (double) this.field4686[10];
            double var8 = (double) this.field4686[4];
            double var10 = (double) this.field4686[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4686[1];
            double var14 = (double) this.field4686[0];
            if (this.field4686[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("qp.ab(I)V")
    public void method7400() {
        this.field4686[0] = 1.0F;
        this.field4686[1] = 0.0F;
        this.field4686[2] = 0.0F;
        this.field4686[3] = 0.0F;
        this.field4686[4] = 0.0F;
        this.field4686[5] = 1.0F;
        this.field4686[6] = 0.0F;
        this.field4686[7] = 0.0F;
        this.field4686[8] = 0.0F;
        this.field4686[9] = 0.0F;
        this.field4686[10] = 1.0F;
        this.field4686[11] = 0.0F;
        this.field4686[12] = 0.0F;
        this.field4686[13] = 0.0F;
        this.field4686[14] = 0.0F;
        this.field4686[15] = 1.0F;
    }

    @ObfuscatedName("qp.ak(I)V")
    public void method7401() {
        this.field4686[0] = 0.0F;
        this.field4686[1] = 0.0F;
        this.field4686[2] = 0.0F;
        this.field4686[3] = 0.0F;
        this.field4686[4] = 0.0F;
        this.field4686[5] = 0.0F;
        this.field4686[6] = 0.0F;
        this.field4686[7] = 0.0F;
        this.field4686[8] = 0.0F;
        this.field4686[9] = 0.0F;
        this.field4686[10] = 0.0F;
        this.field4686[11] = 0.0F;
        this.field4686[12] = 0.0F;
        this.field4686[13] = 0.0F;
        this.field4686[14] = 0.0F;
        this.field4686[15] = 0.0F;
    }

    @ObfuscatedName("qp.ae(Lqp;I)V")
    public void method7398(class439 arg0) {
        System.arraycopy(arg0.field4686, 0, this.field4686, 0, 16);
    }

    @ObfuscatedName("qp.af(FB)V")
    public void method7403(float arg0) {
        this.method7404(arg0, arg0, arg0);
    }

    @ObfuscatedName("qp.ao(FFFI)V")
    public void method7404(float arg0, float arg1, float arg2) {
        this.method7400();
        this.field4686[0] = arg0;
        this.field4686[5] = arg1;
        this.field4686[10] = arg2;
    }

    @ObfuscatedName("qp.aa(Lqp;I)V")
    public void method7405(class439 arg0) {
        for (int var2 = 0; var2 < this.field4686.length; var2++) {
            this.field4686[var2] += arg0.field4686[var2];
        }
    }

    @ObfuscatedName("qp.aj(Lqp;B)V")
    public void method7406(class439 arg0) {
        float var2 = this.field4686[3] * arg0.field4686[12] + this.field4686[2] * arg0.field4686[8] + this.field4686[1] * arg0.field4686[4] + this.field4686[0] * arg0.field4686[0];
        float var3 = this.field4686[3] * arg0.field4686[13] + this.field4686[2] * arg0.field4686[9] + this.field4686[0] * arg0.field4686[1] + this.field4686[1] * arg0.field4686[5];
        float var4 = this.field4686[3] * arg0.field4686[14] + this.field4686[2] * arg0.field4686[10] + this.field4686[0] * arg0.field4686[2] + this.field4686[1] * arg0.field4686[6];
        float var5 = this.field4686[3] * arg0.field4686[15] + this.field4686[2] * arg0.field4686[11] + this.field4686[1] * arg0.field4686[7] + this.field4686[0] * arg0.field4686[3];
        float var6 = this.field4686[7] * arg0.field4686[12] + this.field4686[6] * arg0.field4686[8] + this.field4686[5] * arg0.field4686[4] + this.field4686[4] * arg0.field4686[0];
        float var7 = this.field4686[7] * arg0.field4686[13] + this.field4686[6] * arg0.field4686[9] + this.field4686[4] * arg0.field4686[1] + this.field4686[5] * arg0.field4686[5];
        float var8 = this.field4686[7] * arg0.field4686[14] + this.field4686[6] * arg0.field4686[10] + this.field4686[5] * arg0.field4686[6] + this.field4686[4] * arg0.field4686[2];
        float var9 = this.field4686[7] * arg0.field4686[15] + this.field4686[6] * arg0.field4686[11] + this.field4686[5] * arg0.field4686[7] + this.field4686[4] * arg0.field4686[3];
        float var10 = this.field4686[11] * arg0.field4686[12] + this.field4686[10] * arg0.field4686[8] + this.field4686[8] * arg0.field4686[0] + this.field4686[9] * arg0.field4686[4];
        float var11 = this.field4686[11] * arg0.field4686[13] + this.field4686[10] * arg0.field4686[9] + this.field4686[9] * arg0.field4686[5] + this.field4686[8] * arg0.field4686[1];
        float var12 = this.field4686[11] * arg0.field4686[14] + this.field4686[10] * arg0.field4686[10] + this.field4686[9] * arg0.field4686[6] + this.field4686[8] * arg0.field4686[2];
        float var13 = this.field4686[11] * arg0.field4686[15] + this.field4686[10] * arg0.field4686[11] + this.field4686[8] * arg0.field4686[3] + this.field4686[9] * arg0.field4686[7];
        float var14 = this.field4686[15] * arg0.field4686[12] + this.field4686[14] * arg0.field4686[8] + this.field4686[12] * arg0.field4686[0] + this.field4686[13] * arg0.field4686[4];
        float var15 = this.field4686[15] * arg0.field4686[13] + this.field4686[14] * arg0.field4686[9] + this.field4686[13] * arg0.field4686[5] + this.field4686[12] * arg0.field4686[1];
        float var16 = this.field4686[15] * arg0.field4686[14] + this.field4686[14] * arg0.field4686[10] + this.field4686[12] * arg0.field4686[2] + this.field4686[13] * arg0.field4686[6];
        float var17 = this.field4686[15] * arg0.field4686[15] + this.field4686[14] * arg0.field4686[11] + this.field4686[12] * arg0.field4686[3] + this.field4686[13] * arg0.field4686[7];
        this.field4686[0] = var2;
        this.field4686[1] = var3;
        this.field4686[2] = var4;
        this.field4686[3] = var5;
        this.field4686[4] = var6;
        this.field4686[5] = var7;
        this.field4686[6] = var8;
        this.field4686[7] = var9;
        this.field4686[8] = var10;
        this.field4686[9] = var11;
        this.field4686[10] = var12;
        this.field4686[11] = var13;
        this.field4686[12] = var14;
        this.field4686[13] = var15;
        this.field4686[14] = var16;
        this.field4686[15] = var17;
    }

    @ObfuscatedName("qp.ad(Lqj;S)V")
    public void method7407(class438 arg0) {
        float var2 = arg0.field4675 * arg0.field4675;
        float var3 = arg0.field4679 * arg0.field4675;
        float var4 = arg0.field4676 * arg0.field4675;
        float var5 = arg0.field4680 * arg0.field4675;
        float var6 = arg0.field4679 * arg0.field4679;
        float var7 = arg0.field4679 * arg0.field4676;
        float var8 = arg0.field4680 * arg0.field4679;
        float var9 = arg0.field4676 * arg0.field4676;
        float var10 = arg0.field4680 * arg0.field4676;
        float var11 = arg0.field4680 * arg0.field4680;
        this.field4686[0] = var2 + var6 - var11 - var9;
        this.field4686[1] = var5 + var7 + var7 + var5;
        this.field4686[2] = var8 - var4 - var4 + var8;
        this.field4686[4] = var7 - var5 - var5 + var7;
        this.field4686[5] = var2 + var9 - var6 - var11;
        this.field4686[6] = var3 + var10 + var10 + var3;
        this.field4686[8] = var4 + var8 + var8 + var4;
        this.field4686[9] = var10 - var3 - var3 + var10;
        this.field4686[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("qp.ac(Lqu;I)V")
    public void method7408(class440 arg0) {
        this.field4686[0] = arg0.field4696;
        this.field4686[1] = arg0.field4689;
        this.field4686[2] = arg0.field4688;
        this.field4686[3] = 0.0F;
        this.field4686[4] = arg0.field4700;
        this.field4686[5] = arg0.field4692;
        this.field4686[6] = arg0.field4693;
        this.field4686[7] = 0.0F;
        this.field4686[8] = arg0.field4694;
        this.field4686[9] = arg0.field4695;
        this.field4686[10] = arg0.field4690;
        this.field4686[11] = 0.0F;
        this.field4686[12] = arg0.field4697;
        this.field4686[13] = arg0.field4691;
        this.field4686[14] = arg0.field4699;
        this.field4686[15] = 1.0F;
    }

    @ObfuscatedName("qp.ag(B)F")
    public float method7419() {
        return this.field4686[3] * this.field4686[6] * this.field4686[9] * this.field4686[12] + (this.field4686[5] * this.field4686[3] * this.field4686[8] * this.field4686[14] + this.field4686[4] * this.field4686[3] * this.field4686[10] * this.field4686[13] + (this.field4686[7] * this.field4686[2] * this.field4686[8] * this.field4686[13] + this.field4686[5] * this.field4686[2] * this.field4686[11] * this.field4686[12] + (this.field4686[4] * this.field4686[2] * this.field4686[9] * this.field4686[15] + this.field4686[1] * this.field4686[7] * this.field4686[10] * this.field4686[12] + (this.field4686[6] * this.field4686[1] * this.field4686[8] * this.field4686[15] + this.field4686[4] * this.field4686[1] * this.field4686[11] * this.field4686[14] + (this.field4686[7] * this.field4686[0] * this.field4686[9] * this.field4686[14] + this.field4686[6] * this.field4686[0] * this.field4686[11] * this.field4686[13] + (this.field4686[5] * this.field4686[0] * this.field4686[10] * this.field4686[15] - this.field4686[0] * this.field4686[5] * this.field4686[11] * this.field4686[14] - this.field4686[0] * this.field4686[6] * this.field4686[9] * this.field4686[15]) - this.field4686[0] * this.field4686[7] * this.field4686[10] * this.field4686[13] - this.field4686[4] * this.field4686[1] * this.field4686[10] * this.field4686[15]) - this.field4686[1] * this.field4686[6] * this.field4686[11] * this.field4686[12] - this.field4686[1] * this.field4686[7] * this.field4686[8] * this.field4686[14]) - this.field4686[4] * this.field4686[2] * this.field4686[11] * this.field4686[13] - this.field4686[5] * this.field4686[2] * this.field4686[8] * this.field4686[15]) - this.field4686[7] * this.field4686[2] * this.field4686[9] * this.field4686[12] - this.field4686[3] * this.field4686[4] * this.field4686[9] * this.field4686[14]) - this.field4686[5] * this.field4686[3] * this.field4686[10] * this.field4686[12] - this.field4686[6] * this.field4686[3] * this.field4686[8] * this.field4686[13]);
    }

    @ObfuscatedName("qp.ar(I)V")
    public void method7441() {
        float var1 = 1.0F / this.method7419();
        float var2 = (this.field4686[7] * this.field4686[9] * this.field4686[14] + this.field4686[6] * this.field4686[11] * this.field4686[13] + (this.field4686[10] * this.field4686[5] * this.field4686[15] - this.field4686[5] * this.field4686[11] * this.field4686[14] - this.field4686[9] * this.field4686[6] * this.field4686[15]) - this.field4686[7] * this.field4686[10] * this.field4686[13]) * var1;
        float var3 = (this.field4686[3] * this.field4686[10] * this.field4686[13] + (this.field4686[9] * this.field4686[2] * this.field4686[15] + this.field4686[11] * this.field4686[1] * this.field4686[14] + this.field4686[10] * -this.field4686[1] * this.field4686[15] - this.field4686[2] * this.field4686[11] * this.field4686[13] - this.field4686[3] * this.field4686[9] * this.field4686[14])) * var1;
        float var4 = (this.field4686[5] * this.field4686[3] * this.field4686[14] + this.field4686[2] * this.field4686[7] * this.field4686[13] + (this.field4686[1] * this.field4686[6] * this.field4686[15] - this.field4686[1] * this.field4686[7] * this.field4686[14] - this.field4686[2] * this.field4686[5] * this.field4686[15]) - this.field4686[6] * this.field4686[3] * this.field4686[13]) * var1;
        float var5 = (this.field4686[6] * this.field4686[3] * this.field4686[9] + (this.field4686[5] * this.field4686[2] * this.field4686[11] + this.field4686[1] * this.field4686[7] * this.field4686[10] + this.field4686[6] * -this.field4686[1] * this.field4686[11] - this.field4686[7] * this.field4686[2] * this.field4686[9] - this.field4686[3] * this.field4686[5] * this.field4686[10])) * var1;
        float var6 = (this.field4686[10] * this.field4686[7] * this.field4686[12] + (this.field4686[8] * this.field4686[6] * this.field4686[15] + this.field4686[10] * -this.field4686[4] * this.field4686[15] + this.field4686[11] * this.field4686[4] * this.field4686[14] - this.field4686[11] * this.field4686[6] * this.field4686[12] - this.field4686[7] * this.field4686[8] * this.field4686[14])) * var1;
        float var7 = (this.field4686[3] * this.field4686[8] * this.field4686[14] + this.field4686[2] * this.field4686[11] * this.field4686[12] + (this.field4686[10] * this.field4686[0] * this.field4686[15] - this.field4686[0] * this.field4686[11] * this.field4686[14] - this.field4686[8] * this.field4686[2] * this.field4686[15]) - this.field4686[3] * this.field4686[10] * this.field4686[12]) * var1;
        float var8 = (this.field4686[3] * this.field4686[6] * this.field4686[12] + (this.field4686[4] * this.field4686[2] * this.field4686[15] + this.field4686[6] * -this.field4686[0] * this.field4686[15] + this.field4686[0] * this.field4686[7] * this.field4686[14] - this.field4686[2] * this.field4686[7] * this.field4686[12] - this.field4686[3] * this.field4686[4] * this.field4686[14])) * var1;
        float var9 = (this.field4686[3] * this.field4686[4] * this.field4686[10] + this.field4686[2] * this.field4686[7] * this.field4686[8] + (this.field4686[0] * this.field4686[6] * this.field4686[11] - this.field4686[0] * this.field4686[7] * this.field4686[10] - this.field4686[2] * this.field4686[4] * this.field4686[11]) - this.field4686[3] * this.field4686[6] * this.field4686[8]) * var1;
        float var10 = (this.field4686[7] * this.field4686[8] * this.field4686[13] + this.field4686[11] * this.field4686[5] * this.field4686[12] + (this.field4686[4] * this.field4686[9] * this.field4686[15] - this.field4686[4] * this.field4686[11] * this.field4686[13] - this.field4686[5] * this.field4686[8] * this.field4686[15]) - this.field4686[7] * this.field4686[9] * this.field4686[12]) * var1;
        float var11 = (this.field4686[9] * this.field4686[3] * this.field4686[12] + (this.field4686[8] * this.field4686[1] * this.field4686[15] + this.field4686[9] * -this.field4686[0] * this.field4686[15] + this.field4686[11] * this.field4686[0] * this.field4686[13] - this.field4686[1] * this.field4686[11] * this.field4686[12] - this.field4686[3] * this.field4686[8] * this.field4686[13])) * var1;
        float var12 = (this.field4686[4] * this.field4686[3] * this.field4686[13] + this.field4686[7] * this.field4686[1] * this.field4686[12] + (this.field4686[5] * this.field4686[0] * this.field4686[15] - this.field4686[0] * this.field4686[7] * this.field4686[13] - this.field4686[1] * this.field4686[4] * this.field4686[15]) - this.field4686[3] * this.field4686[5] * this.field4686[12]) * var1;
        float var13 = (this.field4686[3] * this.field4686[5] * this.field4686[8] + (this.field4686[4] * this.field4686[1] * this.field4686[11] + this.field4686[7] * this.field4686[0] * this.field4686[9] + this.field4686[5] * -this.field4686[0] * this.field4686[11] - this.field4686[1] * this.field4686[7] * this.field4686[8] - this.field4686[4] * this.field4686[3] * this.field4686[9])) * var1;
        float var14 = (this.field4686[6] * this.field4686[9] * this.field4686[12] + (this.field4686[8] * this.field4686[5] * this.field4686[14] + this.field4686[10] * this.field4686[4] * this.field4686[13] + this.field4686[9] * -this.field4686[4] * this.field4686[14] - this.field4686[10] * this.field4686[5] * this.field4686[12] - this.field4686[8] * this.field4686[6] * this.field4686[13])) * var1;
        float var15 = (this.field4686[8] * this.field4686[2] * this.field4686[13] + this.field4686[1] * this.field4686[10] * this.field4686[12] + (this.field4686[0] * this.field4686[9] * this.field4686[14] - this.field4686[0] * this.field4686[10] * this.field4686[13] - this.field4686[1] * this.field4686[8] * this.field4686[14]) - this.field4686[2] * this.field4686[9] * this.field4686[12]) * var1;
        float var16 = (this.field4686[2] * this.field4686[5] * this.field4686[12] + (this.field4686[4] * this.field4686[1] * this.field4686[14] + this.field4686[5] * -this.field4686[0] * this.field4686[14] + this.field4686[6] * this.field4686[0] * this.field4686[13] - this.field4686[1] * this.field4686[6] * this.field4686[12] - this.field4686[4] * this.field4686[2] * this.field4686[13])) * var1;
        float var17 = (this.field4686[4] * this.field4686[2] * this.field4686[9] + this.field4686[1] * this.field4686[6] * this.field4686[8] + (this.field4686[0] * this.field4686[5] * this.field4686[10] - this.field4686[6] * this.field4686[0] * this.field4686[9] - this.field4686[4] * this.field4686[1] * this.field4686[10]) - this.field4686[2] * this.field4686[5] * this.field4686[8]) * var1;
        this.field4686[0] = var2;
        this.field4686[1] = var3;
        this.field4686[2] = var4;
        this.field4686[3] = var5;
        this.field4686[4] = var6;
        this.field4686[5] = var7;
        this.field4686[6] = var8;
        this.field4686[7] = var9;
        this.field4686[8] = var10;
        this.field4686[9] = var11;
        this.field4686[10] = var12;
        this.field4686[11] = var13;
        this.field4686[12] = var14;
        this.field4686[13] = var15;
        this.field4686[14] = var16;
        this.field4686[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7399();
        this.method7447();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4686[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4686);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class439)) {
            return false;
        }
        class439 var2 = (class439) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4686[var3] != var2.field4686[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("qp.ah(I)[F")
    public float[] method7418() {
        float[] var1 = new float[3];
        class437 var2 = new class437(this.field4686[0], this.field4686[1], this.field4686[2]);
        class437 var3 = new class437(this.field4686[4], this.field4686[5], this.field4686[6]);
        class437 var4 = new class437(this.field4686[8], this.field4686[9], this.field4686[10]);
        var1[0] = var2.method7360();
        var1[1] = var3.method7360();
        var1[2] = var4.method7360();
        return var1;
    }
}
