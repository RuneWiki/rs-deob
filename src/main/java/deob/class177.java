package deob;

@ObfuscatedName("gq")
public class class177 extends class180 {

    @ObfuscatedName("gq.aj")
    public long[] field1848 = new long[10];

    @ObfuscatedName("gq.al")
    public int field1849 = 256;

    @ObfuscatedName("gq.ac")
    public int field1847 = 1;

    @ObfuscatedName("gq.ab")
    public long field1850 = class290.method4466();

    @ObfuscatedName("gq.an")
    public int field1851 = 0;

    @ObfuscatedName("gq.ao")
    public int field1852;

    public class177() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1848[var1] = this.field1850;
        }
    }

    @ObfuscatedName("gq.aj(I)V")
    public void method3089() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1848[var1] = 0L;
        }
    }

    @ObfuscatedName("gq.al(III)I")
    public int method3095(int arg0, int arg1) {
        int var3 = this.field1849;
        int var4 = this.field1847;
        this.field1849 = 300;
        this.field1847 = 1;
        this.field1850 = class290.method4466();
        if (this.field1848[this.field1852] == 0L) {
            this.field1849 = var3;
            this.field1847 = var4;
        } else if (this.field1850 > this.field1848[this.field1852]) {
            this.field1849 = (int) ((long) (arg0 * 2560) / (this.field1850 - this.field1848[this.field1852]));
        }
        if (this.field1849 < 25) {
            this.field1849 = 25;
        }
        if (this.field1849 > 256) {
            this.field1849 = 256;
            this.field1847 = (int) ((long) arg0 - (this.field1850 - this.field1848[this.field1852]) / 10L);
        }
        if (this.field1847 > arg0) {
            this.field1847 = arg0;
        }
        this.field1848[this.field1852] = this.field1850;
        this.field1852 = (this.field1852 + 1) % 10;
        if (this.field1847 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1848[var5] != 0L) {
                    this.field1848[var5] += (long) this.field1847;
                }
            }
        }
        if (this.field1847 < arg1) {
            this.field1847 = arg1;
        }
        class291.method1994((long) this.field1847);
        int var6 = 0;
        while (this.field1851 < 256) {
            var6++;
            this.field1851 += this.field1849;
        }
        this.field1851 &= 0xFF;
        return var6;
    }
}
