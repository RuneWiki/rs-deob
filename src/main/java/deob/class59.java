package deob;

@ObfuscatedName("cn")
public class class59 {

    @ObfuscatedName("cn.aq")
    public int[] field401 = new int[2];

    @ObfuscatedName("cn.ag")
    public int[][][] field392 = new int[2][2][4];

    @ObfuscatedName("cn.ak")
    public int[][][] field393 = new int[2][2][4];

    @ObfuscatedName("cn.ap")
    public int[] field394 = new int[2];

    @ObfuscatedName("cn.an")
    public static float[][] field400 = new float[2][8];

    @ObfuscatedName("cn.aj")
    public static int[][] field396 = new int[2][8];

    @ObfuscatedName("cn.aq(IIF)F")
    public float method1072(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field393[arg0][1][arg1] - this.field393[arg0][0][arg1]) * arg2 + (float) this.field393[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cn.ad(F)F")
    public static float method1073(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cn.ag(IIF)F")
    public float method1078(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field392[arg0][1][arg1] - this.field392[arg0][0][arg1]) * arg2 + (float) this.field392[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1073(var5);
    }

    @ObfuscatedName("cn.ak(IF)I")
    public int method1074(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field394[1] - this.field394[0]) * arg1 + (float) this.field394[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field397 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field398 = (int) (Statics.field397 * 65536.0F);
        }
        if (this.field401[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1072(arg0, 0, arg1);
        field400[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1078(arg0, 0, arg1));
        field400[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field401[arg0]; var6++) {
            float var7 = this.method1072(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1078(arg0, var6, arg1));
            float var9 = var7 * var7;
            field400[arg0][var6 * 2 + 1] = field400[arg0][var6 * 2 - 1] * var9;
            field400[arg0][var6 * 2] = field400[arg0][var6 * 2 - 1] * var8 + field400[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field400[arg0][var10] += field400[arg0][var10 - 1] * var8 + field400[arg0][var10 - 2] * var9;
            }
            field400[arg0][1] += field400[arg0][0] * var8 + var9;
            field400[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field401[0] * 2; var11++) {
                field400[0][var11] *= Statics.field397;
            }
        }
        for (int var12 = 0; var12 < this.field401[arg0] * 2; var12++) {
            field396[arg0][var12] = (int) (field400[arg0][var12] * 65536.0F);
        }
        return this.field401[arg0] * 2;
    }

    @ObfuscatedName("cn.ap(Lvp;Lbb;)V")
    public final void method1075(class547 arg0, class44 arg1) {
        int var3 = arg0.method8804();
        this.field401[0] = var3 >> 4;
        this.field401[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field394;
            this.field394[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field394[0] = arg0.method8899();
        this.field394[1] = arg0.method8899();
        int var4 = arg0.method8804();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field401[var5]; var6++) {
                this.field392[var5][0][var6] = arg0.method8899();
                this.field393[var5][0][var6] = arg0.method8899();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field401[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field392[var7][1][var8] = this.field392[var7][0][var8];
                    this.field393[var7][1][var8] = this.field393[var7][0][var8];
                } else {
                    this.field392[var7][1][var8] = arg0.method8899();
                    this.field393[var7][1][var8] = arg0.method8899();
                }
            }
        }
        if (var4 != 0 || this.field394[1] != this.field394[0]) {
            arg1.method829(arg0);
        }
    }
}
