package deob;

@ObfuscatedName("gm")
public class class204 extends class412 {

    @ObfuscatedName("gm.w")
    public int field2405;

    @ObfuscatedName("gm.s")
    public int field2406;

    @ObfuscatedName("gm.q")
    public int[] field2402;

    @ObfuscatedName("gm.m")
    public int[][] field2408;

    @ObfuscatedName("gm.x")
    public class203 field2407;

    public class204(int arg0, byte[] arg1) {
        this.field2405 = arg0;
        class445 var3 = new class445(arg1);
        this.field2406 = var3.method7196();
        this.field2402 = new int[this.field2406];
        this.field2408 = new int[this.field2406][];
        for (int var4 = 0; var4 < this.field2406; var4++) {
            this.field2402[var4] = var3.method7196();
        }
        for (int var5 = 0; var5 < this.field2406; var5++) {
            this.field2408[var5] = new int[var3.method7196()];
        }
        for (int var6 = 0; var6 < this.field2406; var6++) {
            for (int var7 = 0; var7 < this.field2408[var6].length; var7++) {
                this.field2408[var6][var7] = var3.method7196();
            }
        }
        if (var3.field4735 < var3.field4733.length) {
            int var8 = var3.method7198();
            if (var8 > 0) {
                this.field2407 = new class203(var3, var8);
            }
        }
    }

    @ObfuscatedName("gm.c(B)I")
    public int method3876() {
        return this.field2406;
    }

    @ObfuscatedName("gm.p(I)Lge;")
    public class203 method3877() {
        return this.field2407;
    }
}
