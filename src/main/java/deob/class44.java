package deob;

@ObfuscatedName("ay")
public class class44 {

    @ObfuscatedName("ay.n")
    public int field546;

    @ObfuscatedName("ay.v")
    public int field552;

    @ObfuscatedName("ay.y")
    public int[][] field545;

    @ObfuscatedName("ay.r")
    public int[][] field547;

    @ObfuscatedName("ay.h")
    public int[][] field549;

    @ObfuscatedName("ay.d")
    public int[][] field550;

    public class44(int arg0, int arg1) {
        this.field546 = arg0;
        this.field552 = arg1;
        this.field545 = new int[arg0][arg1];
        this.field547 = new int[arg0][arg1];
        this.field549 = new int[arg0][arg1];
        this.field550 = new int[arg0][arg1];
    }

    @ObfuscatedName("ay.n(IIILip;I)V")
    public void method535(int arg0, int arg1, int arg2, class258 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field546 || arg1 - arg2 > this.field552) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field546, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field552, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field545[var9][var10] += arg3.field3434 * 256 / arg3.field3432;
                this.field547[var9][var10] += arg3.field3433;
                this.field549[var9][var10] += arg3.field3436;
                int var10002 = this.field550[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ay.v(IIB)I")
    public int method529(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field546 || arg1 >= this.field552) {
            return 0;
        } else if (this.field549[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field545[arg0][arg1] / this.field550[arg0][arg1];
            int var4 = this.field547[arg0][arg1] / this.field550[arg0][arg1];
            int var5 = this.field549[arg0][arg1] / this.field550[arg0][arg1];
            return class22.method193((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
