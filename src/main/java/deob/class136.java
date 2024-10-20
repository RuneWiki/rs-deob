package deob;

@ObfuscatedName("ey")
public class class136 extends class204 {

    @ObfuscatedName("ey.p")
    public int field1926;

    @ObfuscatedName("ey.i")
    public int field1924;

    @ObfuscatedName("ey.w")
    public int[] field1929;

    @ObfuscatedName("ey.s")
    public int[][] field1927;

    public class136(int arg0, byte[] arg1) {
        this.field1926 = arg0;
        class185 var3 = new class185(arg1);
        this.field1924 = var3.method3197();
        this.field1929 = new int[this.field1924];
        this.field1927 = new int[this.field1924][];
        for (int var4 = 0; var4 < this.field1924; var4++) {
            this.field1929[var4] = var3.method3197();
        }
        for (int var5 = 0; var5 < this.field1924; var5++) {
            this.field1927[var5] = new int[var3.method3197()];
        }
        for (int var6 = 0; var6 < this.field1924; var6++) {
            for (int var7 = 0; var7 < this.field1927[var6].length; var7++) {
                this.field1927[var6][var7] = var3.method3197();
            }
        }
    }
}
