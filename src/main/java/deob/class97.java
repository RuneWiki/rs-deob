package deob;

@ObfuscatedName("co")
public class class97 extends class199 {

    @ObfuscatedName("co.n")
    public int field1690;

    @ObfuscatedName("co.o")
    public int field1694;

    @ObfuscatedName("co.a")
    public int[] field1692;

    @ObfuscatedName("co.w")
    public int[][] field1693;

    public class97(int arg0, byte[] arg1) {
        this.field1690 = arg0;
        class111 var3 = new class111(arg1);
        this.field1694 = var3.method2234();
        this.field1692 = new int[this.field1694];
        this.field1693 = new int[this.field1694][];
        for (int var4 = 0; var4 < this.field1694; var4++) {
            this.field1692[var4] = var3.method2234();
        }
        for (int var5 = 0; var5 < this.field1694; var5++) {
            this.field1693[var5] = new int[var3.method2234()];
        }
        for (int var6 = 0; var6 < this.field1694; var6++) {
            for (int var7 = 0; var7 < this.field1693[var6].length; var7++) {
                this.field1693[var6][var7] = var3.method2234();
            }
        }
    }
}
