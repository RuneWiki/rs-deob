package deob;

@ObfuscatedName("cp")
public class class59 {

    @ObfuscatedName("cp.at")
    public int[] field426 = new int[2];

    @ObfuscatedName("cp.av")
    public int[][][] field427 = new int[2][2][4];

    @ObfuscatedName("cp.as")
    public int[][][] field420 = new int[2][2][4];

    @ObfuscatedName("cp.ax")
    public int[] field419 = new int[2];

    @ObfuscatedName("cp.ap")
    public static float[][] field422 = new float[2][8];

    @ObfuscatedName("cp.ab")
    public static int[][] field423 = new int[2][8];

    @ObfuscatedName("cp.at(IIF)F")
    public float method1025(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field420[arg0][1][arg1] - this.field420[arg0][0][arg1]) * arg2 + (float) this.field420[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cp.an(F)F")
    public static float method1026(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cp.av(IIF)F")
    public float method1027(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field427[arg0][1][arg1] - this.field427[arg0][0][arg1]) * arg2 + (float) this.field427[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1026(var5);
    }

    @ObfuscatedName("cp.as(IF)I")
    public int method1028(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field419[1] - this.field419[0]) * arg1 + (float) this.field419[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field425 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field421 = (int) (Statics.field425 * 65536.0F);
        }
        if (this.field426[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1025(arg0, 0, arg1);
        field422[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1027(arg0, 0, arg1));
        field422[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field426[arg0]; var6++) {
            float var7 = this.method1025(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1027(arg0, var6, arg1));
            float var9 = var7 * var7;
            field422[arg0][var6 * 2 + 1] = field422[arg0][var6 * 2 - 1] * var9;
            field422[arg0][var6 * 2] = field422[arg0][var6 * 2 - 1] * var8 + field422[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field422[arg0][var10] += field422[arg0][var10 - 1] * var8 + field422[arg0][var10 - 2] * var9;
            }
            field422[arg0][1] += field422[arg0][0] * var8 + var9;
            field422[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field426[0] * 2; var11++) {
                field422[0][var11] *= Statics.field425;
            }
        }
        for (int var12 = 0; var12 < this.field426[arg0] * 2; var12++) {
            field423[arg0][var12] = (int) (field422[arg0][var12] * 65536.0F);
        }
        return this.field426[arg0] * 2;
    }

    @ObfuscatedName("cp.ax(Ltz;Lbk;)V")
    public final void method1029(class501 arg0, class44 arg1) {
        int var3 = arg0.method8129();
        this.field426[0] = var3 >> 4;
        this.field426[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field419;
            this.field419[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field419[0] = arg0.method8195();
        this.field419[1] = arg0.method8195();
        int var4 = arg0.method8129();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field426[var5]; var6++) {
                this.field427[var5][0][var6] = arg0.method8195();
                this.field420[var5][0][var6] = arg0.method8195();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field426[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field427[var7][1][var8] = this.field427[var7][0][var8];
                    this.field420[var7][1][var8] = this.field420[var7][0][var8];
                } else {
                    this.field427[var7][1][var8] = arg0.method8195();
                    this.field420[var7][1][var8] = arg0.method8195();
                }
            }
        }
        if (var4 != 0 || this.field419[1] != this.field419[0]) {
            arg1.method775(arg0);
        }
    }
}
