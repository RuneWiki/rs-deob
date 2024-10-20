package deob;

@ObfuscatedName("bu")
public class class63 {

    @ObfuscatedName("bu.p")
    public int[] field1242 = new int[2];

    @ObfuscatedName("bu.w")
    public int[][][] field1233 = new int[2][2][4];

    @ObfuscatedName("bu.h")
    public int[][][] field1235 = new int[2][2][4];

    @ObfuscatedName("bu.v")
    public int[] field1234 = new int[2];

    @ObfuscatedName("bu.k")
    public static float[][] field1232 = new float[2][8];

    @ObfuscatedName("bu.g")
    public static int[][] field1238 = new int[2][8];

    @ObfuscatedName("bu.p(IIF)F")
    public float method1286(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1235[arg0][1][arg1] - this.field1235[arg0][0][arg1]) * arg2 + (float) this.field1235[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bu.j(F)F")
    public static float method1288(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bu.w(IIF)F")
    public float method1287(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1233[arg0][1][arg1] - this.field1233[arg0][0][arg1]) * arg2 + (float) this.field1233[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1288(var5);
    }

    @ObfuscatedName("bu.h(IF)I")
    public int method1292(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1234[1] - this.field1234[0]) * arg1 + (float) this.field1234[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1239 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1240 = (int) (Statics.field1239 * 65536.0F);
        }
        if (this.field1242[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1286(arg0, 0, arg1);
        field1232[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1287(arg0, 0, arg1));
        field1232[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1242[arg0]; var6++) {
            float var7 = this.method1286(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1287(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1232[arg0][var6 * 2 + 1] = field1232[arg0][var6 * 2 - 1] * var9;
            field1232[arg0][var6 * 2] = field1232[arg0][var6 * 2 - 1] * var8 + field1232[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1232[arg0][var10] += field1232[arg0][var10 - 1] * var8 + field1232[arg0][var10 - 2] * var9;
            }
            field1232[arg0][1] += field1232[arg0][0] * var8 + var9;
            field1232[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1242[0] * 2; var11++) {
                field1232[0][var11] *= Statics.field1239;
            }
        }
        for (int var12 = 0; var12 < this.field1242[arg0] * 2; var12++) {
            field1238[arg0][var12] = (int) (field1232[arg0][var12] * 65536.0F);
        }
        return this.field1242[arg0] * 2;
    }

    @ObfuscatedName("bu.v(Ldv;Lbz;)V")
    public final void method1289(class126 arg0, class55 arg1) {
        int var3 = arg0.method2544();
        this.field1242[0] = var3 >> 4;
        this.field1242[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1234;
            this.field1234[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1234[0] = arg0.method2489();
        this.field1234[1] = arg0.method2489();
        int var4 = arg0.method2544();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1242[var5]; var6++) {
                this.field1233[var5][0][var6] = arg0.method2489();
                this.field1235[var5][0][var6] = arg0.method2489();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1242[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1233[var7][1][var8] = this.field1233[var7][0][var8];
                    this.field1235[var7][1][var8] = this.field1235[var7][0][var8];
                } else {
                    this.field1233[var7][1][var8] = arg0.method2489();
                    this.field1235[var7][1][var8] = arg0.method2489();
                }
            }
        }
        if (var4 != 0 || this.field1234[1] != this.field1234[0]) {
            arg1.method1212(arg0);
        }
    }
}
