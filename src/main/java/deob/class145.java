package deob;

@ObfuscatedName("en")
public class class145 extends class137 {

    @ObfuscatedName("en.e")
    public long[] field2217 = new long[10];

    @ObfuscatedName("en.l")
    public int field2216 = 256;

    @ObfuscatedName("en.c")
    public int field2218 = 1;

    @ObfuscatedName("en.h")
    public long field2223 = class119.method415();

    @ObfuscatedName("en.r")
    public int field2220 = 0;

    @ObfuscatedName("en.a")
    public int field2221;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2217[var1] = this.field2223;
        }
    }

    @ObfuscatedName("en.e(I)V")
    public void method2824() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2217[var1] = 0L;
        }
    }

    @ObfuscatedName("en.l(III)I")
    public int method2821(int arg0, int arg1) {
        int var3 = this.field2216;
        int var4 = this.field2218;
        this.field2216 = 300;
        this.field2218 = 1;
        this.field2223 = class119.method415();
        if (this.field2217[this.field2221] == 0L) {
            this.field2216 = var3;
            this.field2218 = var4;
        } else if (this.field2223 > this.field2217[this.field2221]) {
            this.field2216 = (int) ((long) (arg0 * 2560) / (this.field2223 - this.field2217[this.field2221]));
        }
        if (this.field2216 < 25) {
            this.field2216 = 25;
        }
        if (this.field2216 > 256) {
            this.field2216 = 256;
            this.field2218 = (int) ((long) arg0 - (this.field2223 - this.field2217[this.field2221]) / 10L);
        }
        if (this.field2218 > arg0) {
            this.field2218 = arg0;
        }
        this.field2217[this.field2221] = this.field2223;
        this.field2221 = (this.field2221 + 1) % 10;
        if (this.field2218 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2217[var5] != 0L) {
                    this.field2217[var5] += (long) this.field2218;
                }
            }
        }
        if (this.field2218 < arg1) {
            this.field2218 = arg1;
        }
        class131.method2735((long) this.field2218);
        int var6 = 0;
        while (this.field2220 < 256) {
            var6++;
            this.field2220 += this.field2216;
        }
        this.field2220 &= 0xFF;
        return var6;
    }
}
