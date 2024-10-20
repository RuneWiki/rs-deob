package deob;

@ObfuscatedName("bt")
public class class64 {

    @ObfuscatedName("bt.y")
    public int[] field1232 = new int[2];

    @ObfuscatedName("bt.d")
    public int[][][] field1233 = new int[2][2][4];

    @ObfuscatedName("bt.k")
    public int[][][] field1242 = new int[2][2][4];

    @ObfuscatedName("bt.n")
    public int[] field1235 = new int[2];

    @ObfuscatedName("bt.s")
    public static float[][] field1239 = new float[2][8];

    @ObfuscatedName("bt.x")
    public static int[][] field1231 = new int[2][8];

    @ObfuscatedName("bt.y(IIF)F")
    public float method1329(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1242[arg0][1][arg1] - this.field1242[arg0][0][arg1]) * arg2 + (float) this.field1242[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bt.m(F)F")
    public static float method1335(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bt.d(IIF)F")
    public float method1330(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1233[arg0][1][arg1] - this.field1233[arg0][0][arg1]) * arg2 + (float) this.field1233[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1335(var5);
    }

    @ObfuscatedName("bt.k(IF)I")
    public int method1331(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1235[1] - this.field1235[0]) * arg1 + (float) this.field1235[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1238 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1237 = (int) (Statics.field1238 * 65536.0F);
        }
        if (this.field1232[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1329(arg0, 0, arg1);
        field1239[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1330(arg0, 0, arg1));
        field1239[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1232[arg0]; var6++) {
            float var7 = this.method1329(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1330(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1239[arg0][var6 * 2 + 1] = field1239[arg0][var6 * 2 - 1] * var9;
            field1239[arg0][var6 * 2] = field1239[arg0][var6 * 2 - 1] * var8 + field1239[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1239[arg0][var10] += field1239[arg0][var10 - 1] * var8 + field1239[arg0][var10 - 2] * var9;
            }
            field1239[arg0][1] += field1239[arg0][0] * var8 + var9;
            field1239[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1232[0] * 2; var11++) {
                field1239[0][var11] *= Statics.field1238;
            }
        }
        for (int var12 = 0; var12 < this.field1232[arg0] * 2; var12++) {
            field1231[arg0][var12] = (int) (field1239[arg0][var12] * 65536.0F);
        }
        return this.field1232[arg0] * 2;
    }

    @ObfuscatedName("bt.n(Ldp;Lbl;)V")
    public final void method1332(class127 arg0, class56 arg1) {
        int var3 = arg0.method2534();
        this.field1232[0] = var3 >> 4;
        this.field1232[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1235;
            this.field1235[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1235[0] = arg0.method2460();
        this.field1235[1] = arg0.method2460();
        int var4 = arg0.method2534();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1232[var5]; var6++) {
                this.field1233[var5][0][var6] = arg0.method2460();
                this.field1242[var5][0][var6] = arg0.method2460();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1232[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1233[var7][1][var8] = this.field1233[var7][0][var8];
                    this.field1242[var7][1][var8] = this.field1242[var7][0][var8];
                } else {
                    this.field1233[var7][1][var8] = arg0.method2460();
                    this.field1242[var7][1][var8] = arg0.method2460();
                }
            }
        }
        if (var4 != 0 || this.field1235[1] != this.field1235[0]) {
            arg1.method1247(arg0);
        }
    }
}
