package deob;

@ObfuscatedName("cf")
public class class59 {

    @ObfuscatedName("cf.ap")
    public int[] field391 = new int[2];

    @ObfuscatedName("cf.ak")
    public int[][][] field398 = new int[2][2][4];

    @ObfuscatedName("cf.aj")
    public int[][][] field392 = new int[2][2][4];

    @ObfuscatedName("cf.ai")
    public int[] field393 = new int[2];

    @ObfuscatedName("cf.ay")
    public static float[][] field394 = new float[2][8];

    @ObfuscatedName("cf.as")
    public static int[][] field395 = new int[2][8];

    @ObfuscatedName("cf.ap(IIF)F")
    public float method1110(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field392[arg0][1][arg1] - this.field392[arg0][0][arg1]) * arg2 + (float) this.field392[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cf.aw(F)F")
    public static float method1111(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cf.ak(IIF)F")
    public float method1125(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field398[arg0][1][arg1] - this.field398[arg0][0][arg1]) * arg2 + (float) this.field398[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1111(var5);
    }

    @ObfuscatedName("cf.aj(IF)I")
    public int method1112(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field393[1] - this.field393[0]) * arg1 + (float) this.field393[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field396 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field397 = (int) (Statics.field396 * 65536.0F);
        }
        if (this.field391[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1110(arg0, 0, arg1);
        field394[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1125(arg0, 0, arg1));
        field394[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field391[arg0]; var6++) {
            float var7 = this.method1110(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1125(arg0, var6, arg1));
            float var9 = var7 * var7;
            field394[arg0][var6 * 2 + 1] = field394[arg0][var6 * 2 - 1] * var9;
            field394[arg0][var6 * 2] = field394[arg0][var6 * 2 - 1] * var8 + field394[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field394[arg0][var10] += field394[arg0][var10 - 1] * var8 + field394[arg0][var10 - 2] * var9;
            }
            field394[arg0][1] += field394[arg0][0] * var8 + var9;
            field394[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field391[0] * 2; var11++) {
                field394[0][var11] *= Statics.field396;
            }
        }
        for (int var12 = 0; var12 < this.field391[arg0] * 2; var12++) {
            field395[arg0][var12] = (int) (field394[arg0][var12] * 65536.0F);
        }
        return this.field391[arg0] * 2;
    }

    @ObfuscatedName("cf.ai(Lvl;Lbo;)V")
    public final void method1109(class558 arg0, class44 arg1) {
        int var3 = arg0.method9258();
        this.field391[0] = var3 >> 4;
        this.field391[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field393;
            this.field393[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field393[0] = arg0.method9260();
        this.field393[1] = arg0.method9260();
        int var4 = arg0.method9258();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field391[var5]; var6++) {
                this.field398[var5][0][var6] = arg0.method9260();
                this.field392[var5][0][var6] = arg0.method9260();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field391[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field398[var7][1][var8] = this.field398[var7][0][var8];
                    this.field392[var7][1][var8] = this.field392[var7][0][var8];
                } else {
                    this.field398[var7][1][var8] = arg0.method9260();
                    this.field392[var7][1][var8] = arg0.method9260();
                }
            }
        }
        if (var4 != 0 || this.field393[1] != this.field393[0]) {
            arg1.method817(arg0);
        }
    }
}
