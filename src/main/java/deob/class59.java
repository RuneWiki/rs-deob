package deob;

@ObfuscatedName("bt")
public class class59 {

    @ObfuscatedName("bt.n")
    public int[] field1171 = new int[2];

    @ObfuscatedName("bt.i")
    public int[][][] field1168 = new int[2][2][4];

    @ObfuscatedName("bt.e")
    public int[][][] field1172 = new int[2][2][4];

    @ObfuscatedName("bt.h")
    public int[] field1169 = new int[2];

    @ObfuscatedName("bt.q")
    public static float[][] field1177 = new float[2][8];

    @ObfuscatedName("bt.l")
    public static int[][] field1176 = new int[2][8];

    @ObfuscatedName("bt.n(IIF)F")
    public float method1121(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1172[arg0][1][arg1] - this.field1172[arg0][0][arg1]) * arg2 + (float) this.field1172[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bt.w(F)F")
    public static float method1131(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bt.i(IIF)F")
    public float method1122(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1168[arg0][1][arg1] - this.field1168[arg0][0][arg1]) * arg2 + (float) this.field1168[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1131(var5);
    }

    @ObfuscatedName("bt.e(IF)I")
    public int method1126(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1169[1] - this.field1169[0]) * arg1 + (float) this.field1169[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1173 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1166 = (int) (Statics.field1173 * 65536.0F);
        }
        if (this.field1171[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1121(arg0, 0, arg1);
        field1177[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1122(arg0, 0, arg1));
        field1177[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1171[arg0]; var6++) {
            float var7 = this.method1121(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1122(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1177[arg0][var6 * 2 + 1] = field1177[arg0][var6 * 2 - 1] * var9;
            field1177[arg0][var6 * 2] = field1177[arg0][var6 * 2 - 1] * var8 + field1177[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1177[arg0][var10] += field1177[arg0][var10 - 1] * var8 + field1177[arg0][var10 - 2] * var9;
            }
            field1177[arg0][1] += field1177[arg0][0] * var8 + var9;
            field1177[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1171[0] * 2; var11++) {
                field1177[0][var11] *= Statics.field1173;
            }
        }
        for (int var12 = 0; var12 < this.field1171[arg0] * 2; var12++) {
            field1176[arg0][var12] = (int) (field1177[arg0][var12] * 65536.0F);
        }
        return this.field1171[arg0] * 2;
    }

    @ObfuscatedName("bt.h(Ldo;Lbj;)V")
    public final void method1124(class111 arg0, class53 arg1) {
        int var3 = arg0.method2155();
        this.field1171[0] = var3 >> 4;
        this.field1171[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1169;
            this.field1169[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1169[0] = arg0.method2157();
        this.field1169[1] = arg0.method2157();
        int var4 = arg0.method2155();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1171[var5]; var6++) {
                this.field1168[var5][0][var6] = arg0.method2157();
                this.field1172[var5][0][var6] = arg0.method2157();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1171[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1168[var7][1][var8] = this.field1168[var7][0][var8];
                    this.field1172[var7][1][var8] = this.field1172[var7][0][var8];
                } else {
                    this.field1168[var7][1][var8] = arg0.method2157();
                    this.field1172[var7][1][var8] = arg0.method2157();
                }
            }
        }
        if (var4 != 0 || this.field1169[1] != this.field1169[0]) {
            arg1.method1078(arg0);
        }
    }
}
