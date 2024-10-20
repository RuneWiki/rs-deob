package deob;

@ObfuscatedName("ep")
public class class140 extends class194 {

    @ObfuscatedName("ep.e")
    public int field2042;

    @ObfuscatedName("ep.n")
    public int field2046;

    @ObfuscatedName("ep.g")
    public int[] field2041;

    @ObfuscatedName("ep.y")
    public int[][] field2040;

    public class140(int arg0, byte[] arg1) {
        this.field2042 = arg0;
        class175 var3 = new class175(arg1);
        this.field2046 = var3.method2928();
        this.field2041 = new int[this.field2046];
        this.field2040 = new int[this.field2046][];
        for (int var4 = 0; var4 < this.field2046; var4++) {
            this.field2041[var4] = var3.method2928();
        }
        for (int var5 = 0; var5 < this.field2046; var5++) {
            this.field2040[var5] = new int[var3.method2928()];
        }
        for (int var6 = 0; var6 < this.field2046; var6++) {
            for (int var7 = 0; var7 < this.field2040[var6].length; var7++) {
                this.field2040[var6][var7] = var3.method2928();
            }
        }
    }
}
