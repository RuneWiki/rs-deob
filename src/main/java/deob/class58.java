package deob;

@ObfuscatedName("bo")
public class class58 {

    @ObfuscatedName("bo.a")
    public int[] field433 = new int[2];

    @ObfuscatedName("bo.c")
    public int[][][] field424 = new int[2][2][4];

    @ObfuscatedName("bo.x")
    public int[][][] field425 = new int[2][2][4];

    @ObfuscatedName("bo.h")
    public int[] field426 = new int[2];

    @ObfuscatedName("bo.j")
    public static float[][] field427 = new float[2][8];

    @ObfuscatedName("bo.y")
    public static int[][] field428 = new int[2][8];

    @ObfuscatedName("bo.a(IIF)F")
    public float method1056(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field425[arg0][1][arg1] - this.field425[arg0][0][arg1]) * arg2 + (float) this.field425[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bo.f(F)F")
    public static float method1053(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bo.c(IIF)F")
    public float method1054(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field424[arg0][1][arg1] - this.field424[arg0][0][arg1]) * arg2 + (float) this.field424[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1053(var5);
    }

    @ObfuscatedName("bo.x(IF)I")
    public int method1059(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field426[1] - this.field426[0]) * arg1 + (float) this.field426[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field422 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field423 = (int) (Statics.field422 * 65536.0F);
        }
        if (this.field433[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1056(arg0, 0, arg1);
        field427[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1054(arg0, 0, arg1));
        field427[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field433[arg0]; var6++) {
            float var7 = this.method1056(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1054(arg0, var6, arg1));
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
            for (int var11 = 0; var11 < this.field433[0] * 2; var11++) {
                field427[0][var11] *= Statics.field422;
            }
        }
        for (int var12 = 0; var12 < this.field433[arg0] * 2; var12++) {
            field428[arg0][var12] = (int) (field427[arg0][var12] * 65536.0F);
        }
        return this.field433[arg0] * 2;
    }

    @ObfuscatedName("bo.h(Lqr;Lai;)V")
    public final void method1055(class464 arg0, class45 arg1) {
        int var3 = arg0.method7735();
        this.field433[0] = var3 >> 4;
        this.field433[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field426;
            this.field426[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field426[0] = arg0.method7716();
        this.field426[1] = arg0.method7716();
        int var4 = arg0.method7735();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field433[var5]; var6++) {
                this.field424[var5][0][var6] = arg0.method7716();
                this.field425[var5][0][var6] = arg0.method7716();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field433[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field424[var7][1][var8] = this.field424[var7][0][var8];
                    this.field425[var7][1][var8] = this.field425[var7][0][var8];
                } else {
                    this.field424[var7][1][var8] = arg0.method7716();
                    this.field425[var7][1][var8] = arg0.method7716();
                }
            }
        }
        if (var4 != 0 || this.field426[1] != this.field426[0]) {
            arg1.method826(arg0);
        }
    }
}
