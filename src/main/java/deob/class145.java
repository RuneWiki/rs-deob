package deob;

@ObfuscatedName("eh")
public class class145 extends class137 {

    @ObfuscatedName("eh.a")
    public long[] field2240 = new long[10];

    @ObfuscatedName("eh.d")
    public int field2235 = 256;

    @ObfuscatedName("eh.v")
    public int field2236 = 1;

    @ObfuscatedName("eh.r")
    public long field2237 = class119.method64();

    @ObfuscatedName("eh.z")
    public int field2234 = 0;

    @ObfuscatedName("eh.t")
    public int field2243;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2240[var1] = this.field2237;
        }
    }

    @ObfuscatedName("eh.a(I)V")
    public void method2757() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2240[var1] = 0L;
        }
    }

    @ObfuscatedName("eh.d(III)I")
    public int method2753(int arg0, int arg1) {
        int var3 = this.field2235;
        int var4 = this.field2236;
        this.field2235 = 300;
        this.field2236 = 1;
        this.field2237 = class119.method64();
        if (this.field2240[this.field2243] == 0L) {
            this.field2235 = var3;
            this.field2236 = var4;
        } else if (this.field2237 > this.field2240[this.field2243]) {
            this.field2235 = (int) ((long) (arg0 * 2560) / (this.field2237 - this.field2240[this.field2243]));
        }
        if (this.field2235 < 25) {
            this.field2235 = 25;
        }
        if (this.field2235 > 256) {
            this.field2235 = 256;
            this.field2236 = (int) ((long) arg0 - (this.field2237 - this.field2240[this.field2243]) / 10L);
        }
        if (this.field2236 > arg0) {
            this.field2236 = arg0;
        }
        this.field2240[this.field2243] = this.field2237;
        this.field2243 = (this.field2243 + 1) % 10;
        if (this.field2236 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2240[var5] != 0L) {
                    this.field2240[var5] += (long) this.field2236;
                }
            }
        }
        if (this.field2236 < arg1) {
            this.field2236 = arg1;
        }
        class131.method674((long) this.field2236);
        int var6 = 0;
        while (this.field2234 < 256) {
            var6++;
            this.field2234 += this.field2235;
        }
        this.field2234 &= 0xFF;
        return var6;
    }
}
