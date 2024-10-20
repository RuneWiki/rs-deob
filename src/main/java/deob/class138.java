package deob;

@ObfuscatedName("ei")
public class class138 extends class194 {

    @ObfuscatedName("ei.i")
    public int field2061;

    @ObfuscatedName("ei.j")
    public int field2058;

    @ObfuscatedName("ei.a")
    public int[] field2059;

    @ObfuscatedName("ei.r")
    public int[][] field2060;

    public class138(int arg0, byte[] arg1) {
        this.field2061 = arg0;
        class175 var3 = new class175(arg1);
        this.field2058 = var3.method2999();
        this.field2059 = new int[this.field2058];
        this.field2060 = new int[this.field2058][];
        for (int var4 = 0; var4 < this.field2058; var4++) {
            this.field2059[var4] = var3.method2999();
        }
        for (int var5 = 0; var5 < this.field2058; var5++) {
            this.field2060[var5] = new int[var3.method2999()];
        }
        for (int var6 = 0; var6 < this.field2058; var6++) {
            for (int var7 = 0; var7 < this.field2060[var6].length; var7++) {
                this.field2060[var6][var7] = var3.method2999();
            }
        }
    }
}
