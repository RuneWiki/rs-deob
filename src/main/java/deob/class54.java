package deob;

@ObfuscatedName("bd")
public class class54 {

    @ObfuscatedName("bd.c")
    public int[] field403 = new int[2];

    @ObfuscatedName("bd.p")
    public int[][][] field405 = new int[2][2][4];

    @ObfuscatedName("bd.m")
    public int[][][] field406 = new int[2][2][4];

    @ObfuscatedName("bd.t")
    public int[] field407 = new int[2];

    @ObfuscatedName("bd.s")
    public static float[][] field408 = new float[2][8];

    @ObfuscatedName("bd.j")
    public static int[][] field409 = new int[2][8];

    @ObfuscatedName("bd.c(IIF)F")
    public float method1032(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field406[arg0][1][arg1] - this.field406[arg0][0][arg1]) * arg2 + (float) this.field406[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bd.b(F)F")
    public static float method1021(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bd.p(IIF)F")
    public float method1026(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field405[arg0][1][arg1] - this.field405[arg0][0][arg1]) * arg2 + (float) this.field405[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1021(var5);
    }

    @ObfuscatedName("bd.m(IF)I")
    public int method1023(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field407[1] - this.field407[0]) * arg1 + (float) this.field407[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field410 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field411 = (int) (Statics.field410 * 65536.0F);
        }
        if (this.field403[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1032(arg0, 0, arg1);
        field408[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1026(arg0, 0, arg1));
        field408[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field403[arg0]; var6++) {
            float var7 = this.method1032(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1026(arg0, var6, arg1));
            float var9 = var7 * var7;
            field408[arg0][var6 * 2 + 1] = field408[arg0][var6 * 2 - 1] * var9;
            field408[arg0][var6 * 2] = field408[arg0][var6 * 2 - 1] * var8 + field408[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field408[arg0][var10] += field408[arg0][var10 - 1] * var8 + field408[arg0][var10 - 2] * var9;
            }
            field408[arg0][1] += field408[arg0][0] * var8 + var9;
            field408[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field403[0] * 2; var11++) {
                field408[0][var11] *= Statics.field410;
            }
        }
        for (int var12 = 0; var12 < this.field403[arg0] * 2; var12++) {
            field409[arg0][var12] = (int) (field408[arg0][var12] * 65536.0F);
        }
        return this.field403[arg0] * 2;
    }

    @ObfuscatedName("bd.t(Lpi;Lag;)V")
    public final void method1024(class419 arg0, class41 arg1) {
        int var3 = arg0.method6781();
        this.field403[0] = var3 >> 4;
        this.field403[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field407;
            this.field407[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field407[0] = arg0.method6672();
        this.field407[1] = arg0.method6672();
        int var4 = arg0.method6781();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field403[var5]; var6++) {
                this.field405[var5][0][var6] = arg0.method6672();
                this.field406[var5][0][var6] = arg0.method6672();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field403[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field405[var7][1][var8] = this.field405[var7][0][var8];
                    this.field406[var7][1][var8] = this.field406[var7][0][var8];
                } else {
                    this.field405[var7][1][var8] = arg0.method6672();
                    this.field406[var7][1][var8] = arg0.method6672();
                }
            }
        }
        if (var4 != 0 || this.field407[1] != this.field407[0]) {
            arg1.method770(arg0);
        }
    }
}
