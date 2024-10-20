package deob;

@ObfuscatedName("ce")
public class class95 extends class186 {

    @ObfuscatedName("ce.k")
    public int field1672;

    @ObfuscatedName("ce.b")
    public int field1668;

    @ObfuscatedName("ce.e")
    public int[] field1669;

    @ObfuscatedName("ce.i")
    public int[][] field1678;

    public class95(int arg0, byte[] arg1) {
        this.field1672 = arg0;
        class107 var3 = new class107(arg1);
        this.field1668 = var3.method2115();
        this.field1669 = new int[this.field1668];
        this.field1678 = new int[this.field1668][];
        for (int var4 = 0; var4 < this.field1668; var4++) {
            this.field1669[var4] = var3.method2115();
        }
        for (int var5 = 0; var5 < this.field1668; var5++) {
            this.field1678[var5] = new int[var3.method2115()];
        }
        for (int var6 = 0; var6 < this.field1668; var6++) {
            for (int var7 = 0; var7 < this.field1678[var6].length; var7++) {
                this.field1678[var6][var7] = var3.method2115();
            }
        }
    }
}
