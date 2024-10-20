package deob;

@ObfuscatedName("cr")
public class class97 extends class199 {

    @ObfuscatedName("cr.n")
    public int field1694;

    @ObfuscatedName("cr.w")
    public int field1695;

    @ObfuscatedName("cr.i")
    public int[] field1696;

    @ObfuscatedName("cr.e")
    public int[][] field1693;

    public class97(int arg0, byte[] arg1) {
        this.field1694 = arg0;
        class111 var3 = new class111(arg1);
        this.field1695 = var3.method2155();
        this.field1696 = new int[this.field1695];
        this.field1693 = new int[this.field1695][];
        for (int var4 = 0; var4 < this.field1695; var4++) {
            this.field1696[var4] = var3.method2155();
        }
        for (int var5 = 0; var5 < this.field1695; var5++) {
            this.field1693[var5] = new int[var3.method2155()];
        }
        for (int var6 = 0; var6 < this.field1695; var6++) {
            for (int var7 = 0; var7 < this.field1693[var6].length; var7++) {
                this.field1693[var6][var7] = var3.method2155();
            }
        }
    }
}
