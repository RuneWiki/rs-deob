package deob;

@ObfuscatedName("bd")
public class class64 {

    @ObfuscatedName("bd.a")
    public int[] field1253 = new int[2];

    @ObfuscatedName("bd.d")
    public int[][][] field1246 = new int[2][2][4];

    @ObfuscatedName("bd.c")
    public int[][][] field1249 = new int[2][2][4];

    @ObfuscatedName("bd.y")
    public int[] field1248 = new int[2];

    @ObfuscatedName("bd.k")
    public static float[][] field1247 = new float[2][8];

    @ObfuscatedName("bd.r")
    public static int[][] field1250 = new int[2][8];

    @ObfuscatedName("bd.a(IIF)F")
    public float method1334(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1249[arg0][1][arg1] - this.field1249[arg0][0][arg1]) * arg2 + (float) this.field1249[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bd.w(F)F")
    public static float method1349(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bd.d(IIF)F")
    public float method1336(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1246[arg0][1][arg1] - this.field1246[arg0][0][arg1]) * arg2 + (float) this.field1246[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1349(var5);
    }

    @ObfuscatedName("bd.c(IF)I")
    public int method1335(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1248[1] - this.field1248[0]) * arg1 + (float) this.field1248[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1251 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1252 = (int) (Statics.field1251 * 65536.0F);
        }
        if (this.field1253[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1334(arg0, 0, arg1);
        field1247[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1336(arg0, 0, arg1));
        field1247[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1253[arg0]; var6++) {
            float var7 = this.method1334(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1336(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1247[arg0][var6 * 2 + 1] = field1247[arg0][var6 * 2 - 1] * var9;
            field1247[arg0][var6 * 2] = field1247[arg0][var6 * 2 - 1] * var8 + field1247[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1247[arg0][var10] += field1247[arg0][var10 - 1] * var8 + field1247[arg0][var10 - 2] * var9;
            }
            field1247[arg0][1] += field1247[arg0][0] * var8 + var9;
            field1247[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1253[0] * 2; var11++) {
                field1247[0][var11] *= Statics.field1251;
            }
        }
        for (int var12 = 0; var12 < this.field1253[arg0] * 2; var12++) {
            field1250[arg0][var12] = (int) (field1247[arg0][var12] * 65536.0F);
        }
        return this.field1253[arg0] * 2;
    }

    @ObfuscatedName("bd.y(Ldx;Lbk;)V")
    public final void method1337(class120 arg0, class58 arg1) {
        int var3 = arg0.method2462();
        this.field1253[0] = var3 >> 4;
        this.field1253[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1248;
            this.field1248[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1248[0] = arg0.method2464();
        this.field1248[1] = arg0.method2464();
        int var4 = arg0.method2462();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1253[var5]; var6++) {
                this.field1246[var5][0][var6] = arg0.method2464();
                this.field1249[var5][0][var6] = arg0.method2464();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1253[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1246[var7][1][var8] = this.field1246[var7][0][var8];
                    this.field1249[var7][1][var8] = this.field1249[var7][0][var8];
                } else {
                    this.field1246[var7][1][var8] = arg0.method2464();
                    this.field1249[var7][1][var8] = arg0.method2464();
                }
            }
        }
        if (var4 != 0 || this.field1248[1] != this.field1248[0]) {
            arg1.method1286(arg0);
        }
    }
}
