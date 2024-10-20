package deob;

@ObfuscatedName("ab")
public class class44 {

    @ObfuscatedName("ab.a")
    public int field553;

    @ObfuscatedName("ab.j")
    public int field563;

    @ObfuscatedName("ab.n")
    public int[][] field555;

    @ObfuscatedName("ab.r")
    public int[][] field561;

    @ObfuscatedName("ab.v")
    public int[][] field557;

    @ObfuscatedName("ab.e")
    public int[][] field558;

    public class44(int arg0, int arg1) {
        this.field553 = arg0;
        this.field563 = arg1;
        this.field555 = new int[arg0][arg1];
        this.field561 = new int[arg0][arg1];
        this.field557 = new int[arg0][arg1];
        this.field558 = new int[arg0][arg1];
    }

    @ObfuscatedName("ab.a(IIILij;I)V")
    public void method533(int arg0, int arg1, int arg2, class247 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field553 || arg1 - arg2 > this.field563) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field553, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field563, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field555[var9][var10] += arg3.field3344 * 256 / arg3.field3348;
                this.field561[var9][var10] += arg3.field3342;
                this.field557[var9][var10] += arg3.field3347;
                int var10002 = this.field558[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ab.j(III)I")
    public int method539(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field553 || arg1 >= this.field563) {
            return 0;
        } else if (this.field557[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field555[arg0][arg1] / this.field558[arg0][arg1];
            int var4 = this.field561[arg0][arg1] / this.field558[arg0][arg1];
            int var5 = this.field557[arg0][arg1] / this.field558[arg0][arg1];
            return class22.method2853((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
