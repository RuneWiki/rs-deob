package deob;

@ObfuscatedName("gj")
public class class199 extends class354 {

    @ObfuscatedName("gj.s")
    public int field2278;

    @ObfuscatedName("gj.t")
    public int field2275;

    @ObfuscatedName("gj.v")
    public int[] field2274;

    @ObfuscatedName("gj.j")
    public int[][] field2276;

    public class199(int arg0, byte[] arg1) {
        this.field2278 = arg0;
        class385 var3 = new class385(arg1);
        this.field2275 = var3.method5958();
        this.field2274 = new int[this.field2275];
        this.field2276 = new int[this.field2275][];
        for (int var4 = 0; var4 < this.field2275; var4++) {
            this.field2274[var4] = var3.method5958();
        }
        for (int var5 = 0; var5 < this.field2275; var5++) {
            this.field2276[var5] = new int[var3.method5958()];
        }
        for (int var6 = 0; var6 < this.field2275; var6++) {
            for (int var7 = 0; var7 < this.field2276[var6].length; var7++) {
                this.field2276[var6][var7] = var3.method5958();
            }
        }
    }
}
