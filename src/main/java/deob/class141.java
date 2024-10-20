package deob;

@ObfuscatedName("ei")
public class class141 extends class133 {

    @ObfuscatedName("ei.j")
    public long[] field2175 = new long[10];

    @ObfuscatedName("ei.l")
    public int field2179 = 256;

    @ObfuscatedName("ei.a")
    public int field2177 = 1;

    @ObfuscatedName("ei.i")
    public long field2176 = class115.method2249();

    @ObfuscatedName("ei.f")
    public int field2174 = 0;

    @ObfuscatedName("ei.m")
    public int field2178;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2175[var1] = this.field2176;
        }
    }

    @ObfuscatedName("ei.l(I)V")
    public void method2636() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2175[var1] = 0L;
        }
    }

    @ObfuscatedName("ei.a(IIB)I")
    public int method2644(int arg0, int arg1) {
        int var3 = this.field2179;
        int var4 = this.field2177;
        this.field2179 = 300;
        this.field2177 = 1;
        this.field2176 = class115.method2249();
        if (this.field2175[this.field2178] == 0L) {
            this.field2179 = var3;
            this.field2177 = var4;
        } else if (this.field2176 > this.field2175[this.field2178]) {
            this.field2179 = (int) ((long) (arg0 * 2560) / (this.field2176 - this.field2175[this.field2178]));
        }
        if (this.field2179 < 25) {
            this.field2179 = 25;
        }
        if (this.field2179 > 256) {
            this.field2179 = 256;
            this.field2177 = (int) ((long) arg0 - (this.field2176 - this.field2175[this.field2178]) / 10L);
        }
        if (this.field2177 > arg0) {
            this.field2177 = arg0;
        }
        this.field2175[this.field2178] = this.field2176;
        this.field2178 = (this.field2178 + 1) % 10;
        if (this.field2177 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2175[var5] != 0L) {
                    this.field2175[var5] += (long) this.field2177;
                }
            }
        }
        if (this.field2177 < arg1) {
            this.field2177 = arg1;
        }
        class127.method2202((long) this.field2177);
        int var6 = 0;
        while (this.field2174 < 256) {
            var6++;
            this.field2174 += this.field2179;
        }
        this.field2174 &= 0xFF;
        return var6;
    }
}
