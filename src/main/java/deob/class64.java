package deob;

@ObfuscatedName("bp")
public class class64 {

    @ObfuscatedName("bp.i")
    public int[] field1246 = new int[2];

    @ObfuscatedName("bp.a")
    public int[][][] field1245 = new int[2][2][4];

    @ObfuscatedName("bp.l")
    public int[][][] field1251 = new int[2][2][4];

    @ObfuscatedName("bp.q")
    public int[] field1247 = new int[2];

    @ObfuscatedName("bp.b")
    public static float[][] field1248 = new float[2][8];

    @ObfuscatedName("bp.u")
    public static int[][] field1249 = new int[2][8];

    @ObfuscatedName("bp.i(IIF)F")
    public float method1273(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1251[arg0][1][arg1] - this.field1251[arg0][0][arg1]) * arg2 + (float) this.field1251[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bp.p(F)F")
    public static float method1274(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bp.a(IIF)F")
    public float method1275(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1245[arg0][1][arg1] - this.field1245[arg0][0][arg1]) * arg2 + (float) this.field1245[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1274(var5);
    }

    @ObfuscatedName("bp.l(IF)I")
    public int method1276(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1247[1] - this.field1247[0]) * arg1 + (float) this.field1247[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1250 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1243 = (int) (Statics.field1250 * 65536.0F);
        }
        if (this.field1246[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1273(arg0, 0, arg1);
        field1248[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1275(arg0, 0, arg1));
        field1248[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1246[arg0]; var6++) {
            float var7 = this.method1273(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1275(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1248[arg0][var6 * 2 + 1] = field1248[arg0][var6 * 2 - 1] * var9;
            field1248[arg0][var6 * 2] = field1248[arg0][var6 * 2 - 1] * var8 + field1248[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1248[arg0][var10] += field1248[arg0][var10 - 1] * var8 + field1248[arg0][var10 - 2] * var9;
            }
            field1248[arg0][1] += field1248[arg0][0] * var8 + var9;
            field1248[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1246[0] * 2; var11++) {
                field1248[0][var11] *= Statics.field1250;
            }
        }
        for (int var12 = 0; var12 < this.field1246[arg0] * 2; var12++) {
            field1249[arg0][var12] = (int) (field1248[arg0][var12] * 65536.0F);
        }
        return this.field1246[arg0] * 2;
    }

    @ObfuscatedName("bp.q(Ldn;Lbf;)V")
    public final void method1278(class127 arg0, class56 arg1) {
        int var3 = arg0.method2411();
        this.field1246[0] = var3 >> 4;
        this.field1246[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1247;
            this.field1247[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1247[0] = arg0.method2413();
        this.field1247[1] = arg0.method2413();
        int var4 = arg0.method2411();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1246[var5]; var6++) {
                this.field1245[var5][0][var6] = arg0.method2413();
                this.field1251[var5][0][var6] = arg0.method2413();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1246[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1245[var7][1][var8] = this.field1245[var7][0][var8];
                    this.field1251[var7][1][var8] = this.field1251[var7][0][var8];
                } else {
                    this.field1245[var7][1][var8] = arg0.method2413();
                    this.field1251[var7][1][var8] = arg0.method2413();
                }
            }
        }
        if (var4 != 0 || this.field1247[1] != this.field1247[0]) {
            arg1.method1198(arg0);
        }
    }
}
