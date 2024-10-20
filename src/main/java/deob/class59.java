package deob;

@ObfuscatedName("cs")
public class class59 {

    @ObfuscatedName("cs.ak")
    public int[] field415 = new int[2];

    @ObfuscatedName("cs.aj")
    public int[][][] field417 = new int[2][2][4];

    @ObfuscatedName("cs.az")
    public int[][][] field418 = new int[2][2][4];

    @ObfuscatedName("cs.af")
    public int[] field419 = new int[2];

    @ObfuscatedName("cs.aa")
    public static float[][] field423 = new float[2][8];

    @ObfuscatedName("cs.at")
    public static int[][] field421 = new int[2][8];

    @ObfuscatedName("cs.ak(IIF)F")
    public float method1055(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field418[arg0][1][arg1] - this.field418[arg0][0][arg1]) * arg2 + (float) this.field418[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cs.al(F)F")
    public static float method1057(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cs.aj(IIF)F")
    public float method1058(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field417[arg0][1][arg1] - this.field417[arg0][0][arg1]) * arg2 + (float) this.field417[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1057(var5);
    }

    @ObfuscatedName("cs.az(IF)I")
    public int method1059(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field419[1] - this.field419[0]) * arg1 + (float) this.field419[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field422 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field424 = (int) (Statics.field422 * 65536.0F);
        }
        if (this.field415[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1055(arg0, 0, arg1);
        field423[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1058(arg0, 0, arg1));
        field423[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field415[arg0]; var6++) {
            float var7 = this.method1055(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1058(arg0, var6, arg1));
            float var9 = var7 * var7;
            field423[arg0][var6 * 2 + 1] = field423[arg0][var6 * 2 - 1] * var9;
            field423[arg0][var6 * 2] = field423[arg0][var6 * 2 - 1] * var8 + field423[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field423[arg0][var10] += field423[arg0][var10 - 1] * var8 + field423[arg0][var10 - 2] * var9;
            }
            field423[arg0][1] += field423[arg0][0] * var8 + var9;
            field423[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field415[0] * 2; var11++) {
                field423[0][var11] *= Statics.field422;
            }
        }
        for (int var12 = 0; var12 < this.field415[arg0] * 2; var12++) {
            field421[arg0][var12] = (int) (field423[arg0][var12] * 65536.0F);
        }
        return this.field415[arg0] * 2;
    }

    @ObfuscatedName("cs.af(Lua;Lbv;)V")
    public final void method1060(class546 arg0, class44 arg1) {
        int var3 = arg0.method8796();
        this.field415[0] = var3 >> 4;
        this.field415[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field419;
            this.field419[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field419[0] = arg0.method8798();
        this.field419[1] = arg0.method8798();
        int var4 = arg0.method8796();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field415[var5]; var6++) {
                this.field417[var5][0][var6] = arg0.method8798();
                this.field418[var5][0][var6] = arg0.method8798();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field415[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field417[var7][1][var8] = this.field417[var7][0][var8];
                    this.field418[var7][1][var8] = this.field418[var7][0][var8];
                } else {
                    this.field417[var7][1][var8] = arg0.method8798();
                    this.field418[var7][1][var8] = arg0.method8798();
                }
            }
        }
        if (var4 != 0 || this.field419[1] != this.field419[0]) {
            arg1.method812(arg0);
        }
    }
}
