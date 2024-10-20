package deob;

@ObfuscatedName("ax")
public class class45 {

    @ObfuscatedName("ax.d")
    public int field570;

    @ObfuscatedName("ax.z")
    public int field567;

    @ObfuscatedName("ax.n")
    public int[][] field573;

    @ObfuscatedName("ax.r")
    public int[][] field569;

    @ObfuscatedName("ax.e")
    public int[][] field566;

    @ObfuscatedName("ax.y")
    public int[][] field571;

    public class45(int arg0, int arg1) {
        this.field570 = arg0;
        this.field567 = arg1;
        this.field573 = new int[arg0][arg1];
        this.field569 = new int[arg0][arg1];
        this.field566 = new int[arg0][arg1];
        this.field571 = new int[arg0][arg1];
    }

    @ObfuscatedName("ax.d(IIILjy;B)V")
    public void method546(int arg0, int arg1, int arg2, class274 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field570 || arg1 - arg2 > this.field567) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field570, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field567, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field573[var9][var10] += arg3.field3498 * 256 / arg3.field3501;
                this.field569[var9][var10] += arg3.field3499;
                this.field566[var9][var10] += arg3.field3500;
                int var10002 = this.field571[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ax.z(IIB)I")
    public int method548(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field570 || arg1 >= this.field567) {
            return 0;
        } else if (this.field566[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field573[arg0][arg1] / this.field571[arg0][arg1];
            int var4 = this.field569[arg0][arg1] / this.field571[arg0][arg1];
            int var5 = this.field566[arg0][arg1] / this.field571[arg0][arg1];
            return class22.method1711((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
