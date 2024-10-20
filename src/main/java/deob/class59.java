package deob;

@ObfuscatedName("cz")
public class class59 {

    @ObfuscatedName("cz.aq")
    public int[] field418 = new int[2];

    @ObfuscatedName("cz.al")
    public int[][][] field413 = new int[2][2][4];

    @ObfuscatedName("cz.ai")
    public int[][][] field420 = new int[2][2][4];

    @ObfuscatedName("cz.ar")
    public int[] field415 = new int[2];

    @ObfuscatedName("cz.as")
    public static float[][] field416 = new float[2][8];

    @ObfuscatedName("cz.aa")
    public static int[][] field417 = new int[2][8];

    @ObfuscatedName("cz.aq(IIF)F")
    public float method1039(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field420[arg0][1][arg1] - this.field420[arg0][0][arg1]) * arg2 + (float) this.field420[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cz.aw(F)F")
    public static float method1040(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cz.al(IIF)F")
    public float method1051(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field413[arg0][1][arg1] - this.field413[arg0][0][arg1]) * arg2 + (float) this.field413[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1040(var5);
    }

    @ObfuscatedName("cz.ai(IF)I")
    public int method1038(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field415[1] - this.field415[0]) * arg1 + (float) this.field415[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field419 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field422 = (int) (Statics.field419 * 65536.0F);
        }
        if (this.field418[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1039(arg0, 0, arg1);
        field416[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1051(arg0, 0, arg1));
        field416[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field418[arg0]; var6++) {
            float var7 = this.method1039(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1051(arg0, var6, arg1));
            float var9 = var7 * var7;
            field416[arg0][var6 * 2 + 1] = field416[arg0][var6 * 2 - 1] * var9;
            field416[arg0][var6 * 2] = field416[arg0][var6 * 2 - 1] * var8 + field416[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field416[arg0][var10] += field416[arg0][var10 - 1] * var8 + field416[arg0][var10 - 2] * var9;
            }
            field416[arg0][1] += field416[arg0][0] * var8 + var9;
            field416[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field418[0] * 2; var11++) {
                field416[0][var11] *= Statics.field419;
            }
        }
        for (int var12 = 0; var12 < this.field418[arg0] * 2; var12++) {
            field417[arg0][var12] = (int) (field416[arg0][var12] * 65536.0F);
        }
        return this.field418[arg0] * 2;
    }

    @ObfuscatedName("cz.ar(Luq;Lbg;)V")
    public final void method1043(class534 arg0, class44 arg1) {
        int var3 = arg0.method8591();
        this.field418[0] = var3 >> 4;
        this.field418[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field415;
            this.field415[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field415[0] = arg0.method8593();
        this.field415[1] = arg0.method8593();
        int var4 = arg0.method8591();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field418[var5]; var6++) {
                this.field413[var5][0][var6] = arg0.method8593();
                this.field420[var5][0][var6] = arg0.method8593();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field418[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field413[var7][1][var8] = this.field413[var7][0][var8];
                    this.field420[var7][1][var8] = this.field420[var7][0][var8];
                } else {
                    this.field413[var7][1][var8] = arg0.method8593();
                    this.field420[var7][1][var8] = arg0.method8593();
                }
            }
        }
        if (var4 != 0 || this.field415[1] != this.field415[0]) {
            arg1.method766(arg0);
        }
    }
}
