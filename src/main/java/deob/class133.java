package deob;

@ObfuscatedName("eq")
public class class133 extends class125 {

    @ObfuscatedName("eq.n")
    public long[] field2072 = new long[10];

    @ObfuscatedName("eq.d")
    public int field2074 = 256;

    @ObfuscatedName("eq.z")
    public int field2073 = 1;

    @ObfuscatedName("eq.y")
    public long field2071 = class107.method1670();

    @ObfuscatedName("eq.e")
    public int field2075 = 0;

    @ObfuscatedName("eq.g")
    public int field2076;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2072[var1] = this.field2071;
        }
    }

    @ObfuscatedName("eq.d(I)V")
    public void method2589() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2072[var1] = 0L;
        }
    }

    @ObfuscatedName("eq.z(IIB)I")
    public int method2590(int arg0, int arg1) {
        int var3 = this.field2074;
        int var4 = this.field2073;
        this.field2074 = 300;
        this.field2073 = 1;
        this.field2071 = class107.method1670();
        if (this.field2072[this.field2076] == 0L) {
            this.field2074 = var3;
            this.field2073 = var4;
        } else if (this.field2071 > this.field2072[this.field2076]) {
            this.field2074 = (int) ((long) (arg0 * 2560) / (this.field2071 - this.field2072[this.field2076]));
        }
        if (this.field2074 < 25) {
            this.field2074 = 25;
        }
        if (this.field2074 > 256) {
            this.field2074 = 256;
            this.field2073 = (int) ((long) arg0 - (this.field2071 - this.field2072[this.field2076]) / 10L);
        }
        if (this.field2073 > arg0) {
            this.field2073 = arg0;
        }
        this.field2072[this.field2076] = this.field2071;
        this.field2076 = (this.field2076 + 1) % 10;
        if (this.field2073 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2072[var5] != 0L) {
                    this.field2072[var5] += (long) this.field2073;
                }
            }
        }
        if (this.field2073 < arg1) {
            this.field2073 = arg1;
        }
        class119.method3147((long) this.field2073);
        int var6 = 0;
        while (this.field2075 < 256) {
            var6++;
            this.field2075 += this.field2074;
        }
        this.field2075 &= 0xFF;
        return var6;
    }
}
