package deob;

@ObfuscatedName("cj")
public class class57 {

    @ObfuscatedName("cj.aj")
    public int[] field410 = new int[2];

    @ObfuscatedName("cj.ac")
    public int[][][] field417 = new int[2][2][4];

    @ObfuscatedName("cj.ab")
    public int[][][] field411 = new int[2][2][4];

    @ObfuscatedName("cj.an")
    public int[] field412 = new int[2];

    @ObfuscatedName("cj.ao")
    public static float[][] field408 = new float[2][8];

    @ObfuscatedName("cj.av")
    public static int[][] field414 = new int[2][8];

    @ObfuscatedName("cj.aj(IIF)F")
    public float method1057(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field411[arg0][1][arg1] - this.field411[arg0][0][arg1]) * arg2 + (float) this.field411[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cj.al(F)F")
    public static float method1067(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cj.ac(IIF)F")
    public float method1060(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field417[arg0][1][arg1] - this.field417[arg0][0][arg1]) * arg2 + (float) this.field417[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1067(var5);
    }

    @ObfuscatedName("cj.ab(IF)I")
    public int method1064(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field412[1] - this.field412[0]) * arg1 + (float) this.field412[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field415 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field416 = (int) (Statics.field415 * 65536.0F);
        }
        if (this.field410[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1057(arg0, 0, arg1);
        field408[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1060(arg0, 0, arg1));
        field408[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field410[arg0]; var6++) {
            float var7 = this.method1057(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1060(arg0, var6, arg1));
            float var9 = var7 * var7;
            field408[arg0][var6 * 2 + 1] = field408[arg0][var6 * 2 - 1] * var9;
            field408[arg0][var6 * 2] = field408[arg0][var6 * 2 - 1] * var8 + field408[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field408[arg0][var10] += field408[arg0][var10 - 1] * var8 + field408[arg0][var10 - 2] * var9;
            }
            field408[arg0][1] += field408[arg0][0] * var8 + var9;
            field408[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field410[0] * 2; var11++) {
                field408[0][var11] *= Statics.field415;
            }
        }
        for (int var12 = 0; var12 < this.field410[arg0] * 2; var12++) {
            field414[arg0][var12] = (int) (field408[arg0][var12] * 65536.0F);
        }
        return this.field410[arg0] * 2;
    }

    @ObfuscatedName("cj.an(Lsy;Lby;)V")
    public final void method1059(class478 arg0, class44 arg1) {
        int var3 = arg0.method7909();
        this.field410[0] = var3 >> 4;
        this.field410[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field412;
            this.field412[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field412[0] = arg0.method7905();
        this.field412[1] = arg0.method7905();
        int var4 = arg0.method7909();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field410[var5]; var6++) {
                this.field417[var5][0][var6] = arg0.method7905();
                this.field411[var5][0][var6] = arg0.method7905();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field410[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field417[var7][1][var8] = this.field417[var7][0][var8];
                    this.field411[var7][1][var8] = this.field411[var7][0][var8];
                } else {
                    this.field417[var7][1][var8] = arg0.method7905();
                    this.field411[var7][1][var8] = arg0.method7905();
                }
            }
        }
        if (var4 != 0 || this.field412[1] != this.field412[0]) {
            arg1.method790(arg0);
        }
    }
}
