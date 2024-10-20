package deob;

@ObfuscatedName("as")
public class class33 {

    @ObfuscatedName("as.w")
    public int field286;

    @ObfuscatedName("as.m")
    public int field283;

    @ObfuscatedName("as.q")
    public int[][] field287;

    @ObfuscatedName("as.b")
    public int[][] field285;

    @ObfuscatedName("as.f")
    public int[][] field284;

    @ObfuscatedName("as.n")
    public int[][] field282;

    public class33(int arg0, int arg1) {
        this.field286 = arg0;
        this.field283 = arg1;
        this.field287 = new int[arg0][arg1];
        this.field285 = new int[arg0][arg1];
        this.field284 = new int[arg0][arg1];
        this.field282 = new int[arg0][arg1];
    }

    @ObfuscatedName("as.w(IIILij;B)V")
    public void method519(int arg0, int arg1, int arg2, class260 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field286 || arg1 - arg2 > this.field283) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field286, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field283, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field287[var9][var10] += arg3.field3305 * 256 / arg3.field3308;
                this.field285[var9][var10] += arg3.field3306;
                this.field284[var9][var10] += arg3.field3307;
                int var10002 = this.field282[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("as.m(III)I")
    public int method528(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field286 || arg1 >= this.field283) {
            return 0;
        } else if (this.field284[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field287[arg0][arg1] / this.field282[arg0][arg1];
            int var4 = this.field285[arg0][arg1] / this.field282[arg0][arg1];
            int var5 = this.field284[arg0][arg1] / this.field282[arg0][arg1];
            return class10.method16((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
