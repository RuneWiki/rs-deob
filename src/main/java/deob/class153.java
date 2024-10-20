package deob;

@ObfuscatedName("eo")
public class class153 extends class163 {

    @ObfuscatedName("eo.g")
    public long[] field1977 = new long[10];

    @ObfuscatedName("eo.r")
    public int field1978 = 256;

    @ObfuscatedName("eo.e")
    public int field1985 = 1;

    @ObfuscatedName("eo.q")
    public long field1980 = class187.method2664();

    @ObfuscatedName("eo.c")
    public int field1982 = 0;

    @ObfuscatedName("eo.l")
    public int field1979;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1977[var1] = this.field1980;
        }
    }

    @ObfuscatedName("eo.g(I)V")
    public void method3147() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1977[var1] = 0L;
        }
    }

    @ObfuscatedName("eo.r(III)I")
    public int method3148(int arg0, int arg1) {
        int var3 = this.field1978;
        int var4 = this.field1985;
        this.field1978 = 300;
        this.field1985 = 1;
        this.field1980 = class187.method2664();
        if (this.field1977[this.field1979] == 0L) {
            this.field1978 = var3;
            this.field1985 = var4;
        } else if (this.field1980 > this.field1977[this.field1979]) {
            this.field1978 = (int) ((long) (arg0 * 2560) / (this.field1980 - this.field1977[this.field1979]));
        }
        if (this.field1978 < 25) {
            this.field1978 = 25;
        }
        if (this.field1978 > 256) {
            this.field1978 = 256;
            this.field1985 = (int) ((long) arg0 - (this.field1980 - this.field1977[this.field1979]) / 10L);
        }
        if (this.field1985 > arg0) {
            this.field1985 = arg0;
        }
        this.field1977[this.field1979] = this.field1980;
        this.field1979 = (this.field1979 + 1) % 10;
        if (this.field1985 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1977[var5] != 0L) {
                    this.field1977[var5] += (long) this.field1985;
                }
            }
        }
        if (this.field1985 < arg1) {
            this.field1985 = arg1;
        }
        class194.method4976((long) this.field1985);
        int var6 = 0;
        while (this.field1982 < 256) {
            var6++;
            this.field1982 += this.field1978;
        }
        this.field1982 &= 0xFF;
        return var6;
    }
}
