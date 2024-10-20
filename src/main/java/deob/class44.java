package deob;

@ObfuscatedName("as")
public class class44 {

    @ObfuscatedName("as.p")
    public int field578;

    @ObfuscatedName("as.m")
    public int field585;

    @ObfuscatedName("as.e")
    public int[][] field579;

    @ObfuscatedName("as.t")
    public int[][] field580;

    @ObfuscatedName("as.w")
    public int[][] field581;

    @ObfuscatedName("as.z")
    public int[][] field582;

    public class44(int arg0, int arg1) {
        this.field578 = arg0;
        this.field585 = arg1;
        this.field579 = new int[arg0][arg1];
        this.field580 = new int[arg0][arg1];
        this.field581 = new int[arg0][arg1];
        this.field582 = new int[arg0][arg1];
    }

    @ObfuscatedName("as.p(IIILiz;I)V")
    public void method534(int arg0, int arg1, int arg2, class247 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field578 || arg1 - arg2 > this.field585) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field578, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field585, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field579[var9][var10] += arg3.field3357 * 256 / arg3.field3354;
                this.field580[var9][var10] += arg3.field3351;
                this.field581[var9][var10] += arg3.field3353;
                int var10002 = this.field582[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("as.m(IIB)I")
    public int method536(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field578 || arg1 >= this.field585) {
            return 0;
        } else if (this.field581[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field579[arg0][arg1] / this.field582[arg0][arg1];
            int var4 = this.field580[arg0][arg1] / this.field582[arg0][arg1];
            int var5 = this.field581[arg0][arg1] / this.field582[arg0][arg1];
            return class22.method1647((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
