package deob;

@ObfuscatedName("bg")
public class class67 {

    @ObfuscatedName("bg.f")
    public int[] field528 = new int[2];

    @ObfuscatedName("bg.v")
    public int[][][] field534 = new int[2][2][4];

    @ObfuscatedName("bg.y")
    public int[][][] field531 = new int[2][2][4];

    @ObfuscatedName("bg.j")
    public int[] field532 = new int[2];

    @ObfuscatedName("bg.o")
    public static float[][] field533 = new float[2][8];

    @ObfuscatedName("bg.m")
    public static int[][] field538 = new int[2][8];

    @ObfuscatedName("bg.f(IIF)F")
    public float method962(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field531[arg0][1][arg1] - this.field531[arg0][0][arg1]) * arg2 + (float) this.field531[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bg.e(F)F")
    public static float method945(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bg.v(IIF)F")
    public float method948(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field534[arg0][1][arg1] - this.field534[arg0][0][arg1]) * arg2 + (float) this.field534[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method945(var5);
    }

    @ObfuscatedName("bg.y(IF)I")
    public int method946(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field532[1] - this.field532[0]) * arg1 + (float) this.field532[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field535 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field537 = (int) (Statics.field535 * 65536.0F);
        }
        if (this.field528[arg0] == 0) {
            return 0;
        }
        float var5 = this.method962(arg0, 0, arg1);
        field533[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method948(arg0, 0, arg1));
        field533[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field528[arg0]; var6++) {
            float var7 = this.method962(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method948(arg0, var6, arg1));
            float var9 = var7 * var7;
            field533[arg0][var6 * 2 + 1] = field533[arg0][var6 * 2 - 1] * var9;
            field533[arg0][var6 * 2] = field533[arg0][var6 * 2 - 1] * var8 + field533[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field533[arg0][var10] += field533[arg0][var10 - 1] * var8 + field533[arg0][var10 - 2] * var9;
            }
            field533[arg0][1] += field533[arg0][0] * var8 + var9;
            field533[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field528[0] * 2; var11++) {
                field533[0][var11] *= Statics.field535;
            }
        }
        for (int var12 = 0; var12 < this.field528[arg0] * 2; var12++) {
            field538[arg0][var12] = (int) (field533[arg0][var12] * 65536.0F);
        }
        return this.field528[arg0] * 2;
    }

    @ObfuscatedName("bg.j(Lnt;Lbx;)V")
    public final void method947(class384 arg0, class54 arg1) {
        int var3 = arg0.method5902();
        this.field528[0] = var3 >> 4;
        this.field528[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field532;
            this.field532[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field532[0] = arg0.method5899();
        this.field532[1] = arg0.method5899();
        int var4 = arg0.method5902();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field528[var5]; var6++) {
                this.field534[var5][0][var6] = arg0.method5899();
                this.field531[var5][0][var6] = arg0.method5899();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field528[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field534[var7][1][var8] = this.field534[var7][0][var8];
                    this.field531[var7][1][var8] = this.field531[var7][0][var8];
                } else {
                    this.field534[var7][1][var8] = arg0.method5899();
                    this.field531[var7][1][var8] = arg0.method5899();
                }
            }
        }
        if (var4 != 0 || this.field532[1] != this.field532[0]) {
            arg1.method718(arg0);
        }
    }
}
