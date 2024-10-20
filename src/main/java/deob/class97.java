package deob;

@ObfuscatedName("cd")
public class class97 extends class199 {

    @ObfuscatedName("cd.n")
    public int field1698;

    @ObfuscatedName("cd.d")
    public int field1695;

    @ObfuscatedName("cd.z")
    public int[] field1699;

    @ObfuscatedName("cd.y")
    public int[][] field1697;

    public class97(int arg0, byte[] arg1) {
        this.field1698 = arg0;
        class111 var3 = new class111(arg1);
        this.field1695 = var3.method2228();
        this.field1699 = new int[this.field1695];
        this.field1697 = new int[this.field1695][];
        for (int var4 = 0; var4 < this.field1695; var4++) {
            this.field1699[var4] = var3.method2228();
        }
        for (int var5 = 0; var5 < this.field1695; var5++) {
            this.field1697[var5] = new int[var3.method2228()];
        }
        for (int var6 = 0; var6 < this.field1695; var6++) {
            for (int var7 = 0; var7 < this.field1697[var6].length; var7++) {
                this.field1697[var6][var7] = var3.method2228();
            }
        }
    }
}
