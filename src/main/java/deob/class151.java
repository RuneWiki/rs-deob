package deob;

@ObfuscatedName("ed")
public class class151 extends class161 {

    @ObfuscatedName("ed.z")
    public long[] field1923 = new long[10];

    @ObfuscatedName("ed.w")
    public int field1921 = 256;

    @ObfuscatedName("ed.s")
    public int field1922 = 1;

    @ObfuscatedName("ed.l")
    public long field1926 = class185.method3250();

    @ObfuscatedName("ed.u")
    public int field1924 = 0;

    @ObfuscatedName("ed.q")
    public int field1925;

    public class151() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1923[var1] = this.field1926;
        }
    }

    @ObfuscatedName("ed.z(I)V")
    public void method2967() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1923[var1] = 0L;
        }
    }

    @ObfuscatedName("ed.w(III)I")
    public int method2970(int arg0, int arg1) {
        int var3 = this.field1921;
        int var4 = this.field1922;
        this.field1921 = 300;
        this.field1922 = 1;
        this.field1926 = class185.method3250();
        if (this.field1923[this.field1925] == 0L) {
            this.field1921 = var3;
            this.field1922 = var4;
        } else if (this.field1926 > this.field1923[this.field1925]) {
            this.field1921 = (int) ((long) (arg0 * 2560) / (this.field1926 - this.field1923[this.field1925]));
        }
        if (this.field1921 < 25) {
            this.field1921 = 25;
        }
        if (this.field1921 > 256) {
            this.field1921 = 256;
            this.field1922 = (int) ((long) arg0 - (this.field1926 - this.field1923[this.field1925]) / 10L);
        }
        if (this.field1922 > arg0) {
            this.field1922 = arg0;
        }
        this.field1923[this.field1925] = this.field1926;
        this.field1925 = (this.field1925 + 1) % 10;
        if (this.field1922 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1923[var5] != 0L) {
                    this.field1923[var5] += (long) this.field1922;
                }
            }
        }
        if (this.field1922 < arg1) {
            this.field1922 = arg1;
        }
        class192.method1435((long) this.field1922);
        int var6 = 0;
        while (this.field1924 < 256) {
            var6++;
            this.field1924 += this.field1921;
        }
        this.field1924 &= 0xFF;
        return var6;
    }
}
