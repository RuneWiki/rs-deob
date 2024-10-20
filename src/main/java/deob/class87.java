package deob;

@ObfuscatedName("cy")
public class class87 extends class128 {

    @ObfuscatedName("cy.i")
    public int field1470;

    @ObfuscatedName("cy.e")
    public int field1474;

    @ObfuscatedName("cy.f")
    public int[] field1469;

    @ObfuscatedName("cy.k")
    public int[][] field1468;

    public class87(int arg0, byte[] arg1) {
        this.field1470 = arg0;
        class154 var3 = new class154(arg1);
        this.field1474 = var3.method2573();
        this.field1469 = new int[this.field1474];
        this.field1468 = new int[this.field1474][];
        for (int var4 = 0; var4 < this.field1474; var4++) {
            this.field1469[var4] = var3.method2573();
        }
        for (int var5 = 0; var5 < this.field1474; var5++) {
            this.field1468[var5] = new int[var3.method2573()];
        }
        for (int var6 = 0; var6 < this.field1474; var6++) {
            for (int var7 = 0; var7 < this.field1468[var6].length; var7++) {
                this.field1468[var6][var7] = var3.method2573();
            }
        }
    }
}
