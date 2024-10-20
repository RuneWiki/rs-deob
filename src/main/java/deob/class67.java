package deob;

@ObfuscatedName("bn")
public class class67 {

    @ObfuscatedName("bn.s")
    public int[] field1283 = new int[2];

    @ObfuscatedName("bn.t")
    public int[][][] field1279 = new int[2][2][4];

    @ObfuscatedName("bn.y")
    public int[][][] field1287 = new int[2][2][4];

    @ObfuscatedName("bn.p")
    public int[] field1282 = new int[2];

    @ObfuscatedName("bn.g")
    public static float[][] field1280 = new float[2][8];

    @ObfuscatedName("bn.m")
    public static int[][] field1284 = new int[2][8];

    @ObfuscatedName("bn.s(IIF)F")
    public float method1277(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1287[arg0][1][arg1] - this.field1287[arg0][0][arg1]) * arg2 + (float) this.field1287[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bn.z(F)F")
    public static float method1278(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bn.t(IIF)F")
    public float method1279(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1279[arg0][1][arg1] - this.field1279[arg0][0][arg1]) * arg2 + (float) this.field1279[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1278(var5);
    }

    @ObfuscatedName("bn.y(IF)I")
    public int method1280(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1282[1] - this.field1282[0]) * arg1 + (float) this.field1282[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1278 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1286 = (int) (Statics.field1278 * 65536.0F);
        }
        if (this.field1283[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1277(arg0, 0, arg1);
        field1280[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1279(arg0, 0, arg1));
        field1280[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1283[arg0]; var6++) {
            float var7 = this.method1277(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1279(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1280[arg0][var6 * 2 + 1] = field1280[arg0][var6 * 2 - 1] * var9;
            field1280[arg0][var6 * 2] = field1280[arg0][var6 * 2 - 1] * var8 + field1280[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1280[arg0][var10] += field1280[arg0][var10 - 1] * var8 + field1280[arg0][var10 - 2] * var9;
            }
            field1280[arg0][1] += field1280[arg0][0] * var8 + var9;
            field1280[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1283[0] * 2; var11++) {
                field1280[0][var11] *= Statics.field1278;
            }
        }
        for (int var12 = 0; var12 < this.field1283[arg0] * 2; var12++) {
            field1284[arg0][var12] = (int) (field1280[arg0][var12] * 65536.0F);
        }
        return this.field1283[arg0] * 2;
    }

    @ObfuscatedName("bn.p(Ldy;Lbr;)V")
    public final void method1283(class123 arg0, class61 arg1) {
        int var3 = arg0.method2363();
        this.field1283[0] = var3 >> 4;
        this.field1283[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1282;
            this.field1282[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1282[0] = arg0.method2550();
        this.field1282[1] = arg0.method2550();
        int var4 = arg0.method2363();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1283[var5]; var6++) {
                this.field1279[var5][0][var6] = arg0.method2550();
                this.field1287[var5][0][var6] = arg0.method2550();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1283[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1279[var7][1][var8] = this.field1279[var7][0][var8];
                    this.field1287[var7][1][var8] = this.field1287[var7][0][var8];
                } else {
                    this.field1279[var7][1][var8] = arg0.method2550();
                    this.field1287[var7][1][var8] = arg0.method2550();
                }
            }
        }
        if (var4 != 0 || this.field1282[1] != this.field1282[0]) {
            arg1.method1217(arg0);
        }
    }
}
