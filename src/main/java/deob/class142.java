package deob;

@ObfuscatedName("er")
public class class142 extends class134 {

    @ObfuscatedName("er.w")
    public long[] field2191 = new long[10];

    @ObfuscatedName("er.x")
    public int field2187 = 256;

    @ObfuscatedName("er.t")
    public int field2186 = 1;

    @ObfuscatedName("er.p")
    public long field2194 = Statics.method162();

    @ObfuscatedName("er.e")
    public int field2190 = 0;

    @ObfuscatedName("er.y")
    public int field2193;

    public class142() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2191[var1] = this.field2194;
        }
    }

    @ObfuscatedName("er.w(B)V")
    public void method2714() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2191[var1] = 0L;
        }
    }

    @ObfuscatedName("er.x(III)I")
    public int method2708(int arg0, int arg1) {
        int var3 = this.field2187;
        int var4 = this.field2186;
        this.field2187 = 300;
        this.field2186 = 1;
        this.field2194 = Statics.method162();
        if (this.field2191[this.field2193] == 0L) {
            this.field2187 = var3;
            this.field2186 = var4;
        } else if (this.field2194 > this.field2191[this.field2193]) {
            this.field2187 = (int) ((long) (arg0 * 2560) / (this.field2194 - this.field2191[this.field2193]));
        }
        if (this.field2187 < 25) {
            this.field2187 = 25;
        }
        if (this.field2187 > 256) {
            this.field2187 = 256;
            this.field2186 = (int) ((long) arg0 - (this.field2194 - this.field2191[this.field2193]) / 10L);
        }
        if (this.field2186 > arg0) {
            this.field2186 = arg0;
        }
        this.field2191[this.field2193] = this.field2194;
        this.field2193 = (this.field2193 + 1) % 10;
        if (this.field2186 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2191[var5] != 0L) {
                    this.field2191[var5] += (long) this.field2186;
                }
            }
        }
        if (this.field2186 < arg1) {
            this.field2186 = arg1;
        }
        class128.method2158((long) this.field2186);
        int var6 = 0;
        while (this.field2190 < 256) {
            var6++;
            this.field2190 += this.field2187;
        }
        this.field2190 &= 0xFF;
        return var6;
    }
}
