package deob;

@ObfuscatedName("go")
public class class182 extends class185 {

    @ObfuscatedName("go.ac")
    public long[] field1877 = new long[10];

    @ObfuscatedName("go.al")
    public int field1871 = 256;

    @ObfuscatedName("go.ak")
    public int field1872 = 1;

    @ObfuscatedName("go.ax")
    public long field1870 = class316.method6401();

    @ObfuscatedName("go.ao")
    public int field1874 = 0;

    @ObfuscatedName("go.ah")
    public int field1875;

    public class182() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1877[var1] = this.field1870;
        }
    }

    @ObfuscatedName("go.ac(I)V")
    public void method3141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1877[var1] = 0L;
        }
    }

    @ObfuscatedName("go.al(III)I")
    public int method3144(int arg0, int arg1) {
        int var3 = this.field1871;
        int var4 = this.field1872;
        this.field1871 = 300;
        this.field1872 = 1;
        this.field1870 = class316.method6401();
        if (this.field1877[this.field1875] == 0L) {
            this.field1871 = var3;
            this.field1872 = var4;
        } else if (this.field1870 > this.field1877[this.field1875]) {
            this.field1871 = (int) ((long) (arg0 * 2560) / (this.field1870 - this.field1877[this.field1875]));
        }
        if (this.field1871 < 25) {
            this.field1871 = 25;
        }
        if (this.field1871 > 256) {
            this.field1871 = 256;
            this.field1872 = (int) ((long) arg0 - (this.field1870 - this.field1877[this.field1875]) / 10L);
        }
        if (this.field1872 > arg0) {
            this.field1872 = arg0;
        }
        this.field1877[this.field1875] = this.field1870;
        this.field1875 = (this.field1875 + 1) % 10;
        if (this.field1872 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1877[var5] != 0L) {
                    this.field1877[var5] += (long) this.field1872;
                }
            }
        }
        if (this.field1872 < arg1) {
            this.field1872 = arg1;
        }
        class317.method2610((long) this.field1872);
        int var6 = 0;
        while (this.field1874 < 256) {
            var6++;
            this.field1874 += this.field1871;
        }
        this.field1874 &= 0xFF;
        return var6;
    }
}
