package deob;

@ObfuscatedName("ek")
public class class133 extends class186 {

    @ObfuscatedName("ek.m")
    public int field1775;

    @ObfuscatedName("ek.f")
    public int field1772;

    @ObfuscatedName("ek.q")
    public int[] field1771;

    @ObfuscatedName("ek.w")
    public int[][] field1774;

    public class133(int arg0, byte[] arg1) {
        this.field1775 = arg0;
        class202 var3 = new class202(arg1);
        this.field1772 = var3.method3551();
        this.field1771 = new int[this.field1772];
        this.field1774 = new int[this.field1772][];
        for (int var4 = 0; var4 < this.field1772; var4++) {
            this.field1771[var4] = var3.method3551();
        }
        for (int var5 = 0; var5 < this.field1772; var5++) {
            this.field1774[var5] = new int[var3.method3551()];
        }
        for (int var6 = 0; var6 < this.field1772; var6++) {
            for (int var7 = 0; var7 < this.field1774[var6].length; var7++) {
                this.field1774[var6][var7] = var3.method3551();
            }
        }
    }
}
