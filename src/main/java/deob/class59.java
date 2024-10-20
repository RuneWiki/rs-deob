package deob;

@ObfuscatedName("cr")
public class class59 {

    @ObfuscatedName("cr.au")
    public int[] field438 = new int[2];

    @ObfuscatedName("cr.ao")
    public int[][][] field443 = new int[2][2][4];

    @ObfuscatedName("cr.at")
    public int[][][] field436 = new int[2][2][4];

    @ObfuscatedName("cr.ac")
    public int[] field439 = new int[2];

    @ObfuscatedName("cr.ai")
    public static float[][] field435 = new float[2][8];

    @ObfuscatedName("cr.az")
    public static int[][] field433 = new int[2][8];

    @ObfuscatedName("cr.au(IIF)F")
    public float method1078(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field436[arg0][1][arg1] - this.field436[arg0][0][arg1]) * arg2 + (float) this.field436[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cr.ae(F)F")
    public static float method1081(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cr.ao(IIF)F")
    public float method1080(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field443[arg0][1][arg1] - this.field443[arg0][0][arg1]) * arg2 + (float) this.field443[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1081(var5);
    }

    @ObfuscatedName("cr.at(IF)I")
    public int method1086(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field439[1] - this.field439[0]) * arg1 + (float) this.field439[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field440 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field441 = (int) (Statics.field440 * 65536.0F);
        }
        if (this.field438[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1078(arg0, 0, arg1);
        field435[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1080(arg0, 0, arg1));
        field435[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field438[arg0]; var6++) {
            float var7 = this.method1078(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1080(arg0, var6, arg1));
            float var9 = var7 * var7;
            field435[arg0][var6 * 2 + 1] = field435[arg0][var6 * 2 - 1] * var9;
            field435[arg0][var6 * 2] = field435[arg0][var6 * 2 - 1] * var8 + field435[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field435[arg0][var10] += field435[arg0][var10 - 1] * var8 + field435[arg0][var10 - 2] * var9;
            }
            field435[arg0][1] += field435[arg0][0] * var8 + var9;
            field435[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field438[0] * 2; var11++) {
                field435[0][var11] *= Statics.field440;
            }
        }
        for (int var12 = 0; var12 < this.field438[arg0] * 2; var12++) {
            field433[arg0][var12] = (int) (field435[arg0][var12] * 65536.0F);
        }
        return this.field438[arg0] * 2;
    }

    @ObfuscatedName("cr.ac(Ltm;Lbr;)V")
    public final void method1077(class515 arg0, class44 arg1) {
        int var3 = arg0.method8300();
        this.field438[0] = var3 >> 4;
        this.field438[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field439;
            this.field439[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field439[0] = arg0.method8448();
        this.field439[1] = arg0.method8448();
        int var4 = arg0.method8300();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field438[var5]; var6++) {
                this.field443[var5][0][var6] = arg0.method8448();
                this.field436[var5][0][var6] = arg0.method8448();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field438[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field443[var7][1][var8] = this.field443[var7][0][var8];
                    this.field436[var7][1][var8] = this.field436[var7][0][var8];
                } else {
                    this.field443[var7][1][var8] = arg0.method8448();
                    this.field436[var7][1][var8] = arg0.method8448();
                }
            }
        }
        if (var4 != 0 || this.field439[1] != this.field439[0]) {
            arg1.method842(arg0);
        }
    }
}
