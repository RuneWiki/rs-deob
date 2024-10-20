package deob;

@ObfuscatedName("gj")
public class class179 extends class182 {

    @ObfuscatedName("gj.at")
    public long[] field1861 = new long[10];

    @ObfuscatedName("gj.an")
    public int field1862 = 256;

    @ObfuscatedName("gj.av")
    public int field1860 = 1;

    @ObfuscatedName("gj.as")
    public long field1859 = class301.method4630();

    @ObfuscatedName("gj.ax")
    public int field1858 = 0;

    @ObfuscatedName("gj.ap")
    public int field1863;

    public class179() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1861[var1] = this.field1859;
        }
    }

    @ObfuscatedName("gj.at(I)V")
    public void method3100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1861[var1] = 0L;
        }
    }

    @ObfuscatedName("gj.an(IIB)I")
    public int method3101(int arg0, int arg1) {
        int var3 = this.field1862;
        int var4 = this.field1860;
        this.field1862 = 300;
        this.field1860 = 1;
        this.field1859 = class301.method4630();
        if (this.field1861[this.field1863] == 0L) {
            this.field1862 = var3;
            this.field1860 = var4;
        } else if (this.field1859 > this.field1861[this.field1863]) {
            this.field1862 = (int) ((long) (arg0 * 2560) / (this.field1859 - this.field1861[this.field1863]));
        }
        if (this.field1862 < 25) {
            this.field1862 = 25;
        }
        if (this.field1862 > 256) {
            this.field1862 = 256;
            this.field1860 = (int) ((long) arg0 - (this.field1859 - this.field1861[this.field1863]) / 10L);
        }
        if (this.field1860 > arg0) {
            this.field1860 = arg0;
        }
        this.field1861[this.field1863] = this.field1859;
        this.field1863 = (this.field1863 + 1) % 10;
        if (this.field1860 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1861[var5] != 0L) {
                    this.field1861[var5] += (long) this.field1860;
                }
            }
        }
        if (this.field1860 < arg1) {
            this.field1860 = arg1;
        }
        class302.method3997((long) this.field1860);
        int var6 = 0;
        while (this.field1858 < 256) {
            var6++;
            this.field1858 += this.field1862;
        }
        this.field1858 &= 0xFF;
        return var6;
    }
}
