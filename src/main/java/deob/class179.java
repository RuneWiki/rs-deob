package deob;

@ObfuscatedName("go")
public class class179 extends class187 {

    @ObfuscatedName("go.az")
    public long[] field1898 = new long[10];

    @ObfuscatedName("go.ah")
    public int field1893 = 256;

    @ObfuscatedName("go.af")
    public int field1895 = 1;

    @ObfuscatedName("go.at")
    public long field1896 = class318.method3596();

    @ObfuscatedName("go.an")
    public int field1897 = 0;

    @ObfuscatedName("go.ao")
    public int field1894;

    public class179() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1898[var1] = this.field1896;
        }
    }

    @ObfuscatedName("go.az(I)V")
    public void method3134() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1898[var1] = 0L;
        }
    }

    @ObfuscatedName("go.ah(III)I")
    public int method3133(int arg0, int arg1) {
        int var3 = this.field1893;
        int var4 = this.field1895;
        this.field1893 = 300;
        this.field1895 = 1;
        this.field1896 = class318.method3596();
        if (this.field1898[this.field1894] == 0L) {
            this.field1893 = var3;
            this.field1895 = var4;
        } else if (this.field1896 > this.field1898[this.field1894]) {
            this.field1893 = (int) ((long) (arg0 * 2560) / (this.field1896 - this.field1898[this.field1894]));
        }
        if (this.field1893 < 25) {
            this.field1893 = 25;
        }
        if (this.field1893 > 256) {
            this.field1893 = 256;
            this.field1895 = (int) ((long) arg0 - (this.field1896 - this.field1898[this.field1894]) / 10L);
        }
        if (this.field1895 > arg0) {
            this.field1895 = arg0;
        }
        this.field1898[this.field1894] = this.field1896;
        this.field1894 = (this.field1894 + 1) % 10;
        if (this.field1895 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1898[var5] != 0L) {
                    this.field1898[var5] += (long) this.field1895;
                }
            }
        }
        if (this.field1895 < arg1) {
            this.field1895 = arg1;
        }
        class319.method7909((long) this.field1895);
        int var6 = 0;
        while (this.field1897 < 256) {
            var6++;
            this.field1897 += this.field1893;
        }
        this.field1897 &= 0xFF;
        return var6;
    }
}
