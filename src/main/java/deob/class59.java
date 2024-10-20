package deob;

@ObfuscatedName("bo")
public class class59 {

    @ObfuscatedName("bo.n")
    public int[] field1194 = new int[2];

    @ObfuscatedName("bo.a")
    public int[][][] field1193 = new int[2][2][4];

    @ObfuscatedName("bo.m")
    public int[][][] field1197 = new int[2][2][4];

    @ObfuscatedName("bo.s")
    public int[] field1195 = new int[2];

    @ObfuscatedName("bo.j")
    public static float[][] field1196 = new float[2][8];

    @ObfuscatedName("bo.f")
    public static int[][] field1191 = new int[2][8];

    @ObfuscatedName("bo.n(IIF)F")
    public float method1155(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1197[arg0][1][arg1] - this.field1197[arg0][0][arg1]) * arg2 + (float) this.field1197[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bo.g(F)F")
    public static float method1157(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bo.a(IIF)F")
    public float method1144(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1193[arg0][1][arg1] - this.field1193[arg0][0][arg1]) * arg2 + (float) this.field1193[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1157(var5);
    }

    @ObfuscatedName("bo.m(IF)I")
    public int method1145(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1195[1] - this.field1195[0]) * arg1 + (float) this.field1195[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field1198 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field1199 = (int) (Statics.field1198 * 65536.0F);
        }
        if (this.field1194[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1155(arg0, 0, arg1);
        field1196[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1144(arg0, 0, arg1));
        field1196[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1194[arg0]; var6++) {
            float var7 = this.method1155(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1144(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1196[arg0][var6 * 2 + 1] = field1196[arg0][var6 * 2 - 1] * var9;
            field1196[arg0][var6 * 2] = field1196[arg0][var6 * 2 - 1] * var8 + field1196[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1196[arg0][var10] += field1196[arg0][var10 - 1] * var8 + field1196[arg0][var10 - 2] * var9;
            }
            field1196[arg0][1] += field1196[arg0][0] * var8 + var9;
            field1196[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1194[0] * 2; var11++) {
                field1196[0][var11] *= Statics.field1198;
            }
        }
        for (int var12 = 0; var12 < this.field1194[arg0] * 2; var12++) {
            field1191[arg0][var12] = (int) (field1196[arg0][var12] * 65536.0F);
        }
        return this.field1194[arg0] * 2;
    }

    @ObfuscatedName("bo.s(Ldp;Lbi;)V")
    public final void method1146(class111 arg0, class53 arg1) {
        int var3 = arg0.method2211();
        this.field1194[0] = var3 >> 4;
        this.field1194[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field1195;
            this.field1195[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field1195[0] = arg0.method2395();
        this.field1195[1] = arg0.method2395();
        int var4 = arg0.method2211();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1194[var5]; var6++) {
                this.field1193[var5][0][var6] = arg0.method2395();
                this.field1197[var5][0][var6] = arg0.method2395();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1194[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1193[var7][1][var8] = this.field1193[var7][0][var8];
                    this.field1197[var7][1][var8] = this.field1197[var7][0][var8];
                } else {
                    this.field1193[var7][1][var8] = arg0.method2395();
                    this.field1197[var7][1][var8] = arg0.method2395();
                }
            }
        }
        if (var4 != 0 || this.field1195[1] != this.field1195[0]) {
            arg1.method1080(arg0);
        }
    }
}
