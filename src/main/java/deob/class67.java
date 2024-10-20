package deob;

@ObfuscatedName("bc")
public class class67 {

    @ObfuscatedName("bc.x")
    public int[] field1287 = new int[2];

    @ObfuscatedName("bc.j")
    public int[][][] field1282 = new int[2][2][4];

    @ObfuscatedName("bc.z")
    public int[][][] field1283 = new int[2][2][4];

    @ObfuscatedName("bc.i")
    public int[] field1286 = new int[2];

    @ObfuscatedName("bc.b")
    public static float[][] field1284 = new float[2][8];

    @ObfuscatedName("bc.l")
    public static int[][] field1285 = new int[2][8];

    @ObfuscatedName("bc.x(IIF)F")
    public float method1295(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1283[arg0][1][arg1] - this.field1283[arg0][0][arg1]) * arg2 + (float) this.field1283[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bc.r(F)F")
    public static float method1296(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bc.j(IIF)F")
    public float method1297(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1282[arg0][1][arg1] - this.field1282[arg0][0][arg1]) * arg2 + (float) this.field1282[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1296(var5);
    }

    @ObfuscatedName("bc.z(IF)I")
    public int method1303(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1286[1] - this.field1286[0]) * arg1 + (float) this.field1286[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1280 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1288 = (int) (Statics.field1280 * 65536.0F);
        }
        if (this.field1287[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1295(arg0, 0, arg1);
        field1284[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1297(arg0, 0, arg1));
        field1284[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1287[arg0]; var6++) {
            float var7 = this.method1295(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1297(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1284[arg0][var6 * 2 + 1] = field1284[arg0][var6 * 2 - 1] * var9;
            field1284[arg0][var6 * 2] = field1284[arg0][var6 * 2 - 1] * var8 + field1284[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1284[arg0][var10] += field1284[arg0][var10 - 1] * var8 + field1284[arg0][var10 - 2] * var9;
            }
            field1284[arg0][1] += field1284[arg0][0] * var8 + var9;
            field1284[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1287[0] * 2; var11++) {
                field1284[0][var11] *= Statics.field1280;
            }
        }
        for (int var12 = 0; var12 < this.field1287[arg0] * 2; var12++) {
            field1285[arg0][var12] = (int) (field1284[arg0][var12] * 65536.0F);
        }
        return this.field1287[arg0] * 2;
    }

    @ObfuscatedName("bc.i(Ldp;Lbz;)V")
    public final void method1298(class123 arg0, class61 arg1) {
        int var3 = arg0.method2408();
        this.field1287[0] = var3 >> 4;
        this.field1287[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1286;
            this.field1286[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1286[0] = arg0.method2403();
        this.field1286[1] = arg0.method2403();
        int var4 = arg0.method2408();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1287[var5]; var6++) {
                this.field1282[var5][0][var6] = arg0.method2403();
                this.field1283[var5][0][var6] = arg0.method2403();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1287[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1282[var7][1][var8] = this.field1282[var7][0][var8];
                    this.field1283[var7][1][var8] = this.field1283[var7][0][var8];
                } else {
                    this.field1282[var7][1][var8] = arg0.method2403();
                    this.field1283[var7][1][var8] = arg0.method2403();
                }
            }
        }
        if (var4 != 0 || this.field1286[1] != this.field1286[0]) {
            arg1.method1250(arg0);
        }
    }
}
