package deob;

@ObfuscatedName("ej")
public class class133 extends class181 {

    @ObfuscatedName("ej.q")
    public int field1800;

    @ObfuscatedName("ej.w")
    public int field1798;

    @ObfuscatedName("ej.e")
    public int[] field1799;

    @ObfuscatedName("ej.p")
    public int[][] field1797;

    public class133(int arg0, byte[] arg1) {
        this.field1800 = arg0;
        class301 var3 = new class301(arg1);
        this.field1798 = var3.method5077();
        this.field1799 = new int[this.field1798];
        this.field1797 = new int[this.field1798][];
        for (int var4 = 0; var4 < this.field1798; var4++) {
            this.field1799[var4] = var3.method5077();
        }
        for (int var5 = 0; var5 < this.field1798; var5++) {
            this.field1797[var5] = new int[var3.method5077()];
        }
        for (int var6 = 0; var6 < this.field1798; var6++) {
            for (int var7 = 0; var7 < this.field1797[var6].length; var7++) {
                this.field1797[var6][var7] = var3.method5077();
            }
        }
    }
}
