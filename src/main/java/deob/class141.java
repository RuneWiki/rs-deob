package deob;

@ObfuscatedName("eg")
public class class141 extends class133 {

    @ObfuscatedName("eg.v")
    public long[] field2178 = new long[10];

    @ObfuscatedName("eg.f")
    public int field2173 = 256;

    @ObfuscatedName("eg.i")
    public int field2174 = 1;

    @ObfuscatedName("eg.d")
    public long field2172 = class115.method819();

    @ObfuscatedName("eg.o")
    public int field2176 = 0;

    @ObfuscatedName("eg.c")
    public int field2177;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2178[var1] = this.field2172;
        }
    }

    @ObfuscatedName("eg.v(I)V")
    public void method2687() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2178[var1] = 0L;
        }
    }

    @ObfuscatedName("eg.f(IIS)I")
    public int method2688(int arg0, int arg1) {
        int var3 = this.field2173;
        int var4 = this.field2174;
        this.field2173 = 300;
        this.field2174 = 1;
        this.field2172 = class115.method819();
        if (this.field2178[this.field2177] == 0L) {
            this.field2173 = var3;
            this.field2174 = var4;
        } else if (this.field2172 > this.field2178[this.field2177]) {
            this.field2173 = (int) ((long) (arg0 * 2560) / (this.field2172 - this.field2178[this.field2177]));
        }
        if (this.field2173 < 25) {
            this.field2173 = 25;
        }
        if (this.field2173 > 256) {
            this.field2173 = 256;
            this.field2174 = (int) ((long) arg0 - (this.field2172 - this.field2178[this.field2177]) / 10L);
        }
        if (this.field2174 > arg0) {
            this.field2174 = arg0;
        }
        this.field2178[this.field2177] = this.field2172;
        this.field2177 = (this.field2177 + 1) % 10;
        if (this.field2174 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2178[var5] != 0L) {
                    this.field2178[var5] += (long) this.field2174;
                }
            }
        }
        if (this.field2174 < arg1) {
            this.field2174 = arg1;
        }
        class127.method2134((long) this.field2174);
        int var6 = 0;
        while (this.field2176 < 256) {
            var6++;
            this.field2176 += this.field2173;
        }
        this.field2176 &= 0xFF;
        return var6;
    }
}
