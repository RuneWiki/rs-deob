package deob;

@ObfuscatedName("en")
public class class145 extends class137 {

    @ObfuscatedName("en.s")
    public long[] field2212 = new long[10];

    @ObfuscatedName("en.z")
    public int field2203 = 256;

    @ObfuscatedName("en.t")
    public int field2204 = 1;

    @ObfuscatedName("en.y")
    public long field2210 = class119.method2280();

    @ObfuscatedName("en.p")
    public int field2206 = 0;

    @ObfuscatedName("en.g")
    public int field2205;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2212[var1] = this.field2210;
        }
    }

    @ObfuscatedName("en.z(I)V")
    public void method2732() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2212[var1] = 0L;
        }
    }

    @ObfuscatedName("en.t(III)I")
    public int method2729(int arg0, int arg1) {
        int var3 = this.field2203;
        int var4 = this.field2204;
        this.field2203 = 300;
        this.field2204 = 1;
        this.field2210 = class119.method2280();
        if (this.field2212[this.field2205] == 0L) {
            this.field2203 = var3;
            this.field2204 = var4;
        } else if (this.field2210 > this.field2212[this.field2205]) {
            this.field2203 = (int) ((long) (arg0 * 2560) / (this.field2210 - this.field2212[this.field2205]));
        }
        if (this.field2203 < 25) {
            this.field2203 = 25;
        }
        if (this.field2203 > 256) {
            this.field2203 = 256;
            this.field2204 = (int) ((long) arg0 - (this.field2210 - this.field2212[this.field2205]) / 10L);
        }
        if (this.field2204 > arg0) {
            this.field2204 = arg0;
        }
        this.field2212[this.field2205] = this.field2210;
        this.field2205 = (this.field2205 + 1) % 10;
        if (this.field2204 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2212[var5] != 0L) {
                    this.field2212[var5] += (long) this.field2204;
                }
            }
        }
        if (this.field2204 < arg1) {
            this.field2204 = arg1;
        }
        class131.method182((long) this.field2204);
        int var6 = 0;
        while (this.field2206 < 256) {
            var6++;
            this.field2206 += this.field2203;
        }
        this.field2206 &= 0xFF;
        return var6;
    }
}
