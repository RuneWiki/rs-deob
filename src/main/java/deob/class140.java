package deob;

@ObfuscatedName("el")
public class class140 extends class194 {

    @ObfuscatedName("el.j")
    public int field2057;

    @ObfuscatedName("el.h")
    public int field2055;

    @ObfuscatedName("el.f")
    public int[] field2054;

    @ObfuscatedName("el.p")
    public int[][] field2059;

    public class140(int arg0, byte[] arg1) {
        this.field2057 = arg0;
        class175 var3 = new class175(arg1);
        this.field2055 = var3.method2903();
        this.field2054 = new int[this.field2055];
        this.field2059 = new int[this.field2055][];
        for (int var4 = 0; var4 < this.field2055; var4++) {
            this.field2054[var4] = var3.method2903();
        }
        for (int var5 = 0; var5 < this.field2055; var5++) {
            this.field2059[var5] = new int[var3.method2903()];
        }
        for (int var6 = 0; var6 < this.field2055; var6++) {
            for (int var7 = 0; var7 < this.field2059[var6].length; var7++) {
                this.field2059[var6][var7] = var3.method2903();
            }
        }
    }
}
