package deob;

@ObfuscatedName("gb")
public class class176 extends class179 {

    @ObfuscatedName("gb.af")
    public long[] field1880 = new long[10];

    @ObfuscatedName("gb.an")
    public int field1873 = 256;

    @ObfuscatedName("gb.aw")
    public int field1874 = 1;

    @ObfuscatedName("gb.ac")
    public long field1876 = class294.method2504();

    @ObfuscatedName("gb.au")
    public int field1879 = 0;

    @ObfuscatedName("gb.ab")
    public int field1877;

    public class176() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1880[var1] = this.field1876;
        }
    }

    @ObfuscatedName("gb.af(I)V")
    public void method3186() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1880[var1] = 0L;
        }
    }

    @ObfuscatedName("gb.an(III)I")
    public int method3190(int arg0, int arg1) {
        int var3 = this.field1873;
        int var4 = this.field1874;
        this.field1873 = 300;
        this.field1874 = 1;
        this.field1876 = class294.method2504();
        if (this.field1880[this.field1877] == 0L) {
            this.field1873 = var3;
            this.field1874 = var4;
        } else if (this.field1876 > this.field1880[this.field1877]) {
            this.field1873 = (int) ((long) (arg0 * 2560) / (this.field1876 - this.field1880[this.field1877]));
        }
        if (this.field1873 < 25) {
            this.field1873 = 25;
        }
        if (this.field1873 > 256) {
            this.field1873 = 256;
            this.field1874 = (int) ((long) arg0 - (this.field1876 - this.field1880[this.field1877]) / 10L);
        }
        if (this.field1874 > arg0) {
            this.field1874 = arg0;
        }
        this.field1880[this.field1877] = this.field1876;
        this.field1877 = (this.field1877 + 1) % 10;
        if (this.field1874 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1880[var5] != 0L) {
                    this.field1880[var5] += (long) this.field1874;
                }
            }
        }
        if (this.field1874 < arg1) {
            this.field1874 = arg1;
        }
        class295.method5489((long) this.field1874);
        int var6 = 0;
        while (this.field1879 < 256) {
            var6++;
            this.field1879 += this.field1873;
        }
        this.field1879 &= 0xFF;
        return var6;
    }
}
