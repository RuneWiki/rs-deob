package deob;

@ObfuscatedName("br")
public class class59 {

    @ObfuscatedName("br.n")
    public int[] field1179 = new int[2];

    @ObfuscatedName("br.z")
    public int[][][] field1172 = new int[2][2][4];

    @ObfuscatedName("br.y")
    public int[][][] field1174 = new int[2][2][4];

    @ObfuscatedName("br.e")
    public int[] field1175 = new int[2];

    @ObfuscatedName("br.g")
    public static float[][] field1177 = new float[2][8];

    @ObfuscatedName("br.f")
    public static int[][] field1176 = new int[2][8];

    @ObfuscatedName("br.n(IIF)F")
    public float method1140(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1174[arg0][1][arg1] - this.field1174[arg0][0][arg1]) * arg2 + (float) this.field1174[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("br.d(F)F")
    public static float method1141(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("br.z(IIF)F")
    public float method1142(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1172[arg0][1][arg1] - this.field1172[arg0][0][arg1]) * arg2 + (float) this.field1172[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1141(var5);
    }

    @ObfuscatedName("br.y(IF)I")
    public int method1153(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1175[1] - this.field1175[0]) * arg1 + (float) this.field1175[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1170 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1178 = (int) (Statics.field1170 * 65536.0F);
        }
        if (this.field1179[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1140(arg0, 0, arg1);
        field1177[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1142(arg0, 0, arg1));
        field1177[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1179[arg0]; var6++) {
            float var7 = this.method1140(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1142(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1177[arg0][var6 * 2 + 1] = field1177[arg0][var6 * 2 - 1] * var9;
            field1177[arg0][var6 * 2] = field1177[arg0][var6 * 2 - 1] * var8 + field1177[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1177[arg0][var10] += field1177[arg0][var10 - 1] * var8 + field1177[arg0][var10 - 2] * var9;
            }
            field1177[arg0][1] += field1177[arg0][0] * var8 + var9;
            field1177[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1179[0] * 2; var11++) {
                field1177[0][var11] *= Statics.field1170;
            }
        }
        for (int var12 = 0; var12 < this.field1179[arg0] * 2; var12++) {
            field1176[arg0][var12] = (int) (field1177[arg0][var12] * 65536.0F);
        }
        return this.field1179[arg0] * 2;
    }

    @ObfuscatedName("br.e(Ldl;Lbs;)V")
    public final void method1144(class111 arg0, class53 arg1) {
        int var3 = arg0.method2228();
        this.field1179[0] = var3 >> 4;
        this.field1179[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1175;
            this.field1175[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1175[0] = arg0.method2231();
        this.field1175[1] = arg0.method2231();
        int var4 = arg0.method2228();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1179[var5]; var6++) {
                this.field1172[var5][0][var6] = arg0.method2231();
                this.field1174[var5][0][var6] = arg0.method2231();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1179[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1172[var7][1][var8] = this.field1172[var7][0][var8];
                    this.field1174[var7][1][var8] = this.field1174[var7][0][var8];
                } else {
                    this.field1172[var7][1][var8] = arg0.method2231();
                    this.field1174[var7][1][var8] = arg0.method2231();
                }
            }
        }
        if (var4 != 0 || this.field1175[1] != this.field1175[0]) {
            arg1.method1090(arg0);
        }
    }
}
