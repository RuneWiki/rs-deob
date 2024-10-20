package deob;

@ObfuscatedName("af")
public class class33 {

    @ObfuscatedName("af.v")
    public int field293;

    @ObfuscatedName("af.s")
    public int field289;

    @ObfuscatedName("af.o")
    public int[][] field291;

    @ObfuscatedName("af.k")
    public int[][] field288;

    @ObfuscatedName("af.u")
    public int[][] field292;

    @ObfuscatedName("af.i")
    public int[][] field298;

    public class33(int arg0, int arg1) {
        this.field293 = arg0;
        this.field289 = arg1;
        this.field291 = new int[arg0][arg1];
        this.field288 = new int[arg0][arg1];
        this.field292 = new int[arg0][arg1];
        this.field298 = new int[arg0][arg1];
    }

    @ObfuscatedName("af.v(IIILjc;B)V")
    public void method530(int arg0, int arg1, int arg2, class262 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field293 || arg1 - arg2 > this.field289) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field293, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field289, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field291[var9][var10] += arg3.field3315 * 256 / arg3.field3318;
                this.field288[var9][var10] += arg3.field3313;
                this.field292[var9][var10] += arg3.field3314;
                int var10002 = this.field298[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("af.s(IIB)I")
    public int method531(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field293 || arg1 >= this.field289) {
            return 0;
        } else if (this.field292[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field291[arg0][arg1] / this.field298[arg0][arg1];
            int var4 = this.field288[arg0][arg1] / this.field298[arg0][arg1];
            int var5 = this.field292[arg0][arg1] / this.field298[arg0][arg1];
            return class10.method2908((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
