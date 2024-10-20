package deob;

@ObfuscatedName("co")
public class class87 extends class128 {

    @ObfuscatedName("co.k")
    public int field1468;

    @ObfuscatedName("co.y")
    public int field1474;

    @ObfuscatedName("co.o")
    public int[] field1472;

    @ObfuscatedName("co.r")
    public int[][] field1469;

    public class87(int arg0, byte[] arg1) {
        this.field1468 = arg0;
        class161 var3 = new class161(arg1);
        this.field1474 = var3.method2733();
        this.field1472 = new int[this.field1474];
        this.field1469 = new int[this.field1474][];
        for (int var4 = 0; var4 < this.field1474; var4++) {
            this.field1472[var4] = var3.method2733();
        }
        for (int var5 = 0; var5 < this.field1474; var5++) {
            this.field1469[var5] = new int[var3.method2733()];
        }
        for (int var6 = 0; var6 < this.field1474; var6++) {
            for (int var7 = 0; var7 < this.field1469[var6].length; var7++) {
                this.field1469[var6][var7] = var3.method2733();
            }
        }
    }
}
