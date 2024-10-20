package deob;

@ObfuscatedName("el")
public class class133 extends class125 {

    @ObfuscatedName("el.n")
    public long[] field2078 = new long[10];

    @ObfuscatedName("el.g")
    public int field2072 = 256;

    @ObfuscatedName("el.a")
    public int field2074 = 1;

    @ObfuscatedName("el.m")
    public long field2075 = class107.method3364();

    @ObfuscatedName("el.s")
    public int field2076 = 0;

    @ObfuscatedName("el.j")
    public int field2077;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2078[var1] = this.field2075;
        }
    }

    @ObfuscatedName("el.g(I)V")
    public void method2548() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2078[var1] = 0L;
        }
    }

    @ObfuscatedName("el.a(IIB)I")
    public int method2544(int arg0, int arg1) {
        int var3 = this.field2072;
        int var4 = this.field2074;
        this.field2072 = 300;
        this.field2074 = 1;
        this.field2075 = class107.method3364();
        if (this.field2078[this.field2077] == 0L) {
            this.field2072 = var3;
            this.field2074 = var4;
        } else if (this.field2075 > this.field2078[this.field2077]) {
            this.field2072 = (int) ((long) (arg0 * 2560) / (this.field2075 - this.field2078[this.field2077]));
        }
        if (this.field2072 < 25) {
            this.field2072 = 25;
        }
        if (this.field2072 > 256) {
            this.field2072 = 256;
            this.field2074 = (int) ((long) arg0 - (this.field2075 - this.field2078[this.field2077]) / 10L);
        }
        if (this.field2074 > arg0) {
            this.field2074 = arg0;
        }
        this.field2078[this.field2077] = this.field2075;
        this.field2077 = (this.field2077 + 1) % 10;
        if (this.field2074 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2078[var5] != 0L) {
                    this.field2078[var5] += (long) this.field2074;
                }
            }
        }
        if (this.field2074 < arg1) {
            this.field2074 = arg1;
        }
        class119.method2154((long) this.field2074);
        int var6 = 0;
        while (this.field2076 < 256) {
            var6++;
            this.field2076 += this.field2072;
        }
        this.field2076 &= 0xFF;
        return var6;
    }
}
