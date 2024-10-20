package deob;

@ObfuscatedName("ey")
public class class141 extends class133 {

    @ObfuscatedName("ey.g")
    public long[] field2160 = new long[10];

    @ObfuscatedName("ey.b")
    public int field2163 = 256;

    @ObfuscatedName("ey.w")
    public int field2162 = 1;

    @ObfuscatedName("ey.d")
    public long field2166 = class115.method579();

    @ObfuscatedName("ey.z")
    public int field2164 = 0;

    @ObfuscatedName("ey.l")
    public int field2165;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2160[var1] = this.field2166;
        }
    }

    @ObfuscatedName("ey.g(I)V")
    public void method2715() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2160[var1] = 0L;
        }
    }

    @ObfuscatedName("ey.b(III)I")
    public int method2717(int arg0, int arg1) {
        int var3 = this.field2163;
        int var4 = this.field2162;
        this.field2163 = 300;
        this.field2162 = 1;
        this.field2166 = class115.method579();
        if (this.field2160[this.field2165] == 0L) {
            this.field2163 = var3;
            this.field2162 = var4;
        } else if (this.field2166 > this.field2160[this.field2165]) {
            this.field2163 = (int) ((long) (arg0 * 2560) / (this.field2166 - this.field2160[this.field2165]));
        }
        if (this.field2163 < 25) {
            this.field2163 = 25;
        }
        if (this.field2163 > 256) {
            this.field2163 = 256;
            this.field2162 = (int) ((long) arg0 - (this.field2166 - this.field2160[this.field2165]) / 10L);
        }
        if (this.field2162 > arg0) {
            this.field2162 = arg0;
        }
        this.field2160[this.field2165] = this.field2166;
        this.field2165 = (this.field2165 + 1) % 10;
        if (this.field2162 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2160[var5] != 0L) {
                    this.field2160[var5] += (long) this.field2162;
                }
            }
        }
        if (this.field2162 < arg1) {
            this.field2162 = arg1;
        }
        class127.method2632((long) this.field2162);
        int var6 = 0;
        while (this.field2164 < 256) {
            var6++;
            this.field2164 += this.field2163;
        }
        this.field2164 &= 0xFF;
        return var6;
    }
}
