package deob;

@ObfuscatedName("fg")
public class class174 extends class180 {

    @ObfuscatedName("fg.h")
    public long[] field2031 = new long[10];

    @ObfuscatedName("fg.v")
    public int field2032 = 256;

    @ObfuscatedName("fg.x")
    public int field2033 = 1;

    @ObfuscatedName("fg.w")
    public long field2039 = class308.method4891();

    @ObfuscatedName("fg.t")
    public int field2035 = 0;

    @ObfuscatedName("fg.j")
    public int field2036;

    public class174() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2031[var1] = this.field2039;
        }
    }

    @ObfuscatedName("fg.h(I)V")
    public void method3259() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2031[var1] = 0L;
        }
    }

    @ObfuscatedName("fg.v(III)I")
    public int method3260(int arg0, int arg1) {
        int var3 = this.field2032;
        int var4 = this.field2033;
        this.field2032 = 300;
        this.field2033 = 1;
        this.field2039 = class308.method4891();
        if (this.field2031[this.field2036] == 0L) {
            this.field2032 = var3;
            this.field2033 = var4;
        } else if (this.field2039 > this.field2031[this.field2036]) {
            this.field2032 = (int) ((long) (arg0 * 2560) / (this.field2039 - this.field2031[this.field2036]));
        }
        if (this.field2032 < 25) {
            this.field2032 = 25;
        }
        if (this.field2032 > 256) {
            this.field2032 = 256;
            this.field2033 = (int) ((long) arg0 - (this.field2039 - this.field2031[this.field2036]) / 10L);
        }
        if (this.field2033 > arg0) {
            this.field2033 = arg0;
        }
        this.field2031[this.field2036] = this.field2039;
        this.field2036 = (this.field2036 + 1) % 10;
        if (this.field2033 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2031[var5] != 0L) {
                    this.field2031[var5] += (long) this.field2033;
                }
            }
        }
        if (this.field2033 < arg1) {
            this.field2033 = arg1;
        }
        class309.method3812((long) this.field2033);
        int var6 = 0;
        while (this.field2035 < 256) {
            var6++;
            this.field2035 += this.field2032;
        }
        this.field2035 &= 0xFF;
        return var6;
    }
}
