package deob;

@ObfuscatedName("bd")
public class class64 {

    @ObfuscatedName("bd.b")
    public int[] field1235 = new int[2];

    @ObfuscatedName("bd.g")
    public int[][][] field1230 = new int[2][2][4];

    @ObfuscatedName("bd.o")
    public int[][][] field1238 = new int[2][2][4];

    @ObfuscatedName("bd.a")
    public int[] field1234 = new int[2];

    @ObfuscatedName("bd.h")
    public static float[][] field1233 = new float[2][8];

    @ObfuscatedName("bd.j")
    public static int[][] field1236 = new int[2][8];

    @ObfuscatedName("bd.b(IIF)F")
    public float method1307(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1238[arg0][1][arg1] - this.field1238[arg0][0][arg1]) * arg2 + (float) this.field1238[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bd.e(F)F")
    public static float method1308(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bd.g(IIF)F")
    public float method1314(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1230[arg0][1][arg1] - this.field1230[arg0][0][arg1]) * arg2 + (float) this.field1230[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1308(var5);
    }

    @ObfuscatedName("bd.o(IF)I")
    public int method1318(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1234[1] - this.field1234[0]) * arg1 + (float) this.field1234[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1237 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1232 = (int) (Statics.field1237 * 65536.0F);
        }
        if (this.field1235[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1307(arg0, 0, arg1);
        field1233[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1314(arg0, 0, arg1));
        field1233[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1235[arg0]; var6++) {
            float var7 = this.method1307(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1314(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1233[arg0][var6 * 2 + 1] = field1233[arg0][var6 * 2 - 1] * var9;
            field1233[arg0][var6 * 2] = field1233[arg0][var6 * 2 - 1] * var8 + field1233[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1233[arg0][var10] += field1233[arg0][var10 - 1] * var8 + field1233[arg0][var10 - 2] * var9;
            }
            field1233[arg0][1] += field1233[arg0][0] * var8 + var9;
            field1233[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1235[0] * 2; var11++) {
                field1233[0][var11] *= Statics.field1237;
            }
        }
        for (int var12 = 0; var12 < this.field1235[arg0] * 2; var12++) {
            field1236[arg0][var12] = (int) (field1233[arg0][var12] * 65536.0F);
        }
        return this.field1235[arg0] * 2;
    }

    @ObfuscatedName("bd.a(Ldv;Lbi;)V")
    public final void method1310(class126 arg0, class56 arg1) {
        int var3 = arg0.method2436();
        this.field1235[0] = var3 >> 4;
        this.field1235[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1234;
            this.field1234[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1234[0] = arg0.method2572();
        this.field1234[1] = arg0.method2572();
        int var4 = arg0.method2436();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1235[var5]; var6++) {
                this.field1230[var5][0][var6] = arg0.method2572();
                this.field1238[var5][0][var6] = arg0.method2572();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1235[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1230[var7][1][var8] = this.field1230[var7][0][var8];
                    this.field1238[var7][1][var8] = this.field1238[var7][0][var8];
                } else {
                    this.field1230[var7][1][var8] = arg0.method2572();
                    this.field1238[var7][1][var8] = arg0.method2572();
                }
            }
        }
        if (var4 != 0 || this.field1234[1] != this.field1234[0]) {
            arg1.method1227(arg0);
        }
    }
}
