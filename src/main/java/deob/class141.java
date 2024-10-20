package deob;

@ObfuscatedName("eg")
public class class141 extends class133 {

    @ObfuscatedName("eg.h")
    public long[] field2172 = new long[10];

    @ObfuscatedName("eg.m")
    public int field2167 = 256;

    @ObfuscatedName("eg.i")
    public int field2168 = 1;

    @ObfuscatedName("eg.q")
    public long field2169 = class115.method2007();

    @ObfuscatedName("eg.p")
    public int field2170 = 0;

    @ObfuscatedName("eg.c")
    public int field2171;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2172[var1] = this.field2169;
        }
    }

    @ObfuscatedName("eg.h(I)V")
    public void method2663() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2172[var1] = 0L;
        }
    }

    @ObfuscatedName("eg.m(III)I")
    public int method2659(int arg0, int arg1) {
        int var3 = this.field2167;
        int var4 = this.field2168;
        this.field2167 = 300;
        this.field2168 = 1;
        this.field2169 = class115.method2007();
        if (this.field2172[this.field2171] == 0L) {
            this.field2167 = var3;
            this.field2168 = var4;
        } else if (this.field2169 > this.field2172[this.field2171]) {
            this.field2167 = (int) ((long) (arg0 * 2560) / (this.field2169 - this.field2172[this.field2171]));
        }
        if (this.field2167 < 25) {
            this.field2167 = 25;
        }
        if (this.field2167 > 256) {
            this.field2167 = 256;
            this.field2168 = (int) ((long) arg0 - (this.field2169 - this.field2172[this.field2171]) / 10L);
        }
        if (this.field2168 > arg0) {
            this.field2168 = arg0;
        }
        this.field2172[this.field2171] = this.field2169;
        this.field2171 = (this.field2171 + 1) % 10;
        if (this.field2168 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2172[var5] != 0L) {
                    this.field2172[var5] += (long) this.field2168;
                }
            }
        }
        if (this.field2168 < arg1) {
            this.field2168 = arg1;
        }
        class127.method952((long) this.field2168);
        int var6 = 0;
        while (this.field2170 < 256) {
            var6++;
            this.field2170 += this.field2167;
        }
        this.field2170 &= 0xFF;
        return var6;
    }
}
