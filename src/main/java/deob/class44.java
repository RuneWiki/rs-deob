package deob;

@ObfuscatedName("am")
public class class44 {

    @ObfuscatedName("am.w")
    public int field592;

    @ObfuscatedName("am.s")
    public int field589;

    @ObfuscatedName("am.q")
    public int[][] field590;

    @ObfuscatedName("am.o")
    public int[][] field595;

    @ObfuscatedName("am.g")
    public int[][] field588;

    @ObfuscatedName("am.v")
    public int[][] field593;

    public class44(int arg0, int arg1) {
        this.field592 = arg0;
        this.field589 = arg1;
        this.field590 = new int[arg0][arg1];
        this.field595 = new int[arg0][arg1];
        this.field588 = new int[arg0][arg1];
        this.field593 = new int[arg0][arg1];
    }

    @ObfuscatedName("am.w(IIILix;I)V")
    public void method544(int arg0, int arg1, int arg2, class247 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field592 || arg1 - arg2 > this.field589) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field592, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field589, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field590[var9][var10] += arg3.field3336 * 256 / arg3.field3342;
                this.field595[var9][var10] += arg3.field3340;
                this.field588[var9][var10] += arg3.field3339;
                int var10002 = this.field593[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("am.s(IIS)I")
    public int method539(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field592 || arg1 >= this.field589) {
            return 0;
        } else if (this.field588[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field590[arg0][arg1] / this.field593[arg0][arg1];
            int var4 = this.field595[arg0][arg1] / this.field593[arg0][arg1];
            int var5 = this.field588[arg0][arg1] / this.field593[arg0][arg1];
            return class22.method232((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
