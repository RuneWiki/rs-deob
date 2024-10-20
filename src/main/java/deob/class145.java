package deob;

@ObfuscatedName("ef")
public class class145 extends class137 {

    @ObfuscatedName("ef.k")
    public long[] field2216 = new long[10];

    @ObfuscatedName("ef.q")
    public int field2214 = 256;

    @ObfuscatedName("ef.f")
    public int field2213 = 1;

    @ObfuscatedName("ef.c")
    public long field2218 = class119.method3068();

    @ObfuscatedName("ef.v")
    public int field2217 = 0;

    @ObfuscatedName("ef.j")
    public int field2215;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2216[var1] = this.field2218;
        }
    }

    @ObfuscatedName("ef.q(I)V")
    public void method2738() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2216[var1] = 0L;
        }
    }

    @ObfuscatedName("ef.f(III)I")
    public int method2739(int arg0, int arg1) {
        int var3 = this.field2214;
        int var4 = this.field2213;
        this.field2214 = 300;
        this.field2213 = 1;
        this.field2218 = class119.method3068();
        if (this.field2216[this.field2215] == 0L) {
            this.field2214 = var3;
            this.field2213 = var4;
        } else if (this.field2218 > this.field2216[this.field2215]) {
            this.field2214 = (int) ((long) (arg0 * 2560) / (this.field2218 - this.field2216[this.field2215]));
        }
        if (this.field2214 < 25) {
            this.field2214 = 25;
        }
        if (this.field2214 > 256) {
            this.field2214 = 256;
            this.field2213 = (int) ((long) arg0 - (this.field2218 - this.field2216[this.field2215]) / 10L);
        }
        if (this.field2213 > arg0) {
            this.field2213 = arg0;
        }
        this.field2216[this.field2215] = this.field2218;
        this.field2215 = (this.field2215 + 1) % 10;
        if (this.field2213 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2216[var5] != 0L) {
                    this.field2216[var5] += (long) this.field2213;
                }
            }
        }
        if (this.field2213 < arg1) {
            this.field2213 = arg1;
        }
        class131.method2702((long) this.field2213);
        int var6 = 0;
        while (this.field2217 < 256) {
            var6++;
            this.field2217 += this.field2214;
        }
        this.field2217 &= 0xFF;
        return var6;
    }
}
