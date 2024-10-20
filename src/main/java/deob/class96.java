package deob;

@ObfuscatedName("cr")
public class class96 extends class189 {

    @ObfuscatedName("cr.l")
    public int field1647;

    @ObfuscatedName("cr.y")
    public int field1643;

    @ObfuscatedName("cr.g")
    public int[] field1644;

    @ObfuscatedName("cr.j")
    public int[][] field1645;

    public class96(int arg0, byte[] arg1) {
        this.field1647 = arg0;
        class108 var3 = new class108(arg1);
        this.field1643 = var3.method2291();
        this.field1644 = new int[this.field1643];
        this.field1645 = new int[this.field1643][];
        for (int var4 = 0; var4 < this.field1643; var4++) {
            this.field1644[var4] = var3.method2291();
        }
        for (int var5 = 0; var5 < this.field1643; var5++) {
            this.field1645[var5] = new int[var3.method2291()];
        }
        for (int var6 = 0; var6 < this.field1643; var6++) {
            for (int var7 = 0; var7 < this.field1645[var6].length; var7++) {
                this.field1645[var6][var7] = var3.method2291();
            }
        }
    }
}
