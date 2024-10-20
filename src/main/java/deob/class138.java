package deob;

@ObfuscatedName("eg")
public class class138 extends class204 {

    @ObfuscatedName("eg.a")
    public int field1945;

    @ObfuscatedName("eg.w")
    public int field1939;

    @ObfuscatedName("eg.e")
    public int[] field1941;

    @ObfuscatedName("eg.k")
    public int[][] field1942;

    public class138(int arg0, byte[] arg1) {
        this.field1945 = arg0;
        class185 var3 = new class185(arg1);
        this.field1939 = var3.method2962();
        this.field1941 = new int[this.field1939];
        this.field1942 = new int[this.field1939][];
        for (int var4 = 0; var4 < this.field1939; var4++) {
            this.field1941[var4] = var3.method2962();
        }
        for (int var5 = 0; var5 < this.field1939; var5++) {
            this.field1942[var5] = new int[var3.method2962()];
        }
        for (int var6 = 0; var6 < this.field1939; var6++) {
            for (int var7 = 0; var7 < this.field1942[var6].length; var7++) {
                this.field1942[var6][var7] = var3.method2962();
            }
        }
    }
}
