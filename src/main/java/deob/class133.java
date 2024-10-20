package deob;

@ObfuscatedName("ej")
public class class133 extends class125 {

    @ObfuscatedName("ej.p")
    public long[] field2064 = new long[10];

    @ObfuscatedName("ej.k")
    public int field2062 = 256;

    @ObfuscatedName("ej.e")
    public int field2063 = 1;

    @ObfuscatedName("ej.f")
    public long field2068 = class107.method579();

    @ObfuscatedName("ej.w")
    public int field2065 = 0;

    @ObfuscatedName("ej.t")
    public int field2066;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2064[var1] = this.field2068;
        }
    }

    @ObfuscatedName("ej.p(I)V")
    public void method2519() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2064[var1] = 0L;
        }
    }

    @ObfuscatedName("ej.k(III)I")
    public int method2518(int arg0, int arg1) {
        int var3 = this.field2062;
        int var4 = this.field2063;
        this.field2062 = 300;
        this.field2063 = 1;
        this.field2068 = class107.method579();
        if (this.field2064[this.field2066] == 0L) {
            this.field2062 = var3;
            this.field2063 = var4;
        } else if (this.field2068 > this.field2064[this.field2066]) {
            this.field2062 = (int) ((long) (arg0 * 2560) / (this.field2068 - this.field2064[this.field2066]));
        }
        if (this.field2062 < 25) {
            this.field2062 = 25;
        }
        if (this.field2062 > 256) {
            this.field2062 = 256;
            this.field2063 = (int) ((long) arg0 - (this.field2068 - this.field2064[this.field2066]) / 10L);
        }
        if (this.field2063 > arg0) {
            this.field2063 = arg0;
        }
        this.field2064[this.field2066] = this.field2068;
        this.field2066 = (this.field2066 + 1) % 10;
        if (this.field2063 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2064[var5] != 0L) {
                    this.field2064[var5] += (long) this.field2063;
                }
            }
        }
        if (this.field2063 < arg1) {
            this.field2063 = arg1;
        }
        class119.method1371((long) this.field2063);
        int var6 = 0;
        while (this.field2065 < 256) {
            var6++;
            this.field2065 += this.field2062;
        }
        this.field2065 &= 0xFF;
        return var6;
    }
}
