package deob;

@ObfuscatedName("ep")
public class class142 extends class134 {

    @ObfuscatedName("ep.e")
    public long[] field2155 = new long[10];

    @ObfuscatedName("ep.w")
    public int field2154 = 256;

    @ObfuscatedName("ep.f")
    public int field2164 = 1;

    @ObfuscatedName("ep.s")
    public long field2163 = class116.method2794();

    @ObfuscatedName("ep.p")
    public int field2157 = 0;

    @ObfuscatedName("ep.h")
    public int field2158;

    public class142() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2155[var1] = this.field2163;
        }
    }

    @ObfuscatedName("ep.e(S)V")
    public void method2673() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2155[var1] = 0L;
        }
    }

    @ObfuscatedName("ep.w(III)I")
    public int method2674(int arg0, int arg1) {
        int var3 = this.field2154;
        int var4 = this.field2164;
        this.field2154 = 300;
        this.field2164 = 1;
        this.field2163 = class116.method2794();
        if (this.field2155[this.field2158] == 0L) {
            this.field2154 = var3;
            this.field2164 = var4;
        } else if (this.field2163 > this.field2155[this.field2158]) {
            this.field2154 = (int) ((long) (arg0 * 2560) / (this.field2163 - this.field2155[this.field2158]));
        }
        if (this.field2154 < 25) {
            this.field2154 = 25;
        }
        if (this.field2154 > 256) {
            this.field2154 = 256;
            this.field2164 = (int) ((long) arg0 - (this.field2163 - this.field2155[this.field2158]) / 10L);
        }
        if (this.field2164 > arg0) {
            this.field2164 = arg0;
        }
        this.field2155[this.field2158] = this.field2163;
        this.field2158 = (this.field2158 + 1) % 10;
        if (this.field2164 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2155[var5] != 0L) {
                    this.field2155[var5] += (long) this.field2164;
                }
            }
        }
        if (this.field2164 < arg1) {
            this.field2164 = arg1;
        }
        class128.method2645((long) this.field2164);
        int var6 = 0;
        while (this.field2157 < 256) {
            var6++;
            this.field2157 += this.field2154;
        }
        this.field2157 &= 0xFF;
        return var6;
    }
}
