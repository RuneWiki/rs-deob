package deob;

@ObfuscatedName("av")
public class class33 {

    @ObfuscatedName("av.y")
    public int field307;

    @ObfuscatedName("av.c")
    public int field304;

    @ObfuscatedName("av.n")
    public int[][] field305;

    @ObfuscatedName("av.u")
    public int[][] field306;

    @ObfuscatedName("av.i")
    public int[][] field303;

    @ObfuscatedName("av.r")
    public int[][] field308;

    public class33(int arg0, int arg1) {
        this.field307 = arg0;
        this.field304 = arg1;
        this.field305 = new int[arg0][arg1];
        this.field306 = new int[arg0][arg1];
        this.field303 = new int[arg0][arg1];
        this.field308 = new int[arg0][arg1];
    }

    @ObfuscatedName("av.y(IIILjg;I)V")
    public void method510(int arg0, int arg1, int arg2, class262 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field307 || arg1 - arg2 > this.field304) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field307, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field304, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field305[var9][var10] += arg3.field3340 * 256 / arg3.field3334;
                this.field306[var9][var10] += arg3.field3337;
                this.field303[var9][var10] += arg3.field3338;
                int var10002 = this.field308[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("av.c(IIB)I")
    public int method514(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field307 || arg1 >= this.field304) {
            return 0;
        } else if (this.field303[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field305[arg0][arg1] / this.field308[arg0][arg1];
            int var4 = this.field306[arg0][arg1] / this.field308[arg0][arg1];
            int var5 = this.field303[arg0][arg1] / this.field308[arg0][arg1];
            return class10.method279((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
