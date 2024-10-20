package deob;

@ObfuscatedName("fo")
public class class176 extends class179 {

    @ObfuscatedName("fo.f")
    public long[] field1885 = new long[10];

    @ObfuscatedName("fo.w")
    public int field1886 = 256;

    @ObfuscatedName("fo.v")
    public int field1891 = 1;

    @ObfuscatedName("fo.s")
    public long field1888 = class287.method3099();

    @ObfuscatedName("fo.z")
    public int field1889 = 0;

    @ObfuscatedName("fo.j")
    public int field1890;

    public class176() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1885[var1] = this.field1888;
        }
    }

    @ObfuscatedName("fo.f(I)V")
    public void method3151() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1885[var1] = 0L;
        }
    }

    @ObfuscatedName("fo.w(III)I")
    public int method3146(int arg0, int arg1) {
        int var3 = this.field1886;
        int var4 = this.field1891;
        this.field1886 = 300;
        this.field1891 = 1;
        this.field1888 = class287.method3099();
        if (this.field1885[this.field1890] == 0L) {
            this.field1886 = var3;
            this.field1891 = var4;
        } else if (this.field1888 > this.field1885[this.field1890]) {
            this.field1886 = (int) ((long) (arg0 * 2560) / (this.field1888 - this.field1885[this.field1890]));
        }
        if (this.field1886 < 25) {
            this.field1886 = 25;
        }
        if (this.field1886 > 256) {
            this.field1886 = 256;
            this.field1891 = (int) ((long) arg0 - (this.field1888 - this.field1885[this.field1890]) / 10L);
        }
        if (this.field1891 > arg0) {
            this.field1891 = arg0;
        }
        this.field1885[this.field1890] = this.field1888;
        this.field1890 = (this.field1890 + 1) % 10;
        if (this.field1891 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1885[var5] != 0L) {
                    this.field1885[var5] += (long) this.field1891;
                }
            }
        }
        if (this.field1891 < arg1) {
            this.field1891 = arg1;
        }
        class288.method3270((long) this.field1891);
        int var6 = 0;
        while (this.field1889 < 256) {
            var6++;
            this.field1889 += this.field1886;
        }
        this.field1889 &= 0xFF;
        return var6;
    }
}
