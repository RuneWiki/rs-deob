package deob;

@ObfuscatedName("cb")
public class class59 {

    @ObfuscatedName("cb.ab")
    public int[] field393 = new int[2];

    @ObfuscatedName("cb.an")
    public int[][][] field398 = new int[2][2][4];

    @ObfuscatedName("cb.au")
    public int[][][] field394 = new int[2][2][4];

    @ObfuscatedName("cb.ax")
    public int[] field395 = new int[2];

    @ObfuscatedName("cb.ao")
    public static float[][] field391 = new float[2][8];

    @ObfuscatedName("cb.am")
    public static int[][] field399 = new int[2][8];

    @ObfuscatedName("cb.ab(IIF)F")
    public float method1046(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field394[arg0][1][arg1] - this.field394[arg0][0][arg1]) * arg2 + (float) this.field394[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cb.ay(F)F")
    public static float method1047(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cb.an(IIF)F")
    public float method1048(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field398[arg0][1][arg1] - this.field398[arg0][0][arg1]) * arg2 + (float) this.field398[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1047(var5);
    }

    @ObfuscatedName("cb.au(IF)I")
    public int method1049(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field395[1] - this.field395[0]) * arg1 + (float) this.field395[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field397 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field396 = (int) (Statics.field397 * 65536.0F);
        }
        if (this.field393[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1046(arg0, 0, arg1);
        field391[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1048(arg0, 0, arg1));
        field391[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field393[arg0]; var6++) {
            float var7 = this.method1046(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1048(arg0, var6, arg1));
            float var9 = var7 * var7;
            field391[arg0][var6 * 2 + 1] = field391[arg0][var6 * 2 - 1] * var9;
            field391[arg0][var6 * 2] = field391[arg0][var6 * 2 - 1] * var8 + field391[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field391[arg0][var10] += field391[arg0][var10 - 1] * var8 + field391[arg0][var10 - 2] * var9;
            }
            field391[arg0][1] += field391[arg0][0] * var8 + var9;
            field391[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field393[0] * 2; var11++) {
                field391[0][var11] *= Statics.field397;
            }
        }
        for (int var12 = 0; var12 < this.field393[arg0] * 2; var12++) {
            field399[arg0][var12] = (int) (field391[arg0][var12] * 65536.0F);
        }
        return this.field393[arg0] * 2;
    }

    @ObfuscatedName("cb.ax(Lvg;Lbe;)V")
    public final void method1050(class549 arg0, class44 arg1) {
        int var3 = arg0.method9025();
        this.field393[0] = var3 >> 4;
        this.field393[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field395;
            this.field395[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field395[0] = arg0.method8968();
        this.field395[1] = arg0.method8968();
        int var4 = arg0.method9025();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field393[var5]; var6++) {
                this.field398[var5][0][var6] = arg0.method8968();
                this.field394[var5][0][var6] = arg0.method8968();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field393[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field398[var7][1][var8] = this.field398[var7][0][var8];
                    this.field394[var7][1][var8] = this.field394[var7][0][var8];
                } else {
                    this.field398[var7][1][var8] = arg0.method8968();
                    this.field394[var7][1][var8] = arg0.method8968();
                }
            }
        }
        if (var4 != 0 || this.field395[1] != this.field395[0]) {
            arg1.method781(arg0);
        }
    }
}
