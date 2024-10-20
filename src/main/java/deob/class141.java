package deob;

@ObfuscatedName("ej")
public class class141 extends class133 {

    @ObfuscatedName("ej.z")
    public long[] field2172 = new long[10];

    @ObfuscatedName("ej.q")
    public int field2169 = 256;

    @ObfuscatedName("ej.k")
    public int field2168 = 1;

    @ObfuscatedName("ej.f")
    public long field2171 = class115.method82();

    @ObfuscatedName("ej.d")
    public int field2173 = 0;

    @ObfuscatedName("ej.l")
    public int field2170;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2172[var1] = this.field2171;
        }
    }

    @ObfuscatedName("ej.q(I)V")
    public void method2647() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2172[var1] = 0L;
        }
    }

    @ObfuscatedName("ej.k(III)I")
    public int method2655(int arg0, int arg1) {
        int var3 = this.field2169;
        int var4 = this.field2168;
        this.field2169 = 300;
        this.field2168 = 1;
        this.field2171 = class115.method82();
        if (this.field2172[this.field2170] == 0L) {
            this.field2169 = var3;
            this.field2168 = var4;
        } else if (this.field2171 > this.field2172[this.field2170]) {
            this.field2169 = (int) ((long) (arg0 * 2560) / (this.field2171 - this.field2172[this.field2170]));
        }
        if (this.field2169 < 25) {
            this.field2169 = 25;
        }
        if (this.field2169 > 256) {
            this.field2169 = 256;
            this.field2168 = (int) ((long) arg0 - (this.field2171 - this.field2172[this.field2170]) / 10L);
        }
        if (this.field2168 > arg0) {
            this.field2168 = arg0;
        }
        this.field2172[this.field2170] = this.field2171;
        this.field2170 = (this.field2170 + 1) % 10;
        if (this.field2168 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2172[var5] != 0L) {
                    this.field2172[var5] += (long) this.field2168;
                }
            }
        }
        if (this.field2168 < arg1) {
            this.field2168 = arg1;
        }
        class127.method712((long) this.field2168);
        int var6 = 0;
        while (this.field2173 < 256) {
            var6++;
            this.field2173 += this.field2169;
        }
        this.field2173 &= 0xFF;
        return var6;
    }
}
