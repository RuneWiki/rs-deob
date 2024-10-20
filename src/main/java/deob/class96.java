package deob;

@ObfuscatedName("cz")
public class class96 extends class189 {

    @ObfuscatedName("cz.e")
    public int field1668;

    @ObfuscatedName("cz.v")
    public int field1669;

    @ObfuscatedName("cz.k")
    public int[] field1670;

    @ObfuscatedName("cz.g")
    public int[][] field1671;

    public class96(int arg0, byte[] arg1) {
        this.field1668 = arg0;
        class108 var3 = new class108(arg1);
        this.field1669 = var3.method2122();
        this.field1670 = new int[this.field1669];
        this.field1671 = new int[this.field1669][];
        for (int var4 = 0; var4 < this.field1669; var4++) {
            this.field1670[var4] = var3.method2122();
        }
        for (int var5 = 0; var5 < this.field1669; var5++) {
            this.field1671[var5] = new int[var3.method2122()];
        }
        for (int var6 = 0; var6 < this.field1669; var6++) {
            for (int var7 = 0; var7 < this.field1671[var6].length; var7++) {
                this.field1671[var6][var7] = var3.method2122();
            }
        }
    }
}
