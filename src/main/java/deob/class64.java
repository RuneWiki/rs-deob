package deob;

@ObfuscatedName("bt")
public class class64 {

    @ObfuscatedName("bt.b")
    public int[] field1205 = new int[2];

    @ObfuscatedName("bt.j")
    public int[][][] field1204 = new int[2][2][4];

    @ObfuscatedName("bt.d")
    public int[][][] field1207 = new int[2][2][4];

    @ObfuscatedName("bt.x")
    public int[] field1208 = new int[2];

    @ObfuscatedName("bt.y")
    public static float[][] field1209 = new float[2][8];

    @ObfuscatedName("bt.r")
    public static int[][] field1210 = new int[2][8];

    @ObfuscatedName("bt.b(IIF)F")
    public float method1242(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1207[arg0][1][arg1] - this.field1207[arg0][0][arg1]) * arg2 + (float) this.field1207[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bt.g(F)F")
    public static float method1258(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bt.j(IIF)F")
    public float method1244(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1204[arg0][1][arg1] - this.field1204[arg0][0][arg1]) * arg2 + (float) this.field1204[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1258(var5);
    }

    @ObfuscatedName("bt.d(IF)I")
    public int method1245(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1208[1] - this.field1208[0]) * arg1 + (float) this.field1208[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1206 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1212 = (int) (Statics.field1206 * 65536.0F);
        }
        if (this.field1205[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1242(arg0, 0, arg1);
        field1209[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1244(arg0, 0, arg1));
        field1209[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1205[arg0]; var6++) {
            float var7 = this.method1242(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1244(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1209[arg0][var6 * 2 + 1] = field1209[arg0][var6 * 2 - 1] * var9;
            field1209[arg0][var6 * 2] = field1209[arg0][var6 * 2 - 1] * var8 + field1209[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1209[arg0][var10] += field1209[arg0][var10 - 1] * var8 + field1209[arg0][var10 - 2] * var9;
            }
            field1209[arg0][1] += field1209[arg0][0] * var8 + var9;
            field1209[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1205[0] * 2; var11++) {
                field1209[0][var11] *= Statics.field1206;
            }
        }
        for (int var12 = 0; var12 < this.field1205[arg0] * 2; var12++) {
            field1210[arg0][var12] = (int) (field1209[arg0][var12] * 65536.0F);
        }
        return this.field1205[arg0] * 2;
    }

    @ObfuscatedName("bt.x(Lds;Lba;)V")
    public final void method1246(class120 arg0, class58 arg1) {
        int var3 = arg0.method2344();
        this.field1205[0] = var3 >> 4;
        this.field1205[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1208;
            this.field1208[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1208[0] = arg0.method2346();
        this.field1208[1] = arg0.method2346();
        int var4 = arg0.method2344();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1205[var5]; var6++) {
                this.field1204[var5][0][var6] = arg0.method2346();
                this.field1207[var5][0][var6] = arg0.method2346();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1205[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1204[var7][1][var8] = this.field1204[var7][0][var8];
                    this.field1207[var7][1][var8] = this.field1207[var7][0][var8];
                } else {
                    this.field1204[var7][1][var8] = arg0.method2346();
                    this.field1207[var7][1][var8] = arg0.method2346();
                }
            }
        }
        if (var4 != 0 || this.field1208[1] != this.field1208[0]) {
            arg1.method1198(arg0);
        }
    }
}
