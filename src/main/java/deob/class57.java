package deob;

@ObfuscatedName("bv")
public class class57 {

    @ObfuscatedName("bv.i")
    public int[] field1153 = new int[2];

    @ObfuscatedName("bv.h")
    public int[][][] field1144 = new int[2][2][4];

    @ObfuscatedName("bv.v")
    public int[][][] field1148 = new int[2][2][4];

    @ObfuscatedName("bv.q")
    public int[] field1150 = new int[2];

    @ObfuscatedName("bv.s")
    public static float[][] field1149 = new float[2][8];

    @ObfuscatedName("bv.g")
    public static int[][] field1145 = new int[2][8];

    @ObfuscatedName("bv.i(IIF)F")
    public float method1094(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1148[arg0][1][arg1] - this.field1148[arg0][0][arg1]) * arg2 + (float) this.field1148[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bv.c(F)F")
    public static float method1086(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bv.h(IIF)F")
    public float method1085(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1144[arg0][1][arg1] - this.field1144[arg0][0][arg1]) * arg2 + (float) this.field1144[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1086(var5);
    }

    @ObfuscatedName("bv.v(IF)I")
    public int method1088(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1150[1] - this.field1150[0]) * arg1 + (float) this.field1150[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1151 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1152 = (int) (Statics.field1151 * 65536.0F);
        }
        if (this.field1153[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1094(arg0, 0, arg1);
        field1149[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1085(arg0, 0, arg1));
        field1149[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1153[arg0]; var6++) {
            float var7 = this.method1094(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1085(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1149[arg0][var6 * 2 + 1] = field1149[arg0][var6 * 2 - 1] * var9;
            field1149[arg0][var6 * 2] = field1149[arg0][var6 * 2 - 1] * var8 + field1149[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1149[arg0][var10] += field1149[arg0][var10 - 1] * var8 + field1149[arg0][var10 - 2] * var9;
            }
            field1149[arg0][1] += field1149[arg0][0] * var8 + var9;
            field1149[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1153[0] * 2; var11++) {
                field1149[0][var11] *= Statics.field1151;
            }
        }
        for (int var12 = 0; var12 < this.field1153[arg0] * 2; var12++) {
            field1145[arg0][var12] = (int) (field1149[arg0][var12] * 65536.0F);
        }
        return this.field1153[arg0] * 2;
    }

    @ObfuscatedName("bv.q(Ldm;Las;)V")
    public final void method1089(class107 arg0, class51 arg1) {
        int var3 = arg0.method2151();
        this.field1153[0] = var3 >> 4;
        this.field1153[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1150;
            this.field1150[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1150[0] = arg0.method2313();
        this.field1150[1] = arg0.method2313();
        int var4 = arg0.method2151();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1153[var5]; var6++) {
                this.field1144[var5][0][var6] = arg0.method2313();
                this.field1148[var5][0][var6] = arg0.method2313();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1153[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1144[var7][1][var8] = this.field1144[var7][0][var8];
                    this.field1148[var7][1][var8] = this.field1148[var7][0][var8];
                } else {
                    this.field1144[var7][1][var8] = arg0.method2313();
                    this.field1148[var7][1][var8] = arg0.method2313();
                }
            }
        }
        if (var4 != 0 || this.field1150[1] != this.field1150[0]) {
            arg1.method1042(arg0);
        }
    }
}
