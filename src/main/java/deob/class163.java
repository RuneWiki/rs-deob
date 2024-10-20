package deob;

@ObfuscatedName("fh")
public class class163 extends class173 {

    @ObfuscatedName("fh.d")
    public long[] field2156 = new long[10];

    @ObfuscatedName("fh.z")
    public int field2153 = 256;

    @ObfuscatedName("fh.n")
    public int field2155 = 1;

    @ObfuscatedName("fh.r")
    public long field2154 = class197.method1501();

    @ObfuscatedName("fh.e")
    public int field2157 = 0;

    @ObfuscatedName("fh.y")
    public int field2158;

    public class163() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2156[var1] = this.field2154;
        }
    }

    @ObfuscatedName("fh.d(I)V")
    public void method2990() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2156[var1] = 0L;
        }
    }

    @ObfuscatedName("fh.z(III)I")
    public int method2991(int arg0, int arg1) {
        int var3 = this.field2153;
        int var4 = this.field2155;
        this.field2153 = 300;
        this.field2155 = 1;
        this.field2154 = class197.method1501();
        if (this.field2156[this.field2158] == 0L) {
            this.field2153 = var3;
            this.field2155 = var4;
        } else if (this.field2154 > this.field2156[this.field2158]) {
            this.field2153 = (int) ((long) (arg0 * 2560) / (this.field2154 - this.field2156[this.field2158]));
        }
        if (this.field2153 < 25) {
            this.field2153 = 25;
        }
        if (this.field2153 > 256) {
            this.field2153 = 256;
            this.field2155 = (int) ((long) arg0 - (this.field2154 - this.field2156[this.field2158]) / 10L);
        }
        if (this.field2155 > arg0) {
            this.field2155 = arg0;
        }
        this.field2156[this.field2158] = this.field2154;
        this.field2158 = (this.field2158 + 1) % 10;
        if (this.field2155 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2156[var5] != 0L) {
                    this.field2156[var5] += (long) this.field2155;
                }
            }
        }
        if (this.field2155 < arg1) {
            this.field2155 = arg1;
        }
        class204.method3573((long) this.field2155);
        int var6 = 0;
        while (this.field2157 < 256) {
            var6++;
            this.field2157 += this.field2153;
        }
        this.field2157 &= 0xFF;
        return var6;
    }
}
