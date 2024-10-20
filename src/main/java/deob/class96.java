package deob;

@ObfuscatedName("cy")
public class class96 extends class189 {

    @ObfuscatedName("cy.c")
    public int field1647;

    @ObfuscatedName("cy.j")
    public int field1644;

    @ObfuscatedName("cy.y")
    public int[] field1649;

    @ObfuscatedName("cy.r")
    public int[][] field1646;

    public class96(int arg0, byte[] arg1) {
        this.field1647 = arg0;
        class108 var3 = new class108(arg1);
        this.field1644 = var3.method2134();
        this.field1649 = new int[this.field1644];
        this.field1646 = new int[this.field1644][];
        for (int var4 = 0; var4 < this.field1644; var4++) {
            this.field1649[var4] = var3.method2134();
        }
        for (int var5 = 0; var5 < this.field1644; var5++) {
            this.field1646[var5] = new int[var3.method2134()];
        }
        for (int var6 = 0; var6 < this.field1644; var6++) {
            for (int var7 = 0; var7 < this.field1646[var6].length; var7++) {
                this.field1646[var6][var7] = var3.method2134();
            }
        }
    }
}
