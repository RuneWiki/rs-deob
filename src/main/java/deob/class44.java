package deob;

@ObfuscatedName("ax")
public class class44 {

    @ObfuscatedName("ax.w")
    public int field589;

    @ObfuscatedName("ax.o")
    public int field591;

    @ObfuscatedName("ax.x")
    public int[][] field584;

    @ObfuscatedName("ax.k")
    public int[][] field581;

    @ObfuscatedName("ax.f")
    public int[][] field585;

    @ObfuscatedName("ax.i")
    public int[][] field583;

    public class44(int arg0, int arg1) {
        this.field589 = arg0;
        this.field591 = arg1;
        this.field584 = new int[arg0][arg1];
        this.field581 = new int[arg0][arg1];
        this.field585 = new int[arg0][arg1];
        this.field583 = new int[arg0][arg1];
    }

    @ObfuscatedName("ax.w(IIILix;I)V")
    public void method542(int arg0, int arg1, int arg2, class250 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field589 || arg1 - arg2 > this.field591) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field589, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field591, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field584[var9][var10] += arg3.field3350 * 256 / arg3.field3354;
                this.field581[var9][var10] += arg3.field3348;
                this.field585[var9][var10] += arg3.field3353;
                int var10002 = this.field583[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ax.o(III)I")
    public int method547(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field589 || arg1 >= this.field591) {
            return 0;
        } else if (this.field585[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field584[arg0][arg1] / this.field583[arg0][arg1];
            int var4 = this.field581[arg0][arg1] / this.field583[arg0][arg1];
            int var5 = this.field585[arg0][arg1] / this.field583[arg0][arg1];
            return class22.method8((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
