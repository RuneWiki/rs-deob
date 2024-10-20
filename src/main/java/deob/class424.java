package deob;

import java.util.Arrays;

@ObfuscatedName("ql")
public final class class424 {

    @ObfuscatedName("ql.al")
    public static class424[] field4692 = new class424[0];

    @ObfuscatedName("ql.af")
    public float[] field4695 = new float[16];

    @ObfuscatedName("ql.aa")
    public static final class424 field4696;

    static {
        method7076(100);
        field4696 = new class424();
    }

    @ObfuscatedName("ph.ak(IB)V")
    public static void method7076(int arg0) {
        Statics.field4694 = arg0;
        field4692 = new class424[arg0];
        Statics.field5240 = 0;
    }

    @ObfuscatedName("ql.al(B)V")
    public void method7197() {
        class424[] var1 = field4692;
        synchronized (field4692) {
            if (Statics.field5240 < Statics.field4694 - 1) {
                field4692[++Statics.field5240 - 1] = this;
            }
        }
    }

    public class424() {
        this.method7210();
    }

    public class424(class424 arg0) {
        this.method7244(arg0);
    }

    public class424(class546 arg0, boolean arg1) {
        this.method7170(arg0, arg1);
    }

    @ObfuscatedName("ql.aj(Lua;ZI)V")
    public void method7170(class546 arg0, boolean arg1) {
        if (!arg1) {
            for (int var16 = 0; var16 < 16; var16++) {
                this.field4695[var16] = arg0.method8803();
            }
            return;
        }
        class425 var3 = new class425();
        int var5 = arg0.method8926();
        int var6 = var5 & 0x3FFF;
        float var7 = (float) ((double) ((float) var6 / 16384.0F) * 6.283185307179586D);
        var3.method7251(var7);
        int var9 = arg0.method8926();
        int var10 = var9 & 0x3FFF;
        float var11 = (float) ((double) ((float) var10 / 16384.0F) * 6.283185307179586D);
        var3.method7252(var11);
        int var13 = arg0.method8926();
        int var14 = var13 & 0x3FFF;
        float var15 = (float) ((double) ((float) var14 / 16384.0F) * 6.283185307179586D);
        var3.method7253(var15);
        var3.method7254((float) arg0.method8926(), (float) arg0.method8926(), (float) arg0.method8926());
        this.method7245(var3);
    }

    @ObfuscatedName("ql.az(B)[F")
    public float[] method7171() {
        float[] var1 = new float[3];
        if ((double) this.field4695[2] < 0.999D && (double) this.field4695[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4695[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4695[6] / var2, (double) this.field4695[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4695[1] / var2, (double) this.field4695[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4695[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4695[9]), (double) this.field4695[5]);
        }
        return var1;
    }

    @ObfuscatedName("ql.af(B)[F")
    public float[] method7172() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4695[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4695[2];
            double var6 = (double) this.field4695[10];
            double var8 = (double) this.field4695[4];
            double var10 = (double) this.field4695[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4695[1];
            double var14 = (double) this.field4695[0];
            if (this.field4695[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("ql.aa(B)V")
    public void method7210() {
        this.field4695[0] = 1.0F;
        this.field4695[1] = 0.0F;
        this.field4695[2] = 0.0F;
        this.field4695[3] = 0.0F;
        this.field4695[4] = 0.0F;
        this.field4695[5] = 1.0F;
        this.field4695[6] = 0.0F;
        this.field4695[7] = 0.0F;
        this.field4695[8] = 0.0F;
        this.field4695[9] = 0.0F;
        this.field4695[10] = 1.0F;
        this.field4695[11] = 0.0F;
        this.field4695[12] = 0.0F;
        this.field4695[13] = 0.0F;
        this.field4695[14] = 0.0F;
        this.field4695[15] = 1.0F;
    }

    @ObfuscatedName("ql.at(B)V")
    public void method7181() {
        this.field4695[0] = 0.0F;
        this.field4695[1] = 0.0F;
        this.field4695[2] = 0.0F;
        this.field4695[3] = 0.0F;
        this.field4695[4] = 0.0F;
        this.field4695[5] = 0.0F;
        this.field4695[6] = 0.0F;
        this.field4695[7] = 0.0F;
        this.field4695[8] = 0.0F;
        this.field4695[9] = 0.0F;
        this.field4695[10] = 0.0F;
        this.field4695[11] = 0.0F;
        this.field4695[12] = 0.0F;
        this.field4695[13] = 0.0F;
        this.field4695[14] = 0.0F;
        this.field4695[15] = 0.0F;
    }

    @ObfuscatedName("ql.ab(Lql;B)V")
    public void method7244(class424 arg0) {
        System.arraycopy(arg0.field4695, 0, this.field4695, 0, 16);
    }

    @ObfuscatedName("ql.ac(FI)V")
    public void method7176(float arg0) {
        this.method7177(arg0, arg0, arg0);
    }

    @ObfuscatedName("ql.ao(FFFS)V")
    public void method7177(float arg0, float arg1, float arg2) {
        this.method7210();
        this.field4695[0] = arg0;
        this.field4695[5] = arg1;
        this.field4695[10] = arg2;
    }

    @ObfuscatedName("ql.ah(Lql;B)V")
    public void method7178(class424 arg0) {
        for (int var2 = 0; var2 < this.field4695.length; var2++) {
            this.field4695[var2] += arg0.field4695[var2];
        }
    }

    @ObfuscatedName("ql.av(Lql;I)V")
    public void method7224(class424 arg0) {
        float var2 = this.field4695[3] * arg0.field4695[12] + this.field4695[2] * arg0.field4695[8] + this.field4695[0] * arg0.field4695[0] + this.field4695[1] * arg0.field4695[4];
        float var3 = this.field4695[3] * arg0.field4695[13] + this.field4695[2] * arg0.field4695[9] + this.field4695[1] * arg0.field4695[5] + this.field4695[0] * arg0.field4695[1];
        float var4 = this.field4695[3] * arg0.field4695[14] + this.field4695[2] * arg0.field4695[10] + this.field4695[0] * arg0.field4695[2] + this.field4695[1] * arg0.field4695[6];
        float var5 = this.field4695[3] * arg0.field4695[15] + this.field4695[2] * arg0.field4695[11] + this.field4695[1] * arg0.field4695[7] + this.field4695[0] * arg0.field4695[3];
        float var6 = this.field4695[7] * arg0.field4695[12] + this.field4695[6] * arg0.field4695[8] + this.field4695[5] * arg0.field4695[4] + this.field4695[4] * arg0.field4695[0];
        float var7 = this.field4695[7] * arg0.field4695[13] + this.field4695[6] * arg0.field4695[9] + this.field4695[5] * arg0.field4695[5] + this.field4695[4] * arg0.field4695[1];
        float var8 = this.field4695[7] * arg0.field4695[14] + this.field4695[6] * arg0.field4695[10] + this.field4695[5] * arg0.field4695[6] + this.field4695[4] * arg0.field4695[2];
        float var9 = this.field4695[7] * arg0.field4695[15] + this.field4695[6] * arg0.field4695[11] + this.field4695[5] * arg0.field4695[7] + this.field4695[4] * arg0.field4695[3];
        float var10 = this.field4695[11] * arg0.field4695[12] + this.field4695[10] * arg0.field4695[8] + this.field4695[9] * arg0.field4695[4] + this.field4695[8] * arg0.field4695[0];
        float var11 = this.field4695[11] * arg0.field4695[13] + this.field4695[10] * arg0.field4695[9] + this.field4695[8] * arg0.field4695[1] + this.field4695[9] * arg0.field4695[5];
        float var12 = this.field4695[11] * arg0.field4695[14] + this.field4695[10] * arg0.field4695[10] + this.field4695[9] * arg0.field4695[6] + this.field4695[8] * arg0.field4695[2];
        float var13 = this.field4695[11] * arg0.field4695[15] + this.field4695[10] * arg0.field4695[11] + this.field4695[9] * arg0.field4695[7] + this.field4695[8] * arg0.field4695[3];
        float var14 = this.field4695[15] * arg0.field4695[12] + this.field4695[14] * arg0.field4695[8] + this.field4695[12] * arg0.field4695[0] + this.field4695[13] * arg0.field4695[4];
        float var15 = this.field4695[15] * arg0.field4695[13] + this.field4695[14] * arg0.field4695[9] + this.field4695[13] * arg0.field4695[5] + this.field4695[12] * arg0.field4695[1];
        float var16 = this.field4695[15] * arg0.field4695[14] + this.field4695[14] * arg0.field4695[10] + this.field4695[13] * arg0.field4695[6] + this.field4695[12] * arg0.field4695[2];
        float var17 = this.field4695[15] * arg0.field4695[15] + this.field4695[14] * arg0.field4695[11] + this.field4695[12] * arg0.field4695[3] + this.field4695[13] * arg0.field4695[7];
        this.field4695[0] = var2;
        this.field4695[1] = var3;
        this.field4695[2] = var4;
        this.field4695[3] = var5;
        this.field4695[4] = var6;
        this.field4695[5] = var7;
        this.field4695[6] = var8;
        this.field4695[7] = var9;
        this.field4695[8] = var10;
        this.field4695[9] = var11;
        this.field4695[10] = var12;
        this.field4695[11] = var13;
        this.field4695[12] = var14;
        this.field4695[13] = var15;
        this.field4695[14] = var16;
        this.field4695[15] = var17;
    }

    @ObfuscatedName("ql.aq(Lqd;I)V")
    public void method7186(class418 arg0) {
        float var2 = arg0.field4668.field4686 * arg0.field4668.field4686;
        float var3 = arg0.field4668.field4688 * arg0.field4668.field4686;
        float var4 = arg0.field4668.field4686 * arg0.field4668.field4685;
        float var5 = arg0.field4668.field4690 * arg0.field4668.field4686;
        float var6 = arg0.field4668.field4688 * arg0.field4668.field4688;
        float var7 = arg0.field4668.field4688 * arg0.field4668.field4685;
        float var8 = arg0.field4668.field4690 * arg0.field4668.field4688;
        float var9 = arg0.field4668.field4685 * arg0.field4668.field4685;
        float var10 = arg0.field4668.field4690 * arg0.field4668.field4685;
        float var11 = arg0.field4668.field4690 * arg0.field4668.field4690;
        this.field4695[0] = var2 + var6 - var11 - var9;
        this.field4695[1] = var5 + var7 + var7 + var5;
        this.field4695[2] = var8 - var4 - var4 + var8;
        this.field4695[4] = var7 - var5 - var5 + var7;
        this.field4695[5] = var2 + var9 - var6 - var11;
        this.field4695[6] = var3 + var10 + var10 + var3;
        this.field4695[8] = var4 + var8 + var8 + var4;
        this.field4695[9] = var10 - var3 - var3 + var10;
        this.field4695[10] = var2 + var11 - var9 - var6;
        float[] var12 = this.field4695;
        float[] var13 = this.field4695;
        this.field4695[11] = 0.0F;
        var13[7] = 0.0F;
        var12[3] = 0.0F;
        this.field4695[12] = arg0.field4669.field4684;
        this.field4695[13] = arg0.field4669.field4681;
        this.field4695[14] = arg0.field4669.field4682;
        this.field4695[15] = 1.0F;
    }

    @ObfuscatedName("ql.ap(Lqz;I)V")
    public void method7173(class423 arg0) {
        float var2 = arg0.field4686 * arg0.field4686;
        float var3 = arg0.field4688 * arg0.field4686;
        float var4 = arg0.field4686 * arg0.field4685;
        float var5 = arg0.field4690 * arg0.field4686;
        float var6 = arg0.field4688 * arg0.field4688;
        float var7 = arg0.field4688 * arg0.field4685;
        float var8 = arg0.field4690 * arg0.field4688;
        float var9 = arg0.field4685 * arg0.field4685;
        float var10 = arg0.field4690 * arg0.field4685;
        float var11 = arg0.field4690 * arg0.field4690;
        this.field4695[0] = var2 + var6 - var11 - var9;
        this.field4695[1] = var5 + var7 + var7 + var5;
        this.field4695[2] = var8 - var4 - var4 + var8;
        this.field4695[4] = var7 - var5 - var5 + var7;
        this.field4695[5] = var2 + var9 - var6 - var11;
        this.field4695[6] = var3 + var10 + var10 + var3;
        this.field4695[8] = var4 + var8 + var8 + var4;
        this.field4695[9] = var10 - var3 - var3 + var10;
        this.field4695[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("ql.ae(Lqx;I)V")
    public void method7245(class425 arg0) {
        this.field4695[0] = arg0.field4701;
        this.field4695[1] = arg0.field4709;
        this.field4695[2] = arg0.field4698;
        this.field4695[3] = 0.0F;
        this.field4695[4] = arg0.field4700;
        this.field4695[5] = arg0.field4702;
        this.field4695[6] = arg0.field4703;
        this.field4695[7] = 0.0F;
        this.field4695[8] = arg0.field4704;
        this.field4695[9] = arg0.field4705;
        this.field4695[10] = arg0.field4706;
        this.field4695[11] = 0.0F;
        this.field4695[12] = arg0.field4707;
        this.field4695[13] = arg0.field4708;
        this.field4695[14] = arg0.field4699;
        this.field4695[15] = 1.0F;
    }

    @ObfuscatedName("ql.ax(B)F")
    public float method7183() {
        return this.field4695[6] * this.field4695[3] * this.field4695[9] * this.field4695[12] + (this.field4695[5] * this.field4695[3] * this.field4695[8] * this.field4695[14] + this.field4695[3] * this.field4695[4] * this.field4695[10] * this.field4695[13] + (this.field4695[7] * this.field4695[2] * this.field4695[8] * this.field4695[13] + this.field4695[2] * this.field4695[5] * this.field4695[11] * this.field4695[12] + (this.field4695[2] * this.field4695[4] * this.field4695[9] * this.field4695[15] + this.field4695[1] * this.field4695[7] * this.field4695[10] * this.field4695[12] + (this.field4695[1] * this.field4695[6] * this.field4695[8] * this.field4695[15] + this.field4695[1] * this.field4695[4] * this.field4695[11] * this.field4695[14] + (this.field4695[0] * this.field4695[7] * this.field4695[9] * this.field4695[14] + this.field4695[6] * this.field4695[0] * this.field4695[11] * this.field4695[13] + (this.field4695[0] * this.field4695[5] * this.field4695[10] * this.field4695[15] - this.field4695[5] * this.field4695[0] * this.field4695[11] * this.field4695[14] - this.field4695[6] * this.field4695[0] * this.field4695[9] * this.field4695[15]) - this.field4695[7] * this.field4695[0] * this.field4695[10] * this.field4695[13] - this.field4695[4] * this.field4695[1] * this.field4695[10] * this.field4695[15]) - this.field4695[6] * this.field4695[1] * this.field4695[11] * this.field4695[12] - this.field4695[7] * this.field4695[1] * this.field4695[8] * this.field4695[14]) - this.field4695[4] * this.field4695[2] * this.field4695[11] * this.field4695[13] - this.field4695[5] * this.field4695[2] * this.field4695[8] * this.field4695[15]) - this.field4695[2] * this.field4695[7] * this.field4695[9] * this.field4695[12] - this.field4695[3] * this.field4695[4] * this.field4695[9] * this.field4695[14]) - this.field4695[3] * this.field4695[5] * this.field4695[10] * this.field4695[12] - this.field4695[6] * this.field4695[3] * this.field4695[8] * this.field4695[13]);
    }

    @ObfuscatedName("ql.ay(I)V")
    public void method7190() {
        float var1 = 1.0F / this.method7183();
        float var2 = (this.field4695[7] * this.field4695[9] * this.field4695[14] + this.field4695[11] * this.field4695[6] * this.field4695[13] + (this.field4695[10] * this.field4695[5] * this.field4695[15] - this.field4695[11] * this.field4695[5] * this.field4695[14] - this.field4695[6] * this.field4695[9] * this.field4695[15]) - this.field4695[7] * this.field4695[10] * this.field4695[13]) * var1;
        float var3 = (this.field4695[10] * this.field4695[3] * this.field4695[13] + (this.field4695[2] * this.field4695[9] * this.field4695[15] + this.field4695[1] * this.field4695[11] * this.field4695[14] + this.field4695[10] * -this.field4695[1] * this.field4695[15] - this.field4695[11] * this.field4695[2] * this.field4695[13] - this.field4695[3] * this.field4695[9] * this.field4695[14])) * var1;
        float var4 = (this.field4695[5] * this.field4695[3] * this.field4695[14] + this.field4695[2] * this.field4695[7] * this.field4695[13] + (this.field4695[1] * this.field4695[6] * this.field4695[15] - this.field4695[7] * this.field4695[1] * this.field4695[14] - this.field4695[5] * this.field4695[2] * this.field4695[15]) - this.field4695[6] * this.field4695[3] * this.field4695[13]) * var1;
        float var5 = (this.field4695[3] * this.field4695[6] * this.field4695[9] + (this.field4695[2] * this.field4695[5] * this.field4695[11] + this.field4695[7] * this.field4695[1] * this.field4695[10] + this.field4695[6] * -this.field4695[1] * this.field4695[11] - this.field4695[2] * this.field4695[7] * this.field4695[9] - this.field4695[3] * this.field4695[5] * this.field4695[10])) * var1;
        float var6 = (this.field4695[7] * this.field4695[10] * this.field4695[12] + (this.field4695[8] * this.field4695[6] * this.field4695[15] + this.field4695[10] * -this.field4695[4] * this.field4695[15] + this.field4695[11] * this.field4695[4] * this.field4695[14] - this.field4695[6] * this.field4695[11] * this.field4695[12] - this.field4695[8] * this.field4695[7] * this.field4695[14])) * var1;
        float var7 = (this.field4695[3] * this.field4695[8] * this.field4695[14] + this.field4695[2] * this.field4695[11] * this.field4695[12] + (this.field4695[10] * this.field4695[0] * this.field4695[15] - this.field4695[11] * this.field4695[0] * this.field4695[14] - this.field4695[2] * this.field4695[8] * this.field4695[15]) - this.field4695[10] * this.field4695[3] * this.field4695[12]) * var1;
        float var8 = (this.field4695[3] * this.field4695[6] * this.field4695[12] + (this.field4695[2] * this.field4695[4] * this.field4695[15] + this.field4695[6] * -this.field4695[0] * this.field4695[15] + this.field4695[0] * this.field4695[7] * this.field4695[14] - this.field4695[7] * this.field4695[2] * this.field4695[12] - this.field4695[3] * this.field4695[4] * this.field4695[14])) * var1;
        float var9 = (this.field4695[3] * this.field4695[4] * this.field4695[10] + this.field4695[2] * this.field4695[7] * this.field4695[8] + (this.field4695[6] * this.field4695[0] * this.field4695[11] - this.field4695[0] * this.field4695[7] * this.field4695[10] - this.field4695[4] * this.field4695[2] * this.field4695[11]) - this.field4695[6] * this.field4695[3] * this.field4695[8]) * var1;
        float var10 = (this.field4695[7] * this.field4695[8] * this.field4695[13] + this.field4695[5] * this.field4695[11] * this.field4695[12] + (this.field4695[4] * this.field4695[9] * this.field4695[15] - this.field4695[4] * this.field4695[11] * this.field4695[13] - this.field4695[8] * this.field4695[5] * this.field4695[15]) - this.field4695[7] * this.field4695[9] * this.field4695[12]) * var1;
        float var11 = (this.field4695[3] * this.field4695[9] * this.field4695[12] + (this.field4695[1] * this.field4695[8] * this.field4695[15] + this.field4695[11] * this.field4695[0] * this.field4695[13] + this.field4695[9] * -this.field4695[0] * this.field4695[15] - this.field4695[11] * this.field4695[1] * this.field4695[12] - this.field4695[3] * this.field4695[8] * this.field4695[13])) * var1;
        float var12 = (this.field4695[3] * this.field4695[4] * this.field4695[13] + this.field4695[7] * this.field4695[1] * this.field4695[12] + (this.field4695[5] * this.field4695[0] * this.field4695[15] - this.field4695[7] * this.field4695[0] * this.field4695[13] - this.field4695[1] * this.field4695[4] * this.field4695[15]) - this.field4695[3] * this.field4695[5] * this.field4695[12]) * var1;
        float var13 = (this.field4695[5] * this.field4695[3] * this.field4695[8] + (this.field4695[1] * this.field4695[4] * this.field4695[11] + this.field4695[5] * -this.field4695[0] * this.field4695[11] + this.field4695[0] * this.field4695[7] * this.field4695[9] - this.field4695[7] * this.field4695[1] * this.field4695[8] - this.field4695[4] * this.field4695[3] * this.field4695[9])) * var1;
        float var14 = (this.field4695[9] * this.field4695[6] * this.field4695[12] + (this.field4695[8] * this.field4695[5] * this.field4695[14] + this.field4695[9] * -this.field4695[4] * this.field4695[14] + this.field4695[10] * this.field4695[4] * this.field4695[13] - this.field4695[10] * this.field4695[5] * this.field4695[12] - this.field4695[6] * this.field4695[8] * this.field4695[13])) * var1;
        float var15 = (this.field4695[8] * this.field4695[2] * this.field4695[13] + this.field4695[1] * this.field4695[10] * this.field4695[12] + (this.field4695[0] * this.field4695[9] * this.field4695[14] - this.field4695[0] * this.field4695[10] * this.field4695[13] - this.field4695[1] * this.field4695[8] * this.field4695[14]) - this.field4695[2] * this.field4695[9] * this.field4695[12]) * var1;
        float var16 = (this.field4695[5] * this.field4695[2] * this.field4695[12] + (this.field4695[4] * this.field4695[1] * this.field4695[14] + this.field4695[6] * this.field4695[0] * this.field4695[13] + this.field4695[5] * -this.field4695[0] * this.field4695[14] - this.field4695[6] * this.field4695[1] * this.field4695[12] - this.field4695[2] * this.field4695[4] * this.field4695[13])) * var1;
        float var17 = (this.field4695[4] * this.field4695[2] * this.field4695[9] + this.field4695[6] * this.field4695[1] * this.field4695[8] + (this.field4695[0] * this.field4695[5] * this.field4695[10] - this.field4695[0] * this.field4695[6] * this.field4695[9] - this.field4695[1] * this.field4695[4] * this.field4695[10]) - this.field4695[2] * this.field4695[5] * this.field4695[8]) * var1;
        this.field4695[0] = var2;
        this.field4695[1] = var3;
        this.field4695[2] = var4;
        this.field4695[3] = var5;
        this.field4695[4] = var6;
        this.field4695[5] = var7;
        this.field4695[6] = var8;
        this.field4695[7] = var9;
        this.field4695[8] = var10;
        this.field4695[9] = var11;
        this.field4695[10] = var12;
        this.field4695[11] = var13;
        this.field4695[12] = var14;
        this.field4695[13] = var15;
        this.field4695[14] = var16;
        this.field4695[15] = var17;
    }

    @ObfuscatedName("ql.au(FFFFI)V")
    public void method7185(float arg0, float arg1, float arg2, float arg3) {
        this.field4695[0] = arg0;
        this.field4695[1] = 0.0F;
        this.field4695[2] = 0.0F;
        this.field4695[3] = 0.0F;
        this.field4695[4] = 0.0F;
        this.field4695[5] = arg1;
        this.field4695[6] = 0.0F;
        this.field4695[7] = 0.0F;
        this.field4695[8] = 0.0F;
        this.field4695[9] = 0.0F;
        this.field4695[10] = arg2;
        this.field4695[11] = 0.0F;
        this.field4695[12] = 0.0F;
        this.field4695[13] = 0.0F;
        this.field4695[14] = 0.0F;
        this.field4695[15] = arg3;
    }

    @ObfuscatedName("ql.as(FFF[FI)V")
    public void method7193(float arg0, float arg1, float arg2, float[] arg3) {
        arg3[0] = this.field4695[8] * arg2 + this.field4695[0] * arg0 + this.field4695[4] * arg1 + this.field4695[12];
        arg3[1] = this.field4695[9] * arg2 + this.field4695[5] * arg1 + this.field4695[1] * arg0 + this.field4695[13];
        arg3[2] = this.field4695[10] * arg2 + this.field4695[2] * arg0 + this.field4695[6] * arg1 + this.field4695[14];
        if (arg3.length > 3) {
            arg3[3] = this.field4695[11] * arg2 + this.field4695[7] * arg1 + this.field4695[3] * arg0 + this.field4695[15];
        }
    }

    @ObfuscatedName("ql.aw(FFFI)F")
    public float method7203(float arg0, float arg1, float arg2) {
        return this.field4695[8] * arg2 + this.field4695[4] * arg1 + this.field4695[0] * arg0 + this.field4695[12];
    }

    @ObfuscatedName("ql.ad(FFFI)F")
    public float method7187(float arg0, float arg1, float arg2) {
        return this.field4695[9] * arg2 + this.field4695[5] * arg1 + this.field4695[1] * arg0 + this.field4695[13];
    }

    @ObfuscatedName("ql.ai(FFFB)F")
    public float method7189(float arg0, float arg1, float arg2) {
        return this.field4695[10] * arg2 + this.field4695[6] * arg1 + this.field4695[2] * arg0 + this.field4695[14];
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7172();
        this.method7171();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4695[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4695);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class424)) {
            return false;
        }
        class424 var2 = (class424) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4695[var3] != var2.field4695[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ql.an(B)[F")
    public float[] method7191() {
        float[] var1 = new float[3];
        class422 var2 = new class422(this.field4695[0], this.field4695[1], this.field4695[2]);
        class422 var3 = new class422(this.field4695[4], this.field4695[5], this.field4695[6]);
        class422 var4 = new class422(this.field4695[8], this.field4695[9], this.field4695[10]);
        var1[0] = var2.method7125();
        var1[1] = var3.method7125();
        var1[2] = var4.method7125();
        return var1;
    }
}
