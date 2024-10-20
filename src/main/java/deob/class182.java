package deob;

@ObfuscatedName("gp")
public class class182 extends class190 {

    @ObfuscatedName("gp.ak")
    public long[] field1907 = new long[10];

    @ObfuscatedName("gp.al")
    public int field1904 = 256;

    @ObfuscatedName("gp.aj")
    public int field1903 = 1;

    @ObfuscatedName("gp.az")
    public long field1906 = class326.method2895();

    @ObfuscatedName("gp.af")
    public int field1905 = 0;

    @ObfuscatedName("gp.aa")
    public int field1908;

    public class182() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1907[var1] = this.field1906;
        }
    }

    @ObfuscatedName("gp.ak(I)V")
    public void method3220() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1907[var1] = 0L;
        }
    }

    @ObfuscatedName("gp.al(IIB)I")
    public int method3221(int arg0, int arg1) {
        int var3 = this.field1904;
        int var4 = this.field1903;
        this.field1904 = 300;
        this.field1903 = 1;
        this.field1906 = class326.method2895();
        if (this.field1907[this.field1908] == 0L) {
            this.field1904 = var3;
            this.field1903 = var4;
        } else if (this.field1906 > this.field1907[this.field1908]) {
            this.field1904 = (int) ((long) (arg0 * 2560) / (this.field1906 - this.field1907[this.field1908]));
        }
        if (this.field1904 < 25) {
            this.field1904 = 25;
        }
        if (this.field1904 > 256) {
            this.field1904 = 256;
            this.field1903 = (int) ((long) arg0 - (this.field1906 - this.field1907[this.field1908]) / 10L);
        }
        if (this.field1903 > arg0) {
            this.field1903 = arg0;
        }
        this.field1907[this.field1908] = this.field1906;
        this.field1908 = (this.field1908 + 1) % 10;
        if (this.field1903 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1907[var5] != 0L) {
                    this.field1907[var5] += (long) this.field1903;
                }
            }
        }
        if (this.field1903 < arg1) {
            this.field1903 = arg1;
        }
        class327.method8101((long) this.field1903);
        int var6 = 0;
        while (this.field1905 < 256) {
            var6++;
            this.field1905 += this.field1904;
        }
        this.field1905 &= 0xFF;
        return var6;
    }
}
