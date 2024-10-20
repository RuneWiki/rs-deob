package deob;

@ObfuscatedName("ep")
public class class138 extends class200 {

    @ObfuscatedName("ep.b")
    public int field1951;

    @ObfuscatedName("ep.s")
    public int field1952;

    @ObfuscatedName("ep.r")
    public int[] field1954;

    @ObfuscatedName("ep.g")
    public int[][] field1950;

    public class138(int arg0, byte[] arg1) {
        this.field1951 = arg0;
        class181 var3 = new class181(arg1);
        this.field1952 = var3.method2945();
        this.field1954 = new int[this.field1952];
        this.field1950 = new int[this.field1952][];
        for (int var4 = 0; var4 < this.field1952; var4++) {
            this.field1954[var4] = var3.method2945();
        }
        for (int var5 = 0; var5 < this.field1952; var5++) {
            this.field1950[var5] = new int[var3.method2945()];
        }
        for (int var6 = 0; var6 < this.field1952; var6++) {
            for (int var7 = 0; var7 < this.field1950[var6].length; var7++) {
                this.field1950[var6][var7] = var3.method2945();
            }
        }
    }
}
