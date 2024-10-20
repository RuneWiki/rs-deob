package deob;

@ObfuscatedName("ex")
public class class142 extends class134 {

    @ObfuscatedName("ex.a")
    public long[] field2169 = new long[10];

    @ObfuscatedName("ex.w")
    public int field2165 = 256;

    @ObfuscatedName("ex.d")
    public int field2166 = 1;

    @ObfuscatedName("ex.c")
    public long field2167 = class116.method2781();

    @ObfuscatedName("ex.y")
    public int field2164 = 0;

    @ObfuscatedName("ex.k")
    public int field2168;

    public class142() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2169[var1] = this.field2167;
        }
    }

    @ObfuscatedName("ex.a(B)V")
    public void method2803() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2169[var1] = 0L;
        }
    }

    @ObfuscatedName("ex.w(III)I")
    public int method2804(int arg0, int arg1) {
        int var3 = this.field2165;
        int var4 = this.field2166;
        this.field2165 = 300;
        this.field2166 = 1;
        this.field2167 = class116.method2781();
        if (this.field2169[this.field2168] == 0L) {
            this.field2165 = var3;
            this.field2166 = var4;
        } else if (this.field2167 > this.field2169[this.field2168]) {
            this.field2165 = (int) ((long) (arg0 * 2560) / (this.field2167 - this.field2169[this.field2168]));
        }
        if (this.field2165 < 25) {
            this.field2165 = 25;
        }
        if (this.field2165 > 256) {
            this.field2165 = 256;
            this.field2166 = (int) ((long) arg0 - (this.field2167 - this.field2169[this.field2168]) / 10L);
        }
        if (this.field2166 > arg0) {
            this.field2166 = arg0;
        }
        this.field2169[this.field2168] = this.field2167;
        this.field2168 = (this.field2168 + 1) % 10;
        if (this.field2166 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2169[var5] != 0L) {
                    this.field2169[var5] += (long) this.field2166;
                }
            }
        }
        if (this.field2166 < arg1) {
            this.field2166 = arg1;
        }
        class128.method56((long) this.field2166);
        int var6 = 0;
        while (this.field2164 < 256) {
            var6++;
            this.field2164 += this.field2165;
        }
        this.field2164 &= 0xFF;
        return var6;
    }
}
