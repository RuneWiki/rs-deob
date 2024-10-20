package deob;

@ObfuscatedName("cx")
public class class97 extends class199 {

    @ObfuscatedName("cx.o")
    public int field1675;

    @ObfuscatedName("cx.l")
    public int field1673;

    @ObfuscatedName("cx.g")
    public int[] field1674;

    @ObfuscatedName("cx.u")
    public int[][] field1682;

    public class97(int arg0, byte[] arg1) {
        this.field1675 = arg0;
        class111 var3 = new class111(arg1);
        this.field1673 = var3.method2219();
        this.field1674 = new int[this.field1673];
        this.field1682 = new int[this.field1673][];
        for (int var4 = 0; var4 < this.field1673; var4++) {
            this.field1674[var4] = var3.method2219();
        }
        for (int var5 = 0; var5 < this.field1673; var5++) {
            this.field1682[var5] = new int[var3.method2219()];
        }
        for (int var6 = 0; var6 < this.field1673; var6++) {
            for (int var7 = 0; var7 < this.field1682[var6].length; var7++) {
                this.field1682[var6][var7] = var3.method2219();
            }
        }
    }
}
