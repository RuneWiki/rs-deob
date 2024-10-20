package deob;

@ObfuscatedName("bq")
public class class67 {

    @ObfuscatedName("bq.f")
    public int[] field524 = new int[2];

    @ObfuscatedName("bq.u")
    public int[][][] field519 = new int[2][2][4];

    @ObfuscatedName("bq.p")
    public int[][][] field520 = new int[2][2][4];

    @ObfuscatedName("bq.b")
    public int[] field521 = new int[2];

    @ObfuscatedName("bq.e")
    public static float[][] field517 = new float[2][8];

    @ObfuscatedName("bq.k")
    public static int[][] field523 = new int[2][8];

    @ObfuscatedName("bq.f(IIF)F")
    public float method892(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field520[arg0][1][arg1] - this.field520[arg0][0][arg1]) * arg2 + (float) this.field520[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("bq.o(F)F")
    public static float method893(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("bq.u(IIF)F")
    public float method897(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field519[arg0][1][arg1] - this.field519[arg0][0][arg1]) * arg2 + (float) this.field519[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method893(var5);
    }

    @ObfuscatedName("bq.p(IF)I")
    public int method899(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field521[1] - this.field521[0]) * arg1 + (float) this.field521[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field527 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field525 = (int) (Statics.field527 * 65536.0F);
        }
        if (this.field524[arg0] == 0) {
            return 0;
        }
        float var5 = this.method892(arg0, 0, arg1);
        field517[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method897(arg0, 0, arg1));
        field517[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field524[arg0]; var6++) {
            float var7 = this.method892(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method897(arg0, var6, arg1));
            float var9 = var7 * var7;
            field517[arg0][var6 * 2 + 1] = field517[arg0][var6 * 2 - 1] * var9;
            field517[arg0][var6 * 2] = field517[arg0][var6 * 2 - 1] * var8 + field517[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field517[arg0][var10] += field517[arg0][var10 - 1] * var8 + field517[arg0][var10 - 2] * var9;
            }
            field517[arg0][1] += field517[arg0][0] * var8 + var9;
            field517[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field524[0] * 2; var11++) {
                field517[0][var11] *= Statics.field527;
            }
        }
        for (int var12 = 0; var12 < this.field524[arg0] * 2; var12++) {
            field523[arg0][var12] = (int) (field517[arg0][var12] * 65536.0F);
        }
        return this.field524[arg0] * 2;
    }

    @ObfuscatedName("bq.b(Lnu;Lbr;)V")
    public final void method896(class382 arg0, class54 arg1) {
        int var3 = arg0.method5856();
        this.field524[0] = var3 >> 4;
        this.field524[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field521;
            this.field521[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field521[0] = arg0.method5858();
        this.field521[1] = arg0.method5858();
        int var4 = arg0.method5856();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field524[var5]; var6++) {
                this.field519[var5][0][var6] = arg0.method5858();
                this.field520[var5][0][var6] = arg0.method5858();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field524[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field519[var7][1][var8] = this.field519[var7][0][var8];
                    this.field520[var7][1][var8] = this.field520[var7][0][var8];
                } else {
                    this.field519[var7][1][var8] = arg0.method5858();
                    this.field520[var7][1][var8] = arg0.method5858();
                }
            }
        }
        if (var4 != 0 || this.field521[1] != this.field521[0]) {
            arg1.method664(arg0);
        }
    }
}
