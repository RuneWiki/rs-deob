package deob;

@ObfuscatedName("ex")
public class class133 extends class181 {

    @ObfuscatedName("ex.s")
    public int field1777;

    @ObfuscatedName("ex.j")
    public int field1779;

    @ObfuscatedName("ex.i")
    public int[] field1776;

    @ObfuscatedName("ex.k")
    public int[][] field1778;

    public class133(int arg0, byte[] arg1) {
        this.field1777 = arg0;
        class300 var3 = new class300(arg1);
        this.field1779 = var3.method5179();
        this.field1776 = new int[this.field1779];
        this.field1778 = new int[this.field1779][];
        for (int var4 = 0; var4 < this.field1779; var4++) {
            this.field1776[var4] = var3.method5179();
        }
        for (int var5 = 0; var5 < this.field1779; var5++) {
            this.field1778[var5] = new int[var3.method5179()];
        }
        for (int var6 = 0; var6 < this.field1779; var6++) {
            for (int var7 = 0; var7 < this.field1778[var6].length; var7++) {
                this.field1778[var6][var7] = var3.method5179();
            }
        }
    }
}
