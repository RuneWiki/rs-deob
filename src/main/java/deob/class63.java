package deob;

@ObfuscatedName("bt")
public class class63 {

    @ObfuscatedName("bt.v")
    public int[] field1224 = new int[2];

    @ObfuscatedName("bt.n")
    public int[][][] field1230 = new int[2][2][4];

    @ObfuscatedName("bt.c")
    public int[][][] field1223 = new int[2][2][4];

    @ObfuscatedName("bt.r")
    public int[] field1226 = new int[2];

    @ObfuscatedName("bt.k")
    public static float[][] field1225 = new float[2][8];

    @ObfuscatedName("bt.e")
    public static int[][] field1222 = new int[2][8];

    @ObfuscatedName("bt.v(IIF)F")
    public float method1367(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1223[arg0][1][arg1] - this.field1223[arg0][0][arg1]) * arg2 + (float) this.field1223[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bt.f(F)F")
    public static float method1353(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bt.n(IIF)F")
    public float method1363(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1230[arg0][1][arg1] - this.field1230[arg0][0][arg1]) * arg2 + (float) this.field1230[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1353(var5);
    }

    @ObfuscatedName("bt.c(IF)I")
    public int method1368(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1226[1] - this.field1226[0]) * arg1 + (float) this.field1226[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1229 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1228 = (int) (Statics.field1229 * 65536.0F);
        }
        if (this.field1224[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1367(arg0, 0, arg1);
        field1225[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1363(arg0, 0, arg1));
        field1225[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1224[arg0]; var6++) {
            float var7 = this.method1367(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1363(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1225[arg0][var6 * 2 + 1] = field1225[arg0][var6 * 2 - 1] * var9;
            field1225[arg0][var6 * 2] = field1225[arg0][var6 * 2 - 1] * var8 + field1225[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1225[arg0][var10] += field1225[arg0][var10 - 1] * var8 + field1225[arg0][var10 - 2] * var9;
            }
            field1225[arg0][1] += field1225[arg0][0] * var8 + var9;
            field1225[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1224[0] * 2; var11++) {
                field1225[0][var11] *= Statics.field1229;
            }
        }
        for (int var12 = 0; var12 < this.field1224[arg0] * 2; var12++) {
            field1222[arg0][var12] = (int) (field1225[arg0][var12] * 65536.0F);
        }
        return this.field1224[arg0] * 2;
    }

    @ObfuscatedName("bt.r(Ldr;Lbk;)V")
    public final void method1356(class126 arg0, class55 arg1) {
        int var3 = arg0.method2466();
        this.field1224[0] = var3 >> 4;
        this.field1224[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1226;
            this.field1226[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1226[0] = arg0.method2468();
        this.field1226[1] = arg0.method2468();
        int var4 = arg0.method2466();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1224[var5]; var6++) {
                this.field1230[var5][0][var6] = arg0.method2468();
                this.field1223[var5][0][var6] = arg0.method2468();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1224[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1230[var7][1][var8] = this.field1230[var7][0][var8];
                    this.field1223[var7][1][var8] = this.field1223[var7][0][var8];
                } else {
                    this.field1230[var7][1][var8] = arg0.method2468();
                    this.field1223[var7][1][var8] = arg0.method2468();
                }
            }
        }
        if (var4 != 0 || this.field1226[1] != this.field1226[0]) {
            arg1.method1272(arg0);
        }
    }
}
