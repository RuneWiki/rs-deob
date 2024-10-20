package deob;

@ObfuscatedName("ct")
public class class92 extends class176 {

    @ObfuscatedName("ct.m")
    public int field1629;

    @ObfuscatedName("ct.k")
    public int field1627;

    @ObfuscatedName("ct.y")
    public int[] field1628;

    @ObfuscatedName("ct.g")
    public int[][] field1626;

    public class92(int arg0, byte[] arg1) {
        this.field1629 = arg0;
        class104 var3 = new class104(arg1);
        this.field1627 = var3.method2190();
        this.field1628 = new int[this.field1627];
        this.field1626 = new int[this.field1627][];
        for (int var4 = 0; var4 < this.field1627; var4++) {
            this.field1628[var4] = var3.method2190();
        }
        for (int var5 = 0; var5 < this.field1627; var5++) {
            this.field1626[var5] = new int[var3.method2190()];
        }
        for (int var6 = 0; var6 < this.field1627; var6++) {
            for (int var7 = 0; var7 < this.field1626[var6].length; var7++) {
                this.field1626[var6][var7] = var3.method2190();
            }
        }
    }
}
