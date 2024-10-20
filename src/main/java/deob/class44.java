package deob;

@ObfuscatedName("am")
public class class44 {

    @ObfuscatedName("am.i")
    public int field591;

    @ObfuscatedName("am.w")
    public int field604;

    @ObfuscatedName("am.a")
    public int[][] field593;

    @ObfuscatedName("am.t")
    public int[][] field594;

    @ObfuscatedName("am.s")
    public int[][] field595;

    @ObfuscatedName("am.r")
    public int[][] field596;

    public class44(int arg0, int arg1) {
        this.field591 = arg0;
        this.field604 = arg1;
        this.field593 = new int[arg0][arg1];
        this.field594 = new int[arg0][arg1];
        this.field595 = new int[arg0][arg1];
        this.field596 = new int[arg0][arg1];
    }

    @ObfuscatedName("am.i(IIILia;B)V")
    public void method550(int arg0, int arg1, int arg2, class247 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field591 || arg1 - arg2 > this.field604) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field591, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field604, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field593[var9][var10] += arg3.field3352 * 256 / arg3.field3355;
                this.field594[var9][var10] += arg3.field3349;
                this.field595[var9][var10] += arg3.field3354;
                int var10002 = this.field596[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("am.w(III)I")
    public int method551(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field591 || arg1 >= this.field604) {
            return 0;
        } else if (this.field595[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field593[arg0][arg1] / this.field596[arg0][arg1];
            int var4 = this.field594[arg0][arg1] / this.field596[arg0][arg1];
            int var5 = this.field595[arg0][arg1] / this.field596[arg0][arg1];
            return class22.method1617((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
