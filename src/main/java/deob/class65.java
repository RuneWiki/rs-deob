package deob;

@ObfuscatedName("bx")
public class class65 {

    @ObfuscatedName("bx.e")
    public int[] field1259 = new int[2];

    @ObfuscatedName("bx.k")
    public int[][][] field1258 = new int[2][2][4];

    @ObfuscatedName("bx.q")
    public int[][][] field1260 = new int[2][2][4];

    @ObfuscatedName("bx.j")
    public int[] field1261 = new int[2];

    @ObfuscatedName("bx.z")
    public static float[][] field1262 = new float[2][8];

    @ObfuscatedName("bx.m")
    public static int[][] field1263 = new int[2][8];

    @ObfuscatedName("bx.e(IIF)F")
    public float method1396(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1260[arg0][1][arg1] - this.field1260[arg0][0][arg1]) * arg2 + (float) this.field1260[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bx.i(F)F")
    public static float method1379(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bx.k(IIF)F")
    public float method1380(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1258[arg0][1][arg1] - this.field1258[arg0][0][arg1]) * arg2 + (float) this.field1258[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1379(var5);
    }

    @ObfuscatedName("bx.q(IF)I")
    public int method1381(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1261[1] - this.field1261[0]) * arg1 + (float) this.field1261[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1257 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1265 = (int) (Statics.field1257 * 65536.0F);
        }
        if (this.field1259[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1396(arg0, 0, arg1);
        field1262[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1380(arg0, 0, arg1));
        field1262[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1259[arg0]; var6++) {
            float var7 = this.method1396(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1380(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1262[arg0][var6 * 2 + 1] = field1262[arg0][var6 * 2 - 1] * var9;
            field1262[arg0][var6 * 2] = field1262[arg0][var6 * 2 - 1] * var8 + field1262[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1262[arg0][var10] += field1262[arg0][var10 - 1] * var8 + field1262[arg0][var10 - 2] * var9;
            }
            field1262[arg0][1] += field1262[arg0][0] * var8 + var9;
            field1262[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1259[0] * 2; var11++) {
                field1262[0][var11] *= Statics.field1257;
            }
        }
        for (int var12 = 0; var12 < this.field1259[arg0] * 2; var12++) {
            field1263[arg0][var12] = (int) (field1262[arg0][var12] * 65536.0F);
        }
        return this.field1259[arg0] * 2;
    }

    @ObfuscatedName("bx.j(Ldl;Lbl;)V")
    public final void method1382(class128 arg0, class57 arg1) {
        int var3 = arg0.method2548();
        this.field1259[0] = var3 >> 4;
        this.field1259[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1261;
            this.field1261[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1261[0] = arg0.method2456();
        this.field1261[1] = arg0.method2456();
        int var4 = arg0.method2548();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1259[var5]; var6++) {
                this.field1258[var5][0][var6] = arg0.method2456();
                this.field1260[var5][0][var6] = arg0.method2456();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1259[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1258[var7][1][var8] = this.field1258[var7][0][var8];
                    this.field1260[var7][1][var8] = this.field1260[var7][0][var8];
                } else {
                    this.field1258[var7][1][var8] = arg0.method2456();
                    this.field1260[var7][1][var8] = arg0.method2456();
                }
            }
        }
        if (var4 != 0 || this.field1261[1] != this.field1261[0]) {
            arg1.method1292(arg0);
        }
    }
}
