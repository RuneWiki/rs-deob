package deob;

@ObfuscatedName("fa")
public class class175 extends class351 {

    @ObfuscatedName("fa.f")
    public int field1931;

    @ObfuscatedName("fa.o")
    public int field1927;

    @ObfuscatedName("fa.u")
    public int[] field1926;

    @ObfuscatedName("fa.p")
    public int[][] field1929;

    public class175(int arg0, byte[] arg1) {
        this.field1931 = arg0;
        class382 var3 = new class382(arg1);
        this.field1927 = var3.method5856();
        this.field1926 = new int[this.field1927];
        this.field1929 = new int[this.field1927][];
        for (int var4 = 0; var4 < this.field1927; var4++) {
            this.field1926[var4] = var3.method5856();
        }
        for (int var5 = 0; var5 < this.field1927; var5++) {
            this.field1929[var5] = new int[var3.method5856()];
        }
        for (int var6 = 0; var6 < this.field1927; var6++) {
            for (int var7 = 0; var7 < this.field1929[var6].length; var7++) {
                this.field1929[var6][var7] = var3.method5856();
            }
        }
    }
}
