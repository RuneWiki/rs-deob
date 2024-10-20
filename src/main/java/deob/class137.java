package deob;

@ObfuscatedName("ef")
public class class137 extends class217 {

    @ObfuscatedName("ef.g")
    public int field1952;

    @ObfuscatedName("ef.e")
    public int field1956;

    @ObfuscatedName("ef.b")
    public int[] field1953;

    @ObfuscatedName("ef.z")
    public int[][] field1954;

    public class137(int arg0, byte[] arg1) {
        this.field1952 = arg0;
        class195 var3 = new class195(arg1);
        this.field1956 = var3.method3332();
        this.field1953 = new int[this.field1956];
        this.field1954 = new int[this.field1956][];
        for (int var4 = 0; var4 < this.field1956; var4++) {
            this.field1953[var4] = var3.method3332();
        }
        for (int var5 = 0; var5 < this.field1956; var5++) {
            this.field1954[var5] = new int[var3.method3332()];
        }
        for (int var6 = 0; var6 < this.field1956; var6++) {
            for (int var7 = 0; var7 < this.field1954[var6].length; var7++) {
                this.field1954[var6][var7] = var3.method3332();
            }
        }
    }
}
