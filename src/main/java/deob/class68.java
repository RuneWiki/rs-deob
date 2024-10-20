package deob;

@ObfuscatedName("bu")
public class class68 {

    @ObfuscatedName("bu.x")
    public int[] field1140 = new int[2];

    @ObfuscatedName("bu.c")
    public int[][][] field1136 = new int[2][2][4];

    @ObfuscatedName("bu.d")
    public int[][][] field1137 = new int[2][2][4];

    @ObfuscatedName("bu.w")
    public int[] field1138 = new int[2];

    @ObfuscatedName("bu.h")
    public static float[][] field1141 = new float[2][8];

    @ObfuscatedName("bu.u")
    public static int[][] field1142 = new int[2][8];

    @ObfuscatedName("bu.x(IIF)F")
    public float method1332(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1137[arg0][1][arg1] - this.field1137[arg0][0][arg1]) * arg2 + (float) this.field1137[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bu.j(F)F")
    public static float method1333(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bu.c(IIF)F")
    public float method1334(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1136[arg0][1][arg1] - this.field1136[arg0][0][arg1]) * arg2 + (float) this.field1136[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1333(var5);
    }

    @ObfuscatedName("bu.d(IF)I")
    public int method1335(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1138[1] - this.field1138[0]) * arg1 + (float) this.field1138[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1143 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1144 = (int) (Statics.field1143 * 65536.0F);
        }
        if (this.field1140[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1332(arg0, 0, arg1);
        field1141[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1334(arg0, 0, arg1));
        field1141[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1140[arg0]; var6++) {
            float var7 = this.method1332(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1334(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1141[arg0][var6 * 2 + 1] = field1141[arg0][var6 * 2 - 1] * var9;
            field1141[arg0][var6 * 2] = field1141[arg0][var6 * 2 - 1] * var8 + field1141[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1141[arg0][var10] += field1141[arg0][var10 - 1] * var8 + field1141[arg0][var10 - 2] * var9;
            }
            field1141[arg0][1] += field1141[arg0][0] * var8 + var9;
            field1141[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1140[0] * 2; var11++) {
                field1141[0][var11] *= Statics.field1143;
            }
        }
        for (int var12 = 0; var12 < this.field1140[arg0] * 2; var12++) {
            field1142[arg0][var12] = (int) (field1141[arg0][var12] * 65536.0F);
        }
        return this.field1140[arg0] * 2;
    }

    @ObfuscatedName("bu.w(Lek;Lbm;)V")
    public final void method1337(class154 arg0, class59 arg1) {
        int var3 = arg0.method2701();
        this.field1140[0] = var3 >> 4;
        this.field1140[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1138;
            this.field1138[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1138[0] = arg0.method2745();
        this.field1138[1] = arg0.method2745();
        int var4 = arg0.method2701();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1140[var5]; var6++) {
                this.field1136[var5][0][var6] = arg0.method2745();
                this.field1137[var5][0][var6] = arg0.method2745();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1140[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1136[var7][1][var8] = this.field1136[var7][0][var8];
                    this.field1137[var7][1][var8] = this.field1137[var7][0][var8];
                } else {
                    this.field1136[var7][1][var8] = arg0.method2745();
                    this.field1137[var7][1][var8] = arg0.method2745();
                }
            }
        }
        if (var4 != 0 || this.field1138[1] != this.field1138[0]) {
            arg1.method1152(arg0);
        }
    }
}
