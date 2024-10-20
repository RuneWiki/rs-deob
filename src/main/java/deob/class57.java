package deob;

@ObfuscatedName("bk")
public class class57 {

    @ObfuscatedName("bk.k")
    public int[] field1123 = new int[2];

    @ObfuscatedName("bk.s")
    public int[][][] field1119 = new int[2][2][4];

    @ObfuscatedName("bk.g")
    public int[][][] field1117 = new int[2][2][4];

    @ObfuscatedName("bk.h")
    public int[] field1118 = new int[2];

    @ObfuscatedName("bk.l")
    public static float[][] field1116 = new float[2][8];

    @ObfuscatedName("bk.e")
    public static int[][] field1114 = new int[2][8];

    @ObfuscatedName("bk.k(IIF)F")
    public float method1087(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1117[arg0][1][arg1] - this.field1117[arg0][0][arg1]) * arg2 + (float) this.field1117[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bk.y(F)F")
    public static float method1098(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bk.s(IIF)F")
    public float method1089(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1119[arg0][1][arg1] - this.field1119[arg0][0][arg1]) * arg2 + (float) this.field1119[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1098(var5);
    }

    @ObfuscatedName("bk.g(IF)I")
    public int method1090(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1118[1] - this.field1118[0]) * arg1 + (float) this.field1118[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1121 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1122 = (int) (Statics.field1121 * 65536.0F);
        }
        if (this.field1123[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1087(arg0, 0, arg1);
        field1116[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1089(arg0, 0, arg1));
        field1116[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1123[arg0]; var6++) {
            float var7 = this.method1087(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1089(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1116[arg0][var6 * 2 + 1] = field1116[arg0][var6 * 2 - 1] * var9;
            field1116[arg0][var6 * 2] = field1116[arg0][var6 * 2 - 1] * var8 + field1116[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1116[arg0][var10] += field1116[arg0][var10 - 1] * var8 + field1116[arg0][var10 - 2] * var9;
            }
            field1116[arg0][1] += field1116[arg0][0] * var8 + var9;
            field1116[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1123[0] * 2; var11++) {
                field1116[0][var11] *= Statics.field1121;
            }
        }
        for (int var12 = 0; var12 < this.field1123[arg0] * 2; var12++) {
            field1114[arg0][var12] = (int) (field1116[arg0][var12] * 65536.0F);
        }
        return this.field1123[arg0] * 2;
    }

    @ObfuscatedName("bk.h(Ldy;Lad;)V")
    public final void method1091(class107 arg0, class51 arg1) {
        int var3 = arg0.method2138();
        this.field1123[0] = var3 >> 4;
        this.field1123[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1118;
            this.field1118[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1118[0] = arg0.method2239();
        this.field1118[1] = arg0.method2239();
        int var4 = arg0.method2138();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1123[var5]; var6++) {
                this.field1119[var5][0][var6] = arg0.method2239();
                this.field1117[var5][0][var6] = arg0.method2239();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1123[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1119[var7][1][var8] = this.field1119[var7][0][var8];
                    this.field1117[var7][1][var8] = this.field1117[var7][0][var8];
                } else {
                    this.field1119[var7][1][var8] = arg0.method2239();
                    this.field1117[var7][1][var8] = arg0.method2239();
                }
            }
        }
        if (var4 != 0 || this.field1118[1] != this.field1118[0]) {
            arg1.method1039(arg0);
        }
    }
}
