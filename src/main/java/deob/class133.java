package deob;

@ObfuscatedName("ew")
public class class133 extends class181 {

    @ObfuscatedName("ew.z")
    public int field1766;

    @ObfuscatedName("ew.n")
    public int field1765;

    @ObfuscatedName("ew.v")
    public int[] field1764;

    @ObfuscatedName("ew.u")
    public int[][] field1767;

    public class133(int arg0, byte[] arg1) {
        this.field1766 = arg0;
        class300 var3 = new class300(arg1);
        this.field1765 = var3.method4990();
        this.field1764 = new int[this.field1765];
        this.field1767 = new int[this.field1765][];
        for (int var4 = 0; var4 < this.field1765; var4++) {
            this.field1764[var4] = var3.method4990();
        }
        for (int var5 = 0; var5 < this.field1765; var5++) {
            this.field1767[var5] = new int[var3.method4990()];
        }
        for (int var6 = 0; var6 < this.field1765; var6++) {
            for (int var7 = 0; var7 < this.field1767[var6].length; var7++) {
                this.field1767[var6][var7] = var3.method4990();
            }
        }
    }
}
