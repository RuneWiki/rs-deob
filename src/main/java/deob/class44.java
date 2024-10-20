package deob;

@ObfuscatedName("ac")
public class class44 {

    @ObfuscatedName("ac.i")
    public int field572;

    @ObfuscatedName("ac.c")
    public int field567;

    @ObfuscatedName("ac.e")
    public int[][] field575;

    @ObfuscatedName("ac.v")
    public int[][] field566;

    @ObfuscatedName("ac.b")
    public int[][] field570;

    @ObfuscatedName("ac.y")
    public int[][] field568;

    public class44(int arg0, int arg1) {
        this.field572 = arg0;
        this.field567 = arg1;
        this.field575 = new int[arg0][arg1];
        this.field566 = new int[arg0][arg1];
        this.field570 = new int[arg0][arg1];
        this.field568 = new int[arg0][arg1];
    }

    @ObfuscatedName("ac.i(IIILiy;I)V")
    public void method515(int arg0, int arg1, int arg2, class247 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field572 || arg1 - arg2 > this.field567) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field572, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field567, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field575[var9][var10] += arg3.field3338 * 256 / arg3.field3343;
                this.field566[var9][var10] += arg3.field3342;
                this.field570[var9][var10] += arg3.field3344;
                int var10002 = this.field568[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ac.c(IIS)I")
    public int method519(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field572 || arg1 >= this.field567) {
            return 0;
        } else if (this.field570[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field575[arg0][arg1] / this.field568[arg0][arg1];
            int var4 = this.field566[arg0][arg1] / this.field568[arg0][arg1];
            int var5 = this.field570[arg0][arg1] / this.field568[arg0][arg1];
            return class22.method669((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
