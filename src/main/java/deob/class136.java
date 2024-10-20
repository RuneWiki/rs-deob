package deob;

@ObfuscatedName("eo")
public class class136 extends class204 {

    @ObfuscatedName("eo.s")
    public int field1933;

    @ObfuscatedName("eo.g")
    public int field1929;

    @ObfuscatedName("eo.m")
    public int[] field1930;

    @ObfuscatedName("eo.h")
    public int[][] field1932;

    public class136(int arg0, byte[] arg1) {
        this.field1933 = arg0;
        class185 var3 = new class185(arg1);
        this.field1929 = var3.method3239();
        this.field1930 = new int[this.field1929];
        this.field1932 = new int[this.field1929][];
        for (int var4 = 0; var4 < this.field1929; var4++) {
            this.field1930[var4] = var3.method3239();
        }
        for (int var5 = 0; var5 < this.field1929; var5++) {
            this.field1932[var5] = new int[var3.method3239()];
        }
        for (int var6 = 0; var6 < this.field1929; var6++) {
            for (int var7 = 0; var7 < this.field1932[var6].length; var7++) {
                this.field1932[var6][var7] = var3.method3239();
            }
        }
    }
}
