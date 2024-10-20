package deob;

@ObfuscatedName("cq")
public class class59 {

    @ObfuscatedName("cq.ac")
    public int[] field440 = new int[2];

    @ObfuscatedName("cq.ak")
    public int[][][] field435 = new int[2][2][4];

    @ObfuscatedName("cq.ax")
    public int[][][] field434 = new int[2][2][4];

    @ObfuscatedName("cq.ao")
    public int[] field433 = new int[2];

    @ObfuscatedName("cq.ah")
    public static float[][] field436 = new float[2][8];

    @ObfuscatedName("cq.ar")
    public static int[][] field437 = new int[2][8];

    @ObfuscatedName("cq.ac(IIF)F")
    public float method1078(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field434[arg0][1][arg1] - this.field434[arg0][0][arg1]) * arg2 + (float) this.field434[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cq.al(F)F")
    public static float method1079(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cq.ak(IIF)F")
    public float method1070(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field435[arg0][1][arg1] - this.field435[arg0][0][arg1]) * arg2 + (float) this.field435[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1079(var5);
    }

    @ObfuscatedName("cq.ax(IF)I")
    public int method1071(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field433[1] - this.field433[0]) * arg1 + (float) this.field433[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field438 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field439 = (int) (Statics.field438 * 65536.0F);
        }
        if (this.field440[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1078(arg0, 0, arg1);
        field436[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1070(arg0, 0, arg1));
        field436[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field440[arg0]; var6++) {
            float var7 = this.method1078(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1070(arg0, var6, arg1));
            float var9 = var7 * var7;
            field436[arg0][var6 * 2 + 1] = field436[arg0][var6 * 2 - 1] * var9;
            field436[arg0][var6 * 2] = field436[arg0][var6 * 2 - 1] * var8 + field436[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field436[arg0][var10] += field436[arg0][var10 - 1] * var8 + field436[arg0][var10 - 2] * var9;
            }
            field436[arg0][1] += field436[arg0][0] * var8 + var9;
            field436[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field440[0] * 2; var11++) {
                field436[0][var11] *= Statics.field438;
            }
        }
        for (int var12 = 0; var12 < this.field440[arg0] * 2; var12++) {
            field437[arg0][var12] = (int) (field436[arg0][var12] * 65536.0F);
        }
        return this.field440[arg0] * 2;
    }

    @ObfuscatedName("cq.ao(Lul;Lbf;)V")
    public final void method1072(class530 arg0, class44 arg1) {
        int var3 = arg0.method8365();
        this.field440[0] = var3 >> 4;
        this.field440[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field433;
            this.field433[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field433[0] = arg0.method8598();
        this.field433[1] = arg0.method8598();
        int var4 = arg0.method8365();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field440[var5]; var6++) {
                this.field435[var5][0][var6] = arg0.method8598();
                this.field434[var5][0][var6] = arg0.method8598();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field440[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field435[var7][1][var8] = this.field435[var7][0][var8];
                    this.field434[var7][1][var8] = this.field434[var7][0][var8];
                } else {
                    this.field435[var7][1][var8] = arg0.method8598();
                    this.field434[var7][1][var8] = arg0.method8598();
                }
            }
        }
        if (var4 != 0 || this.field433[1] != this.field433[0]) {
            arg1.method806(arg0);
        }
    }
}
