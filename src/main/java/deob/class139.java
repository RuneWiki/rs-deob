package deob;

@ObfuscatedName("ek")
public class class139 extends class193 {

    @ObfuscatedName("ek.i")
    public int field2035;

    @ObfuscatedName("ek.h")
    public int field2033;

    @ObfuscatedName("ek.u")
    public int[] field2036;

    @ObfuscatedName("ek.q")
    public int[][] field2034;

    public class139(int arg0, byte[] arg1) {
        this.field2035 = arg0;
        class174 var3 = new class174(arg1);
        this.field2033 = var3.method2930();
        this.field2036 = new int[this.field2033];
        this.field2034 = new int[this.field2033][];
        for (int var4 = 0; var4 < this.field2033; var4++) {
            this.field2036[var4] = var3.method2930();
        }
        for (int var5 = 0; var5 < this.field2033; var5++) {
            this.field2034[var5] = new int[var3.method2930()];
        }
        for (int var6 = 0; var6 < this.field2033; var6++) {
            for (int var7 = 0; var7 < this.field2034[var6].length; var7++) {
                this.field2034[var6][var7] = var3.method2930();
            }
        }
    }
}
