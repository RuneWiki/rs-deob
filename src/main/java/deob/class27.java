package deob;

@ObfuscatedName("ak")
public class class27 {

    @ObfuscatedName("ak.t")
    public int[] field333 = new int[2];

    @ObfuscatedName("ak.q")
    public int[][][] field334 = new int[2][2][4];

    @ObfuscatedName("ak.h")
    public int[][][] field341 = new int[2][2][4];

    @ObfuscatedName("ak.k")
    public int[] field336 = new int[2];

    @ObfuscatedName("ak.r")
    public static float[][] field337 = new float[2][8];

    @ObfuscatedName("ak.l")
    public static int[][] field339 = new int[2][8];

    @ObfuscatedName("ak.t(IIF)F")
    public float method334(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field341[arg0][1][arg1] - this.field341[arg0][0][arg1]) * arg2 + (float) this.field341[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ak.n(F)F")
    public static float method327(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ak.q(IIF)F")
    public float method330(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field334[arg0][1][arg1] - this.field334[arg0][0][arg1]) * arg2 + (float) this.field334[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method327(var5);
    }

    @ObfuscatedName("ak.h(IF)I")
    public int method340(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field336[1] - this.field336[0]) * arg1 + (float) this.field336[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field332 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field340 = (int) (Statics.field332 * 65536.0F);
        }
        if (this.field333[arg0] == 0) {
            return 0;
        }
        float var5 = this.method334(arg0, 0, arg1);
        field337[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method330(arg0, 0, arg1));
        field337[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field333[arg0]; var6++) {
            float var7 = this.method334(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method330(arg0, var6, arg1));
            float var9 = var7 * var7;
            field337[arg0][var6 * 2 + 1] = field337[arg0][var6 * 2 - 1] * var9;
            field337[arg0][var6 * 2] = field337[arg0][var6 * 2 - 1] * var8 + field337[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field337[arg0][var10] += field337[arg0][var10 - 1] * var8 + field337[arg0][var10 - 2] * var9;
            }
            field337[arg0][1] += field337[arg0][0] * var8 + var9;
            field337[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field333[0] * 2; var11++) {
                field337[0][var11] *= Statics.field332;
            }
        }
        for (int var12 = 0; var12 < this.field333[arg0] * 2; var12++) {
            field339[arg0][var12] = (int) (field337[arg0][var12] * 65536.0F);
        }
        return this.field333[arg0] * 2;
    }

    @ObfuscatedName("ak.k(Lec;Lo;)V")
    public final void method331(class135 arg0, class21 arg1) {
        int var3 = arg0.method1571();
        this.field333[0] = var3 >> 4;
        this.field333[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field336;
            this.field336[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field336[0] = arg0.method1725();
        this.field336[1] = arg0.method1725();
        int var4 = arg0.method1571();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field333[var5]; var6++) {
                this.field334[var5][0][var6] = arg0.method1725();
                this.field341[var5][0][var6] = arg0.method1725();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field333[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field334[var7][1][var8] = this.field334[var7][0][var8];
                    this.field341[var7][1][var8] = this.field341[var7][0][var8];
                } else {
                    this.field334[var7][1][var8] = arg0.method1725();
                    this.field341[var7][1][var8] = arg0.method1725();
                }
            }
        }
        if (var4 != 0 || this.field336[1] != this.field336[0]) {
            arg1.method274(arg0);
        }
    }
}
