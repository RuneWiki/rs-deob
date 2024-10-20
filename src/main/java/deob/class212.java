package deob;

@ObfuscatedName("hg")
public class class212 extends class370 {

    @ObfuscatedName("hg.l")
    public int field2373;

    @ObfuscatedName("hg.q")
    public int field2374;

    @ObfuscatedName("hg.f")
    public int[] field2375;

    @ObfuscatedName("hg.j")
    public int[][] field2379;

    public class212(int arg0, byte[] arg1) {
        this.field2373 = arg0;
        class401 var3 = new class401(arg1);
        this.field2374 = var3.method6272();
        this.field2375 = new int[this.field2374];
        this.field2379 = new int[this.field2374][];
        for (int var4 = 0; var4 < this.field2374; var4++) {
            this.field2375[var4] = var3.method6272();
        }
        for (int var5 = 0; var5 < this.field2374; var5++) {
            this.field2379[var5] = new int[var3.method6272()];
        }
        for (int var6 = 0; var6 < this.field2374; var6++) {
            for (int var7 = 0; var7 < this.field2379[var6].length; var7++) {
                this.field2379[var6][var7] = var3.method6272();
            }
        }
    }
}
