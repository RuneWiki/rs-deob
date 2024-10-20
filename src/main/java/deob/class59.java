package deob;

@ObfuscatedName("ci")
public class class59 {

    @ObfuscatedName("ci.at")
    public int[] field404 = new int[2];

    @ObfuscatedName("ci.ar")
    public int[][][] field398 = new int[2][2][4];

    @ObfuscatedName("ci.ao")
    public int[][][] field399 = new int[2][2][4];

    @ObfuscatedName("ci.ab")
    public int[] field400 = new int[2];

    @ObfuscatedName("ci.au")
    public static float[][] field401 = new float[2][8];

    @ObfuscatedName("ci.aa")
    public static int[][] field402 = new int[2][8];

    @ObfuscatedName("ci.at(IIF)F")
    public float method1075(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field399[arg0][1][arg1] - this.field399[arg0][0][arg1]) * arg2 + (float) this.field399[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ci.ah(F)F")
    public static float method1074(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ci.ar(IIF)F")
    public float method1083(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field398[arg0][1][arg1] - this.field398[arg0][0][arg1]) * arg2 + (float) this.field398[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1074(var5);
    }

    @ObfuscatedName("ci.ao(IF)I")
    public int method1076(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field400[1] - this.field400[0]) * arg1 + (float) this.field400[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field396 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field406 = (int) (Statics.field396 * 65536.0F);
        }
        if (this.field404[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1075(arg0, 0, arg1);
        field401[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1083(arg0, 0, arg1));
        field401[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field404[arg0]; var6++) {
            float var7 = this.method1075(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1083(arg0, var6, arg1));
            float var9 = var7 * var7;
            field401[arg0][var6 * 2 + 1] = field401[arg0][var6 * 2 - 1] * var9;
            field401[arg0][var6 * 2] = field401[arg0][var6 * 2 - 1] * var8 + field401[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field401[arg0][var10] += field401[arg0][var10 - 1] * var8 + field401[arg0][var10 - 2] * var9;
            }
            field401[arg0][1] += field401[arg0][0] * var8 + var9;
            field401[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field404[0] * 2; var11++) {
                field401[0][var11] *= Statics.field396;
            }
        }
        for (int var12 = 0; var12 < this.field404[arg0] * 2; var12++) {
            field402[arg0][var12] = (int) (field401[arg0][var12] * 65536.0F);
        }
        return this.field404[arg0] * 2;
    }

    @ObfuscatedName("ci.ab(Luj;Lbh;)V")
    public final void method1077(class527 arg0, class44 arg1) {
        int var3 = arg0.method8410();
        this.field404[0] = var3 >> 4;
        this.field404[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field400;
            this.field400[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field400[0] = arg0.method8412();
        this.field400[1] = arg0.method8412();
        int var4 = arg0.method8410();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field404[var5]; var6++) {
                this.field398[var5][0][var6] = arg0.method8412();
                this.field399[var5][0][var6] = arg0.method8412();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field404[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field398[var7][1][var8] = this.field398[var7][0][var8];
                    this.field399[var7][1][var8] = this.field399[var7][0][var8];
                } else {
                    this.field398[var7][1][var8] = arg0.method8412();
                    this.field399[var7][1][var8] = arg0.method8412();
                }
            }
        }
        if (var4 != 0 || this.field400[1] != this.field400[0]) {
            arg1.method832(arg0);
        }
    }
}
