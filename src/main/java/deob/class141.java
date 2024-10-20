package deob;

@ObfuscatedName("en")
public class class141 extends class133 {

    @ObfuscatedName("en.a")
    public long[] field2163 = new long[10];

    @ObfuscatedName("en.r")
    public int field2155 = 256;

    @ObfuscatedName("en.f")
    public int field2156 = 1;

    @ObfuscatedName("en.s")
    public long field2157 = class115.method207();

    @ObfuscatedName("en.y")
    public int field2158 = 0;

    @ObfuscatedName("en.e")
    public int field2159;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2163[var1] = this.field2157;
        }
    }

    @ObfuscatedName("en.r(I)V")
    public void method2682() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2163[var1] = 0L;
        }
    }

    @ObfuscatedName("en.f(III)I")
    public int method2683(int arg0, int arg1) {
        int var3 = this.field2155;
        int var4 = this.field2156;
        this.field2155 = 300;
        this.field2156 = 1;
        this.field2157 = class115.method207();
        if (this.field2163[this.field2159] == 0L) {
            this.field2155 = var3;
            this.field2156 = var4;
        } else if (this.field2157 > this.field2163[this.field2159]) {
            this.field2155 = (int) ((long) (arg0 * 2560) / (this.field2157 - this.field2163[this.field2159]));
        }
        if (this.field2155 < 25) {
            this.field2155 = 25;
        }
        if (this.field2155 > 256) {
            this.field2155 = 256;
            this.field2156 = (int) ((long) arg0 - (this.field2157 - this.field2163[this.field2159]) / 10L);
        }
        if (this.field2156 > arg0) {
            this.field2156 = arg0;
        }
        this.field2163[this.field2159] = this.field2157;
        this.field2159 = (this.field2159 + 1) % 10;
        if (this.field2156 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2163[var5] != 0L) {
                    this.field2163[var5] += (long) this.field2156;
                }
            }
        }
        if (this.field2156 < arg1) {
            this.field2156 = arg1;
        }
        class127.method2148((long) this.field2156);
        int var6 = 0;
        while (this.field2158 < 256) {
            var6++;
            this.field2158 += this.field2155;
        }
        this.field2158 &= 0xFF;
        return var6;
    }
}
