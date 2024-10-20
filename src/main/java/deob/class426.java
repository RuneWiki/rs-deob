package deob;

import java.util.Arrays;

@ObfuscatedName("qj")
public final class class426 {

    @ObfuscatedName("qj.an")
    public static class426[] field4666 = new class426[0];

    @ObfuscatedName("qj.au")
    public float[] field4671 = new float[16];

    @ObfuscatedName("qj.ab")
    public static final class426 field4665;

    static {
        method5007(100);
        field4665 = new class426();
    }

    @ObfuscatedName("ka.af(II)V")
    public static void method5007(int arg0) {
        Statics.field4670 = arg0;
        field4666 = new class426[arg0];
        Statics.field4668 = 0;
    }

    @ObfuscatedName("qj.an(I)V")
    public void method7459() {
        class426[] var1 = field4666;
        synchronized (field4666) {
            if (Statics.field4668 < Statics.field4670 - 1) {
                field4666[++Statics.field4668 - 1] = this;
            }
        }
    }

    public class426() {
        this.method7460();
    }

    public class426(class426 arg0) {
        this.method7462(arg0);
    }

    public class426(class489 arg0, boolean arg1) {
        this.method7457(arg0, arg1);
    }

    @ObfuscatedName("qj.aw(Lsg;ZB)V")
    public void method7457(class489 arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field4671[var4] = arg0.method8256();
            }
            return;
        }
        class427 var3 = new class427();
        var3.method7529(class440.method5395(arg0.method8445()));
        var3.method7530(class440.method5395(arg0.method8445()));
        var3.method7531(class440.method5395(arg0.method8445()));
        var3.method7528((float) arg0.method8445(), (float) arg0.method8445(), (float) arg0.method8445());
        this.method7468(var3);
    }

    @ObfuscatedName("qj.ac(S)[F")
    public float[] method7458() {
        float[] var1 = new float[3];
        if ((double) this.field4671[2] < 0.999D && (double) this.field4671[2] > -0.999D) {
            var1[1] = (float) (-Math.asin((double) this.field4671[2]));
            double var2 = Math.cos((double) var1[1]);
            var1[0] = (float) Math.atan2((double) this.field4671[6] / var2, (double) this.field4671[10] / var2);
            var1[2] = (float) Math.atan2((double) this.field4671[1] / var2, (double) this.field4671[0] / var2);
        } else {
            var1[0] = 0.0F;
            var1[1] = (float) Math.atan2((double) this.field4671[2], 0.0D);
            var1[2] = (float) Math.atan2((double) (-this.field4671[9]), (double) this.field4671[5]);
        }
        return var1;
    }

    @ObfuscatedName("qj.au(I)[F")
    public float[] method7456() {
        float[] var1 = new float[] { (float) (-Math.asin((double) this.field4671[6])), 0.0F, 0.0F };
        double var2 = Math.cos((double) var1[0]);
        if (Math.abs(var2) > 0.005D) {
            double var4 = (double) this.field4671[2];
            double var6 = (double) this.field4671[10];
            double var8 = (double) this.field4671[4];
            double var10 = (double) this.field4671[5];
            var1[1] = (float) Math.atan2(var4, var6);
            var1[2] = (float) Math.atan2(var8, var10);
        } else {
            double var12 = (double) this.field4671[1];
            double var14 = (double) this.field4671[0];
            if (this.field4671[6] < 0.0F) {
                var1[1] = (float) Math.atan2(var12, var14);
            } else {
                var1[1] = (float) (-Math.atan2(var12, var14));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("qj.ab(B)V")
    public void method7460() {
        this.field4671[0] = 1.0F;
        this.field4671[1] = 0.0F;
        this.field4671[2] = 0.0F;
        this.field4671[3] = 0.0F;
        this.field4671[4] = 0.0F;
        this.field4671[5] = 1.0F;
        this.field4671[6] = 0.0F;
        this.field4671[7] = 0.0F;
        this.field4671[8] = 0.0F;
        this.field4671[9] = 0.0F;
        this.field4671[10] = 1.0F;
        this.field4671[11] = 0.0F;
        this.field4671[12] = 0.0F;
        this.field4671[13] = 0.0F;
        this.field4671[14] = 0.0F;
        this.field4671[15] = 1.0F;
    }

    @ObfuscatedName("qj.aq(I)V")
    public void method7461() {
        this.field4671[0] = 0.0F;
        this.field4671[1] = 0.0F;
        this.field4671[2] = 0.0F;
        this.field4671[3] = 0.0F;
        this.field4671[4] = 0.0F;
        this.field4671[5] = 0.0F;
        this.field4671[6] = 0.0F;
        this.field4671[7] = 0.0F;
        this.field4671[8] = 0.0F;
        this.field4671[9] = 0.0F;
        this.field4671[10] = 0.0F;
        this.field4671[11] = 0.0F;
        this.field4671[12] = 0.0F;
        this.field4671[13] = 0.0F;
        this.field4671[14] = 0.0F;
        this.field4671[15] = 0.0F;
    }

    @ObfuscatedName("qj.al(Lqj;I)V")
    public void method7462(class426 arg0) {
        System.arraycopy(arg0.field4671, 0, this.field4671, 0, 16);
    }

    @ObfuscatedName("qj.at(FI)V")
    public void method7463(float arg0) {
        this.method7506(arg0, arg0, arg0);
    }

    @ObfuscatedName("qj.aa(FFFI)V")
    public void method7506(float arg0, float arg1, float arg2) {
        this.method7460();
        this.field4671[0] = arg0;
        this.field4671[5] = arg1;
        this.field4671[10] = arg2;
    }

    @ObfuscatedName("qj.ay(Lqj;I)V")
    public void method7465(class426 arg0) {
        for (int var2 = 0; var2 < this.field4671.length; var2++) {
            this.field4671[var2] += arg0.field4671[var2];
        }
    }

    @ObfuscatedName("qj.ao(Lqj;I)V")
    public void method7466(class426 arg0) {
        float var2 = this.field4671[3] * arg0.field4671[12] + this.field4671[2] * arg0.field4671[8] + this.field4671[1] * arg0.field4671[4] + this.field4671[0] * arg0.field4671[0];
        float var3 = this.field4671[3] * arg0.field4671[13] + this.field4671[2] * arg0.field4671[9] + this.field4671[0] * arg0.field4671[1] + this.field4671[1] * arg0.field4671[5];
        float var4 = this.field4671[3] * arg0.field4671[14] + this.field4671[2] * arg0.field4671[10] + this.field4671[0] * arg0.field4671[2] + this.field4671[1] * arg0.field4671[6];
        float var5 = this.field4671[3] * arg0.field4671[15] + this.field4671[2] * arg0.field4671[11] + this.field4671[1] * arg0.field4671[7] + this.field4671[0] * arg0.field4671[3];
        float var6 = this.field4671[7] * arg0.field4671[12] + this.field4671[6] * arg0.field4671[8] + this.field4671[5] * arg0.field4671[4] + this.field4671[4] * arg0.field4671[0];
        float var7 = this.field4671[7] * arg0.field4671[13] + this.field4671[6] * arg0.field4671[9] + this.field4671[5] * arg0.field4671[5] + this.field4671[4] * arg0.field4671[1];
        float var8 = this.field4671[7] * arg0.field4671[14] + this.field4671[6] * arg0.field4671[10] + this.field4671[4] * arg0.field4671[2] + this.field4671[5] * arg0.field4671[6];
        float var9 = this.field4671[7] * arg0.field4671[15] + this.field4671[6] * arg0.field4671[11] + this.field4671[4] * arg0.field4671[3] + this.field4671[5] * arg0.field4671[7];
        float var10 = this.field4671[11] * arg0.field4671[12] + this.field4671[10] * arg0.field4671[8] + this.field4671[8] * arg0.field4671[0] + this.field4671[9] * arg0.field4671[4];
        float var11 = this.field4671[11] * arg0.field4671[13] + this.field4671[10] * arg0.field4671[9] + this.field4671[9] * arg0.field4671[5] + this.field4671[8] * arg0.field4671[1];
        float var12 = this.field4671[11] * arg0.field4671[14] + this.field4671[10] * arg0.field4671[10] + this.field4671[9] * arg0.field4671[6] + this.field4671[8] * arg0.field4671[2];
        float var13 = this.field4671[11] * arg0.field4671[15] + this.field4671[10] * arg0.field4671[11] + this.field4671[8] * arg0.field4671[3] + this.field4671[9] * arg0.field4671[7];
        float var14 = this.field4671[15] * arg0.field4671[12] + this.field4671[14] * arg0.field4671[8] + this.field4671[13] * arg0.field4671[4] + this.field4671[12] * arg0.field4671[0];
        float var15 = this.field4671[15] * arg0.field4671[13] + this.field4671[14] * arg0.field4671[9] + this.field4671[12] * arg0.field4671[1] + this.field4671[13] * arg0.field4671[5];
        float var16 = this.field4671[15] * arg0.field4671[14] + this.field4671[14] * arg0.field4671[10] + this.field4671[12] * arg0.field4671[2] + this.field4671[13] * arg0.field4671[6];
        float var17 = this.field4671[15] * arg0.field4671[15] + this.field4671[14] * arg0.field4671[11] + this.field4671[13] * arg0.field4671[7] + this.field4671[12] * arg0.field4671[3];
        this.field4671[0] = var2;
        this.field4671[1] = var3;
        this.field4671[2] = var4;
        this.field4671[3] = var5;
        this.field4671[4] = var6;
        this.field4671[5] = var7;
        this.field4671[6] = var8;
        this.field4671[7] = var9;
        this.field4671[8] = var10;
        this.field4671[9] = var11;
        this.field4671[10] = var12;
        this.field4671[11] = var13;
        this.field4671[12] = var14;
        this.field4671[13] = var15;
        this.field4671[14] = var16;
        this.field4671[15] = var17;
    }

    @ObfuscatedName("qj.ax(Lqx;B)V")
    public void method7467(class425 arg0) {
        float var2 = arg0.field4664 * arg0.field4664;
        float var3 = arg0.field4664 * arg0.field4661;
        float var4 = arg0.field4664 * arg0.field4662;
        float var5 = arg0.field4664 * arg0.field4663;
        float var6 = arg0.field4661 * arg0.field4661;
        float var7 = arg0.field4662 * arg0.field4661;
        float var8 = arg0.field4663 * arg0.field4661;
        float var9 = arg0.field4662 * arg0.field4662;
        float var10 = arg0.field4663 * arg0.field4662;
        float var11 = arg0.field4663 * arg0.field4663;
        this.field4671[0] = var2 + var6 - var11 - var9;
        this.field4671[1] = var5 + var7 + var7 + var5;
        this.field4671[2] = var8 - var4 - var4 + var8;
        this.field4671[4] = var7 - var5 - var5 + var7;
        this.field4671[5] = var2 + var9 - var6 - var11;
        this.field4671[6] = var3 + var10 + var10 + var3;
        this.field4671[8] = var4 + var8 + var8 + var4;
        this.field4671[9] = var10 - var3 - var3 + var10;
        this.field4671[10] = var2 + var11 - var9 - var6;
    }

    @ObfuscatedName("qj.ai(Lqc;B)V")
    public void method7468(class427 arg0) {
        this.field4671[0] = arg0.field4687;
        this.field4671[1] = arg0.field4676;
        this.field4671[2] = arg0.field4677;
        this.field4671[3] = 0.0F;
        this.field4671[4] = arg0.field4678;
        this.field4671[5] = arg0.field4679;
        this.field4671[6] = arg0.field4680;
        this.field4671[7] = 0.0F;
        this.field4671[8] = arg0.field4681;
        this.field4671[9] = arg0.field4682;
        this.field4671[10] = arg0.field4683;
        this.field4671[11] = 0.0F;
        this.field4671[12] = arg0.field4684;
        this.field4671[13] = arg0.field4685;
        this.field4671[14] = arg0.field4686;
        this.field4671[15] = 1.0F;
    }

    @ObfuscatedName("qj.ag(I)F")
    public float method7469() {
        return this.field4671[3] * this.field4671[6] * this.field4671[9] * this.field4671[12] + (this.field4671[3] * this.field4671[5] * this.field4671[8] * this.field4671[14] + this.field4671[4] * this.field4671[3] * this.field4671[10] * this.field4671[13] + (this.field4671[7] * this.field4671[2] * this.field4671[8] * this.field4671[13] + this.field4671[2] * this.field4671[5] * this.field4671[11] * this.field4671[12] + (this.field4671[4] * this.field4671[2] * this.field4671[9] * this.field4671[15] + this.field4671[1] * this.field4671[7] * this.field4671[10] * this.field4671[12] + (this.field4671[6] * this.field4671[1] * this.field4671[8] * this.field4671[15] + this.field4671[1] * this.field4671[4] * this.field4671[11] * this.field4671[14] + (this.field4671[0] * this.field4671[7] * this.field4671[9] * this.field4671[14] + this.field4671[0] * this.field4671[6] * this.field4671[11] * this.field4671[13] + (this.field4671[5] * this.field4671[0] * this.field4671[10] * this.field4671[15] - this.field4671[5] * this.field4671[0] * this.field4671[11] * this.field4671[14] - this.field4671[0] * this.field4671[6] * this.field4671[9] * this.field4671[15]) - this.field4671[0] * this.field4671[7] * this.field4671[10] * this.field4671[13] - this.field4671[1] * this.field4671[4] * this.field4671[10] * this.field4671[15]) - this.field4671[1] * this.field4671[6] * this.field4671[11] * this.field4671[12] - this.field4671[1] * this.field4671[7] * this.field4671[8] * this.field4671[14]) - this.field4671[2] * this.field4671[4] * this.field4671[11] * this.field4671[13] - this.field4671[2] * this.field4671[5] * this.field4671[8] * this.field4671[15]) - this.field4671[2] * this.field4671[7] * this.field4671[9] * this.field4671[12] - this.field4671[3] * this.field4671[4] * this.field4671[9] * this.field4671[14]) - this.field4671[5] * this.field4671[3] * this.field4671[10] * this.field4671[12] - this.field4671[6] * this.field4671[3] * this.field4671[8] * this.field4671[13]);
    }

    @ObfuscatedName("qj.ah(I)V")
    public void method7480() {
        float var1 = 1.0F / this.method7469();
        float var2 = (this.field4671[7] * this.field4671[9] * this.field4671[14] + this.field4671[11] * this.field4671[6] * this.field4671[13] + (this.field4671[5] * this.field4671[10] * this.field4671[15] - this.field4671[5] * this.field4671[11] * this.field4671[14] - this.field4671[6] * this.field4671[9] * this.field4671[15]) - this.field4671[7] * this.field4671[10] * this.field4671[13]) * var1;
        float var3 = (this.field4671[3] * this.field4671[10] * this.field4671[13] + (this.field4671[2] * this.field4671[9] * this.field4671[15] + this.field4671[10] * -this.field4671[1] * this.field4671[15] + this.field4671[1] * this.field4671[11] * this.field4671[14] - this.field4671[11] * this.field4671[2] * this.field4671[13] - this.field4671[3] * this.field4671[9] * this.field4671[14])) * var1;
        float var4 = (this.field4671[3] * this.field4671[5] * this.field4671[14] + this.field4671[7] * this.field4671[2] * this.field4671[13] + (this.field4671[6] * this.field4671[1] * this.field4671[15] - this.field4671[1] * this.field4671[7] * this.field4671[14] - this.field4671[5] * this.field4671[2] * this.field4671[15]) - this.field4671[6] * this.field4671[3] * this.field4671[13]) * var1;
        float var5 = (this.field4671[3] * this.field4671[6] * this.field4671[9] + (this.field4671[5] * this.field4671[2] * this.field4671[11] + this.field4671[1] * this.field4671[7] * this.field4671[10] + this.field4671[6] * -this.field4671[1] * this.field4671[11] - this.field4671[2] * this.field4671[7] * this.field4671[9] - this.field4671[3] * this.field4671[5] * this.field4671[10])) * var1;
        float var6 = (this.field4671[10] * this.field4671[7] * this.field4671[12] + (this.field4671[8] * this.field4671[6] * this.field4671[15] + this.field4671[11] * this.field4671[4] * this.field4671[14] + this.field4671[10] * -this.field4671[4] * this.field4671[15] - this.field4671[6] * this.field4671[11] * this.field4671[12] - this.field4671[7] * this.field4671[8] * this.field4671[14])) * var1;
        float var7 = (this.field4671[3] * this.field4671[8] * this.field4671[14] + this.field4671[2] * this.field4671[11] * this.field4671[12] + (this.field4671[10] * this.field4671[0] * this.field4671[15] - this.field4671[11] * this.field4671[0] * this.field4671[14] - this.field4671[8] * this.field4671[2] * this.field4671[15]) - this.field4671[3] * this.field4671[10] * this.field4671[12]) * var1;
        float var8 = (this.field4671[6] * this.field4671[3] * this.field4671[12] + (this.field4671[2] * this.field4671[4] * this.field4671[15] + this.field4671[6] * -this.field4671[0] * this.field4671[15] + this.field4671[7] * this.field4671[0] * this.field4671[14] - this.field4671[2] * this.field4671[7] * this.field4671[12] - this.field4671[4] * this.field4671[3] * this.field4671[14])) * var1;
        float var9 = (this.field4671[4] * this.field4671[3] * this.field4671[10] + this.field4671[7] * this.field4671[2] * this.field4671[8] + (this.field4671[0] * this.field4671[6] * this.field4671[11] - this.field4671[7] * this.field4671[0] * this.field4671[10] - this.field4671[2] * this.field4671[4] * this.field4671[11]) - this.field4671[6] * this.field4671[3] * this.field4671[8]) * var1;
        float var10 = (this.field4671[7] * this.field4671[8] * this.field4671[13] + this.field4671[5] * this.field4671[11] * this.field4671[12] + (this.field4671[9] * this.field4671[4] * this.field4671[15] - this.field4671[4] * this.field4671[11] * this.field4671[13] - this.field4671[8] * this.field4671[5] * this.field4671[15]) - this.field4671[7] * this.field4671[9] * this.field4671[12]) * var1;
        float var11 = (this.field4671[9] * this.field4671[3] * this.field4671[12] + (this.field4671[1] * this.field4671[8] * this.field4671[15] + this.field4671[9] * -this.field4671[0] * this.field4671[15] + this.field4671[0] * this.field4671[11] * this.field4671[13] - this.field4671[1] * this.field4671[11] * this.field4671[12] - this.field4671[8] * this.field4671[3] * this.field4671[13])) * var1;
        float var12 = (this.field4671[3] * this.field4671[4] * this.field4671[13] + this.field4671[7] * this.field4671[1] * this.field4671[12] + (this.field4671[5] * this.field4671[0] * this.field4671[15] - this.field4671[0] * this.field4671[7] * this.field4671[13] - this.field4671[1] * this.field4671[4] * this.field4671[15]) - this.field4671[3] * this.field4671[5] * this.field4671[12]) * var1;
        float var13 = (this.field4671[3] * this.field4671[5] * this.field4671[8] + (this.field4671[4] * this.field4671[1] * this.field4671[11] + this.field4671[0] * this.field4671[7] * this.field4671[9] + this.field4671[5] * -this.field4671[0] * this.field4671[11] - this.field4671[1] * this.field4671[7] * this.field4671[8] - this.field4671[3] * this.field4671[4] * this.field4671[9])) * var1;
        float var14 = (this.field4671[9] * this.field4671[6] * this.field4671[12] + (this.field4671[8] * this.field4671[5] * this.field4671[14] + this.field4671[9] * -this.field4671[4] * this.field4671[14] + this.field4671[4] * this.field4671[10] * this.field4671[13] - this.field4671[10] * this.field4671[5] * this.field4671[12] - this.field4671[8] * this.field4671[6] * this.field4671[13])) * var1;
        float var15 = (this.field4671[8] * this.field4671[2] * this.field4671[13] + this.field4671[1] * this.field4671[10] * this.field4671[12] + (this.field4671[9] * this.field4671[0] * this.field4671[14] - this.field4671[10] * this.field4671[0] * this.field4671[13] - this.field4671[1] * this.field4671[8] * this.field4671[14]) - this.field4671[2] * this.field4671[9] * this.field4671[12]) * var1;
        float var16 = (this.field4671[5] * this.field4671[2] * this.field4671[12] + (this.field4671[1] * this.field4671[4] * this.field4671[14] + this.field4671[5] * -this.field4671[0] * this.field4671[14] + this.field4671[6] * this.field4671[0] * this.field4671[13] - this.field4671[1] * this.field4671[6] * this.field4671[12] - this.field4671[4] * this.field4671[2] * this.field4671[13])) * var1;
        float var17 = (this.field4671[4] * this.field4671[2] * this.field4671[9] + this.field4671[1] * this.field4671[6] * this.field4671[8] + (this.field4671[5] * this.field4671[0] * this.field4671[10] - this.field4671[6] * this.field4671[0] * this.field4671[9] - this.field4671[1] * this.field4671[4] * this.field4671[10]) - this.field4671[5] * this.field4671[2] * this.field4671[8]) * var1;
        this.field4671[0] = var2;
        this.field4671[1] = var3;
        this.field4671[2] = var4;
        this.field4671[3] = var5;
        this.field4671[4] = var6;
        this.field4671[5] = var7;
        this.field4671[6] = var8;
        this.field4671[7] = var9;
        this.field4671[8] = var10;
        this.field4671[9] = var11;
        this.field4671[10] = var12;
        this.field4671[11] = var13;
        this.field4671[12] = var14;
        this.field4671[13] = var15;
        this.field4671[14] = var16;
        this.field4671[15] = var17;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method7456();
        this.method7458();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 4; var3++) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4671[var2 * 4 + var3];
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
        return var2 * 31 + Arrays.hashCode(this.field4671);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class426)) {
            return false;
        }
        class426 var2 = (class426) arg0;
        for (int var3 = 0; var3 < 16; var3++) {
            if (this.field4671[var3] != var2.field4671[var3]) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("qj.av(I)[F")
    public float[] method7507() {
        float[] var1 = new float[3];
        class424 var2 = new class424(this.field4671[0], this.field4671[1], this.field4671[2]);
        class424 var3 = new class424(this.field4671[4], this.field4671[5], this.field4671[6]);
        class424 var4 = new class424(this.field4671[8], this.field4671[9], this.field4671[10]);
        var1[0] = var2.method7414();
        var1[1] = var3.method7414();
        var1[2] = var4.method7414();
        return var1;
    }
}
