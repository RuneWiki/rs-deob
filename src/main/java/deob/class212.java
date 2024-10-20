package deob;

@ObfuscatedName("ha")
public class class212 extends class370 {

    @ObfuscatedName("ha.i")
    public int field2372;

    @ObfuscatedName("ha.w")
    public int field2374;

    @ObfuscatedName("ha.s")
    public int[] field2371;

    @ObfuscatedName("ha.a")
    public int[][] field2373;

    public class212(int arg0, byte[] arg1) {
        this.field2372 = arg0;
        class401 var3 = new class401(arg1);
        this.field2374 = var3.method6240();
        this.field2371 = new int[this.field2374];
        this.field2373 = new int[this.field2374][];
        for (int var4 = 0; var4 < this.field2374; var4++) {
            this.field2371[var4] = var3.method6240();
        }
        for (int var5 = 0; var5 < this.field2374; var5++) {
            this.field2373[var5] = new int[var3.method6240()];
        }
        for (int var6 = 0; var6 < this.field2374; var6++) {
            for (int var7 = 0; var7 < this.field2373[var6].length; var7++) {
                this.field2373[var6][var7] = var3.method6240();
            }
        }
    }
}
