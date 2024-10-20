package deob;

@ObfuscatedName("eo")
public class class141 extends class133 {

    @ObfuscatedName("eo.n")
    public long[] field2151 = new long[10];

    @ObfuscatedName("eo.d")
    public int field2147 = 256;

    @ObfuscatedName("eo.s")
    public int field2153 = 1;

    @ObfuscatedName("eo.q")
    public long field2146 = class115.method1998();

    @ObfuscatedName("eo.j")
    public int field2150 = 0;

    @ObfuscatedName("eo.k")
    public int field2148;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2151[var1] = this.field2146;
        }
    }

    @ObfuscatedName("eo.n(B)V")
    public void method2677() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2151[var1] = 0L;
        }
    }

    @ObfuscatedName("eo.d(III)I")
    public int method2678(int arg0, int arg1) {
        int var3 = this.field2147;
        int var4 = this.field2153;
        this.field2147 = 300;
        this.field2153 = 1;
        this.field2146 = class115.method1998();
        if (this.field2151[this.field2148] == 0L) {
            this.field2147 = var3;
            this.field2153 = var4;
        } else if (this.field2146 > this.field2151[this.field2148]) {
            this.field2147 = (int) ((long) (arg0 * 2560) / (this.field2146 - this.field2151[this.field2148]));
        }
        if (this.field2147 < 25) {
            this.field2147 = 25;
        }
        if (this.field2147 > 256) {
            this.field2147 = 256;
            this.field2153 = (int) ((long) arg0 - (this.field2146 - this.field2151[this.field2148]) / 10L);
        }
        if (this.field2153 > arg0) {
            this.field2153 = arg0;
        }
        this.field2151[this.field2148] = this.field2146;
        this.field2148 = (this.field2148 + 1) % 10;
        if (this.field2153 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2151[var5] != 0L) {
                    this.field2151[var5] += (long) this.field2153;
                }
            }
        }
        if (this.field2153 < arg1) {
            this.field2153 = arg1;
        }
        class127.method1160((long) this.field2153);
        int var6 = 0;
        while (this.field2150 < 256) {
            var6++;
            this.field2150 += this.field2147;
        }
        this.field2150 &= 0xFF;
        return var6;
    }
}
