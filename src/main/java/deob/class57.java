package deob;

@ObfuscatedName("bm")
public class class57 {

    @ObfuscatedName("bm.f")
    public int[] field439 = new int[2];

    @ObfuscatedName("bm.v")
    public int[][][] field431 = new int[2][2][4];

    @ObfuscatedName("bm.s")
    public int[][][] field429 = new int[2][2][4];

    @ObfuscatedName("bm.z")
    public int[] field433 = new int[2];

    @ObfuscatedName("bm.j")
    public static float[][] field434 = new float[2][8];

    @ObfuscatedName("bm.i")
    public static int[][] field435 = new int[2][8];

    @ObfuscatedName("bm.f(IIF)F")
    public float method1058(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field429[arg0][1][arg1] - this.field429[arg0][0][arg1]) * arg2 + (float) this.field429[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bm.w(F)F")
    public static float method1059(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bm.v(IIF)F")
    public float method1062(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field431[arg0][1][arg1] - this.field431[arg0][0][arg1]) * arg2 + (float) this.field431[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1059(var5);
    }

    @ObfuscatedName("bm.s(IF)I")
    public int method1061(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field433[1] - this.field433[0]) * arg1 + (float) this.field433[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field430 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field437 = (int) (Statics.field430 * 65536.0F);
        }
        if (this.field439[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1058(arg0, 0, arg1);
        field434[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1062(arg0, 0, arg1));
        field434[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field439[arg0]; var6++) {
            float var7 = this.method1058(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1062(arg0, var6, arg1));
            float var9 = var7 * var7;
            field434[arg0][var6 * 2 + 1] = field434[arg0][var6 * 2 - 1] * var9;
            field434[arg0][var6 * 2] = field434[arg0][var6 * 2 - 1] * var8 + field434[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field434[arg0][var10] += field434[arg0][var10 - 1] * var8 + field434[arg0][var10 - 2] * var9;
            }
            field434[arg0][1] += field434[arg0][0] * var8 + var9;
            field434[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field439[0] * 2; var11++) {
                field434[0][var11] *= Statics.field430;
            }
        }
        for (int var12 = 0; var12 < this.field439[arg0] * 2; var12++) {
            field435[arg0][var12] = (int) (field434[arg0][var12] * 65536.0F);
        }
        return this.field439[arg0] * 2;
    }

    @ObfuscatedName("bm.z(Lrd;Lau;)V")
    public final void method1071(class474 arg0, class44 arg1) {
        int var3 = arg0.method7964();
        this.field439[0] = var3 >> 4;
        this.field439[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field433;
            this.field433[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field433[0] = arg0.method8032();
        this.field433[1] = arg0.method8032();
        int var4 = arg0.method7964();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field439[var5]; var6++) {
                this.field431[var5][0][var6] = arg0.method8032();
                this.field429[var5][0][var6] = arg0.method8032();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field439[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field431[var7][1][var8] = this.field431[var7][0][var8];
                    this.field429[var7][1][var8] = this.field429[var7][0][var8];
                } else {
                    this.field431[var7][1][var8] = arg0.method8032();
                    this.field429[var7][1][var8] = arg0.method8032();
                }
            }
        }
        if (var4 != 0 || this.field433[1] != this.field433[0]) {
            arg1.method813(arg0);
        }
    }
}
