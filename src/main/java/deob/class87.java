package deob;

@ObfuscatedName("ct")
public class class87 extends class149 {

    @ObfuscatedName("ct.d")
    public int field1456;

    @ObfuscatedName("ct.c")
    public int field1462;

    @ObfuscatedName("ct.n")
    public int[] field1457;

    @ObfuscatedName("ct.q")
    public int[][] field1458;

    public class87(int arg0, byte[] arg1) {
        this.field1456 = arg0;
        class130 var3 = new class130(arg1);
        this.field1462 = var3.method2379();
        this.field1457 = new int[this.field1462];
        this.field1458 = new int[this.field1462][];
        for (int var4 = 0; var4 < this.field1462; var4++) {
            this.field1457[var4] = var3.method2379();
        }
        for (int var5 = 0; var5 < this.field1462; var5++) {
            this.field1458[var5] = new int[var3.method2379()];
        }
        for (int var6 = 0; var6 < this.field1462; var6++) {
            for (int var7 = 0; var7 < this.field1458[var6].length; var7++) {
                this.field1458[var6][var7] = var3.method2379();
            }
        }
    }
}
