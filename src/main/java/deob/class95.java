package deob;

@ObfuscatedName("ce")
public class class95 extends class186 {

    @ObfuscatedName("ce.e")
    public int field1662;

    @ObfuscatedName("ce.v")
    public int field1661;

    @ObfuscatedName("ce.i")
    public int[] field1664;

    @ObfuscatedName("ce.g")
    public int[][] field1663;

    public class95(int arg0, byte[] arg1) {
        this.field1662 = arg0;
        class107 var3 = new class107(arg1);
        this.field1661 = var3.method2226();
        this.field1664 = new int[this.field1661];
        this.field1663 = new int[this.field1661][];
        for (int var4 = 0; var4 < this.field1661; var4++) {
            this.field1664[var4] = var3.method2226();
        }
        for (int var5 = 0; var5 < this.field1661; var5++) {
            this.field1663[var5] = new int[var3.method2226()];
        }
        for (int var6 = 0; var6 < this.field1661; var6++) {
            for (int var7 = 0; var7 < this.field1663[var6].length; var7++) {
                this.field1663[var6][var7] = var3.method2226();
            }
        }
    }
}
