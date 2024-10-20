package deob;

@ObfuscatedName("av")
public class class44 {

    @ObfuscatedName("av.e")
    public int field579;

    @ObfuscatedName("av.o")
    public int field575;

    @ObfuscatedName("av.m")
    public int[][] field576;

    @ObfuscatedName("av.g")
    public int[][] field574;

    @ObfuscatedName("av.d")
    public int[][] field578;

    @ObfuscatedName("av.b")
    public int[][] field577;

    public class44(int arg0, int arg1) {
        this.field579 = arg0;
        this.field575 = arg1;
        this.field576 = new int[arg0][arg1];
        this.field574 = new int[arg0][arg1];
        this.field578 = new int[arg0][arg1];
        this.field577 = new int[arg0][arg1];
    }

    @ObfuscatedName("av.e(IIILio;B)V")
    public void method538(int arg0, int arg1, int arg2, class247 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field579 || arg1 - arg2 > this.field575) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field579, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field575, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field576[var9][var10] += arg3.field3316 * 256 / arg3.field3322;
                this.field574[var9][var10] += arg3.field3320;
                this.field578[var9][var10] += arg3.field3321;
                int var10002 = this.field577[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("av.o(IIB)I")
    public int method544(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field579 || arg1 >= this.field575) {
            return 0;
        } else if (this.field578[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field576[arg0][arg1] / this.field577[arg0][arg1];
            int var4 = this.field574[arg0][arg1] / this.field577[arg0][arg1];
            int var5 = this.field578[arg0][arg1] / this.field577[arg0][arg1];
            return class22.method4377((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
