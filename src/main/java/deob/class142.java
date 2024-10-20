package deob;

@ObfuscatedName("eo")
public class class142 extends class134 {

    @ObfuscatedName("eo.f")
    public long[] field2169 = new long[10];

    @ObfuscatedName("eo.u")
    public int field2165 = 256;

    @ObfuscatedName("eo.x")
    public int field2164 = 1;

    @ObfuscatedName("eo.b")
    public long field2167 = class116.method2672();

    @ObfuscatedName("eo.l")
    public int field2168 = 0;

    @ObfuscatedName("eo.d")
    public int field2166;

    public class142() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2169[var1] = this.field2167;
        }
    }

    @ObfuscatedName("eo.u(I)V")
    public void method2699() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2169[var1] = 0L;
        }
    }

    @ObfuscatedName("eo.x(III)I")
    public int method2700(int arg0, int arg1) {
        int var3 = this.field2165;
        int var4 = this.field2164;
        this.field2165 = 300;
        this.field2164 = 1;
        this.field2167 = class116.method2672();
        if (this.field2169[this.field2166] == 0L) {
            this.field2165 = var3;
            this.field2164 = var4;
        } else if (this.field2167 > this.field2169[this.field2166]) {
            this.field2165 = (int) ((long) (arg0 * 2560) / (this.field2167 - this.field2169[this.field2166]));
        }
        if (this.field2165 < 25) {
            this.field2165 = 25;
        }
        if (this.field2165 > 256) {
            this.field2165 = 256;
            this.field2164 = (int) ((long) arg0 - (this.field2167 - this.field2169[this.field2166]) / 10L);
        }
        if (this.field2164 > arg0) {
            this.field2164 = arg0;
        }
        this.field2169[this.field2166] = this.field2167;
        this.field2166 = (this.field2166 + 1) % 10;
        if (this.field2164 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2169[var5] != 0L) {
                    this.field2169[var5] += (long) this.field2164;
                }
            }
        }
        if (this.field2164 < arg1) {
            this.field2164 = arg1;
        }
        class128.method2102((long) this.field2164);
        int var6 = 0;
        while (this.field2168 < 256) {
            var6++;
            this.field2168 += this.field2165;
        }
        this.field2168 &= 0xFF;
        return var6;
    }
}
