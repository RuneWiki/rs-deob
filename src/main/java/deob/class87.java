package deob;

@ObfuscatedName("cb")
public class class87 extends class128 {

    @ObfuscatedName("cb.b")
    public int field1472;

    @ObfuscatedName("cb.e")
    public int field1478;

    @ObfuscatedName("cb.c")
    public int[] field1474;

    @ObfuscatedName("cb.l")
    public int[][] field1475;

    public class87(int arg0, byte[] arg1) {
        this.field1472 = arg0;
        class154 var3 = new class154(arg1);
        this.field1478 = var3.method2669();
        this.field1474 = new int[this.field1478];
        this.field1475 = new int[this.field1478][];
        for (int var4 = 0; var4 < this.field1478; var4++) {
            this.field1474[var4] = var3.method2669();
        }
        for (int var5 = 0; var5 < this.field1478; var5++) {
            this.field1475[var5] = new int[var3.method2669()];
        }
        for (int var6 = 0; var6 < this.field1478; var6++) {
            for (int var7 = 0; var7 < this.field1475[var6].length; var7++) {
                this.field1475[var6][var7] = var3.method2669();
            }
        }
    }
}
