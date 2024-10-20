package deob;

@ObfuscatedName("ah")
public class class44 {

    @ObfuscatedName("ah.i")
    public int field584;

    @ObfuscatedName("ah.j")
    public int field579;

    @ObfuscatedName("ah.a")
    public int[][] field578;

    @ObfuscatedName("ah.r")
    public int[][] field581;

    @ObfuscatedName("ah.o")
    public int[][] field582;

    @ObfuscatedName("ah.n")
    public int[][] field580;

    public class44(int arg0, int arg1) {
        this.field584 = arg0;
        this.field579 = arg1;
        this.field578 = new int[arg0][arg1];
        this.field581 = new int[arg0][arg1];
        this.field582 = new int[arg0][arg1];
        this.field580 = new int[arg0][arg1];
    }

    @ObfuscatedName("ah.i(IIILiz;I)V")
    public void method565(int arg0, int arg1, int arg2, class248 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field584 || arg1 - arg2 > this.field579) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field584, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field579, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field578[var9][var10] += arg3.field3347 * 256 / arg3.field3350;
                this.field581[var9][var10] += arg3.field3348;
                this.field582[var9][var10] += arg3.field3345;
                int var10002 = this.field580[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ah.j(IIS)I")
    public int method556(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field584 || arg1 >= this.field579) {
            return 0;
        } else if (this.field582[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field578[arg0][arg1] / this.field580[arg0][arg1];
            int var4 = this.field581[arg0][arg1] / this.field580[arg0][arg1];
            int var5 = this.field582[arg0][arg1] / this.field580[arg0][arg1];
            return class22.method751((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
