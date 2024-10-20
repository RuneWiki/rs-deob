package deob;

@ObfuscatedName("ch")
public class class97 extends class199 {

    @ObfuscatedName("ch.b")
    public int field1701;

    @ObfuscatedName("ch.e")
    public int field1699;

    @ObfuscatedName("ch.a")
    public int[] field1700;

    @ObfuscatedName("ch.k")
    public int[][] field1703;

    public class97(int arg0, byte[] arg1) {
        this.field1701 = arg0;
        class111 var3 = new class111(arg1);
        this.field1699 = var3.method2127();
        this.field1700 = new int[this.field1699];
        this.field1703 = new int[this.field1699][];
        for (int var4 = 0; var4 < this.field1699; var4++) {
            this.field1700[var4] = var3.method2127();
        }
        for (int var5 = 0; var5 < this.field1699; var5++) {
            this.field1703[var5] = new int[var3.method2127()];
        }
        for (int var6 = 0; var6 < this.field1699; var6++) {
            for (int var7 = 0; var7 < this.field1703[var6].length; var7++) {
                this.field1703[var6][var7] = var3.method2127();
            }
        }
    }
}
