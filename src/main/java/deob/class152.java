package deob;

@ObfuscatedName("et")
public class class152 extends class159 {

    @ObfuscatedName("et.n")
    public long[] field2219 = new long[10];

    @ObfuscatedName("et.p")
    public int field2218 = 256;

    @ObfuscatedName("et.i")
    public int field2225 = 1;

    @ObfuscatedName("et.j")
    public long field2226 = class176.method2396();

    @ObfuscatedName("et.f")
    public int field2217 = 0;

    @ObfuscatedName("et.m")
    public int field2222;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2219[var1] = this.field2226;
        }
    }

    @ObfuscatedName("et.n(I)V")
    public void method2698() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2219[var1] = 0L;
        }
    }

    @ObfuscatedName("et.p(III)I")
    public int method2697(int arg0, int arg1) {
        int var3 = this.field2218;
        int var4 = this.field2225;
        this.field2218 = 300;
        this.field2225 = 1;
        this.field2226 = class176.method2396();
        if (this.field2219[this.field2222] == 0L) {
            this.field2218 = var3;
            this.field2225 = var4;
        } else if (this.field2226 > this.field2219[this.field2222]) {
            this.field2218 = (int) ((long) (arg0 * 2560) / (this.field2226 - this.field2219[this.field2222]));
        }
        if (this.field2218 < 25) {
            this.field2218 = 25;
        }
        if (this.field2218 > 256) {
            this.field2218 = 256;
            this.field2225 = (int) ((long) arg0 - (this.field2226 - this.field2219[this.field2222]) / 10L);
        }
        if (this.field2225 > arg0) {
            this.field2225 = arg0;
        }
        this.field2219[this.field2222] = this.field2226;
        this.field2222 = (this.field2222 + 1) % 10;
        if (this.field2225 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2219[var5] != 0L) {
                    this.field2219[var5] += (long) this.field2225;
                }
            }
        }
        if (this.field2225 < arg1) {
            this.field2225 = arg1;
        }
        class182.method1713((long) this.field2225);
        int var6 = 0;
        while (this.field2217 < 256) {
            var6++;
            this.field2217 += this.field2218;
        }
        this.field2217 &= 0xFF;
        return var6;
    }
}
