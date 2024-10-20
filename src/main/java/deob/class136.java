package deob;

@ObfuscatedName("ef")
public class class136 extends class128 {

    @ObfuscatedName("ef.j")
    public long[] field2069 = new long[10];

    @ObfuscatedName("ef.y")
    public int field2061 = 256;

    @ObfuscatedName("ef.z")
    public int field2062 = 1;

    @ObfuscatedName("ef.l")
    public long field2063 = Statics.method2875();

    @ObfuscatedName("ef.w")
    public int field2064 = 0;

    @ObfuscatedName("ef.d")
    public int field2067;

    public class136() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2069[var1] = this.field2063;
        }
    }

    @ObfuscatedName("ef.y(I)V")
    public void method2670() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2069[var1] = 0L;
        }
    }

    @ObfuscatedName("ef.z(III)I")
    public int method2660(int arg0, int arg1) {
        int var3 = this.field2061;
        int var4 = this.field2062;
        this.field2061 = 300;
        this.field2062 = 1;
        this.field2063 = Statics.method2875();
        if (this.field2069[this.field2067] == 0L) {
            this.field2061 = var3;
            this.field2062 = var4;
        } else if (this.field2063 > this.field2069[this.field2067]) {
            this.field2061 = (int) ((long) (arg0 * 2560) / (this.field2063 - this.field2069[this.field2067]));
        }
        if (this.field2061 < 25) {
            this.field2061 = 25;
        }
        if (this.field2061 > 256) {
            this.field2061 = 256;
            this.field2062 = (int) ((long) arg0 - (this.field2063 - this.field2069[this.field2067]) / 10L);
        }
        if (this.field2062 > arg0) {
            this.field2062 = arg0;
        }
        this.field2069[this.field2067] = this.field2063;
        this.field2067 = (this.field2067 + 1) % 10;
        if (this.field2062 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2069[var5] != 0L) {
                    this.field2069[var5] += (long) this.field2062;
                }
            }
        }
        if (this.field2062 < arg1) {
            this.field2062 = arg1;
        }
        class122.method558((long) this.field2062);
        int var6 = 0;
        while (this.field2064 < 256) {
            var6++;
            this.field2064 += this.field2061;
        }
        this.field2064 &= 0xFF;
        return var6;
    }
}
