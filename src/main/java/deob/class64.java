package deob;

@ObfuscatedName("bn")
public class class64 {

    @ObfuscatedName("bn.h")
    public int[] field1249 = new int[2];

    @ObfuscatedName("bn.v")
    public int[][][] field1251 = new int[2][2][4];

    @ObfuscatedName("bn.n")
    public int[][][] field1244 = new int[2][2][4];

    @ObfuscatedName("bn.f")
    public int[] field1245 = new int[2];

    @ObfuscatedName("bn.g")
    public static float[][] field1241 = new float[2][8];

    @ObfuscatedName("bn.o")
    public static int[][] field1246 = new int[2][8];

    @ObfuscatedName("bn.h(IIF)F")
    public float method1265(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1244[arg0][1][arg1] - this.field1244[arg0][0][arg1]) * arg2 + (float) this.field1244[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bn.q(F)F")
    public static float method1275(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bn.v(IIF)F")
    public float method1270(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1251[arg0][1][arg1] - this.field1251[arg0][0][arg1]) * arg2 + (float) this.field1251[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1275(var5);
    }

    @ObfuscatedName("bn.n(IF)I")
    public int method1267(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1245[1] - this.field1245[0]) * arg1 + (float) this.field1245[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1248 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1243 = (int) (Statics.field1248 * 65536.0F);
        }
        if (this.field1249[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1265(arg0, 0, arg1);
        field1241[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1270(arg0, 0, arg1));
        field1241[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1249[arg0]; var6++) {
            float var7 = this.method1265(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1270(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1241[arg0][var6 * 2 + 1] = field1241[arg0][var6 * 2 - 1] * var9;
            field1241[arg0][var6 * 2] = field1241[arg0][var6 * 2 - 1] * var8 + field1241[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1241[arg0][var10] += field1241[arg0][var10 - 1] * var8 + field1241[arg0][var10 - 2] * var9;
            }
            field1241[arg0][1] += field1241[arg0][0] * var8 + var9;
            field1241[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1249[0] * 2; var11++) {
                field1241[0][var11] *= Statics.field1248;
            }
        }
        for (int var12 = 0; var12 < this.field1249[arg0] * 2; var12++) {
            field1246[arg0][var12] = (int) (field1241[arg0][var12] * 65536.0F);
        }
        return this.field1249[arg0] * 2;
    }

    @ObfuscatedName("bn.f(Ldm;Lbc;)V")
    public final void method1269(class119 arg0, class58 arg1) {
        int var3 = arg0.method2383();
        this.field1249[0] = var3 >> 4;
        this.field1249[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1245;
            this.field1245[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1245[0] = arg0.method2385();
        this.field1245[1] = arg0.method2385();
        int var4 = arg0.method2383();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1249[var5]; var6++) {
                this.field1251[var5][0][var6] = arg0.method2385();
                this.field1244[var5][0][var6] = arg0.method2385();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1249[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1251[var7][1][var8] = this.field1251[var7][0][var8];
                    this.field1244[var7][1][var8] = this.field1244[var7][0][var8];
                } else {
                    this.field1251[var7][1][var8] = arg0.method2385();
                    this.field1244[var7][1][var8] = arg0.method2385();
                }
            }
        }
        if (var4 != 0 || this.field1245[1] != this.field1245[0]) {
            arg1.method1202(arg0);
        }
    }
}
