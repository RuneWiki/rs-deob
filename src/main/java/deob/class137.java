package deob;

@ObfuscatedName("ed")
public class class137 extends class217 {

    @ObfuscatedName("ed.t")
    public int field1954;

    @ObfuscatedName("ed.q")
    public int field1949;

    @ObfuscatedName("ed.i")
    public int[] field1950;

    @ObfuscatedName("ed.a")
    public int[][] field1951;

    public class137(int arg0, byte[] arg1) {
        this.field1954 = arg0;
        class195 var3 = new class195(arg1);
        this.field1949 = var3.method3236();
        this.field1950 = new int[this.field1949];
        this.field1951 = new int[this.field1949][];
        for (int var4 = 0; var4 < this.field1949; var4++) {
            this.field1950[var4] = var3.method3236();
        }
        for (int var5 = 0; var5 < this.field1949; var5++) {
            this.field1951[var5] = new int[var3.method3236()];
        }
        for (int var6 = 0; var6 < this.field1949; var6++) {
            for (int var7 = 0; var7 < this.field1951[var6].length; var7++) {
                this.field1951[var6][var7] = var3.method3236();
            }
        }
    }
}
