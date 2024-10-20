package deob;

@ObfuscatedName("ev")
public class class137 extends class217 {

    @ObfuscatedName("ev.c")
    public int field1970;

    @ObfuscatedName("ev.i")
    public int field1973;

    @ObfuscatedName("ev.o")
    public int[] field1976;

    @ObfuscatedName("ev.j")
    public int[][] field1972;

    public class137(int arg0, byte[] arg1) {
        this.field1970 = arg0;
        class195 var3 = new class195(arg1);
        this.field1973 = var3.method3429();
        this.field1976 = new int[this.field1973];
        this.field1972 = new int[this.field1973][];
        for (int var4 = 0; var4 < this.field1973; var4++) {
            this.field1976[var4] = var3.method3429();
        }
        for (int var5 = 0; var5 < this.field1973; var5++) {
            this.field1972[var5] = new int[var3.method3429()];
        }
        for (int var6 = 0; var6 < this.field1973; var6++) {
            for (int var7 = 0; var7 < this.field1972[var6].length; var7++) {
                this.field1972[var6][var7] = var3.method3429();
            }
        }
    }
}
