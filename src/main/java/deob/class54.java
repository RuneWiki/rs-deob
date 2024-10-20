package deob;

@ObfuscatedName("bn")
public class class54 {

    @ObfuscatedName("bn.s")
    public int[] field419 = new int[2];

    @ObfuscatedName("bn.w")
    public int[][][] field411 = new int[2][2][4];

    @ObfuscatedName("bn.v")
    public int[][][] field412 = new int[2][2][4];

    @ObfuscatedName("bn.c")
    public int[] field410 = new int[2];

    @ObfuscatedName("bn.q")
    public static float[][] field414 = new float[2][8];

    @ObfuscatedName("bn.i")
    public static int[][] field415 = new int[2][8];

    @ObfuscatedName("bn.s(IIF)F")
    public float method931(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field412[arg0][1][arg1] - this.field412[arg0][0][arg1]) * arg2 + (float) this.field412[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bn.h(F)F")
    public static float method936(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bn.w(IIF)F")
    public float method933(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field411[arg0][1][arg1] - this.field411[arg0][0][arg1]) * arg2 + (float) this.field411[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method936(var5);
    }

    @ObfuscatedName("bn.v(IF)I")
    public int method934(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field410[1] - this.field410[0]) * arg1 + (float) this.field410[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field416 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field417 = (int) (Statics.field416 * 65536.0F);
        }
        if (this.field419[arg0] == 0) {
            return 0;
        }
        float var5 = this.method931(arg0, 0, arg1);
        field414[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method933(arg0, 0, arg1));
        field414[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field419[arg0]; var6++) {
            float var7 = this.method931(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method933(arg0, var6, arg1));
            float var9 = var7 * var7;
            field414[arg0][var6 * 2 + 1] = field414[arg0][var6 * 2 - 1] * var9;
            field414[arg0][var6 * 2] = field414[arg0][var6 * 2 - 1] * var8 + field414[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field414[arg0][var10] += field414[arg0][var10 - 1] * var8 + field414[arg0][var10 - 2] * var9;
            }
            field414[arg0][1] += field414[arg0][0] * var8 + var9;
            field414[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field419[0] * 2; var11++) {
                field414[0][var11] *= Statics.field416;
            }
        }
        for (int var12 = 0; var12 < this.field419[arg0] * 2; var12++) {
            field415[arg0][var12] = (int) (field414[arg0][var12] * 65536.0F);
        }
        return this.field419[arg0] * 2;
    }

    @ObfuscatedName("bn.c(Lqr;Law;)V")
    public final void method935(class444 arg0, class41 arg1) {
        int var3 = arg0.method6929();
        this.field419[0] = var3 >> 4;
        this.field419[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field410;
            this.field410[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field410[0] = arg0.method7120();
        this.field410[1] = arg0.method7120();
        int var4 = arg0.method6929();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field419[var5]; var6++) {
                this.field411[var5][0][var6] = arg0.method7120();
                this.field412[var5][0][var6] = arg0.method7120();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field419[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field411[var7][1][var8] = this.field411[var7][0][var8];
                    this.field412[var7][1][var8] = this.field412[var7][0][var8];
                } else {
                    this.field411[var7][1][var8] = arg0.method7120();
                    this.field412[var7][1][var8] = arg0.method7120();
                }
            }
        }
        if (var4 != 0 || this.field410[1] != this.field410[0]) {
            arg1.method702(arg0);
        }
    }
}
