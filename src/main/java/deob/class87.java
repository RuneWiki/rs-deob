package deob;

@ObfuscatedName("co")
public class class87 extends class128 {

    @ObfuscatedName("co.o")
    public int field1460;

    @ObfuscatedName("co.m")
    public int field1458;

    @ObfuscatedName("co.b")
    public int[] field1457;

    @ObfuscatedName("co.g")
    public int[][] field1461;

    public class87(int arg0, byte[] arg1) {
        this.field1460 = arg0;
        class154 var3 = new class154(arg1);
        this.field1458 = var3.method2552();
        this.field1457 = new int[this.field1458];
        this.field1461 = new int[this.field1458][];
        for (int var4 = 0; var4 < this.field1458; var4++) {
            this.field1457[var4] = var3.method2552();
        }
        for (int var5 = 0; var5 < this.field1458; var5++) {
            this.field1461[var5] = new int[var3.method2552()];
        }
        for (int var6 = 0; var6 < this.field1458; var6++) {
            for (int var7 = 0; var7 < this.field1461[var6].length; var7++) {
                this.field1461[var6][var7] = var3.method2552();
            }
        }
    }
}
