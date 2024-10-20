package deob;

@ObfuscatedName("bu")
public class class64 {

    @ObfuscatedName("bu.a")
    public int[] field1225 = new int[2];

    @ObfuscatedName("bu.u")
    public int[][][] field1223 = new int[2][2][4];

    @ObfuscatedName("bu.t")
    public int[][][] field1232 = new int[2][2][4];

    @ObfuscatedName("bu.k")
    public int[] field1227 = new int[2];

    @ObfuscatedName("bu.x")
    public static float[][] field1228 = new float[2][8];

    @ObfuscatedName("bu.v")
    public static int[][] field1229 = new int[2][8];

    @ObfuscatedName("bu.a(IIF)F")
    public float method1261(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1232[arg0][1][arg1] - this.field1232[arg0][0][arg1]) * arg2 + (float) this.field1232[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bu.r(F)F")
    public static float method1266(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bu.u(IIF)F")
    public float method1262(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1223[arg0][1][arg1] - this.field1223[arg0][0][arg1]) * arg2 + (float) this.field1223[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1266(var5);
    }

    @ObfuscatedName("bu.t(IF)I")
    public int method1263(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1227[1] - this.field1227[0]) * arg1 + (float) this.field1227[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1230 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1231 = (int) (Statics.field1230 * 65536.0F);
        }
        if (this.field1225[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1261(arg0, 0, arg1);
        field1228[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1262(arg0, 0, arg1));
        field1228[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1225[arg0]; var6++) {
            float var7 = this.method1261(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1262(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1228[arg0][var6 * 2 + 1] = field1228[arg0][var6 * 2 - 1] * var9;
            field1228[arg0][var6 * 2] = field1228[arg0][var6 * 2 - 1] * var8 + field1228[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1228[arg0][var10] += field1228[arg0][var10 - 1] * var8 + field1228[arg0][var10 - 2] * var9;
            }
            field1228[arg0][1] += field1228[arg0][0] * var8 + var9;
            field1228[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1225[0] * 2; var11++) {
                field1228[0][var11] *= Statics.field1230;
            }
        }
        for (int var12 = 0; var12 < this.field1225[arg0] * 2; var12++) {
            field1229[arg0][var12] = (int) (field1228[arg0][var12] * 65536.0F);
        }
        return this.field1225[arg0] * 2;
    }

    @ObfuscatedName("bu.k(Ldf;Lby;)V")
    public final void method1264(class126 arg0, class56 arg1) {
        int var3 = arg0.method2481();
        this.field1225[0] = var3 >> 4;
        this.field1225[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1227;
            this.field1227[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1227[0] = arg0.method2373();
        this.field1227[1] = arg0.method2373();
        int var4 = arg0.method2481();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1225[var5]; var6++) {
                this.field1223[var5][0][var6] = arg0.method2373();
                this.field1232[var5][0][var6] = arg0.method2373();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1225[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1223[var7][1][var8] = this.field1223[var7][0][var8];
                    this.field1232[var7][1][var8] = this.field1232[var7][0][var8];
                } else {
                    this.field1223[var7][1][var8] = arg0.method2373();
                    this.field1232[var7][1][var8] = arg0.method2373();
                }
            }
        }
        if (var4 != 0 || this.field1227[1] != this.field1227[0]) {
            arg1.method1174(arg0);
        }
    }
}
