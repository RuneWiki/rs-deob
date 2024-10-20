package deob;

@ObfuscatedName("ex")
public class class139 extends class196 {

    @ObfuscatedName("ex.w")
    public int field2061;

    @ObfuscatedName("ex.o")
    public int field2056;

    @ObfuscatedName("ex.x")
    public int[] field2057;

    @ObfuscatedName("ex.k")
    public int[][] field2060;

    public class139(int arg0, byte[] arg1) {
        this.field2061 = arg0;
        class177 var3 = new class177(arg1);
        this.field2056 = var3.method2931();
        this.field2057 = new int[this.field2056];
        this.field2060 = new int[this.field2056][];
        for (int var4 = 0; var4 < this.field2056; var4++) {
            this.field2057[var4] = var3.method2931();
        }
        for (int var5 = 0; var5 < this.field2056; var5++) {
            this.field2060[var5] = new int[var3.method2931()];
        }
        for (int var6 = 0; var6 < this.field2056; var6++) {
            for (int var7 = 0; var7 < this.field2060[var6].length; var7++) {
                this.field2060[var6][var7] = var3.method2931();
            }
        }
    }
}
