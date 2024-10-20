package deob;

@ObfuscatedName("ev")
public class class142 extends class190 {

    @ObfuscatedName("ev.n")
    public int field1814;

    @ObfuscatedName("ev.v")
    public int field1809;

    @ObfuscatedName("ev.d")
    public int[] field1811;

    @ObfuscatedName("ev.c")
    public int[][] field1812;

    public class142(int arg0, byte[] arg1) {
        this.field1814 = arg0;
        class311 var3 = new class311(arg1);
        this.field1809 = var3.method5310();
        this.field1811 = new int[this.field1809];
        this.field1812 = new int[this.field1809][];
        for (int var4 = 0; var4 < this.field1809; var4++) {
            this.field1811[var4] = var3.method5310();
        }
        for (int var5 = 0; var5 < this.field1809; var5++) {
            this.field1812[var5] = new int[var3.method5310()];
        }
        for (int var6 = 0; var6 < this.field1809; var6++) {
            for (int var7 = 0; var7 < this.field1812[var6].length; var7++) {
                this.field1812[var6][var7] = var3.method5310();
            }
        }
    }
}
