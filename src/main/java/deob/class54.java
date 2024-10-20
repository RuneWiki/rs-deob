package deob;

@ObfuscatedName("bw")
public class class54 {

    @ObfuscatedName("bw.c")
    public int[] field426 = new int[2];

    @ObfuscatedName("bw.f")
    public int[][][] field430 = new int[2][2][4];

    @ObfuscatedName("bw.n")
    public int[][][] field427 = new int[2][2][4];

    @ObfuscatedName("bw.k")
    public int[] field428 = new int[2];

    @ObfuscatedName("bw.w")
    public static float[][] field434 = new float[2][8];

    @ObfuscatedName("bw.s")
    public static int[][] field433 = new int[2][8];

    @ObfuscatedName("bw.c(IIF)F")
    public float method1039(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field427[arg0][1][arg1] - this.field427[arg0][0][arg1]) * arg2 + (float) this.field427[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bw.p(F)F")
    public static float method1040(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bw.f(IIF)F")
    public float method1038(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field430[arg0][1][arg1] - this.field430[arg0][0][arg1]) * arg2 + (float) this.field430[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1040(var5);
    }

    @ObfuscatedName("bw.n(IF)I")
    public int method1041(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field428[1] - this.field428[0]) * arg1 + (float) this.field428[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field431 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field432 = (int) (Statics.field431 * 65536.0F);
        }
        if (this.field426[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1039(arg0, 0, arg1);
        field434[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1038(arg0, 0, arg1));
        field434[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field426[arg0]; var6++) {
            float var7 = this.method1039(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1038(arg0, var6, arg1));
            float var9 = var7 * var7;
            field434[arg0][var6 * 2 + 1] = field434[arg0][var6 * 2 - 1] * var9;
            field434[arg0][var6 * 2] = field434[arg0][var6 * 2 - 1] * var8 + field434[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field434[arg0][var10] += field434[arg0][var10 - 1] * var8 + field434[arg0][var10 - 2] * var9;
            }
            field434[arg0][1] += field434[arg0][0] * var8 + var9;
            field434[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field426[0] * 2; var11++) {
                field434[0][var11] *= Statics.field431;
            }
        }
        for (int var12 = 0; var12 < this.field426[arg0] * 2; var12++) {
            field433[arg0][var12] = (int) (field434[arg0][var12] * 65536.0F);
        }
        return this.field426[arg0] * 2;
    }

    @ObfuscatedName("bw.k(Lqq;Laf;)V")
    public final void method1042(class445 arg0, class41 arg1) {
        int var3 = arg0.method7196();
        this.field426[0] = var3 >> 4;
        this.field426[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field428;
            this.field428[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field428[0] = arg0.method7198();
        this.field428[1] = arg0.method7198();
        int var4 = arg0.method7196();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field426[var5]; var6++) {
                this.field430[var5][0][var6] = arg0.method7198();
                this.field427[var5][0][var6] = arg0.method7198();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field426[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field430[var7][1][var8] = this.field430[var7][0][var8];
                    this.field427[var7][1][var8] = this.field427[var7][0][var8];
                } else {
                    this.field430[var7][1][var8] = arg0.method7198();
                    this.field427[var7][1][var8] = arg0.method7198();
                }
            }
        }
        if (var4 != 0 || this.field428[1] != this.field428[0]) {
            arg1.method771(arg0);
        }
    }
}
