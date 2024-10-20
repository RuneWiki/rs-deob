package deob;

@ObfuscatedName("bj")
public class class64 {

    @ObfuscatedName("bj.t")
    public int[] field1241 = new int[2];

    @ObfuscatedName("bj.g")
    public int[][][] field1242 = new int[2][2][4];

    @ObfuscatedName("bj.h")
    public int[][][] field1243 = new int[2][2][4];

    @ObfuscatedName("bj.z")
    public int[] field1244 = new int[2];

    @ObfuscatedName("bj.r")
    public static float[][] field1240 = new float[2][8];

    @ObfuscatedName("bj.f")
    public static int[][] field1246 = new int[2][8];

    @ObfuscatedName("bj.t(IIF)F")
    public float method1198(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1243[arg0][1][arg1] - this.field1243[arg0][0][arg1]) * arg2 + (float) this.field1243[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bj.i(F)F")
    public static float method1194(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bj.g(IIF)F")
    public float method1204(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1242[arg0][1][arg1] - this.field1242[arg0][0][arg1]) * arg2 + (float) this.field1242[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1194(var5);
    }

    @ObfuscatedName("bj.h(IF)I")
    public int method1196(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1244[1] - this.field1244[0]) * arg1 + (float) this.field1244[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1247 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1249 = (int) (Statics.field1247 * 65536.0F);
        }
        if (this.field1241[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1198(arg0, 0, arg1);
        field1240[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1204(arg0, 0, arg1));
        field1240[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1241[arg0]; var6++) {
            float var7 = this.method1198(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1204(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1240[arg0][var6 * 2 + 1] = field1240[arg0][var6 * 2 - 1] * var9;
            field1240[arg0][var6 * 2] = field1240[arg0][var6 * 2 - 1] * var8 + field1240[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1240[arg0][var10] += field1240[arg0][var10 - 1] * var8 + field1240[arg0][var10 - 2] * var9;
            }
            field1240[arg0][1] += field1240[arg0][0] * var8 + var9;
            field1240[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1241[0] * 2; var11++) {
                field1240[0][var11] *= Statics.field1247;
            }
        }
        for (int var12 = 0; var12 < this.field1241[arg0] * 2; var12++) {
            field1246[arg0][var12] = (int) (field1240[arg0][var12] * 65536.0F);
        }
        return this.field1241[arg0] * 2;
    }

    @ObfuscatedName("bj.z(Ldr;Lbh;)V")
    public final void method1197(class120 arg0, class58 arg1) {
        int var3 = arg0.method2334();
        this.field1241[0] = var3 >> 4;
        this.field1241[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1244;
            this.field1244[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1244[0] = arg0.method2310();
        this.field1244[1] = arg0.method2310();
        int var4 = arg0.method2334();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1241[var5]; var6++) {
                this.field1242[var5][0][var6] = arg0.method2310();
                this.field1243[var5][0][var6] = arg0.method2310();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1241[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1242[var7][1][var8] = this.field1242[var7][0][var8];
                    this.field1243[var7][1][var8] = this.field1243[var7][0][var8];
                } else {
                    this.field1242[var7][1][var8] = arg0.method2310();
                    this.field1243[var7][1][var8] = arg0.method2310();
                }
            }
        }
        if (var4 != 0 || this.field1244[1] != this.field1244[0]) {
            arg1.method1141(arg0);
        }
    }
}
