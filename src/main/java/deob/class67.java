package deob;

@ObfuscatedName("bj")
public class class67 {

    @ObfuscatedName("bj.v")
    public int[] field564 = new int[2];

    @ObfuscatedName("bj.f")
    public int[][][] field557 = new int[2][2][4];

    @ObfuscatedName("bj.y")
    public int[][][] field566 = new int[2][2][4];

    @ObfuscatedName("bj.p")
    public int[] field559 = new int[2];

    @ObfuscatedName("bj.j")
    public static float[][] field563 = new float[2][8];

    @ObfuscatedName("bj.r")
    public static int[][] field560 = new int[2][8];

    @ObfuscatedName("bj.v(IIF)F")
    public float method926(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field566[arg0][1][arg1] - this.field566[arg0][0][arg1]) * arg2 + (float) this.field566[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bj.n(F)F")
    public static float method916(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bj.f(IIF)F")
    public float method917(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field557[arg0][1][arg1] - this.field557[arg0][0][arg1]) * arg2 + (float) this.field557[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method916(var5);
    }

    @ObfuscatedName("bj.y(IF)I")
    public int method915(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field559[1] - this.field559[0]) * arg1 + (float) this.field559[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field562 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field558 = (int) (Statics.field562 * 65536.0F);
        }
        if (this.field564[arg0] == 0) {
            return 0;
        }
        float var5 = this.method926(arg0, 0, arg1);
        field563[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method917(arg0, 0, arg1));
        field563[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field564[arg0]; var6++) {
            float var7 = this.method926(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method917(arg0, var6, arg1));
            float var9 = var7 * var7;
            field563[arg0][var6 * 2 + 1] = field563[arg0][var6 * 2 - 1] * var9;
            field563[arg0][var6 * 2] = field563[arg0][var6 * 2 - 1] * var8 + field563[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field563[arg0][var10] += field563[arg0][var10 - 1] * var8 + field563[arg0][var10 - 2] * var9;
            }
            field563[arg0][1] += field563[arg0][0] * var8 + var9;
            field563[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field564[0] * 2; var11++) {
                field563[0][var11] *= Statics.field562;
            }
        }
        for (int var12 = 0; var12 < this.field564[arg0] * 2; var12++) {
            field560[arg0][var12] = (int) (field563[arg0][var12] * 65536.0F);
        }
        return this.field564[arg0] * 2;
    }

    @ObfuscatedName("bj.p(Lnd;Lbt;)V")
    public final void method919(class383 arg0, class54 arg1) {
        int var3 = arg0.method5965();
        this.field564[0] = var3 >> 4;
        this.field564[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field559;
            this.field559[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field559[0] = arg0.method5967();
        this.field559[1] = arg0.method5967();
        int var4 = arg0.method5965();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field564[var5]; var6++) {
                this.field557[var5][0][var6] = arg0.method5967();
                this.field566[var5][0][var6] = arg0.method5967();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field564[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field557[var7][1][var8] = this.field557[var7][0][var8];
                    this.field566[var7][1][var8] = this.field566[var7][0][var8];
                } else {
                    this.field557[var7][1][var8] = arg0.method5967();
                    this.field566[var7][1][var8] = arg0.method5967();
                }
            }
        }
        if (var4 != 0 || this.field559[1] != this.field559[0]) {
            arg1.method679(arg0);
        }
    }
}
