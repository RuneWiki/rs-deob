package deob;

@ObfuscatedName("ax")
public class class52 {

    @ObfuscatedName("ax.n")
    public int[] field406 = new int[2];

    @ObfuscatedName("ax.m")
    public int[][][] field397 = new int[2][2][4];

    @ObfuscatedName("ax.k")
    public int[][][] field404 = new int[2][2][4];

    @ObfuscatedName("ax.o")
    public int[] field399 = new int[2];

    @ObfuscatedName("ax.g")
    public static float[][] field400 = new float[2][8];

    @ObfuscatedName("ax.z")
    public static int[][] field401 = new int[2][8];

    @ObfuscatedName("ax.n(IIF)F")
    public float method981(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field404[arg0][1][arg1] - this.field404[arg0][0][arg1]) * arg2 + (float) this.field404[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ax.c(F)F")
    public static float method983(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ax.m(IIF)F")
    public float method982(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field397[arg0][1][arg1] - this.field397[arg0][0][arg1]) * arg2 + (float) this.field397[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method983(var5);
    }

    @ObfuscatedName("ax.k(IF)I")
    public int method987(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field399[1] - this.field399[0]) * arg1 + (float) this.field399[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field402 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field395 = (int) (Statics.field402 * 65536.0F);
        }
        if (this.field406[arg0] == 0) {
            return 0;
        }
        float var5 = this.method981(arg0, 0, arg1);
        field400[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method982(arg0, 0, arg1));
        field400[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field406[arg0]; var6++) {
            float var7 = this.method981(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method982(arg0, var6, arg1));
            float var9 = var7 * var7;
            field400[arg0][var6 * 2 + 1] = field400[arg0][var6 * 2 - 1] * var9;
            field400[arg0][var6 * 2] = field400[arg0][var6 * 2 - 1] * var8 + field400[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field400[arg0][var10] += field400[arg0][var10 - 1] * var8 + field400[arg0][var10 - 2] * var9;
            }
            field400[arg0][1] += field400[arg0][0] * var8 + var9;
            field400[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field406[0] * 2; var11++) {
                field400[0][var11] *= Statics.field402;
            }
        }
        for (int var12 = 0; var12 < this.field406[arg0] * 2; var12++) {
            field401[arg0][var12] = (int) (field400[arg0][var12] * 65536.0F);
        }
        return this.field406[arg0] * 2;
    }

    @ObfuscatedName("ax.o(Lot;Lau;)V")
    public final void method984(class400 arg0, class39 arg1) {
        int var3 = arg0.method6217();
        this.field406[0] = var3 >> 4;
        this.field406[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field399;
            this.field399[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field399[0] = arg0.method6219();
        this.field399[1] = arg0.method6219();
        int var4 = arg0.method6217();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field406[var5]; var6++) {
                this.field397[var5][0][var6] = arg0.method6219();
                this.field404[var5][0][var6] = arg0.method6219();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field406[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field397[var7][1][var8] = this.field397[var7][0][var8];
                    this.field404[var7][1][var8] = this.field404[var7][0][var8];
                } else {
                    this.field397[var7][1][var8] = arg0.method6219();
                    this.field404[var7][1][var8] = arg0.method6219();
                }
            }
        }
        if (var4 != 0 || this.field399[1] != this.field399[0]) {
            arg1.method741(arg0);
        }
    }
}
