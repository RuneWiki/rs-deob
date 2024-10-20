package deob;

@ObfuscatedName("bg")
public class class57 {

    @ObfuscatedName("bg.e")
    public int[] field1131 = new int[2];

    @ObfuscatedName("bg.a")
    public int[][][] field1130 = new int[2][2][4];

    @ObfuscatedName("bg.g")
    public int[][][] field1133 = new int[2][2][4];

    @ObfuscatedName("bg.u")
    public int[] field1132 = new int[2];

    @ObfuscatedName("bg.k")
    public static float[][] field1136 = new float[2][8];

    @ObfuscatedName("bg.m")
    public static int[][] field1128 = new int[2][8];

    @ObfuscatedName("bg.e(IIF)F")
    public float method1104(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1133[arg0][1][arg1] - this.field1133[arg0][0][arg1]) * arg2 + (float) this.field1133[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bg.p(F)F")
    public static float method1105(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bg.a(IIF)F")
    public float method1108(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1130[arg0][1][arg1] - this.field1130[arg0][0][arg1]) * arg2 + (float) this.field1130[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1105(var5);
    }

    @ObfuscatedName("bg.g(IF)I")
    public int method1116(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1132[1] - this.field1132[0]) * arg1 + (float) this.field1132[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1135 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1129 = (int) (Statics.field1135 * 65536.0F);
        }
        if (this.field1131[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1104(arg0, 0, arg1);
        field1136[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1108(arg0, 0, arg1));
        field1136[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1131[arg0]; var6++) {
            float var7 = this.method1104(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1108(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1136[arg0][var6 * 2 + 1] = field1136[arg0][var6 * 2 - 1] * var9;
            field1136[arg0][var6 * 2] = field1136[arg0][var6 * 2 - 1] * var8 + field1136[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1136[arg0][var10] += field1136[arg0][var10 - 1] * var8 + field1136[arg0][var10 - 2] * var9;
            }
            field1136[arg0][1] += field1136[arg0][0] * var8 + var9;
            field1136[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1131[0] * 2; var11++) {
                field1136[0][var11] *= Statics.field1135;
            }
        }
        for (int var12 = 0; var12 < this.field1131[arg0] * 2; var12++) {
            field1128[arg0][var12] = (int) (field1136[arg0][var12] * 65536.0F);
        }
        return this.field1131[arg0] * 2;
    }

    @ObfuscatedName("bg.u(Ldp;Lao;)V")
    public final void method1112(class107 arg0, class51 arg1) {
        int var3 = arg0.method2125();
        this.field1131[0] = var3 >> 4;
        this.field1131[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1132;
            this.field1132[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1132[0] = arg0.method2182();
        this.field1132[1] = arg0.method2182();
        int var4 = arg0.method2125();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1131[var5]; var6++) {
                this.field1130[var5][0][var6] = arg0.method2182();
                this.field1133[var5][0][var6] = arg0.method2182();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1131[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1130[var7][1][var8] = this.field1130[var7][0][var8];
                    this.field1133[var7][1][var8] = this.field1133[var7][0][var8];
                } else {
                    this.field1130[var7][1][var8] = arg0.method2182();
                    this.field1133[var7][1][var8] = arg0.method2182();
                }
            }
        }
        if (var4 != 0 || this.field1132[1] != this.field1132[0]) {
            arg1.method1055(arg0);
        }
    }
}
