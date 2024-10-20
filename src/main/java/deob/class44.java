package deob;

@ObfuscatedName("aq")
public class class44 {

    @ObfuscatedName("aq.e")
    public int field571;

    @ObfuscatedName("aq.n")
    public int field564;

    @ObfuscatedName("aq.g")
    public int[][] field572;

    @ObfuscatedName("aq.y")
    public int[][] field563;

    @ObfuscatedName("aq.w")
    public int[][] field567;

    @ObfuscatedName("aq.k")
    public int[][] field569;

    public class44(int arg0, int arg1) {
        this.field571 = arg0;
        this.field564 = arg1;
        this.field572 = new int[arg0][arg1];
        this.field563 = new int[arg0][arg1];
        this.field567 = new int[arg0][arg1];
        this.field569 = new int[arg0][arg1];
    }

    @ObfuscatedName("aq.e(IIILif;I)V")
    public void method539(int arg0, int arg1, int arg2, class248 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field571 || arg1 - arg2 > this.field564) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field571, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field564, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field572[var9][var10] += arg3.field3336 * 256 / arg3.field3339;
                this.field563[var9][var10] += arg3.field3337;
                this.field567[var9][var10] += arg3.field3338;
                int var10002 = this.field569[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("aq.n(III)I")
    public int method537(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field571 || arg1 >= this.field564) {
            return 0;
        } else if (this.field567[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field572[arg0][arg1] / this.field569[arg0][arg1];
            int var4 = this.field563[arg0][arg1] / this.field569[arg0][arg1];
            int var5 = this.field567[arg0][arg1] / this.field569[arg0][arg1];
            return class22.method1917((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
