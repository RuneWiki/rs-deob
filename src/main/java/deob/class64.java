package deob;

@ObfuscatedName("bk")
public class class64 {

    @ObfuscatedName("bk.m")
    public int[] field1196 = new int[2];

    @ObfuscatedName("bk.y")
    public int[][][] field1194 = new int[2][2][4];

    @ObfuscatedName("bk.u")
    public int[][][] field1195 = new int[2][2][4];

    @ObfuscatedName("bk.k")
    public int[] field1203 = new int[2];

    @ObfuscatedName("bk.j")
    public static float[][] field1197 = new float[2][8];

    @ObfuscatedName("bk.i")
    public static int[][] field1198 = new int[2][8];

    @ObfuscatedName("bk.m(IIF)F")
    public float method1289(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1195[arg0][1][arg1] - this.field1195[arg0][0][arg1]) * arg2 + (float) this.field1195[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bk.l(F)F")
    public static float method1296(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bk.y(IIF)F")
    public float method1290(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1194[arg0][1][arg1] - this.field1194[arg0][0][arg1]) * arg2 + (float) this.field1194[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1296(var5);
    }

    @ObfuscatedName("bk.u(IF)I")
    public int method1293(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1203[1] - this.field1203[0]) * arg1 + (float) this.field1203[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1199 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1200 = (int) (Statics.field1199 * 65536.0F);
        }
        if (this.field1196[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1289(arg0, 0, arg1);
        field1197[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1290(arg0, 0, arg1));
        field1197[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1196[arg0]; var6++) {
            float var7 = this.method1289(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1290(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1197[arg0][var6 * 2 + 1] = field1197[arg0][var6 * 2 - 1] * var9;
            field1197[arg0][var6 * 2] = field1197[arg0][var6 * 2 - 1] * var8 + field1197[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1197[arg0][var10] += field1197[arg0][var10 - 1] * var8 + field1197[arg0][var10 - 2] * var9;
            }
            field1197[arg0][1] += field1197[arg0][0] * var8 + var9;
            field1197[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1196[0] * 2; var11++) {
                field1197[0][var11] *= Statics.field1199;
            }
        }
        for (int var12 = 0; var12 < this.field1196[arg0] * 2; var12++) {
            field1198[arg0][var12] = (int) (field1197[arg0][var12] * 65536.0F);
        }
        return this.field1196[arg0] * 2;
    }

    @ObfuscatedName("bk.k(Ldx;Lbd;)V")
    public final void method1292(class119 arg0, class58 arg1) {
        int var3 = arg0.method2562();
        this.field1196[0] = var3 >> 4;
        this.field1196[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1203;
            this.field1203[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1203[0] = arg0.method2541();
        this.field1203[1] = arg0.method2541();
        int var4 = arg0.method2562();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1196[var5]; var6++) {
                this.field1194[var5][0][var6] = arg0.method2541();
                this.field1195[var5][0][var6] = arg0.method2541();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1196[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1194[var7][1][var8] = this.field1194[var7][0][var8];
                    this.field1195[var7][1][var8] = this.field1195[var7][0][var8];
                } else {
                    this.field1194[var7][1][var8] = arg0.method2541();
                    this.field1195[var7][1][var8] = arg0.method2541();
                }
            }
        }
        if (var4 != 0 || this.field1203[1] != this.field1203[0]) {
            arg1.method1235(arg0);
        }
    }
}
