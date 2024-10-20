package deob;

@ObfuscatedName("ba")
public class class162 {

    @ObfuscatedName("ba.d")
    public static float[][] field2423 = new float[2][8];

    @ObfuscatedName("ba.b")
    public int[] field2419 = new int[2];

    @ObfuscatedName("ba.l")
    public static int[][] field2429 = new int[2][8];

    @ObfuscatedName("ba.k")
    public int[][][] field2420 = new int[2][2][4];

    @ObfuscatedName("ba.w")
    public int[][][] field2421 = new int[2][2][4];

    @ObfuscatedName("ba.t")
    public int[] field2422 = new int[2];

    @ObfuscatedName("ba.h(F)F")
    public static float method2779(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ba.k(IIF)F")
    public float method2780(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2420[arg0][1][arg1] - this.field2420[arg0][0][arg1]) * arg2 + (float) this.field2420[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2779(var5);
    }

    @ObfuscatedName("ba.w(IF)I")
    public int method2781(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2422[1] - this.field2422[0]) * arg1 + (float) this.field2422[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field2425 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field2426 = (int) (Statics.field2425 * 65536.0F);
        }
        if (this.field2419[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2791(arg0, 0, arg1);
        field2423[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2780(arg0, 0, arg1));
        field2423[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2419[arg0]; var6++) {
            float var7 = this.method2791(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2780(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2423[arg0][var6 * 2 + 1] = field2423[arg0][var6 * 2 - 1] * var9;
            field2423[arg0][var6 * 2] = field2423[arg0][var6 * 2 - 1] * var8 + field2423[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2423[arg0][var10] += field2423[arg0][var10 - 1] * var8 + field2423[arg0][var10 - 2] * var9;
            }
            field2423[arg0][1] += field2423[arg0][0] * var8 + var9;
            field2423[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2419[0] * 2; var11++) {
                field2423[0][var11] *= Statics.field2425;
            }
        }
        for (int var12 = 0; var12 < this.field2419[arg0] * 2; var12++) {
            field2429[arg0][var12] = (int) (field2423[arg0][var12] * 65536.0F);
        }
        return this.field2419[arg0] * 2;
    }

    @ObfuscatedName("ba.b(IIF)F")
    public float method2791(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2421[arg0][1][arg1] - this.field2421[arg0][0][arg1]) * arg2 + (float) this.field2421[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ba.t(Ldp;Lbm;)V")
    public final void method2795(class50 arg0, class124 arg1) {
        int var3 = arg0.method726();
        this.field2419[0] = var3 >> 4;
        this.field2419[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field2422;
            this.field2422[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field2422[0] = arg0.method720();
        this.field2422[1] = arg0.method720();
        int var4 = arg0.method726();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2419[var5]; var6++) {
                this.field2420[var5][0][var6] = arg0.method720();
                this.field2421[var5][0][var6] = arg0.method720();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2419[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2420[var7][1][var8] = this.field2420[var7][0][var8];
                    this.field2421[var7][1][var8] = this.field2421[var7][0][var8];
                } else {
                    this.field2420[var7][1][var8] = arg0.method720();
                    this.field2421[var7][1][var8] = arg0.method720();
                }
            }
        }
        if (var4 != 0 || this.field2422[1] != this.field2422[0]) {
            arg1.method2199(arg0);
        }
    }
}
