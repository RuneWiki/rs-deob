package deob;

@ObfuscatedName("ed")
public class class139 extends class193 {

    @ObfuscatedName("ed.n")
    public int field2054;

    @ObfuscatedName("ed.p")
    public int field2055;

    @ObfuscatedName("ed.i")
    public int[] field2056;

    @ObfuscatedName("ed.j")
    public int[][] field2058;

    public class139(int arg0, byte[] arg1) {
        this.field2054 = arg0;
        class174 var3 = new class174(arg1);
        this.field2055 = var3.method2925();
        this.field2056 = new int[this.field2055];
        this.field2058 = new int[this.field2055][];
        for (int var4 = 0; var4 < this.field2055; var4++) {
            this.field2056[var4] = var3.method2925();
        }
        for (int var5 = 0; var5 < this.field2055; var5++) {
            this.field2058[var5] = new int[var3.method2925()];
        }
        for (int var6 = 0; var6 < this.field2055; var6++) {
            for (int var7 = 0; var7 < this.field2058[var6].length; var7++) {
                this.field2058[var6][var7] = var3.method2925();
            }
        }
    }
}
