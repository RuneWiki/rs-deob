package deob;

@ObfuscatedName("bb")
public class class63 {

    @ObfuscatedName("bb.u")
    public int[] field1237 = new int[2];

    @ObfuscatedName("bb.x")
    public int[][][] field1229 = new int[2][2][4];

    @ObfuscatedName("bb.m")
    public int[][][] field1231 = new int[2][2][4];

    @ObfuscatedName("bb.n")
    public int[] field1232 = new int[2];

    @ObfuscatedName("bb.q")
    public static float[][] field1230 = new float[2][8];

    @ObfuscatedName("bb.a")
    public static int[][] field1233 = new int[2][8];

    @ObfuscatedName("bb.u(IIF)F")
    public float method1313(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1231[arg0][1][arg1] - this.field1231[arg0][0][arg1]) * arg2 + (float) this.field1231[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bb.k(F)F")
    public static float method1314(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bb.x(IIF)F")
    public float method1315(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1229[arg0][1][arg1] - this.field1229[arg0][0][arg1]) * arg2 + (float) this.field1229[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1314(var5);
    }

    @ObfuscatedName("bb.m(IF)I")
    public int method1328(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1232[1] - this.field1232[0]) * arg1 + (float) this.field1232[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1234 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1235 = (int) (Statics.field1234 * 65536.0F);
        }
        if (this.field1237[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1313(arg0, 0, arg1);
        field1230[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1315(arg0, 0, arg1));
        field1230[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1237[arg0]; var6++) {
            float var7 = this.method1313(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1315(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1230[arg0][var6 * 2 + 1] = field1230[arg0][var6 * 2 - 1] * var9;
            field1230[arg0][var6 * 2] = field1230[arg0][var6 * 2 - 1] * var8 + field1230[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1230[arg0][var10] += field1230[arg0][var10 - 1] * var8 + field1230[arg0][var10 - 2] * var9;
            }
            field1230[arg0][1] += field1230[arg0][0] * var8 + var9;
            field1230[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1237[0] * 2; var11++) {
                field1230[0][var11] *= Statics.field1234;
            }
        }
        for (int var12 = 0; var12 < this.field1237[arg0] * 2; var12++) {
            field1233[arg0][var12] = (int) (field1230[arg0][var12] * 65536.0F);
        }
        return this.field1237[arg0] * 2;
    }

    @ObfuscatedName("bb.n(Ldl;Lbh;)V")
    public final void method1317(class126 arg0, class55 arg1) {
        int var3 = arg0.method2559();
        this.field1237[0] = var3 >> 4;
        this.field1237[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1232;
            this.field1232[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1232[0] = arg0.method2450();
        this.field1232[1] = arg0.method2450();
        int var4 = arg0.method2559();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1237[var5]; var6++) {
                this.field1229[var5][0][var6] = arg0.method2450();
                this.field1231[var5][0][var6] = arg0.method2450();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1237[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1229[var7][1][var8] = this.field1229[var7][0][var8];
                    this.field1231[var7][1][var8] = this.field1231[var7][0][var8];
                } else {
                    this.field1229[var7][1][var8] = arg0.method2450();
                    this.field1231[var7][1][var8] = arg0.method2450();
                }
            }
        }
        if (var4 != 0 || this.field1232[1] != this.field1232[0]) {
            arg1.method1234(arg0);
        }
    }
}
