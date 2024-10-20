package deob;

@ObfuscatedName("ec")
public class class133 extends class181 {

    @ObfuscatedName("ec.c")
    public int field1795;

    @ObfuscatedName("ec.t")
    public int field1791;

    @ObfuscatedName("ec.o")
    public int[] field1793;

    @ObfuscatedName("ec.e")
    public int[][] field1790;

    public class133(int arg0, byte[] arg1) {
        this.field1795 = arg0;
        class301 var3 = new class301(arg1);
        this.field1791 = var3.method5129();
        this.field1793 = new int[this.field1791];
        this.field1790 = new int[this.field1791][];
        for (int var4 = 0; var4 < this.field1791; var4++) {
            this.field1793[var4] = var3.method5129();
        }
        for (int var5 = 0; var5 < this.field1791; var5++) {
            this.field1790[var5] = new int[var3.method5129()];
        }
        for (int var6 = 0; var6 < this.field1791; var6++) {
            for (int var7 = 0; var7 < this.field1790[var6].length; var7++) {
                this.field1790[var6][var7] = var3.method5129();
            }
        }
    }
}
