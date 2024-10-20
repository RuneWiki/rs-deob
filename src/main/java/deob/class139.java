package deob;

@ObfuscatedName("ea")
public class class139 extends class193 {

    @ObfuscatedName("ea.i")
    public int field2072;

    @ObfuscatedName("ea.c")
    public int field2069;

    @ObfuscatedName("ea.e")
    public int[] field2070;

    @ObfuscatedName("ea.v")
    public int[][] field2071;

    public class139(int arg0, byte[] arg1) {
        this.field2072 = arg0;
        class174 var3 = new class174(arg1);
        this.field2069 = var3.method2870();
        this.field2070 = new int[this.field2069];
        this.field2071 = new int[this.field2069][];
        for (int var4 = 0; var4 < this.field2069; var4++) {
            this.field2070[var4] = var3.method2870();
        }
        for (int var5 = 0; var5 < this.field2069; var5++) {
            this.field2071[var5] = new int[var3.method2870()];
        }
        for (int var6 = 0; var6 < this.field2069; var6++) {
            for (int var7 = 0; var7 < this.field2071[var6].length; var7++) {
                this.field2071[var6][var7] = var3.method2870();
            }
        }
    }
}
