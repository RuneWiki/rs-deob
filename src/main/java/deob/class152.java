package deob;

@ObfuscatedName("er")
public class class152 extends class159 {

    @ObfuscatedName("er.d")
    public long[] field2219 = new long[10];

    @ObfuscatedName("er.k")
    public int field2222 = 256;

    @ObfuscatedName("er.e")
    public int field2220 = 1;

    @ObfuscatedName("er.p")
    public long field2218 = class176.method2725();

    @ObfuscatedName("er.q")
    public int field2221 = 0;

    @ObfuscatedName("er.s")
    public int field2217;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2219[var1] = this.field2218;
        }
    }

    @ObfuscatedName("er.d(B)V")
    public void method2747() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2219[var1] = 0L;
        }
    }

    @ObfuscatedName("er.k(III)I")
    public int method2741(int arg0, int arg1) {
        int var3 = this.field2222;
        int var4 = this.field2220;
        this.field2222 = 300;
        this.field2220 = 1;
        this.field2218 = class176.method2725();
        if (this.field2219[this.field2217] == 0L) {
            this.field2222 = var3;
            this.field2220 = var4;
        } else if (this.field2218 > this.field2219[this.field2217]) {
            this.field2222 = (int) ((long) (arg0 * 2560) / (this.field2218 - this.field2219[this.field2217]));
        }
        if (this.field2222 < 25) {
            this.field2222 = 25;
        }
        if (this.field2222 > 256) {
            this.field2222 = 256;
            this.field2220 = (int) ((long) arg0 - (this.field2218 - this.field2219[this.field2217]) / 10L);
        }
        if (this.field2220 > arg0) {
            this.field2220 = arg0;
        }
        this.field2219[this.field2217] = this.field2218;
        this.field2217 = (this.field2217 + 1) % 10;
        if (this.field2220 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2219[var5] != 0L) {
                    this.field2219[var5] += (long) this.field2220;
                }
            }
        }
        if (this.field2220 < arg1) {
            this.field2220 = arg1;
        }
        class182.method3711((long) this.field2220);
        int var6 = 0;
        while (this.field2221 < 256) {
            var6++;
            this.field2221 += this.field2222;
        }
        this.field2221 &= 0xFF;
        return var6;
    }
}
