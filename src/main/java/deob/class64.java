package deob;

@ObfuscatedName("bo")
public class class64 {

    @ObfuscatedName("bo.t")
    public int[] field1278 = new int[2];

    @ObfuscatedName("bo.c")
    public int[][][] field1277 = new int[2][2][4];

    @ObfuscatedName("bo.d")
    public int[][][] field1281 = new int[2][2][4];

    @ObfuscatedName("bo.b")
    public int[] field1279 = new int[2];

    @ObfuscatedName("bo.i")
    public static float[][] field1280 = new float[2][8];

    @ObfuscatedName("bo.p")
    public static int[][] field1276 = new int[2][8];

    @ObfuscatedName("bo.t(IIF)F")
    public float method1355(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1281[arg0][1][arg1] - this.field1281[arg0][0][arg1]) * arg2 + (float) this.field1281[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bo.l(F)F")
    public static float method1341(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bo.c(IIF)F")
    public float method1349(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1277[arg0][1][arg1] - this.field1277[arg0][0][arg1]) * arg2 + (float) this.field1277[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1341(var5);
    }

    @ObfuscatedName("bo.d(IF)I")
    public int method1343(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1279[1] - this.field1279[0]) * arg1 + (float) this.field1279[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1282 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1283 = (int) (Statics.field1282 * 65536.0F);
        }
        if (this.field1278[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1355(arg0, 0, arg1);
        field1280[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1349(arg0, 0, arg1));
        field1280[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1278[arg0]; var6++) {
            float var7 = this.method1355(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1349(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1280[arg0][var6 * 2 + 1] = field1280[arg0][var6 * 2 - 1] * var9;
            field1280[arg0][var6 * 2] = field1280[arg0][var6 * 2 - 1] * var8 + field1280[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1280[arg0][var10] += field1280[arg0][var10 - 1] * var8 + field1280[arg0][var10 - 2] * var9;
            }
            field1280[arg0][1] += field1280[arg0][0] * var8 + var9;
            field1280[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1278[0] * 2; var11++) {
                field1280[0][var11] *= Statics.field1282;
            }
        }
        for (int var12 = 0; var12 < this.field1278[arg0] * 2; var12++) {
            field1276[arg0][var12] = (int) (field1280[arg0][var12] * 65536.0F);
        }
        return this.field1278[arg0] * 2;
    }

    @ObfuscatedName("bo.b(Ldo;Lbk;)V")
    public final void method1344(class127 arg0, class56 arg1) {
        int var3 = arg0.method2438();
        this.field1278[0] = var3 >> 4;
        this.field1278[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1279;
            this.field1279[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1279[0] = arg0.method2440();
        this.field1279[1] = arg0.method2440();
        int var4 = arg0.method2438();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1278[var5]; var6++) {
                this.field1277[var5][0][var6] = arg0.method2440();
                this.field1281[var5][0][var6] = arg0.method2440();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1278[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1277[var7][1][var8] = this.field1277[var7][0][var8];
                    this.field1281[var7][1][var8] = this.field1281[var7][0][var8];
                } else {
                    this.field1277[var7][1][var8] = arg0.method2440();
                    this.field1281[var7][1][var8] = arg0.method2440();
                }
            }
        }
        if (var4 != 0 || this.field1279[1] != this.field1279[0]) {
            arg1.method1258(arg0);
        }
    }
}
