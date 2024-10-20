package deob;

@ObfuscatedName("em")
public class class139 extends class196 {

    @ObfuscatedName("em.s")
    public int field2045;

    @ObfuscatedName("em.c")
    public int field2046;

    @ObfuscatedName("em.f")
    public int[] field2047;

    @ObfuscatedName("em.m")
    public int[][] field2050;

    public class139(int arg0, byte[] arg1) {
        this.field2045 = arg0;
        class177 var3 = new class177(arg1);
        this.field2046 = var3.method2965();
        this.field2047 = new int[this.field2046];
        this.field2050 = new int[this.field2046][];
        for (int var4 = 0; var4 < this.field2046; var4++) {
            this.field2047[var4] = var3.method2965();
        }
        for (int var5 = 0; var5 < this.field2046; var5++) {
            this.field2050[var5] = new int[var3.method2965()];
        }
        for (int var6 = 0; var6 < this.field2046; var6++) {
            for (int var7 = 0; var7 < this.field2050[var6].length; var7++) {
                this.field2050[var6][var7] = var3.method2965();
            }
        }
    }
}
