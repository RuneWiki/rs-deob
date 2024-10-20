package deob;

@ObfuscatedName("bg")
public class class63 {

    @ObfuscatedName("bg.c")
    public int[] field1228 = new int[2];

    @ObfuscatedName("bg.f")
    public int[][][] field1220 = new int[2][2][4];

    @ObfuscatedName("bg.y")
    public int[][][] field1223 = new int[2][2][4];

    @ObfuscatedName("bg.x")
    public int[] field1222 = new int[2];

    @ObfuscatedName("bg.e")
    public static float[][] field1218 = new float[2][8];

    @ObfuscatedName("bg.m")
    public static int[][] field1224 = new int[2][8];

    @ObfuscatedName("bg.c(IIF)F")
    public float method1280(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1223[arg0][1][arg1] - this.field1223[arg0][0][arg1]) * arg2 + (float) this.field1223[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bg.j(F)F")
    public static float method1284(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bg.f(IIF)F")
    public float method1281(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1220[arg0][1][arg1] - this.field1220[arg0][0][arg1]) * arg2 + (float) this.field1220[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1284(var5);
    }

    @ObfuscatedName("bg.y(IF)I")
    public int method1293(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1222[1] - this.field1222[0]) * arg1 + (float) this.field1222[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1225 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1226 = (int) (Statics.field1225 * 65536.0F);
        }
        if (this.field1228[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1280(arg0, 0, arg1);
        field1218[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1281(arg0, 0, arg1));
        field1218[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1228[arg0]; var6++) {
            float var7 = this.method1280(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1281(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1218[arg0][var6 * 2 + 1] = field1218[arg0][var6 * 2 - 1] * var9;
            field1218[arg0][var6 * 2] = field1218[arg0][var6 * 2 - 1] * var8 + field1218[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1218[arg0][var10] += field1218[arg0][var10 - 1] * var8 + field1218[arg0][var10 - 2] * var9;
            }
            field1218[arg0][1] += field1218[arg0][0] * var8 + var9;
            field1218[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1228[0] * 2; var11++) {
                field1218[0][var11] *= Statics.field1225;
            }
        }
        for (int var12 = 0; var12 < this.field1228[arg0] * 2; var12++) {
            field1224[arg0][var12] = (int) (field1218[arg0][var12] * 65536.0F);
        }
        return this.field1228[arg0] * 2;
    }

    @ObfuscatedName("bg.x(Ldl;Lbh;)V")
    public final void method1283(class125 arg0, class55 arg1) {
        int var3 = arg0.method2326();
        this.field1228[0] = var3 >> 4;
        this.field1228[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1222;
            this.field1222[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1222[0] = arg0.method2328();
        this.field1222[1] = arg0.method2328();
        int var4 = arg0.method2326();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1228[var5]; var6++) {
                this.field1220[var5][0][var6] = arg0.method2328();
                this.field1223[var5][0][var6] = arg0.method2328();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1228[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1220[var7][1][var8] = this.field1220[var7][0][var8];
                    this.field1223[var7][1][var8] = this.field1223[var7][0][var8];
                } else {
                    this.field1220[var7][1][var8] = arg0.method2328();
                    this.field1223[var7][1][var8] = arg0.method2328();
                }
            }
        }
        if (var4 != 0 || this.field1222[1] != this.field1222[0]) {
            arg1.method1202(arg0);
        }
    }
}
