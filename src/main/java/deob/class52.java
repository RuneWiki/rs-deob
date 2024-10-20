package deob;

@ObfuscatedName("ay")
public class class52 {

    @ObfuscatedName("ay.i")
    public int[] field379 = new int[2];

    @ObfuscatedName("ay.s")
    public int[][][] field388 = new int[2][2][4];

    @ObfuscatedName("ay.a")
    public int[][][] field380 = new int[2][2][4];

    @ObfuscatedName("ay.o")
    public int[] field385 = new int[2];

    @ObfuscatedName("ay.g")
    public static float[][] field382 = new float[2][8];

    @ObfuscatedName("ay.e")
    public static int[][] field383 = new int[2][8];

    @ObfuscatedName("ay.i(IIF)F")
    public float method992(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field380[arg0][1][arg1] - this.field380[arg0][0][arg1]) * arg2 + (float) this.field380[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ay.w(F)F")
    public static float method993(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ay.s(IIF)F")
    public float method994(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field388[arg0][1][arg1] - this.field388[arg0][0][arg1]) * arg2 + (float) this.field388[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method993(var5);
    }

    @ObfuscatedName("ay.a(IF)I")
    public int method995(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field385[1] - this.field385[0]) * arg1 + (float) this.field385[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field384 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field381 = (int) (Statics.field384 * 65536.0F);
        }
        if (this.field379[arg0] == 0) {
            return 0;
        }
        float var5 = this.method992(arg0, 0, arg1);
        field382[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method994(arg0, 0, arg1));
        field382[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field379[arg0]; var6++) {
            float var7 = this.method992(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method994(arg0, var6, arg1));
            float var9 = var7 * var7;
            field382[arg0][var6 * 2 + 1] = field382[arg0][var6 * 2 - 1] * var9;
            field382[arg0][var6 * 2] = field382[arg0][var6 * 2 - 1] * var8 + field382[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field382[arg0][var10] += field382[arg0][var10 - 1] * var8 + field382[arg0][var10 - 2] * var9;
            }
            field382[arg0][1] += field382[arg0][0] * var8 + var9;
            field382[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field379[0] * 2; var11++) {
                field382[0][var11] *= Statics.field384;
            }
        }
        for (int var12 = 0; var12 < this.field379[arg0] * 2; var12++) {
            field383[arg0][var12] = (int) (field382[arg0][var12] * 65536.0F);
        }
        return this.field379[arg0] * 2;
    }

    @ObfuscatedName("ay.o(Lop;Lab;)V")
    public final void method1007(class401 arg0, class39 arg1) {
        int var3 = arg0.method6240();
        this.field379[0] = var3 >> 4;
        this.field379[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field385;
            this.field385[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field385[0] = arg0.method6242();
        this.field385[1] = arg0.method6242();
        int var4 = arg0.method6240();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field379[var5]; var6++) {
                this.field388[var5][0][var6] = arg0.method6242();
                this.field380[var5][0][var6] = arg0.method6242();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field379[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field388[var7][1][var8] = this.field388[var7][0][var8];
                    this.field380[var7][1][var8] = this.field380[var7][0][var8];
                } else {
                    this.field388[var7][1][var8] = arg0.method6242();
                    this.field380[var7][1][var8] = arg0.method6242();
                }
            }
        }
        if (var4 != 0 || this.field385[1] != this.field385[0]) {
            arg1.method737(arg0);
        }
    }
}
