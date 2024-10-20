package deob;

@ObfuscatedName("bz")
public class class54 {

    @ObfuscatedName("bz.c")
    public int[] field405 = new int[2];

    @ObfuscatedName("bz.q")
    public int[][][] field407 = new int[2][2][4];

    @ObfuscatedName("bz.f")
    public int[][][] field408 = new int[2][2][4];

    @ObfuscatedName("bz.j")
    public int[] field409 = new int[2];

    @ObfuscatedName("bz.e")
    public static float[][] field414 = new float[2][8];

    @ObfuscatedName("bz.g")
    public static int[][] field411 = new int[2][8];

    @ObfuscatedName("bz.c(IIF)F")
    public float method952(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field408[arg0][1][arg1] - this.field408[arg0][0][arg1]) * arg2 + (float) this.field408[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bz.v(F)F")
    public static float method965(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bz.q(IIF)F")
    public float method953(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field407[arg0][1][arg1] - this.field407[arg0][0][arg1]) * arg2 + (float) this.field407[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method965(var5);
    }

    @ObfuscatedName("bz.f(IF)I")
    public int method960(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field409[1] - this.field409[0]) * arg1 + (float) this.field409[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field410 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field413 = (int) (Statics.field410 * 65536.0F);
        }
        if (this.field405[arg0] == 0) {
            return 0;
        }
        float var5 = this.method952(arg0, 0, arg1);
        field414[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method953(arg0, 0, arg1));
        field414[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field405[arg0]; var6++) {
            float var7 = this.method952(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method953(arg0, var6, arg1));
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
            for (int var11 = 0; var11 < this.field405[0] * 2; var11++) {
                field414[0][var11] *= Statics.field410;
            }
        }
        for (int var12 = 0; var12 < this.field405[arg0] * 2; var12++) {
            field411[arg0][var12] = (int) (field414[arg0][var12] * 65536.0F);
        }
        return this.field405[arg0] * 2;
    }

    @ObfuscatedName("bz.j(Lqt;Lat;)V")
    public final void method955(class443 arg0, class41 arg1) {
        int var3 = arg0.method7047();
        this.field405[0] = var3 >> 4;
        this.field405[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field409;
            this.field409[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field409[0] = arg0.method7049();
        this.field409[1] = arg0.method7049();
        int var4 = arg0.method7047();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field405[var5]; var6++) {
                this.field407[var5][0][var6] = arg0.method7049();
                this.field408[var5][0][var6] = arg0.method7049();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field405[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field407[var7][1][var8] = this.field407[var7][0][var8];
                    this.field408[var7][1][var8] = this.field408[var7][0][var8];
                } else {
                    this.field407[var7][1][var8] = arg0.method7049();
                    this.field408[var7][1][var8] = arg0.method7049();
                }
            }
        }
        if (var4 != 0 || this.field409[1] != this.field409[0]) {
            arg1.method706(arg0);
        }
    }
}
