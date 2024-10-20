package deob;

@ObfuscatedName("bx")
public class class67 {

    @ObfuscatedName("bx.k")
    public int[] field1304 = new int[2];

    @ObfuscatedName("bx.f")
    public int[][][] field1297 = new int[2][2][4];

    @ObfuscatedName("bx.c")
    public int[][][] field1298 = new int[2][2][4];

    @ObfuscatedName("bx.v")
    public int[] field1299 = new int[2];

    @ObfuscatedName("bx.j")
    public static float[][] field1302 = new float[2][8];

    @ObfuscatedName("bx.m")
    public static int[][] field1301 = new int[2][8];

    @ObfuscatedName("bx.k(IIF)F")
    public float method1294(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1298[arg0][1][arg1] - this.field1298[arg0][0][arg1]) * arg2 + (float) this.field1298[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bx.q(F)F")
    public static float method1292(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bx.f(IIF)F")
    public float method1293(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1297[arg0][1][arg1] - this.field1297[arg0][0][arg1]) * arg2 + (float) this.field1297[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1292(var5);
    }

    @ObfuscatedName("bx.c(IF)I")
    public int method1295(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1299[1] - this.field1299[0]) * arg1 + (float) this.field1299[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1300 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1303 = (int) (Statics.field1300 * 65536.0F);
        }
        if (this.field1304[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1294(arg0, 0, arg1);
        field1302[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1293(arg0, 0, arg1));
        field1302[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1304[arg0]; var6++) {
            float var7 = this.method1294(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1293(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1302[arg0][var6 * 2 + 1] = field1302[arg0][var6 * 2 - 1] * var9;
            field1302[arg0][var6 * 2] = field1302[arg0][var6 * 2 - 1] * var8 + field1302[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1302[arg0][var10] += field1302[arg0][var10 - 1] * var8 + field1302[arg0][var10 - 2] * var9;
            }
            field1302[arg0][1] += field1302[arg0][0] * var8 + var9;
            field1302[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1304[0] * 2; var11++) {
                field1302[0][var11] *= Statics.field1300;
            }
        }
        for (int var12 = 0; var12 < this.field1304[arg0] * 2; var12++) {
            field1301[arg0][var12] = (int) (field1302[arg0][var12] * 65536.0F);
        }
        return this.field1304[arg0] * 2;
    }

    @ObfuscatedName("bx.v(Lde;Lbt;)V")
    public final void method1291(class123 arg0, class61 arg1) {
        int var3 = arg0.method2427();
        this.field1304[0] = var3 >> 4;
        this.field1304[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1299;
            this.field1299[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1299[0] = arg0.method2547();
        this.field1299[1] = arg0.method2547();
        int var4 = arg0.method2427();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1304[var5]; var6++) {
                this.field1297[var5][0][var6] = arg0.method2547();
                this.field1298[var5][0][var6] = arg0.method2547();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1304[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1297[var7][1][var8] = this.field1297[var7][0][var8];
                    this.field1298[var7][1][var8] = this.field1298[var7][0][var8];
                } else {
                    this.field1297[var7][1][var8] = arg0.method2547();
                    this.field1298[var7][1][var8] = arg0.method2547();
                }
            }
        }
        if (var4 != 0 || this.field1299[1] != this.field1299[0]) {
            arg1.method1239(arg0);
        }
    }
}
