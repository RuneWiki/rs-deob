package deob;

@ObfuscatedName("cj")
public class class97 extends class198 {

    @ObfuscatedName("cj.q")
    public int field1651;

    @ObfuscatedName("cj.s")
    public int field1649;

    @ObfuscatedName("cj.h")
    public int[] field1652;

    @ObfuscatedName("cj.e")
    public int[][] field1650;

    public class97(int arg0, byte[] arg1) {
        this.field1651 = arg0;
        class111 var3 = new class111(arg1);
        this.field1649 = var3.method2231();
        this.field1652 = new int[this.field1649];
        this.field1650 = new int[this.field1649][];
        for (int var4 = 0; var4 < this.field1649; var4++) {
            this.field1652[var4] = var3.method2231();
        }
        for (int var5 = 0; var5 < this.field1649; var5++) {
            this.field1650[var5] = new int[var3.method2231()];
        }
        for (int var6 = 0; var6 < this.field1649; var6++) {
            for (int var7 = 0; var7 < this.field1650[var6].length; var7++) {
                this.field1650[var6][var7] = var3.method2231();
            }
        }
    }
}
