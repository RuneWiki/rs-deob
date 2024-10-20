package deob;

@ObfuscatedName("bc")
public class class65 {

    @ObfuscatedName("bc.i")
    public int[] field1253 = new int[2];

    @ObfuscatedName("bc.r")
    public int[][][] field1248 = new int[2][2][4];

    @ObfuscatedName("bc.l")
    public int[][][] field1249 = new int[2][2][4];

    @ObfuscatedName("bc.s")
    public int[] field1250 = new int[2];

    @ObfuscatedName("bc.d")
    public static float[][] field1256 = new float[2][8];

    @ObfuscatedName("bc.e")
    public static int[][] field1246 = new int[2][8];

    @ObfuscatedName("bc.i(IIF)F")
    public float method1320(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1249[arg0][1][arg1] - this.field1249[arg0][0][arg1]) * arg2 + (float) this.field1249[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bc.b(F)F")
    public static float method1318(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bc.r(IIF)F")
    public float method1328(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1248[arg0][1][arg1] - this.field1248[arg0][0][arg1]) * arg2 + (float) this.field1248[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1318(var5);
    }

    @ObfuscatedName("bc.l(IF)I")
    public int method1326(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1250[1] - this.field1250[0]) * arg1 + (float) this.field1250[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1252 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1254 = (int) (Statics.field1252 * 65536.0F);
        }
        if (this.field1253[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1320(arg0, 0, arg1);
        field1256[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1328(arg0, 0, arg1));
        field1256[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1253[arg0]; var6++) {
            float var7 = this.method1320(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1328(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1256[arg0][var6 * 2 + 1] = field1256[arg0][var6 * 2 - 1] * var9;
            field1256[arg0][var6 * 2] = field1256[arg0][var6 * 2 - 1] * var8 + field1256[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1256[arg0][var10] += field1256[arg0][var10 - 1] * var8 + field1256[arg0][var10 - 2] * var9;
            }
            field1256[arg0][1] += field1256[arg0][0] * var8 + var9;
            field1256[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1253[0] * 2; var11++) {
                field1256[0][var11] *= Statics.field1252;
            }
        }
        for (int var12 = 0; var12 < this.field1253[arg0] * 2; var12++) {
            field1246[arg0][var12] = (int) (field1256[arg0][var12] * 65536.0F);
        }
        return this.field1253[arg0] * 2;
    }

    @ObfuscatedName("bc.s(Lds;Lby;)V")
    public final void method1322(class128 arg0, class57 arg1) {
        int var3 = arg0.method2531();
        this.field1253[0] = var3 >> 4;
        this.field1253[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1250;
            this.field1250[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1250[0] = arg0.method2473();
        this.field1250[1] = arg0.method2473();
        int var4 = arg0.method2531();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1253[var5]; var6++) {
                this.field1248[var5][0][var6] = arg0.method2473();
                this.field1249[var5][0][var6] = arg0.method2473();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1253[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1248[var7][1][var8] = this.field1248[var7][0][var8];
                    this.field1249[var7][1][var8] = this.field1249[var7][0][var8];
                } else {
                    this.field1248[var7][1][var8] = arg0.method2473();
                    this.field1249[var7][1][var8] = arg0.method2473();
                }
            }
        }
        if (var4 != 0 || this.field1250[1] != this.field1250[0]) {
            arg1.method1235(arg0);
        }
    }
}
