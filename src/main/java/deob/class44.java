package deob;

@ObfuscatedName("az")
public class class44 {

    @ObfuscatedName("az.a")
    public int field533;

    @ObfuscatedName("az.w")
    public int field541;

    @ObfuscatedName("az.e")
    public int[][] field535;

    @ObfuscatedName("az.k")
    public int[][] field536;

    @ObfuscatedName("az.u")
    public int[][] field537;

    @ObfuscatedName("az.z")
    public int[][] field538;

    public class44(int arg0, int arg1) {
        this.field533 = arg0;
        this.field541 = arg1;
        this.field535 = new int[arg0][arg1];
        this.field536 = new int[arg0][arg1];
        this.field537 = new int[arg0][arg1];
        this.field538 = new int[arg0][arg1];
    }

    @ObfuscatedName("az.a(IIILih;I)V")
    public void method532(int arg0, int arg1, int arg2, class258 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field533 || arg1 - arg2 > this.field541) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field533, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field541, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field535[var9][var10] += arg3.field3427 * 256 / arg3.field3426;
                this.field536[var9][var10] += arg3.field3428;
                this.field537[var9][var10] += arg3.field3429;
                int var10002 = this.field538[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("az.w(III)I")
    public int method534(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field533 || arg1 >= this.field541) {
            return 0;
        } else if (this.field537[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field535[arg0][arg1] / this.field538[arg0][arg1];
            int var4 = this.field536[arg0][arg1] / this.field538[arg0][arg1];
            int var5 = this.field537[arg0][arg1] / this.field538[arg0][arg1];
            return class22.method1690((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
