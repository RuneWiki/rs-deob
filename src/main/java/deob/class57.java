package deob;

@ObfuscatedName("bn")
public class class57 {

    @ObfuscatedName("bn.k")
    public int[] field1141 = new int[2];

    @ObfuscatedName("bn.e")
    public int[][][] field1135 = new int[2][2][4];

    @ObfuscatedName("bn.i")
    public int[][][] field1138 = new int[2][2][4];

    @ObfuscatedName("bn.t")
    public int[] field1136 = new int[2];

    @ObfuscatedName("bn.z")
    public static float[][] field1139 = new float[2][8];

    @ObfuscatedName("bn.g")
    public static int[][] field1133 = new int[2][8];

    @ObfuscatedName("bn.k(IIF)F")
    public float method1075(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1138[arg0][1][arg1] - this.field1138[arg0][0][arg1]) * arg2 + (float) this.field1138[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bn.b(F)F")
    public static float method1082(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bn.e(IIF)F")
    public float method1077(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1135[arg0][1][arg1] - this.field1135[arg0][0][arg1]) * arg2 + (float) this.field1135[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1082(var5);
    }

    @ObfuscatedName("bn.i(IF)I")
    public int method1078(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1136[1] - this.field1136[0]) * arg1 + (float) this.field1136[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1140 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1137 = (int) (Statics.field1140 * 65536.0F);
        }
        if (this.field1141[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1075(arg0, 0, arg1);
        field1139[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1077(arg0, 0, arg1));
        field1139[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1141[arg0]; var6++) {
            float var7 = this.method1075(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1077(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1139[arg0][var6 * 2 + 1] = field1139[arg0][var6 * 2 - 1] * var9;
            field1139[arg0][var6 * 2] = field1139[arg0][var6 * 2 - 1] * var8 + field1139[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1139[arg0][var10] += field1139[arg0][var10 - 1] * var8 + field1139[arg0][var10 - 2] * var9;
            }
            field1139[arg0][1] += field1139[arg0][0] * var8 + var9;
            field1139[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1141[0] * 2; var11++) {
                field1139[0][var11] *= Statics.field1140;
            }
        }
        for (int var12 = 0; var12 < this.field1141[arg0] * 2; var12++) {
            field1133[arg0][var12] = (int) (field1139[arg0][var12] * 65536.0F);
        }
        return this.field1141[arg0] * 2;
    }

    @ObfuscatedName("bn.t(Ldi;Laf;)V")
    public final void method1079(class107 arg0, class51 arg1) {
        int var3 = arg0.method2115();
        this.field1141[0] = var3 >> 4;
        this.field1141[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1136;
            this.field1136[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1136[0] = arg0.method2117();
        this.field1136[1] = arg0.method2117();
        int var4 = arg0.method2115();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1141[var5]; var6++) {
                this.field1135[var5][0][var6] = arg0.method2117();
                this.field1138[var5][0][var6] = arg0.method2117();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1141[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1135[var7][1][var8] = this.field1135[var7][0][var8];
                    this.field1138[var7][1][var8] = this.field1138[var7][0][var8];
                } else {
                    this.field1135[var7][1][var8] = arg0.method2117();
                    this.field1138[var7][1][var8] = arg0.method2117();
                }
            }
        }
        if (var4 != 0 || this.field1136[1] != this.field1136[0]) {
            arg1.method1030(arg0);
        }
    }
}
