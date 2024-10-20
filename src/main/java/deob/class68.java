package deob;

@ObfuscatedName("bh")
public class class68 {

    @ObfuscatedName("bh.n")
    public int[] field1127 = new int[2];

    @ObfuscatedName("bh.m")
    public int[][][] field1132 = new int[2][2][4];

    @ObfuscatedName("bh.h")
    public int[][][] field1125 = new int[2][2][4];

    @ObfuscatedName("bh.w")
    public int[] field1126 = new int[2];

    @ObfuscatedName("bh.r")
    public static float[][] field1122 = new float[2][8];

    @ObfuscatedName("bh.c")
    public static int[][] field1128 = new int[2][8];

    @ObfuscatedName("bh.n(IIF)F")
    public float method1294(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1125[arg0][1][arg1] - this.field1125[arg0][0][arg1]) * arg2 + (float) this.field1125[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bh.d(F)F")
    public static float method1284(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bh.m(IIF)F")
    public float method1285(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1132[arg0][1][arg1] - this.field1132[arg0][0][arg1]) * arg2 + (float) this.field1132[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1284(var5);
    }

    @ObfuscatedName("bh.h(IF)I")
    public int method1297(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1126[1] - this.field1126[0]) * arg1 + (float) this.field1126[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1129 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1130 = (int) (Statics.field1129 * 65536.0F);
        }
        if (this.field1127[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1294(arg0, 0, arg1);
        field1122[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1285(arg0, 0, arg1));
        field1122[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1127[arg0]; var6++) {
            float var7 = this.method1294(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1285(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1122[arg0][var6 * 2 + 1] = field1122[arg0][var6 * 2 - 1] * var9;
            field1122[arg0][var6 * 2] = field1122[arg0][var6 * 2 - 1] * var8 + field1122[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1122[arg0][var10] += field1122[arg0][var10 - 1] * var8 + field1122[arg0][var10 - 2] * var9;
            }
            field1122[arg0][1] += field1122[arg0][0] * var8 + var9;
            field1122[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1127[0] * 2; var11++) {
                field1122[0][var11] *= Statics.field1129;
            }
        }
        for (int var12 = 0; var12 < this.field1127[arg0] * 2; var12++) {
            field1128[arg0][var12] = (int) (field1122[arg0][var12] * 65536.0F);
        }
        return this.field1127[arg0] * 2;
    }

    @ObfuscatedName("bh.w(Lfa;Lbo;)V")
    public final void method1299(class161 arg0, class59 arg1) {
        int var3 = arg0.method2823();
        this.field1127[0] = var3 >> 4;
        this.field1127[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1126;
            this.field1126[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1126[0] = arg0.method2887();
        this.field1126[1] = arg0.method2887();
        int var4 = arg0.method2823();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1127[var5]; var6++) {
                this.field1132[var5][0][var6] = arg0.method2887();
                this.field1125[var5][0][var6] = arg0.method2887();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1127[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1132[var7][1][var8] = this.field1132[var7][0][var8];
                    this.field1125[var7][1][var8] = this.field1125[var7][0][var8];
                } else {
                    this.field1132[var7][1][var8] = arg0.method2887();
                    this.field1125[var7][1][var8] = arg0.method2887();
                }
            }
        }
        if (var4 != 0 || this.field1126[1] != this.field1126[0]) {
            arg1.method1064(arg0);
        }
    }
}
