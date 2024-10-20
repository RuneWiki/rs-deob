package deob;

@ObfuscatedName("eb")
public class class142 extends class190 {

    @ObfuscatedName("eb.x")
    public int field1807;

    @ObfuscatedName("eb.m")
    public int field1808;

    @ObfuscatedName("eb.k")
    public int[] field1810;

    @ObfuscatedName("eb.d")
    public int[][] field1809;

    public class142(int arg0, byte[] arg1) {
        this.field1807 = arg0;
        class310 var3 = new class310(arg1);
        this.field1808 = var3.method5137();
        this.field1810 = new int[this.field1808];
        this.field1809 = new int[this.field1808][];
        for (int var4 = 0; var4 < this.field1808; var4++) {
            this.field1810[var4] = var3.method5137();
        }
        for (int var5 = 0; var5 < this.field1808; var5++) {
            this.field1809[var5] = new int[var3.method5137()];
        }
        for (int var6 = 0; var6 < this.field1808; var6++) {
            for (int var7 = 0; var7 < this.field1809[var6].length; var7++) {
                this.field1809[var6][var7] = var3.method5137();
            }
        }
    }
}
