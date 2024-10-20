package deob;

@ObfuscatedName("ej")
public class class142 extends class190 {

    @ObfuscatedName("ej.h")
    public int field1818;

    @ObfuscatedName("ej.v")
    public int field1821;

    @ObfuscatedName("ej.x")
    public int[] field1819;

    @ObfuscatedName("ej.w")
    public int[][] field1820;

    public class142(int arg0, byte[] arg1) {
        this.field1818 = arg0;
        class311 var3 = new class311(arg1);
        this.field1821 = var3.method5274();
        this.field1819 = new int[this.field1821];
        this.field1820 = new int[this.field1821][];
        for (int var4 = 0; var4 < this.field1821; var4++) {
            this.field1819[var4] = var3.method5274();
        }
        for (int var5 = 0; var5 < this.field1821; var5++) {
            this.field1820[var5] = new int[var3.method5274()];
        }
        for (int var6 = 0; var6 < this.field1821; var6++) {
            for (int var7 = 0; var7 < this.field1820[var6].length; var7++) {
                this.field1820[var6][var7] = var3.method5274();
            }
        }
    }
}
