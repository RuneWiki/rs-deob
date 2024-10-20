package deob;

@ObfuscatedName("cd")
public class class87 extends class128 {

    @ObfuscatedName("cd.p")
    public int field1466;

    @ObfuscatedName("cd.g")
    public int field1465;

    @ObfuscatedName("cd.x")
    public int[] field1470;

    @ObfuscatedName("cd.q")
    public int[][] field1467;

    public class87(int arg0, byte[] arg1) {
        this.field1466 = arg0;
        class154 var3 = new class154(arg1);
        this.field1465 = var3.method2593();
        this.field1470 = new int[this.field1465];
        this.field1467 = new int[this.field1465][];
        for (int var4 = 0; var4 < this.field1465; var4++) {
            this.field1470[var4] = var3.method2593();
        }
        for (int var5 = 0; var5 < this.field1465; var5++) {
            this.field1467[var5] = new int[var3.method2593()];
        }
        for (int var6 = 0; var6 < this.field1465; var6++) {
            for (int var7 = 0; var7 < this.field1467[var6].length; var7++) {
                this.field1467[var6][var7] = var3.method2593();
            }
        }
    }
}
