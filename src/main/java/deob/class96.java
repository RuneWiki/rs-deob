package deob;

@ObfuscatedName("cc")
public class class96 extends class191 {

    @ObfuscatedName("cc.a")
    public int field1662;

    @ObfuscatedName("cc.v")
    public int field1661;

    @ObfuscatedName("cc.i")
    public int[] field1665;

    @ObfuscatedName("cc.b")
    public int[][] field1663;

    public class96(int arg0, byte[] arg1) {
        this.field1662 = arg0;
        class110 var3 = new class110(arg1);
        this.field1661 = var3.method2199();
        this.field1665 = new int[this.field1661];
        this.field1663 = new int[this.field1661][];
        for (int var4 = 0; var4 < this.field1661; var4++) {
            this.field1665[var4] = var3.method2199();
        }
        for (int var5 = 0; var5 < this.field1661; var5++) {
            this.field1663[var5] = new int[var3.method2199()];
        }
        for (int var6 = 0; var6 < this.field1661; var6++) {
            for (int var7 = 0; var7 < this.field1663[var6].length; var7++) {
                this.field1663[var6][var7] = var3.method2199();
            }
        }
    }
}
