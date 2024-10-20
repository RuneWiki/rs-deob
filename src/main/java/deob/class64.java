package deob;

@ObfuscatedName("bh")
public class class64 {

    @ObfuscatedName("bh.j")
    public int[] field1239 = new int[2];

    @ObfuscatedName("bh.v")
    public int[][][] field1241 = new int[2][2][4];

    @ObfuscatedName("bh.p")
    public int[][][] field1247 = new int[2][2][4];

    @ObfuscatedName("bh.e")
    public int[] field1243 = new int[2];

    @ObfuscatedName("bh.d")
    public static float[][] field1244 = new float[2][8];

    @ObfuscatedName("bh.y")
    public static int[][] field1245 = new int[2][8];

    @ObfuscatedName("bh.j(IIF)F")
    public float method1326(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1247[arg0][1][arg1] - this.field1247[arg0][0][arg1]) * arg2 + (float) this.field1247[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bh.r(F)F")
    public static float method1323(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bh.v(IIF)F")
    public float method1324(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1241[arg0][1][arg1] - this.field1241[arg0][0][arg1]) * arg2 + (float) this.field1241[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1323(var5);
    }

    @ObfuscatedName("bh.p(IF)I")
    public int method1325(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1243[1] - this.field1243[0]) * arg1 + (float) this.field1243[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1246 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1249 = (int) (Statics.field1246 * 65536.0F);
        }
        if (this.field1239[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1326(arg0, 0, arg1);
        field1244[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1324(arg0, 0, arg1));
        field1244[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1239[arg0]; var6++) {
            float var7 = this.method1326(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1324(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1244[arg0][var6 * 2 + 1] = field1244[arg0][var6 * 2 - 1] * var9;
            field1244[arg0][var6 * 2] = field1244[arg0][var6 * 2 - 1] * var8 + field1244[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1244[arg0][var10] += field1244[arg0][var10 - 1] * var8 + field1244[arg0][var10 - 2] * var9;
            }
            field1244[arg0][1] += field1244[arg0][0] * var8 + var9;
            field1244[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1239[0] * 2; var11++) {
                field1244[0][var11] *= Statics.field1246;
            }
        }
        for (int var12 = 0; var12 < this.field1239[arg0] * 2; var12++) {
            field1245[arg0][var12] = (int) (field1244[arg0][var12] * 65536.0F);
        }
        return this.field1239[arg0] * 2;
    }

    @ObfuscatedName("bh.e(Ldn;Lbg;)V")
    public final void method1333(class127 arg0, class56 arg1) {
        int var3 = arg0.method2441();
        this.field1239[0] = var3 >> 4;
        this.field1239[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1243;
            this.field1243[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1243[0] = arg0.method2609();
        this.field1243[1] = arg0.method2609();
        int var4 = arg0.method2441();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1239[var5]; var6++) {
                this.field1241[var5][0][var6] = arg0.method2609();
                this.field1247[var5][0][var6] = arg0.method2609();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1239[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1241[var7][1][var8] = this.field1241[var7][0][var8];
                    this.field1247[var7][1][var8] = this.field1247[var7][0][var8];
                } else {
                    this.field1241[var7][1][var8] = arg0.method2609();
                    this.field1247[var7][1][var8] = arg0.method2609();
                }
            }
        }
        if (var4 != 0 || this.field1243[1] != this.field1243[0]) {
            arg1.method1250(arg0);
        }
    }
}
