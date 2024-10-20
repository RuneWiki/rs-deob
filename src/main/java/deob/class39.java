package deob;

@ObfuscatedName("az")
public class class39 {

    @ObfuscatedName("az.s")
    public int[] field321 = new int[2];

    @ObfuscatedName("az.v")
    public int[][][] field314 = new int[2][2][4];

    @ObfuscatedName("az.j")
    public int[][][] field315 = new int[2][2][4];

    @ObfuscatedName("az.l")
    public int[] field316 = new int[2];

    @ObfuscatedName("az.n")
    public static float[][] field319 = new float[2][8];

    @ObfuscatedName("az.w")
    public static int[][] field318 = new int[2][8];

    @ObfuscatedName("az.s(IIF)F")
    public float method758(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field315[arg0][1][arg1] - this.field315[arg0][0][arg1]) * arg2 + (float) this.field315[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("az.t(F)F")
    public static float method746(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("az.v(IIF)F")
    public float method745(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field314[arg0][1][arg1] - this.field314[arg0][0][arg1]) * arg2 + (float) this.field314[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method746(var5);
    }

    @ObfuscatedName("az.j(IF)I")
    public int method756(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field316[1] - this.field316[0]) * arg1 + (float) this.field316[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field312 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field320 = (int) (Statics.field312 * 65536.0F);
        }
        if (this.field321[arg0] == 0) {
            return 0;
        }
        float var5 = this.method758(arg0, 0, arg1);
        field319[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method745(arg0, 0, arg1));
        field319[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field321[arg0]; var6++) {
            float var7 = this.method758(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method745(arg0, var6, arg1));
            float var9 = var7 * var7;
            field319[arg0][var6 * 2 + 1] = field319[arg0][var6 * 2 - 1] * var9;
            field319[arg0][var6 * 2] = field319[arg0][var6 * 2 - 1] * var8 + field319[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field319[arg0][var10] += field319[arg0][var10 - 1] * var8 + field319[arg0][var10 - 2] * var9;
            }
            field319[arg0][1] += field319[arg0][0] * var8 + var9;
            field319[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field321[0] * 2; var11++) {
                field319[0][var11] *= Statics.field312;
            }
        }
        for (int var12 = 0; var12 < this.field321[arg0] * 2; var12++) {
            field318[arg0][var12] = (int) (field319[arg0][var12] * 65536.0F);
        }
        return this.field321[arg0] * 2;
    }

    @ObfuscatedName("az.l(Lnv;Lg;)V")
    public final void method748(class385 arg0, class26 arg1) {
        int var3 = arg0.method5958();
        this.field321[0] = var3 >> 4;
        this.field321[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field316;
            this.field316[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field316[0] = arg0.method6053();
        this.field316[1] = arg0.method6053();
        int var4 = arg0.method5958();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field321[var5]; var6++) {
                this.field314[var5][0][var6] = arg0.method6053();
                this.field315[var5][0][var6] = arg0.method6053();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field321[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field314[var7][1][var8] = this.field314[var7][0][var8];
                    this.field315[var7][1][var8] = this.field315[var7][0][var8];
                } else {
                    this.field314[var7][1][var8] = arg0.method6053();
                    this.field315[var7][1][var8] = arg0.method6053();
                }
            }
        }
        if (var4 != 0 || this.field316[1] != this.field316[0]) {
            arg1.method498(arg0);
        }
    }
}
