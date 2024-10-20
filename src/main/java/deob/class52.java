package deob;

@ObfuscatedName("af")
public class class52 {

    @ObfuscatedName("af.l")
    public int[] field401 = new int[2];

    @ObfuscatedName("af.f")
    public int[][][] field395 = new int[2][2][4];

    @ObfuscatedName("af.j")
    public int[][][] field396 = new int[2][2][4];

    @ObfuscatedName("af.m")
    public int[] field402 = new int[2];

    @ObfuscatedName("af.k")
    public static float[][] field398 = new float[2][8];

    @ObfuscatedName("af.t")
    public static int[][] field397 = new int[2][8];

    @ObfuscatedName("af.l(IIF)F")
    public float method965(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field396[arg0][1][arg1] - this.field396[arg0][0][arg1]) * arg2 + (float) this.field396[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("af.q(F)F")
    public static float method978(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("af.f(IIF)F")
    public float method967(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field395[arg0][1][arg1] - this.field395[arg0][0][arg1]) * arg2 + (float) this.field395[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method978(var5);
    }

    @ObfuscatedName("af.j(IF)I")
    public int method980(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field402[1] - this.field402[0]) * arg1 + (float) this.field402[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field400 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field399 = (int) (Statics.field400 * 65536.0F);
        }
        if (this.field401[arg0] == 0) {
            return 0;
        }
        float var5 = this.method965(arg0, 0, arg1);
        field398[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method967(arg0, 0, arg1));
        field398[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field401[arg0]; var6++) {
            float var7 = this.method965(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method967(arg0, var6, arg1));
            float var9 = var7 * var7;
            field398[arg0][var6 * 2 + 1] = field398[arg0][var6 * 2 - 1] * var9;
            field398[arg0][var6 * 2] = field398[arg0][var6 * 2 - 1] * var8 + field398[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field398[arg0][var10] += field398[arg0][var10 - 1] * var8 + field398[arg0][var10 - 2] * var9;
            }
            field398[arg0][1] += field398[arg0][0] * var8 + var9;
            field398[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field401[0] * 2; var11++) {
                field398[0][var11] *= Statics.field400;
            }
        }
        for (int var12 = 0; var12 < this.field401[arg0] * 2; var12++) {
            field397[arg0][var12] = (int) (field398[arg0][var12] * 65536.0F);
        }
        return this.field401[arg0] * 2;
    }

    @ObfuscatedName("af.m(Lot;Lar;)V")
    public final void method968(class401 arg0, class39 arg1) {
        int var3 = arg0.method6272();
        this.field401[0] = var3 >> 4;
        this.field401[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field402;
            this.field402[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field402[0] = arg0.method6284();
        this.field402[1] = arg0.method6284();
        int var4 = arg0.method6272();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field401[var5]; var6++) {
                this.field395[var5][0][var6] = arg0.method6284();
                this.field396[var5][0][var6] = arg0.method6284();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field401[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field395[var7][1][var8] = this.field395[var7][0][var8];
                    this.field396[var7][1][var8] = this.field396[var7][0][var8];
                } else {
                    this.field395[var7][1][var8] = arg0.method6284();
                    this.field396[var7][1][var8] = arg0.method6284();
                }
            }
        }
        if (var4 != 0 || this.field402[1] != this.field402[0]) {
            arg1.method726(arg0);
        }
    }
}
