package deob;

@ObfuscatedName("an")
public class class33 {

    @ObfuscatedName("an.z")
    public int field283;

    @ObfuscatedName("an.w")
    public int field288;

    @ObfuscatedName("an.s")
    public int[][] field284;

    @ObfuscatedName("an.l")
    public int[][] field282;

    @ObfuscatedName("an.u")
    public int[][] field286;

    @ObfuscatedName("an.q")
    public int[][] field287;

    public class33(int arg0, int arg1) {
        this.field283 = arg0;
        this.field288 = arg1;
        this.field284 = new int[arg0][arg1];
        this.field282 = new int[arg0][arg1];
        this.field286 = new int[arg0][arg1];
        this.field287 = new int[arg0][arg1];
    }

    @ObfuscatedName("an.z(IIILiq;S)V")
    public void method482(int arg0, int arg1, int arg2, class260 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field283 || arg1 - arg2 > this.field288) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field283, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field288, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field284[var9][var10] += arg3.field3285 * 256 / arg3.field3282;
                this.field282[var9][var10] += arg3.field3288;
                this.field286[var9][var10] += arg3.field3287;
                int var10002 = this.field287[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("an.w(IIB)I")
    public int method488(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field283 || arg1 >= this.field288) {
            return 0;
        } else if (this.field286[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field284[arg0][arg1] / this.field287[arg0][arg1];
            int var4 = this.field282[arg0][arg1] / this.field287[arg0][arg1];
            int var5 = this.field286[arg0][arg1] / this.field287[arg0][arg1];
            return class10.method2937((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
