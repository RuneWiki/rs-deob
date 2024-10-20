package deob;

@ObfuscatedName("bz")
public class class67 {

    @ObfuscatedName("bz.m")
    public int[] field1310 = new int[2];

    @ObfuscatedName("bz.e")
    public int[][][] field1317 = new int[2][2][4];

    @ObfuscatedName("bz.o")
    public int[][][] field1313 = new int[2][2][4];

    @ObfuscatedName("bz.g")
    public int[] field1315 = new int[2];

    @ObfuscatedName("bz.l")
    public static float[][] field1314 = new float[2][8];

    @ObfuscatedName("bz.j")
    public static int[][] field1316 = new int[2][8];

    @ObfuscatedName("bz.m(IIF)F")
    public float method1334(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1313[arg0][1][arg1] - this.field1313[arg0][0][arg1]) * arg2 + (float) this.field1313[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bz.w(F)F")
    public static float method1335(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bz.e(IIF)F")
    public float method1348(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1317[arg0][1][arg1] - this.field1317[arg0][0][arg1]) * arg2 + (float) this.field1317[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1335(var5);
    }

    @ObfuscatedName("bz.o(IF)I")
    public int method1337(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1315[1] - this.field1315[0]) * arg1 + (float) this.field1315[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1319 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1318 = (int) (Statics.field1319 * 65536.0F);
        }
        if (this.field1310[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1334(arg0, 0, arg1);
        field1314[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1348(arg0, 0, arg1));
        field1314[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1310[arg0]; var6++) {
            float var7 = this.method1334(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1348(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1314[arg0][var6 * 2 + 1] = field1314[arg0][var6 * 2 - 1] * var9;
            field1314[arg0][var6 * 2] = field1314[arg0][var6 * 2 - 1] * var8 + field1314[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1314[arg0][var10] += field1314[arg0][var10 - 1] * var8 + field1314[arg0][var10 - 2] * var9;
            }
            field1314[arg0][1] += field1314[arg0][0] * var8 + var9;
            field1314[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1310[0] * 2; var11++) {
                field1314[0][var11] *= Statics.field1319;
            }
        }
        for (int var12 = 0; var12 < this.field1310[arg0] * 2; var12++) {
            field1316[arg0][var12] = (int) (field1314[arg0][var12] * 65536.0F);
        }
        return this.field1310[arg0] * 2;
    }

    @ObfuscatedName("bz.g(Ldj;Lbo;)V")
    public final void method1338(class123 arg0, class61 arg1) {
        int var3 = arg0.method2398();
        this.field1310[0] = var3 >> 4;
        this.field1310[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1315;
            this.field1315[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1315[0] = arg0.method2548();
        this.field1315[1] = arg0.method2548();
        int var4 = arg0.method2398();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1310[var5]; var6++) {
                this.field1317[var5][0][var6] = arg0.method2548();
                this.field1313[var5][0][var6] = arg0.method2548();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1310[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1317[var7][1][var8] = this.field1317[var7][0][var8];
                    this.field1313[var7][1][var8] = this.field1313[var7][0][var8];
                } else {
                    this.field1317[var7][1][var8] = arg0.method2548();
                    this.field1313[var7][1][var8] = arg0.method2548();
                }
            }
        }
        if (var4 != 0 || this.field1315[1] != this.field1315[0]) {
            arg1.method1272(arg0);
        }
    }
}
