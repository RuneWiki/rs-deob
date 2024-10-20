package deob;

@ObfuscatedName("ei")
public class class136 extends class213 {

    @ObfuscatedName("ei.b")
    public int field1928;

    @ObfuscatedName("ei.q")
    public int field1931;

    @ObfuscatedName("ei.o")
    public int[] field1927;

    @ObfuscatedName("ei.p")
    public int[][] field1930;

    public class136(int arg0, byte[] arg1) {
        this.field1928 = arg0;
        class194 var3 = new class194(arg1);
        this.field1931 = var3.method3247();
        this.field1927 = new int[this.field1931];
        this.field1930 = new int[this.field1931][];
        for (int var4 = 0; var4 < this.field1931; var4++) {
            this.field1927[var4] = var3.method3247();
        }
        for (int var5 = 0; var5 < this.field1931; var5++) {
            this.field1930[var5] = new int[var3.method3247()];
        }
        for (int var6 = 0; var6 < this.field1931; var6++) {
            for (int var7 = 0; var7 < this.field1930[var6].length; var7++) {
                this.field1930[var6][var7] = var3.method3247();
            }
        }
    }
}
