package deob;

@ObfuscatedName("bl")
public class class64 {

    @ObfuscatedName("bl.j")
    public int[] field1227 = new int[2];

    @ObfuscatedName("bl.f")
    public int[][][] field1224 = new int[2][2][4];

    @ObfuscatedName("bl.l")
    public int[][][] field1230 = new int[2][2][4];

    @ObfuscatedName("bl.u")
    public int[] field1228 = new int[2];

    @ObfuscatedName("bl.a")
    public static float[][] field1229 = new float[2][8];

    @ObfuscatedName("bl.h")
    public static int[][] field1234 = new int[2][8];

    @ObfuscatedName("bl.j(IIF)F")
    public float method1266(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1230[arg0][1][arg1] - this.field1230[arg0][0][arg1]) * arg2 + (float) this.field1230[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bl.m(F)F")
    public static float method1267(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bl.f(IIF)F")
    public float method1270(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1224[arg0][1][arg1] - this.field1224[arg0][0][arg1]) * arg2 + (float) this.field1224[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1267(var5);
    }

    @ObfuscatedName("bl.l(IF)I")
    public int method1277(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1228[1] - this.field1228[0]) * arg1 + (float) this.field1228[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1231 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1232 = (int) (Statics.field1231 * 65536.0F);
        }
        if (this.field1227[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1266(arg0, 0, arg1);
        field1229[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1270(arg0, 0, arg1));
        field1229[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1227[arg0]; var6++) {
            float var7 = this.method1266(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1270(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1229[arg0][var6 * 2 + 1] = field1229[arg0][var6 * 2 - 1] * var9;
            field1229[arg0][var6 * 2] = field1229[arg0][var6 * 2 - 1] * var8 + field1229[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1229[arg0][var10] += field1229[arg0][var10 - 1] * var8 + field1229[arg0][var10 - 2] * var9;
            }
            field1229[arg0][1] += field1229[arg0][0] * var8 + var9;
            field1229[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1227[0] * 2; var11++) {
                field1229[0][var11] *= Statics.field1231;
            }
        }
        for (int var12 = 0; var12 < this.field1227[arg0] * 2; var12++) {
            field1234[arg0][var12] = (int) (field1229[arg0][var12] * 65536.0F);
        }
        return this.field1227[arg0] * 2;
    }

    @ObfuscatedName("bl.u(Ldc;Lbu;)V")
    public final void method1268(class119 arg0, class58 arg1) {
        int var3 = arg0.method2372();
        this.field1227[0] = var3 >> 4;
        this.field1227[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1228;
            this.field1228[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1228[0] = arg0.method2374();
        this.field1228[1] = arg0.method2374();
        int var4 = arg0.method2372();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1227[var5]; var6++) {
                this.field1224[var5][0][var6] = arg0.method2374();
                this.field1230[var5][0][var6] = arg0.method2374();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1227[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1224[var7][1][var8] = this.field1224[var7][0][var8];
                    this.field1230[var7][1][var8] = this.field1230[var7][0][var8];
                } else {
                    this.field1224[var7][1][var8] = arg0.method2374();
                    this.field1230[var7][1][var8] = arg0.method2374();
                }
            }
        }
        if (var4 != 0 || this.field1228[1] != this.field1228[0]) {
            arg1.method1212(arg0);
        }
    }
}
