package deob;

@ObfuscatedName("bp")
public class class62 {

    @ObfuscatedName("bp.j")
    public int[] field1208 = new int[2];

    @ObfuscatedName("bp.z")
    public int[][][] field1206 = new int[2][2][4];

    @ObfuscatedName("bp.l")
    public int[][][] field1207 = new int[2][2][4];

    @ObfuscatedName("bp.w")
    public int[] field1212 = new int[2];

    @ObfuscatedName("bp.d")
    public static float[][] field1204 = new float[2][8];

    @ObfuscatedName("bp.f")
    public static int[][] field1210 = new int[2][8];

    @ObfuscatedName("bp.j(IIF)F")
    public float method1288(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1207[arg0][1][arg1] - this.field1207[arg0][0][arg1]) * arg2 + (float) this.field1207[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bp.y(F)F")
    public static float method1287(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bp.z(IIF)F")
    public float method1291(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1206[arg0][1][arg1] - this.field1206[arg0][0][arg1]) * arg2 + (float) this.field1206[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1287(var5);
    }

    @ObfuscatedName("bp.l(IF)I")
    public int method1289(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1212[1] - this.field1212[0]) * arg1 + (float) this.field1212[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1211 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1209 = (int) (Statics.field1211 * 65536.0F);
        }
        if (this.field1208[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1288(arg0, 0, arg1);
        field1204[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1291(arg0, 0, arg1));
        field1204[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1208[arg0]; var6++) {
            float var7 = this.method1288(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1291(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1204[arg0][var6 * 2 + 1] = field1204[arg0][var6 * 2 - 1] * var9;
            field1204[arg0][var6 * 2] = field1204[arg0][var6 * 2 - 1] * var8 + field1204[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1204[arg0][var10] += field1204[arg0][var10 - 1] * var8 + field1204[arg0][var10 - 2] * var9;
            }
            field1204[arg0][1] += field1204[arg0][0] * var8 + var9;
            field1204[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1208[0] * 2; var11++) {
                field1204[0][var11] *= Statics.field1211;
            }
        }
        for (int var12 = 0; var12 < this.field1208[arg0] * 2; var12++) {
            field1210[arg0][var12] = (int) (field1204[arg0][var12] * 65536.0F);
        }
        return this.field1208[arg0] * 2;
    }

    @ObfuscatedName("bp.w(Lde;Lbs;)V")
    public final void method1290(class114 arg0, class56 arg1) {
        int var3 = arg0.method2322();
        this.field1208[0] = var3 >> 4;
        this.field1208[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1212;
            this.field1212[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1212[0] = arg0.method2324();
        this.field1212[1] = arg0.method2324();
        int var4 = arg0.method2322();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1208[var5]; var6++) {
                this.field1206[var5][0][var6] = arg0.method2324();
                this.field1207[var5][0][var6] = arg0.method2324();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1208[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1206[var7][1][var8] = this.field1206[var7][0][var8];
                    this.field1207[var7][1][var8] = this.field1207[var7][0][var8];
                } else {
                    this.field1206[var7][1][var8] = arg0.method2324();
                    this.field1207[var7][1][var8] = arg0.method2324();
                }
            }
        }
        if (var4 != 0 || this.field1212[1] != this.field1212[0]) {
            arg1.method1230(arg0);
        }
    }
}
