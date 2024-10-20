package deob;

@ObfuscatedName("ei")
public class class133 extends class125 {

    @ObfuscatedName("ei.n")
    public long[] field2052 = new long[10];

    @ObfuscatedName("ei.w")
    public int field2053 = 256;

    @ObfuscatedName("ei.i")
    public int field2060 = 1;

    @ObfuscatedName("ei.e")
    public long field2055 = class107.method2784();

    @ObfuscatedName("ei.h")
    public int field2056 = 0;

    @ObfuscatedName("ei.q")
    public int field2054;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2052[var1] = this.field2055;
        }
    }

    @ObfuscatedName("ei.n(I)V")
    public void method2494() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2052[var1] = 0L;
        }
    }

    @ObfuscatedName("ei.w(III)I")
    public int method2496(int arg0, int arg1) {
        int var3 = this.field2053;
        int var4 = this.field2060;
        this.field2053 = 300;
        this.field2060 = 1;
        this.field2055 = class107.method2784();
        if (this.field2052[this.field2054] == 0L) {
            this.field2053 = var3;
            this.field2060 = var4;
        } else if (this.field2055 > this.field2052[this.field2054]) {
            this.field2053 = (int) ((long) (arg0 * 2560) / (this.field2055 - this.field2052[this.field2054]));
        }
        if (this.field2053 < 25) {
            this.field2053 = 25;
        }
        if (this.field2053 > 256) {
            this.field2053 = 256;
            this.field2060 = (int) ((long) arg0 - (this.field2055 - this.field2052[this.field2054]) / 10L);
        }
        if (this.field2060 > arg0) {
            this.field2060 = arg0;
        }
        this.field2052[this.field2054] = this.field2055;
        this.field2054 = (this.field2054 + 1) % 10;
        if (this.field2060 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2052[var5] != 0L) {
                    this.field2052[var5] += (long) this.field2060;
                }
            }
        }
        if (this.field2060 < arg1) {
            this.field2060 = arg1;
        }
        Statics.method849((long) this.field2060);
        int var6 = 0;
        while (this.field2056 < 256) {
            var6++;
            this.field2056 += this.field2053;
        }
        this.field2056 &= 0xFF;
        return var6;
    }
}
