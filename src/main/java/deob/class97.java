package deob;

@ObfuscatedName("cc")
public class class97 extends class199 {

    @ObfuscatedName("cc.n")
    public int field1709;

    @ObfuscatedName("cc.g")
    public int field1707;

    @ObfuscatedName("cc.a")
    public int[] field1708;

    @ObfuscatedName("cc.m")
    public int[][] field1711;

    public class97(int arg0, byte[] arg1) {
        this.field1709 = arg0;
        class111 var3 = new class111(arg1);
        this.field1707 = var3.method2211();
        this.field1708 = new int[this.field1707];
        this.field1711 = new int[this.field1707][];
        for (int var4 = 0; var4 < this.field1707; var4++) {
            this.field1708[var4] = var3.method2211();
        }
        for (int var5 = 0; var5 < this.field1707; var5++) {
            this.field1711[var5] = new int[var3.method2211()];
        }
        for (int var6 = 0; var6 < this.field1707; var6++) {
            for (int var7 = 0; var7 < this.field1711[var6].length; var7++) {
                this.field1711[var6][var7] = var3.method2211();
            }
        }
    }
}
