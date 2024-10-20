package deob;

@ObfuscatedName("ct")
public class class95 extends class186 {

    @ObfuscatedName("ct.t")
    public int field1654;

    @ObfuscatedName("ct.s")
    public int field1647;

    @ObfuscatedName("ct.f")
    public int[] field1648;

    @ObfuscatedName("ct.e")
    public int[][] field1650;

    public class95(int arg0, byte[] arg1) {
        this.field1654 = arg0;
        class107 var3 = new class107(arg1);
        this.field1647 = var3.method2101();
        this.field1648 = new int[this.field1647];
        this.field1650 = new int[this.field1647][];
        for (int var4 = 0; var4 < this.field1647; var4++) {
            this.field1648[var4] = var3.method2101();
        }
        for (int var5 = 0; var5 < this.field1647; var5++) {
            this.field1650[var5] = new int[var3.method2101()];
        }
        for (int var6 = 0; var6 < this.field1647; var6++) {
            for (int var7 = 0; var7 < this.field1650[var6].length; var7++) {
                this.field1650[var6][var7] = var3.method2101();
            }
        }
    }
}
