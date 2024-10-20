package deob;

@ObfuscatedName("ai")
public class class27 {

    @ObfuscatedName("ai.q")
    public int[] field339 = new int[2];

    @ObfuscatedName("ai.a")
    public int[][][] field346 = new int[2][2][4];

    @ObfuscatedName("ai.o")
    public int[][][] field340 = new int[2][2][4];

    @ObfuscatedName("ai.c")
    public int[] field341 = new int[2];

    @ObfuscatedName("ai.h")
    public static float[][] field342 = new float[2][8];

    @ObfuscatedName("ai.r")
    public static int[][] field343 = new int[2][8];

    @ObfuscatedName("ai.q(IIF)F")
    public float method308(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field340[arg0][1][arg1] - this.field340[arg0][0][arg1]) * arg2 + (float) this.field340[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ai.l(F)F")
    public static float method309(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ai.a(IIF)F")
    public float method320(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field346[arg0][1][arg1] - this.field346[arg0][0][arg1]) * arg2 + (float) this.field346[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method309(var5);
    }

    @ObfuscatedName("ai.o(IF)I")
    public int method318(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field341[1] - this.field341[0]) * arg1 + (float) this.field341[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field347 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field345 = (int) (Statics.field347 * 65536.0F);
        }
        if (this.field339[arg0] == 0) {
            return 0;
        }
        float var5 = this.method308(arg0, 0, arg1);
        field342[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method320(arg0, 0, arg1));
        field342[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field339[arg0]; var6++) {
            float var7 = this.method308(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method320(arg0, var6, arg1));
            float var9 = var7 * var7;
            field342[arg0][var6 * 2 + 1] = field342[arg0][var6 * 2 - 1] * var9;
            field342[arg0][var6 * 2] = field342[arg0][var6 * 2 - 1] * var8 + field342[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field342[arg0][var10] += field342[arg0][var10 - 1] * var8 + field342[arg0][var10 - 2] * var9;
            }
            field342[arg0][1] += field342[arg0][0] * var8 + var9;
            field342[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field339[0] * 2; var11++) {
                field342[0][var11] *= Statics.field347;
            }
        }
        for (int var12 = 0; var12 < this.field339[arg0] * 2; var12++) {
            field343[arg0][var12] = (int) (field342[arg0][var12] * 65536.0F);
        }
        return this.field339[arg0] * 2;
    }

    @ObfuscatedName("ai.c(Let;Lp;)V")
    public final void method311(class136 arg0, class21 arg1) {
        int var3 = arg0.method1602();
        this.field339[0] = var3 >> 4;
        this.field339[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field341;
            this.field341[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field341[0] = arg0.method1712();
        this.field341[1] = arg0.method1712();
        int var4 = arg0.method1602();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field339[var5]; var6++) {
                this.field346[var5][0][var6] = arg0.method1712();
                this.field340[var5][0][var6] = arg0.method1712();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field339[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field346[var7][1][var8] = this.field346[var7][0][var8];
                    this.field340[var7][1][var8] = this.field340[var7][0][var8];
                } else {
                    this.field346[var7][1][var8] = arg0.method1712();
                    this.field340[var7][1][var8] = arg0.method1712();
                }
            }
        }
        if (var4 != 0 || this.field341[1] != this.field341[0]) {
            arg1.method253(arg0);
        }
    }
}
