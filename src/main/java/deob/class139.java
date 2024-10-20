package deob;

@ObfuscatedName("em")
public class class139 extends class193 {

    @ObfuscatedName("em.c")
    public int field2015;

    @ObfuscatedName("em.o")
    public int field2011;

    @ObfuscatedName("em.i")
    public int[] field2010;

    @ObfuscatedName("em.u")
    public int[][] field2013;

    public class139(int arg0, byte[] arg1) {
        this.field2015 = arg0;
        class174 var3 = new class174(arg1);
        this.field2011 = var3.method2843();
        this.field2010 = new int[this.field2011];
        this.field2013 = new int[this.field2011][];
        for (int var4 = 0; var4 < this.field2011; var4++) {
            this.field2010[var4] = var3.method2843();
        }
        for (int var5 = 0; var5 < this.field2011; var5++) {
            this.field2013[var5] = new int[var3.method2843()];
        }
        for (int var6 = 0; var6 < this.field2011; var6++) {
            for (int var7 = 0; var7 < this.field2013[var6].length; var7++) {
                this.field2013[var6][var7] = var3.method2843();
            }
        }
    }
}
