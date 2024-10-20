package deob;

@ObfuscatedName("cb")
public class class97 extends class199 {

    @ObfuscatedName("cb.p")
    public int field1699;

    @ObfuscatedName("cb.k")
    public int field1700;

    @ObfuscatedName("cb.e")
    public int[] field1698;

    @ObfuscatedName("cb.f")
    public int[][] field1701;

    public class97(int arg0, byte[] arg1) {
        this.field1699 = arg0;
        class111 var3 = new class111(arg1);
        this.field1700 = var3.method2314();
        this.field1698 = new int[this.field1700];
        this.field1701 = new int[this.field1700][];
        for (int var4 = 0; var4 < this.field1700; var4++) {
            this.field1698[var4] = var3.method2314();
        }
        for (int var5 = 0; var5 < this.field1700; var5++) {
            this.field1701[var5] = new int[var3.method2314()];
        }
        for (int var6 = 0; var6 < this.field1700; var6++) {
            for (int var7 = 0; var7 < this.field1701[var6].length; var7++) {
                this.field1701[var6][var7] = var3.method2314();
            }
        }
    }
}
