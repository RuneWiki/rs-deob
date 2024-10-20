package deob;

@ObfuscatedName("fc")
public class class163 extends class173 {

    @ObfuscatedName("fc.c")
    public long[] field2164 = new long[10];

    @ObfuscatedName("fc.i")
    public int field2165 = 256;

    @ObfuscatedName("fc.o")
    public int field2163 = 1;

    @ObfuscatedName("fc.j")
    public long field2166 = class197.method26();

    @ObfuscatedName("fc.k")
    public int field2167 = 0;

    @ObfuscatedName("fc.x")
    public int field2168;

    public class163() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2164[var1] = this.field2166;
        }
    }

    @ObfuscatedName("fc.c(I)V")
    public void method2956() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2164[var1] = 0L;
        }
    }

    @ObfuscatedName("fc.i(IIB)I")
    public int method2957(int arg0, int arg1) {
        int var3 = this.field2165;
        int var4 = this.field2163;
        this.field2165 = 300;
        this.field2163 = 1;
        this.field2166 = class197.method26();
        if (this.field2164[this.field2168] == 0L) {
            this.field2165 = var3;
            this.field2163 = var4;
        } else if (this.field2166 > this.field2164[this.field2168]) {
            this.field2165 = (int) ((long) (arg0 * 2560) / (this.field2166 - this.field2164[this.field2168]));
        }
        if (this.field2165 < 25) {
            this.field2165 = 25;
        }
        if (this.field2165 > 256) {
            this.field2165 = 256;
            this.field2163 = (int) ((long) arg0 - (this.field2166 - this.field2164[this.field2168]) / 10L);
        }
        if (this.field2163 > arg0) {
            this.field2163 = arg0;
        }
        this.field2164[this.field2168] = this.field2166;
        this.field2168 = (this.field2168 + 1) % 10;
        if (this.field2163 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2164[var5] != 0L) {
                    this.field2164[var5] += (long) this.field2163;
                }
            }
        }
        if (this.field2163 < arg1) {
            this.field2163 = arg1;
        }
        class204.method2982((long) this.field2163);
        int var6 = 0;
        while (this.field2167 < 256) {
            var6++;
            this.field2167 += this.field2165;
        }
        this.field2167 &= 0xFF;
        return var6;
    }
}
