package deob;

@ObfuscatedName("ej")
public class class137 extends class217 {

    @ObfuscatedName("ej.d")
    public int field1959;

    @ObfuscatedName("ej.z")
    public int field1956;

    @ObfuscatedName("ej.n")
    public int[] field1955;

    @ObfuscatedName("ej.r")
    public int[][] field1957;

    public class137(int arg0, byte[] arg1) {
        this.field1959 = arg0;
        class195 var3 = new class195(arg1);
        this.field1956 = var3.method3330();
        this.field1955 = new int[this.field1956];
        this.field1957 = new int[this.field1956][];
        for (int var4 = 0; var4 < this.field1956; var4++) {
            this.field1955[var4] = var3.method3330();
        }
        for (int var5 = 0; var5 < this.field1956; var5++) {
            this.field1957[var5] = new int[var3.method3330()];
        }
        for (int var6 = 0; var6 < this.field1956; var6++) {
            for (int var7 = 0; var7 < this.field1957[var6].length; var7++) {
                this.field1957[var6][var7] = var3.method3330();
            }
        }
    }
}
