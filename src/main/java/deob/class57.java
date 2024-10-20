package deob;

@ObfuscatedName("bt")
public class class57 {

    @ObfuscatedName("bt.t")
    public int[] field1130 = new int[2];

    @ObfuscatedName("bt.f")
    public int[][][] field1125 = new int[2][2][4];

    @ObfuscatedName("bt.e")
    public int[][][] field1126 = new int[2][2][4];

    @ObfuscatedName("bt.d")
    public int[] field1127 = new int[2];

    @ObfuscatedName("bt.n")
    public static float[][] field1128 = new float[2][8];

    @ObfuscatedName("bt.v")
    public static int[][] field1133 = new int[2][8];

    @ObfuscatedName("bt.t(IIF)F")
    public float method1057(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1126[arg0][1][arg1] - this.field1126[arg0][0][arg1]) * arg2 + (float) this.field1126[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bt.s(F)F")
    public static float method1058(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bt.f(IIF)F")
    public float method1059(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1125[arg0][1][arg1] - this.field1125[arg0][0][arg1]) * arg2 + (float) this.field1125[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1058(var5);
    }

    @ObfuscatedName("bt.e(IF)I")
    public int method1056(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1127[1] - this.field1127[0]) * arg1 + (float) this.field1127[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1124 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1131 = (int) (Statics.field1124 * 65536.0F);
        }
        if (this.field1130[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1057(arg0, 0, arg1);
        field1128[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1059(arg0, 0, arg1));
        field1128[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1130[arg0]; var6++) {
            float var7 = this.method1057(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1059(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1128[arg0][var6 * 2 + 1] = field1128[arg0][var6 * 2 - 1] * var9;
            field1128[arg0][var6 * 2] = field1128[arg0][var6 * 2 - 1] * var8 + field1128[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1128[arg0][var10] += field1128[arg0][var10 - 1] * var8 + field1128[arg0][var10 - 2] * var9;
            }
            field1128[arg0][1] += field1128[arg0][0] * var8 + var9;
            field1128[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1130[0] * 2; var11++) {
                field1128[0][var11] *= Statics.field1124;
            }
        }
        for (int var12 = 0; var12 < this.field1130[arg0] * 2; var12++) {
            field1133[arg0][var12] = (int) (field1128[arg0][var12] * 65536.0F);
        }
        return this.field1130[arg0] * 2;
    }

    @ObfuscatedName("bt.d(Ldb;Lad;)V")
    public final void method1062(class107 arg0, class51 arg1) {
        int var3 = arg0.method2101();
        this.field1130[0] = var3 >> 4;
        this.field1130[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1127;
            this.field1127[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1127[0] = arg0.method2103();
        this.field1127[1] = arg0.method2103();
        int var4 = arg0.method2101();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1130[var5]; var6++) {
                this.field1125[var5][0][var6] = arg0.method2103();
                this.field1126[var5][0][var6] = arg0.method2103();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1130[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1125[var7][1][var8] = this.field1125[var7][0][var8];
                    this.field1126[var7][1][var8] = this.field1126[var7][0][var8];
                } else {
                    this.field1125[var7][1][var8] = arg0.method2103();
                    this.field1126[var7][1][var8] = arg0.method2103();
                }
            }
        }
        if (var4 != 0 || this.field1127[1] != this.field1127[0]) {
            arg1.method999(arg0);
        }
    }
}
