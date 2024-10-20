package deob;

@ObfuscatedName("cw")
public class class96 extends class191 {

    @ObfuscatedName("cw.b")
    public int field1660;

    @ObfuscatedName("cw.e")
    public int field1668;

    @ObfuscatedName("cw.i")
    public int[] field1657;

    @ObfuscatedName("cw.k")
    public int[][] field1658;

    public class96(int arg0, byte[] arg1) {
        this.field1660 = arg0;
        class110 var3 = new class110(arg1);
        this.field1668 = var3.method2142();
        this.field1657 = new int[this.field1668];
        this.field1658 = new int[this.field1668][];
        for (int var4 = 0; var4 < this.field1668; var4++) {
            this.field1657[var4] = var3.method2142();
        }
        for (int var5 = 0; var5 < this.field1668; var5++) {
            this.field1658[var5] = new int[var3.method2142()];
        }
        for (int var6 = 0; var6 < this.field1668; var6++) {
            for (int var7 = 0; var7 < this.field1658[var6].length; var7++) {
                this.field1658[var6][var7] = var3.method2142();
            }
        }
    }
}
