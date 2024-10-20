package deob;

@ObfuscatedName("aw")
public class class45 {

    @ObfuscatedName("aw.t")
    public int field549;

    @ObfuscatedName("aw.q")
    public int field550;

    @ObfuscatedName("aw.i")
    public int[][] field548;

    @ObfuscatedName("aw.a")
    public int[][] field547;

    @ObfuscatedName("aw.l")
    public int[][] field546;

    @ObfuscatedName("aw.b")
    public int[][] field551;

    public class45(int arg0, int arg1) {
        this.field549 = arg0;
        this.field550 = arg1;
        this.field548 = new int[arg0][arg1];
        this.field547 = new int[arg0][arg1];
        this.field546 = new int[arg0][arg1];
        this.field551 = new int[arg0][arg1];
    }

    @ObfuscatedName("aw.t(IIILjs;I)V")
    public void method585(int arg0, int arg1, int arg2, class274 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field549 || arg1 - arg2 > this.field550) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field549, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field550, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field548[var9][var10] += arg3.field3505 * 256 / arg3.field3511;
                this.field547[var9][var10] += arg3.field3508;
                this.field546[var9][var10] += arg3.field3510;
                int var10002 = this.field551[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("aw.q(IIB)I")
    public int method586(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field549 || arg1 >= this.field550) {
            return 0;
        } else if (this.field546[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field548[arg0][arg1] / this.field551[arg0][arg1];
            int var4 = this.field547[arg0][arg1] / this.field551[arg0][arg1];
            int var5 = this.field546[arg0][arg1] / this.field551[arg0][arg1];
            return class22.method50((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
