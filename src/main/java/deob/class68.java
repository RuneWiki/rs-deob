package deob;

@ObfuscatedName("bh")
public class class68 {

    @ObfuscatedName("bh.q")
    public int[] field1154 = new int[2];

    @ObfuscatedName("bh.h")
    public int[][][] field1147 = new int[2][2][4];

    @ObfuscatedName("bh.p")
    public int[][][] field1148 = new int[2][2][4];

    @ObfuscatedName("bh.j")
    public int[] field1151 = new int[2];

    @ObfuscatedName("bh.n")
    public static float[][] field1145 = new float[2][8];

    @ObfuscatedName("bh.r")
    public static int[][] field1146 = new int[2][8];

    @ObfuscatedName("bh.q(IIF)F")
    public float method1332(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1148[arg0][1][arg1] - this.field1148[arg0][0][arg1]) * arg2 + (float) this.field1148[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bh.d(F)F")
    public static float method1333(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bh.h(IIF)F")
    public float method1341(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1147[arg0][1][arg1] - this.field1147[arg0][0][arg1]) * arg2 + (float) this.field1147[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1333(var5);
    }

    @ObfuscatedName("bh.p(IF)I")
    public int method1335(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1151[1] - this.field1151[0]) * arg1 + (float) this.field1151[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1152 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1149 = (int) (Statics.field1152 * 65536.0F);
        }
        if (this.field1154[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1332(arg0, 0, arg1);
        field1145[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1341(arg0, 0, arg1));
        field1145[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1154[arg0]; var6++) {
            float var7 = this.method1332(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1341(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1145[arg0][var6 * 2 + 1] = field1145[arg0][var6 * 2 - 1] * var9;
            field1145[arg0][var6 * 2] = field1145[arg0][var6 * 2 - 1] * var8 + field1145[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1145[arg0][var10] += field1145[arg0][var10 - 1] * var8 + field1145[arg0][var10 - 2] * var9;
            }
            field1145[arg0][1] += field1145[arg0][0] * var8 + var9;
            field1145[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1154[0] * 2; var11++) {
                field1145[0][var11] *= Statics.field1152;
            }
        }
        for (int var12 = 0; var12 < this.field1154[arg0] * 2; var12++) {
            field1146[arg0][var12] = (int) (field1145[arg0][var12] * 65536.0F);
        }
        return this.field1154[arg0] * 2;
    }

    @ObfuscatedName("bh.j(Lel;Lbu;)V")
    public final void method1331(class154 arg0, class59 arg1) {
        int var3 = arg0.method2666();
        this.field1154[0] = var3 >> 4;
        this.field1154[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1151;
            this.field1151[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1151[0] = arg0.method2668();
        this.field1151[1] = arg0.method2668();
        int var4 = arg0.method2666();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1154[var5]; var6++) {
                this.field1147[var5][0][var6] = arg0.method2668();
                this.field1148[var5][0][var6] = arg0.method2668();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1154[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1147[var7][1][var8] = this.field1147[var7][0][var8];
                    this.field1148[var7][1][var8] = this.field1148[var7][0][var8];
                } else {
                    this.field1147[var7][1][var8] = arg0.method2668();
                    this.field1148[var7][1][var8] = arg0.method2668();
                }
            }
        }
        if (var4 != 0 || this.field1151[1] != this.field1151[0]) {
            arg1.method1155(arg0);
        }
    }
}
