package deob;

@ObfuscatedName("er")
public class class138 extends class200 {

    @ObfuscatedName("er.d")
    public int field1954;

    @ObfuscatedName("er.x")
    public int field1953;

    @ObfuscatedName("er.k")
    public int[] field1957;

    @ObfuscatedName("er.z")
    public int[][] field1955;

    public class138(int arg0, byte[] arg1) {
        this.field1954 = arg0;
        class181 var3 = new class181(arg1);
        this.field1953 = var3.method3204();
        this.field1957 = new int[this.field1953];
        this.field1955 = new int[this.field1953][];
        for (int var4 = 0; var4 < this.field1953; var4++) {
            this.field1957[var4] = var3.method3204();
        }
        for (int var5 = 0; var5 < this.field1953; var5++) {
            this.field1955[var5] = new int[var3.method3204()];
        }
        for (int var6 = 0; var6 < this.field1953; var6++) {
            for (int var7 = 0; var7 < this.field1955[var6].length; var7++) {
                this.field1955[var6][var7] = var3.method3204();
            }
        }
    }
}
