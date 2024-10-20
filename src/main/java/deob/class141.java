package deob;

@ObfuscatedName("el")
public class class141 extends class133 {

    @ObfuscatedName("el.m")
    public long[] field2139 = new long[10];

    @ObfuscatedName("el.l")
    public int field2134 = 256;

    @ObfuscatedName("el.y")
    public int field2135 = 1;

    @ObfuscatedName("el.u")
    public long field2136 = class115.method2177();

    @ObfuscatedName("el.k")
    public int field2133 = 0;

    @ObfuscatedName("el.j")
    public int field2138;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2139[var1] = this.field2136;
        }
    }

    @ObfuscatedName("el.l(B)V")
    public void method2726() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2139[var1] = 0L;
        }
    }

    @ObfuscatedName("el.y(IIS)I")
    public int method2721(int arg0, int arg1) {
        int var3 = this.field2134;
        int var4 = this.field2135;
        this.field2134 = 300;
        this.field2135 = 1;
        this.field2136 = class115.method2177();
        if (this.field2139[this.field2138] == 0L) {
            this.field2134 = var3;
            this.field2135 = var4;
        } else if (this.field2136 > this.field2139[this.field2138]) {
            this.field2134 = (int) ((long) (arg0 * 2560) / (this.field2136 - this.field2139[this.field2138]));
        }
        if (this.field2134 < 25) {
            this.field2134 = 25;
        }
        if (this.field2134 > 256) {
            this.field2134 = 256;
            this.field2135 = (int) ((long) arg0 - (this.field2136 - this.field2139[this.field2138]) / 10L);
        }
        if (this.field2135 > arg0) {
            this.field2135 = arg0;
        }
        this.field2139[this.field2138] = this.field2136;
        this.field2138 = (this.field2138 + 1) % 10;
        if (this.field2135 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2139[var5] != 0L) {
                    this.field2139[var5] += (long) this.field2135;
                }
            }
        }
        if (this.field2135 < arg1) {
            this.field2135 = arg1;
        }
        class127.method3199((long) this.field2135);
        int var6 = 0;
        while (this.field2133 < 256) {
            var6++;
            this.field2133 += this.field2134;
        }
        this.field2133 &= 0xFF;
        return var6;
    }
}
