package deob;

@ObfuscatedName("ev")
public class class141 extends class133 {

    @ObfuscatedName("ev.l")
    public long[] field2165 = new long[10];

    @ObfuscatedName("ev.e")
    public int field2169 = 256;

    @ObfuscatedName("ev.q")
    public int field2168 = 1;

    @ObfuscatedName("ev.o")
    public long field2167 = class115.method2266();

    @ObfuscatedName("ev.g")
    public int field2164 = 0;

    @ObfuscatedName("ev.m")
    public int field2166;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2165[var1] = this.field2167;
        }
    }

    @ObfuscatedName("ev.e(I)V")
    public void method2700() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2165[var1] = 0L;
        }
    }

    @ObfuscatedName("ev.q(IIB)I")
    public int method2701(int arg0, int arg1) {
        int var3 = this.field2169;
        int var4 = this.field2168;
        this.field2169 = 300;
        this.field2168 = 1;
        this.field2167 = class115.method2266();
        if (this.field2165[this.field2166] == 0L) {
            this.field2169 = var3;
            this.field2168 = var4;
        } else if (this.field2167 > this.field2165[this.field2166]) {
            this.field2169 = (int) ((long) (arg0 * 2560) / (this.field2167 - this.field2165[this.field2166]));
        }
        if (this.field2169 < 25) {
            this.field2169 = 25;
        }
        if (this.field2169 > 256) {
            this.field2169 = 256;
            this.field2168 = (int) ((long) arg0 - (this.field2167 - this.field2165[this.field2166]) / 10L);
        }
        if (this.field2168 > arg0) {
            this.field2168 = arg0;
        }
        this.field2165[this.field2166] = this.field2167;
        this.field2166 = (this.field2166 + 1) % 10;
        if (this.field2168 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2165[var5] != 0L) {
                    this.field2165[var5] += (long) this.field2168;
                }
            }
        }
        if (this.field2168 < arg1) {
            this.field2168 = arg1;
        }
        class127.method2667((long) this.field2168);
        int var6 = 0;
        while (this.field2164 < 256) {
            var6++;
            this.field2164 += this.field2169;
        }
        this.field2164 &= 0xFF;
        return var6;
    }
}
