package deob;

@ObfuscatedName("cn")
public class class57 {

    @ObfuscatedName("cn.af")
    public int[] field429 = new int[2];

    @ObfuscatedName("cn.aw")
    public int[][][] field423 = new int[2][2][4];

    @ObfuscatedName("cn.ac")
    public int[][][] field426 = new int[2][2][4];

    @ObfuscatedName("cn.au")
    public int[] field427 = new int[2];

    @ObfuscatedName("cn.ab")
    public static float[][] field425 = new float[2][8];

    @ObfuscatedName("cn.aq")
    public static int[][] field434 = new int[2][8];

    @ObfuscatedName("cn.af(IIF)F")
    public float method1067(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field426[arg0][1][arg1] - this.field426[arg0][0][arg1]) * arg2 + (float) this.field426[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cn.an(F)F")
    public static float method1068(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cn.aw(IIF)F")
    public float method1069(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field423[arg0][1][arg1] - this.field423[arg0][0][arg1]) * arg2 + (float) this.field423[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1068(var5);
    }

    @ObfuscatedName("cn.ac(IF)I")
    public int method1082(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field427[1] - this.field427[0]) * arg1 + (float) this.field427[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field430 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field431 = (int) (Statics.field430 * 65536.0F);
        }
        if (this.field429[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1067(arg0, 0, arg1);
        field425[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1069(arg0, 0, arg1));
        field425[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field429[arg0]; var6++) {
            float var7 = this.method1067(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1069(arg0, var6, arg1));
            float var9 = var7 * var7;
            field425[arg0][var6 * 2 + 1] = field425[arg0][var6 * 2 - 1] * var9;
            field425[arg0][var6 * 2] = field425[arg0][var6 * 2 - 1] * var8 + field425[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field425[arg0][var10] += field425[arg0][var10 - 1] * var8 + field425[arg0][var10 - 2] * var9;
            }
            field425[arg0][1] += field425[arg0][0] * var8 + var9;
            field425[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field429[0] * 2; var11++) {
                field425[0][var11] *= Statics.field430;
            }
        }
        for (int var12 = 0; var12 < this.field429[arg0] * 2; var12++) {
            field434[arg0][var12] = (int) (field425[arg0][var12] * 65536.0F);
        }
        return this.field429[arg0] * 2;
    }

    @ObfuscatedName("cn.au(Lsg;Lbf;)V")
    public final void method1066(class489 arg0, class44 arg1) {
        int var3 = arg0.method8248();
        this.field429[0] = var3 >> 4;
        this.field429[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field427;
            this.field427[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field427[0] = arg0.method8250();
        this.field427[1] = arg0.method8250();
        int var4 = arg0.method8248();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field429[var5]; var6++) {
                this.field423[var5][0][var6] = arg0.method8250();
                this.field426[var5][0][var6] = arg0.method8250();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field429[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field423[var7][1][var8] = this.field423[var7][0][var8];
                    this.field426[var7][1][var8] = this.field426[var7][0][var8];
                } else {
                    this.field423[var7][1][var8] = arg0.method8250();
                    this.field426[var7][1][var8] = arg0.method8250();
                }
            }
        }
        if (var4 != 0 || this.field427[1] != this.field427[0]) {
            arg1.method849(arg0);
        }
    }
}
