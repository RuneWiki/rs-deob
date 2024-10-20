package deob;

@ObfuscatedName("io")
public class class218 extends class226 {

    @ObfuscatedName("io.ab")
    public long[] field2365 = new long[10];

    @ObfuscatedName("io.ay")
    public int field2366 = 256;

    @ObfuscatedName("io.an")
    public int field2367 = 1;

    @ObfuscatedName("io.au")
    public long field2368 = class329.method5009();

    @ObfuscatedName("io.ax")
    public int field2369 = 0;

    @ObfuscatedName("io.ao")
    public int field2370;

    public class218() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2365[var1] = this.field2368;
        }
    }

    @ObfuscatedName("io.ab(I)V")
    public void method4134() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2365[var1] = 0L;
        }
    }

    @ObfuscatedName("io.ay(III)I")
    public int method4130(int arg0, int arg1) {
        int var3 = this.field2366;
        int var4 = this.field2367;
        this.field2366 = 300;
        this.field2367 = 1;
        this.field2368 = class329.method5009();
        if (this.field2365[this.field2370] == 0L) {
            this.field2366 = var3;
            this.field2367 = var4;
        } else if (this.field2368 > this.field2365[this.field2370]) {
            this.field2366 = (int) ((long) (arg0 * 2560) / (this.field2368 - this.field2365[this.field2370]));
        }
        if (this.field2366 < 25) {
            this.field2366 = 25;
        }
        if (this.field2366 > 256) {
            this.field2366 = 256;
            this.field2367 = (int) ((long) arg0 - (this.field2368 - this.field2365[this.field2370]) / 10L);
        }
        if (this.field2367 > arg0) {
            this.field2367 = arg0;
        }
        this.field2365[this.field2370] = this.field2368;
        this.field2370 = (this.field2370 + 1) % 10;
        if (this.field2367 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2365[var5] != 0L) {
                    this.field2365[var5] += (long) this.field2367;
                }
            }
        }
        if (this.field2367 < arg1) {
            this.field2367 = arg1;
        }
        class330.method3326((long) this.field2367);
        int var6 = 0;
        while (this.field2369 < 256) {
            var6++;
            this.field2369 += this.field2366;
        }
        this.field2369 &= 0xFF;
        return var6;
    }
}
