package deob;

@ObfuscatedName("eh")
public class class145 extends class137 {

    @ObfuscatedName("eh.x")
    public long[] field2226 = new long[10];

    @ObfuscatedName("eh.r")
    public int field2223 = 256;

    @ObfuscatedName("eh.j")
    public int field2222 = 1;

    @ObfuscatedName("eh.z")
    public long field2225 = class119.method698();

    @ObfuscatedName("eh.i")
    public int field2224 = 0;

    @ObfuscatedName("eh.b")
    public int field2227;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2226[var1] = this.field2225;
        }
    }

    @ObfuscatedName("eh.x(I)V")
    public void method2748() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2226[var1] = 0L;
        }
    }

    @ObfuscatedName("eh.r(IIB)I")
    public int method2749(int arg0, int arg1) {
        int var3 = this.field2223;
        int var4 = this.field2222;
        this.field2223 = 300;
        this.field2222 = 1;
        this.field2225 = class119.method698();
        if (this.field2226[this.field2227] == 0L) {
            this.field2223 = var3;
            this.field2222 = var4;
        } else if (this.field2225 > this.field2226[this.field2227]) {
            this.field2223 = (int) ((long) (arg0 * 2560) / (this.field2225 - this.field2226[this.field2227]));
        }
        if (this.field2223 < 25) {
            this.field2223 = 25;
        }
        if (this.field2223 > 256) {
            this.field2223 = 256;
            this.field2222 = (int) ((long) arg0 - (this.field2225 - this.field2226[this.field2227]) / 10L);
        }
        if (this.field2222 > arg0) {
            this.field2222 = arg0;
        }
        this.field2226[this.field2227] = this.field2225;
        this.field2227 = (this.field2227 + 1) % 10;
        if (this.field2222 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2226[var5] != 0L) {
                    this.field2226[var5] += (long) this.field2222;
                }
            }
        }
        if (this.field2222 < arg1) {
            this.field2222 = arg1;
        }
        class131.method2672((long) this.field2222);
        int var6 = 0;
        while (this.field2224 < 256) {
            var6++;
            this.field2224 += this.field2223;
        }
        this.field2224 &= 0xFF;
        return var6;
    }
}
