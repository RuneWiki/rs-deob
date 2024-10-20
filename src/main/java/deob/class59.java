package deob;

@ObfuscatedName("br")
public class class59 {

    @ObfuscatedName("br.o")
    public int[] field1166 = new int[2];

    @ObfuscatedName("br.g")
    public int[][][] field1161 = new int[2][2][4];

    @ObfuscatedName("br.u")
    public int[][][] field1168 = new int[2][2][4];

    @ObfuscatedName("br.q")
    public int[] field1163 = new int[2];

    @ObfuscatedName("br.r")
    public static float[][] field1169 = new float[2][8];

    @ObfuscatedName("br.v")
    public static int[][] field1165 = new int[2][8];

    @ObfuscatedName("br.o(IIF)F")
    public float method1165(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1168[arg0][1][arg1] - this.field1168[arg0][0][arg1]) * arg2 + (float) this.field1168[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("br.l(F)F")
    public static float method1166(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("br.g(IIF)F")
    public float method1178(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1161[arg0][1][arg1] - this.field1161[arg0][0][arg1]) * arg2 + (float) this.field1161[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1166(var5);
    }

    @ObfuscatedName("br.u(IF)I")
    public int method1167(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1163[1] - this.field1163[0]) * arg1 + (float) this.field1163[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1160 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1167 = (int) (Statics.field1160 * 65536.0F);
        }
        if (this.field1166[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1165(arg0, 0, arg1);
        field1169[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1178(arg0, 0, arg1));
        field1169[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1166[arg0]; var6++) {
            float var7 = this.method1165(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1178(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1169[arg0][var6 * 2 + 1] = field1169[arg0][var6 * 2 - 1] * var9;
            field1169[arg0][var6 * 2] = field1169[arg0][var6 * 2 - 1] * var8 + field1169[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1169[arg0][var10] += field1169[arg0][var10 - 1] * var8 + field1169[arg0][var10 - 2] * var9;
            }
            field1169[arg0][1] += field1169[arg0][0] * var8 + var9;
            field1169[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1166[0] * 2; var11++) {
                field1169[0][var11] *= Statics.field1160;
            }
        }
        for (int var12 = 0; var12 < this.field1166[arg0] * 2; var12++) {
            field1165[arg0][var12] = (int) (field1169[arg0][var12] * 65536.0F);
        }
        return this.field1166[arg0] * 2;
    }

    @ObfuscatedName("br.q(Ldk;Lba;)V")
    public final void method1168(class111 arg0, class53 arg1) {
        int var3 = arg0.method2219();
        this.field1166[0] = var3 >> 4;
        this.field1166[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1163;
            this.field1163[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1163[0] = arg0.method2397();
        this.field1163[1] = arg0.method2397();
        int var4 = arg0.method2219();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1166[var5]; var6++) {
                this.field1161[var5][0][var6] = arg0.method2397();
                this.field1168[var5][0][var6] = arg0.method2397();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1166[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1161[var7][1][var8] = this.field1161[var7][0][var8];
                    this.field1168[var7][1][var8] = this.field1168[var7][0][var8];
                } else {
                    this.field1161[var7][1][var8] = arg0.method2397();
                    this.field1168[var7][1][var8] = arg0.method2397();
                }
            }
        }
        if (var4 != 0 || this.field1163[1] != this.field1163[0]) {
            arg1.method1114(arg0);
        }
    }
}
