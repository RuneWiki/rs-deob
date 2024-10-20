package deob;

@ObfuscatedName("cp")
public class class96 extends class191 {

    @ObfuscatedName("cp.v")
    public int field1659;

    @ObfuscatedName("cp.t")
    public int field1660;

    @ObfuscatedName("cp.f")
    public int[] field1664;

    @ObfuscatedName("cp.j")
    public int[][] field1662;

    public class96(int arg0, byte[] arg1) {
        this.field1659 = arg0;
        class110 var3 = new class110(arg1);
        this.field1660 = var3.method2257();
        this.field1664 = new int[this.field1660];
        this.field1662 = new int[this.field1660][];
        for (int var4 = 0; var4 < this.field1660; var4++) {
            this.field1664[var4] = var3.method2257();
        }
        for (int var5 = 0; var5 < this.field1660; var5++) {
            this.field1662[var5] = new int[var3.method2257()];
        }
        for (int var6 = 0; var6 < this.field1660; var6++) {
            for (int var7 = 0; var7 < this.field1662[var6].length; var7++) {
                this.field1662[var6][var7] = var3.method2257();
            }
        }
    }
}
