package deob;

@ObfuscatedName("ap")
public class class45 {

    @ObfuscatedName("ap.g")
    public int field564;

    @ObfuscatedName("ap.e")
    public int field562;

    @ObfuscatedName("ap.b")
    public int[][] field563;

    @ObfuscatedName("ap.z")
    public int[][] field568;

    @ObfuscatedName("ap.n")
    public int[][] field565;

    @ObfuscatedName("ap.l")
    public int[][] field561;

    public class45(int arg0, int arg1) {
        this.field564 = arg0;
        this.field562 = arg1;
        this.field563 = new int[arg0][arg1];
        this.field568 = new int[arg0][arg1];
        this.field565 = new int[arg0][arg1];
        this.field561 = new int[arg0][arg1];
    }

    @ObfuscatedName("ap.g(IIILjv;I)V")
    public void method596(int arg0, int arg1, int arg2, class274 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field564 || arg1 - arg2 > this.field562) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field564, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field562, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field563[var9][var10] += arg3.field3502 * 256 / arg3.field3505;
                this.field568[var9][var10] += arg3.field3503;
                this.field565[var9][var10] += arg3.field3499;
                int var10002 = this.field561[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ap.e(III)I")
    public int method589(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field564 || arg1 >= this.field562) {
            return 0;
        } else if (this.field565[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field563[arg0][arg1] / this.field561[arg0][arg1];
            int var4 = this.field568[arg0][arg1] / this.field561[arg0][arg1];
            int var5 = this.field565[arg0][arg1] / this.field561[arg0][arg1];
            return class22.method72((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
