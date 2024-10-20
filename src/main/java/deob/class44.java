package deob;

@ObfuscatedName("ac")
public class class44 {

    @ObfuscatedName("ac.m")
    public int field542;

    @ObfuscatedName("ac.p")
    public int field541;

    @ObfuscatedName("ac.i")
    public int[][] field553;

    @ObfuscatedName("ac.j")
    public int[][] field543;

    @ObfuscatedName("ac.v")
    public int[][] field544;

    @ObfuscatedName("ac.x")
    public int[][] field554;

    public class44(int arg0, int arg1) {
        this.field542 = arg0;
        this.field541 = arg1;
        this.field553 = new int[arg0][arg1];
        this.field543 = new int[arg0][arg1];
        this.field544 = new int[arg0][arg1];
        this.field554 = new int[arg0][arg1];
    }

    @ObfuscatedName("ac.m(IIILiw;I)V")
    public void method584(int arg0, int arg1, int arg2, class254 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field542 || arg1 - arg2 > this.field541) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field542, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field541, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field553[var9][var10] += arg3.field3397 * 256 / arg3.field3399;
                this.field543[var9][var10] += arg3.field3398;
                this.field544[var9][var10] += arg3.field3395;
                int var10002 = this.field554[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ac.p(III)I")
    public int method579(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field542 || arg1 >= this.field541) {
            return 0;
        } else if (this.field544[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field553[arg0][arg1] / this.field554[arg0][arg1];
            int var4 = this.field543[arg0][arg1] / this.field554[arg0][arg1];
            int var5 = this.field544[arg0][arg1] / this.field554[arg0][arg1];
            double var6 = (double) var3 / 256.0D;
            double var8 = (double) var4 / 256.0D;
            double var10 = (double) var5 / 256.0D;
            double var12 = var10;
            double var14 = var10;
            double var16 = var10;
            if (var8 != 0.0D) {
                double var18;
                if (var10 < 0.5D) {
                    var18 = (var8 + 1.0D) * var10;
                } else {
                    var18 = var8 + var10 - var8 * var10;
                }
                double var20 = var10 * 2.0D - var18;
                double var22 = var6 + 0.3333333333333333D;
                if (var22 > 1.0D) {
                    var22--;
                }
                double var26 = var6 - 0.3333333333333333D;
                if (var26 < 0.0D) {
                    var26++;
                }
                if (var22 * 6.0D < 1.0D) {
                    var12 = (var18 - var20) * 6.0D * var22 + var20;
                } else if (var22 * 2.0D < 1.0D) {
                    var12 = var18;
                } else if (var22 * 3.0D < 2.0D) {
                    var12 = (var18 - var20) * (0.6666666666666666D - var22) * 6.0D + var20;
                } else {
                    var12 = var20;
                }
                if (var6 * 6.0D < 1.0D) {
                    var14 = (var18 - var20) * 6.0D * var6 + var20;
                } else if (var6 * 2.0D < 1.0D) {
                    var14 = var18;
                } else if (var6 * 3.0D < 2.0D) {
                    var14 = (var18 - var20) * (0.6666666666666666D - var6) * 6.0D + var20;
                } else {
                    var14 = var20;
                }
                if (var26 * 6.0D < 1.0D) {
                    var16 = (var18 - var20) * 6.0D * var26 + var20;
                } else if (var26 * 2.0D < 1.0D) {
                    var16 = var18;
                } else if (var26 * 3.0D < 2.0D) {
                    var16 = (var18 - var20) * (0.6666666666666666D - var26) * 6.0D + var20;
                } else {
                    var16 = var20;
                }
            }
            int var28 = (int) (var12 * 256.0D);
            int var29 = (int) (var14 * 256.0D);
            int var30 = (int) (var16 * 256.0D);
            return (var28 << 16) + (var29 << 8) + var30;
        }
    }
}
