package deob;

@ObfuscatedName("ge")
public class class197 extends class352 {

    @ObfuscatedName("ge.v")
    public int field2291;

    @ObfuscatedName("ge.n")
    public int field2287;

    @ObfuscatedName("ge.f")
    public int[] field2289;

    @ObfuscatedName("ge.y")
    public int[][] field2290;

    public class197(int arg0, byte[] arg1) {
        this.field2291 = arg0;
        class383 var3 = new class383(arg1);
        this.field2287 = var3.method5965();
        this.field2289 = new int[this.field2287];
        this.field2290 = new int[this.field2287][];
        for (int var4 = 0; var4 < this.field2287; var4++) {
            this.field2289[var4] = var3.method5965();
        }
        for (int var5 = 0; var5 < this.field2287; var5++) {
            this.field2290[var5] = new int[var3.method5965()];
        }
        for (int var6 = 0; var6 < this.field2287; var6++) {
            for (int var7 = 0; var7 < this.field2290[var6].length; var7++) {
                this.field2290[var6][var7] = var3.method5965();
            }
        }
    }
}
