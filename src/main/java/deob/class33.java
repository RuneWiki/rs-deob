package deob;

@ObfuscatedName("am")
public class class33 {

    @ObfuscatedName("am.f")
    public int field323;

    @ObfuscatedName("am.l")
    public int field313;

    @ObfuscatedName("am.w")
    public int[][] field314;

    @ObfuscatedName("am.s")
    public int[][] field318;

    @ObfuscatedName("am.e")
    public int[][] field320;

    @ObfuscatedName("am.a")
    public int[][] field317;

    public class33(int arg0, int arg1) {
        this.field323 = arg0;
        this.field313 = arg1;
        this.field314 = new int[arg0][arg1];
        this.field318 = new int[arg0][arg1];
        this.field320 = new int[arg0][arg1];
        this.field317 = new int[arg0][arg1];
    }

    @ObfuscatedName("am.f(IIILjv;I)V")
    public void method511(int arg0, int arg1, int arg2, class262 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field323 || arg1 - arg2 > this.field313) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field323, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field313, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field314[var9][var10] += arg3.field3352 * 256 / arg3.field3353;
                this.field318[var9][var10] += arg3.field3351;
                this.field320[var9][var10] += arg3.field3350;
                int var10002 = this.field317[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("am.l(III)I")
    public int method512(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field323 || arg1 >= this.field313) {
            return 0;
        } else if (this.field320[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field314[arg0][arg1] / this.field317[arg0][arg1];
            int var4 = this.field318[arg0][arg1] / this.field317[arg0][arg1];
            int var5 = this.field320[arg0][arg1] / this.field317[arg0][arg1];
            return class10.method2954((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
