package deob;

@ObfuscatedName("et")
public class class133 extends class125 {

    @ObfuscatedName("et.t")
    public long[] field2048 = new long[10];

    @ObfuscatedName("et.b")
    public int field2040 = 256;

    @ObfuscatedName("et.p")
    public int field2043 = 1;

    @ObfuscatedName("et.e")
    public long field2042 = class107.method591();

    @ObfuscatedName("et.i")
    public int field2044 = 0;

    @ObfuscatedName("et.o")
    public int field2046;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2048[var1] = this.field2042;
        }
    }

    @ObfuscatedName("et.t(I)V")
    public void method2523() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2048[var1] = 0L;
        }
    }

    @ObfuscatedName("et.b(III)I")
    public int method2520(int arg0, int arg1) {
        int var3 = this.field2040;
        int var4 = this.field2043;
        this.field2040 = 300;
        this.field2043 = 1;
        this.field2042 = class107.method591();
        if (this.field2048[this.field2046] == 0L) {
            this.field2040 = var3;
            this.field2043 = var4;
        } else if (this.field2042 > this.field2048[this.field2046]) {
            this.field2040 = (int) ((long) (arg0 * 2560) / (this.field2042 - this.field2048[this.field2046]));
        }
        if (this.field2040 < 25) {
            this.field2040 = 25;
        }
        if (this.field2040 > 256) {
            this.field2040 = 256;
            this.field2043 = (int) ((long) arg0 - (this.field2042 - this.field2048[this.field2046]) / 10L);
        }
        if (this.field2043 > arg0) {
            this.field2043 = arg0;
        }
        this.field2048[this.field2046] = this.field2042;
        this.field2046 = (this.field2046 + 1) % 10;
        if (this.field2043 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2048[var5] != 0L) {
                    this.field2048[var5] += (long) this.field2043;
                }
            }
        }
        if (this.field2043 < arg1) {
            this.field2043 = arg1;
        }
        class119.method172((long) this.field2043);
        int var6 = 0;
        while (this.field2044 < 256) {
            var6++;
            this.field2044 += this.field2040;
        }
        this.field2044 &= 0xFF;
        return var6;
    }
}
