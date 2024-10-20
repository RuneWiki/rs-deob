package deob;

@ObfuscatedName("ax")
public class class44 {

    @ObfuscatedName("ax.c")
    public int field575;

    @ObfuscatedName("ax.o")
    public int field571;

    @ObfuscatedName("ax.i")
    public int[][] field572;

    @ObfuscatedName("ax.u")
    public int[][] field574;

    @ObfuscatedName("ax.g")
    public int[][] field576;

    @ObfuscatedName("ax.m")
    public int[][] field573;

    public class44(int arg0, int arg1) {
        this.field575 = arg0;
        this.field571 = arg1;
        this.field572 = new int[arg0][arg1];
        this.field574 = new int[arg0][arg1];
        this.field576 = new int[arg0][arg1];
        this.field573 = new int[arg0][arg1];
    }

    @ObfuscatedName("ax.c(IIILiy;I)V")
    public void method521(int arg0, int arg1, int arg2, class247 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field575 || arg1 - arg2 > this.field571) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field575, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field571, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field572[var9][var10] += arg3.field3318 * 256 / arg3.field3316;
                this.field574[var9][var10] += arg3.field3321;
                this.field576[var9][var10] += arg3.field3320;
                int var10002 = this.field573[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ax.o(IIS)I")
    public int method516(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field575 || arg1 >= this.field571) {
            return 0;
        } else if (this.field576[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field572[arg0][arg1] / this.field573[arg0][arg1];
            int var4 = this.field574[arg0][arg1] / this.field573[arg0][arg1];
            int var5 = this.field576[arg0][arg1] / this.field573[arg0][arg1];
            return class22.method4475((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
