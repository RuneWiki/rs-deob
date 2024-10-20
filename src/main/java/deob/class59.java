package deob;

@ObfuscatedName("cx")
public class class59 {

    @ObfuscatedName("cx.ac")
    public int[] field411 = new int[2];

    @ObfuscatedName("cx.ag")
    public int[][][] field405 = new int[2][2][4];

    @ObfuscatedName("cx.am")
    public int[][][] field410 = new int[2][2][4];

    @ObfuscatedName("cx.ax")
    public int[] field406 = new int[2];

    @ObfuscatedName("cx.aq")
    public static float[][] field407 = new float[2][8];

    @ObfuscatedName("cx.af")
    public static int[][] field408 = new int[2][8];

    @ObfuscatedName("cx.ac(IIF)F")
    public float method1090(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field410[arg0][1][arg1] - this.field410[arg0][0][arg1]) * arg2 + (float) this.field410[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cx.ae(F)F")
    public static float method1091(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cx.ag(IIF)F")
    public float method1089(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field405[arg0][1][arg1] - this.field405[arg0][0][arg1]) * arg2 + (float) this.field405[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1091(var5);
    }

    @ObfuscatedName("cx.am(IF)I")
    public int method1093(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field406[1] - this.field406[0]) * arg1 + (float) this.field406[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field404 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field412 = (int) (Statics.field404 * 65536.0F);
        }
        if (this.field411[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1090(arg0, 0, arg1);
        field407[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1089(arg0, 0, arg1));
        field407[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field411[arg0]; var6++) {
            float var7 = this.method1090(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1089(arg0, var6, arg1));
            float var9 = var7 * var7;
            field407[arg0][var6 * 2 + 1] = field407[arg0][var6 * 2 - 1] * var9;
            field407[arg0][var6 * 2] = field407[arg0][var6 * 2 - 1] * var8 + field407[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field407[arg0][var10] += field407[arg0][var10 - 1] * var8 + field407[arg0][var10 - 2] * var9;
            }
            field407[arg0][1] += field407[arg0][0] * var8 + var9;
            field407[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field411[0] * 2; var11++) {
                field407[0][var11] *= Statics.field404;
            }
        }
        for (int var12 = 0; var12 < this.field411[arg0] * 2; var12++) {
            field408[arg0][var12] = (int) (field407[arg0][var12] * 65536.0F);
        }
        return this.field411[arg0] * 2;
    }

    @ObfuscatedName("cx.ax(Lvf;Lbu;)V")
    public final void method1094(class551 arg0, class44 arg1) {
        int var3 = arg0.method8955();
        this.field411[0] = var3 >> 4;
        this.field411[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field406;
            this.field406[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field406[0] = arg0.method9119();
        this.field406[1] = arg0.method9119();
        int var4 = arg0.method8955();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field411[var5]; var6++) {
                this.field405[var5][0][var6] = arg0.method9119();
                this.field410[var5][0][var6] = arg0.method9119();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field411[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field405[var7][1][var8] = this.field405[var7][0][var8];
                    this.field410[var7][1][var8] = this.field410[var7][0][var8];
                } else {
                    this.field405[var7][1][var8] = arg0.method9119();
                    this.field410[var7][1][var8] = arg0.method9119();
                }
            }
        }
        if (var4 != 0 || this.field406[1] != this.field406[0]) {
            arg1.method836(arg0);
        }
    }
}
