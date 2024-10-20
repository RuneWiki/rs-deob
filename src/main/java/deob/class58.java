package deob;

@ObfuscatedName("bb")
public class class58 {

    @ObfuscatedName("bb.x")
    public int[] field1151 = new int[2];

    @ObfuscatedName("bb.m")
    public int[][][] field1155 = new int[2][2][4];

    @ObfuscatedName("bb.e")
    public int[][][] field1152 = new int[2][2][4];

    @ObfuscatedName("bb.h")
    public int[] field1153 = new int[2];

    @ObfuscatedName("bb.p")
    public static float[][] field1150 = new float[2][8];

    @ObfuscatedName("bb.j")
    public static int[][] field1154 = new int[2][8];

    @ObfuscatedName("bb.x(IIF)F")
    public float method1127(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1152[arg0][1][arg1] - this.field1152[arg0][0][arg1]) * arg2 + (float) this.field1152[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bb.v(F)F")
    public static float method1126(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bb.m(IIF)F")
    public float method1116(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1155[arg0][1][arg1] - this.field1155[arg0][0][arg1]) * arg2 + (float) this.field1155[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1126(var5);
    }

    @ObfuscatedName("bb.e(IF)I")
    public int method1117(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1153[1] - this.field1153[0]) * arg1 + (float) this.field1153[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1156 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1157 = (int) (Statics.field1156 * 65536.0F);
        }
        if (this.field1151[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1127(arg0, 0, arg1);
        field1150[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1116(arg0, 0, arg1));
        field1150[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1151[arg0]; var6++) {
            float var7 = this.method1127(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1116(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1150[arg0][var6 * 2 + 1] = field1150[arg0][var6 * 2 - 1] * var9;
            field1150[arg0][var6 * 2] = field1150[arg0][var6 * 2 - 1] * var8 + field1150[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1150[arg0][var10] += field1150[arg0][var10 - 1] * var8 + field1150[arg0][var10 - 2] * var9;
            }
            field1150[arg0][1] += field1150[arg0][0] * var8 + var9;
            field1150[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1151[0] * 2; var11++) {
                field1150[0][var11] *= Statics.field1156;
            }
        }
        for (int var12 = 0; var12 < this.field1151[arg0] * 2; var12++) {
            field1154[arg0][var12] = (int) (field1150[arg0][var12] * 65536.0F);
        }
        return this.field1151[arg0] * 2;
    }

    @ObfuscatedName("bb.h(Ldm;Lax;)V")
    public final void method1115(class108 arg0, class52 arg1) {
        int var3 = arg0.method2299();
        this.field1151[0] = var3 >> 4;
        this.field1151[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1153;
            this.field1153[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1153[0] = arg0.method2129();
        this.field1153[1] = arg0.method2129();
        int var4 = arg0.method2299();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1151[var5]; var6++) {
                this.field1155[var5][0][var6] = arg0.method2129();
                this.field1152[var5][0][var6] = arg0.method2129();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1151[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1155[var7][1][var8] = this.field1155[var7][0][var8];
                    this.field1152[var7][1][var8] = this.field1152[var7][0][var8];
                } else {
                    this.field1155[var7][1][var8] = arg0.method2129();
                    this.field1152[var7][1][var8] = arg0.method2129();
                }
            }
        }
        if (var4 != 0 || this.field1153[1] != this.field1153[0]) {
            arg1.method1058(arg0);
        }
    }
}
