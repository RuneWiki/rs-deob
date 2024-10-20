package deob;

@ObfuscatedName("cr")
public class class87 extends class128 {

    @ObfuscatedName("cr.f")
    public int field1495;

    @ObfuscatedName("cr.i")
    public int field1489;

    @ObfuscatedName("cr.u")
    public int[] field1490;

    @ObfuscatedName("cr.h")
    public int[][] field1491;

    public class87(int arg0, byte[] arg1) {
        this.field1495 = arg0;
        class154 var3 = new class154(arg1);
        this.field1489 = var3.method2666();
        this.field1490 = new int[this.field1489];
        this.field1491 = new int[this.field1489][];
        for (int var4 = 0; var4 < this.field1489; var4++) {
            this.field1490[var4] = var3.method2666();
        }
        for (int var5 = 0; var5 < this.field1489; var5++) {
            this.field1491[var5] = new int[var3.method2666()];
        }
        for (int var6 = 0; var6 < this.field1489; var6++) {
            for (int var7 = 0; var7 < this.field1491[var6].length; var7++) {
                this.field1491[var6][var7] = var3.method2666();
            }
        }
    }
}
