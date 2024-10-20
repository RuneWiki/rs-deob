package deob;

@ObfuscatedName("et")
public class class153 extends class160 {

    @ObfuscatedName("et.i")
    public long[] field2224 = new long[10];

    @ObfuscatedName("et.j")
    public int field2217 = 256;

    @ObfuscatedName("et.a")
    public int field2218 = 1;

    @ObfuscatedName("et.r")
    public long field2222 = class177.method608();

    @ObfuscatedName("et.o")
    public int field2220 = 0;

    @ObfuscatedName("et.n")
    public int field2216;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2224[var1] = this.field2222;
        }
    }

    @ObfuscatedName("et.i(B)V")
    public void method2749() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2224[var1] = 0L;
        }
    }

    @ObfuscatedName("et.j(III)I")
    public int method2748(int arg0, int arg1) {
        int var3 = this.field2217;
        int var4 = this.field2218;
        this.field2217 = 300;
        this.field2218 = 1;
        this.field2222 = class177.method608();
        if (this.field2224[this.field2216] == 0L) {
            this.field2217 = var3;
            this.field2218 = var4;
        } else if (this.field2222 > this.field2224[this.field2216]) {
            this.field2217 = (int) ((long) (arg0 * 2560) / (this.field2222 - this.field2224[this.field2216]));
        }
        if (this.field2217 < 25) {
            this.field2217 = 25;
        }
        if (this.field2217 > 256) {
            this.field2217 = 256;
            this.field2218 = (int) ((long) arg0 - (this.field2222 - this.field2224[this.field2216]) / 10L);
        }
        if (this.field2218 > arg0) {
            this.field2218 = arg0;
        }
        this.field2224[this.field2216] = this.field2222;
        this.field2216 = (this.field2216 + 1) % 10;
        if (this.field2218 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2224[var5] != 0L) {
                    this.field2224[var5] += (long) this.field2218;
                }
            }
        }
        if (this.field2218 < arg1) {
            this.field2218 = arg1;
        }
        Statics.method1558((long) this.field2218);
        int var6 = 0;
        while (this.field2220 < 256) {
            var6++;
            this.field2220 += this.field2217;
        }
        this.field2220 &= 0xFF;
        return var6;
    }
}
