package deob;

@ObfuscatedName("do")
public class class47 extends class4 {

    @ObfuscatedName("do.o")
    public int[] field378;

    @ObfuscatedName("do.j")
    public int field382;

    @ObfuscatedName("do.t")
    public int[][] field379;

    @ObfuscatedName("do.p")
    public int field377;

    public class47(int arg0, byte[] arg1) {
        this.field382 = arg0;
        class31 var3 = new class31(arg1);
        this.field377 = var3.method512();
        this.field378 = new int[this.field377];
        this.field379 = new int[this.field377][];
        for (int var4 = 0; var4 < this.field377; var4++) {
            this.field378[var4] = var3.method512();
        }
        for (int var5 = 0; var5 < this.field377; var5++) {
            this.field379[var5] = new int[var3.method512()];
        }
        for (int var6 = 0; var6 < this.field377; var6++) {
            for (int var7 = 0; var7 < this.field379[var6].length; var7++) {
                this.field379[var6][var7] = var3.method512();
            }
        }
    }
}
