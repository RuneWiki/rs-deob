package deob;

@ObfuscatedName("ez")
public class class153 extends class163 {

    @ObfuscatedName("ez.f")
    public long[] field1968 = new long[10];

    @ObfuscatedName("ez.h")
    public int field1964 = 256;

    @ObfuscatedName("ez.e")
    public int field1962 = 1;

    @ObfuscatedName("ez.b")
    public long field1963 = class187.method2864();

    @ObfuscatedName("ez.l")
    public int field1966 = 0;

    @ObfuscatedName("ez.w")
    public int field1965;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1968[var1] = this.field1963;
        }
    }

    @ObfuscatedName("ez.f(B)V")
    public void method3019() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1968[var1] = 0L;
        }
    }

    @ObfuscatedName("ez.h(III)I")
    public int method3015(int arg0, int arg1) {
        int var3 = this.field1964;
        int var4 = this.field1962;
        this.field1964 = 300;
        this.field1962 = 1;
        this.field1963 = class187.method2864();
        if (this.field1968[this.field1965] == 0L) {
            this.field1964 = var3;
            this.field1962 = var4;
        } else if (this.field1963 > this.field1968[this.field1965]) {
            this.field1964 = (int) ((long) (arg0 * 2560) / (this.field1963 - this.field1968[this.field1965]));
        }
        if (this.field1964 < 25) {
            this.field1964 = 25;
        }
        if (this.field1964 > 256) {
            this.field1964 = 256;
            this.field1962 = (int) ((long) arg0 - (this.field1963 - this.field1968[this.field1965]) / 10L);
        }
        if (this.field1962 > arg0) {
            this.field1962 = arg0;
        }
        this.field1968[this.field1965] = this.field1963;
        this.field1965 = (this.field1965 + 1) % 10;
        if (this.field1962 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1968[var5] != 0L) {
                    this.field1968[var5] += (long) this.field1962;
                }
            }
        }
        if (this.field1962 < arg1) {
            this.field1962 = arg1;
        }
        class194.method3013((long) this.field1962);
        int var6 = 0;
        while (this.field1966 < 256) {
            var6++;
            this.field1966 += this.field1964;
        }
        this.field1966 &= 0xFF;
        return var6;
    }
}
