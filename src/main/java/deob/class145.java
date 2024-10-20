package deob;

@ObfuscatedName("ej")
public class class145 extends class137 {

    @ObfuscatedName("ej.m")
    public long[] field2229 = new long[10];

    @ObfuscatedName("ej.w")
    public int field2228 = 256;

    @ObfuscatedName("ej.e")
    public int field2233 = 1;

    @ObfuscatedName("ej.o")
    public long field2230 = class119.method3544();

    @ObfuscatedName("ej.g")
    public int field2231 = 0;

    @ObfuscatedName("ej.l")
    public int field2235;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2229[var1] = this.field2230;
        }
    }

    @ObfuscatedName("ej.m(B)V")
    public void method2741() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2229[var1] = 0L;
        }
    }

    @ObfuscatedName("ej.w(III)I")
    public int method2742(int arg0, int arg1) {
        int var3 = this.field2228;
        int var4 = this.field2233;
        this.field2228 = 300;
        this.field2233 = 1;
        this.field2230 = class119.method3544();
        if (this.field2229[this.field2235] == 0L) {
            this.field2228 = var3;
            this.field2233 = var4;
        } else if (this.field2230 > this.field2229[this.field2235]) {
            this.field2228 = (int) ((long) (arg0 * 2560) / (this.field2230 - this.field2229[this.field2235]));
        }
        if (this.field2228 < 25) {
            this.field2228 = 25;
        }
        if (this.field2228 > 256) {
            this.field2228 = 256;
            this.field2233 = (int) ((long) arg0 - (this.field2230 - this.field2229[this.field2235]) / 10L);
        }
        if (this.field2233 > arg0) {
            this.field2233 = arg0;
        }
        this.field2229[this.field2235] = this.field2230;
        this.field2235 = (this.field2235 + 1) % 10;
        if (this.field2233 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2229[var5] != 0L) {
                    this.field2229[var5] += (long) this.field2233;
                }
            }
        }
        if (this.field2233 < arg1) {
            this.field2233 = arg1;
        }
        class131.method2828((long) this.field2233);
        int var6 = 0;
        while (this.field2231 < 256) {
            var6++;
            this.field2231 += this.field2228;
        }
        this.field2231 &= 0xFF;
        return var6;
    }
}
