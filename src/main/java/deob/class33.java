package deob;

@ObfuscatedName("ah")
public class class33 {

    @ObfuscatedName("ah.c")
    public int field308;

    @ObfuscatedName("ah.q")
    public int field299;

    @ObfuscatedName("ah.m")
    public int[][] field300;

    @ObfuscatedName("ah.j")
    public int[][] field301;

    @ObfuscatedName("ah.g")
    public int[][] field306;

    @ObfuscatedName("ah.i")
    public int[][] field302;

    public class33(int arg0, int arg1) {
        this.field308 = arg0;
        this.field299 = arg1;
        this.field300 = new int[arg0][arg1];
        this.field301 = new int[arg0][arg1];
        this.field306 = new int[arg0][arg1];
        this.field302 = new int[arg0][arg1];
    }

    @ObfuscatedName("ah.c(IIILjj;I)V")
    public void method528(int arg0, int arg1, int arg2, class262 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field308 || arg1 - arg2 > this.field299) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field308, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field299, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field300[var9][var10] += arg3.field3323 * 256 / arg3.field3326;
                this.field301[var9][var10] += arg3.field3322;
                this.field306[var9][var10] += arg3.field3325;
                int var10002 = this.field302[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ah.q(III)I")
    public int method535(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field308 || arg1 >= this.field299) {
            return 0;
        } else if (this.field306[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field300[arg0][arg1] / this.field302[arg0][arg1];
            int var4 = this.field301[arg0][arg1] / this.field302[arg0][arg1];
            int var5 = this.field306[arg0][arg1] / this.field302[arg0][arg1];
            return class10.method1470((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
