package deob;

@ObfuscatedName("ec")
public class class133 extends class181 {

    @ObfuscatedName("ec.u")
    public int field1791;

    @ObfuscatedName("ec.f")
    public int field1786;

    @ObfuscatedName("ec.b")
    public int[] field1787;

    @ObfuscatedName("ec.g")
    public int[][] field1788;

    public class133(int arg0, byte[] arg1) {
        this.field1791 = arg0;
        class300 var3 = new class300(arg1);
        this.field1786 = var3.method5138();
        this.field1787 = new int[this.field1786];
        this.field1788 = new int[this.field1786][];
        for (int var4 = 0; var4 < this.field1786; var4++) {
            this.field1787[var4] = var3.method5138();
        }
        for (int var5 = 0; var5 < this.field1786; var5++) {
            this.field1788[var5] = new int[var3.method5138()];
        }
        for (int var6 = 0; var6 < this.field1786; var6++) {
            for (int var7 = 0; var7 < this.field1788[var6].length; var7++) {
                this.field1788[var6][var7] = var3.method5138();
            }
        }
    }
}
