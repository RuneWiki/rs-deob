package deob;

@ObfuscatedName("ez")
public class class153 extends class163 {

    @ObfuscatedName("ez.n")
    public long[] field2116 = new long[10];

    @ObfuscatedName("ez.v")
    public int field2117 = 256;

    @ObfuscatedName("ez.y")
    public int field2115 = 1;

    @ObfuscatedName("ez.r")
    public long field2122 = class187.method938();

    @ObfuscatedName("ez.h")
    public int field2121 = 0;

    @ObfuscatedName("ez.d")
    public int field2119;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2116[var1] = this.field2122;
        }
    }

    @ObfuscatedName("ez.n(I)V")
    public void method2743() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2116[var1] = 0L;
        }
    }

    @ObfuscatedName("ez.v(III)I")
    public int method2744(int arg0, int arg1) {
        int var3 = this.field2117;
        int var4 = this.field2115;
        this.field2117 = 300;
        this.field2115 = 1;
        this.field2122 = class187.method938();
        if (this.field2116[this.field2119] == 0L) {
            this.field2117 = var3;
            this.field2115 = var4;
        } else if (this.field2122 > this.field2116[this.field2119]) {
            this.field2117 = (int) ((long) (arg0 * 2560) / (this.field2122 - this.field2116[this.field2119]));
        }
        if (this.field2117 < 25) {
            this.field2117 = 25;
        }
        if (this.field2117 > 256) {
            this.field2117 = 256;
            this.field2115 = (int) ((long) arg0 - (this.field2122 - this.field2116[this.field2119]) / 10L);
        }
        if (this.field2115 > arg0) {
            this.field2115 = arg0;
        }
        this.field2116[this.field2119] = this.field2122;
        this.field2119 = (this.field2119 + 1) % 10;
        if (this.field2115 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2116[var5] != 0L) {
                    this.field2116[var5] += (long) this.field2115;
                }
            }
        }
        if (this.field2115 < arg1) {
            this.field2115 = arg1;
        }
        class193.method980((long) this.field2115);
        int var6 = 0;
        while (this.field2121 < 256) {
            var6++;
            this.field2121 += this.field2117;
        }
        this.field2121 &= 0xFF;
        return var6;
    }
}
