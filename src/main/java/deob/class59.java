package deob;

@ObfuscatedName("bh")
public class class59 {

    @ObfuscatedName("bh.y")
    public int[] field1175 = new int[2];

    @ObfuscatedName("bh.g")
    public int[][][] field1167 = new int[2][2][4];

    @ObfuscatedName("bh.n")
    public int[][][] field1168 = new int[2][2][4];

    @ObfuscatedName("bh.t")
    public int[] field1169 = new int[2];

    @ObfuscatedName("bh.e")
    public static float[][] field1171 = new float[2][8];

    @ObfuscatedName("bh.q")
    public static int[][] field1170 = new int[2][8];

    @ObfuscatedName("bh.y(IIF)F")
    public float method1139(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1168[arg0][1][arg1] - this.field1168[arg0][0][arg1]) * arg2 + (float) this.field1168[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bh.k(F)F")
    public static float method1140(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bh.g(IIF)F")
    public float method1141(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1167[arg0][1][arg1] - this.field1167[arg0][0][arg1]) * arg2 + (float) this.field1167[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1140(var5);
    }

    @ObfuscatedName("bh.n(IF)I")
    public int method1142(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1169[1] - this.field1169[0]) * arg1 + (float) this.field1169[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1172 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1173 = (int) (Statics.field1172 * 65536.0F);
        }
        if (this.field1175[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1139(arg0, 0, arg1);
        field1171[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1141(arg0, 0, arg1));
        field1171[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1175[arg0]; var6++) {
            float var7 = this.method1139(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1141(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1171[arg0][var6 * 2 + 1] = field1171[arg0][var6 * 2 - 1] * var9;
            field1171[arg0][var6 * 2] = field1171[arg0][var6 * 2 - 1] * var8 + field1171[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1171[arg0][var10] += field1171[arg0][var10 - 1] * var8 + field1171[arg0][var10 - 2] * var9;
            }
            field1171[arg0][1] += field1171[arg0][0] * var8 + var9;
            field1171[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1175[0] * 2; var11++) {
                field1171[0][var11] *= Statics.field1172;
            }
        }
        for (int var12 = 0; var12 < this.field1175[arg0] * 2; var12++) {
            field1170[arg0][var12] = (int) (field1171[arg0][var12] * 65536.0F);
        }
        return this.field1175[arg0] * 2;
    }

    @ObfuscatedName("bh.t(Ldw;Lbt;)V")
    public final void method1144(class111 arg0, class53 arg1) {
        int var3 = arg0.method2205();
        this.field1175[0] = var3 >> 4;
        this.field1175[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1169;
            this.field1169[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1169[0] = arg0.method2339();
        this.field1169[1] = arg0.method2339();
        int var4 = arg0.method2205();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1175[var5]; var6++) {
                this.field1167[var5][0][var6] = arg0.method2339();
                this.field1168[var5][0][var6] = arg0.method2339();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1175[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1167[var7][1][var8] = this.field1167[var7][0][var8];
                    this.field1168[var7][1][var8] = this.field1168[var7][0][var8];
                } else {
                    this.field1167[var7][1][var8] = arg0.method2339();
                    this.field1168[var7][1][var8] = arg0.method2339();
                }
            }
        }
        if (var4 != 0 || this.field1169[1] != this.field1169[0]) {
            arg1.method1085(arg0);
        }
    }
}
