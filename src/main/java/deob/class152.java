package deob;

@ObfuscatedName("eo")
public class class152 extends class162 {

    @ObfuscatedName("eo.s")
    public long[] field2215 = new long[10];

    @ObfuscatedName("eo.c")
    public int field2205 = 256;

    @ObfuscatedName("eo.f")
    public int field2212 = 1;

    @ObfuscatedName("eo.m")
    public long field2206 = class179.method3585();

    @ObfuscatedName("eo.h")
    public int field2207 = 0;

    @ObfuscatedName("eo.t")
    public int field2204;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2215[var1] = this.field2206;
        }
    }

    @ObfuscatedName("eo.s(B)V")
    public void method2711() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2215[var1] = 0L;
        }
    }

    @ObfuscatedName("eo.c(III)I")
    public int method2712(int arg0, int arg1) {
        int var3 = this.field2205;
        int var4 = this.field2212;
        this.field2205 = 300;
        this.field2212 = 1;
        this.field2206 = class179.method3585();
        if (this.field2215[this.field2204] == 0L) {
            this.field2205 = var3;
            this.field2212 = var4;
        } else if (this.field2206 > this.field2215[this.field2204]) {
            this.field2205 = (int) ((long) (arg0 * 2560) / (this.field2206 - this.field2215[this.field2204]));
        }
        if (this.field2205 < 25) {
            this.field2205 = 25;
        }
        if (this.field2205 > 256) {
            this.field2205 = 256;
            this.field2212 = (int) ((long) arg0 - (this.field2206 - this.field2215[this.field2204]) / 10L);
        }
        if (this.field2212 > arg0) {
            this.field2212 = arg0;
        }
        this.field2215[this.field2204] = this.field2206;
        this.field2204 = (this.field2204 + 1) % 10;
        if (this.field2212 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2215[var5] != 0L) {
                    this.field2215[var5] += (long) this.field2212;
                }
            }
        }
        if (this.field2212 < arg1) {
            this.field2212 = arg1;
        }
        class185.method631((long) this.field2212);
        int var6 = 0;
        while (this.field2207 < 256) {
            var6++;
            this.field2207 += this.field2205;
        }
        this.field2207 &= 0xFF;
        return var6;
    }
}
