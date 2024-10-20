package deob;

@ObfuscatedName("cw")
public class class92 extends class176 {

    @ObfuscatedName("cw.z")
    public int field1633;

    @ObfuscatedName("cw.n")
    public int field1630;

    @ObfuscatedName("cw.u")
    public int[] field1631;

    @ObfuscatedName("cw.t")
    public int[][] field1632;

    public class92(int arg0, byte[] arg1) {
        this.field1633 = arg0;
        class104 var3 = new class104(arg1);
        this.field1630 = var3.method2257();
        this.field1631 = new int[this.field1630];
        this.field1632 = new int[this.field1630][];
        for (int var4 = 0; var4 < this.field1630; var4++) {
            this.field1631[var4] = var3.method2257();
        }
        for (int var5 = 0; var5 < this.field1630; var5++) {
            this.field1632[var5] = new int[var3.method2257()];
        }
        for (int var6 = 0; var6 < this.field1630; var6++) {
            for (int var7 = 0; var7 < this.field1632[var6].length; var7++) {
                this.field1632[var6][var7] = var3.method2257();
            }
        }
    }
}
