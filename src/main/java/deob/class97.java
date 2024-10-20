package deob;

@ObfuscatedName("cl")
public class class97 extends class198 {

    @ObfuscatedName("cl.e")
    public int field1642;

    @ObfuscatedName("cl.a")
    public int field1645;

    @ObfuscatedName("cl.l")
    public int[] field1643;

    @ObfuscatedName("cl.c")
    public int[][] field1644;

    public class97(int arg0, byte[] arg1) {
        this.field1642 = arg0;
        class111 var3 = new class111(arg1);
        this.field1645 = var3.method2176();
        this.field1643 = new int[this.field1645];
        this.field1644 = new int[this.field1645][];
        for (int var4 = 0; var4 < this.field1645; var4++) {
            this.field1643[var4] = var3.method2176();
        }
        for (int var5 = 0; var5 < this.field1645; var5++) {
            this.field1644[var5] = new int[var3.method2176()];
        }
        for (int var6 = 0; var6 < this.field1645; var6++) {
            for (int var7 = 0; var7 < this.field1644[var6].length; var7++) {
                this.field1644[var6][var7] = var3.method2176();
            }
        }
    }
}
