package deob;

@ObfuscatedName("eh")
public class class153 extends class163 {

    @ObfuscatedName("eh.f")
    public long[] field1976 = new long[10];

    @ObfuscatedName("eh.l")
    public int field1977 = 256;

    @ObfuscatedName("eh.w")
    public int field1978 = 1;

    @ObfuscatedName("eh.s")
    public long field1979 = Statics.method1926();

    @ObfuscatedName("eh.e")
    public int field1980 = 0;

    @ObfuscatedName("eh.a")
    public int field1984;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1976[var1] = this.field1979;
        }
    }

    @ObfuscatedName("eh.f(I)V")
    public void method3030() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1976[var1] = 0L;
        }
    }

    @ObfuscatedName("eh.l(III)I")
    public int method3031(int arg0, int arg1) {
        int var3 = this.field1977;
        int var4 = this.field1978;
        this.field1977 = 300;
        this.field1978 = 1;
        this.field1979 = Statics.method1926();
        if (this.field1976[this.field1984] == 0L) {
            this.field1977 = var3;
            this.field1978 = var4;
        } else if (this.field1979 > this.field1976[this.field1984]) {
            this.field1977 = (int) ((long) (arg0 * 2560) / (this.field1979 - this.field1976[this.field1984]));
        }
        if (this.field1977 < 25) {
            this.field1977 = 25;
        }
        if (this.field1977 > 256) {
            this.field1977 = 256;
            this.field1978 = (int) ((long) arg0 - (this.field1979 - this.field1976[this.field1984]) / 10L);
        }
        if (this.field1978 > arg0) {
            this.field1978 = arg0;
        }
        this.field1976[this.field1984] = this.field1979;
        this.field1984 = (this.field1984 + 1) % 10;
        if (this.field1978 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1976[var5] != 0L) {
                    this.field1976[var5] += (long) this.field1978;
                }
            }
        }
        if (this.field1978 < arg1) {
            this.field1978 = arg1;
        }
        class194.method1752((long) this.field1978);
        int var6 = 0;
        while (this.field1980 < 256) {
            var6++;
            this.field1980 += this.field1977;
        }
        this.field1980 &= 0xFF;
        return var6;
    }
}
