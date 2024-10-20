package deob;

@ObfuscatedName("by")
public class class64 {

    @ObfuscatedName("by.c")
    public int[] field1233 = new int[2];

    @ObfuscatedName("by.k")
    public int[][][] field1234 = new int[2][2][4];

    @ObfuscatedName("by.t")
    public int[][][] field1232 = new int[2][2][4];

    @ObfuscatedName("by.g")
    public int[] field1229 = new int[2];

    @ObfuscatedName("by.o")
    public static float[][] field1236 = new float[2][8];

    @ObfuscatedName("by.i")
    public static int[][] field1235 = new int[2][8];

    @ObfuscatedName("by.c(IIF)F")
    public float method1233(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1232[arg0][1][arg1] - this.field1232[arg0][0][arg1]) * arg2 + (float) this.field1232[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("by.h(F)F")
    public static float method1245(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("by.k(IIF)F")
    public float method1235(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1234[arg0][1][arg1] - this.field1234[arg0][0][arg1]) * arg2 + (float) this.field1234[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1245(var5);
    }

    @ObfuscatedName("by.t(IF)I")
    public int method1236(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1229[1] - this.field1229[0]) * arg1 + (float) this.field1229[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1230 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1237 = (int) (Statics.field1230 * 65536.0F);
        }
        if (this.field1233[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1233(arg0, 0, arg1);
        field1236[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1235(arg0, 0, arg1));
        field1236[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1233[arg0]; var6++) {
            float var7 = this.method1233(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1235(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1236[arg0][var6 * 2 + 1] = field1236[arg0][var6 * 2 - 1] * var9;
            field1236[arg0][var6 * 2] = field1236[arg0][var6 * 2 - 1] * var8 + field1236[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1236[arg0][var10] += field1236[arg0][var10 - 1] * var8 + field1236[arg0][var10 - 2] * var9;
            }
            field1236[arg0][1] += field1236[arg0][0] * var8 + var9;
            field1236[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1233[0] * 2; var11++) {
                field1236[0][var11] *= Statics.field1230;
            }
        }
        for (int var12 = 0; var12 < this.field1233[arg0] * 2; var12++) {
            field1235[arg0][var12] = (int) (field1236[arg0][var12] * 65536.0F);
        }
        return this.field1233[arg0] * 2;
    }

    @ObfuscatedName("by.g(Ldf;Lbi;)V")
    public final void method1237(class119 arg0, class58 arg1) {
        int var3 = arg0.method2291();
        this.field1233[0] = var3 >> 4;
        this.field1233[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1229;
            this.field1229[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1229[0] = arg0.method2293();
        this.field1229[1] = arg0.method2293();
        int var4 = arg0.method2291();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1233[var5]; var6++) {
                this.field1234[var5][0][var6] = arg0.method2293();
                this.field1232[var5][0][var6] = arg0.method2293();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1233[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1234[var7][1][var8] = this.field1234[var7][0][var8];
                    this.field1232[var7][1][var8] = this.field1232[var7][0][var8];
                } else {
                    this.field1234[var7][1][var8] = arg0.method2293();
                    this.field1232[var7][1][var8] = arg0.method2293();
                }
            }
        }
        if (var4 != 0 || this.field1229[1] != this.field1229[0]) {
            arg1.method1176(arg0);
        }
    }
}
