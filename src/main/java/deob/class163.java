package deob;

@ObfuscatedName("fz")
public class class163 extends class173 {

    @ObfuscatedName("fz.t")
    public long[] field2139 = new long[10];

    @ObfuscatedName("fz.q")
    public int field2136 = 256;

    @ObfuscatedName("fz.i")
    public int field2137 = 1;

    @ObfuscatedName("fz.a")
    public long field2138 = Statics.method426();

    @ObfuscatedName("fz.l")
    public int field2135 = 0;

    @ObfuscatedName("fz.b")
    public int field2140;

    public class163() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2139[var1] = this.field2138;
        }
    }

    @ObfuscatedName("fz.t(B)V")
    public void method2935() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2139[var1] = 0L;
        }
    }

    @ObfuscatedName("fz.q(III)I")
    public int method2936(int arg0, int arg1) {
        int var3 = this.field2136;
        int var4 = this.field2137;
        this.field2136 = 300;
        this.field2137 = 1;
        this.field2138 = Statics.method426();
        if (this.field2139[this.field2140] == 0L) {
            this.field2136 = var3;
            this.field2137 = var4;
        } else if (this.field2138 > this.field2139[this.field2140]) {
            this.field2136 = (int) ((long) (arg0 * 2560) / (this.field2138 - this.field2139[this.field2140]));
        }
        if (this.field2136 < 25) {
            this.field2136 = 25;
        }
        if (this.field2136 > 256) {
            this.field2136 = 256;
            this.field2137 = (int) ((long) arg0 - (this.field2138 - this.field2139[this.field2140]) / 10L);
        }
        if (this.field2137 > arg0) {
            this.field2137 = arg0;
        }
        this.field2139[this.field2140] = this.field2138;
        this.field2140 = (this.field2140 + 1) % 10;
        if (this.field2137 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2139[var5] != 0L) {
                    this.field2139[var5] += (long) this.field2137;
                }
            }
        }
        if (this.field2137 < arg1) {
            this.field2137 = arg1;
        }
        class204.method1827((long) this.field2137);
        int var6 = 0;
        while (this.field2135 < 256) {
            var6++;
            this.field2135 += this.field2136;
        }
        this.field2135 &= 0xFF;
        return var6;
    }
}
