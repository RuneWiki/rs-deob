package deob;

@ObfuscatedName("eo")
public class class137 extends class217 {

    @ObfuscatedName("eo.o")
    public int field1977;

    @ObfuscatedName("eo.k")
    public int field1978;

    @ObfuscatedName("eo.t")
    public int[] field1975;

    @ObfuscatedName("eo.d")
    public int[][] field1976;

    public class137(int arg0, byte[] arg1) {
        this.field1977 = arg0;
        class195 var3 = new class195(arg1);
        this.field1978 = var3.method3205();
        this.field1975 = new int[this.field1978];
        this.field1976 = new int[this.field1978][];
        for (int var4 = 0; var4 < this.field1978; var4++) {
            this.field1975[var4] = var3.method3205();
        }
        for (int var5 = 0; var5 < this.field1978; var5++) {
            this.field1976[var5] = new int[var3.method3205()];
        }
        for (int var6 = 0; var6 < this.field1978; var6++) {
            for (int var7 = 0; var7 < this.field1976[var6].length; var7++) {
                this.field1976[var6][var7] = var3.method3205();
            }
        }
    }
}
