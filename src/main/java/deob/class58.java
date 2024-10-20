package deob;

@ObfuscatedName("bk")
public class class58 {

    @ObfuscatedName("bk.v")
    public int[] field1137 = new int[2];

    @ObfuscatedName("bk.f")
    public int[][][] field1136 = new int[2][2][4];

    @ObfuscatedName("bk.j")
    public int[][][] field1143 = new int[2][2][4];

    @ObfuscatedName("bk.l")
    public int[] field1135 = new int[2];

    @ObfuscatedName("bk.g")
    public static float[][] field1139 = new float[2][8];

    @ObfuscatedName("bk.k")
    public static int[][] field1140 = new int[2][8];

    @ObfuscatedName("bk.v(IIF)F")
    public float method1100(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1143[arg0][1][arg1] - this.field1143[arg0][0][arg1]) * arg2 + (float) this.field1143[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bk.t(F)F")
    public static float method1107(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bk.f(IIF)F")
    public float method1088(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1136[arg0][1][arg1] - this.field1136[arg0][0][arg1]) * arg2 + (float) this.field1136[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1107(var5);
    }

    @ObfuscatedName("bk.j(IF)I")
    public int method1092(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1135[1] - this.field1135[0]) * arg1 + (float) this.field1135[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1141 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1142 = (int) (Statics.field1141 * 65536.0F);
        }
        if (this.field1137[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1100(arg0, 0, arg1);
        field1139[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1088(arg0, 0, arg1));
        field1139[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1137[arg0]; var6++) {
            float var7 = this.method1100(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1088(arg0, var6, arg1));
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
            for (int var11 = 0; var11 < this.field1137[0] * 2; var11++) {
                field1139[0][var11] *= Statics.field1141;
            }
        }
        for (int var12 = 0; var12 < this.field1137[arg0] * 2; var12++) {
            field1140[arg0][var12] = (int) (field1139[arg0][var12] * 65536.0F);
        }
        return this.field1137[arg0] * 2;
    }

    @ObfuscatedName("bk.l(Ldp;Lae;)V")
    public final void method1093(class110 arg0, class52 arg1) {
        int var3 = arg0.method2257();
        this.field1137[0] = var3 >> 4;
        this.field1137[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1135;
            this.field1135[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1135[0] = arg0.method2194();
        this.field1135[1] = arg0.method2194();
        int var4 = arg0.method2257();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1137[var5]; var6++) {
                this.field1136[var5][0][var6] = arg0.method2194();
                this.field1143[var5][0][var6] = arg0.method2194();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1137[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1136[var7][1][var8] = this.field1136[var7][0][var8];
                    this.field1143[var7][1][var8] = this.field1143[var7][0][var8];
                } else {
                    this.field1136[var7][1][var8] = arg0.method2194();
                    this.field1143[var7][1][var8] = arg0.method2194();
                }
            }
        }
        if (var4 != 0 || this.field1135[1] != this.field1135[0]) {
            arg1.method1035(arg0);
        }
    }
}
