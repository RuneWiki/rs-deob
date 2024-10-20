package deob;

@ObfuscatedName("io")
public class class224 extends class232 {

    @ObfuscatedName("io.ac")
    public long[] field2408 = new long[10];

    @ObfuscatedName("io.ae")
    public int field2402 = 256;

    @ObfuscatedName("io.ag")
    public int field2404 = 1;

    @ObfuscatedName("io.am")
    public long field2403 = class331.method3482();

    @ObfuscatedName("io.ax")
    public int field2405 = 0;

    @ObfuscatedName("io.aq")
    public int field2401;

    public class224() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2408[var1] = this.field2403;
        }
    }

    @ObfuscatedName("io.ac(B)V")
    public void method4018() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2408[var1] = 0L;
        }
    }

    @ObfuscatedName("io.ae(III)I")
    public int method4014(int arg0, int arg1) {
        int var3 = this.field2402;
        int var4 = this.field2404;
        this.field2402 = 300;
        this.field2404 = 1;
        this.field2403 = class331.method3482();
        if (this.field2408[this.field2401] == 0L) {
            this.field2402 = var3;
            this.field2404 = var4;
        } else if (this.field2403 > this.field2408[this.field2401]) {
            this.field2402 = (int) ((long) (arg0 * 2560) / (this.field2403 - this.field2408[this.field2401]));
        }
        if (this.field2402 < 25) {
            this.field2402 = 25;
        }
        if (this.field2402 > 256) {
            this.field2402 = 256;
            this.field2404 = (int) ((long) arg0 - (this.field2403 - this.field2408[this.field2401]) / 10L);
        }
        if (this.field2404 > arg0) {
            this.field2404 = arg0;
        }
        this.field2408[this.field2401] = this.field2403;
        this.field2401 = (this.field2401 + 1) % 10;
        if (this.field2404 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2408[var5] != 0L) {
                    this.field2408[var5] += (long) this.field2404;
                }
            }
        }
        if (this.field2404 < arg1) {
            this.field2404 = arg1;
        }
        class332.method4128((long) this.field2404);
        int var6 = 0;
        while (this.field2405 < 256) {
            var6++;
            this.field2405 += this.field2402;
        }
        this.field2405 &= 0xFF;
        return var6;
    }
}
