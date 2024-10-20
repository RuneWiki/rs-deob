package deob;

@ObfuscatedName("ed")
public class class141 extends class133 {

    @ObfuscatedName("ed.k")
    public long[] field2139 = new long[10];

    @ObfuscatedName("ed.h")
    public int field2135 = 256;

    @ObfuscatedName("ed.o")
    public int field2141 = 1;

    @ObfuscatedName("ed.z")
    public long field2134 = class115.method124();

    @ObfuscatedName("ed.c")
    public int field2138 = 0;

    @ObfuscatedName("ed.d")
    public int field2136;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2139[var1] = this.field2134;
        }
    }

    @ObfuscatedName("ed.h(B)V")
    public void method2672() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2139[var1] = 0L;
        }
    }

    @ObfuscatedName("ed.o(IIB)I")
    public int method2673(int arg0, int arg1) {
        int var3 = this.field2135;
        int var4 = this.field2141;
        this.field2135 = 300;
        this.field2141 = 1;
        this.field2134 = class115.method124();
        if (this.field2139[this.field2136] == 0L) {
            this.field2135 = var3;
            this.field2141 = var4;
        } else if (this.field2134 > this.field2139[this.field2136]) {
            this.field2135 = (int) ((long) (arg0 * 2560) / (this.field2134 - this.field2139[this.field2136]));
        }
        if (this.field2135 < 25) {
            this.field2135 = 25;
        }
        if (this.field2135 > 256) {
            this.field2135 = 256;
            this.field2141 = (int) ((long) arg0 - (this.field2134 - this.field2139[this.field2136]) / 10L);
        }
        if (this.field2141 > arg0) {
            this.field2141 = arg0;
        }
        this.field2139[this.field2136] = this.field2134;
        this.field2136 = (this.field2136 + 1) % 10;
        if (this.field2141 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2139[var5] != 0L) {
                    this.field2139[var5] += (long) this.field2141;
                }
            }
        }
        if (this.field2141 < arg1) {
            this.field2141 = arg1;
        }
        class127.method890((long) this.field2141);
        int var6 = 0;
        while (this.field2138 < 256) {
            var6++;
            this.field2138 += this.field2135;
        }
        this.field2138 &= 0xFF;
        return var6;
    }
}
