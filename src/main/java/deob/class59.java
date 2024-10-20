package deob;

@ObfuscatedName("cn")
public class class59 {

    @ObfuscatedName("cn.aw")
    public int[] field443 = new int[2];

    @ObfuscatedName("cn.ar")
    public int[][][] field441 = new int[2][2][4];

    @ObfuscatedName("cn.am")
    public int[][][] field439 = new int[2][2][4];

    @ObfuscatedName("cn.as")
    public int[] field440 = new int[2];

    @ObfuscatedName("cn.aj")
    public static float[][] field442 = new float[2][8];

    @ObfuscatedName("cn.ag")
    public static int[][] field444 = new int[2][8];

    @ObfuscatedName("cn.aw(IIF)F")
    public float method1076(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field439[arg0][1][arg1] - this.field439[arg0][0][arg1]) * arg2 + (float) this.field439[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("cn.ay(F)F")
    public static float method1077(float arg0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("cn.ar(IIF)F")
    public float method1078(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field441[arg0][1][arg1] - this.field441[arg0][0][arg1]) * arg2 + (float) this.field441[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1077(var5);
    }

    @ObfuscatedName("cn.am(IF)I")
    public int method1079(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field440[1] - this.field440[0]) * arg1 + (float) this.field440[0];
            float var4 = var3 * 0.0030517578F;
            Statics.field446 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.field447 = (int) (Statics.field446 * 65536.0F);
        }
        if (this.field443[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1076(arg0, 0, arg1);
        field442[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1078(arg0, 0, arg1));
        field442[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field443[arg0]; var6++) {
            float var7 = this.method1076(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1078(arg0, var6, arg1));
            float var9 = var7 * var7;
            field442[arg0][var6 * 2 + 1] = field442[arg0][var6 * 2 - 1] * var9;
            field442[arg0][var6 * 2] = field442[arg0][var6 * 2 - 1] * var8 + field442[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field442[arg0][var10] += field442[arg0][var10 - 1] * var8 + field442[arg0][var10 - 2] * var9;
            }
            field442[arg0][1] += field442[arg0][0] * var8 + var9;
            field442[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field443[0] * 2; var11++) {
                field442[0][var11] *= Statics.field446;
            }
        }
        for (int var12 = 0; var12 < this.field443[arg0] * 2; var12++) {
            field444[arg0][var12] = (int) (field442[arg0][var12] * 65536.0F);
        }
        return this.field443[arg0] * 2;
    }

    @ObfuscatedName("cn.as(Lty;Lbz;)V")
    public final void method1088(class514 arg0, class44 arg1) {
        int var3 = arg0.method8244();
        this.field443[0] = var3 >> 4;
        this.field443[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.field440;
            this.field440[1] = 0;
            var9[0] = 0;
            return;
        }
        this.field440[0] = arg0.method8246();
        this.field440[1] = arg0.method8246();
        int var4 = arg0.method8244();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field443[var5]; var6++) {
                this.field441[var5][0][var6] = arg0.method8246();
                this.field439[var5][0][var6] = arg0.method8246();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field443[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field441[var7][1][var8] = this.field441[var7][0][var8];
                    this.field439[var7][1][var8] = this.field439[var7][0][var8];
                } else {
                    this.field441[var7][1][var8] = arg0.method8246();
                    this.field439[var7][1][var8] = arg0.method8246();
                }
            }
        }
        if (var4 != 0 || this.field440[1] != this.field440[0]) {
            arg1.method812(arg0);
        }
    }
}
