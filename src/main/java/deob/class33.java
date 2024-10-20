package deob;

@ObfuscatedName("ag")
public class class33 {

    @ObfuscatedName("ag.f")
    public int field286;

    @ObfuscatedName("ag.h")
    public int field283;

    @ObfuscatedName("ag.e")
    public int[][] field285;

    @ObfuscatedName("ag.b")
    public int[][] field284;

    @ObfuscatedName("ag.l")
    public int[][] field288;

    @ObfuscatedName("ag.w")
    public int[][] field287;

    public class33(int arg0, int arg1) {
        this.field286 = arg0;
        this.field283 = arg1;
        this.field285 = new int[arg0][arg1];
        this.field284 = new int[arg0][arg1];
        this.field288 = new int[arg0][arg1];
        this.field287 = new int[arg0][arg1];
    }

    @ObfuscatedName("ag.f(IIILjz;I)V")
    public void method525(int arg0, int arg1, int arg2, class262 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field286 || arg1 - arg2 > this.field283) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field286, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field283, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field285[var9][var10] += arg3.field3340 * 256 / arg3.field3338;
                this.field284[var9][var10] += arg3.field3341;
                this.field288[var9][var10] += arg3.field3342;
                int var10002 = this.field287[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ag.h(III)I")
    public int method520(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field286 || arg1 >= this.field283) {
            return 0;
        } else if (this.field288[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field285[arg0][arg1] / this.field287[arg0][arg1];
            int var4 = this.field284[arg0][arg1] / this.field287[arg0][arg1];
            int var5 = this.field288[arg0][arg1] / this.field287[arg0][arg1];
            return class10.method3547((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
