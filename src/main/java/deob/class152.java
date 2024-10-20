package deob;

@ObfuscatedName("ep")
public class class152 extends class159 {

    @ObfuscatedName("ep.p")
    public long[] field2218 = new long[10];

    @ObfuscatedName("ep.m")
    public int field2215 = 256;

    @ObfuscatedName("ep.e")
    public int field2223 = 1;

    @ObfuscatedName("ep.t")
    public long field2214 = class176.method2747();

    @ObfuscatedName("ep.w")
    public int field2217 = 0;

    @ObfuscatedName("ep.z")
    public int field2219;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2218[var1] = this.field2214;
        }
    }

    @ObfuscatedName("ep.p(I)V")
    public void method2594() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2218[var1] = 0L;
        }
    }

    @ObfuscatedName("ep.m(III)I")
    public int method2596(int arg0, int arg1) {
        int var3 = this.field2215;
        int var4 = this.field2223;
        this.field2215 = 300;
        this.field2223 = 1;
        this.field2214 = class176.method2747();
        if (this.field2218[this.field2219] == 0L) {
            this.field2215 = var3;
            this.field2223 = var4;
        } else if (this.field2214 > this.field2218[this.field2219]) {
            this.field2215 = (int) ((long) (arg0 * 2560) / (this.field2214 - this.field2218[this.field2219]));
        }
        if (this.field2215 < 25) {
            this.field2215 = 25;
        }
        if (this.field2215 > 256) {
            this.field2215 = 256;
            this.field2223 = (int) ((long) arg0 - (this.field2214 - this.field2218[this.field2219]) / 10L);
        }
        if (this.field2223 > arg0) {
            this.field2223 = arg0;
        }
        this.field2218[this.field2219] = this.field2214;
        this.field2219 = (this.field2219 + 1) % 10;
        if (this.field2223 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2218[var5] != 0L) {
                    this.field2218[var5] += (long) this.field2223;
                }
            }
        }
        if (this.field2223 < arg1) {
            this.field2223 = arg1;
        }
        class182.method2791((long) this.field2223);
        int var6 = 0;
        while (this.field2217 < 256) {
            var6++;
            this.field2217 += this.field2215;
        }
        this.field2217 &= 0xFF;
        return var6;
    }
}
