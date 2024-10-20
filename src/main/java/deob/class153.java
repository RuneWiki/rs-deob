package deob;

@ObfuscatedName("em")
public class class153 extends class163 {

    @ObfuscatedName("em.c")
    public long[] field1978 = new long[10];

    @ObfuscatedName("em.q")
    public int field1980 = 256;

    @ObfuscatedName("em.m")
    public int field1977 = 1;

    @ObfuscatedName("em.j")
    public long field1979 = class187.method918();

    @ObfuscatedName("em.g")
    public int field1976 = 0;

    @ObfuscatedName("em.i")
    public int field1981;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1978[var1] = this.field1979;
        }
    }

    @ObfuscatedName("em.c(I)V")
    public void method2950() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1978[var1] = 0L;
        }
    }

    @ObfuscatedName("em.q(III)I")
    public int method2955(int arg0, int arg1) {
        int var3 = this.field1980;
        int var4 = this.field1977;
        this.field1980 = 300;
        this.field1977 = 1;
        this.field1979 = class187.method918();
        if (this.field1978[this.field1981] == 0L) {
            this.field1980 = var3;
            this.field1977 = var4;
        } else if (this.field1979 > this.field1978[this.field1981]) {
            this.field1980 = (int) ((long) (arg0 * 2560) / (this.field1979 - this.field1978[this.field1981]));
        }
        if (this.field1980 < 25) {
            this.field1980 = 25;
        }
        if (this.field1980 > 256) {
            this.field1980 = 256;
            this.field1977 = (int) ((long) arg0 - (this.field1979 - this.field1978[this.field1981]) / 10L);
        }
        if (this.field1977 > arg0) {
            this.field1977 = arg0;
        }
        this.field1978[this.field1981] = this.field1979;
        this.field1981 = (this.field1981 + 1) % 10;
        if (this.field1977 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1978[var5] != 0L) {
                    this.field1978[var5] += (long) this.field1977;
                }
            }
        }
        if (this.field1977 < arg1) {
            this.field1977 = arg1;
        }
        class194.method672((long) this.field1977);
        int var6 = 0;
        while (this.field1976 < 256) {
            var6++;
            this.field1976 += this.field1980;
        }
        this.field1976 &= 0xFF;
        return var6;
    }
}
