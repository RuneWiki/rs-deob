package deob;

@ObfuscatedName("bv")
public class class64 {

    @ObfuscatedName("bv.e")
    public int[] field1215 = new int[2];

    @ObfuscatedName("bv.f")
    public int[][][] field1219 = new int[2][2][4];

    @ObfuscatedName("bv.s")
    public int[][][] field1217 = new int[2][2][4];

    @ObfuscatedName("bv.p")
    public int[] field1212 = new int[2];

    @ObfuscatedName("bv.h")
    public static float[][] field1213 = new float[2][8];

    @ObfuscatedName("bv.g")
    public static int[][] field1214 = new int[2][8];

    @ObfuscatedName("bv.e(IIF)F")
    public float method1241(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1217[arg0][1][arg1] - this.field1217[arg0][0][arg1]) * arg2 + (float) this.field1217[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bv.w(F)F")
    public static float method1235(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bv.f(IIF)F")
    public float method1236(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1219[arg0][1][arg1] - this.field1219[arg0][0][arg1]) * arg2 + (float) this.field1219[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1235(var5);
    }

    @ObfuscatedName("bv.s(IF)I")
    public int method1237(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1212[1] - this.field1212[0]) * arg1 + (float) this.field1212[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1208 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1216 = (int) (Statics.field1208 * 65536.0F);
        }
        if (this.field1215[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1241(arg0, 0, arg1);
        field1213[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1236(arg0, 0, arg1));
        field1213[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1215[arg0]; var6++) {
            float var7 = this.method1241(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1236(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1213[arg0][var6 * 2 + 1] = field1213[arg0][var6 * 2 - 1] * var9;
            field1213[arg0][var6 * 2] = field1213[arg0][var6 * 2 - 1] * var8 + field1213[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1213[arg0][var10] += field1213[arg0][var10 - 1] * var8 + field1213[arg0][var10 - 2] * var9;
            }
            field1213[arg0][1] += field1213[arg0][0] * var8 + var9;
            field1213[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1215[0] * 2; var11++) {
                field1213[0][var11] *= Statics.field1208;
            }
        }
        for (int var12 = 0; var12 < this.field1215[arg0] * 2; var12++) {
            field1214[arg0][var12] = (int) (field1213[arg0][var12] * 65536.0F);
        }
        return this.field1215[arg0] * 2;
    }

    @ObfuscatedName("bv.p(Ldq;Lbd;)V")
    public final void method1238(class120 arg0, class58 arg1) {
        int var3 = arg0.method2355();
        this.field1215[0] = var3 >> 4;
        this.field1215[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1212;
            this.field1212[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1212[0] = arg0.method2532();
        this.field1212[1] = arg0.method2532();
        int var4 = arg0.method2355();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1215[var5]; var6++) {
                this.field1219[var5][0][var6] = arg0.method2532();
                this.field1217[var5][0][var6] = arg0.method2532();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1215[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1219[var7][1][var8] = this.field1219[var7][0][var8];
                    this.field1217[var7][1][var8] = this.field1217[var7][0][var8];
                } else {
                    this.field1219[var7][1][var8] = arg0.method2532();
                    this.field1217[var7][1][var8] = arg0.method2532();
                }
            }
        }
        if (var4 != 0 || this.field1212[1] != this.field1212[0]) {
            arg1.method1189(arg0);
        }
    }
}
