package deob;

@ObfuscatedName("bg")
public class class64 {

    @ObfuscatedName("bg.y")
    public int[] field1239 = new int[2];

    @ObfuscatedName("bg.g")
    public int[][][] field1244 = new int[2][2][4];

    @ObfuscatedName("bg.w")
    public int[][][] field1238 = new int[2][2][4];

    @ObfuscatedName("bg.e")
    public int[] field1240 = new int[2];

    @ObfuscatedName("bg.c")
    public static float[][] field1241 = new float[2][8];

    @ObfuscatedName("bg.a")
    public static int[][] field1236 = new int[2][8];

    @ObfuscatedName("bg.y(IIF)F")
    public float method1248(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1238[arg0][1][arg1] - this.field1238[arg0][0][arg1]) * arg2 + (float) this.field1238[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bg.d(F)F")
    public static float method1249(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bg.g(IIF)F")
    public float method1250(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1244[arg0][1][arg1] - this.field1244[arg0][0][arg1]) * arg2 + (float) this.field1244[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1249(var5);
    }

    @ObfuscatedName("bg.w(IF)I")
    public int method1251(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1240[1] - this.field1240[0]) * arg1 + (float) this.field1240[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1243 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1242 = (int) (Statics.field1243 * 65536.0F);
        }
        if (this.field1239[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1248(arg0, 0, arg1);
        field1241[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1250(arg0, 0, arg1));
        field1241[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1239[arg0]; var6++) {
            float var7 = this.method1248(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1250(arg0, var6, arg1));
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
            for (int var11 = 0; var11 < this.field1239[0] * 2; var11++) {
                field1241[0][var11] *= Statics.field1243;
            }
        }
        for (int var12 = 0; var12 < this.field1239[arg0] * 2; var12++) {
            field1236[arg0][var12] = (int) (field1241[arg0][var12] * 65536.0F);
        }
        return this.field1239[arg0] * 2;
    }

    @ObfuscatedName("bg.e(Ldd;Lbh;)V")
    public final void method1252(class119 arg0, class58 arg1) {
        int var3 = arg0.method2326();
        this.field1239[0] = var3 >> 4;
        this.field1239[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1240;
            this.field1240[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1240[0] = arg0.method2525();
        this.field1240[1] = arg0.method2525();
        int var4 = arg0.method2326();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1239[var5]; var6++) {
                this.field1244[var5][0][var6] = arg0.method2525();
                this.field1238[var5][0][var6] = arg0.method2525();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1239[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1244[var7][1][var8] = this.field1244[var7][0][var8];
                    this.field1238[var7][1][var8] = this.field1238[var7][0][var8];
                } else {
                    this.field1244[var7][1][var8] = arg0.method2525();
                    this.field1238[var7][1][var8] = arg0.method2525();
                }
            }
        }
        if (var4 != 0 || this.field1240[1] != this.field1240[0]) {
            arg1.method1189(arg0);
        }
    }
}
