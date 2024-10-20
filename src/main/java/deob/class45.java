package deob;

@ObfuscatedName("ar")
public class class45 {

    @ObfuscatedName("ar.o")
    public int field564;

    @ObfuscatedName("ar.k")
    public int field568;

    @ObfuscatedName("ar.t")
    public int[][] field565;

    @ObfuscatedName("ar.d")
    public int[][] field563;

    @ObfuscatedName("ar.h")
    public int[][] field567;

    @ObfuscatedName("ar.m")
    public int[][] field566;

    public class45(int arg0, int arg1) {
        this.field564 = arg0;
        this.field568 = arg1;
        this.field565 = new int[arg0][arg1];
        this.field563 = new int[arg0][arg1];
        this.field567 = new int[arg0][arg1];
        this.field566 = new int[arg0][arg1];
    }

    @ObfuscatedName("ar.o(IIILje;B)V")
    public void method568(int arg0, int arg1, int arg2, class274 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field564 || arg1 - arg2 > this.field568) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field564, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field568, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field565[var9][var10] += arg3.field3502 * 256 / arg3.field3508;
                this.field563[var9][var10] += arg3.field3506;
                this.field567[var9][var10] += arg3.field3507;
                int var10002 = this.field566[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("ar.k(III)I")
    public int method567(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field564 || arg1 >= this.field568) {
            return 0;
        } else if (this.field567[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field565[arg0][arg1] / this.field566[arg0][arg1];
            int var4 = this.field563[arg0][arg1] / this.field566[arg0][arg1];
            int var5 = this.field567[arg0][arg1] / this.field566[arg0][arg1];
            return class22.method236((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
