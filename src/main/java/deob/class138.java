package deob;

@ObfuscatedName("ei")
public class class138 extends class204 {

    @ObfuscatedName("ei.n")
    public int field1955;

    @ObfuscatedName("ei.v")
    public int field1953;

    @ObfuscatedName("ei.y")
    public int[] field1954;

    @ObfuscatedName("ei.r")
    public int[][] field1957;

    public class138(int arg0, byte[] arg1) {
        this.field1955 = arg0;
        class185 var3 = new class185(arg1);
        this.field1953 = var3.method3021();
        this.field1954 = new int[this.field1953];
        this.field1957 = new int[this.field1953][];
        for (int var4 = 0; var4 < this.field1953; var4++) {
            this.field1954[var4] = var3.method3021();
        }
        for (int var5 = 0; var5 < this.field1953; var5++) {
            this.field1957[var5] = new int[var3.method3021()];
        }
        for (int var6 = 0; var6 < this.field1953; var6++) {
            for (int var7 = 0; var7 < this.field1957[var6].length; var7++) {
                this.field1957[var6][var7] = var3.method3021();
            }
        }
    }
}
