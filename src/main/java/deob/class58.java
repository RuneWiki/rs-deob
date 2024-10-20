package deob;

@ObfuscatedName("bw")
public class class58 {

    @ObfuscatedName("bw.h")
    public int[] field447 = new int[2];

    @ObfuscatedName("bw.v")
    public int[][][] field452 = new int[2][2][4];

    @ObfuscatedName("bw.x")
    public int[][][] field444 = new int[2][2][4];

    @ObfuscatedName("bw.m")
    public int[] field445 = new int[2];

    @ObfuscatedName("bw.q")
    public static float[][] field446 = new float[2][8];

    @ObfuscatedName("bw.f")
    public static int[][] field442 = new int[2][8];

    @ObfuscatedName("bw.h(IIF)F")
    public float method1061(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field444[arg0][1][arg1] - this.field444[arg0][0][arg1]) * arg2 + (float) this.field444[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bw.e(F)F")
    public static float method1064(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bw.v(IIF)F")
    public float method1066(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field452[arg0][1][arg1] - this.field452[arg0][0][arg1]) * arg2 + (float) this.field452[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1064(var5);
    }

    @ObfuscatedName("bw.x(IF)I")
    public int method1063(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field445[1] - this.field445[0]) * arg1 + (float) this.field445[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field449 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field441 = (int) (Statics.field449 * 65536.0F);
        }
        if (this.field447[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1061(arg0, 0, arg1);
        field446[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1066(arg0, 0, arg1));
        field446[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field447[arg0]; var6++) {
            float var7 = this.method1061(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1066(arg0, var6, arg1));
            float var9 = var7 * var7;
            field446[arg0][var6 * 2 + 1] = field446[arg0][var6 * 2 - 1] * var9;
            field446[arg0][var6 * 2] = field446[arg0][var6 * 2 - 1] * var8 + field446[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field446[arg0][var10] += field446[arg0][var10 - 1] * var8 + field446[arg0][var10 - 2] * var9;
            }
            field446[arg0][1] += field446[arg0][0] * var8 + var9;
            field446[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field447[0] * 2; var11++) {
                field446[0][var11] *= Statics.field449;
            }
        }
        for (int var12 = 0; var12 < this.field447[arg0] * 2; var12++) {
            field442[arg0][var12] = (int) (field446[arg0][var12] * 65536.0F);
        }
        return this.field447[arg0] * 2;
    }

    @ObfuscatedName("bw.m(Lqy;Lah;)V")
    public final void method1065(class467 arg0, class45 arg1) {
        int var3 = arg0.method7792();
        this.field447[0] = var3 >> 4;
        this.field447[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field445;
            this.field445[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field445[0] = arg0.method7794();
        this.field445[1] = arg0.method7794();
        int var4 = arg0.method7792();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field447[var5]; var6++) {
                this.field452[var5][0][var6] = arg0.method7794();
                this.field444[var5][0][var6] = arg0.method7794();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field447[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field452[var7][1][var8] = this.field452[var7][0][var8];
                    this.field444[var7][1][var8] = this.field444[var7][0][var8];
                } else {
                    this.field452[var7][1][var8] = arg0.method7794();
                    this.field444[var7][1][var8] = arg0.method7794();
                }
            }
        }
        if (var4 != 0 || this.field445[1] != this.field445[0]) {
            arg1.method822(arg0);
        }
    }
}
