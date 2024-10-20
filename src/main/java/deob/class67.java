package deob;

@ObfuscatedName("bv")
public class class67 {

    @ObfuscatedName("bv.e")
    public int[] field1317 = new int[2];

    @ObfuscatedName("bv.c")
    public int[][][] field1315 = new int[2][2][4];

    @ObfuscatedName("bv.h")
    public int[][][] field1309 = new int[2][2][4];

    @ObfuscatedName("bv.r")
    public int[] field1308 = new int[2];

    @ObfuscatedName("bv.a")
    public static float[][] field1311 = new float[2][8];

    @ObfuscatedName("bv.b")
    public static int[][] field1312 = new int[2][8];

    @ObfuscatedName("bv.e(IIF)F")
    public float method1371(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1309[arg0][1][arg1] - this.field1309[arg0][0][arg1]) * arg2 + (float) this.field1309[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bv.l(F)F")
    public static float method1354(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bv.c(IIF)F")
    public float method1355(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1315[arg0][1][arg1] - this.field1315[arg0][0][arg1]) * arg2 + (float) this.field1315[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1354(var5);
    }

    @ObfuscatedName("bv.h(IF)I")
    public int method1356(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1308[1] - this.field1308[0]) * arg1 + (float) this.field1308[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1313 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1314 = (int) (Statics.field1313 * 65536.0F);
        }
        if (this.field1317[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1371(arg0, 0, arg1);
        field1311[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1355(arg0, 0, arg1));
        field1311[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1317[arg0]; var6++) {
            float var7 = this.method1371(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1355(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1311[arg0][var6 * 2 + 1] = field1311[arg0][var6 * 2 - 1] * var9;
            field1311[arg0][var6 * 2] = field1311[arg0][var6 * 2 - 1] * var8 + field1311[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1311[arg0][var10] += field1311[arg0][var10 - 1] * var8 + field1311[arg0][var10 - 2] * var9;
            }
            field1311[arg0][1] += field1311[arg0][0] * var8 + var9;
            field1311[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1317[0] * 2; var11++) {
                field1311[0][var11] *= Statics.field1313;
            }
        }
        for (int var12 = 0; var12 < this.field1317[arg0] * 2; var12++) {
            field1312[arg0][var12] = (int) (field1311[arg0][var12] * 65536.0F);
        }
        return this.field1317[arg0] * 2;
    }

    @ObfuscatedName("bv.r(Ldd;Lbg;)V")
    public final void method1357(class123 arg0, class61 arg1) {
        int var3 = arg0.method2464();
        this.field1317[0] = var3 >> 4;
        this.field1317[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1308;
            this.field1308[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1308[0] = arg0.method2466();
        this.field1308[1] = arg0.method2466();
        int var4 = arg0.method2464();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1317[var5]; var6++) {
                this.field1315[var5][0][var6] = arg0.method2466();
                this.field1309[var5][0][var6] = arg0.method2466();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1317[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1315[var7][1][var8] = this.field1315[var7][0][var8];
                    this.field1309[var7][1][var8] = this.field1309[var7][0][var8];
                } else {
                    this.field1315[var7][1][var8] = arg0.method2466();
                    this.field1309[var7][1][var8] = arg0.method2466();
                }
            }
        }
        if (var4 != 0 || this.field1308[1] != this.field1308[0]) {
            arg1.method1297(arg0);
        }
    }
}
