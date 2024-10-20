package deob;

@ObfuscatedName("eh")
public class class142 extends class190 {

    @ObfuscatedName("eh.z")
    public int field1831;

    @ObfuscatedName("eh.k")
    public int field1827;

    @ObfuscatedName("eh.s")
    public int[] field1826;

    @ObfuscatedName("eh.t")
    public int[][] field1832;

    public class142(int arg0, byte[] arg1) {
        this.field1831 = arg0;
        class310 var3 = new class310(arg1);
        this.field1827 = var3.method5193();
        this.field1826 = new int[this.field1827];
        this.field1832 = new int[this.field1827][];
        for (int var4 = 0; var4 < this.field1827; var4++) {
            this.field1826[var4] = var3.method5193();
        }
        for (int var5 = 0; var5 < this.field1827; var5++) {
            this.field1832[var5] = new int[var3.method5193()];
        }
        for (int var6 = 0; var6 < this.field1827; var6++) {
            for (int var7 = 0; var7 < this.field1832[var6].length; var7++) {
                this.field1832[var6][var7] = var3.method5193();
            }
        }
    }
}
