package deob;

@ObfuscatedName("es")
public class class141 extends class133 {

    @ObfuscatedName("es.d")
    public long[] field2143 = new long[10];

    @ObfuscatedName("es.p")
    public int field2141 = 256;

    @ObfuscatedName("es.v")
    public int field2147 = 1;

    @ObfuscatedName("es.l")
    public long field2142 = class115.method2142();

    @ObfuscatedName("es.y")
    public int field2145 = 0;

    @ObfuscatedName("es.w")
    public int field2146;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2143[var1] = this.field2142;
        }
    }

    @ObfuscatedName("es.p(I)V")
    public void method2713() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2143[var1] = 0L;
        }
    }

    @ObfuscatedName("es.v(IIB)I")
    public int method2715(int arg0, int arg1) {
        int var3 = this.field2141;
        int var4 = this.field2147;
        this.field2141 = 300;
        this.field2147 = 1;
        this.field2142 = class115.method2142();
        if (this.field2143[this.field2146] == 0L) {
            this.field2141 = var3;
            this.field2147 = var4;
        } else if (this.field2142 > this.field2143[this.field2146]) {
            this.field2141 = (int) ((long) (arg0 * 2560) / (this.field2142 - this.field2143[this.field2146]));
        }
        if (this.field2141 < 25) {
            this.field2141 = 25;
        }
        if (this.field2141 > 256) {
            this.field2141 = 256;
            this.field2147 = (int) ((long) arg0 - (this.field2142 - this.field2143[this.field2146]) / 10L);
        }
        if (this.field2147 > arg0) {
            this.field2147 = arg0;
        }
        this.field2143[this.field2146] = this.field2142;
        this.field2146 = (this.field2146 + 1) % 10;
        if (this.field2147 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2143[var5] != 0L) {
                    this.field2143[var5] += (long) this.field2147;
                }
            }
        }
        if (this.field2147 < arg1) {
            this.field2147 = arg1;
        }
        class127.method724((long) this.field2147);
        int var6 = 0;
        while (this.field2145 < 256) {
            var6++;
            this.field2145 += this.field2141;
        }
        this.field2145 &= 0xFF;
        return var6;
    }
}
