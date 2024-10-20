package deob;

@ObfuscatedName("bm")
public class class64 {

    @ObfuscatedName("bm.o")
    public int[] field1231 = new int[2];

    @ObfuscatedName("bm.u")
    public int[][][] field1232 = new int[2][2][4];

    @ObfuscatedName("bm.b")
    public int[][][] field1233 = new int[2][2][4];

    @ObfuscatedName("bm.p")
    public int[] field1234 = new int[2];

    @ObfuscatedName("bm.s")
    public static float[][] field1235 = new float[2][8];

    @ObfuscatedName("bm.y")
    public static int[][] field1238 = new int[2][8];

    @ObfuscatedName("bm.o(IIF)F")
    public float method1218(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1233[arg0][1][arg1] - this.field1233[arg0][0][arg1]) * arg2 + (float) this.field1233[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bm.e(F)F")
    public static float method1225(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bm.u(IIF)F")
    public float method1220(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1232[arg0][1][arg1] - this.field1232[arg0][0][arg1]) * arg2 + (float) this.field1232[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1225(var5);
    }

    @ObfuscatedName("bm.b(IF)I")
    public int method1221(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1234[1] - this.field1234[0]) * arg1 + (float) this.field1234[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1237 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1241 = (int) (Statics.field1237 * 65536.0F);
        }
        if (this.field1231[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1218(arg0, 0, arg1);
        field1235[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1220(arg0, 0, arg1));
        field1235[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1231[arg0]; var6++) {
            float var7 = this.method1218(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1220(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1235[arg0][var6 * 2 + 1] = field1235[arg0][var6 * 2 - 1] * var9;
            field1235[arg0][var6 * 2] = field1235[arg0][var6 * 2 - 1] * var8 + field1235[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1235[arg0][var10] += field1235[arg0][var10 - 1] * var8 + field1235[arg0][var10 - 2] * var9;
            }
            field1235[arg0][1] += field1235[arg0][0] * var8 + var9;
            field1235[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1231[0] * 2; var11++) {
                field1235[0][var11] *= Statics.field1237;
            }
        }
        for (int var12 = 0; var12 < this.field1231[arg0] * 2; var12++) {
            field1238[arg0][var12] = (int) (field1235[arg0][var12] * 65536.0F);
        }
        return this.field1231[arg0] * 2;
    }

    @ObfuscatedName("bm.p(Ldi;Lbe;)V")
    public final void method1222(class119 arg0, class58 arg1) {
        int var3 = arg0.method2427();
        this.field1231[0] = var3 >> 4;
        this.field1231[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1234;
            this.field1234[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1234[0] = arg0.method2339();
        this.field1234[1] = arg0.method2339();
        int var4 = arg0.method2427();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1231[var5]; var6++) {
                this.field1232[var5][0][var6] = arg0.method2339();
                this.field1233[var5][0][var6] = arg0.method2339();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1231[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1232[var7][1][var8] = this.field1232[var7][0][var8];
                    this.field1233[var7][1][var8] = this.field1233[var7][0][var8];
                } else {
                    this.field1232[var7][1][var8] = arg0.method2339();
                    this.field1233[var7][1][var8] = arg0.method2339();
                }
            }
        }
        if (var4 != 0 || this.field1234[1] != this.field1234[0]) {
            arg1.method1167(arg0);
        }
    }
}
