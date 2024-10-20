package deob;

@ObfuscatedName("bn")
public class class64 {

    @ObfuscatedName("bn.a")
    public int[] field1239 = new int[2];

    @ObfuscatedName("bn.f")
    public int[][][] field1241 = new int[2][2][4];

    @ObfuscatedName("bn.s")
    public int[][][] field1240 = new int[2][2][4];

    @ObfuscatedName("bn.y")
    public int[] field1236 = new int[2];

    @ObfuscatedName("bn.e")
    public static float[][] field1238 = new float[2][8];

    @ObfuscatedName("bn.g")
    public static int[][] field1242 = new int[2][8];

    @ObfuscatedName("bn.a(IIF)F")
    public float method1259(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1240[arg0][1][arg1] - this.field1240[arg0][0][arg1]) * arg2 + (float) this.field1240[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bn.r(F)F")
    public static float method1263(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bn.f(IIF)F")
    public float method1261(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1241[arg0][1][arg1] - this.field1241[arg0][0][arg1]) * arg2 + (float) this.field1241[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1263(var5);
    }

    @ObfuscatedName("bn.s(IF)I")
    public int method1262(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1236[1] - this.field1236[0]) * arg1 + (float) this.field1236[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1243 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1244 = (int) (Statics.field1243 * 65536.0F);
        }
        if (this.field1239[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1259(arg0, 0, arg1);
        field1238[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1261(arg0, 0, arg1));
        field1238[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1239[arg0]; var6++) {
            float var7 = this.method1259(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1261(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1238[arg0][var6 * 2 + 1] = field1238[arg0][var6 * 2 - 1] * var9;
            field1238[arg0][var6 * 2] = field1238[arg0][var6 * 2 - 1] * var8 + field1238[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1238[arg0][var10] += field1238[arg0][var10 - 1] * var8 + field1238[arg0][var10 - 2] * var9;
            }
            field1238[arg0][1] += field1238[arg0][0] * var8 + var9;
            field1238[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1239[0] * 2; var11++) {
                field1238[0][var11] *= Statics.field1243;
            }
        }
        for (int var12 = 0; var12 < this.field1239[arg0] * 2; var12++) {
            field1242[arg0][var12] = (int) (field1238[arg0][var12] * 65536.0F);
        }
        return this.field1239[arg0] * 2;
    }

    @ObfuscatedName("bn.y(Lds;Lbv;)V")
    public final void method1271(class119 arg0, class58 arg1) {
        int var3 = arg0.method2412();
        this.field1239[0] = var3 >> 4;
        this.field1239[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1236;
            this.field1236[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1236[0] = arg0.method2347();
        this.field1236[1] = arg0.method2347();
        int var4 = arg0.method2412();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1239[var5]; var6++) {
                this.field1241[var5][0][var6] = arg0.method2347();
                this.field1240[var5][0][var6] = arg0.method2347();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1239[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1241[var7][1][var8] = this.field1241[var7][0][var8];
                    this.field1240[var7][1][var8] = this.field1240[var7][0][var8];
                } else {
                    this.field1241[var7][1][var8] = arg0.method2347();
                    this.field1240[var7][1][var8] = arg0.method2347();
                }
            }
        }
        if (var4 != 0 || this.field1236[1] != this.field1236[0]) {
            arg1.method1197(arg0);
        }
    }
}
