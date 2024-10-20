package deob;

@ObfuscatedName("hm")
public class class212 extends class369 {

    @ObfuscatedName("hm.n")
    public int field2360;

    @ObfuscatedName("hm.c")
    public int field2359;

    @ObfuscatedName("hm.m")
    public int[] field2358;

    @ObfuscatedName("hm.k")
    public int[][] field2361;

    public class212(int arg0, byte[] arg1) {
        this.field2360 = arg0;
        class400 var3 = new class400(arg1);
        this.field2359 = var3.method6217();
        this.field2358 = new int[this.field2359];
        this.field2361 = new int[this.field2359][];
        for (int var4 = 0; var4 < this.field2359; var4++) {
            this.field2358[var4] = var3.method6217();
        }
        for (int var5 = 0; var5 < this.field2359; var5++) {
            this.field2361[var5] = new int[var3.method6217()];
        }
        for (int var6 = 0; var6 < this.field2359; var6++) {
            for (int var7 = 0; var7 < this.field2361[var6].length; var7++) {
                this.field2361[var6][var7] = var3.method6217();
            }
        }
    }
}
