package deob;

@ObfuscatedName("bt")
public class class54 {

    @ObfuscatedName("bt.c")
    public int[] field424 = new int[2];

    @ObfuscatedName("bt.s")
    public int[][][] field422 = new int[2][2][4];

    @ObfuscatedName("bt.e")
    public int[][][] field425 = new int[2][2][4];

    @ObfuscatedName("bt.r")
    public int[] field426 = new int[2];

    @ObfuscatedName("bt.o")
    public static float[][] field427 = new float[2][8];

    @ObfuscatedName("bt.i")
    public static int[][] field432 = new int[2][8];

    @ObfuscatedName("bt.c(IIF)F")
    public float method987(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field425[arg0][1][arg1] - this.field425[arg0][0][arg1]) * arg2 + (float) this.field425[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bt.l(F)F")
    public static float method985(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bt.s(IIF)F")
    public float method983(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field422[arg0][1][arg1] - this.field422[arg0][0][arg1]) * arg2 + (float) this.field422[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method985(var5);
    }

    @ObfuscatedName("bt.e(IF)I")
    public int method984(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field426[1] - this.field426[0]) * arg1 + (float) this.field426[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field429 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field430 = (int) (Statics.field429 * 65536.0F);
        }
        if (this.field424[arg0] == 0) {
            return 0;
        }
        float var5 = this.method987(arg0, 0, arg1);
        field427[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method983(arg0, 0, arg1));
        field427[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field424[arg0]; var6++) {
            float var7 = this.method987(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method983(arg0, var6, arg1));
            float var9 = var7 * var7;
            field427[arg0][var6 * 2 + 1] = field427[arg0][var6 * 2 - 1] * var9;
            field427[arg0][var6 * 2] = field427[arg0][var6 * 2 - 1] * var8 + field427[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field427[arg0][var10] += field427[arg0][var10 - 1] * var8 + field427[arg0][var10 - 2] * var9;
            }
            field427[arg0][1] += field427[arg0][0] * var8 + var9;
            field427[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field424[0] * 2; var11++) {
                field427[0][var11] *= Statics.field429;
            }
        }
        for (int var12 = 0; var12 < this.field424[arg0] * 2; var12++) {
            field432[arg0][var12] = (int) (field427[arg0][var12] * 65536.0F);
        }
        return this.field424[arg0] * 2;
    }

    @ObfuscatedName("bt.r(Lpi;Laz;)V")
    public final void method981(class421 arg0, class41 arg1) {
        int var3 = arg0.method6686();
        this.field424[0] = var3 >> 4;
        this.field424[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field426;
            this.field426[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field426[0] = arg0.method6666();
        this.field426[1] = arg0.method6666();
        int var4 = arg0.method6686();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field424[var5]; var6++) {
                this.field422[var5][0][var6] = arg0.method6666();
                this.field425[var5][0][var6] = arg0.method6666();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field424[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field422[var7][1][var8] = this.field422[var7][0][var8];
                    this.field425[var7][1][var8] = this.field425[var7][0][var8];
                } else {
                    this.field422[var7][1][var8] = arg0.method6666();
                    this.field425[var7][1][var8] = arg0.method6666();
                }
            }
        }
        if (var4 != 0 || this.field426[1] != this.field426[0]) {
            arg1.method748(arg0);
        }
    }
}
