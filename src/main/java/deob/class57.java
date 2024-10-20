package deob;

@ObfuscatedName("bd")
public class class57 {

    @ObfuscatedName("bd.y")
    public int[] field1122 = new int[2];

    @ObfuscatedName("bd.k")
    public int[][][] field1120 = new int[2][2][4];

    @ObfuscatedName("bd.v")
    public int[][][] field1123 = new int[2][2][4];

    @ObfuscatedName("bd.l")
    public int[] field1121 = new int[2];

    @ObfuscatedName("bd.g")
    public static float[][] field1125 = new float[2][8];

    @ObfuscatedName("bd.a")
    public static int[][] field1126 = new int[2][8];

    @ObfuscatedName("bd.y(IIF)F")
    public float method1067(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1123[arg0][1][arg1] - this.field1123[arg0][0][arg1]) * arg2 + (float) this.field1123[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bd.u(F)F")
    public static float method1074(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bd.k(IIF)F")
    public float method1077(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1120[arg0][1][arg1] - this.field1120[arg0][0][arg1]) * arg2 + (float) this.field1120[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1074(var5);
    }

    @ObfuscatedName("bd.v(IF)I")
    public int method1070(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1121[1] - this.field1121[0]) * arg1 + (float) this.field1121[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1127 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1124 = (int) (Statics.field1127 * 65536.0F);
        }
        if (this.field1122[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1067(arg0, 0, arg1);
        field1125[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1077(arg0, 0, arg1));
        field1125[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1122[arg0]; var6++) {
            float var7 = this.method1067(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1077(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1125[arg0][var6 * 2 + 1] = field1125[arg0][var6 * 2 - 1] * var9;
            field1125[arg0][var6 * 2] = field1125[arg0][var6 * 2 - 1] * var8 + field1125[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1125[arg0][var10] += field1125[arg0][var10 - 1] * var8 + field1125[arg0][var10 - 2] * var9;
            }
            field1125[arg0][1] += field1125[arg0][0] * var8 + var9;
            field1125[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1122[0] * 2; var11++) {
                field1125[0][var11] *= Statics.field1127;
            }
        }
        for (int var12 = 0; var12 < this.field1122[arg0] * 2; var12++) {
            field1126[arg0][var12] = (int) (field1125[arg0][var12] * 65536.0F);
        }
        return this.field1122[arg0] * 2;
    }

    @ObfuscatedName("bd.l(Ldo;Lan;)V")
    public final void method1071(class107 arg0, class51 arg1) {
        int var3 = arg0.method2109();
        this.field1122[0] = var3 >> 4;
        this.field1122[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1121;
            this.field1121[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1121[0] = arg0.method2111();
        this.field1121[1] = arg0.method2111();
        int var4 = arg0.method2109();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1122[var5]; var6++) {
                this.field1120[var5][0][var6] = arg0.method2111();
                this.field1123[var5][0][var6] = arg0.method2111();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1122[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1120[var7][1][var8] = this.field1120[var7][0][var8];
                    this.field1123[var7][1][var8] = this.field1123[var7][0][var8];
                } else {
                    this.field1120[var7][1][var8] = arg0.method2111();
                    this.field1123[var7][1][var8] = arg0.method2111();
                }
            }
        }
        if (var4 != 0 || this.field1121[1] != this.field1121[0]) {
            arg1.method1013(arg0);
        }
    }
}
