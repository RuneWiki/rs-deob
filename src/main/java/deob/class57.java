package deob;

@ObfuscatedName("bf")
public class class57 {

    @ObfuscatedName("bf.e")
    public int[] field1132 = new int[2];

    @ObfuscatedName("bf.i")
    public int[][][] field1130 = new int[2][2][4];

    @ObfuscatedName("bf.g")
    public int[][][] field1135 = new int[2][2][4];

    @ObfuscatedName("bf.x")
    public int[] field1133 = new int[2];

    @ObfuscatedName("bf.b")
    public static float[][] field1134 = new float[2][8];

    @ObfuscatedName("bf.q")
    public static int[][] field1140 = new int[2][8];

    @ObfuscatedName("bf.e(IIF)F")
    public float method1066(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1135[arg0][1][arg1] - this.field1135[arg0][0][arg1]) * arg2 + (float) this.field1135[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bf.v(F)F")
    public static float method1074(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bf.i(IIF)F")
    public float method1068(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1130[arg0][1][arg1] - this.field1130[arg0][0][arg1]) * arg2 + (float) this.field1130[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1074(var5);
    }

    @ObfuscatedName("bf.g(IF)I")
    public int method1069(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1133[1] - this.field1133[0]) * arg1 + (float) this.field1133[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1131 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1137 = (int) (Statics.field1131 * 65536.0F);
        }
        if (this.field1132[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1066(arg0, 0, arg1);
        field1134[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1068(arg0, 0, arg1));
        field1134[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1132[arg0]; var6++) {
            float var7 = this.method1066(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1068(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1134[arg0][var6 * 2 + 1] = field1134[arg0][var6 * 2 - 1] * var9;
            field1134[arg0][var6 * 2] = field1134[arg0][var6 * 2 - 1] * var8 + field1134[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1134[arg0][var10] += field1134[arg0][var10 - 1] * var8 + field1134[arg0][var10 - 2] * var9;
            }
            field1134[arg0][1] += field1134[arg0][0] * var8 + var9;
            field1134[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1132[0] * 2; var11++) {
                field1134[0][var11] *= Statics.field1131;
            }
        }
        for (int var12 = 0; var12 < this.field1132[arg0] * 2; var12++) {
            field1140[arg0][var12] = (int) (field1134[arg0][var12] * 65536.0F);
        }
        return this.field1132[arg0] * 2;
    }

    @ObfuscatedName("bf.x(Ldk;Laa;)V")
    public final void method1070(class107 arg0, class51 arg1) {
        int var3 = arg0.method2226();
        this.field1132[0] = var3 >> 4;
        this.field1132[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1133;
            this.field1133[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1133[0] = arg0.method2152();
        this.field1133[1] = arg0.method2152();
        int var4 = arg0.method2226();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1132[var5]; var6++) {
                this.field1130[var5][0][var6] = arg0.method2152();
                this.field1135[var5][0][var6] = arg0.method2152();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1132[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1130[var7][1][var8] = this.field1130[var7][0][var8];
                    this.field1135[var7][1][var8] = this.field1135[var7][0][var8];
                } else {
                    this.field1130[var7][1][var8] = arg0.method2152();
                    this.field1135[var7][1][var8] = arg0.method2152();
                }
            }
        }
        if (var4 != 0 || this.field1133[1] != this.field1133[0]) {
            arg1.method1004(arg0);
        }
    }
}
