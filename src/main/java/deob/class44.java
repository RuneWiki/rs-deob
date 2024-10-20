package deob;

@ObfuscatedName("ay")
public class class44 {

    @ObfuscatedName("ay.d")
    public int field540;

    @ObfuscatedName("ay.x")
    public int field541;

    @ObfuscatedName("ay.k")
    public int[][] field542;

    @ObfuscatedName("ay.z")
    public int[][] field543;

    @ObfuscatedName("ay.v")
    public int[][] field544;

    @ObfuscatedName("ay.m")
    public int[][] field545;

    public class44(int arg0, int arg1) {
        this.field540 = arg0;
        this.field541 = arg1;
        this.field542 = new int[arg0][arg1];
        this.field543 = new int[arg0][arg1];
        this.field544 = new int[arg0][arg1];
        this.field545 = new int[arg0][arg1];
    }

    @ObfuscatedName("ay.d(IIILiw;B)V")
    public void method549(int arg0, int arg1, int arg2, class254 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field540 || arg1 - arg2 > this.field541) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field540, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field541, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field542[var9][var10] += arg3.field3412 * 256 / arg3.field3415;
                this.field543[var9][var10] += arg3.field3413;
                this.field544[var9][var10] += arg3.field3414;
                int var10002 = this.field545[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ay.x(III)I")
    public int method550(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field540 || arg1 >= this.field541) {
            return 0;
        } else if (this.field544[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field542[arg0][arg1] / this.field545[arg0][arg1];
            int var4 = this.field543[arg0][arg1] / this.field545[arg0][arg1];
            int var5 = this.field544[arg0][arg1] / this.field545[arg0][arg1];
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
