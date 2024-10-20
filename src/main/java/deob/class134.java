package deob;

@ObfuscatedName("ez")
public class class134 extends class106 {

    @ObfuscatedName("ez.m")
    public int field1724;

    @ObfuscatedName("ez.c")
    public int field1722;

    @ObfuscatedName("ez.n")
    public int[] field1723;

    @ObfuscatedName("ez.j")
    public int[][] field1721;

    public class134(int arg0, byte[] arg1) {
        this.field1724 = arg0;
        class135 var3 = new class135(arg1);
        this.field1722 = var3.method1600();
        this.field1723 = new int[this.field1722];
        this.field1721 = new int[this.field1722][];
        for (int var4 = 0; var4 < this.field1722; var4++) {
            this.field1723[var4] = var3.method1600();
        }
        for (int var5 = 0; var5 < this.field1722; var5++) {
            this.field1721[var5] = new int[var3.method1600()];
        }
        for (int var6 = 0; var6 < this.field1722; var6++) {
            for (int var7 = 0; var7 < this.field1721[var6].length; var7++) {
                this.field1721[var6][var7] = var3.method1600();
            }
        }
    }
}
