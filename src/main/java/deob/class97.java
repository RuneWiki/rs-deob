package deob;

@ObfuscatedName("cx")
public class class97 extends class199 {

    @ObfuscatedName("cx.y")
    public int field1691;

    @ObfuscatedName("cx.k")
    public int field1692;

    @ObfuscatedName("cx.g")
    public int[] field1693;

    @ObfuscatedName("cx.n")
    public int[][] field1699;

    public class97(int arg0, byte[] arg1) {
        this.field1691 = arg0;
        class111 var3 = new class111(arg1);
        this.field1692 = var3.method2205();
        this.field1693 = new int[this.field1692];
        this.field1699 = new int[this.field1692][];
        for (int var4 = 0; var4 < this.field1692; var4++) {
            this.field1693[var4] = var3.method2205();
        }
        for (int var5 = 0; var5 < this.field1692; var5++) {
            this.field1699[var5] = new int[var3.method2205()];
        }
        for (int var6 = 0; var6 < this.field1692; var6++) {
            for (int var7 = 0; var7 < this.field1699[var6].length; var7++) {
                this.field1699[var6][var7] = var3.method2205();
            }
        }
    }
}
