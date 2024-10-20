package deob;

@ObfuscatedName("ek")
public class class137 extends class193 {

    @ObfuscatedName("ek.d")
    public int field2045;

    @ObfuscatedName("ek.k")
    public int field2039;

    @ObfuscatedName("ek.e")
    public int[] field2038;

    @ObfuscatedName("ek.p")
    public int[][] field2042;

    public class137(int arg0, byte[] arg1) {
        this.field2045 = arg0;
        class174 var3 = new class174(arg1);
        this.field2039 = var3.method2955();
        this.field2038 = new int[this.field2039];
        this.field2042 = new int[this.field2039][];
        for (int var4 = 0; var4 < this.field2039; var4++) {
            this.field2038[var4] = var3.method2955();
        }
        for (int var5 = 0; var5 < this.field2039; var5++) {
            this.field2042[var5] = new int[var3.method2955()];
        }
        for (int var6 = 0; var6 < this.field2039; var6++) {
            for (int var7 = 0; var7 < this.field2042[var6].length; var7++) {
                this.field2042[var6][var7] = var3.method2955();
            }
        }
    }
}
