package deob;

@ObfuscatedName("ba")
public class class54 {

    @ObfuscatedName("ba.o")
    public int[] field417 = new int[2];

    @ObfuscatedName("ba.l")
    public int[][][] field416 = new int[2][2][4];

    @ObfuscatedName("ba.k")
    public int[][][] field414 = new int[2][2][4];

    @ObfuscatedName("ba.a")
    public int[] field413 = new int[2];

    @ObfuscatedName("ba.m")
    public static float[][] field411 = new float[2][8];

    @ObfuscatedName("ba.p")
    public static int[][] field419 = new int[2][8];

    @ObfuscatedName("ba.o(IIF)F")
    public float method973(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field414[arg0][1][arg1] - this.field414[arg0][0][arg1]) * arg2 + (float) this.field414[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ba.q(F)F")
    public static float method972(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ba.l(IIF)F")
    public float method971(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field416[arg0][1][arg1] - this.field416[arg0][0][arg1]) * arg2 + (float) this.field416[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method972(var5);
    }

    @ObfuscatedName("ba.k(IF)I")
    public int method985(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field413[1] - this.field413[0]) * arg1 + (float) this.field413[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field418 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field415 = (int) (Statics.field418 * 65536.0F);
        }
        if (this.field417[arg0] == 0) {
            return 0;
        }
        float var5 = this.method973(arg0, 0, arg1);
        field411[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method971(arg0, 0, arg1));
        field411[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field417[arg0]; var6++) {
            float var7 = this.method973(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method971(arg0, var6, arg1));
            float var9 = var7 * var7;
            field411[arg0][var6 * 2 + 1] = field411[arg0][var6 * 2 - 1] * var9;
            field411[arg0][var6 * 2] = field411[arg0][var6 * 2 - 1] * var8 + field411[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field411[arg0][var10] += field411[arg0][var10 - 1] * var8 + field411[arg0][var10 - 2] * var9;
            }
            field411[arg0][1] += field411[arg0][0] * var8 + var9;
            field411[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field417[0] * 2; var11++) {
                field411[0][var11] *= Statics.field418;
            }
        }
        for (int var12 = 0; var12 < this.field417[arg0] * 2; var12++) {
            field419[arg0][var12] = (int) (field411[arg0][var12] * 65536.0F);
        }
        return this.field417[arg0] * 2;
    }

    @ObfuscatedName("ba.a(Lpx;Laq;)V")
    public final void method975(class440 arg0, class41 arg1) {
        int var3 = arg0.method7071();
        this.field417[0] = var3 >> 4;
        this.field417[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field413;
            this.field413[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field413[0] = arg0.method7082();
        this.field413[1] = arg0.method7082();
        int var4 = arg0.method7071();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field417[var5]; var6++) {
                this.field416[var5][0][var6] = arg0.method7082();
                this.field414[var5][0][var6] = arg0.method7082();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field417[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field416[var7][1][var8] = this.field416[var7][0][var8];
                    this.field414[var7][1][var8] = this.field414[var7][0][var8];
                } else {
                    this.field416[var7][1][var8] = arg0.method7082();
                    this.field414[var7][1][var8] = arg0.method7082();
                }
            }
        }
        if (var4 != 0 || this.field413[1] != this.field413[0]) {
            arg1.method741(arg0);
        }
    }
}
