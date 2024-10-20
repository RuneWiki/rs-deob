package deob;

@ObfuscatedName("ej")
public class class137 extends class193 {

    @ObfuscatedName("ej.w")
    public int field2035;

    @ObfuscatedName("ej.s")
    public int field2033;

    @ObfuscatedName("ej.q")
    public int[] field2034;

    @ObfuscatedName("ej.o")
    public int[][] field2036;

    public class137(int arg0, byte[] arg1) {
        this.field2035 = arg0;
        class174 var3 = new class174(arg1);
        this.field2033 = var3.method2971();
        this.field2034 = new int[this.field2033];
        this.field2036 = new int[this.field2033][];
        for (int var4 = 0; var4 < this.field2033; var4++) {
            this.field2034[var4] = var3.method2971();
        }
        for (int var5 = 0; var5 < this.field2033; var5++) {
            this.field2036[var5] = new int[var3.method2971()];
        }
        for (int var6 = 0; var6 < this.field2033; var6++) {
            for (int var7 = 0; var7 < this.field2036[var6].length; var7++) {
                this.field2036[var6][var7] = var3.method2971();
            }
        }
    }
}
