package deob;

@ObfuscatedName("ex")
public class class145 extends class137 {

    @ObfuscatedName("ex.i")
    public long[] field2223 = new long[10];

    @ObfuscatedName("ex.h")
    public int field2218 = 256;

    @ObfuscatedName("ex.e")
    public int field2219 = 1;

    @ObfuscatedName("ex.g")
    public long field2220 = class119.method719();

    @ObfuscatedName("ex.n")
    public int field2221 = 0;

    @ObfuscatedName("ex.u")
    public int field2222;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2223[var1] = this.field2220;
        }
    }

    @ObfuscatedName("ex.h(B)V")
    public void method2746() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2223[var1] = 0L;
        }
    }

    @ObfuscatedName("ex.e(III)I")
    public int method2738(int arg0, int arg1) {
        int var3 = this.field2218;
        int var4 = this.field2219;
        this.field2218 = 300;
        this.field2219 = 1;
        this.field2220 = class119.method719();
        if (this.field2223[this.field2222] == 0L) {
            this.field2218 = var3;
            this.field2219 = var4;
        } else if (this.field2220 > this.field2223[this.field2222]) {
            this.field2218 = (int) ((long) (arg0 * 2560) / (this.field2220 - this.field2223[this.field2222]));
        }
        if (this.field2218 < 25) {
            this.field2218 = 25;
        }
        if (this.field2218 > 256) {
            this.field2218 = 256;
            this.field2219 = (int) ((long) arg0 - (this.field2220 - this.field2223[this.field2222]) / 10L);
        }
        if (this.field2219 > arg0) {
            this.field2219 = arg0;
        }
        this.field2223[this.field2222] = this.field2220;
        this.field2222 = (this.field2222 + 1) % 10;
        if (this.field2219 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2223[var5] != 0L) {
                    this.field2223[var5] += (long) this.field2219;
                }
            }
        }
        if (this.field2219 < arg1) {
            this.field2219 = arg1;
        }
        class131.method3297((long) this.field2219);
        int var6 = 0;
        while (this.field2221 < 256) {
            var6++;
            this.field2221 += this.field2218;
        }
        this.field2221 &= 0xFF;
        return var6;
    }
}
