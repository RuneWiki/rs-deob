package deob;

@ObfuscatedName("fs")
public class class165 extends class171 {

    @ObfuscatedName("fs.c")
    public long[] field1983 = new long[10];

    @ObfuscatedName("fs.x")
    public int field1984 = 256;

    @ObfuscatedName("fs.t")
    public int field1992 = 1;

    @ObfuscatedName("fs.g")
    public long field1986 = Statics.method2303();

    @ObfuscatedName("fs.l")
    public int field1987 = 0;

    @ObfuscatedName("fs.u")
    public int field1988;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1983[var1] = this.field1986;
        }
    }

    @ObfuscatedName("fs.c(I)V")
    public void method3183() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1983[var1] = 0L;
        }
    }

    @ObfuscatedName("fs.x(III)I")
    public int method3185(int arg0, int arg1) {
        int var3 = this.field1984;
        int var4 = this.field1992;
        this.field1984 = 300;
        this.field1992 = 1;
        this.field1986 = Statics.method2303();
        if (this.field1983[this.field1988] == 0L) {
            this.field1984 = var3;
            this.field1992 = var4;
        } else if (this.field1986 > this.field1983[this.field1988]) {
            this.field1984 = (int) ((long) (arg0 * 2560) / (this.field1986 - this.field1983[this.field1988]));
        }
        if (this.field1984 < 25) {
            this.field1984 = 25;
        }
        if (this.field1984 > 256) {
            this.field1984 = 256;
            this.field1992 = (int) ((long) arg0 - (this.field1986 - this.field1983[this.field1988]) / 10L);
        }
        if (this.field1992 > arg0) {
            this.field1992 = arg0;
        }
        this.field1983[this.field1988] = this.field1986;
        this.field1988 = (this.field1988 + 1) % 10;
        if (this.field1992 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1983[var5] != 0L) {
                    this.field1983[var5] += (long) this.field1992;
                }
            }
        }
        if (this.field1992 < arg1) {
            this.field1992 = arg1;
        }
        class298.method4811((long) this.field1992);
        int var6 = 0;
        while (this.field1987 < 256) {
            var6++;
            this.field1987 += this.field1984;
        }
        this.field1987 &= 0xFF;
        return var6;
    }
}
