package deob;

@ObfuscatedName("bg")
public class class64 {

    @ObfuscatedName("bg.c")
    public int[] field1256 = new int[2];

    @ObfuscatedName("bg.y")
    public int[][][] field1255 = new int[2][2][4];

    @ObfuscatedName("bg.v")
    public int[][][] field1258 = new int[2][2][4];

    @ObfuscatedName("bg.g")
    public int[] field1259 = new int[2];

    @ObfuscatedName("bg.x")
    public static float[][] field1260 = new float[2][8];

    @ObfuscatedName("bg.u")
    public static int[][] field1261 = new int[2][8];

    @ObfuscatedName("bg.c(IIF)F")
    public float method1290(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1258[arg0][1][arg1] - this.field1258[arg0][0][arg1]) * arg2 + (float) this.field1258[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bg.q(F)F")
    public static float method1291(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bg.y(IIF)F")
    public float method1280(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1255[arg0][1][arg1] - this.field1255[arg0][0][arg1]) * arg2 + (float) this.field1255[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1291(var5);
    }

    @ObfuscatedName("bg.v(IF)I")
    public int method1278(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1259[1] - this.field1259[0]) * arg1 + (float) this.field1259[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1264 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1263 = (int) (Statics.field1264 * 65536.0F);
        }
        if (this.field1256[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1290(arg0, 0, arg1);
        field1260[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1280(arg0, 0, arg1));
        field1260[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1256[arg0]; var6++) {
            float var7 = this.method1290(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1280(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1260[arg0][var6 * 2 + 1] = field1260[arg0][var6 * 2 - 1] * var9;
            field1260[arg0][var6 * 2] = field1260[arg0][var6 * 2 - 1] * var8 + field1260[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1260[arg0][var10] += field1260[arg0][var10 - 1] * var8 + field1260[arg0][var10 - 2] * var9;
            }
            field1260[arg0][1] += field1260[arg0][0] * var8 + var9;
            field1260[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1256[0] * 2; var11++) {
                field1260[0][var11] *= Statics.field1264;
            }
        }
        for (int var12 = 0; var12 < this.field1256[arg0] * 2; var12++) {
            field1261[arg0][var12] = (int) (field1260[arg0][var12] * 65536.0F);
        }
        return this.field1256[arg0] * 2;
    }

    @ObfuscatedName("bg.g(Ldg;Lbl;)V")
    public final void method1282(class127 arg0, class56 arg1) {
        int var3 = arg0.method2383();
        this.field1256[0] = var3 >> 4;
        this.field1256[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1259;
            this.field1259[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1259[0] = arg0.method2327();
        this.field1259[1] = arg0.method2327();
        int var4 = arg0.method2383();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1256[var5]; var6++) {
                this.field1255[var5][0][var6] = arg0.method2327();
                this.field1258[var5][0][var6] = arg0.method2327();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1256[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1255[var7][1][var8] = this.field1255[var7][0][var8];
                    this.field1258[var7][1][var8] = this.field1258[var7][0][var8];
                } else {
                    this.field1255[var7][1][var8] = arg0.method2327();
                    this.field1258[var7][1][var8] = arg0.method2327();
                }
            }
        }
        if (var4 != 0 || this.field1259[1] != this.field1259[0]) {
            arg1.method1186(arg0);
        }
    }
}
