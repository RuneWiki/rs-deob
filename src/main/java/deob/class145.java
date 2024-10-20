package deob;

@ObfuscatedName("ea")
public class class145 extends class137 {

    @ObfuscatedName("ea.f")
    public long[] field2215 = new long[10];

    @ObfuscatedName("ea.e")
    public int field2211 = 256;

    @ObfuscatedName("ea.n")
    public int field2213 = 1;

    @ObfuscatedName("ea.t")
    public long field2214 = class119.method137();

    @ObfuscatedName("ea.v")
    public int field2222 = 0;

    @ObfuscatedName("ea.b")
    public int field2216;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2215[var1] = this.field2214;
        }
    }

    @ObfuscatedName("ea.e(B)V")
    public void method2738() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2215[var1] = 0L;
        }
    }

    @ObfuscatedName("ea.n(III)I")
    public int method2733(int arg0, int arg1) {
        int var3 = this.field2211;
        int var4 = this.field2213;
        this.field2211 = 300;
        this.field2213 = 1;
        this.field2214 = class119.method137();
        if (this.field2215[this.field2216] == 0L) {
            this.field2211 = var3;
            this.field2213 = var4;
        } else if (this.field2214 > this.field2215[this.field2216]) {
            this.field2211 = (int) ((long) (arg0 * 2560) / (this.field2214 - this.field2215[this.field2216]));
        }
        if (this.field2211 < 25) {
            this.field2211 = 25;
        }
        if (this.field2211 > 256) {
            this.field2211 = 256;
            this.field2213 = (int) ((long) arg0 - (this.field2214 - this.field2215[this.field2216]) / 10L);
        }
        if (this.field2213 > arg0) {
            this.field2213 = arg0;
        }
        this.field2215[this.field2216] = this.field2214;
        this.field2216 = (this.field2216 + 1) % 10;
        if (this.field2213 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2215[var5] != 0L) {
                    this.field2215[var5] += (long) this.field2213;
                }
            }
        }
        if (this.field2213 < arg1) {
            this.field2213 = arg1;
        }
        class131.method2276((long) this.field2213);
        int var6 = 0;
        while (this.field2222 < 256) {
            var6++;
            this.field2222 += this.field2211;
        }
        this.field2222 &= 0xFF;
        return var6;
    }
}
