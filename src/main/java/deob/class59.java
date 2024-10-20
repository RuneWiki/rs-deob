package deob;

@ObfuscatedName("bs")
public class class59 {

    @ObfuscatedName("bs.q")
    public int[] field1146 = new int[2];

    @ObfuscatedName("bs.h")
    public int[][][] field1139 = new int[2][2][4];

    @ObfuscatedName("bs.e")
    public int[][][] field1138 = new int[2][2][4];

    @ObfuscatedName("bs.n")
    public int[] field1140 = new int[2];

    @ObfuscatedName("bs.t")
    public static float[][] field1141 = new float[2][8];

    @ObfuscatedName("bs.l")
    public static int[][] field1142 = new int[2][8];

    @ObfuscatedName("bs.q(IIF)F")
    public float method1093(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1138[arg0][1][arg1] - this.field1138[arg0][0][arg1]) * arg2 + (float) this.field1138[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bs.s(F)F")
    public static float method1086(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bs.h(IIF)F")
    public float method1087(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1139[arg0][1][arg1] - this.field1139[arg0][0][arg1]) * arg2 + (float) this.field1139[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1086(var5);
    }

    @ObfuscatedName("bs.e(IF)I")
    public int method1088(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1140[1] - this.field1140[0]) * arg1 + (float) this.field1140[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1143 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1144 = (int) (Statics.field1143 * 65536.0F);
        }
        if (this.field1146[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1093(arg0, 0, arg1);
        field1141[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1087(arg0, 0, arg1));
        field1141[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1146[arg0]; var6++) {
            float var7 = this.method1093(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1087(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1141[arg0][var6 * 2 + 1] = field1141[arg0][var6 * 2 - 1] * var9;
            field1141[arg0][var6 * 2] = field1141[arg0][var6 * 2 - 1] * var8 + field1141[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1141[arg0][var10] += field1141[arg0][var10 - 1] * var8 + field1141[arg0][var10 - 2] * var9;
            }
            field1141[arg0][1] += field1141[arg0][0] * var8 + var9;
            field1141[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1146[0] * 2; var11++) {
                field1141[0][var11] *= Statics.field1143;
            }
        }
        for (int var12 = 0; var12 < this.field1146[arg0] * 2; var12++) {
            field1142[arg0][var12] = (int) (field1141[arg0][var12] * 65536.0F);
        }
        return this.field1146[arg0] * 2;
    }

    @ObfuscatedName("bs.n(Ldx;Lbu;)V")
    public final void method1101(class111 arg0, class53 arg1) {
        int var3 = arg0.method2231();
        this.field1146[0] = var3 >> 4;
        this.field1146[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1140;
            this.field1140[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1140[0] = arg0.method2307();
        this.field1140[1] = arg0.method2307();
        int var4 = arg0.method2231();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1146[var5]; var6++) {
                this.field1139[var5][0][var6] = arg0.method2307();
                this.field1138[var5][0][var6] = arg0.method2307();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1146[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1139[var7][1][var8] = this.field1139[var7][0][var8];
                    this.field1138[var7][1][var8] = this.field1138[var7][0][var8];
                } else {
                    this.field1139[var7][1][var8] = arg0.method2307();
                    this.field1138[var7][1][var8] = arg0.method2307();
                }
            }
        }
        if (var4 != 0 || this.field1140[1] != this.field1140[0]) {
            arg1.method1032(arg0);
        }
    }
}
