package deob;

@ObfuscatedName("er")
public class class142 extends class190 {

    @ObfuscatedName("er.m")
    public int field1824;

    @ObfuscatedName("er.o")
    public int field1823;

    @ObfuscatedName("er.q")
    public int[] field1828;

    @ObfuscatedName("er.j")
    public int[][] field1825;

    public class142(int arg0, byte[] arg1) {
        this.field1824 = arg0;
        class310 var3 = new class310(arg1);
        this.field1823 = var3.method5227();
        this.field1828 = new int[this.field1823];
        this.field1825 = new int[this.field1823][];
        for (int var4 = 0; var4 < this.field1823; var4++) {
            this.field1828[var4] = var3.method5227();
        }
        for (int var5 = 0; var5 < this.field1823; var5++) {
            this.field1825[var5] = new int[var3.method5227()];
        }
        for (int var6 = 0; var6 < this.field1823; var6++) {
            for (int var7 = 0; var7 < this.field1825[var6].length; var7++) {
                this.field1825[var6][var7] = var3.method5227();
            }
        }
    }
}
