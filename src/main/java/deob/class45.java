package deob;

@ObfuscatedName("ad")
public class class45 {

    @ObfuscatedName("ad.c")
    public int field541;

    @ObfuscatedName("ad.i")
    public int field542;

    @ObfuscatedName("ad.o")
    public int[][] field543;

    @ObfuscatedName("ad.j")
    public int[][] field544;

    @ObfuscatedName("ad.k")
    public int[][] field545;

    @ObfuscatedName("ad.x")
    public int[][] field548;

    public class45(int arg0, int arg1) {
        this.field541 = arg0;
        this.field542 = arg1;
        this.field543 = new int[arg0][arg1];
        this.field544 = new int[arg0][arg1];
        this.field545 = new int[arg0][arg1];
        this.field548 = new int[arg0][arg1];
    }

    @ObfuscatedName("ad.c(IIILjx;I)V")
    public void method568(int arg0, int arg1, int arg2, class274 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field541 || arg1 - arg2 > this.field542) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field541, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field542, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field543[var9][var10] += arg3.field3500 * 256 / arg3.field3505;
                this.field544[var9][var10] += arg3.field3502;
                this.field545[var9][var10] += arg3.field3504;
                int var10002 = this.field548[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ad.i(IIB)I")
    public int method577(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field541 || arg1 >= this.field542) {
            return 0;
        } else if (this.field545[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field543[arg0][arg1] / this.field548[arg0][arg1];
            int var4 = this.field544[arg0][arg1] / this.field548[arg0][arg1];
            int var5 = this.field545[arg0][arg1] / this.field548[arg0][arg1];
            return class22.method4398((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
